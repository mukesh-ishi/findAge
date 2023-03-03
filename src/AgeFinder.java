import org.apache.log4j.Logger;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeFinder {

    public static int calculateAge(LocalDate dob) {

        LocalDate curDate = LocalDate.now();
        //calculates the amount of year between two dates and returns the years
        if ((dob != null) && (curDate != null)) {
            return Period.between(dob, curDate).getYears();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter date of birth in YYYY-MM-DD format: ");
        Scanner scanner = new Scanner(System.in);


        String dobIn = scanner.nextLine();

        LocalDate dob = LocalDate.parse(dobIn);

        System.out.println("Your age is " + calculateAge(dob));
    }

}
