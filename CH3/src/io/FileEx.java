package io;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        
        // 경로 지정 : / or \ 
        // 1)  File file = new File("c:/temp/file1.txt");
        // 2)  File file = new File("c:\\temp\\file1.txt"); // 생성자
        // 3)  File file = new File("c:\\temp\\","file1.txt"); // String Parent, String Child 형식의 생성자 유형
        File paraent = new File("c:\\temp");  // file Parent, String Child는 이렇게 생성
        File file = new File(paraent, "file.txt");

        String name = file.getName();
        System.out.println("파일명 "+name); // file1.txt (확장자명까지 포함된다.)

        // 확장자명을 제외한 파일명만 추출하고 싶다면?
        // split을 사용하려면 배열을 이용해 해야하기 때문에, 이런 경우 split보다는 
        // 처음 위치와 마지막 위치만 알면 되는 subString을 쓰면 더 깔끔하고 좋다. 


        int pos = name.lastIndexOf(".");
        // name.substring(0, 5);
        // 문제가 있다. 만약 파일명이 더 길게 바뀐다면, endIndex도 바꿔야 한다. 
        // 파일명이 바뀌더라도 알아서 endIndex가 조정되게 하려면? IndexOf
        name.substring(0, pos);
        // endIndex 부분에 pos로 센 부분이 들어가면 된다 
        System.out.println("확장자를 제외한 파일명 : "+name);
        System.out.println("확장자 "+ name.substring(pos+1));
        System.out.println("경로를 포함한 파일명 " + file.getPath());
        System.out.println("파일이 속해 있는 디렉토리 " + file.getParent());
        System.out.println("파일 pathSeparator " + File.pathSeparator);
        System.out.println("파일 pathSeparatorChar " + File.pathSeparatorChar);
        System.out.println("파일 separator "+ File.separator);
        System.out.println("파일 separatorChar "+File.separatorChar);


    }
}
