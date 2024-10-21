package org.example.genericTypes;

public class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    // NU POATE FACE REFERIRE O ANUMITA METODA
//    public int getVolume() {
//        return this.item.getVolume();
//    }

    @Override
    public String toString() {
        return "Box: " + this.item.getClass();
    }
}
