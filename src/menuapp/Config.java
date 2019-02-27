/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuapp;

/**
 *
 * @author csc190
 */
public class Config {
    public Dish[] createDishes() {
        return new Dish[] {
            new Dish("pasta.jpg", "Delicious pasta dish", 15.00),
            new Dish("pizza.jpg", "Oven-baked pizza", 20.00),
            new Dish("chicken.jpg", "Savory rotisserie chicken", 17.50),
        };
    }
}
