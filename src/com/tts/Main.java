package com.tts;
import java.util.*;
import java.lang.String;


public class Main {


    public static void main(String[] args) {
        // write your code here
     boolean flag = true;

        // we can refer to AddressBook directly because its implementations are static
        AddressBook.addEntry(
                new Entry("Aparna",
                        "Chellapilla",
                        "555-555-5555",
                        "test@aol.com"));
        AddressBook.addEntry(new Entry("Gk",
                        "k",
                        "555-555-5555",
                        "test@gmail.com"));
        AddressBook.addEntry(new Entry("Kate",
                        "Heigl",
                        "555-555-5555",
                        "test@icloud.com"));

     do {

       int op;
       Scanner ch = new Scanner(System.in);

       System.out.println("1.Add an Entry");
       System.out.println("2.Remove an Entry");
       System.out.println("3.Search for a specific entry");
       System.out.println("4.Print the contents of the address book");
       System.out.println("5.Delete the contents of the address book");
       System.out.println("6.Quit the program");

       System.out.println("Enter what do you want to do with the Address Book:");
       System.out.println(">>>");

       op = ch.nextInt();

       switch (op) {
           case 1:
               System.out.println("Enter firstName:");
               String firstName = ch.next();
               System.out.println("Enter lastName:");
               String lastName = ch.next();
               System.out.println("Enter phoneNumber :");
               var phoneNumber = ch.next();

               System.out.println("Enter emailAddress:");
               String emailAddress = ch.next();
               AddressBook.addEntry(new Entry(firstName, lastName, phoneNumber, emailAddress));
               break;

           case 2:
               System.out.println("Enter the email id of the entry you want to remove");
               String emailId = ch.next();
               AddressBook.removeEntry(emailId);
               break;

           case 3:
               System.out.println("""
                       Choose how you want to remove the entry\s
                        'F' - FirstName\s
                        'L'- LastName\s
                        'P'- Phone Number\s
                        'E' - EmailAddress\s
                        ...
                         """);
               char selector = ch.next().charAt(0);
               System.out.println("Enter your input: \n");
               String searchQuery = ch.next();

               Entry found = AddressBook.searchEntry(selector,
                       searchQuery);
               if (found != null) {
                   System.out.println("WooHoo, An Entry with the details you entered is found : " +found);
               }

              break;

           case 4:
               AddressBook.printEntryList();
               break;

           case 5:
               AddressBook.deleteList();
               break;

           case 6:
               System.out.println("Quit!");
               flag = false;
               ch.close();
               break;
           default:
               System.out.println("Input Invalid, Please select from the list below");
               break;
       }
   } while(flag);

}


}




