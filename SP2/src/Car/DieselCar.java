package Car;

public class DieselCar extends AFuelCar{
    private boolean particleFilter;

    public boolean getParticleFilter (){
        return particleFilter;
    }



    public DieselCar (String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super (registrationNumber,make,model,numberOfDoors,kmPrLitre);

    }

    public String getFuelType (){
        return "Diesel";
    }


    public int getRegistrationFee (DieselCar dc){
        int price = 0;
        if(kmPrLitre()>20 && kmPrLitre()<50){
            price = 130;
        } else if (kmPrLitre()>15 && kmPrLitre()<20) {
            price = 1390;
        } else if (kmPrLitre()>10 && kmPrLitre()<15) {
            price = 1850;
        } else if (kmPrLitre()>5 && kmPrLitre()<10) {
            price = 2770;
        } else if (kmPrLitre()>5) {
            price= 15260;
        }
        if (!dc.particleFilter){
            price += 1000;

        }
        return price;



    }

    @Override
    public String toString() {
        return this.getModel() + this.getMake();
    }
}
