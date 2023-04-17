package Vehicles;

public class GTI extends Vehicle{
    public void makeNoise(){
        super.makeNoise();
        System.out.println(this.getName() + "vroom-vroom");
    }
}
