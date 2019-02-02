/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import org.usfirst.frc.team708.robot.util.Gamepad;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.DrivetrainChooChooBoi;

public class JoystickBoi extends Command {
  public JoystickBoi() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_DrivetrainChooChooBoi);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  
    //Robot.m_DrivetrainChooChooBoi.move(Robot.m_oi.driverGamepad.getAxis(Gamepad.button_LeftStick),
    //                                   Robot.m_oi.driverGamepad.getAxis(Gamepad.button_RightStick));

    Robot.m_DrivetrainChooChooBoi.move(-Robot.m_oi.driverGamepad.getAxis(1), Robot.m_oi.driverGamepad.getAxis(0));


  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
