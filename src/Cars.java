public class Cars {

    private String carId ;



    private String brand;
    private String model;
    private double basePricePerDay ;
    private boolean isAvailable;

    public Cars(String carId, String brand, String model , double basePricePerDay, boolean isAvailable){
        this.carId=carId;
        this.brand=brand;
        this.model=model;
        this.basePricePerDay=basePricePerDay;
        this.isAvailable=isAvailable;



    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBasePricePerDay(int rentalDays) {
        return basePricePerDay*rentalDays;
    }

    public void setBasePricePerDay(double basePricePerDay) {
        this.basePricePerDay = basePricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void rent(){
        isAvailable=false;
    }
    public void returnCar (){
        isAvailable=true;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }






}
