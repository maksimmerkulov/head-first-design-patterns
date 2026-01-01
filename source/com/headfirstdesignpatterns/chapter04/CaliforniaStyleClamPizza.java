package com.headfirstdesignpatterns.chapter04;

public class CaliforniaStyleClamPizza extends Pizza {
    public CaliforniaStyleClamPizza() {
        name = "California Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Bruschetta Sauce";

        toppings.add("Goat Cheese");
        toppings.add("Fresh Clams");
    }
}
