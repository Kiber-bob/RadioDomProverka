package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest{




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
        Radio radio = new Radio(9);
        radio.setNumberRadioStation(5);
        radio.setNumberRadioStation(-2);
        int expected = 5;
        int actual = radio.getNumberRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseNumberStation10Test() {
        Radio radio = new Radio(3); // Выставление номера станции напрямую
        radio.setNumberRadioStation(10);
        radio.setNumberRadioStation(-2);
        int expected = 3;
        int actual = radio.getNumberRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldSetCurrentRadioStation1() { //
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public  void shouldSetCurrentRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(13);
        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.increaseSoundVolumeByOne();
        radio.setCurrentSoundVolume(99);
        radio.increaseSoundVolumeByOne();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.decreaseSoundVolumeByOne();
        radio.setCurrentSoundVolume(99);
        radio.decreaseSoundVolumeByOne();
        int expected = 98;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeStayOnMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolumeMaxMin(101);
        radio.setCurrentSoundVolumeMaxMin(100);
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeStayMaxMin() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolumeMaxMin(0);
        radio.setCurrentSoundVolumeMaxMin(-1);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

}