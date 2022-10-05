package com.company.DASolutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringManipulation {

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

    public static Character getFirstRepeatedCharacter(String input){
        Set<Character> chars = new HashSet<>();

        for (Character ch : input.toLowerCase().toCharArray()){
            if(ch == ' ') continue;

            else if(chars.contains(ch))
                return ch;

            chars.add(ch);
        }
        return null;
    }
}
