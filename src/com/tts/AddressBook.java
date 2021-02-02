package com.tts;
import java.util.*;

public class AddressBook {

    // this class is pretty much just a utility class
   // as such all of the properties will indeed be static

    private static List<Entry> entryList = new ArrayList<>();

    //methods : ways to manipulate the array List


    //Keeps track of how many entries are in the list

    //Adds an entry to the list
    public static void addEntry(Entry entry) {
        int length = entryList.size();
        entryList.add(entry);
        System.out.println("Print the elements in an array: " +entryList.get(length) );
        System.out.println("Entry List size now is: "  +entryList.size());
    }

    //Delete an entry

    public static void removeEntry(String emailID) {
        for (int i = 0; i <= entryList.size(); i++) {
            entryList.removeAll(Collections.singleton(emailID));

            int length = entryList.size();
            System.out.println("Print the elements in an array: " +entryList.get(length) );
        }
        System.out.println("Entry List Length now is: "  +entryList.size());
    }

    public static Entry searchEntry(String email) {
        return  entryList.stream()
                .filter(entry -> entry.getEmailAddress().equals(email))
                .findFirst()
                .orElseThrow();
    }

    public static void printEntryList(){
                           System.out.println("Printing all the elements in the List:" +entryList);
    }

    public static void deleteList() {
        entryList.clear();
        System.out.println("Deleting all elements from the List:");

    }
}

