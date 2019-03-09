/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import org.usfirst.frc.team708.robot.util.Gamepad;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.glassyboi.MoveIn;
import frc.robot.commands.glassyboi.MoveOut;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);
  public static Gamepad driverGamepad = new Gamepad(0);
  public static Gamepad operatorGamepad = new Gamepad(1);

  public static int GO_IN =Gamepad.button_R_Shoulder;
  public static int GO_OUT =Gamepad.button_L_Shoulder;
 



  public static Button goInButton = new JoystickButton(operatorGamepad, GO_IN);
  public static Button goOutButton = new JoystickButton(operatorGamepad, GO_OUT);
   

  public OI() {
    goInButton.whenPressed(new MoveIn());
    goOutButton.whenPressed(new MoveOut());
  }
  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new MoveIn());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new MoveIn());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new MoveIn());
}
