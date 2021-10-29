package ru.netology.domain;


public class Radio {
    private int currentRadioStation;
    private int numberRadioStation = 10;
    private int minRadioStation = 0;
    private int maxRadioStation  = 9;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int currentSoundVolume;

    public Radio() {
    }

    public Radio(int numberRadioStation) {
        this.numberRadioStation = numberRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    // Переключение радио станций

    public void switchRadioStationUp() {  // переключение на минимальную станцию
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation++;
    }

    public void switchRadioStationDown() {  // переключение на максимальную станцию
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
            return;
        }
        currentRadioStation--;
    }


    public void setNumberRadioStation(int numberRadioStation) {  // установка радиостанции напрямую
        if (numberRadioStation > 9) {
            return;
        }
        if (numberRadioStation < 0) {
            return;
        }
        this.numberRadioStation = numberRadioStation;
    }

    // Громкость Звука

    public void increaseSoundVolumeByOne() {
        if (currentSoundVolume == minSoundVolume) {
            return;
        }
        currentSoundVolume++;
    }

    public void decreaseSoundVolumeByOne() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }
        currentSoundVolume--;
    }

    public void setCurrentSoundVolumeMaxMin(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            return;
        }
        if (currentSoundVolume <= minSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }
}
