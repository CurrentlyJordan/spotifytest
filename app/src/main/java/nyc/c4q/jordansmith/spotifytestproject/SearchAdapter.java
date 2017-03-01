package nyc.c4q.jordansmith.spotifytestproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import nyc.c4q.jordansmith.spotifytestproject.model.Item;

/**
 * Created by jordansmith on 2/27/17.
 */

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> {
    List<Item> itemList;
    Listener listener;

    SearchAdapter(List<Item> itemList, Listener listener){
        this.itemList = itemList;
        this.listener = listener;
    }


    @Override
    public SearchAdapter.SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.track_item_view, parent,false);
        return new SearchViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(final SearchViewHolder holder, int position) {
        holder.artistName.setText(itemList.get(position).getArtists().get(0).getName());
        holder.songName.setText(itemList.get(position).getName());
        Glide.with(holder.itemView.getContext()).load(itemList.get(position).getAlbum().getImages().get(0).getUrl()).into(holder.albumArt);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.playSelectedTrack(itemList.get(holder.getAdapterPosition()).getUri());
            }
        });


    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class SearchViewHolder extends RecyclerView.ViewHolder {
        ImageView albumArt;
        TextView artistName;
        TextView songName;

        public SearchViewHolder(View itemView) {
            super(itemView);
            albumArt = (ImageView) itemView.findViewById(R.id.album_art_text_view);
            artistName = (TextView) itemView.findViewById(R.id.artist_name_text_view);
            songName = (TextView) itemView.findViewById(R.id.song_name_text_view);

        }
    }
}
