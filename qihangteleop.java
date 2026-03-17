public class QihangTeleOp extends LinearOpMode{
   @Override
public void runOpMode(){
      QihangMain QihangDrivetrain = new QihangMain(hardwareMap);
   waitForStart();
   // Put run blocks here

while (opModeIsActive()) {
   // Put loop blocks here
      /*if(gamepad1.a){
      }
      if(gamepad1.x){
      }
      */
      QihangDrivetrain.setMotorPower(-gamepad1.right_stick_y, gamepad1.right_stick_x,gamepad1.left_stick_x);
   if(gamepad1.a){
      intake.setPower(1);
   }
   else{
      intake.setPower(0);
      }
   if(gamepad.x){
      lbrake.setPower(0.4);
      rbrake.setPower(0.3);
   }else{
      lbrake.setPower(0.6);
      rbrake.setPower(0.5);
   }
   }

   }
}
