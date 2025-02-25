package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class PracticeQuiz extends OpMode {
    DcMotor leftFront, leftBack, rightFront, rightBack;

    public void init(){
        leftFront = hardwareMap.dcMotor.get("front_left_motor");
        leftBack = hardwareMap.dcMotor.get("back_left_motor");
        rightFront = hardwareMap.dcMotor.get("front_right_motor");
        rightBack = hardwareMap.dcMotor.get("back_right_motor");
        leftFront.setDirection(DcMotor.Direction.REVERSE);
        leftBack.setDirection(DcMotor.Direction.REVERSE);
    }

    public void loop(){

    }
}
