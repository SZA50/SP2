package Car;

public class GasolinCar extends AFuelCar {

    public GasolinCar (String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super (registrationNumber,make,model,numberOfDoors,kmPrLitre);

    }

    public String getFuelType(){
        return "Gasolin";

    }
    private int getRegistrationFee() {
        int price = 0;
        if (kmPrLitre() > 20 && kmPrLitre() < 50) {
            price = 330;
        } else if (kmPrLitre() > 15 && kmPrLitre() < 20) {
            price = 1050;
        } else if (kmPrLitre() > 10 && kmPrLitre() < 15) {
            price = 2340;
        } else if (kmPrLitre() > 5 && kmPrLitre() < 10) {
            price = 5500;
        } else if (kmPrLitre() > 5) {
            price =10470;
        }

        return price;


    }

    @Override
    public String toString (){
        return this.getMake() + this.getModel();
    }




}
