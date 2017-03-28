package com.bekiratas16.foursqureapi.models;

import java.util.ArrayList;

/**
 * Created by ACER on 6.03.2017.
 */


public class Venue {
    public Venue() {
        contact = new Contact();
        location = new Location();
        categories = new ArrayList<Category>();
        stats = new Stats();
        menu = new Menu();
        beenHere = new BeenHere();
        specials = new Specials();
        hereNow = new HereNow();
        venueChains = new ArrayList<VenueChain>();
    }

    private String id;
    private String name;
    private Contact contact;
    private Location location;
    private ArrayList<Category> categories;
    private boolean verified;
    private Stats stats;
    private String url;
    private boolean hasMenu;
    private Menu menu;
    private boolean allowMenuUrlEdit;
    private BeenHere beenHere;
    private Specials specials;
    private HereNow hereNow;
    private String referralId;
    private ArrayList<VenueChain> venueChains;
    private boolean hasPerk;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isHasMenu() {
        return hasMenu;
    }

    public void setHasMenu(boolean hasMenu) {
        this.hasMenu = hasMenu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public boolean isAllowMenuUrlEdit() {
        return allowMenuUrlEdit;
    }

    public void setAllowMenuUrlEdit(boolean allowMenuUrlEdit) {
        this.allowMenuUrlEdit = allowMenuUrlEdit;
    }

    public BeenHere getBeenHere() {
        return beenHere;
    }

    public void setBeenHere(BeenHere beenHere) {
        this.beenHere = beenHere;
    }

    public Specials getSpecials() {
        return specials;
    }

    public void setSpecials(Specials specials) {
        this.specials = specials;
    }

    public HereNow getHereNow() {
        return hereNow;
    }

    public void setHereNow(HereNow hereNow) {
        this.hereNow = hereNow;
    }

    public String getReferralId() {
        return referralId;
    }

    public void setReferralId(String referralId) {
        this.referralId = referralId;
    }

    public ArrayList<VenueChain> getVenueChains() {
        return venueChains;
    }

    public void setVenueChains(ArrayList<VenueChain> venueChains) {
        this.venueChains = venueChains;
    }

    public boolean isHasPerk() {
        return hasPerk;
    }

    public void setHasPerk(boolean hasPerk) {
        this.hasPerk = hasPerk;
    }
}
