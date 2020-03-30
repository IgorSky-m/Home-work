package edu.academy;

public enum ECountry implements ICountryInfo {
    RUSSIA(17075200,143420300), CANADA(9976140,32805000),
    USA(9629091,295734100), CHINA(9596960,1306313800),
    BRAZIL(8511965, 186112800), AUSTRALIA(7686850,20090400),
    INDIA(3287590,1080264400),ARGENTINA(2766890,395379000),
    KAZAKHSTAN(2717300,15185000),SUDAN(2505810,40187500);

    private int areaSquareKilometers;
    private int population;

    ECountry (int areaSquareKilometers, int population) {
        this.areaSquareKilometers = areaSquareKilometers;
        this.population = population;
    }

    public static ECountry valueOfIgnoreCase (String countryName) {
        return valueOf(countryName.toUpperCase());
    }


    @Override
    public int getCountryArea() {
        return areaSquareKilometers;
    }

    @Override
    public int getCountryPopulation() {
        return population;
    }

    @Override
    public int[] getCountryPopulationAndArea() {
        int[] areaAndPopulation = {areaSquareKilometers,population};
        return areaAndPopulation;
    }
}