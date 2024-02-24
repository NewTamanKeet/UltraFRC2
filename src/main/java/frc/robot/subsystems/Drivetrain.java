// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import frc.robot.Constantes;
import frc.robot.Robot;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Timer;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */

  public CANSparkMax DriveR1 = new CANSparkMax(1, MotorType.kBrushless);
  public CANSparkMax DriveR2 = new CANSparkMax(3, MotorType.kBrushless);
  public CANSparkMax DriveL1 = new CANSparkMax(4, MotorType.kBrushless);
  public CANSparkMax DriveL2 = new CANSparkMax(2, MotorType.kBrushless);

  private final DifferentialDrive drive = new DifferentialDrive(DriveL1, DriveR1);

  public double treshold = 0;
  public Timer timer;
  RelativeEncoder EncoderL = DriveL1.getEncoder();
  RelativeEncoder EncoderR = DriveR1.getEncoder();
  RelativeEncoder EncoderL2 = DriveL2.getEncoder();
  RelativeEncoder EncoderR2 = DriveR2.getEncoder();

  boolean switcher = true;
  double encoderConversionMeters = Constantes.ajustes.encoderChasisMetros;
  double encoderConversionGiro = Constantes.ajustes.encoderChasisGrados;


  public void encoderReset(){
    DriveL1.restoreFactoryDefaults();
    DriveR1.restoreFactoryDefaults();
    DriveL2.restoreFactoryDefaults();
    DriveR2.restoreFactoryDefaults();
}
   /*public void drivemode(){

        if ((Robot.control.readPS4Buttons(8)) ) {
            switcher = false;
            System.out.print("cambio de modo de conducción a lento");
        }
        else if (Robot.control.readPS4Buttons(7)){
            switcher = true;
            System.out.print("cambio de modo de conducción a ràpido :)");
        }
       
      


        if (switcher){
            test();
            ButtonDrive();
        }
        else {
            UlisesDrive();
            ButtonDrive();
        }
 
        if(Robot.control.readPS4Buttons(Constantes.XB_B_A)){
            DriveL1.set(0);
            DriveL2.set(0);
            DriveR1.set(0);
            DriveR2.set(0);
        }
    }
   public void Drive (double left, double right) {
    drive.tankDrive(left, right);
    drive.setMaxOutput(1);
    drive.setSafetyEnabled(false);
    
  } */
  public void Drive (double left, double right) {
    drive.tankDrive(left, right);
    drive.setMaxOutput(1);
    drive.setSafetyEnabled(false);
    
  }
  public void tankDrive(double left, double right) {
    drive.tankDrive(Constantes.motores.kLeftDriveSpeed, Constantes.motores.kRightDriveSpeed);

  }
  



  public Drivetrain() {
    DriveL2.follow(DriveL1);
    DriveR2.follow(DriveR1);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    drive.tankDrive(0, 0);
  }
}