/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author halab
 */
public class Item {
    


    //0.5 for first three data fields
    public String name;
    private String [] reviews = new String[0];
    private double priceWithoutTax;
    //0.5 for salesTax
    private static double salesTax = 0.16;
    
    //add object constructor
    public Item(Item item){
        name= item.name;
        setPriceWithoutTax(item.getPriceWithoutTax());
    }
    //0.5 point
    public Item(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter item name: ");
        name = input.nextLine();
        System.out.println("Enter price without tax: ");
        priceWithoutTax = input.nextDouble();
        while(priceWithoutTax <=0){
            System.out.println("Please enter a positive nonzero value for price: ");
            priceWithoutTax = input.nextDouble();
        }
    }
    //0.5 point
    public Item(String name, double priceWithoutTax){
        this.name = name;
        this.priceWithoutTax = priceWithoutTax;
    }
    //0.5 point
    public String [] getReviews(){
        //use of methods from the library to copy the array is allowed
        String [] copy = new String[reviews.length];
        for(int i=0; i<reviews.length;i++)
            copy[i] = reviews[i];
        return copy;
    }
    //0.5 point
    public void addReview(){
        Scanner input = new Scanner(System.in);
        String [] newArray =new String[reviews.length+1];
        for(int i=0; i<reviews.length; i++)
            newArray[i] = reviews[i];
        System.out.println("Enter you review for "+name);
        newArray[newArray.length-1] = input.nextLine();
        reviews = newArray;
    }
    //0.5 point
    public double getPriceWithoutTax() {
        return priceWithoutTax;
    }
    //0.5 point
    public void setPriceWithoutTax(double priceWithoutTax) {
        if(priceWithoutTax>0)
            this.priceWithoutTax = priceWithoutTax;
    }
    //0.5 point
    public static double getSalesTax() {
        return salesTax;
    }
    //0.5 point
    public static void setSalesTax(double salesTax) {
        if(salesTax>=0 && salesTax<=1)
            Item.salesTax = salesTax;
    }
    //0.5 point
    public double getPriceWithTax(){
        return priceWithoutTax + (priceWithoutTax * salesTax);
    }
    //0.5 point
    public void printReviews (){ 
        for(int i=0; i<reviews.length; i++)
            System.out.println(reviews[i]);
        System.out.println();
    }
    //1 point
    public void searchReviews(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your search keyword: ");
        String key = input.next();
        for(int i=0; i<reviews.length; i++)
            if(reviews[i].contains(key))
                System.out.println(reviews[i]);
    }


}
