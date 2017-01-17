package logger;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Corneti
 */
public class Logger {


    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        FileWriter file;
        boolean cont = true;
        int line = 1;

        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try{
            file = new FileWriter("Logger.txt");
            while (cont) {
                System.out.println("Vuoi continuare? si o no?");
                String risposta = sc.nextLine();
                if (risposta.equalsIgnoreCase("no")) {
                file.close();
                  break;
               
            }
                if (risposta.equalsIgnoreCase("si")) {
                
                System.out.print("Scrivi " + line + ": ");
                String text = sc.nextLine();
                    Date date = new Date();

                    file.write("[" + dateFormat.format(date) + "] " + text + "\r");
                    line++;
            }
                
                else 
                    System.out.println("scrivere si o no: "); {   
               

            } 
            }
        }
        catch(Exception ex){
            System.out.println("Errore: " + ex.getMessage());
        }

    }
    
}
