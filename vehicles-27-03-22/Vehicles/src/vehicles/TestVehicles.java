package vehicles;

import java.util.ArrayList;
import java.util.List;
import uod.gla.menu.MenuBuilder;
import uod.gla.menu.MenuItem;

public class TestVehicles {
   
      public static void TestVehicleImport(){
      List<Vehicles> vehicleListTest = new ArrayList<>();

          Boolean testPassed = false;
          Main.PopulateVehicleList(vehicleListTest);
          if (vehicleListTest.size() == 10) {
          testPassed = true;
          }
          if (testPassed == true) {
          System.out.println("Test passed - 10 vehicles were added!");
          }
          if (testPassed == false) {
          System.out.println("Test failed - expected 10 vehicles but found " + vehicleListTest.size());
          }
    }
      
      public static void TestAddEstateCar() {
      Boolean testPassed = false;
      String expectedMake = "Audi";
      String expectedModel = "A3";
      int expectedYear = 2020;
      int expectedMileage = 68024;
      int expectedVIN = 2;
      
      List<Vehicles> estateListTest = new ArrayList<>();
      Estate estateCar1 = new Estate (true, true, true, true, false, CarBodyType.ESTATE, "Audi", "A3", 2020, VehicleGearBox.AUTOMATIC, VehicleColour.LOCHNESS_GREEN, 68024, 2);
      estateListTest.add(estateCar1);
      Vehicles estateRecord = estateListTest.get(0);
      
      if (estateRecord.getVehicleColour().equals(VehicleColour.LOCHNESS_GREEN) && 
          estateRecord.getVehicleGearBox().equals(VehicleGearBox.AUTOMATIC) &&
          estateRecord.getVehicleMake().equals(expectedMake) &&
          estateRecord.getVehicleModel().equals(expectedModel) && 
          estateRecord.getVehicleYear()==(expectedYear) &&
          estateRecord.getVehicleMileage()==(expectedMileage) &&
          estateRecord.getVehicleVIN()==(expectedVIN)) {
          testPassed = true;
        } 
      
          if (testPassed == true) {
          System.out.println("Test passed - the Estate vehicle record was correct");
          }
          if (testPassed == false) {
          System.out.println("Test failed - the Estate vehicle record did not contain the expected values");
          }
    }   
      
      public static void TestAddSUVCar() {
      Boolean testPassed = false;
      String expectedMake = "Audi";
      String expectedModel = "Q8";
      int expectedYear = 2022;
      int expectedMileage = 1000;
      int expectedVIN = 123;
      
      List<Vehicles> suvListTest = new ArrayList<>();
      SUV suvCar1 = new SUV (true, true, true, true, true, CarBodyType.SUV, "Audi", "Q8", 2022, VehicleGearBox.AUTOMATIC, VehicleColour.CRYSTAL_BLACK, 1000, 123);
      suvListTest.add(suvCar1);
      Vehicles suvRecord = suvListTest.get(0);
      
      if (suvRecord.getVehicleColour().equals(VehicleColour.CRYSTAL_BLACK) && 
          suvRecord.getVehicleGearBox().equals(VehicleGearBox.AUTOMATIC) &&
          suvRecord.getVehicleMake().equals(expectedMake) &&
          suvRecord.getVehicleModel().equals(expectedModel) && 
          suvRecord.getVehicleYear()==(expectedYear) &&
          suvRecord.getVehicleMileage()==(expectedMileage) &&
          suvRecord.getVehicleVIN()==(expectedVIN)) {
          testPassed = true;
        } 
      
          if (testPassed == true) {
          System.out.println("Test passed - the SUV vehicle record was correct");
          }
          if (testPassed == false) {
          System.out.println("Test failed - the SUV vehicle record did not contain the expected values");
          }
    }
      
      public static void TestAddSaloonCar() {
      Boolean testPassed = false;
      String expectedMake = "Audi";
      String expectedModel = "A6";
      int expectedYear = 2014;
      int expectedMileage = 72000;
      int expectedVIN = 3;
      
      List<Vehicles> saloonListTest = new ArrayList<>();
      Saloon saloonCar1 = new Saloon (true, true, true, true, CarBodyType.SALOON, "Audi", "A6", 2014, VehicleGearBox.MANUAL, VehicleColour.CRYSTAL_BLACK, 78000, 3);
      saloonListTest.add(saloonCar1);
      Vehicles saloonRecord = saloonListTest.get(0);
      
      if (saloonRecord.getVehicleColour().equals(VehicleColour.CRYSTAL_BLACK) && 
          saloonRecord.getVehicleGearBox().equals(VehicleGearBox.MANUAL) &&
          saloonRecord.getVehicleMake().equals(expectedMake) &&
          saloonRecord.getVehicleModel().equals(expectedModel) && 
          saloonRecord.getVehicleYear()==(expectedYear) &&
          saloonRecord.getVehicleMileage()==(expectedMileage) &&
          saloonRecord.getVehicleVIN()==(expectedVIN)) {
          testPassed = true;
        } 
      
          if (testPassed == true) {
          System.out.println("Test passed - the Saloon vehicle record was correct");
          }
          if (testPassed == false) {
          System.out.println("Test failed - the Saloon vehicle record did not contain the expected values");
          }
        }
      
      public static void TestAddHatchbackCar() {
      Boolean testPassed = false;
      String expectedMake = "Audi";
      String expectedModel = "TT";
      int expectedYear = 2000;
      int expectedMileage = 5000;
      int expectedVIN = 4;
      
      List<Vehicles> hatchbackListTest = new ArrayList<>();
      Hatchback hatchbackCar1 = new Hatchback (true, true, true, true, CarBodyType.HATCHBACK, "Audi", "TT", 2000, VehicleGearBox.AUTOMATIC, VehicleColour.FERRARI_RED, 5000, 4);
      hatchbackListTest.add(hatchbackCar1);
      Vehicles hatcbackRecord = hatchbackListTest.get(0);
      
      if (hatcbackRecord.getVehicleColour().equals(VehicleColour.FERRARI_RED) && 
          hatcbackRecord.getVehicleGearBox().equals(VehicleGearBox.AUTOMATIC) &&
          hatcbackRecord.getVehicleMake().equals(expectedMake) &&
          hatcbackRecord.getVehicleModel().equals(expectedModel) && 
          hatcbackRecord.getVehicleYear()==(expectedYear) &&
          hatcbackRecord.getVehicleMileage()==(expectedMileage) &&
          hatcbackRecord.getVehicleVIN()==(expectedVIN)) {
          testPassed = true;
        } 
      
          if (testPassed == true) {
          System.out.println("Test passed - the Hatchback vehicle record was correct");
          }
          if (testPassed == false) {
          System.out.println("Test failed - the Hatchback vehicle record did not contain the expected values");
          }
        }
      
      public static void TestAddMotorbike() {
      Boolean testPassed = false;
      VehicleGearBox expectedGearBox = VehicleGearBox.AUTOMATIC;
      VehicleColour expectedColour = VehicleColour.LOCHNESS_GREEN;
      String expectedMake = "Suzuki";
      String expectedModel = "TokyoDrift";
      int expectedYear = 2015;
      int expectedMileage = 2000;
      int expectedVIN = 15;
      
      List<Vehicles> motorbikeListTest = new ArrayList<>();
      Motorbike bike1 = new Motorbike ("Suzuki", "TokyoDrift", 2015, VehicleGearBox.AUTOMATIC, VehicleColour.LOCHNESS_GREEN, 2000, 15, true);
      motorbikeListTest.add(bike1);
      Vehicles bikeRecord = motorbikeListTest.get(0);
      
      if (bikeRecord.getVehicleColour().equals(expectedColour) && 
          bikeRecord.getVehicleGearBox().equals(expectedGearBox) &&
          bikeRecord.getVehicleMake().equals(expectedMake) &&
          bikeRecord.getVehicleModel().equals(expectedModel) && 
          bikeRecord.getVehicleYear()==(expectedYear) &&
          bikeRecord.getVehicleMileage()==(expectedMileage) &&
          bikeRecord.getVehicleVIN()==(expectedVIN)) {
          testPassed = true;
        } 
      
          if (testPassed == true) {
          System.out.println("Test passed - the motorbike vehicle record was correct");
          }
          if (testPassed == false) {
          System.out.println("Test failed - the motorbike vehicle record did not contain the expected values");
          }
        }
      
      public static void TestAddGoldWarranty() {
      Boolean testPassed = false;
      String warrantyType = "Gold";
      int expectedWarrantyRecordVin = 123;
      String expectedCustomerName = "Pingu Penguin";
      int expectedWarrantyDuration = 48;
      int expectedVehicleYear = 2020;
      int expectedVehicleMileage = 5000;
      int expectedWarrantyCost = Main.GenerateWarrantyCost(warrantyType);
      

      List<Warranty> goldWarrantyRecordListTest = new ArrayList<>();
      Warranty goldWarranty = new GoldWarranty (expectedWarrantyRecordVin, expectedCustomerName, expectedWarrantyDuration, expectedVehicleYear, expectedVehicleMileage, expectedWarrantyCost);
      goldWarrantyRecordListTest.add(goldWarranty);
      Warranty goldWarrantyRecord = goldWarrantyRecordListTest.get(0);
      if (goldWarrantyRecord.getCustomerName().equals(expectedCustomerName) && 
          goldWarrantyRecord.getVehicleMileage()==(expectedVehicleMileage) &&
          goldWarrantyRecord.getVehicleVIN()==(expectedWarrantyRecordVin) &&
          goldWarrantyRecord.getVehicleYear()==(expectedVehicleYear) && 
          goldWarrantyRecord.getWarrantyCost()==(expectedWarrantyCost) &&
          goldWarrantyRecord.getWarrantyDuration()==(expectedWarrantyDuration)) {
          testPassed = true;
     }
          if (testPassed == true) {
          System.out.println("Test passed - the warranty record was correct");
          }
          if (testPassed == false) {
          System.out.println("Test failed - the warranty record did not match the expected values");
          }
      }
      
      public static void TestAddPlatinumWarranty() {
      Boolean testPassed = false;
      String warrantyType = "Platinum";
      int expectedWarrantyRecordVin = 123;
      String expectedCustomerName = "Tiny Tiger";
      int expectedWarrantyDuration = 12;
      int expectedVehicleYear = 2020;
      int expectedVehicleMileage = 5000;
      int expectedWarrantyCost = Main.GenerateWarrantyCost(warrantyType);
      

      List<Warranty> platinumWarrantyRecordListTest = new ArrayList<>();
      Warranty platinumWarranty = new PlatinumWarranty (expectedWarrantyRecordVin, expectedCustomerName, expectedWarrantyDuration, expectedVehicleYear, expectedVehicleMileage, expectedWarrantyCost);
      platinumWarrantyRecordListTest.add(platinumWarranty);
      Warranty platinumWarrantyRecord = platinumWarrantyRecordListTest.get(0);
      if (platinumWarrantyRecord.getCustomerName().equals(expectedCustomerName) && 
          platinumWarrantyRecord.getVehicleMileage()==(expectedVehicleMileage) &&
          platinumWarrantyRecord.getVehicleVIN()==(expectedWarrantyRecordVin) &&
          platinumWarrantyRecord.getVehicleYear()==(expectedVehicleYear) && 
          platinumWarrantyRecord.getWarrantyCost()==(expectedWarrantyCost) &&
          platinumWarrantyRecord.getWarrantyDuration()==(expectedWarrantyDuration)) {
          testPassed = true;
     }
      
          if (testPassed == true) {
          System.out.println("Test passed - the warranty record was correct");
          }
          if (testPassed == false) {
          System.out.println("Test failed - the warranty record did not match the expected values");
          }
      }
      
      public static void TestAddRhodiumWarranty() {
      Boolean testPassed = false;
      String warrantyType = "Rhodium";
      int expectedWarrantyRecordVin = 123;
      String expectedCustomerName = "Austin Powers";
      int expectedWarrantyDuration = 72;
      int expectedVehicleYear = 2020;
      int expectedVehicleMileage = 5000;
      int expectedWarrantyCost = Main.GenerateWarrantyCost(warrantyType);
      
      List<Warranty> rhodiumWarrantyRecordListTest = new ArrayList<>();
      Warranty rhodiumWarranty = new RhodiumWarranty (expectedWarrantyRecordVin, expectedCustomerName, expectedWarrantyDuration, expectedVehicleYear, expectedVehicleMileage, expectedWarrantyCost);
      rhodiumWarrantyRecordListTest.add(rhodiumWarranty);
      Warranty rhodiumWarrantyRecord = rhodiumWarrantyRecordListTest.get(0);
      if (rhodiumWarrantyRecord.getCustomerName().equals(expectedCustomerName) && 
          rhodiumWarrantyRecord.getVehicleMileage()==(expectedVehicleMileage) &&
          rhodiumWarrantyRecord.getVehicleVIN()==(expectedWarrantyRecordVin) &&
          rhodiumWarrantyRecord.getVehicleYear()==(expectedVehicleYear) && 
          rhodiumWarrantyRecord.getWarrantyCost()==(expectedWarrantyCost) &&
          rhodiumWarrantyRecord.getWarrantyDuration()==(expectedWarrantyDuration)) {
          testPassed = true;
     }
      
          if (testPassed == true) {
          System.out.println("Test passed - the warranty record was correct");
          }
          if (testPassed == false) {
          System.out.println("Test failed - the warranty record did not match the expected values");
          }
      }
}