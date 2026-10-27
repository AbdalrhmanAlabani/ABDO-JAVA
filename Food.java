
package com.mycompany.mavenproject1;
   public class Food {
    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

   class Burger extends Food {
    public Burger(String name, double price) {
        super(name, price);
    }
}

  class Pizza extends Food {
    public Pizza(String name, double price) {
        super(name, price);
    }
}
  