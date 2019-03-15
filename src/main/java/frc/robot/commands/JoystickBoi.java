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

public class JoystickBoi extends Command {

  double slowmoSpeed = 0.5;

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
    if (Robot.m_oi.driverGamepad.getButton(Gamepad.button_L_Shoulder)) {
      Robot.m_DrivetrainChooChooBoi.move(Robot.m_oi.driverGamepad.getAxis(Gamepad.leftStick_Y) * slowmoSpeed, Robot.m_oi.driverGamepad.getAxis(Gamepad.rightStick_X) * slowmoSpeed);
    } else {
      Robot.m_DrivetrainChooChooBoi.move(Robot.m_oi.driverGamepad.getAxis(Gamepad.leftStick_Y), Robot.m_oi.driverGamepad.getAxis(Gamepad.rightStick_X));
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_DrivetrainChooChooBoi.move(0.0, 0.0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
