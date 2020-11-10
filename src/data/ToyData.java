package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        

        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        parcels[0] = new Parcel(23, ParcelStatus.DELIVERED, new Location(14, 25));
        parcels[1] = new Parcel(12, ParcelStatus.READY_TO_SHIP, new Location(5, 12));
        parcels[2] = new Parcel(32, ParcelStatus.SHIPPING, new Location(63, 35));
        parcels[3] = new Parcel(15, ParcelStatus.READY_TO_SHIP, new Location(15, 26));
        parcels[4] = new Parcel(36, ParcelStatus.DELIVERED, new Location(18, 95));
        parcels[5] = new Parcel(65, ParcelStatus.SHIPPING, new Location(13, 59));
        parcels[6] = new Parcel(50, ParcelStatus.DELIVERED, new Location(23, 25));
        parcels[7] = new Parcel(28, ParcelStatus.READY_TO_SHIP, new Location(65, 85));
        parcels[8] = new Parcel(29, ParcelStatus.DELIVERED, new Location(34, 27));
        parcels[9] = new Parcel(73, ParcelStatus.SHIPPING, new Location(27, 36));
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
