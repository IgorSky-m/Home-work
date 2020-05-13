package edu.academy;

import edu.academy.Interfaces.IRanging;
import edu.academy.comparators.ComparatorMapValue;
import edu.academy.comparators.ComparatorUpperDomain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> urls = new ArrayList<>();
        boolean itsOk = false;
        String filePath = null;
        Scanner scan = new Scanner(System.in);
        filePath = "C:\\Users\\User\\Desktop\\LEARNING Java\\Benign_list_big_final.csv";
        List<UrlInfo> urlInfoList= new ArrayList<>();

        while (!itsOk) { // Читаем файл
            try {
                urls = Reader.read(filePath);
                itsOk = true;
            } catch (FileNotFoundException e) { //Тут можно сделать дополнительно defaultPath для резервного использования
                System.out.println("Ошибка, файл не найден. Введите путь к файлу заново: ");
                filePath = scan.nextLine();
                itsOk = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Создаем рег для валидации
        Pattern pattern = Pattern.compile("(http|https)://(.+?\\.([A-Za-z]*))/+.*");
        //записываем валидные адреса
            for (String url : urls) {
            Matcher matcher = pattern.matcher(url);
            if (matcher.matches()) {
                urlInfoList.add(new UrlInfo(matcher.group(1),matcher.group(0),matcher.group(2),matcher.group(3)));
            }
        }
            //Создаем лист для сортировки . Используем методы класса Finder (counterDomain, counterProtocol, counterUpperDomain) и выводим нужные списки
            List list = new ArrayList(Finder.counterUpperDomain(urlInfoList).entrySet());
            Collections.sort(list, new ComparatorMapValue());
            //Выводим топ 10
            for (int i = 0; i < list.size() && i < 10; i++) {
                System.out.println(list.get(i));
            }

    }
}
