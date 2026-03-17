import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
public class QihangMain{
      DcMotor frontLeft;
      DcMotor frontRight;
      DcMotor backLeft;
      DcMotor backRight;
    public QihangMain(HardwareMap hardwareMap) {
      frontLeft=hardwareMap.get(DcMotor.class, "fl");
      frontRight=hardwareMap.get(DcMotor.class, "fr");
      backLeft=hardwareMap.get(DcMotor.class, "bl");
      backRight=hardwareMap.get(DcMotor.class, "br");
      frontLeft.setDirection(DcMotor.Direction.REVERSE);
      backLeft.setDirection(DcMotor.Direction.REVERSE);
      frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
      frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
      backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
      backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

   }

      public void setMotorPower(double yPower, double xPower, double rPower){
         double flPower = yPower + xPower + rPower;
         double frPower = yPower - xPower - rPower;
         double blPower = yPower - xPower + rPower;
         double brPower = yPower + xPower - rPower;
         frontLeft.setPower(flPower);
         frontRight.setPower(frPower);
         backLeft.setPower(blPower);
         backRight.setPower(brPower);
      }
public void setDrumPostition(double position, double power){
   
}
public enum ballState(){
     Purple, Green,Empty
}
public void update(){
   boolean ballDetected = false;
}
  @Override
public void runOpMode(){
   qihangMain qihangMain = new qihangMain(hardwareMap);
   waitForStart();
   // Put run blocks here

while (opModeIsActive()) {
   // Put loop blocks here
      /*if(gamepad1.a){
      }
      if(gamepad1.x){
      }
      */
      qihangMain.setMotorPower(-gamepad1.right_stick_y, gamepad1.right_stick_x,gamepad1.left_stick_x);
   }
   }
}
