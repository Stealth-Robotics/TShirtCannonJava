package org.usfirst.frc1039.TShirtCannonJava.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class NextBarrel extends CommandGroup {

    public NextBarrel() {
        addSequential(new BarrelsOut());
        //addSequential(new PinIn());
        //addSequential(new HalfSecondDelay());
        //addParallel(new DelayPinOut());
        addSequential(new RotateUntilLimit());
        addSequential(new BarrelsIn());

    }
}
