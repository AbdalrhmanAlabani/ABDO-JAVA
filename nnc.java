
package com.mycompany.mavenproject1;
   class DeliveryBox<T> {
    private T item; 

    public void putItem(T item) {
        this.item = item;
        System.out.println("تم وضع الطلب في صندوق التوصيل بنجاح");
    }

    public T getItem() {
        return item;
    }
}

   class RestaurantBox<T extends Food> extends DeliveryBox<T> {
    public void displayOrderInfo() {
        T food = getItem();
        if (food != null) {
            System.out.println("الطلب يحتوي على: " + food.getName() + " | السعر: " + food.getPrice() + " دينار");
        } else {
            System.out.println("صندوق التوصيل فارغ!");
        }
    }
}