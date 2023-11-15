package com.javarush.kotovych.constants;

import com.javarush.kotovych.containers.Alphabet;

import java.util.*;

public class EnAlphabet implements Alphabet {
    private final String EN_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private final String NUMBERS = "0123456789";
    private final String SYMBOLS = "`~!@#$%^&*(){}[]<>;:'\\|?., -_+\"";
    private final String SYMBOL_CHARS = (NUMBERS + SYMBOLS);
    private char[] chars = (EN_ALPHABET + SYMBOL_CHARS).toCharArray();

    @Override
    public char[] getChars() {
        return chars;
    }


    public EnAlphabet() {
        Arrays.sort(chars);
    }
}
