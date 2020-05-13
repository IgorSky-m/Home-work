package edu.academy.comparators;

import edu.academy.UrlInfo;

import java.awt.datatransfer.ClipboardOwner;
import java.util.Comparator;

public class ComparatorURL implements Comparator<UrlInfo> {

    @Override
    public int compare(UrlInfo o1, UrlInfo o2) {
        return o1.getUrl().compareTo(o2.getUrl());
    }
}
