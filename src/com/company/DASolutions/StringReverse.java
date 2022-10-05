package com.company.DASolutions;

import java.util.Stack;

public class StringReverse {
    public String reverse(String input){
        Stack<Character> stringChars = new Stack<>();

        for(Character ch : input.toCharArray())
            stringChars.push(ch);

        StringBuffer output = new StringBuffer();

        while (!stringChars.empty()){
            output.append(stringChars.pop());
        }

        return output.toString();
    }
}
