package org.firstinspires.ftc.teamcode.TeleOperated;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.MecanumSubsystem;

@TeleOp(name = "TeleOperatedMain", group = "OpMode")
public class TeleOperatedMain extends OpMode {

    MecanumSubsystem mecanumSubsystem;

    @Override
    public void init() {
        telemetry.addData("Startup", "Initializing Subsystems...");
        telemetry.update();

        mecanumSubsystem = new MecanumSubsystem(hardwareMap);

        telemetry.addData("Startup", "Initialization Complete!");
        telemetry.update();
    }

    @Override
    public void loop() {

        double forward = -gamepad1.left_stick_y;
        double strafe = -gamepad1.left_stick_x;
        double turn = -gamepad1.right_stick_x;

        mecanumSubsystem.TeleOperatedDrive(forward, strafe, turn);

        telemetry.update();
    }
}
