package com.allsunny.myzhihudaily.utils;

import android.util.Log;

public class LogUtils
{

    private static boolean OPEN_LOG;
    private static boolean isOpenLog;

    public LogUtils()
    {
    }

    public static void d(String s, String s1)
    {
        if (OPEN_LOG)
            Log.d(s, s1);
    }

    public static void e(String s, String s1)
    {
        Log.e(s, s1);
    }

    public static void i(String s, String s1)
    {
        if (OPEN_LOG)
            Log.i(s, s1);
    }

    public static void system_print(String s)
    {
        if (OPEN_LOG)
            System.out.println(s);
    }

    public static void v(String s, String s1)
    {
        if (OPEN_LOG)
            Log.v(s, s1);
    }

    public static void w(String s, String s1)
    {
        Log.w(s, s1);
    }

    public static void wtf(String s, String s1)
    {
        if (OPEN_LOG)
            Log.wtf(s, s1);
    }

    static
    {
        isOpenLog = false;
        OPEN_LOG = isOpenLog;
    }
}

