package com.allsunny.myzhihudaily.http;

import com.allsunny.myzhihudaily.bean.StoriesList;
import com.allsunny.myzhihudaily.bean.StoryDetail;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

import static com.allsunny.myzhihudaily.utils.Constants.BASE_URL;
import static com.allsunny.myzhihudaily.utils.Constants.LAST_NEWS;
import static com.allsunny.myzhihudaily.utils.Constants.NEWS;

/**
 * Created by allsunny on 2016/12/15.
 */

public class RetrofitClient {

    static Retrofit mRetrofit;

    public static Retrofit retrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return mRetrofit;
    }

    public interface ApiStores {
        @GET(LAST_NEWS)
        Call<StoriesList> getStoriesList();

        @GET(NEWS + "/{id}")
        Call<StoryDetail> getStoryDetail(@Path("id") int id);
    }
}
