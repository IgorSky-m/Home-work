package edu.academy.comparators;

import edu.academy.UrlInfo;

import java.util.Comparator;

public class ComparatorDomain implements Comparator<UrlInfo> {
    @Override
    public int compare(UrlInfo o1, UrlInfo o2) {
        return o1.getDomain().compareTo(o2.getDomain());
    }
}
