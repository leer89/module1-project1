/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer6;

import java.math.BigDecimal;

/**
 * Product Class.
 * 
 * Instance Variables
 * - upc : String
 * - shortDetails : String
 * - longDetails : String
 * - price : BigDecimal
 * - stock : integer
 * 
 * Methods.
 * - getUPC() : String
 * - setUPC(String)
 * - getShortDetails() : String
 * - setShortDetails(String) 
 * - getLongDetails() : String
 * - setLongDetails(String)
 * - getPrice() : BigDecimal
 * - setPrice(BigDecimal)
 * - getStock() : Integer
 * - setStock(Integer)
 * 
 * @author RandyLee
 */
public class Product {
    String upc;
    String shortDetails;
    String longDetails;
    BigDecimal price;
    int stock;

    public String getUpc() {
        return this.upc;
    }
    
    public void setUPC(String upc) {
        this.upc = upc;
    }
    
    public String getShortDetails() {
        return this.shortDetails;
    }
    
    public void setShortDetails (String shortDetails) {
        this.shortDetails = shortDetails;
    }
    
    public String getLongDetails() {
        return this.longDetails;
    }
    
    public void setLongDetails(String longDetails) {
        this.longDetails = longDetails;
    }
}
