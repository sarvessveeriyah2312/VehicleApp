package vehicleapp;

/* 
 * Name: Sarvess Veeriyah
 * Matrix No: CB20146
 * Section: 02 | 3B 
*/

//Declare 
public class Vehicle {
    private String type;
    private final String transmission;
    private String powertrain;
    private int speed;

    public Vehicle(String type, String transmission, String powertrain){
       this.type = type;
       this.transmission = transmission;
       this.powertrain = powertrain;
       this.speed = 60; 
    }
    
    
    // Calculation
    public int accelerate(){
        return speed = speed + 10;
    }
   

    public void brake(){
        this.speed = speed - 5;
    }
    //Setter & Getter
    public int getSpeed(){
        return speed;
    }

    public String getType(){
        return type;
    }
    

   public void setType(String type){
       this.type = type;
   }
   public String getTransmission(){
       return transmission;
   }
    public String getPowertrain(){
       return powertrain;
   }
     public void setPowerTrain(String powertrain){
         this.powertrain = powertrain;
   }
}