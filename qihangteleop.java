public class qihangteleop extends LinearOpMode{
   @Override
public void runOpMode(){
      QihangMain QihangDrivetrain = new QihangDriveMain(hardwareMap);
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
      intake.setpower(1);
   }
   else{
      intake.setpower(0);
      }
   if(gamepad.x){
      lbrake.setpower(0.4);
      rbrake.setpower(0.3);
   }else{
      lbrake.setpower(0.6);
      rbrake.setpower(0.5);
   }
   }

   }
}
