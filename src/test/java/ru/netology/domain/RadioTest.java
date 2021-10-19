package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest{

    @Test
    public void shouldUseRadio10Station() {
        Radio radio = new Radio(
                10,
                0,
                10
        );
        assertEquals(10, radio.getNumberRadioStation());
    }

    @Test
    public void shouldUseRadio20Station() {
        Radio radio = new Radio(
                20,
                0,
                20
        );
        assertEquals(20, radio.getNumberRadioStation() );
    }


    @Test
    public void shouldSwitchRadioStationOnMIn() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.switchRadioStationOnMin();
        radio.switchRadioStationOnMin();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationOnMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.switchRadioStationOnMax();
        radio.switchRadioStationOnMax();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationByOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.increaseRadioStationByOne();
        radio.setCurrentRadioStation(4);
        radio.increaseRadioStationByOne();
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationByOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.decreaseRadioStationByOne();
        radio.setCurrentRadioStation(7);
        radio.decreaseRadioStationByOne();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation15Test() {
        Radio radio = new Radio(
                20,
                0,
                20
        );
        radio.setNumberRadioStation(21);
        radio.setNumberRadioStation(-3);
        radio.setNumberRadioStation(15);
        int expected = 15;
        int actual = radio.getNumberRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseNumberStation10Test() {
        Radio radio = new Radio(
                10,
                0,
                10
        );
        radio.setNumberRadioStation(11);
        radio.setNumberRadioStation(-1);
        radio.setNumberRadioStation(8);
        int expected = 8;
        int actual = radio.getNumberRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldSetCurrentRadioStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.setCurrentRadioStation(3);
        int expected = 3;
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

    @Test
    public void shouldInitFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(9, radio.getMaxRadioStation());
        assertEquals(0, radio.getMinSoundVolume());
        assertEquals(100, radio.getMaxSoundVolume());
    }

}