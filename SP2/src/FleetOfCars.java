import Car.Car;

import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar (Car car){
        cars.add(car);



    }
    public void getTotalRegistrationFeeForFleet (){
        double sum = 0;
        for (int i = 0; i < cars.size(); i++){
            sum+= cars.get(i).getRegistrationFee();

        }
        System.out.println(sum);

    }


}
