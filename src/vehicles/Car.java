
package vehicles;

public class Car extends Vehicles {
    
        private Boolean hasRoofRack;
        private Boolean hasSatNav;
        private Boolean hasParkingSensors;
        private Boolean hasTowBar;
        private CarBodyType carBodyType;
        private String vehicleMake;
        private String vehicleModel;
        private int vehicleYear;
        private int vehicleVIN;

 public Car(Boolean hasRoofRack, Boolean hasSatNav, Boolean hasParkingSensors, Boolean hasTowBar, CarBodyType carBodyType, String vehicleMake, String vehicleModel, int vehicleYear, VehicleGearBox vehicleGearBox, VehicleColour vehicleColour, int vehicleMileage, int vehicleVIN) {
        super(vehicleMake, vehicleModel, vehicleYear, vehicleGearBox, vehicleColour, vehicleMileage, vehicleVIN);
        this.hasRoofRack = hasRoofRack;
        this.hasSatNav = hasSatNav;
        this.hasParkingSensors = hasParkingSensors;
        this.hasTowBar = hasTowBar;
        this.carBodyType = carBodyType;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.vehicleVIN = vehicleVIN;
    }
 
             @Override
    public String toString() {
        return vehicleMake + vehicleModel + hasRoofRack.toString() + vehicleVIN + hasSatNav.toString() + hasParkingSensors.toString();
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

        @Override
    public String getVehicleMake() {
        return vehicleMake;
    }

        @Override
    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

        @Override
    public String getVehicleModel() {
        return vehicleModel;
    }

        @Override
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

        @Override
    public int getVehicleYear() {
        return vehicleYear;
    }

        @Override
    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public int getVehicleVIN() {
        return vehicleVIN;
    } 

    public Boolean getHasRoofRack() {
        return hasRoofRack;
    }

    public void setHasRoofRack(Boolean hasRoofRack) {
        this.hasRoofRack = hasRoofRack;
    }

    public Boolean getHasSatNav() {
        return hasSatNav;
    }

    public void setHasSatNav(Boolean hasSatNav) {
        this.hasSatNav = hasSatNav;
    }

    public Boolean getHasParkingSensors() {
        return hasParkingSensors;
    }

    public void setHasParkingSensors(Boolean hasParkingSensors) {
        this.hasParkingSensors = hasParkingSensors;
    }

    public Boolean getHasTowBar() {
        return hasTowBar;
    }

    public void setHasTowBar(Boolean hasTowBar) {
        this.hasTowBar = hasTowBar;
    }
    
    

    @Override
    public int compareTo(Vehicles o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}