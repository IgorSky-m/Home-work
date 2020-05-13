package edu.academy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Reader {
    public static List<String> read  (String filePath) throws IOException {
        String readString;
        List<String> fileForRead = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                readString = reader.readLine();
                fileForRead.add(readString);
            }
        }

        return fileForRead;

    }

}
