package com.example.ksubv2;

public class Album {

    String profileName;
    int background_img;
    int profilePhoto;
    int followers;

    public Album() { }

    public Album(String profileName, int background, int profilePhoto, int followers) {
        this.profileName = profileName;
        this.background_img = background;
        this.profilePhoto = profilePhoto;
        this.followers = followers;
    }

    public String getProfileName() {
        return profileName;
    }

    public int getBackground() {
        return background_img;
    }

    public int getProfilePhoto() {
        return profilePhoto;
    }

    public int getFollowers() {
        return followers;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void setBackground(int background) {
        this.background_img = background;
    }

    public void setProfilePhoto(int profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }
}
