package com.mateuszkoslacz.moviper.sample.retrofit;


import com.mateuszkoslacz.moviper.sample.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jjodelka on 17/10/16.
 */

public interface GitHubApiInterface {
    String GitHubApiUrl = "https://api.github.com";

    @GET("/users")
    Call<List<User>> getUsers();

    @GET("/users/{username}")
    Call<User> getUserForUsername(@Path("username") String username);
}
