package com.sunbeam.p2;

import java.util.StringTokenizer;

public class Program01 {
    public static void main(String[] args) {
        // String str = "sunbeam infotech pune";
        // StringTokenizer stk = new StringTokenizer(str);

        //String str = "www.sunbeaminfo.in";
        // StringTokenizer stk = new StringTokenizer(str, ".");

        String str = "https://www.sunbeaminfo.in/placement";
        StringTokenizer stk = new StringTokenizer(str, ":/.", true);
        while (stk.hasMoreTokens())
            System.out.println(stk.nextToken());
    }
}
