package PrimitiveDataTypes;

public class MotorBike {

    private int speed;
    MotorBike(){
        this(5);
    }
    MotorBike(int speed){
        this.speed = speed;
    }
    public void start(){
        System.out.println("Bike started");
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0) {
            this.speed = speed;
        }
    }

    public void increaseSpeed(int speed){
        setSpeed(this.speed + speed);
    }

    public void decreaseSpeed(int speed){
        setSpeed(this.speed - speed);
    }

}
