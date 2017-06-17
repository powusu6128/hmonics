package model;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<History> gameHistories;
    private History currentHistory;

    public Student(String name) {
        this.name = name;
        gameHistories = new ArrayList<History>();
    }

    public void startNewCurrentHistory(History history) {
        currentHistory = history;
        gameHistories.add(history);
    }

    public void addToCurrentHistory(String word) {
        currentHistory.addWord(word);
    }

    public String getName() {
        return name;
    }

    public ArrayList<History> getGameHistory() {
        return gameHistories;
    }
}
