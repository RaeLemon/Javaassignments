
package vehicles;

public abstract class Vehicles extends Object implements Comparable<Vehicles> {

        private String vehicleMake;
        private String vehicleModel; 
        private int vehicleYear; 
        private VehicleGearBox vehicleGearBox;
        private VehicleColour vehicleColour; //value can change 
        private int vehicleMileage; //value can change
        private int vehicleVIN;

    public Vehicles(String vehicleMake, String vehicleModel, int vehicleYear, VehicleGearBox vehicleGearBox, VehicleColour vehicleColour, int vehicleMileage, int vehicleVIN) {
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.vehicleGearBox = vehicleGearBox;
        this.vehicleMileage = vehicleMileage;
        this.vehicleVIN = vehicleVIN;
    }
     
    public String getVehicleMake() {
        return vehicleMake;
    }
    
    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }
    
    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    
    public VehicleGearBox getVehicleGearBox() {
        return vehicleGearBox;
    }
    
    public VehicleGearBox setVehicleGearBox() {
        return vehicleGearBox;
    }
    
    public VehicleColour getVehicleColour() {
        return vehicleColour;
    }
    
    public void setVehicleColour(VehicleColour vehicleColour) {
        this.vehicleColour = vehicleColour;
    }
       
    public int getVehicleMileage() {
        return vehicleMileage;
    }

    public void setVehicleMileage(int vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }
    
    public int getVehicleVIN() {
        return vehicleVIN;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public void setVehicleVIN(int vehicleVIN) {
        this.vehicleVIN = vehicleVIN;
    }
}