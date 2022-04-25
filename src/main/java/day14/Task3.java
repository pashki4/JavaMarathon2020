package day14;

import java.io.File;

public class Task3 {
    public static void main(String[] args) {
    	System.out.println(People.parseFileToObjList(new File("people")));
    }
}
