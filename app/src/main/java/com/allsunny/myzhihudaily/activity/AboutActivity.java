package com.allsunny.myzhihudaily.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;

import com.allsunny.myzhihudaily.R;

/**
 * Created by huangh on 2016/12/1.
 */

public class AboutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        layoutResID = R.layout.activity_about;
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        ActionBar mActionBar = getSupportActionBar();
        if (mActionBar != null) {
            mActionBar.setDisplayHomeAsUpEnabled(true);
            mActionBar.setTitle(R.string.action_about);
        }
    }
}
