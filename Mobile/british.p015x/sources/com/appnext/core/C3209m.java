package com.appnext.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.appnext.base.C3117a;

/* renamed from: com.appnext.core.m */
public class C3209m {

    /* renamed from: dZ */
    private static final String f12374dZ = "m";

    /* renamed from: ea */
    private static volatile C3209m f12375ea;

    /* renamed from: aM */
    private Context f12376aM;

    /* renamed from: cv */
    private SharedPreferences f12377cv;

    private C3209m(Context context) {
        if (context != null) {
            this.f12376aM = context;
            this.f12377cv = context.getSharedPreferences("sp_response_preferences", 0);
        }
    }

    /* renamed from: l */
    public static C3209m m10816l(Context context) {
        if (f12375ea == null) {
            synchronized (C3209m.class) {
                if (f12375ea == null) {
                    f12375ea = new C3209m(context.getApplicationContext());
                }
            }
        }
        return f12375ea;
    }

    /* renamed from: a */
    public final long mo10816a(String str, long j) {
        try {
            SharedPreferences sharedPreferences = this.f12377cv;
            if (sharedPreferences != null) {
                return sharedPreferences.getLong(str, 0);
            }
            return 0;
        } catch (Throwable th) {
            C3117a.m10553a("SPResponse$getLong", th);
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo10818b(String str, long j) {
        try {
            SharedPreferences sharedPreferences = this.f12377cv;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong(str, j).apply();
            }
        } catch (Throwable th) {
            C3117a.m10553a("SPResponse$putLong", th);
        }
    }

    /* renamed from: d */
    public final String mo10819d(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f12377cv;
            return sharedPreferences != null ? sharedPreferences.getString(str, str2) : str2;
        } catch (Throwable th) {
            C3117a.m10553a("SPResponse$getString", th);
            return str2;
        }
    }

    /* renamed from: e */
    public final void mo10820e(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f12377cv;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str, str2).apply();
            }
        } catch (Throwable th) {
            C3117a.m10553a("SPResponse$putString", th);
        }
    }

    /* renamed from: a */
    public final int mo10815a(String str, int i) {
        try {
            SharedPreferences sharedPreferences = this.f12377cv;
            if (sharedPreferences != null) {
                return sharedPreferences.getInt(str, 0);
            }
            return 0;
        } catch (Throwable th) {
            C3117a.m10553a("SPResponse$getInt", th);
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo10817b(String str, int i) {
        try {
            SharedPreferences sharedPreferences = this.f12377cv;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt(str, i).apply();
            }
        } catch (Throwable th) {
            C3117a.m10553a("SPResponse$putInt", th);
        }
    }
}
