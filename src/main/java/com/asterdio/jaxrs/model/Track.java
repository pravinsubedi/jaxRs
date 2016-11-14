package com.asterdio.jaxrs.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Admin on 11/13/2016.
 */
public class Track {
    private String songName;
    private String singer;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Track(String songName) {
        this.songName = songName;
    }

    public Track() {
    }

    public Track(String songName, String singer) {
        this.songName = songName;
        this.singer = singer;
    }
}
