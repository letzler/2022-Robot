// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.PID_DrivetrainSubsystem;

public class Turn_to_Angle_Command extends CommandBase {
  /** TurnToAngle - pass on nothing to turn to limelight target, angle in degrees if wanted
   * @param angle angle at which to turn to
   */
  PID_DrivetrainSubsystem drive;
  double d_angle;
  boolean a;
  public Turn_to_Angle_Command(double angle, boolean auto) {
    drive = Robot.drive;
    d_angle = angle;
    addRequirements(drive);
    a = auto;
  }

  public Turn_to_Angle_Command(double angle) {
    drive = Robot.drive;
    d_angle = angle;
    addRequirements(drive);
    a = false;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  public Turn_to_Angle_Command() {
    drive = Robot.drive;
    if (NetworkTableInstance.getDefault().getTable("limelight").getEntry("tv").getDouble(0) == 1)
      d_angle = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tx").getDouble(0);
    else
      d_angle = 0;
    addRequirements(drive);
    a = false;
  }

  
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if (a == false)
      drive.angleReset(); // THIS MAKES IT SO THAT DURING AUTONOMOUS THE ANGLE WILL NOT RESET WHILE TURNING
    drive.gotoAngle(0, 0, d_angle, 1);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  }

  // Called once the command ends or is interrupted.
  // Stops robot if interupted.
  @Override
  public void end(boolean interrupted) {
    drive.PIDdisable();
    drive.drive(0, 0, 0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return drive.atAngle();
  }
}
