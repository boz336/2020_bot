/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Spark;

@SuppressWarnings("deprecation")

  public class shooterMotorsSubsystem extends SubsystemBase{
  
    Spark motor;

  
 public shooterMotorsSubsystem() 
  {      
  
  
  Spark leftmotorshooter = new Spark(); //dont' know the ports yet
  Spark rightmotorshooter = new Spark(); 


  }
      
public void moveForward()
{
    motor.setSpeed(1);
}

public void moveBackward()
{
    motor.setSpeed(-1);
}
}
