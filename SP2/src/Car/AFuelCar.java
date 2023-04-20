package Car;


public abstract class AFuelCar extends ACar {

    private int kmPrlitre =0;

    public AFuelCar (String registrationNumber, String make, String model, int numberOfDoors, int kmPrlitre) {
        super (registrationNumber,make,model,numberOfDoors);
        this.kmPrlitre = kmPrlitre;

    }

    public String getFuelType (){
        return "Gasoline";
        //return "Diesel";
    }


    public int kmPrLitre(){
        return kmPrlitre;

    }

    @Override
    public String toString() {
        return super.toString() + kmPrlitre;
    }
}
