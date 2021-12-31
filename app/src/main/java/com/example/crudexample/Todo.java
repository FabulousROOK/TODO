package com.example.crudexample;
//data base ekta data danakota data tiyagannet database eken data gannkota data store karagannet meke
public class Todo {
    private int id;
    private  String title,description;
    private  long started,finished;

    //getters and setters
    //setters=Class variables walta values set karanna tma setters pawichchi karanne
    //getters=a pass karapu values eliyta ganna tma getters pawichchi karanne
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getStarted() {
        return started;
    }

    public void setStarted(long started) {
        this.started = started;
    }

    public long getFinished() {
        return finished;
    }

    public void setFinished(long finished) {
        this.finished = finished;
    }

    //constructors
    public Todo(){

    }
    public Todo(int id, String title, String description, long started, long finished) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.started = started;
        this.finished = finished;
    }

    public Todo(String title, String description, long started, long finished) {
        this.title = title;
        this.description = description;
        this.started = started;
        this.finished = finished;
    }


}
