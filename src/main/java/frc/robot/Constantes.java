// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constantes {

  public static final class nerfs {
    public static final double nerfVelocidad = 0.6; //Un nerf para la velocidad del chasis, puede ir de 0 a 1. 1 es lo más rapido y 0 lo para por completo. 
    public static final double correcionDireccion = 0.95; //Un nerf para el lado izquierdo del chasis y que avance en linea recta
    public static final double nerfGiro = 0.5; // Un nerf especifico para que el giro no sea tan rápido
    public static final double modoDos = 0.3; //Un nerf a la velocidad cuando se entra al modo 2 de conducción lenta, 1 es muy rapido y 0 es stop
    //MOVIMIENTO DEL Marco
    public static final double potenciaMarco = 0.5;
    public static final double potenciaCadena = 0.5;

  }
  public static final class ajustes {
    public static final double encoderChasisMetros = 0.04517; // Factor de conversion de la posición del encoder a metros, si lo suben el robot se mueve menos en autonomo, si lo bajan se mueve mas
    public static final double encoderChasisGrados = 8.4; // Factor de conversion de la posición del encoder a grados en la funcion giro, si lo suben el robot se mueve menos en autonomo, si lo bajan se mueve mas
    public static final double encoderMarcoGrados = 1.5; // no funciona ahora
    public static final double encoderCadenaMetros = 0.05; // si aumentas se mueve menos
    public static final double encoderGarraVueltas = 0.1591;  //si aumentas gira menos
  }
    public static final class motores {
      public static final double kLeftDriveSpeed = .5; // en vez del nerf podemos usar la velocidad como tal 1=100% y 0 = %
      public static final double kRightDriveSpeed = .5;
      public static final int CanMarco = 9;
      public static final int CanIntakeIz =5;
      public static final int CanIntakeDer =6;

    }

    public static final class MarcoCons{
      public static final int CanMarco = 9;
      public static final double AnguloLimite = 90.0;
      public static final double VelocidadMarco = 0.7;
      public static final double encoderMarcoGrados = 1.5;
    }
  

  public static final class controles {
    public static final int puertoChasis = 0; //no tiene marca roja de TK, controla el chasis
    public static final int puertoMecanismos = 1; //controla la garra

  }

  public static final class solenoides {

    public static final int Solenoide_Deploy = 0;
    public static final int Solenoide_React = 1;
  } 

}
