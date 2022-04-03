package vehicles;

public class Warranty {

        private int vehicleVIN;
        private String customerName; 
        private int warrantyDuration; 
        private int vehicleYear;
        private int vehicleMileage;
        private int warrantyCost;

    public Warranty(int vehicleVIN, String customerName, int warrantyDuration, int vehicleYear, int vehicleMileage, int warrantyCost) {
        this.vehicleVIN = vehicleVIN;
        this.customerName = customerName;
        this.warrantyDuration = warrantyDuration;
        this.vehicleYear = vehicleYear;
        this.vehicleMileage = vehicleMileage;
        this.warrantyCost = warrantyCost;
    }

    public int getVehicleVIN() {
        return vehicleVIN;
    }

    public void setVehicleVIN(int vehicleVIN) {
        this.vehicleVIN = vehicleVIN;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getWarrantyDuration() {
        return warrantyDuration;
    }

    public void setWarrantyDuration(int warrantyDuration) {
        this.warrantyDuration = warrantyDuration;
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
    
    public int getWarrantyCost() {
        return warrantyCost;
    }

    public void setWarrantyCost(int warrantyCost) {
        this.warrantyCost = warrantyCost;
    } 
}