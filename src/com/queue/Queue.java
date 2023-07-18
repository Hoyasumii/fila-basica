package com.queue;

import com.queue.interfaces.IQueue;
import com.queue.resources.Iterator;

public class Queue<T> implements IQueue<T> {
    public int count = 0;
    private Item<T> firstItem;
    private Item<T> lastItem;

    public Queue() { }

    public Queue(T firstItem) {
        this.firstItem = this.lastItem = new Item<T>(firstItem);
        this.count++;
    }

    @SafeVarargs
    public Queue(T... items) {
        for (T item : items) {
            enqueue(item);
        }
    }

    @Override
    public boolean contains(T desiredItem) {
        Iterator<T> iterator = new Iterator<T>(this.firstItem);

        while (iterator.next()) {
            if (desiredItem.equals(iterator.currentItem.getItem())) return true;
        }

        return false;
    }

    @Override
    public void enqueue(T item) {

        Item<T> newItem = new Item<T>(item);

        if (this.count == 0) {
            this.firstItem = this.lastItem = newItem;
            this.count++;
            return;
        }

        this.lastItem.setNext(newItem);
        this.lastItem = newItem;
        this.count++;

    }

    @Override
    public T dequeue() {

        Item<T> firstItem = this.firstItem;

        if (this.count == 0) return null;

        if (this.count > 1) {
            this.firstItem = this.firstItem.getNext();
        } else {
            this.firstItem.setNext(null);
            this.firstItem = this.lastItem;
        }

        this.count--;
        return firstItem.getItem();

    }

    @Override
    public T peek() {
        return this.firstItem.getItem();
    }

    public void show() {
        show(this.firstItem);
        System.out.println();
    }

    private void show(Item<T> currentItem) {
        if (currentItem == null) return;
        System.out.print("-> " + currentItem.getItem() + " ");
        if (currentItem.getNext() != null) show(currentItem.getNext());
    }

    public void clear() {
        this.count = 0;
        this.firstItem = this.lastItem = null;
    }

    public Item<T> getFirstItem() {
        return this.firstItem;
    }

    public Item<T> getLastItem() {
        return this.lastItem;
    }

}
