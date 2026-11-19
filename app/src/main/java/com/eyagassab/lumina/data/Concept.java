package com.eyagassab.lumina.data;

public class Concept {

    private final int id;
    private final String title;
    private final String tldr;
    private final String practice;

    public Concept(int id, String title, String tldr, String practice) {
        this.id = id;
        this.title = title;
        this.tldr = tldr;
        this.practice = practice;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTldr() {
        return tldr;
    }

    public String getPractice() {
        return practice;
    }
}