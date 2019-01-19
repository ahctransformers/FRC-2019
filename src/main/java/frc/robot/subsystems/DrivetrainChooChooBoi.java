/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.JoystickBoi;

/**
 * Add your docs here.
 */
public class DrivetrainChooChooBoi extends Subsystem {

  Spark leftMotor, rightMotor; //Yvette-object 
  Encoder countencoder;
  // Yvette - put Gyro if we have one!
  DifferentialDrive swagMove;

  public DrivetrainChooChooBoi () {

  rightMotor = new Spark(RobotMap.leftDriveTrainmotor);
  leftMotor = new Spark (RobotMap.rightDriveTrainmotor);
  countencoder = new Encoder (RobotMap.countencoderA,RobotMap.countencoderB);

  swagMove = new DifferentialDrive(leftMotor, rightMotor);
}

public void move (double throttle, double rotation) {
  swagMove.arcadeDrive(throttle, rotation);
}

//public accelerate (double move, double turn) { // methods}

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new JoystickBoi());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
