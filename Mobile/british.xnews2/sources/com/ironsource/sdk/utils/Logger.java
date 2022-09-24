package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.sdk.p293g.C11703d;

public class Logger {

    /* renamed from: a */
    private static boolean f52483a;

    /* renamed from: d */
    public static void m51949d(String str, String str2) {
        if (f52483a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: d */
    public static void m51950d(String str, String str2, Throwable th) {
        if (f52483a) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m51951e(String str, String str2) {
        if (f52483a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: e */
    public static void m51952e(String str, String str2, Throwable th) {
        if (f52483a) {
            Log.e(str, str2, th);
        }
    }

    public static void enableLogging(int i) {
        f52483a = C11703d.C11707d.MODE_0.f52417d != i;
    }

    /* renamed from: i */
    public static void m51953i(String str, String str2) {
        if (f52483a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: i */
    public static void m51954i(String str, String str2, Throwable th) {
        if (f52483a && !TextUtils.isEmpty(str2)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m51955v(String str, String str2) {
        if (f52483a) {
            Log.v(str, str2);
        }
    }

    /* renamed from: v */
    public static void m51956v(String str, String str2, Throwable th) {
        if (f52483a) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m51957w(String str, String str2) {
        if (f52483a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: w */
    public static void m51958w(String str, String str2, Throwable th) {
        if (f52483a) {
            Log.w(str, str2, th);
        }
    }
}
