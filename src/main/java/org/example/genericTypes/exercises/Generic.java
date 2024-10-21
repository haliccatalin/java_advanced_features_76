package org.example.genericTypes.exercises;

public class Generic<T> {
    private T item;

    public Generic(T item) {
         this.item = item;
    }

    public T getItem() {
        return item;
    }
}
