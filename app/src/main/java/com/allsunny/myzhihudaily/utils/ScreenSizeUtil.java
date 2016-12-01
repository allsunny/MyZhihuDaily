package com.allsunny.myzhihudaily.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.allsunny.myzhihudaily.MyApplication;


public class ScreenSizeUtil
{
	public static interface OnMeasuredBoundsListener
	{

		public abstract void onSuccess(int i, int j);
	}

	public static int convertDp2Px(Context context, float f)
	{
		return (int)(f * context.getResources().getDisplayMetrics().density + 0.5F);
	}

	public static int convertPx2Dp(Context context, float f)
	{
		return (int)(f / context.getResources().getDisplayMetrics().density + 0.5F);
	}

	public static int convertPx2Sp(Context context, float f)
	{
		return (int)(f / context.getResources().getDisplayMetrics().scaledDensity + 0.5F);
	}

	public static int convertSp2Px(Context context, float f)
	{
		return (int)(f * context.getResources().getDisplayMetrics().scaledDensity + 0.5F);
	}

	public static int dp2px(float f)
	{
		return (int) TypedValue.applyDimension(1, f, MyApplication.getInstance().getResources().getDisplayMetrics());
	}

	public static int dp2px(int i)
	{
		return (int) TypedValue.applyDimension(1, i, MyApplication.getInstance().getResources().getDisplayMetrics());
	}

	public static int getListViewTotalHieght(ListView listview)
	{
		int j = 0;
		ListAdapter listadapter = listview.getAdapter();
		if (listadapter == null)
			return 0;
		for (int i = 0; i < listadapter.getCount(); i++)
		{
			View view = listadapter.getView(i, null, listview);
			view.measure(0, 0);
			j += view.getMeasuredHeight();
		}

		return j;
	}

	public static int getScreenHeight()
	{
		return MyApplication.getInstance().getResources().getDisplayMetrics().heightPixels;
	}

	public static int getScreenHeight(Context context)
	{
		return context.getResources().getDisplayMetrics().heightPixels;
	}

	public static int getScreenWidth()
	{
		return MyApplication.getInstance().getResources().getDisplayMetrics().widthPixels;
	}

	public static int getScreenWidth(Context context)
	{
		return context.getResources().getDisplayMetrics().widthPixels;
	}

	public static int getStatusBarHeight(Activity activity)
	{
		Rect rect = new Rect();
		activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
		return rect.top;
	}

	public static int getWidgetHeight(View view)
	{
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
		return view.getMeasuredHeight();
	}

	public static int getWidgetWidth(View view)
	{
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
		return view.getMeasuredWidth();
	}

	public static int px2dp(float f)
	{
		return (int)(f / MyApplication.getInstance().getResources().getDisplayMetrics().density + 0.5F);
	}

	public static int px2dp(int i)
	{
		float f = MyApplication.getInstance().getResources().getDisplayMetrics().density;
		return (int)((float)i / f + 0.5F);
	}
}
