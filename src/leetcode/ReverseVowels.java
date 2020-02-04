package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ReverseVowels {
    static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }

    public static String reverseVowels(String str) {
        // Start two indexes from two corners
        // and move toward each other
        int i = 0;
        int j = str.length() - 1;
        char[] str1 = str.toCharArray();
        while (i < j) {
            if (!isVowel(str1[i])) {
                i++;
                continue;
            }
            if (!isVowel(str1[j])) {
                j--;
                continue;
            }

            // swapping
            char t = str1[i];
            str1[i] = str1[j];
            str1[j] = t;
            i++;
            j--;
        }
        String str2 = String.copyValueOf(str1);
        return str2;
    }



        public static void main(String[] args) {
        String s=reverseVowels("leetcode");
        System.out.println(s);

    }

   /* private static String reverseVowels(String st) {
        int j=0;
        char[] str=st.toCharArray();
        char prevChar='\n';
        String vowel="";
        for(int i=0;i<str.length;i++){
            if(isVowel(str[i])){
                j++;
                vowel+=str[i];
            }
        }

        for(int i=0;i<str.length;i++){
            if(isVowel(str[i])){
                str[i]=vowel.charAt(--j);
            }
        }
        return String.valueOf(str);
    }*/
}
