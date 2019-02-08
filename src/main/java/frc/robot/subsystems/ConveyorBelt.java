/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.JoystickConveyorBelt;

/**
 * Add your docs here.
 */
public class ConveyorBelt extends Subsystem {
  Spark conveyorMotor1; 
  Spark conveyorMotor2;
  
  public ConveyorBelt(){
    conveyorMotor1 = new Spark (RobotMap.conveyorBeltMotor1);
    conveyorMotor2 = new Spark (RobotMap.conveyorBeltMotor2);

  }
 
  public void move (double speed){ //method
    double sign = Math.signum(speed); //conserves the sign of the speed which is multiplied to the speed in line 33
    speed = Math.abs(speed); // set the speed to the absolute value of the speed 

    if (speed==0) //comparison, checking to see if the speed is equal to zero 
      speed=0; //sets the speed equal to zero 
    else if (speed<0.3)// if the speed is less than 0.3 then it equals to 0.3
      speed = 0.3;

    speed = speed*sign; //adds the sign back to the speed

    conveyorMotor1.set(speed); //sets the speed of the conveyor motor
    conveyorMotor2.set(speed);

  }



  public void stop (){
    conveyorMotor1.set(0);
    conveyorMotor2.set(0);

  }


  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new JoystickConveyorBelt());
  }
}
