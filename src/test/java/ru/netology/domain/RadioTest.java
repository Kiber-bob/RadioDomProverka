package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test
    public void shouldSwitchRadioStationUp() { // Увеличение на единицу, переключение на минимальную
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.switchRadioStationUp();
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
    public void shouldSetNumberStationTest() {  // Выставление номера станции на прямую
        Radio radio = new Radio(10);
        radio.setMaxNumberRadioStation(9);
        radio.setMinNumberRadioStation(0);
        radio.setNumberRadioStation(5);
        radio.setNumberRadioStation(11);
        radio.setNumberRadioStation(-2);
        int expected = 5;
        int actual = radio.getNumberRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseNumberStation10Test() {
        Radio radio = new Radio(20); // Выставление номера станции напрямую
        radio.setMaxNumberRadioStation(19);
        radio.setMinNumberRadioStation(0);

        radio.setNumberRadioStation(15);

        radio.setNumberRadioStation(20);
        radio.setNumberRadioStation(-1);
        int expected = 15;
        int actual = radio.getNumberRadioStation();
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