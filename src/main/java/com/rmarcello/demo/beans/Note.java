package com.rmarcello.demo.beans;

import java.util.Arrays;
import java.util.List;

public class Note implements Comparable<Note> {
    private int id;
    private String title;
    private String content;
    private List<String> labels;
    private List<String> urls;

    public Note(int id, String title, String content, List<String> labels, List<String> urls) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.labels = labels;
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", labels=" + labels +
                ", urls=" + urls +
                '}';
    }

    @Override
    public int compareTo(Note other) {
        return this.title.compareTo(other.title);
    }
}
