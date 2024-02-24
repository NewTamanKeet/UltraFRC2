package frc.robot.commands;
import frc.robot.Constantes;
import frc.robot.subsystems.Marco;

import edu.wpi.first.wpilibj2.command.Command;


public class MarcoEncoderCommand extends Command {
    private Marco m_Marco;
    private boolean done = false;
    /** 
  * Creates a new intake command 
  * 
  * @param marcoSubsystem - the intake subsystem
  */ 
    public MarcoEncoderCommand (Marco marcoSubsystem){
        this.m_Marco = marcoSubsystem;
        addRequirements(m_Marco);
    }
    @Override
    public void initialize()
    {
        done = true;
    }
    @Override
  public boolean isFinished()
  {
    return done;
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
}