package edu.academy;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//С помощью стрима делаем из листа мапу
public class Finder {
    public static Map<String,Long> counterProtocol (List<UrlInfo> e) {
      Map<String,Long> keymap = e.stream()
                .collect(
                        Collectors.groupingBy(val -> val.getProtocol(), Collectors.counting()));

        return keymap;

    }
    public static Map<String,Long> counterDomain (List<UrlInfo> e) {
        Map<String,Long> keymap = e.stream()
                .collect(
                        Collectors.groupingBy(val -> val.getDomain(), Collectors.counting()));

        return keymap;

    }
    public static Map<String,Long> counterUpperDomain (List<UrlInfo> e) {
        Map<String,Long> keymap = e.stream()
                .collect(
                        Collectors.groupingBy(val -> val.getUpperDomain(), Collectors.counting()));

        return keymap;

    }
}
