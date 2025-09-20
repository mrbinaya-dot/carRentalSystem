import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {

    private List<Cars> car1;
    private List<Customer> customer1;
    private List<Rental> rental;


    public CarRentalSystem(){
        car1=new ArrayList<>();
        customer1=new ArrayList<>();
        rental=new ArrayList<>();

    }
    public void addCar(Cars car){
        car1.add(car);
    }
    public void addCustomer(Customer customer){
        customer1.add(customer);
    }

    public void carRent(Cars car,Customer customer,int days){

        if (car.isAvailable()){
            car.rent();
            car1.add(new Rental(Cars car,Customer customer,int days));
        } else  {

            System.out.println("No Car available for rent");
            
        }

        public void carReturn(Cars car){
            for (Rental rental)
        }


    }






}
