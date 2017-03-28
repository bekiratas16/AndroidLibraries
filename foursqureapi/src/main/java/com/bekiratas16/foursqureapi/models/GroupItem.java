package com.bekiratas16.foursqureapi.models;

/**
 * Created by ACER on 28.03.2017.
 */

public class GroupItem {

    private String id;
    private String firstName;
    private String lastName;
    private String gender;
    private Photo photo;

    public GroupItem() {
        photo=new Photo();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
}
