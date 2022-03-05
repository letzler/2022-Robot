package frc.robot;

import java.lang.Math;

import frc.robot.util.Gains;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  /* ---- Input device ID's ---- */

  public final static int joystickId = 0;
  public final static int joystick2Id = 1;
  public final static int joystick3Id = 2;

  /* ---- Talon CAN Bus ID's ---- */

  public final static int LeftFrontAngleMotorId = 20;
  public final static int LeftBackAngleMotorId = 29;
  public final static int RightFrontAngleMotorId = 31;
  public final static int RightBackAngleMotorId = 22;

  public final static int LeftFrontDriveMotorId = 23;
  public final static int LeftBackDriveMotorId = 27;
  public final static int RightFrontDriveMotorId = 28;
  public final static int RightBackDriveMotorId = 24;

  /* Placeholder Shooter IDs */
  public final static int anglemotor = 21;
  public final static int shootermotor = 33;
  public final static int shooterslave = 35; //CHANGE
  public final static int timingmotor = 26;

  public final static int shooterP = 45;
  public final static int shooterI = 0;
  public final static int shooterD = 0;

  /* Intake Motor ID Placeholder */
  
  public final static int intakemotor = 30; //CHANGE
  public final static int climbermotor = 36; //CHANGE
  public final static int intermediarymotor = 32; //CHANGE
  /* ---- Solenoid Channels ---- */

  /* ---- Analog Inputs ---- */

  public final static int LeftBackEncoderId = 0;
  public final static int LeftFrontEncoderId = 1;
  public final static int RightFrontEncoderId = 2;
  public final static int RightBackEncoderId = 3;

  public final static double RightFrontEncoderOffset = -.218; // original -.261
  public final static double LeftFrontEncoderOffset = -2.1933; //original -2.247
  public final static double RightBackEncoderOffset = 2.501; // original 2.427   2.501
  public final static double LeftBackEncoderOffset = 0.530; //original -.687    0.519

  /* ---- Size Constants ---- */
  public static final int kSlotIdx = 0;
  public static final int kPIDLoopIdx = 0;
  public static final int kTimeoutMs = 30;

  /* ---- PWM ---- */

  // Units don't matter as long as they are the same
  public final static double FrameWidth =  21;
  public final static double FrameLength = 24
  ;
  public final static double FrameDiagonal = Math.sqrt(FrameWidth * FrameWidth + FrameLength * FrameLength);

  /* ---- PID Tuning for Drivetrain ---- */

  public static double kP = 15.0;
  public static double kI = 0.0;
  public static double kD = 0.0;
  public static double kF = 0.0;
  public static int kIzone = 0;
  // public static double kPeakOutput = 1.0;

  public static boolean kSensorPhase = true;
  public static boolean kMotorInvert = false;

  public static final Gains legGains = new Gains(15, 0.0, 0.0, 0.2, 0, 1.0);
  public static final Gains aimGains = new Gains(15, 0.0, 0.0, 0.2, 0, 1.0);
  public static final Gains liftGains = new Gains(7, 0.0002, 0.0, 0.2, 0, 1.0);
  public static final Gains shooterGains = new Gains(4, 0, 0.0, 0.2, 0, 1.0);

  /* ---- Velocity and Acceleration for MotionMagic ---- */

  /* ---- Stage power for homing swerve modules ---- */

  public static final double s1Power = 0.5;
  public static final double s2Power = 0.4;

  /* ---- Encoder Counts Calculation ---- */

  public static final double encoderStepPerRev = 28;
  public static final double gearBox = 71;
  public static final double lastStep = 40 / 48.0;
  public static final double countPerHalfRevolution = encoderStepPerRev / 2 * gearBox * lastStep;

  /* ---- Debounce Timers ---- */

  public static final int DEBOUNCE = 100; // ms

  /* ---- Servo Inputs ---- */

  /* ---- Max and Mins ---- */

  /* ---- Turn Controller PID Tuning ---- */
  public static final double turnkP = 0.01;
  public static final double turnkI = 0.002;
  public static final double turnkD = 0.001;
  public static final double turnkF = 0.00;
  public static final double turnToleracne = 1.0f;

  /*--- Vision Constants ---*/
  public static final double goalHeightInches = 104.0;
  public static final double limelightLensHeightInches = 23.0;
  public static final double limelightMountAngleDegrees = 19.0;

}
