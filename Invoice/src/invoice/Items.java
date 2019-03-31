/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

/**
 *
 * @author chris
 */
public class Items {
    private String item;
    private int quantities;
    private int totalcost;
    private int paymentsreceived;
    private String shippingaddress;
    private String billingaddress;
    public Items(String item, int quantities, int totalcost, int paymentsreceived, String shippingaddress, String billingaddress){
        setItem(item);
        setQuantities(quantities);
        setTotalCost(totalcost);
        setPaymentsReceived(paymentsreceived);
        setShippingAddress(shippingaddress);
        setBillingAddress(billingaddress);
    }
    
    public void setItem(String item){
        this.item = item;
    }
    
    public void setQuantities(int quantities){
        if(quantities >= 0){
            this.quantities = quantities;
        }
        else {
            System.out.println("Can't have negative quantities.");
        }
    }
    
    public void setTotalCost(int totalcost){
        if(totalcost >= 0){
            this.totalcost = totalcost;
        }
        else {
            System.out.println("Can't have negative total cost.");
        }
    }
    
    public void setPaymentsReceived(int paymentsreceived){
        if(paymentsreceived >= 0){
            this.paymentsreceived = paymentsreceived;
        }
        else {
            System.out.println("Can't have negative payments received.");
        }
    }
    
    public void setShippingAddress(String shippingaddress){
        this.shippingaddress = shippingaddress;
    }
    
    public void setBillingAddress(String billingaddress){
        this.billingaddress = billingaddress;
    }
    
    
    public String getItem(){
        return item;
    }
    
    public int getQuantities(){
        return quantities;
    }
    
    public int getTotalCost(){
        return totalcost;
    }
    
    public int getPaymentsReceived(){
        return paymentsreceived;
    }
    
    public int getAmountsDue(){
        if(getTotalCost() - getPaymentsReceived() >= 0){
            return getTotalCost() - getPaymentsReceived();
        }
        return 0;
    }
    
    public String getShippingAddress(){
        return shippingaddress;
    }
    
    public String getBillingAddress(){
        return billingaddress;
    }
}
