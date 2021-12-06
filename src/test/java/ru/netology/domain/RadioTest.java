package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test
    public void shouldSwitchRadioStationUp() { // Увеличение на единицу, переключение на минимальную
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.switchRadioStationUp();
        radio.switchRadioStationUp();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationDown() {  // Уменьшение на единицу, переключение на максимальную
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);
        radio.switchRadioStationDown();
        radio.switchRadioStationDown();
        radio.switchRadioStationDown();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNumberStation10Test() {  // Выставление номера станции на прямую
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(10);
        radio.setCurrentRadioStation(-2);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseNumberStation20Test() {
        Radio radio = new Radio(20); // Выставление номера станции напрямую
        radio.setCurrentRadioStation(10);
        radio.setCurrentRadioStation(20);
        radio.setCurrentRadioStation(-1);
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation1() { //
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStation(10);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.setCurrentRadioStation(13);
        radio.setCurrentRadioStation(-3);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(98);
        radio.increaseSoundVolumeByOne();
        radio.increaseSoundVolumeByOne();
        radio.increaseSoundVolumeByOne();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(2);
        radio.decreaseSoundVolumeByOne();
        radio.decreaseSoundVolumeByOne();
        radio.decreaseSoundVolumeByOne();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

}