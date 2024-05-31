// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {
    // Motors
    // Two Motors
    private final Talon leftMotor = new Talon(DriveConstants.LEFT_MOTOR_PORT);
    private final Talon rightMotor = new Talon(DriveConstants.RIGHT_MOTOR_PORT);

    public double speed = 1.0;

    /**
     * Creates a new DriveSubsystem.
     */
    public DriveSubsystem() {
        leftMotor.setInverted(false);
        rightMotor.setInverted(false);
    }

    public void set(double speed) {
        leftMotor.set(speed);
        rightMotor.set(speed);
    }
}
