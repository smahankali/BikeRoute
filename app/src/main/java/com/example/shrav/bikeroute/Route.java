package com.example.shrav.bikeroute;

/**
 * Created by shrav on 11/15/2016.
 */
public class Route {
    public String route_name;
    public String start_latitude;
    public String start_longitude;
    public String end_latitude;
    public String end_longitude;
    public String used;

    public Route(String route_name, String start_latitude, String start_longitude, String end_latitude, String end_longitude, String used) {
        this.route_name = route_name;
        this.start_latitude = start_latitude;
        this.start_longitude = start_longitude;
        this.end_latitude = end_latitude;
        this.end_longitude = end_longitude;
        this.used = used;
    }

    public String getRoute_name() {
        return route_name;
    }

    public void setRoute_name(String route_name) {
        this.route_name = route_name;
    }

    public String getStart_latitude() {
        return start_latitude;
    }

    public void setStart_latitude(String start_latitude) {
        this.start_latitude = start_latitude;
    }

    public String getStart_longitude() {
        return start_longitude;
    }

    public void setStart_longitude(String start_longitude) {
        this.start_longitude = start_longitude;
    }

    public String getEnd_latitude() {
        return end_latitude;
    }

    public void setEnd_latitude(String end_latitude) {
        this.end_latitude = end_latitude;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public String getEnd_longitude() {
        return end_longitude;
    }

    public void setEnd_longitude(String end_longitude) {
        this.end_longitude = end_longitude;
    }
}
