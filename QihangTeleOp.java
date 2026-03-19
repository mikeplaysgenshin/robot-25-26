@TeleOp
public class QihangTeleOp extends LinearOpMode{
   @Override
   QihangDriveTrain drivetrain;
public void runOpMode(){
   drivetrain = new QihangDriveTrain(hardwareMap);
   waitForStart();
   // Put run blocks here

while (opModeIsActive()) {
   // Put loop blocks here
      /*if(gamepad1.a){
      }
      if(gamepad1.x){
      }
      */
      drivetrain.setMotorPower(-gamepad1.right_stick_y, gamepad1.right_stick_x,gamepad1.left_stick_x);
   if(gamepad1.a){
      drivetrain.intake.setPower(1);
   }
   else{
      drivetrain.intake.setPower(0);
      }
   if(gamepad1.x){
      drivetrain.lbrake.setPower(0.4);
      drivetrain.rbrake.setPower(0.3);
   }else{
      drivetrain.lbrake.setPower(0.6);
      drivetrain.rbrake.setPower(0.5);
   }
   }

   }
}
