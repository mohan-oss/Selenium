package org.sel.frame;

import java.util.HashMap;
import java.util.*;
import java.util.HashSet;

public class Hmap {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap();
//        hm.put(1,"Java");
//        hm.put(2,"python");
//        hm.put(3,"testing");
//        hm.put(4,"sql");
        Set<String> s=new HashSet<String>();
        s.add("java");
        s.add("python");
        List<String> l=new ArrayList<String>();
        l.add("sql");
        l.add("selenium");
        l.add("test");
        int i=0;
        for(String st:s){
            hm.put(l.get(i++),st);
        }
        System.out.println(hm);

    }
}
