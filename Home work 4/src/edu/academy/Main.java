package edu.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ECountry country = ECountry.valueOfIgnoreCase(scanner.nextLine());
        ECountry country2 = ECountry.USA;
        System.out.println(country == country2);
        CountryAreaComparator countryAreaComparator = new CountryAreaComparator();
        System.out.println(countryAreaComparator.compare(country,country2));



    }
}
