package com.gr;

import org.apache.commons.codec.digest.DigestUtils;
import java.io.FileInputStream;
import java.io.IOException;

public class HashSum{
    private String filename;
    
    HashSum(String FileName){
    	this.filename = FileName;
    }
    HashSum(){}

    public String HashSha() throws IOException{
         String result = DigestUtils.sha256Hex(new FileInputStream(filename));
         return result;
    }
    public String HashMd() throws IOException{
    	 String result = DigestUtils.md5Hex(new FileInputStream(filename));
         return result;
    }
}


