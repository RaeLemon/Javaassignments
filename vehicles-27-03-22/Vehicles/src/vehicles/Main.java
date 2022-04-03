package vehicles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import uod.gla.menu.MenuBuilder;
import uod.gla.menu.MenuItem;
import uod.gla.util.CollectionUtils;
import uod.gla.util.Reader;

public class Main {
    
    private static List<Vehicles> vehicleList = new ArrayList<>();
    private static List<Warranty> warrantyList = new ArrayList<>();
    
    private static Main object = new Main();

    public static void main(String[] args) {
        TestVehicles.TestVehicleImport();
        TestVehicles.TestAddEstateCar();
        TestVehicles.TestAddSUVCar();
        TestVehicles.TestAddHatchbackCar();
        TestVehicles.TestAddMotorbike();
        TestVehicles.TestAddGoldWarranty();
        TestVehicles.TestAddPlatinumWarranty();
        TestVehicles.TestAddRhodiumWarranty();
        
        PopulateVehicleList(vehicleList);
 
        System.out.println("Welcome to Car Records System v1.0!");
        MenuItem create = new MenuItem("C", "Create New Vehicle", object, "AddVehicleMenu");
        MenuItem update = new MenuItem("U", "Update Vehicle Records", object, "UpdateVehicleRecords");
        MenuItem search = new MenuItem("S", "Search Vehicle Records", object, "SearchVehicleRecords");
        MenuItem listVehicles = new MenuItem("D", "Display All Vehicle records", object, "ListAllVehicles");
        MenuItem addWarranty = new MenuItem("W", "Register New Warranty", object, "ShowWarrantyMenu");
        MenuItem listWarranty = new MenuItem("Y", "Display All Warranty records", object, "ListAllWarranties");
        MenuItem removeVehicle = new MenuItem("F", "Remove Vehicle Record", object, "RemoveVehicleRecords");
        MenuBuilder.displayMenu(create, search, update, listVehicles, addWarranty,  listWarranty, removeVehicle);
        System.out.println("Exiting..");
    }
    
    public static void AddVehicleMenu() {
    MenuItem car = new MenuItem("C", "Car", object, "AddCarMenu");
    MenuItem motorbike = new MenuItem("M", "Motorbike", object, "AddMotorbike");
    MenuBuilder.displayMenuOnceAndReturn("Please select car or motorbike...", car, motorbike);
    }
    
    public static void AddCarMenu() {
    MenuItem estate = new MenuItem("E", "Estate", object, "AddEstateCar");
    MenuItem saloon = new MenuItem("S", "Saloon", object, "AddSaloonCar");
    MenuItem hatchback = new MenuItem("H", "Hatchback", object, "AddHatchbackCar");
    MenuItem suv = new MenuItem("V", "SUV", object, "AddSUVCar");
    MenuBuilder.displayMenuOnceAndReturn("Please select a vehicle type...", estate, saloon, hatchback, suv);
    }
   
    public static void AddEstateCar() {
    CarBodyType bodyType = CarBodyType.ESTATE;
    String carMake;
    String carModel;
    int carYear;
    VehicleGearBox carGearBoxType;
    VehicleColour carColour;
    int carMileage;
    int carVin;
    Boolean hasRoofRack;
    Boolean hasSatNav;
    Boolean hasParkingSensors;
    Boolean hasTowBar;
    Boolean hasThirdRowSeat;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the car make:");
    carMake = input.nextLine();
    System.out.println("Enter the car model:");
    carModel = input.nextLine();
    System.out.println("Enter the car identification number:");
    carVin = input.nextInt();
    System.out.println("Enter the car year:");
    carYear = input.nextInt();
    carGearBoxType = Reader.readEnum("Enter the gearbox type: ", VehicleGearBox.class);
    carColour = Reader.readEnum("Enter the car colour: ", VehicleColour.class);
    System.out.println("Enter the car mileage:");
    carMileage = input.nextInt();
    System.out.println("Does the car have a " + StandardCarOptions.ROOFRACK + "?");
    hasRoofRack = input.nextBoolean();
    System.out.println("Does the car have a " + StandardCarOptions.SATNAV + "?");
    hasSatNav = input.nextBoolean();
    System.out.println("Does the car have " + StandardCarOptions.PARKINGSENSORS + "?");
    hasParkingSensors = input.nextBoolean();
    System.out.println("Does the car have a " + StandardCarOptions.TOWBAR + "?");
    hasTowBar = input.nextBoolean();
    System.out.println("Does the car have a " + EstateVehicleOptions.THIRDROWSEAT + "?");
    hasThirdRowSeat = input.nextBoolean();
    Vehicles estateCar = new Estate (hasThirdRowSeat, hasRoofRack, hasSatNav, hasParkingSensors, hasTowBar, bodyType, carMake, carModel, carYear, carGearBoxType, carColour, carMileage, carVin);
    vehicleList.add(estateCar);
    }
        
public static void AddSaloonCar() {
    CarBodyType bodyType = CarBodyType.SALOON;
    String carMake;
    String carModel;
    int carYear;
    VehicleGearBox carGearBoxType;
    VehicleColour carColour;
    int carMileage;
    int carVin;
    Boolean hasRoofRack;
    Boolean hasSatNav;
    Boolean hasParkingSensors;
    Boolean hasTowBar;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the car make:");
    carMake = input.nextLine();
    System.out.println("Enter the car model:");
    carModel = input.nextLine();
    System.out.println("Enter the car identification number:");
    carVin = input.nextInt();
    System.out.println("Enter the car year:");
    carYear = input.nextInt();
    carGearBoxType = Reader.readEnum("Enter the gearbox type: ", VehicleGearBox.class);
    carColour = Reader.readEnum("Enter the car colour: ", VehicleColour.class);
    System.out.println("Enter the car mileage:");
    carMileage = input.nextInt();
    System.out.println("Does the car have a " + StandardCarOptions.ROOFRACK + "?");
    hasRoofRack = input.nextBoolean();
    System.out.println("Does the car have a " + StandardCarOptions.SATNAV + "?");
    hasSatNav = input.nextBoolean();
    System.out.println("Does the car have " + StandardCarOptions.PARKINGSENSORS + "?");
    hasParkingSensors = input.nextBoolean();
    System.out.println("Does the car have a " + StandardCarOptions.TOWBAR + "?");
    hasTowBar = input.nextBoolean();
    Vehicles saloonCar = new Saloon (hasRoofRack, hasSatNav, hasParkingSensors, hasTowBar, bodyType, carMake, carModel, carYear, carGearBoxType, carColour, carMileage, carVin);
    vehicleList.add(saloonCar);
    }

public static void AddSUVCar() {
    CarBodyType bodyType = CarBodyType.SUV;
    String carMake;
    String carModel;
    int carYear;
    VehicleGearBox carGearBoxType;
    VehicleColour carColour;
    int carMileage;
    int carVin;
    Boolean hasRoofRack;
    Boolean hasSatNav;
    Boolean hasParkingSensors;
    Boolean hasTowBar;
    Boolean hasAllWheelDriveTrain;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the car make:");
    carMake = input.nextLine();
    System.out.println("Enter the car model:");
    carModel = input.nextLine();
    System.out.println("Enter the car identification number:");
    carVin = input.nextInt();
    System.out.println("Enter the car year:");
    carYear = input.nextInt();
    carGearBoxType = Reader.readEnum("Enter the gearbox type: ", VehicleGearBox.class);
    carColour = Reader.readEnum("Enter the car colour: ", VehicleColour.class);
    System.out.println("Enter the car mileage:");
    carMileage = input.nextInt();
    System.out.println("Does the car have a " + StandardCarOptions.ROOFRACK + "?");
    hasRoofRack = input.nextBoolean();
    System.out.println("Does the car have a " + StandardCarOptions.SATNAV + "?");
    hasSatNav = input.nextBoolean();
    System.out.println("Does the car have " + StandardCarOptions.PARKINGSENSORS + "?");
    hasParkingSensors = input.nextBoolean();
    System.out.println("Does the car have a " + StandardCarOptions.TOWBAR + "?");
    hasTowBar = input.nextBoolean();
    System.out.println("Does the car have " + SUVVehicleOptions.ALL_WHEEL_DRIVE_TRAIN + "?");
    hasAllWheelDriveTrain = input.nextBoolean();
    Vehicles suvCar = new SUV (hasAllWheelDriveTrain, hasRoofRack, hasSatNav, hasParkingSensors, hasTowBar, bodyType, carMake, carModel, carYear, carGearBoxType, carColour, carMileage, carVin);
    vehicleList.add(suvCar);
    }

public static void AddHatchbackCar() {
    CarBodyType bodyType = CarBodyType.HATCHBACK;
    String carMake;
    String carModel;
    int carYear;
    VehicleGearBox carGearBoxType;
    VehicleColour carColour;
    int carMileage;
    int carVin;
    Boolean hasRoofRack;
    Boolean hasSatNav;
    Boolean hasParkingSensors;
    Boolean hasTowBar;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the car make:");
    carMake = input.nextLine();
    System.out.println("Enter the car model:");
    carModel = input.nextLine();
    System.out.println("Enter the car identification number:");
    carVin = input.nextInt();
    System.out.println("Enter the car year:");
    carYear = input.nextInt();
    carGearBoxType = Reader.readEnum("Enter the gearbox type: ", VehicleGearBox.class);
    carColour = Reader.readEnum("Enter the car colour: ", VehicleColour.class);
    System.out.println("Enter the car mileage:");
    carMileage = input.nextInt();
    System.out.println("Does the car have a " + StandardCarOptions.ROOFRACK + "?");
    hasRoofRack = input.nextBoolean();
    System.out.println("Does the car have a " + StandardCarOptions.SATNAV + "?");
    hasSatNav = input.nextBoolean();
    System.out.println("Does the car have " + StandardCarOptions.PARKINGSENSORS + "?");
    hasParkingSensors = input.nextBoolean();
    System.out.println("Does the car have a " + StandardCarOptions.TOWBAR + "?");
    hasTowBar = input.nextBoolean();
    Vehicles hatchbackCar = new Hatchback (hasRoofRack, hasSatNav, hasParkingSensors, hasTowBar, bodyType, carMake, carModel, carYear, carGearBoxType, carColour, carMileage, carVin);
    vehicleList.add(hatchbackCar);
    }
    
    public static void AddMotorbike () {
    String bikeMake;
    String bikeModel;
    int bikeYear;
    VehicleGearBox bikeGearBoxType;
    VehicleColour bikeColour;
    int bikeMileage;
    int bikeVin;
    Boolean hasLuggageBox;
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the motorbike make:");
    bikeMake = input.nextLine();
    System.out.println("Enter the motorbike model:");
    bikeModel = input.nextLine();
    System.out.println("Enter the motorbike vehicle identification number:");
    bikeVin = input.nextInt();
    System.out.println("Enter the motorbike year:");
    bikeYear = input.nextInt();
    bikeGearBoxType = Reader.readEnum("Enter the gearbox type: ", VehicleGearBox.class);
    bikeColour = Reader.readEnum("Enter the motorbike colour: ", VehicleColour.class);
    System.out.println("Enter the motorbike mileage:");
    bikeMileage = input.nextInt();
    System.out.println("Does the motorbike have a " + MotorbikeOptions.LUGGAGEBOX + "?");
    hasLuggageBox = input.nextBoolean();
    Vehicles motorbike = new Motorbike (bikeMake, bikeModel, bikeYear, bikeGearBoxType, bikeColour, bikeMileage, bikeVin, hasLuggageBox);
    vehicleList.add(motorbike);
    }
    
    public static void UpdateVehicleRecords() {
        String key = Reader.readLine("Enter the vehicle identification number (VIN): ");
        Vehicles v = search(key);
        if (v == null) {
            System.out.println("No vehicle was found!");
            return;
        } else {
            System.out.println("Found the following vehicle...");
            System.out.println(v);
        }
        
        boolean isMotorbike = v.getClass().getTypeName().equals("Motorbike");
        boolean isEstate = v.getClass().getTypeName().equals("Estate");
        boolean isSuv = v.getClass().getTypeName().equals("SUV");
        
        boolean edited = false;
        if (Reader.readBoolean("Do you want to change this vehicle's mileage? ")) {
            v.setVehicleMileage(Reader.readInt("Enter new vehicle mileage: "));
            edited = true;
        }
        if (Reader.readBoolean("Do you want to change this vehicle's colour? ")) {
            v.setVehicleColour(Reader.readEnum("Select new vehicle colour: ", VehicleColour.class));
            edited = true;
        }
        if(isMotorbike == true) {
        
        if (Reader.readBoolean("Do you want to add/remove the motorbike's " + MotorbikeOptions.LUGGAGEBOX + "?")) {
        }
        }
        if (edited) {
            System.out.println("One or more vehicle details have been successfully changed!");
        } else {
            System.out.println("No detail was changed");
        }
    }
    
        public static void SearchVehicleRecords(String vehicleVin) {
        String vehicleVIN = Reader.readLine("Enter the vehicle vin: ");
        Vehicles vehicleSearch = search(vehicleVIN);
        if (vehicleSearch == null) {
            System.out.println("No vehicle was found!");
        } else {
            System.out.println("Found the following vehicle...");
            System.out.println(vehicleSearch);
        }
        }
    
        private static Vehicles search(String key) {
        Collection<Vehicles> results = CollectionUtils.search(key, vehicleList);
        if (results == null || results.isEmpty()) {
            return null;
        }
        return Reader.readObject("Please select a vehicle from the list", results);
    }
        
    public static void RemoveVehicleRecords() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the vehicle identification number (VIN) of the vehicle you wish to remove:");
    int vehicleVin = input.nextInt();
    try {
    Vehicles vehicleRecord = vehicleList.get(GetCarRecordNumber(vehicleVin));
    }
    catch(Exception e) {
    System.out.println("A vehicle with identification number (VIN) " + vehicleVin + " could not be found!");
    return;
    }
                    if (Reader.readBoolean("Do you wish to permanently remove this vehicle from the database?")) {
                    vehicleList.remove(GetCarRecordNumber(vehicleVin));         
                    System.out.println("Vehicle " + vehicleVin + " removed!");
        }
                    else System.out.println("Vehicle " + vehicleVin + " not removed!");

        }
        
    public static int GetCarRecordNumber(int vehicleVin) {
    for (Vehicles v : vehicleList) {
    if ( v.getVehicleVIN() == (vehicleVin) ) {
        int recordIndexNumber = vehicleList.indexOf(v);
        return recordIndexNumber;
        }
    }
    return -1;
    }


   public static void ListAllVehicles() {
        search("");
    }
   
    public static void ShowWarrantyMenu() {
    MenuItem gold = new MenuItem("G", "Gold", object, "AddGoldWarranty");
    MenuItem platinum = new MenuItem("P", "Platinum", object, "AddPlatinumWarranty");
    MenuItem rhodium = new MenuItem("Z", "Rhodium", object, "AddRhodiumWarranty");
    MenuBuilder.displayMenuOnceAndReturn("Please select warranty type...", gold, platinum, rhodium);
    }
    
    public static void AddGoldWarranty () {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the vehicle identification number:");
    int vehicleVin = input.nextInt();
    System.out.println("Enter the warranty duration in increments of 12 months");
    int warrantyDuration = input.nextInt();
    String customerName = Reader.readName("Enter customer name: ");
    System.out.println("Enter the vehicle year:");
    int vehicleYear = input.nextInt();
    System.out.println("Enter the vehicle mileage:");
    int vehicleMileage = input.nextInt();
    int warrantyCost = GenerateWarrantyCost("Gold");
    System.out.println("Warranty Cost: £" + warrantyCost);
    Warranty goldWarranty = new GoldWarranty (vehicleVin, customerName, warrantyDuration, vehicleYear, vehicleMileage, warrantyCost);
    warrantyList.add(goldWarranty);    
    }
    
    public static void AddPlatinumWarranty () {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the vehicle identification number:");
    int vehicleVin = input.nextInt();
    System.out.println("Enter the warranty duration in increments of 12 months");
    int warrantyDuration = input.nextInt();
    String customerName = Reader.readName("Enter customer name: ");
    System.out.println("Enter the vehicle year:");
    int vehicleYear = input.nextInt();
    System.out.println("Enter the vehicle mileage:");
    int vehicleMileage = input.nextInt();
    // TODO: Generate cost
    int warrantyCost = GenerateWarrantyCost("Platinum");
    System.out.println("Warranty Cost: £" + warrantyCost);
    Warranty platinumWarranty = new PlatinumWarranty (vehicleVin, customerName, warrantyDuration, vehicleYear, vehicleMileage, warrantyCost);
    warrantyList.add(platinumWarranty);    
    }
    
    public static void AddRhodiumWarranty () {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the vehicle identification number:");
    int vehicleVin = input.nextInt();
    System.out.println("Enter the warranty duration in increments of 12 months");
    int warrantyDuration = input.nextInt();
    String customerName = Reader.readName("Enter customer name: ");
    System.out.println("Enter the vehicle year:");
    int vehicleYear = input.nextInt();
    System.out.println("Enter the vehicle mileage:");
    int vehicleMileage = input.nextInt();
    // TODO: Generate cost
    int warrantyCost = GenerateWarrantyCost("Rhodium");
    System.out.println("Warranty Cost: £" + warrantyCost);
    Warranty rhodiumWarranty = new RhodiumWarranty (vehicleVin, customerName, warrantyDuration, vehicleYear, vehicleMileage, warrantyCost);
    warrantyList.add(rhodiumWarranty);    
    }
    
    public static int GenerateWarrantyCost(String warrantyType) {
    String warranty = warrantyType;
    int finalCostValue;
    
        if (null == warranty) return finalCostValue = 999999999; // TO DO FIX THIS LOL
        
        else switch (warranty) {
            case "Gold":
                return finalCostValue = 250;
            case "Platinum":
                return finalCostValue = 500;
            case "Rhodium":
                return finalCostValue = 750;
            default:
                return finalCostValue = 0;
        }
            }
    
    public static void ListAllWarranties() {
    for (Warranty w : warrantyList) {
        System.out.println("Vehicle Identification Number: " + (w.getVehicleVIN()));
        System.out.println("Customer Name : " + (w.getCustomerName()));
        System.out.println("Warranty Duration : " + (w.getWarrantyDuration()));
        System.out.println("Vehicle Year : " + (w.getVehicleYear()));
        System.out.println("Vehicle Mileage : " + (w.getVehicleMileage()));
        System.out.println("Warranty Cost : £" + (w.getWarrantyCost()));
        System.out.println("*****End of warranty record*****");
    }
    System.out.println(warrantyList.size() + " warranty records displayed!");
    }
    
    public static void PopulateVehicleList(List listName) {
    SUV suvCar1 = new SUV (true, true, true, true, true, CarBodyType.SUV, "Audi", "Q8", 2020, VehicleGearBox.AUTOMATIC, VehicleColour.CRYSTAL_BLACK, 2000, 1);
    listName.add(suvCar1);
    
    Estate estateCar1 = new Estate (true, true, true, true, false, CarBodyType.ESTATE, "Audi", "A3", 2020, VehicleGearBox.AUTOMATIC, VehicleColour.LOCHNESS_GREEN, 2000, 2);
    listName.add(estateCar1);
    
    Saloon saloonCar1 = new Saloon (true, true, true, true, CarBodyType.SALOON, "Audi", "A6", 2014, VehicleGearBox.MANUAL, VehicleColour.CRYSTAL_BLACK, 78000, 3);
    listName.add(saloonCar1);
    
    Hatchback hatchbackCar1 = new Hatchback (true, true, true, true, CarBodyType.HATCHBACK, "Audi", "TT", 2000, VehicleGearBox.AUTOMATIC, VehicleColour.FERRARI_RED, 5000, 4);
    listName.add(hatchbackCar1);
    
    Motorbike motorbike1 = new Motorbike ("Suzuki", "Bambooki", 2020, VehicleGearBox.AUTOMATIC, VehicleColour.LOCHNESS_GREEN, 2000, 5, true);
    listName.add(motorbike1);
    
    Estate estateCar2 = new Estate (true, true, true, true, false, CarBodyType.ESTATE, "BMW", "M1", 2020, VehicleGearBox.AUTOMATIC, VehicleColour.LOCHNESS_GREEN, 2000, 6);
    listName.add(estateCar2);
    
    Saloon saloonCar2 = new Saloon (true, true, true, true, CarBodyType.SALOON, "BMW", "M4", 2020, VehicleGearBox.AUTOMATIC, VehicleColour.MIDNIGHT_BLUE, 2000, 7);
    listName.add(saloonCar2);
    
    Motorbike motorbike2 = new Motorbike ("Suzuki", "TokyoDrift", 2015, VehicleGearBox.AUTOMATIC, VehicleColour.LOCHNESS_GREEN, 2000, 8, true);
    listName.add(motorbike2);
    
    Motorbike motorbike3 = new Motorbike ("Fujitsu", "TVBike", 2015, VehicleGearBox.AUTOMATIC, VehicleColour.LOCHNESS_GREEN, 2000, 9, true);
    listName.add(motorbike3);
    
    Motorbike motorbike4 = new Motorbike ("Samsung", "S22", 2022, VehicleGearBox.AUTOMATIC, VehicleColour.LOCHNESS_GREEN, 2000, 10, true);
    listName.add(motorbike4);
    }
}