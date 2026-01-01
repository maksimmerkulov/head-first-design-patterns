package com.headfirstdesignpatterns.chapter04;

public class CaliforniaStyleVeggiePizza extends Pizza {
    public CaliforniaStyleVeggiePizza() {
        name = "California Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Bruschetta Sauce";

        toppings.add("Goat Cheese");
        toppings.add("Red Pepper");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }
}
