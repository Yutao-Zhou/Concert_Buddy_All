package com.concertbuddy.concertbuddyuser.user;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;

public class TracksResponse {
    public String href;
    public List<SongItem> items;
    public int limit;
    public String next;
    public int offset;
    public String previous;
    public int total;

    public List<SongItem> getItems() {
        return items;
    }
}

class SongItem {
    public String added_at;

    public AddedBy added_by;

    public boolean is_local;

    public String primary_color;

    public Track track;

    public VideoThumbnail video_thumbnail;

    public Track getTrack() {
        return track;
    }
}

class AddedBy {
    public ExternalUrls external_urls;
    public String href;
    public String id;
    public String type;
    public String uri;
}

class Track {
    public Album album;
    public List<Artist> artists;
    public List<String> available_markets;
    public int disc_number;
    public long duration_ms;
    public boolean episode;
    public boolean explicit;
    public ExternalIds external_ids;
    public ExternalUrls external_urls;
    public String href;
    public String id;
    public boolean is_local;
    public String name;
    public int popularity;
    public String preview_url;
    public boolean track;
    public int track_number;
    public String type;
    public String uri;

    public List<Artist> getArtists() {
        return artists;
    }

    public String getName() {
        return name;
    }
}

class Album {
    public String album_type;
    public List<Artist> artists;
    public List<String> available_markets;
    public ExternalUrls external_urls;
    public String href;
    public String id;
    public List<Image> images;
    public String name;
    public String release_date;
    public String release_date_precision;
    public int total_tracks;
    public String type;
    public String uri;


}

class Artist {
    public ExternalUrls external_urls;
    public String href;
    public String id;
    public String name;
    public String type;
    public String uri;

    public String getName() {
        return name;
    }
}

class ExternalIds {
    public String isrc;

}

class VideoThumbnail {
    public String url;

}