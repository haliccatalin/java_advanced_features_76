package org.example.genericTypes;

// Pahar de vin
// Pahar de sampanie
// Pahar de capuccino
// Pahar de apa

public class BoxLimited<T extends Pahar> {
    private T item;

    public BoxLimited(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public int getVolume() {
        return this.item.getVolume();
    }
}
