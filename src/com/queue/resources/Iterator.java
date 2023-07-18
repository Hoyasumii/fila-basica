package com.queue.resources;

import com.queue.Item;

public class Iterator<T> {
    public Item<T> currentItem;

    public Iterator(Item<T> currentItem) {
        this.currentItem = currentItem;
    }

    public boolean next() {
        if (this.currentItem.getNext() != null) {
            this.currentItem = this.currentItem.getNext();
            return true;
        }
        return false;
    }
}
