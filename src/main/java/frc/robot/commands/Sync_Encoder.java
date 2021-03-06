// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class Sync_Encoder extends CommandBase {
  /** Creates a new Sync_Encoder. */
  public Sync_Encoder() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Robot.drive.frontRight.setEncoder((int)Robot.drive.frontRight.getRawAngleEncoder()+RobotMap.RightFrontEncoderOffset);
    Robot.drive.frontLeft.setEncoder((int)Robot.drive.frontLeft.getRawAngleEncoder()+RobotMap.LeftFrontEncoderOffset);
    Robot.drive.backRight.setEncoder((int)Robot.drive.backRight.getRawAngleEncoder()+RobotMap.RightBackEncoderOffset);
    Robot.drive.backLeft.setEncoder((int)Robot.drive.backLeft.getRawAngleEncoder()+RobotMap.LeftBackEncoderOffset);
    Robot.drive.frontLeft.fixOffset();
    Robot.drive.frontRight.fixOffset();
    Robot.drive.backLeft.fixOffset();
    Robot.drive.backRight.fixOffset();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
