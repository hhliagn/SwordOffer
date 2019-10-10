package com.lhh.swordoffer.array;

public class question5 {

    //替换空格
    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        String s1 = s.replaceAll(" ", "%20");
        return s1;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We Are Happy");
        replaceSpace(sb);
    }
}
