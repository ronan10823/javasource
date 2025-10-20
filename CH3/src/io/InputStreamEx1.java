package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx1 {
    public static void main(String[] args) {
        // InputStream in = new FileInputStream(new File("null"));
        try {
            InputStream in = new FileInputStream("c:\\temp\\img1.jpg");
            OutputStream out = new FileOutputStream("c:\\temp\\copy1.jpg");

            int input = 0;
            while ((input = in.read()) != -1) {
                // System.out.println((char) input);
                out.write(input);
                }

            in.close();
            out.close();
        } catch (IOException e) {  
            e.printStackTrace(); 
        }
    }
}
