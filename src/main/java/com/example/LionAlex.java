package com.example;

public class LionAlex extends Lion {

    public LionAlex(Feline feline){
        super(feline);
    }

    public LionAlex(String sex) throws Exception {
        super(sex);
    }

    public String getFriends() {
        return "Марти, Глория, Мелман";
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
