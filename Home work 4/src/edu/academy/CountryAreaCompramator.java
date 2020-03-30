package edu.academy;

import java.util.Comparator;

 class CountryAreaComparator implements Comparator<ECountry> {
    public int compare (ECountry country1, ECountry country2) {
        if (country1.getCountryArea() == country2.getCountryArea()) {
            return 0;
        } else if (country1.getCountryArea() < country2.getCountryArea()) {
            return -1;
        } else return 1;
    }
}
