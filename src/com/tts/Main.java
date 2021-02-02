package com.tts;
import java.util.*;
import java.lang.String;

public class Main {


    public static void main(String[] args) {
        // write your code here
        boolean flag = true;

           do {

               int op;
               Scanner ch = new Scanner(System.in);

               System.out.println("1.Add an Entry");
               System.out.println("2.Remove an Entry");
               System.out.println("3.Search for a specific entry");
               System.out.println("4.Print the contents of the address book");
               System.out.println("5.Delete the contents of the address book");
               System.out.println("6.Quit the program");

               System.out.println("Enter what do you want with the database:");

               op = ch.nextInt();

               switch (op) {
                   case 1:
                       System.out.println("Enter firstName:");
                       String firstName = ch.next();
                       System.out.println("Enter lastName:");
                       String lastName = ch.next();
                       System.out.println("Enter phoneNumber :");
                       String phoneNumber = ch.next();
                       System.out.println("Enter emailAddress:");
                       String emailAddress = ch.next();
                       AddressBook.addEntry(new Entry(firstName, lastName, phoneNumber, emailAddress));
                       break;

                   case 2:
                       System.out.println("Enter the email id you want to remove: ");
                       String emailID = ch.next();
                       AddressBook.removeEntry(emailID);
                       break;

                   case 3:
                       System.out.println("Enter the email you are looking for");
                       String email = ch.next();
                       Entry found = AddressBook.searchEntry(email);
                       System.out.println("Entry is found \n" +found);

                       break;
                   case 4:
                       AddressBook.printEntryList();
                       break;
                   case 5:
                       AddressBook.deleteList();
                       break;
                   case 6:
                       System.out.println("Thanks for stopping by");
                       flag = false;
                       ch.close();
                       break;
               }
           }while(flag);

        }
    }




