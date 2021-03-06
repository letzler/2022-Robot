// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.commandgroups;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.Turn_to_Angle_Command;
import frc.robot.commands.Shoot.AutoShootCommand;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class AutoShootCommandGroup extends SequentialCommandGroup {
  /** Creates a new AutoShootCommandGroup. */
  public AutoShootCommandGroup() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    if (NetworkTableInstance.getDefault().getTable("limelight").getEntry("tv").getDouble(0) == 1);
      addCommands(new Turn_to_Angle_Command(), new AutoShootCommand());
  }
}
