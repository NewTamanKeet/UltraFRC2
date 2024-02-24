// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import frc.robot.Constantes.nerfs;
import frc.robot.Constantes.controles;
//import frc.robot.commands.Autos;

import frc.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj2.command.sysid.SysIdRoutine;
import edu.wpi.first.wpilibj.Joystick;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {//@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {


  // The robot's subsystems and commands are defined here...
  //private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final Drivetrain driveTrain = new Drivetrain();
 /* private final SparkDrive m_SparkDrive = new SparkDrive();
  private final Launcher m_LauncherSubsystem = new Launcher();
  private final Intake m_IntakeSubsystem = new Intake();
  private final Neumatica m_NeumaticaSubsystem = new Neumatica();
  private final Marco m_MarcoSubsystem = new Marco(); */

  CommandPS4Controller m_Driver = new CommandPS4Controller(controles.puertoChasis);
  CommandPS4Controller m_Mecanismo = new CommandPS4Controller(controles.puertoMecanismos);


  // Replace with CommandPS4Controller or CommandJoystick if needed
  //private final CommandXboxController m_driverController =
      //new CommandXboxController(OperatorConstants.kDriverControllerPort);
  
    Joystick DriverJoy = new Joystick(Constantes.controles.puertoChasis);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    driveTrain.setDefaultCommand(
      Commands.run(() -> driveTrain.Drive((DriverJoy.getX()*Constantes.nerfs.nerfGiro), DriverJoy.getY()), driveTrain)); // 'X' es giro 'Y' es adelante/atrás
    configureBindings();
    
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitraryhttps://github.com/FIRSTTeam102/robot2024/tree/main/src/main/java/frc/robot
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGecnericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {

   
    

   
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
   // new Trigger(m_exampleSubsystem::exampleCondition)
     //   .onTrue(new DriveTrain(m_exampleSubsystem));

    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
  //  m_driverController.b().whileTrue(m_exampleSubsystem.exampleMethodCommand());
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
 // public Command getAutonomousCommand() {
    // An example command will be run in autonomous
   // return Autos.exampleAuto(m_exampleSubsystem);
  //}
  private Command sysIdTestSet(SysIdRoutine routine) {
		return Commands.sequence(
			routine.quasistatic(SysIdRoutine.Direction.kForward),
			Commands.waitSeconds(2),
			routine.quasistatic(SysIdRoutine.Direction.kReverse),
			Commands.waitSeconds(2),
			routine.dynamic(SysIdRoutine.Direction.kForward),
			Commands.waitSeconds(2),
			routine.dynamic(SysIdRoutine.Direction.kReverse));
	}
  
}
