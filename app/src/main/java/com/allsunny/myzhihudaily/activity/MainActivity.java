package com.allsunny.myzhihudaily.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.allsunny.myzhihudaily.R;
import com.allsunny.myzhihudaily.adapter.StoriesListAdapter;
import com.allsunny.myzhihudaily.bean.StoriesList;
import com.allsunny.myzhihudaily.bean.Story;
import com.allsunny.myzhihudaily.bean.TopStory;
import com.allsunny.myzhihudaily.http.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {

    private List<Story> mStoriesList = new ArrayList<>();
    private List<TopStory> mTopStoryList = new ArrayList<>();
    private StoriesListAdapter mStoryAdapter;

    //   @BindView(R.id.rcv_story_list)
    private RecyclerView mRcvStoryList;
/*    @BindView(R.id.srl_refresh)
    SwipeRefreshLayout mSrlRefresh;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        layoutResID = R.layout.activity_main;
        super.onCreate(savedInstanceState);
        initView();
        configRecyclerView();
    }

    private void initView() {
        getSupportActionBar().setTitle("首页");//设置主标题
        mRcvStoryList = (RecyclerView) findViewById(R.id.rcv_story_list);
    }

    private void configRecyclerView() {

    //    mStoryAdapter = new StoriesListAdapter(this, mStoriesList);
        mRcvStoryList.setLayoutManager(new LinearLayoutManager(this));
    //    mRcvStoryList.setAdapter(mStoryAdapter);
        getStoriesList();


    }

    private void getStoriesList() {
        RetrofitClient.ApiStores apiStores = RetrofitClient.retrofit().create(RetrofitClient.ApiStores.class);
        Call<StoriesList> call = apiStores.getStoriesList();
        call.enqueue(new Callback<StoriesList>() {
            @Override
            public void onResponse(Call<StoriesList> call, final Response<StoriesList> response) {
                if (response != null) {
                    mStoriesList.clear();
                    mStoriesList.addAll(response.body().getStories());
                    mTopStoryList.clear();
                    mTopStoryList.addAll(response.body().getTop_stories());

                    if (mStoryAdapter != null) {
                        mStoryAdapter.updateData(mStoriesList);
                    }
                }
                Log.e("wtf", "Story=" + mStoriesList.get(0).getTitle());
            }

            @Override
            public void onFailure(Call<StoriesList> call, Throwable t) {
                Log.e("what", "error");
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_notification:
                break;
            case R.id.action_dark_mode:
                break;
            case R.id.action_settings:
                break;
            case R.id.action_about:
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
