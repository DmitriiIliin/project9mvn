package ru.netology.project9.project9mvn.services;

public class Radio {
    private int numberStation;
    private int levelVolume;

    public int getNumberStation() {
        return numberStation;
    }

    public int getLevelVolume() {
        return levelVolume;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            newNumberStation = 9;
        }
        if (newNumberStation > 9) {
            newNumberStation = 0;
        }
        numberStation = newNumberStation;
    }
    public void setLevelVolume(int newLevelVolume) {
        if (newLevelVolume <0) {
            newLevelVolume = 0;
        }
        if (newLevelVolume >100) {
            newLevelVolume = 100;
        }
        levelVolume = newLevelVolume;
    }

    public void beforeNumberStation0() {
        numberStation = numberStation - 1;
        if (numberStation < 0) {
            numberStation = 9;
        }

    }

    public void afterNumberStation9() {
        numberStation = numberStation + 1;
        if (numberStation > 9) {
            numberStation = 0;
        }

    }

    public void beforeLevelVolume0() {
        levelVolume = levelVolume -1;
        if (levelVolume < 0) {
            levelVolume = 0;
        }
    }

    public void afterLevelVolume100() {
        levelVolume =levelVolume +1;
        if (levelVolume > 100) {
            levelVolume = 100;
        }
    }

}

