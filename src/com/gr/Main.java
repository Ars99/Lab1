package com.gr;
import java.io.IOException;
public class Main{
	 public static void main(String[] args) throws IOException{
	 	if (!args[0].equals("-i") && !args[0].equals("-md5") && !args[0].equals("-sha256")){
	 		System.out.println("Input error");
	 	}

		switch(args[0]){
			case("-i"):
			    InteractiveMode interactive = new InteractiveMode(args);
			    interactive.Interactive();
			break;

			default:
                Mode mode = new Mode(args);
                mode.UserMode();
            break;
		}
	}
}
