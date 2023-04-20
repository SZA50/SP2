package Car;

public abstract class ACar {

    private String registrationNumber;

    private String make;

    private String model;

    int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors ){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;

    }
    public String getRegistrationNumber(){
        return "";

    }
    public String getMake (){
        return "";
    }

    public String getModel (){
        return "";
    }

    public int getNumberOfDoors(){
        return 0;
    }

    @Override
    public String toString() {
        return this.registrationNumber + this.make + this.model + this.numberOfDoors;
    }
}
