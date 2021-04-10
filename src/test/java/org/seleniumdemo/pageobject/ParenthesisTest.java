package org.seleniumdemo.pageobject;

import java.util.*;

public class ParenthesisTest {
 
    public static void reverse(char A[], int l, int h){
            if (l < h)
            {
            char ch = A[l];
            A[l] = A[h];
            A[h] = ch;
            reverse(A, l + 1, h - 1);
            }
    }

    static String reverseParentheses(String str, int len){
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < len; i++)
        {
        
        if (str.charAt(i) == '(')
        {
            st.push(i);
        }
        
        else if (str.charAt(i) == ')')
        {
            char[] A = str.toCharArray();
            reverse(A, st.peek() + 1, i);
            str = String.copyValueOf(A);
            st.pop();
        }
        }
        
        String res = "";
        for (int i = 0; i < len; i++)
        {
        if (str.charAt(i) != ')' && str.charAt(i) != '(')
        {
            res += (str.charAt(i));
        }
        }
        return res;
    }

    public static void main (String string)
    {
        String str = "'The -((((12345))))- brown fox (-123-((4567))89umxc)ps (ov(er)) the ((lazy)) ()dog.'";
        int len = str.length();
        System.out.println(reverseParentheses(str, len));
    }   
}



