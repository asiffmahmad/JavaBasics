package com.basics;

import java.nio.charset.Charset;

public class StringMethodsExample {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation result: " + result);

        // Length
        int length = result.length();
        System.out.println("Length: " + length);

        // Accessing characters
        char firstChar = result.charAt(0);
        System.out.println("First character: " + firstChar);

        // Substring
        String substring = result.substring(6, 11);
        System.out.println("Substring: " + substring);

        // Comparison
        boolean isEqual = str1.equals("Hello");
        System.out.println("Is equal? " + isEqual);

        // Uppercase and lowercase
        String upperCase = result.toUpperCase();
        System.out.println("Uppercase: " + upperCase);
        String lowerCase = result.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        // IndexOf
        int indexOfWorld = result.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        // LastIndexOf
        int lastIndexOfl = result.lastIndexOf("l");
        System.out.println("Last index of 'l': " + lastIndexOfl);

        // Contains
        boolean containsHello = result.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);

        // Replace
        String replacedString = result.replace("World", "Universe");
        System.out.println("After replacement: " + replacedString);

        // Trim
        String stringWithWhitespace = "   Trim me   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");
        
        // charAt
        char charAtIndex = result.charAt(3);
        System.out.println("Character at index 3: " + charAtIndex);

        // codePointAt
        int codePointAtIndex = result.codePointAt(1);
        System.out.println("Code point at index 1: " + codePointAtIndex);

        // codePointBefore
        int codePointBeforeIndex = result.codePointBefore(3);
        System.out.println("Code point before index 3: " + codePointBeforeIndex);

        // codePointCount
        int codePointCount = result.codePointCount(0, result.length());
        System.out.println("Code point count: " + codePointCount);

        // compareTo
        int compareToResult = str1.compareTo(str2);
        System.out.println("Compare to result: " + compareToResult);

        // compareToIgnoreCase
        int compareToIgnoreCaseResult = str1.compareToIgnoreCase("HELLO");
        System.out.println("Compare to (ignore case) result: " + compareToIgnoreCaseResult);

        // concat
        String concatenated = str1.concat(str2);
        System.out.println("Concatenated using concat: " + concatenated);

        // contains
        boolean containsResult = result.contains("Hello");
        System.out.println("Contains 'Hello': " + containsResult);

        // contentEquals
        boolean contentEqualsResult = result.contentEquals(new StringBuffer("Hello World"));
        System.out.println("Content equals StringBuffer: " + contentEqualsResult);

        // getBytes
        byte[] bytes = result.getBytes();
        System.out.println("Bytes using default charset: " + new String(bytes));

        byte[] utf8Bytes = result.getBytes(Charset.forName("UTF-8"));
        System.out.println("Bytes using UTF-8 charset: " + new String(utf8Bytes));

    }
}
