package domain;
public class Customer {
    private int ID;
    private boolean isNew;
    private double total;

    public Customer(){
        ID = 1;
        isNew = true;
        total = 1000.0;
    }
    public void displayCustomerInfo(){
        System.out.println("Custumer ID: "+ ID);
        System.out.println("Custumer is New: "+ isNew);
        System.out.println("Total purchases are: "+ total);
    }
    public void setID(int newID){
        if(newID<0) {return;}
        ID = newID;
    }
    public void setStatus(boolean newisNew){
        isNew = newisNew;
    }
    public void setTotal(double newtotal){
        if(newtotal<=0) {return;}
        total = newtotal;
    }
}
