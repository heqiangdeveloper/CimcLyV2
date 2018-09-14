package com.cimcitech.cimcly.utils;

import com.cimcitech.cimcly.bean.contact.Contact;

import java.util.Comparator;

/**
 * Created by lyw on 2018/5/22.
 */

public class ContactPinyinComparator implements Comparator<Contact> {
    public int compare(Contact o1, Contact o2) {
        if (o1.getLetters().equals("@")
                || o2.getLetters().equals("#")) {
            return -1;
        } else if (o1.getLetters().equals("#")
                || o2.getLetters().equals("@")) {
            return 1;
        } else {
            return o1.getLetters().compareTo(o2.getLetters());
        }
    }
}
