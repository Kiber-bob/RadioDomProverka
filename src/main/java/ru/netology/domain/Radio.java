package ru.netology.domain;


public class Radio {
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 10;
    private int currentSoundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
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

    public void setCurrentSoundVolume(int soundVolume) {
        this.currentSoundVolume = soundVolume;
    }

    // Переключение радио станций

    public void switchRadioStationOnMin() {  // переключение на минимальную станцию
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
    }

    public void switchRadioStationOnMax() {  // переключение на максимальную станцию
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
    }

    public void decreaseRadioStationByOne() {  // переключение на одну станцию назад
        if (currentRadioStation == maxRadioStation) {
            return;
        }
        currentRadioStation--;
    }

    public void increaseRadioStationByOne() {  // переключение на одну станцию вперед
        if (currentRadioStation == minRadioStation) {
            return;
        }
        currentRadioStation++;
    }

    public void setNumberRadioStation(int currentRadioStation) {  // установка радиостанции напрямую
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
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
