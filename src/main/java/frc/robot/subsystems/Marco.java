package frc.robot.subsystems;
import frc.robot.Constantes;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Marco extends SubsystemBase {
  private final CANSparkMax motorMarco = new CANSparkMax(Constantes.motores.CanMarco, MotorType.kBrushless);
  RelativeEncoder EncoderMarco = motorMarco.getEncoder();
  double pMarco = EncoderMarco.getPosition() * Constantes.ajustes.encoderMarcoGrados; 
  double pMarco0 = EncoderMarco.getPosition() * Constantes.ajustes.encoderMarcoGrados;

    public Marco() {
    CommandScheduler.getInstance().registerSubsystem(this);
  }

  public void stopMotors() {
    motorMarco.set(0);
  }

  @Override
  public void periodic() {
  }

  /**
   *  This method will be called once per scheduler run during simulation
   */
  @Override
  public void simulationPeriodic() {
  }

}


  
  /*public void MarcoMover(){
    int i=24000;
    double pMarco = EncoderMarco.getPosition() * Constantes.ajustes.encoderMarcoGrados; 
    double pMarco0 = EncoderMarco.getPosition() * Constantes.ajustes.encoderMarcoGrados;

    System.out.println("  right "+ pMarco);
    System.out.println("  EncoderR "+ EncoderMarco.getPosition());

    while( (pMarco0 - Constantes.MarcoCons.AnguloLimite) < pMarco && 0 < Constantes.MarcoCons.VelocidadMarco ){
      if(i==24000){
        System.out.println("  pMarco "+ pMarco);
        System.out.println("  EncoderR "+ EncoderMarco.getPosition());
        i=0;
      }
        motorMarco.set(-Constantes.MarcoCons.VelocidadMarco);
        pMarco = EncoderMarco.getPosition() * Constantes.ajustes.encoderMarcoGrados; 
        i=i+1;
    }

    while(  pMarco < (Constantes.MarcoCons.AnguloLimite + pMarco0)  &&   Constantes.MarcoCons.VelocidadMarco< 0){
      if(i==24000){
        System.out.println("  right " + pMarco);
        System.out.println("  EncoderR "+EncoderMarco.getPosition());
        i=0;
      }
      motorMarco.set(-Constantes.MarcoCons.VelocidadMarco);
      motorMarco.set(0);
      pMarco = EncoderMarco.getPosition() * Constantes.ajustes.encoderMarcoGrados; 
            i=i+1;
    }
        motorMarco.set(0);
      System.out.println("  right "+ pMarco);
      System.out.println("  EncoderR "+ EncoderMarco.getPosition());
      //System.out.println("X: " + positionX + " - Y: " + positionY + " - A: " + angle);
      //System.out.println("leftL: " + left + "  rightR: " + right + "  angle: " + angle);
    }
  }

*/

