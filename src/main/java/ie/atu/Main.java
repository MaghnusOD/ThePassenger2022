package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        List<ThePassenger2022> new_passenger = new ArrayList<>();
        ThePassenger2022 passenger = new ThePassenger2022("Title", "Name", "id", 123456789l, 21);



        new_passenger.add(new ThePassenger2022("Mr", "gon", "12345wertyusasd", 123456789l, 12));
        new_passenger.add(new ThePassenger2022("Ms", "lilian", "sdfg57h13", 456789012l, 31));
        new_passenger.add(new ThePassenger2022("mrs", "lilith", "jk34yoisdfq1", 1426475874l, 40));


        for (ThePassenger2022 nu_pas: new_passenger
             ) {
            System.out.println(nu_pas.toString());
        }
    }
}
