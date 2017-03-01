package nyc.c4q.jordansmith.spotifytestproject;

import nyc.c4q.jordansmith.spotifytestproject.model.Example;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by jordansmith on 2/27/17.
 */

public interface SpotifyService {

    @GET("/v1/search")
    Call<Example> getResults(@Header("Authorization")String accessToken, @Query("q") String searchInput, @Query("type") String type, @Query("market") String market);

    @GET("/v1/search")
    Call<Example> getOtherResults(@Query("q") String searchInput, @Query("type") String type);

}
