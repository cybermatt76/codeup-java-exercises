package Vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        GTI gti = new GTI();
        gti.setName("GTI");
        gti.makeNoise();
        Challenger challenger = new Challenger();
        challenger.setName("Challenger");
        challenger.makeNoise();
        Mustang mustang = new Mustang();
        mustang.setName("Mustang");
        mustang.makeNoise();
    }
}
