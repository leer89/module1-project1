package leer6;

import java.util.Scanner;

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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Module 1 Project");
        System.out.println("1 - View Product Data.");
        
        String choice = sc.next();
        
        
    }

}
