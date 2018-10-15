package com.example.vince.corgiwallpaper;

import java.util.ArrayList;

public class CorgiImage {

    private String address;
    private String description;


    public CorgiImage(String address, String description) {
        this.address = address;
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public static ArrayList<CorgiImage> createCorgiList(int numCorgi){
        ArrayList<CorgiImage> corgiList = new ArrayList<CorgiImage>();
        for(int i=1; i<=numCorgi; i++){
            corgiList.add(new CorgiImage("address" +i, "description"+i));
        }
        return corgiList;
    }
}
