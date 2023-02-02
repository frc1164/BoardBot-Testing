// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;
import frc.robot.Constants.BoardConstants;


public class BoardBot extends SubsystemBase {
  private final CANSparkMax StickerMotor;
  private final CANSparkMax NormalMotor;
  private final RelativeEncoder StickerEncoder;
  private final RelativeEncoder NormalEncoder;
  /** Creates a new BoardBot. */
  public BoardBot() {
    StickerMotor = new CANSparkMax(BoardConstants.kStickerMotor, MotorType.kBrushless);
    StickerEncoder = StickerMotor.getEncoder();

    NormalMotor = new CANSparkMax (BoardConstants.kNormalMotor, MotorType.kBrushless);
    NormalEncoder = NormalMotor.getEncoder();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
