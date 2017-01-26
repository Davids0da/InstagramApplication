package com.example.david.instagram.recycle;

public class Model {
    private String username, location, body, numberOfLikes, numberOfComments;

    public Model(String username, String location, String body, String numberOfLikes, String numberOfComments) {
        this.username = username;
        this.location = location;
        this.body = body;
        this.numberOfLikes = numberOfLikes;
        this.numberOfComments = numberOfComments;
    }
    public String getUsername() {
        return username;
    }
    public String getLocation() {
        return location;
    }
    public String getBody() {
        return body;
    }
    public String getNumberOfLikes() {
        return numberOfLikes;
    }
    public String getNumberOfComments() {
        return numberOfComments;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setNumberOfComments(String numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public void setNumberOfLikes(String numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }
}



