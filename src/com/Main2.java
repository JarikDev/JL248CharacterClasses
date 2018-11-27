package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        // special chars
        // ]\^-
        // [\\x]  [x^]  [^]x]  [-x]  [x-]
        // [\Q[-]\E]
      //  Pattern p3=Pattern.compile("[x^]");
      //  Pattern p3=Pattern.compile("[]x]");
/*        Pattern p3=Pattern.compile("[\\Q[-]\\E]"); // [ || ] || -
        Matcher m3=p3.matcher("]-[");
        while (m3.find()){
            System.out.println(m3.start()+" "+m3.group()+" ");
        }
        System.out.println("");*/

        //\d - [0-9]            \D - [^d\]
        //\w - [a-zA-Z_0-9]  |  \W - [^w\]
        //\s[\t]                \S - [^s\]

        //[\s\d]   \s\d
        //[\D\S]

        //repeatCharacters
        //?*+

 /*   Pattern p3=Pattern.compile("\\D"); // [ || ] || -
        Matcher m3=p3.matcher("cat be4un _");
        while (m3.find()){
            System.out.println(m3.start()+" "+m3.group()+" ");
        }
        System.out.println("");*/


       /* Pattern p3=Pattern.compile("\\s\\d"); // [ || ] || -
        Matcher m3=p3.matcher("cat 3be4un _");
        while (m3.find()){
            System.out.println(m3.start()+" "+m3.group()+" ");
        }
        System.out.println("");*/

        Pattern p4=Pattern.compile("[0-9]+");
        Matcher m4=p4.matcher("3451 + 1 = 3452");
        while (m4.find()){
            System.out.println(m4.start()+" - "+m4.group()+", ");
        }
        System.out.println("");








    }
}
