package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx2 {
    public static void main(String[] args) {
        try {

            InputStream in = new FileInputStream("c:\\temp\\file1.txt");
            InputStreamReader reader = new InputStreamReader(in, "utf-8");
            Writer out = new FileWriter("c:\\temp\\output2.txt");

            int input = 0;
            char[] cbuf = new char[1024];
            while ((input = reader.read(cbuf)) != -1) { 
                out.write(new String(cbuf));
                }   

            in.close();
            out.close();
        } catch (IOException e) {  
            e.printStackTrace(); 
        }
    }
}
