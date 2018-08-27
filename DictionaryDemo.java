import java.util.*;
import java.io.*;

public class DictionaryDemo 
{

   public static void main(String[] args) 
   {
       Map<String, String> map = new HashMap<String, String>();
       map.put("2206", "Rahul");
       map.put("2211", "Shubham");
       map.put("2709", "Yash");
       map.put("1234", "Deep");
        Scanner sc=new Scanner(System.in);   
        System.out.println("Enter your ID");  
        String name=sc.next();  
        
       System.out.println("Hey Yo, "+map.get(name));
       
       
       String fileName = "chat.txt";

        try 
        {
            
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Message :");
            String mess=sc.next();
            bufferedWriter.write(map.get(name));
            bufferedWriter.write(" :");
            bufferedWriter.write(mess);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) 
        {
            System.out.println("Error writing to file '"+ fileName + "'");
            
        }
       
        String line = null;

        try {
            
            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  

        }

   }
}