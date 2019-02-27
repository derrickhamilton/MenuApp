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
public class NavController {
    protected Dish[] arrDishes;
    protected int currentIDX;
    protected API api;
    
    public NavController(Config cfg, API api) {
        arrDishes = cfg.createDishes();
        currentIDX = 0;
        this.api = api;
    }
    
    public void moveNext() {
        if (currentIDX < arrDishes.length-1) this.currentIDX++;
        displayDish();
    }
    
    public void movePrev() {
        if (currentIDX > 0) this.currentIDX--;
        displayDish();
    }
    
    public void displayDish() {
        Dish d = arrDishes[currentIDX];
        api.displayDesc(d.desc);
        api.displayPic(d.picPath);
        api.displayPrice(d.price);
    }
}
