package com.allsunny.myzhihudaily;

import android.app.Application;

public class MyApplication extends Application
{

	private static String TAG = "MyApplication";
	private static MyApplication application;

	public static MyApplication getInstance()
	{
		return application;
	}

	public void onCreate()
	{
		super.onCreate();
		application = this;
	}

}
