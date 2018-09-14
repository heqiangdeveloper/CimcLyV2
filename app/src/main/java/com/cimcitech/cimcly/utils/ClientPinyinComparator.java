package com.cimcitech.cimcly.utils;

import com.cimcitech.cimcly.bean.client.Client;
import com.cimcitech.cimcly.bean.contact.Contact;

import java.util.Comparator;

/**
 * Created by lyw on 2018/5/22.
 */

public class ClientPinyinComparator implements Comparator<Client> {
    public int compare(Client o1, Client o2) {
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
