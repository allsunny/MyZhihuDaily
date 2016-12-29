package com.allsunny.myzhihudaily.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        SwipeRefreshLayout.OnRefreshListener,
        StoriesListAdapter.OnItemClickListener {

    private List<Story> mStoriesList = new ArrayList<>();
    private List<TopStory> mTopStoryList = new ArrayList<>();
    private StoriesListAdapter mStoryAdapter;

    private RecyclerView mRcvStoryList;
    private DrawerLayout mDrawer;
    private NavigationView mNavigationView;
    private SwipeRefreshLayout mSrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        layoutResID = R.layout.activity_main;
        super.onCreate(savedInstanceState);
        initView();
        configRecyclerView();
    }

    private void initView() {
        mSrl = (SwipeRefreshLayout) findViewById(R.id.srl_refresh);
        mRcvStoryList = (RecyclerView) findViewById(R.id.rcv_story_list);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
    }

    private void configRecyclerView() {

        getSupportActionBar().setTitle("首页");//设置主标题

        // 刷新时，指示器旋转后变化的颜色
     //   mSrl.setColorSchemeResources(R.color.darkred, R.color.darkred);
        mSrl.setOnRefreshListener(this);

        mStoryAdapter = new StoriesListAdapter(MainActivity.this, mStoriesList);
        mStoryAdapter.setOnItemClickListener(this);
        mRcvStoryList.setLayoutManager(new LinearLayoutManager(this));
        mRcvStoryList.setAdapter(mStoryAdapter);
        getStoriesList();

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer, mToolBar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.addDrawerListener(toggle);  //设置drawer的开关监听
        //该方法会自动和actionBar关联, 将开关的图片显示在了action上，如果不设置，也可以有抽屉的效果，不过是默认的图标
        //ActionBarDrawerToggle与DrawerLayout的状态同步
        toggle.syncState();

        mNavigationView.setNavigationItemSelectedListener(this);
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
                        mStoryAdapter.notifyDataSetChanged();
                    }
                }

            }

            @Override
            public void onFailure(Call<StoriesList> call, Throwable t) {

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
            case R.id.action_dark_mode:
                item.setIcon(R.drawable.menu_day);
                break;
            case R.id.action_settings:
                break;
            case R.id.action_about:
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(this, StoryDetailActivity.class);
        intent.putExtra("ID", mStoriesList.get(position).getId());
        startActivity(intent);

    }

    @Override
    public void onItemLongClick(View view, int position) {
        Toast.makeText(this, "Long Item Click", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        mDrawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onRefresh() {
        getStoriesList();
        mSrl.setRefreshing(false);
    }
}
