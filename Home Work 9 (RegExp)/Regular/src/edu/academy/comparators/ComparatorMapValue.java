package edu.academy.comparators;

import java.util.Comparator;
import java.util.Map;

public class ComparatorMapValue implements Comparator<Map.Entry<String,Long>> {

    @Override
    public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}
