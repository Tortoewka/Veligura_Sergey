package com.company;

public class Cars {
    private int cod = 0;//код авто
    private int room = 0;//номер авто
    private int mileage = 0;//пробег
    private int additionalParameter = 0;//доп параметр

    public Cars(int cod, int room, int mileage, int additionalParameter) {
        this.cod = cod;
        this.room = room;
        this.mileage = mileage;
        this.additionalParameter = additionalParameter;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }
    public void setMileage(int mileage) {
        this.mileage = cod;
    }
    public int getMileage(){
        return mileage;
    }
    public void setadditionalParameter( int additionalParameter){
        this.additionalParameter=additionalParameter;
    }
    public int getAdditionalParameter(){
        return additionalParameter;
    }

}
