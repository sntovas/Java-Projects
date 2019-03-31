/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class Invoice {

    public static void main(String[] args) {
        Items it = new Items("Apples", 500, 200, 50, "Home", "Elsewhere");  //Testing valid parameters
        printInvoice(it.getItem(), it.getQuantities(), it.getTotalCost(), it.getPaymentsReceived(), it.getAmountsDue(), it.getShippingAddress(), it.getBillingAddress());
        
        System.out.println();
        
        Items invalid = new Items("Apples", -1, -1, -1, "Home", "Elsewhere");   //Testing negative parameters. Defaults to 0
        printInvoice(invalid.getItem(), invalid.getQuantities(), invalid.getTotalCost(), invalid.getPaymentsReceived(), invalid.getAmountsDue(), invalid.getShippingAddress(), invalid.getBillingAddress());
        
        System.out.println();
        
        Scanner in = new Scanner(System.in);    //Testing user input parameters
        System.out.println("Please give item ordered: ");
        String a = in.nextLine();
        System.out.println("Please give quantities ordered: ");
        int b = in.nextInt();
        System.out.println("Please give total order cost: ");
        int c = in.nextInt();
        System.out.println("Please give payments received: ");
        int d = in.nextInt();
        System.out.println("Please give shipping address: ");
        String e = in.nextLine();
        System.out.println("Please give billing address: ");
        String f = in.nextLine();
        Items user = new Items(a, b, c, d, e, f);
        printInvoice(user.getItem(), user.getQuantities(), user.getTotalCost(), user.getPaymentsReceived(), user.getAmountsDue(), user.getShippingAddress(), user.getBillingAddress());
    }
    
    
    public static void printInvoice(String item, int quant, int total, int amrec, int amdue, String ship, String bill){
        System.out.println("Item ordered: " + item);
        System.out.println("Quantities ordered: " + quant);
        System.out.println("Total cost: " + total);
        System.out.println("Payment received: " + amrec);
        System.out.println("Amounts due: " + amdue);
        System.out.println("Shipping address: " + ship);
        System.out.println("Billing address: " + bill);
    }
}
