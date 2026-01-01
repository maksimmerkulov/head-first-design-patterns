package com.headfirstdesignpatterns.chapter04;

public class CaliforniaStylePepperoniPizza extends Pizza {
    public CaliforniaStylePepperoniPizza() {
        name = "California Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Bruschetta Sauce";

        toppings.add("Goat Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
