package edu.academy;

import java.util.Scanner;


public class Main {
// EasySearch - первый поиск, не подходит по описанию "Easy". первая попытка.
// EasySearch 2 - второй тип поиска , на основе регулярных выражений и euals. - После консультации для полного соответствия домашке поменял equals на indexOf
// EasySearchRexExp - На основе RexExp и Stream?
/*EasySearch2 изначально делал через Equals т.к. тогда ищет четко слова, через indexOf ищет именно вхождения
 *(т.е. при поиске слова "война" вхождением будет считаться "двойная")
 * но по идее через indexOf получается полноценный поисковик
 *
 *
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ReadFileToString readFileToString = new ReadFileToString();
        String filePath = "Война и мир.txt", text = readFileToString.readAllBytesJava7(filePath), whatFind = scan.nextLine();

        //EasySearch IndexOf
        ISearchEngine easySearchIndexOf = new EasySearchIndexOf();
        System.out.println(easySearchIndexOf.searchStringInText(whatFind,text));
        //EasySearch RegExp
        ISearchEngine easySearchRegExp = new EasySearchRegExp();
        System.out.println(easySearchRegExp.searchStringInText(whatFind,text));
        //EasySearch Stream
        ISearchEngine easySearchStream = new EasySearchStream();
        System.out.println(easySearchStream.searchStringInText(whatFind,text));
    }
}
