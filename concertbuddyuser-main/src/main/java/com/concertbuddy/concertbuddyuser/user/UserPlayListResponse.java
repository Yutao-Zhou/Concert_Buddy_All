package com.concertbuddy.concertbuddyuser.user;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;

public class UserPlayListResponse {
    public String href;
    public List<PlaylistItem> items;
    public int limit;
    public String next;
    public int offset;
    public String previous;
    public int total;

    public List<PlaylistItem> getItems() {
        return items;
    }
}

class PlaylistItem {
    public boolean collaborative;
    public String description;
    public ExternalUrls external_urls;
    public String href;
    public String id;
    public List<Image> images;
    public String name;
    public Owner owner;
    public String primary_color;
    @JsonProperty("public")
    public boolean isPublic;
    public String snapshot_id;
    public Tracks tracks;
    public String type;
    public String uri;

    public Owner getOwner() {
        return owner;
    }

    public Tracks getTracks() {
        return tracks;
    }
}

class ExternalUrls {
    public String spotify;


}

class Image {
    public int height;
    public String url;
    public int width;

}

class Owner {
    public String display_name;
    public ExternalUrls external_urls;
    public String href;
    public String id;
    public String type;
    public String uri;

    public String getId() {
        return id;
    }
}

class Tracks {
    public String href;
    public int total;

    public String getHref() {
        return href;
    }
}