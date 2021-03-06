/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class GlassyBoi extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands

  DoubleSolenoid saltenoid = new DoubleSolenoid(0,1);

  public GlassyBoi() {
    // stuff goes here
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void goOut(){
    saltenoid.set(DoubleSolenoid.Value.kForward);
  } 
  public void goIn(){
    saltenoid.set(DoubleSolenoid.Value.kReverse);
  }
  public void goOff(){
    saltenoid.set(DoubleSolenoid.Value.kOff);
  }
  
}
