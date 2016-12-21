package com.allsunny.myzhihudaily.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.allsunny.myzhihudaily.R;
import com.allsunny.myzhihudaily.bean.Story;
import com.allsunny.myzhihudaily.bean.StoriesList;
import com.allsunny.myzhihudaily.http.RetrofitClient;

import java.util.List;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {

    private List<Story> mStorise;

    @BindView(R.id.rcv_news_list)
    RecyclerView mRcvNewsList;
    @BindView(R.id.srl_refresh)
    SwipeRefreshLayout mSrlRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        layoutResID = R.layout.activity_main;
        super.onCreate(savedInstanceState);
        initView();
        configRecyclerView();
    }

    private void initView() {
        getSupportActionBar().setTitle("首页");//设置主标题
    }

    private void configRecyclerView() {
        getStoriesList();

    }

    private void getStoriesList() {
        RetrofitClient.ApiStores apiStores = RetrofitClient.retrofit().create(RetrofitClient.ApiStores.class);
        Call<StoriesList> call = apiStores.getStoriesList();
        call.enqueue(new Callback<StoriesList>() {
            @Override
            public void onResponse(Call<StoriesList> call, Response<StoriesList> response) {
                mStorise = response.body().getStories();
                Log.e("wtf", "Story=" + response.body().getStories().get(0).getTitle());
            }

            @Override
            public void onFailure(Call<StoriesList> call, Throwable t) {
                Log.e("what","error");
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
