package com.devslopes.devslopesradio.services;

import com.devslopes.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by jplazcano on 5/21/16.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {

    }

    public ArrayList<Station> getFeaturedStations() {
        //Pretend we just downloaded featured stations from the Internet

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }

    public ArrayList<Station> getPartyStations() {
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }


}
