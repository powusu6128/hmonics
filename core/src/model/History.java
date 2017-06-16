package model;

import java.util.ArrayList;

public class History {
    private String gamePlayed;
    private ArrayList<String> wordsSpelled;

    public History(String gamePlayed) {
        this.gamePlayed = gamePlayed;
        wordsSpelled = new ArrayList<String>();
    }

    public void addWord(String wordId) {
        wordsSpelled.add(wordId);
    }
}
