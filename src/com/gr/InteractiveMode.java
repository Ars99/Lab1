package com.gr;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;

public class InteractiveMode{

    private String[] args;

    public InteractiveMode(String[] arg){
        this.args = arg;
    }
    
    private void printMenu(){
    	System.out.println("1 - Get hash");
    	System.out.println("2 - End");
    }
    public void Interactive(){
        boolean exit = false;
    	String key;
    	while(!exit){
            try{
    		printMenu();
    		Scanner s = new Scanner(System.in);
    		System.out.println("Enter the number: ");
    		key = s.nextLine();
    		switch(key){
    			case "1":
    			    System.out.println("Enter the name of the file: ");
    			    String filename = s.nextLine();
                    HashSum hashsum = new HashSum(filename);
                    System.out.println("MD5: " + hashsum.HashMd() + " Sha256: " + hashsum.HashSha());
                    
                    break;

                case "2":
                    exit = true;
                    System.out.println("End...");
                    break;
    		    }
            }
            catch (IOException ex){
                System.out.println("Wrong filename");
            }
    	}
       
    }
    
}


