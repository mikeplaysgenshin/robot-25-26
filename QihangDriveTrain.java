import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoImplEx;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.PwmControl;
public class QihangDriveTrain{
      DcMotor frontLeft;
      DcMotor frontRight;
      DcMotor backLeft;
      DcMotor backRight;
      DcMotor intake;
      ServoImplEx drumServo;
      Servo flickServo;
      Servo lbrake;
      Servo rbrake;
      NormalizedColorSensor intakeColorSensor;
    public QihangDriveTrain(HardwareMap hardwareMap) {
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
      intake=hardwareMap.get(DcMotor.class, "intake");
      drumServo = hardwareMap.get(ServoImplEx.class, "drumServo");
      drumServo.setPwmRange(new PwmControl.PwmRange(500, 2500));
      flickServo = hardwareMap.get(Servo.class, "flick");
      intakeColorSensor = hardwareMap.get(NormalizedColorSensor.class, "intakeColorSensor");
      intakeColorSensor.setGain(15);
      lbrake=hardwareMap.get(Servo.class,"lBrake");
      rbrake=hardwareMap.get(Servo.class,"rBrake");
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
public enum BallState{
      Purple,
      Green,
      Empty
}
public void update(){
   boolean ballDetected = false;
}

   }
}
