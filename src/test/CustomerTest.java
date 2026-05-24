import domain.Customer;
public class CustomerTest {
    public static void main(String[] args){
        Customer c = new Customer();
        System.out.println("Properties of cutsomer: ");
        c.displayCustomerInfo();

        System.out.println("\nChanging properties of cutsomer: done");
        c.setID(12);
        c.setStatus(false);
        c.setTotal(2400.45);

        System.out.println("\nChanged properties of customer: ");
        c.displayCustomerInfo();
    }
}
