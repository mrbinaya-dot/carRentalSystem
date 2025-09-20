public class Customer {
    private String customerName;
    private String customerId;



    public Customer(String customerId, String customerName){
        this.customerId=customerId;
        this.customerName=customerName;

    }


    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }
}
