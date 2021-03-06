// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1039.TShirtCannonJava.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1039.TShirtCannonJava.Robot;
import org.usfirst.frc1039.TShirtCannonJava.StopWatch;;

/**
 *
 */
public class RotateUntilLimit extends Command {
	// Stop watch to kill the process if the limit switch is stopped
	StopWatch mWatcher = new StopWatch(15000);
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public RotateUntilLimit() {
		
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.cannon);
    	System.out.println("RUL cons");    	

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("RUL init"); 
    	mWatcher.reset();
//    	Robot.cannon.startBarreling();
//    	Robot.cannon.setBarrelOut();
    	Robot.cannon.setNextBarrel();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(true == Robot.cannon.isBarrelOut())
    	{
    		Robot.cannon.rotate();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	boolean gotToNext = (Robot.cannon.currentBarrel == Robot.cannon.nextBarrel);
    	boolean stopWatchFinished = mWatcher.isExpired();
    	
    	if((true == stopWatchFinished) || (true == gotToNext))
    	{
        	Robot.cannon.stopRotate();
        	System.out.print("Watch:"); 
        	System.out.print(stopWatchFinished); 
        	System.out.print(" Next:"); 
        	System.out.println(gotToNext); 
    		return true;
    	}
		return false;
        //return Robot.cannon.isLimitPressed();
    }

    // Called once after isFinished returns true
    protected void end() {
       	System.out.println("RUL end");    	
    	Robot.cannon.stopRotate();
    	Robot.cannon.reachedNextBarrel = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
       	System.out.println("RUL intr");    	
    	end();
    }
}
