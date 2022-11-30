import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the year you were born: ");
        int birthYear = sc.nextInt();
        System.out.println("Month");
        int birthMonth = sc.nextInt();
        System.out.println("Day");
        int birthDay = sc.nextInt();

        LocalDate today = LocalDate.now(); // imports the day now
        LocalDate bod = LocalDate.of(birthYear, birthMonth, birthDay); // birth of date
        int age = Period.between(bod, today).getYears(); // Period between will count years in between today and BOD
        System.out.println(age); // age will print users age

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Please input the age above for verification! ");
        int ageEligible = sc.nextInt(); //User will input the age we got from previous print out statement

        if (ageEligible>=21){
            System.out.println("Age meets requirements. You are eligible to get alcohol!");
        } else if (ageEligible<21){
            System.out.println("Underage! You can't purchase alcohol! ");
        }
    }
}