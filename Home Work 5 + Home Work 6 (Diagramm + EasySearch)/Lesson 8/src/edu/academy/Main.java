package edu.academy;

import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.SortedMap;


public class Main {
// EasySearch - первый поиск, не подходит по описанию "Easy". первая попытка.
// EasySearch 2 - второй тип поиска , на основе регулярных выражений
/*EasySearch2 cделал через Equals т.к. тогда ищет четко слова, через indexOf ищет именно вхождения
 *(т.е. при поиске слова "война" вхождением будет считаться "двойная")
 * но через indexOf получается полноценный поисковик)
 *
 *
 */
    public static void main(String[] args) {
        String filePath = "Война и мир.txt";
        Scanner scan = new Scanner(System.in);
        ReadFileToString readFileToString = new ReadFileToString();
        String text = readFileToString.readAllBytesJava7(filePath);
        EasySearch2 easySearch = new EasySearch2();
        String whatFind = scan.nextLine();
        System.out.println(easySearch.searchStringInText(whatFind,text));




    }
}
