package javaPractice;

public class Bmw extends Car{

    @Override
    public void engine(){
        System.out.println("Bmw Engine");
    }
    @Override
    public void wheels(){
        System.out.println("Bmw wheels");
    }

    public static void main(String[] args) {
        Car car = new Bmw();
        car.engine();
        car.wheels();
    }
}
