package com.gr;
import java.io.IOException;

public class Mode{
	private String[] args;

	Mode(String[] arg){
		this.args = arg;
	}

	public void UserMode()  throws IOException{
		switch(args[0]){
			case "-md5":
                
                while(!args[1].equals("-f")){
                	System.out.println("Input error.");
                }
                if (args[1].equals("-f")){
                	HashSum hashsum = new HashSum(args[2]);
                	System.out.println("md5: " + hashsum.HashMd());
                }
                break;
  			case "-sha256":
			    while(!args[1].equals("-f")){
                	System.out.println("Input error.");
                }
                if (args[1].equals("-f")){
                	HashSum hashsum = new HashSum(args[2]);
                	System.out.println("sha256: " + hashsum.HashSha());
                }
                break;
		}
	}
}