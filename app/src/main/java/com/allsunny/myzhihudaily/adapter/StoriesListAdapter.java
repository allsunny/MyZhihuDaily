package com.allsunny.myzhihudaily.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.allsunny.myzhihudaily.R;
import com.allsunny.myzhihudaily.bean.Story;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by allsunny on 2016/12/8.
 */

public class StoriesListAdapter extends RecyclerView.Adapter<StoriesListAdapter.StoriesListHolder> {

    public interface OnItemClickListener
    {
        void onItemClick(View view, int position);
        void onItemLongClick(View view , int position);
    }

    private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener mOnItemClickListener)
    {
        this.mOnItemClickListener = mOnItemClickListener;
    }


    private List<Story> mStoryList;
    private Context mContext;
    private LayoutInflater mInflater;

    public StoriesListAdapter(Context context, List<Story> StoryList) {
        this.mContext = context;
        this.mStoryList = StoryList;
        this.mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public StoriesListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_story, parent, false);
        StoriesListHolder mViewHolder = new StoriesListHolder(view);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(final StoriesListHolder holder, final int position) {
        holder.tvTitle.setText(mStoryList.get(position).getTitle());
        Glide.with(mContext)
                .load(mStoryList.get(position).getImages().get(0))
                .placeholder(R.drawable.image_small_default)
                .into(holder.ivStory);

        if (mOnItemClickListener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClick(holder.itemView, position);
                }
            });

            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    mOnItemClickListener.onItemLongClick(holder.itemView, position);
                    return true;
                }
            });

        }
    }

    @Override
    public int getItemCount() {
        return mStoryList == null ? 0 : mStoryList.size();
    }

    static class StoriesListHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle;
        private ImageView ivStory;

        public StoriesListHolder(View view) {
            super(view);
            tvTitle = (TextView) view.findViewById(R.id.tv_title);
            ivStory = (ImageView) view.findViewById(R.id.iv_story);
        }
    }
}
