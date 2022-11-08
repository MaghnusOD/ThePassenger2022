package ie.atu;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ThePassenger2022 passenger = new ThePassenger2022();

        System.out.println("=============================================================" +
            "\nPlease correctly fill out the below questions: \n\n" +
            "1. Title\t(Mr, Mrs or Ms)\n" +
            "2. Name\t(Minimum of 3 characters) \n" +
            "3. ID\t(Minimum of 10 characters)\n" +
            "4. Phone number\t(Minimum of 7 digits)\n" +
            "5. Age\t(Under 16 too young to fly)\n" +
            "=============================================================");

        System.out.println("Please enter your name (minimum of 3 characters): ");
        passenger.usr_name = sc.nextLine();

        System.out.println("Please enter your title (Mr, Mrs, Ms): ");
        passenger.usr_title = sc.nextLine();

        System.out.println("Please enter your ID (minimum of 10 characters): ");
        passenger.usr_id = sc.nextLine();

        System.out.println("Please enter your phone number (minimum of 7 characters): ");
        passenger.usr_phone_num = sc.nextInt();

        System.out.println("Please enter your age (persons below 16 not allowed to fly): ");
        passenger.usr_age = sc.nextInt();

        System.out.println("\n" + passenger.toString());

    }
}
