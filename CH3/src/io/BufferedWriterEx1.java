package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아서 파일을 출력하는 프로그램 작성
        // 단, 키보드에서 입력하다가 q를 입력 시, 입력받는 것을 중지

        Scanner sc = new Scanner(System.in);
        // 이 코드의 경우, 계속 반복해야 한다. 

        String input = "";
        System.out.println("파일에 작성할 데이터를 입력해 주세요");
        System.out.println("중지를 원하시면 q를 입력하세요");
        String content = null;

        do {
            System.out.println(">> ");
            input = sc.nextLine();
            content += input;
        } while (!input.equals("q"));

        try {
            FileWriter fw = new FileWriter("c:\\temp\\user.txt");
            BufferedWriter bw = new BufferedWriter(fw); 
            bw.write(content);

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close(); // 통로가 닫힌다는 개념이라고? 이게 왜? 왜 닫아야 하는건데? Reader나 Input도 아닌데?
    }
}
