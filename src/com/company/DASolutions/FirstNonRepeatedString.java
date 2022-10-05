package com.company.DASolutions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedString {

    public static Character getFirstNonRepeated(String input){
        Map<Character, Integer> chars = new HashMap<>();

        for(Character ch : input.toLowerCase().toCharArray()){
            if(chars.containsKey(ch)){
                chars.put(ch, chars.get(ch) + 1);
            }else {
                chars.put(ch, 1);
            }
        }

        for(Character ch : input.toLowerCase().toCharArray()){
            if(chars.get(ch) == 1) return ch;
        }

        return null;
    }
}
