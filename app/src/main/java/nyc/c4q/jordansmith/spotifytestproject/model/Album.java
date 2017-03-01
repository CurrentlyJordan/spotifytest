package nyc.c4q.jordansmith.spotifytestproject.model;

import java.util.List;

/**
 * Created by jordansmith on 2/27/17.
 */

public class Album {

    private String albumType;
    private List<Artist> artists = null;
    private List<String> availableMarkets = null;
    private String href;
    private String id;
    private List<nyc.c4q.jordansmith.spotifytestproject.model.Image> images = null;
    private String name;
    private String type;
    private String uri;

    public String getAlbumType() {
        return albumType;
    }

    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<nyc.c4q.jordansmith.spotifytestproject.model.Image> getImages() {
        return images;
    }

    public void setImages(List<nyc.c4q.jordansmith.spotifytestproject.model.Image> images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

}