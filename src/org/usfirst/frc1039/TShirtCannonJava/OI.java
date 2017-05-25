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

import org.usfirst.frc1039.TShirtCannonJava.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick driveJoystick;
    public JoystickButton barrelsOutButton;
    public JoystickButton barrelsInButton;
    public JoystickButton pinOutButton;
    public JoystickButton pinInButton;
    public JoystickButton chargeButton;
    public JoystickButton shootButton;
    public JoystickButton rotateButton;
    public JoystickButton nextBarrel;
    public JoystickButton automatedFireButton;
    public Joystick utilityJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        utilityJoystick = new Joystick(1);
        
        automatedFireButton = new JoystickButton(utilityJoystick, 1);
        automatedFireButton.whenPressed(new AutomatedFire());
        nextBarrel = new JoystickButton(utilityJoystick, 5);
        nextBarrel.whenPressed(new RotateUntilLimit());
        rotateButton = new JoystickButton(utilityJoystick, 2);
        rotateButton.whileHeld(new Rotate());
        shootButton = new JoystickButton(utilityJoystick, 9);
        shootButton.whenPressed(new Shoot());
        chargeButton = new JoystickButton(utilityJoystick, 8);
        chargeButton.whenPressed(new ChargeTank());
        /*pinInButton = new JoystickButton(utilityJoystick, 10);
        pinInButton.whenPressed(new PinIn());
        pinOutButton = new JoystickButton(utilityJoystick, 11);
        pinOutButton.whenPressed(new PinOut());
        */barrelsInButton = new JoystickButton(utilityJoystick, 7);
        barrelsInButton.whenPressed(new BarrelsIn());
        barrelsOutButton = new JoystickButton(utilityJoystick, 6);
        barrelsOutButton.whenPressed(new BarrelsOut());
        driveJoystick = new Joystick(0);
        


        // SmartDashboard Buttons

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriveJoystick() {
        return driveJoystick;
    }

    public Joystick getUtilityJoystick() {
        return utilityJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

