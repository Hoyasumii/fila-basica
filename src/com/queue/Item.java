package com.queue;

public class Item<T> {
    protected T item;
    protected Item<T> next = null;

    public Item(T item) {
        this.item = item;   
    }

    public T getItem() {
        return this.item;
    }

    public Item<T> getNext() {
        return this.next;
    }

    public void setNext(Item<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(this.item);
    }

    @Override
    public boolean equals(Object obj) throws ClassCastException {

        T item;

        try {
            item = (T) obj;
        } catch (ClassCastException e) {
            return false;
        }

        return this.item == item;
    }

}
