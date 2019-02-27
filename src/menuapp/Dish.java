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
public class Dish {
    protected String picPath;
    protected String desc;
    protected double price;
    
    public Dish(String picPath, String desc, double price) {
        this.picPath = picPath;
        this.desc = desc;
        this.price = price;
    }
}
