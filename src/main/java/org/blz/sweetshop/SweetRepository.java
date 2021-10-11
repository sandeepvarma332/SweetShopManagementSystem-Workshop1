package org.blz.sweetshop;

import java.util.ArrayList;
import java.util.List;


public class SweetRepository {

    private List sweetList = new ArrayList();

    public List getSweetList() {
        return sweetList;
    }

    public void add(Jilebi jilebi) {
        sweetList.add(jilebi);
    }

        public void add(Kalakand Kalakand) {
            sweetList.add(Kalakand);
        }

    public void add(Laddu Laddu) {
        sweetList.add(Laddu);
    }

    public void add(Mitai Mitai) {
        sweetList.add(Mitai);
    }

    public void add(Poothareku Poothareku) {
        sweetList.add(Poothareku);
    }

}
