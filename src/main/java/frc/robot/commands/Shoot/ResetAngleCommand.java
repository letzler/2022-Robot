/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Shoot;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ResetAngleCommand extends CommandBase {
  public ResetAngleCommand() {
   addRequirements(Robot.shooter);
  }

  // Called just before this Command runs the first time
  @Override
  public void initialize() {
    Robot.shooter.resetLimit();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  
  protected void interrupted() {
  }
}
