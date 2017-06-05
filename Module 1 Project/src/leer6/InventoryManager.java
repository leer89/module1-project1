/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer6;

import java.util.List;

/**
 * Inventory Manager.
 *
 * "getProductList" 
 * Use the CollectionStorageFileUtility's "load" method to load
 * the Product class collection Add the collection to a new ArrayList object
 * Return the new ArrayList
 *
 * "getProduct" 
 * Call "getProductList" to get the list of Products Find a product
 * with the matching UPC Return the matching product, or null if no such product
 * exists
 *
 * "addProduct" 
 * Call "getProductList" to get the list of Products Check to see
 * if a product with the same UPC already exists If a product with the same UPC
 * already exists then print an error message and return Otherwise, add the new
 * product to the list Use the CollectionStorageFileUtility's "save" method to
 * save the updated list.
 *
 * "updateProduct" 
 * Call "getProductList" to get the list of Products Check to
 * see if a product with the same UPC exists If a product with the same UPC does
 * not exist then print an error message and return Otherwise, for each non-null
 * field in the parameter product other than the UPC, update that field for the
 * product in the list Use the CollectionStorageFileUtility's "save" method to
 * save the updated list.
 *
 * "removeProduct" 
 * Call "getProductList" to get the list of Products
 * Check to see if a product with the same UPC exists If a product with the same
 * UPC does not exist then print an error message and return Otherwise, remove
 * that matching product from the list Use the CollectionStorageFileUtility's
 * "save" method to save the updated list.
 *
 * @author RandyLee
 */
public class InventoryManager {
    
    public String getProduct(String upc) {
        // call getProductList to get list of products
        // find product with matching upc
        // return matching product or return null
        return null;
    }

    public void getProductList(List<Product> p) {
        // use collection storage file utiliti's load method to load product class collection
    }
    
    public void addProduct(Product p){
        // call getProductList
        // check to see if product with upc already exists
        // error message if product already exists
        
        // otherwise add product to list
        
        // use collection storage file utility's save method to save the updated list
    }
    
    public void updateProduct(Product p) {
        // call getProductList
        // check to see if a product with same upc exists
        // print error if upc already exists
        // for each updated field update that field for the product in the list
        // use collection storage file utility's save method to save the updated list
    }
    
    public void removeProduct() {
        // call getProductList to get list of products
        // check to see if product with same upc exists
        // if product with sampe upc does not exist print error
        
    }
}
