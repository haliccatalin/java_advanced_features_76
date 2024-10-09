package org.example.encapsulation.exercises.ex3;

public class Product {
    private String productName;
    private String productCode;
    double price;

    public Product(String productName, String productCode, double price) {
        setProductName(productName);
        setProductCode(productCode);
        setPrice(price);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName != null && !productName.isEmpty()) {
            this.productName = productName;
        } else {
            this.productName = "A random generic Product";
        }

    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        if (productCode != null && !productCode.isEmpty()) {
            this.productCode = productCode;
        } else {
            this.productCode = "A random generic Product Code";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = Math.abs(price);
    }

    public void discount(int discountPercentage) {
        if (discountPercentage > 0 && discountPercentage < 100) {
            this.price -= (this.price * discountPercentage / 100);
        } else {
            System.out.println("unable to apply the mentioned discount");
        }

    }
}
