package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream("c:\\temp\\file1.txt");
            // InputStreamReader reader = new InputStreamReader(in, "utf-8");
            // BufferedReader br = new BufferedReader(reader);

            // Writer out = new FileWriter("c:\\temp\\output3.txt");
            // BufferedWriter bw = new BufferedWriter(out);

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"), "utf-8"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\output3.txt"));
            

            String input = null;

            while ((input = br.readLine()) != null) { 
                // 버퍼를 쓰면 write(STring이 된다.)
                // 이러면, 29line에서 줄 단위로 읽어올 수 있다는 거다.
                // while의 input에서 readLine()으로 변경 
                bw.write(input); // null에서 input으로 작성 가능하게 변경. 왜?
                bw.newLine();
                }   

            // in.close();
            bw.flush();
            // out.close();
        } catch (IOException e) {  
            e.printStackTrace(); 
        }
    }
}
