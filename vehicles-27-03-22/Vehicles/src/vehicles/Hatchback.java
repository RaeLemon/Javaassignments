
package vehicles;

public class Hatchback extends Car {
    
        private Boolean hasRoofRack;
        private Boolean hasSatNav;
        private Boolean hasParkingSensors;
        private Boolean hasTowBar;
        private CarBodyType carBodyType;
        private VehicleColour vehicleColour;
        private VehicleGearBox vehicleGearBox;
        private String vehicleMake;
        private String vehicleModel;
        private int vehicleYear;
        private int vehicleMileage;
        private int vehicleVIN;

    public Hatchback(Boolean hasRoofRack, Boolean hasSatNav, Boolean hasParkingSensors, Boolean hasTowBar, CarBodyType carBodyType, String vehicleMake, String vehicleModel, int vehicleYear, VehicleGearBox vehicleGearBox, VehicleColour vehicleColour, int vehicleMileage, int vehicleVIN) {
        super(hasRoofRack, hasSatNav, hasParkingSensors, hasTowBar, carBodyType, vehicleMake, vehicleModel, vehicleYear, vehicleGearBox, vehicleColour, vehicleMileage, vehicleVIN);
        
        this.hasRoofRack = hasRoofRack;
        this.hasSatNav = hasSatNav;
        this.hasParkingSensors = hasParkingSensors;
        this.hasTowBar = hasTowBar;
        this.carBodyType = carBodyType;
        this.vehicleMileage = vehicleMileage;
        this.vehicleColour = vehicleColour;
        this.vehicleGearBox = vehicleGearBox;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.vehicleVIN = vehicleVIN;
    }
    
                  @Override
    public String toString() {
        return "\nVehicle Identification Number: " + vehicleVIN + 
                "\nVehicle Make: " + vehicleMake + 
                "\nVehicle Model: " + vehicleModel +
                "\nVehicle Year: " + vehicleYear +
                "\nVehicle Colour: " + vehicleColour + 
                "\nVehicle Body Type: " + carBodyType +
                "\nVehicle Gear Box : " + vehicleGearBox.toString() +
                "\nVehicle Mileage: " + vehicleMileage +
                "\nVehicle has Roof Rack Row?: " + hasRoofRack.toString() +
                "\nVehicle has Satnav?: " + hasSatNav.toString() +
                "\nVehicle has Parking Sensors? : " + hasParkingSensors.toString() +
                "\nVehicle has Tow Bar?: " + hasTowBar.toString();
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

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

    public VehicleColour getVehicleColour() {
        return vehicleColour;
    }

    public void setVehicleColour(VehicleColour vehicleColour) {
        this.vehicleColour = vehicleColour;
    }

    public VehicleGearBox getVehicleGearBox() {
        return vehicleGearBox;
    }

    public void setVehicleGearBox(VehicleGearBox vehicleGearBox) {
        this.vehicleGearBox = vehicleGearBox;
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

    public int getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
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

    public void setVehicleVIN(int vehicleVIN) {
        this.vehicleVIN = vehicleVIN;
    }
    
    
    }
    

