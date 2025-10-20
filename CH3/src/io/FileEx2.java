package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx2 {
    public static void main(String[] args) {
        File currDir = new File("c:\\temp");
        
        File[] files = currDir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        if (!currDir.exists()) {
            currDir.mkdir();
        }

        File dir = new File("c:\\temp\\dir");
        File file1 = new File("c:\\temp\\dir\\file1.txt");
        File file2 = new File("c:\\temp\\file2.txt");
        File file3 = new File("c:\\temp\\file3.txt");

        if (!dir.exists())
            dir.mkdir();
        try {
            if (!file1.exists()) 
                file1.createNewFile();
            if (!file2.exists()) 
                file2.createNewFile();
            if (!file3.exists()) 
                file3.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        
        files = currDir.listFiles();

        // a : am/pm 표시
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

        // sdf.format(new Date(file.lastModified()))
        // file.lastModified() : long
        // 123445678911223333 -> 

        // 날짜에 쓰는 클래스
        // 날짜 형식
        // 1. java.util.Date
        // new Date()를 이용해서 long 타입으로 반환하는 값을 선택해서 lastModified에 넣는것?
        // 2. java.time.LocalDate
        // ofEpochDay를 넣어야 한다. 
        // LocalDate.ofEpochDay()
        // Date 형식의 특징 > 표준 시간을 사용한다. => 형식을 원하는대로 사용하기 위해서 다시 지정

        System.out.println("\t날짜     시간    형태           크기      이름  ");
        System.out.println("=========================================================");
        for (File file : files) {
            System.out.print(sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.print("\t<DIR>\t\t"+file.getName());
            } else {
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }

    }
}
