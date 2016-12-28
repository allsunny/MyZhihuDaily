package com.allsunny.myzhihudaily.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.allsunny.myzhihudaily.R;
import com.allsunny.myzhihudaily.bean.StoriesList;
import com.allsunny.myzhihudaily.bean.StoryDetail;
import com.allsunny.myzhihudaily.http.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.allsunny.myzhihudaily.utils.Constants.STORY_FORMAT;
import static com.allsunny.myzhihudaily.utils.Constants.STORY_FORMAT_NIGHT;
import static com.allsunny.myzhihudaily.utils.Constants.STORY_LARGE_FONT;

/**
 * Created by allsunny on 2016/11/29.
 */

public class StoryDetailActivity extends BaseActivity {

    private int mStoryID;
    private String mStoryBody;

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        layoutResID = R.layout.activity_story_detail;
        super.onCreate(savedInstanceState);
        initView();
        initData();

    }

    private void initView() {
        mWebView = (WebView) findViewById(R.id.web_view);
    }

    private void initData() {
        mStoryID = getIntent().getIntExtra("ID", 9022909);
        getStoryDetail(mStoryID);
    }

    private void configView() {
        mWebView.getSettings().setJavaScriptEnabled(true); //support show JS
        mWebView.loadDataWithBaseURL("file:///android_asset/", mStoryBody, "text/html", "UTF-8", null);
    }

    private void getStoryDetail(int storyID) {
        RetrofitClient.ApiStores apiStores = RetrofitClient.retrofit().create(RetrofitClient.ApiStores.class);
        Call<StoryDetail> call = apiStores.getStoryDetail(storyID);
        call.enqueue(new Callback<StoryDetail>() {
            @Override
            public void onResponse(Call<StoryDetail> call, final Response<StoryDetail> response) {
                if (response != null) {
                    mStoryBody = STORY_FORMAT + response.body().getBody() + "</body></html>";
                    configView();
                }
            }

            @Override
            public void onFailure(Call<StoryDetail> call, Throwable t) {

            }

        });
    }

}
