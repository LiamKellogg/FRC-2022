/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SwerveSubsystem;

/**
 * An example command that uses an example subsystem.
 */
public class AutoDriveCommandMid extends CommandBase {
  private SwerveSubsystem robotDrive;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public AutoDriveCommandMid(SwerveSubsystem swerve) {
    robotDrive = swerve;
  }

  @Override
  public void initialize() {
    robotDrive.initDrive();
  }

  @Override
  public void execute() {
    robotDrive.driveSetDistance(1.0);
  }

  @Override
  public boolean isFinished() {
    return true;
  }
}