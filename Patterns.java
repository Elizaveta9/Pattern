package com.company;

interface Transport {
    void deliver();
}

abstract class Logistic {
    abstract Transport createTransport();
}

class SeaLogistic extends Logistic {
    public Transport createTransport() {
        return new SeaTransport();
    }
}

class RoadLogistic extends Logistic {
    public Transport createTransport() {
        return new RoadTransport();
    }
}

class AirLogistic extends Logistic {
    public Transport createTransport() {
        return new AirTransport();
    }
}

class SeaTransport implements Transport {
    public void deliver() {
        System.out.println("Доставлено по морю");
    }
}

class RoadTransport implements Transport {
    public void deliver() {
        System.out.println("Доставлено по дороге");
    }
}

class AirTransport implements Transport {
    public void deliver() {
        System.out.println("Доставлено по воздуху");
    }
}


public class Patterns {
    public static void main(String[] args) {
        Logistic seaLogistic = new SeaLogistic();
        Logistic roadLogistic = new RoadLogistic();
        Logistic airLogistic = new AirLogistic();

        Transport ship = seaLogistic.createTransport();
        Transport car = roadLogistic.createTransport();
        Transport plane = airLogistic.createTransport();

        ship.deliver();
        car.deliver();
        plane.deliver();
    }
}