

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bike[] bikes = new Bike[3];
        Bike bike = new Bike();


        int i = 0;
        do {
            bike = Bike.createBike();
            if (!Bike.check(bikes, bike)) {
                bikes[i] = bike;
                i++;
            }
        } while (i < bikes.length);


    }


}
