package ProjectCode;


import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        Scanner hey = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = hey.nextLine();

        System.out.println("Please enter your birth date: ");
        String date = hey.next();

        System.out.println("please enter your birth month:");
        String month = hey.next();

        System.out.println("please enter your birth year:");
        String year = hey.next();

        System.out.println("please enter current year:");
        String cYear = hey.next();

        int bDate = Integer.parseInt(date);
        int bMonth = Integer.parseInt(month);
        int bYear = Integer.parseInt(year);
        int ccYear = Integer.parseInt(cYear);

        int age;

        age = ccYear - bYear;
        int totalMonth = 12;
        int yourMonth = totalMonth - bMonth;

        System.out.println(" Hi " + name + " your are " + age + " years " + yourMonth + " months old ");
    }

    {
        System.out.println("");
    }
}
