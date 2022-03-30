package com.company;

import java.util.LinkedList;

public class LinkedList1 {

    LinkedList<Integer>intlist;
    LinkedList<String>stringlist;
    LinkedList<Location>locationlist;

    public LinkedList1() {
        intlist = new LinkedList<>();
        stringlist = new LinkedList<>();
        locationlist = new LinkedList<>();
    }

    public  LinkedList<Integer> getIntLists() {
        return intlist;
    }
    public  LinkedList<String> getStringLists() {
        return stringlist;
    }
    public  LinkedList<Location> getLocationLists() {
        return locationlist;
    }

    public String linkedList1(){
        String first;
        String last;
        String allelements1 = " ";
        String allelements2 = " ";
        intlist.add(10);
        intlist.add(20);
        intlist.add(0,5);
        intlist.add(2,15);
        first = "first = " + Integer.toString(intlist.getFirst());
        last = "last = " + Integer.toString(intlist.getLast());
        for(int a : intlist)
              allelements1 = allelements1 + " " + Integer.toString(a);
        intlist.remove(1);
        for(int a : intlist)
            allelements2 = allelements2 + " " + Integer.toString(a);
           return first + "\n" + last + "\n\n" + allelements1 + "\n\n" + allelements2;
    }

    public String linkedList2(){
        String first;
        String last;
        String newfirst;
        String allelements1 = " ";
        String allelements2 = " ";
        String empty = " ";
         stringlist.addFirst("elephant");
         stringlist.addLast("Lion");
         stringlist.addFirst("cheetah");
         stringlist.addLast("chimpanzee");
         stringlist.addFirst("giraffe");
        first = "first = " + stringlist.getFirst();
        last = "last = " + stringlist.getLast();
        for(int i = 0; i<stringlist.size(); i++)
            allelements1 = allelements1 + " " + stringlist.get(i);
        stringlist.removeFirst();
        stringlist.removeLast();
        for(int i = 0; i<stringlist.size(); i++)
            allelements2 = allelements2 + " " + stringlist.get(i);
        newfirst = "first = " + stringlist.getFirst();
        stringlist.clear();
        if(stringlist.isEmpty() == true)
            empty = "List is empty";
        else
            empty = "List is not empty";

        return first + "\n" + last + "\n\n" + allelements1 + "\n\n" + allelements2 + "\n\n" + newfirst + "\n\n" + empty;
    }

    public String linkedList3(){
        Location a = new Location(1,1);
        Location b = new Location(2,2);
        Location c = new Location(3,3);
        Location d = new Location(0,0);
        Location loc = new Location(0,0);
        locationlist.addLast(a);
        locationlist.addLast(b);
        locationlist.addLast(c);
        locationlist.addFirst(d);
        loc = locationlist.getFirst();
        loc.setX(100);
        loc.setY(100);
        String allelements1 = " ";
        while(!locationlist.isEmpty())
          allelements1 = allelements1 + locationlist.removeFirst().toString();

        return "x = " + loc.getX() + " y = " + loc.getY() + "\n" + allelements1;
    }
}
