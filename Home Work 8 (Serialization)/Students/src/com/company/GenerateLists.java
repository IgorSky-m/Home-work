package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateLists {
    private List<String> listMaleNames = new ArrayList<>();
    private List<String> listFemaleNames = new ArrayList<>();
    private List<String> listSurnames = new ArrayList<>();
    private List<String> listSpecs = new ArrayList<>();
    private String pathMaleNames = "NameMale.txt";
    private String pathFemaleNames = "NameFemale.txt";
    private String pathSurnames = "Surname.txt";
    private String pathSpec = "specializations.txt";
    private Random random = new Random();


    public void initializeLists() throws IOException {
        String readLine;
        if (listMaleNames.isEmpty() == true) {
            try (BufferedReader readMaleNames = new BufferedReader(new FileReader(pathMaleNames))) {
                while ((readLine = readMaleNames.readLine()) != null) {
                    listMaleNames.add(readLine);
                }
            }
        }
        if (listFemaleNames.isEmpty() == true) {
            try (BufferedReader readFemaleNames = new BufferedReader(new FileReader(pathFemaleNames))) {
                while ((readLine = readFemaleNames.readLine()) != null) {
                    listFemaleNames.add(readLine);
                }
            }
        }
        if (listSurnames.isEmpty() == true) {
            try (BufferedReader readSurnames = new BufferedReader(new FileReader(pathSurnames))) {
                while ((readLine = readSurnames.readLine()) != null) {
                    listSurnames.add(readLine);
                }
            }
        }

        if (listSpecs.isEmpty() == true) {
            try (BufferedReader readSpec = new BufferedReader(new FileReader(pathSpec))) {
                while ((readLine = readSpec.readLine()) != null) {
                    listSpecs.add(readLine);
                }
            }
        }
    }



    public void setPathMaleNames(String pathMaleNames) {
        this.pathMaleNames = pathMaleNames;
    }

    public void setPathFemaleNames(String pathFemaleNames) {
        this.pathFemaleNames = pathFemaleNames;
    }

    public void setPathSurnames(String pathSurnames) {
        this.pathSurnames = pathSurnames;
    }

    public void setPathSpec(String pathSpec) {
        this.pathSpec = pathSpec;
    }

    public String getPathMaleNames() {
        return pathMaleNames;
    }

    public String getPathFemaleNames() {
        return pathFemaleNames;
    }

    public String getPathSurnames() {
        return pathSurnames;
    }

    public String getPathSpec() {
        return pathSpec;
    }

    public String getRandomMaleName() {
        return listMaleNames.get(Math.abs(random.nextInt(listMaleNames.size())));
    }

    public String getRandomFemaleName() {
        return listFemaleNames.get(Math.abs(random.nextInt(listFemaleNames.size())));
    }

    public String getRandomSurname() {
        return listSurnames.get(Math.abs(random.nextInt(listSurnames.size())));
    }

    public String getRandomSpec() {
        return listSpecs.get(Math.abs(random.nextInt(listSpecs.size())));
    }

}




