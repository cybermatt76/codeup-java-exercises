package Vehicles;

import java.util.ArrayList;

import java.util.ArrayList;

public class TransportExample {
    public static void main(String[] args) {
        Transport transport1 = new Transport("Car");
        Transport transport2 = new Transport("Bus");
        Transport transport3 = new Transport("Bicycle");

        ArrayList<Transport> transportList = new ArrayList<Transport>();

        transportList.add(transport1);
        transportList.add(transport2);
        transportList.add(transport3);

        for (Transport transport : transportList) {
            System.out.println(transport.getName());
            transport.makeNoise();
        }

        System.out.println("Size of list: " + transportList.size());

        Transport transport2Info = transportList.get(1);
        System.out.println("Information about transport 2: " + transport2Info.toString());
    }
}

class Transport {
    private String name;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void makeNoise() {
        if (this.name.equals("Car")) {
            System.out.println("Vroom!");
        } else if (this.name.equals("Bus")) {
            System.out.println("Honk!");
        } else if (this.name.equals("Bicycle")) {
            System.out.println("Ring ring!");
        }
    }

    @Override
    public String toString() {
        return "Transport name: " + this.name;
    }
}
