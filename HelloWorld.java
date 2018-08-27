import java.io.*;
import java.util.*;
 
public class HelloWorld {

    public static void main(String[] args) 
    {
       System.out.println ("");
       System.out.println ("--------------------------------------------------------------------------------");
       System.out.println ("+++++++++++++++++++++++++++SERVECHAT-Alpha Version 1.0++++++++++++++++++++++++++");
       System.out.println ("+                                                                              +");
       System.out.println ("+                                                   By-R.A™                    +");
       System.out.println ("+                                                   All Rights Reserved(2017)© +");
       System.out.println ("+                                                                              +");
       System.out.println ("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println ("--------------------------------------------------------------------------------");
       
       Map<String, String> map = new HashMap<String, String>();
       map.put("2206", "Rahul");
       map.put("2211", "Shubham");
       map.put("2709", "Yash");
       map.put("1234", "Deep");
       map.put("1703", "Pathak");
       
       System.out.println ("--------------------------------------------------------------------------------");
       System.out.println ("1. Login");
       System.out.println ("2. Exit");
       System.out.println ("--------------------------------------------------------------------------------");
       String gender;                              //the gender of the user
        Scanner scanner = new Scanner(System.in);       //text input scanner
 
        System.out.println("\nAre you male or female? (format: M or F)");
        gender = scanner.next();
        System.out.println(gender); //an output line for debugging
        if (gender == "F ") 
        {
            gender = "Male";
        }
        else 
        {
            gender = "Female";
        }
        System.out.println("\nYou said you are:");
        System.out.println(gender);
       
    }
    

}