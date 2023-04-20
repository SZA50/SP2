package Car;

public class  ElectricCar extends ACar {
    private int batteryCapacity;

    private int maxRange;

    public ElectricCar ( String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange){
        super (registrationNumber,make,model,numberOfDoors );
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;

    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public int getMaxRange (){
        return maxRange;
    }

    public double getWhPrKm (){
        double result = batteryCapacity / maxRange;
        return result;


    }

    public int getRegistrationFee (){
        double kmL= (getWhPrKm()/91.25 )/ 100;
        int price = 0;
        if (kmL > 20 && kmL < 50) {
            price = 330;
        } else if (kmL > 15 && kmL < 20) {
            price = 1050;
        } else if (kmL > 10 && kmL < 15) {
            price = 2340;
        } else if (kmL > 5 && kmL < 10) {
            price = 5500;
        } else if (kmL > 5) {
            price =10470;
        }

        return price;

    }
    @Override
    public String toString (){
        return this.getMake() + this.getModel();
    }

}
