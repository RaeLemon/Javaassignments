package vehicles;

public class Motorbike extends Vehicles {
    
        private Boolean hasLuggageBox;
        private VehicleColour vehicleColour;
        private VehicleGearBox vehicleGearBox;
        private String vehicleMake;
        private String vehicleModel;
        private int vehicleYear;
        private int vehicleMileage;
        private int vehicleVIN;

    private MotorbikeOptions motorbikeOptions; 

    public Motorbike (String vehicleMake, String vehicleModel, int vehicleYear, VehicleGearBox vehicleGearBox, VehicleColour vehicleColour, int vehicleMileage, int vehicleVIN, Boolean hasLuggageBox)
    { super (vehicleMake, vehicleModel, vehicleYear, vehicleGearBox, vehicleColour, vehicleMileage, vehicleVIN);
    
        this.hasLuggageBox = hasLuggageBox;
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
                "\nVehicle Mileage: " + vehicleMileage +
                "\nVehicle has Luggage Box?: " + hasLuggageBox.toString();
    }

    public Boolean getHasLuggageBox() {
        return hasLuggageBox;
    }

    public void setHasLuggageBox(Boolean hasLuggageBox) {
        this.hasLuggageBox = hasLuggageBox;
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
    
    
    public MotorbikeOptions getMotorbikeOptions() {
        return motorbikeOptions;
    }

    public void setMotorbikeOptions() {
        this.motorbikeOptions = motorbikeOptions;
    }

    @Override
    public int compareTo(Vehicles o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}