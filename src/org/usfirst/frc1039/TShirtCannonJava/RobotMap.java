// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1039.TShirtCannonJava;

import edu.wpi.first.wpilibj.AnalogInput;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Solenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import com.ctre.*;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveRightDrive;
    public static CANTalon driveLeftDrive;
    public static CANTalon driveRightDriveB;
    public static CANTalon driveLeftDriveB;
    public static Solenoid driveGearShift;
    public static RobotDrive driveRobotDriveMotors;
    public static Solenoid cannonBarrelExtender;
    public static Solenoid cannonShootSolenoid;
    public static Relay cannonChargeSolenoid;
    public static Relay cannonLight;
    public static CANTalon cannonBarrelRotator;
    public static DigitalInput cannonBarrelOutlimit;
    public static DigitalInput cannonBarrelInLimit;
    public static DigitalInput BarrelLocator;
    public static AnalogInput tankPressure;

    static int kRightMotorA = 1;
    static int kRightMotorB = 2;
    static int kLeftMotorA = 3;
    static int kLeftMotorB = 4;
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveRightDrive = new CANTalon(kRightMotorA);
        driveRightDriveB = new CANTalon(kRightMotorB);
        LiveWindow.addActuator("Drive", "RightDrive", driveRightDrive);
                
        driveLeftDrive = new CANTalon(kLeftMotorA);
        driveLeftDriveB = new CANTalon(kLeftMotorB);
        LiveWindow.addActuator("Drive", "LeftDrive", driveLeftDrive);
        
        driveRightDrive.set(0);
        driveRightDriveB.changeControlMode(CANTalon.TalonControlMode.Follower);
        driveRightDriveB.set(kRightMotorA);
        
        driveLeftDrive.set(0);
        driveLeftDriveB.changeControlMode(CANTalon.TalonControlMode.Follower);
        driveLeftDriveB.set(kLeftMotorA);
        
        driveRobotDriveMotors = new RobotDrive(driveLeftDrive, driveRightDrive);
        
        driveRobotDriveMotors.setSafetyEnabled(true);
        driveRobotDriveMotors.setExpiration(0.1);
        driveRobotDriveMotors.setSensitivity(0.5);
        driveRobotDriveMotors.setMaxOutput(1.0);
        
        driveGearShift = new Solenoid(4);
        LiveWindow.addActuator("Drive", "Shifter", driveGearShift);
        
        cannonBarrelExtender = new Solenoid(0);
        LiveWindow.addActuator("Cannon", "BarrelExtender", cannonBarrelExtender);
        
        cannonShootSolenoid = new Solenoid(1);
        LiveWindow.addActuator("Cannon", "ShootSolenoid", cannonShootSolenoid);
        
        cannonChargeSolenoid = new Relay(0);
        LiveWindow.addActuator("Cannon", "ChargeSolenoid", cannonChargeSolenoid);
        
        cannonLight = new Relay(1);
        LiveWindow.addActuator("Cannon", "Light", cannonLight);
        
        cannonBarrelRotator = new CANTalon(5);
        LiveWindow.addActuator("Cannon", "BarrelRotator", cannonBarrelRotator);
        
        cannonBarrelOutlimit = new DigitalInput(5);
        LiveWindow.addSensor("Cannon", "BarrelOutLimit", cannonBarrelOutlimit);
        
        cannonBarrelInLimit = new DigitalInput(6);
        LiveWindow.addSensor("Cannon", "BarrelInLimit", cannonBarrelInLimit);
        
        BarrelLocator = new DigitalInput(8);
        
        tankPressure = new AnalogInput(0);
        LiveWindow.addSensor("Cannon", "TankPressure", tankPressure);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
