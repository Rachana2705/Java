class BicycleStarter{
public static void main(String[] values){

new Bicycle();

Bicycle bicycle1 = new Bicycle("red",8500.f);

bicycle1.brake();

bicycle1.move();

bicycle1.displayDetails();

System.out.println("Exit main");

}
}