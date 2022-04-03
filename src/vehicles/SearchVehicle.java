/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author RaeLe
 */
public class SearchVehicle {
    
public static int GetUserVehicleVin (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the vehicle identification number");
    int vehicleVin = input.nextInt();
    return vehicleVin;
}

public static int LocateVehicleRecord(int vehicleVin) {
    // Load list of vehicles
    // Parse list and find a match on the Vehicle VIN
    // Return the vehicle record
    return vehicleVin;
    }
    // else return error citing unable to locate vehicle record
    // return null;    

public static void DisplayVehicleRecord (String[] vehicleRecord) {
    // Build out the display text
    // Return the vehicle record
}
}
