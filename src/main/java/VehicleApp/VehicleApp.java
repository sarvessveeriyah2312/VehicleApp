package vehicleapp;

/* 
 * Name: Sarvess Veeriyah
 * Matrix No: CB20146
 * Section: 02 | 3B 
*/
public class VehicleApp {

   
    public static void main(String[] args) {
        Vehicle car;

        car = new Vehicle("car", "manual", "Electric");

        System.out.println("Accelerate: Current Speed = " + car.accelerate());

        car.brake();

        System.out.println("Brake: Current Speed = " + car.getSpeed());

        System.out.println(car.getPowertrain()+ " " + "car with" + " " + car.getTransmission() + " " + "transmission");
    }       

    }