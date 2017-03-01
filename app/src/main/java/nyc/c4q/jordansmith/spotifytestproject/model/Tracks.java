package nyc.c4q.jordansmith.spotifytestproject.model;

import java.util.List;

/**
 * Created by jordansmith on 2/27/17.
 */

public class Tracks {

    private String href;
    private List<Item> items = null;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
