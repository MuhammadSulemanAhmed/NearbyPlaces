package com.example.suleman_pc.myapplication786;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by suleman-pc on 3/19/2018.
 */

public interface NearByApi {
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyAjTZo7nIo-Cju-EbAzJwiuZ5hOzddxG-Q")
    Call<NearByApiResponse> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);
}
