package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String spinWords(String sentence) {
        String[] array = sentence.split(" ");
        for(int i = 0; i < array.length;i++) {
            if(array[i].length() >= 5) {
                StringBuilder stringBuilder = new StringBuilder(array[i]);
                StringBuilder reverse = stringBuilder.reverse();
                array[i] = reverse.toString();
            }
        }
        return String.join(" ", array);
    }
}

