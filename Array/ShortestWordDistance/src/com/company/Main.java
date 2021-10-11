package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] wordDict1 = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        System.out.println(shortestWD(wordDict1, word1, word2));
        //shortestWD(wordDict1, word1, word2);

        String[] wordDict2 = {"practice", "makes", "perfect", "coding", "makes"};
        String word3 = "makes";
        String word4 = "coding";
        System.out.println(shortestWD(wordDict2, word3, word4));

    }


    public static int shortestWD(String[] wordsDict, String w1, String w2){

        int distance = wordsDict.length;

        for(int i = 0; i < wordsDict.length; i++){
            if(wordsDict[i].equals(w1)){
                for(int j = 0; j < wordsDict.length; j++){
                    if(wordsDict[j].equals(w2)){
                        distance = Math.min(distance, Math.abs(i-j));

                    }

                }

            }
        }

        return distance;

    }
}
