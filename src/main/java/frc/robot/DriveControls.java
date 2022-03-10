/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
/**
 * Custom drive controls class to organize all the driver buttons and stick input
 */
public class DriveControls {
  
  private final Joystick joystick1 = new Joystick(0);
  private final Joystick joystick2 = new Joystick(1);
  private final Joystick joystick3 = new Joystick(2);

  public final JoystickButton slowDriveMode = new JoystickButton(joystick1, 1);
  public final JoystickButton fastDriveMode = new JoystickButton(joystick1, 2);
  
  public double getForward() { return -joystick1.getRawAxis(1); }
  public double getStrafe() { return joystick1.getRawAxis(0); }
  public double getYaw() { return joystick2.getRawAxis(0); }
  public double getElevatorAxis() { return joystick3.getRawAxis(1); }

  public final JoystickButton elevatorState = new JoystickButton(joystick3, 3);
}