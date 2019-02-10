

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Bike bike1 = new Bike();
        Bike bike2 = new Bike();
        Bike bike3 = new Bike();


        System.out.println("Podaj nazwę: ");
        String name1 = scanner.nextLine();

        System.out.println("Podaj liczbę kół: ");
        String wheels1 = scanner.nextLine();

        bike1 = new Bike(name1, wheels1);

        do {
            System.out.println("2: Podaj nazwę: ");
            String name2 = scanner.nextLine();

            System.out.println("2: Podaj liczbę kół: ");
            String wheels2 = scanner.nextLine();

            bike2 = new Bike(name2, wheels2);

            if (bike2.equals(bike1)){
                System.out.println("Błąd. Powtórz: ");
            }
        } while (bike2.equals(bike1));

        do {
            System.out.println("3: Podaj nazwę: ");
            String name3 = scanner.nextLine();

            System.out.println("3: Podaj liczbę kół: ");
            String wheels3 = scanner.nextLine();

            bike3 = new Bike(name3, wheels3);

            if ((bike3.equals(bike1) || bike3.equals(bike2)))
                System.out.println("Błąd. Powtórz: ");

        } while (bike3.equals(bike1) || bike3.equals(bike2));

        Bike[] bikes = new Bike[3];
        bikes[0] = bike1;
        bikes[1] = bike2;
        bikes[2] = bike3;

    }
    }