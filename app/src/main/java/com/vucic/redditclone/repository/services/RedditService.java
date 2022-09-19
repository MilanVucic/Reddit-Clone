package com.vucic.redditclone.repository.services;

import com.vucic.redditclone.repository.models.HomePageResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RedditService {
    @GET(".json")
    Call<HomePageResponse> getHomePage();
}
