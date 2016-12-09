package com.allsunny.myzhihudaily.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.allsunny.myzhihudaily.utils.Constants.BASE_URL;

/**
 * Created by allsunny on 2016/12/8.
 */

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsListHolder>{

    @Override
    public NewsListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(NewsListHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class NewsListHolder extends RecyclerView.ViewHolder {

        public NewsListHolder(View itemView) {
            super(itemView);
        }
    }
}
