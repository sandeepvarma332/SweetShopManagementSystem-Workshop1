package org.blz.sweetshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SweetRepository {


    private Set sweetList = new HashSet();

    private static SweetRepository instance;

    private SweetRepository() {

    }

    public static SweetRepository getInstance() {
        if (instance == null) {
            instance = new SweetRepository();

        }
        return instance;
    }



    public Set<Sweet> getSweetList()
    {
        return sweetList;
    }

    public void add(Sweet sweet)
    {
        sweetList.add(sweet);
    }

    public void delete(Jilebi jilebi)
    {
        sweetList.remove(jilebi);
    }

}


