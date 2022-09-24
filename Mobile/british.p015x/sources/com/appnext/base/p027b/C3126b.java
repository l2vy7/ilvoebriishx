package com.appnext.base.p027b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.appnext.base.C3117a;

@SuppressLint({"CommitPrefEdits"})
/* renamed from: com.appnext.base.b.b */
public final class C3126b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: cw */
    private static final C3126b f12203cw = new C3126b();

    /* renamed from: aM */
    private Context f12204aM;

    /* renamed from: cv */
    private SharedPreferences f12205cv;

    private C3126b() {
        Context context = C3125a.getContext();
        this.f12204aM = context;
        if (context != null) {
            this.f12205cv = context.getSharedPreferences("LibrarySettings", 0);
        }
    }

    /* renamed from: ak */
    public static C3126b m10572ak() {
        return f12203cw;
    }

    /* renamed from: a */
    public final long mo10548a(String str, long j) {
        try {
            SharedPreferences sharedPreferences = this.f12205cv;
            return sharedPreferences != null ? sharedPreferences.getLong(str, j) : j;
        } catch (Throwable th) {
            C3117a.m10553a("LibrarySettings$getLong", th);
            return j;
        }
    }

    /* renamed from: al */
    public final void mo10549al() {
        try {
            SharedPreferences sharedPreferences = this.f12205cv;
            if (sharedPreferences != null) {
                sharedPreferences.edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo10550b(String str, long j) {
        try {
            SharedPreferences sharedPreferences = this.f12205cv;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong(str, j).apply();
            }
        } catch (Throwable th) {
            C3117a.m10553a("LibrarySettings$putLong", th);
        }
    }

    /* renamed from: d */
    public final String mo10552d(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f12205cv;
            return sharedPreferences != null ? sharedPreferences.getString(str, str2) : str2;
        } catch (Throwable th) {
            C3117a.m10553a("LibrarySettings$getString", th);
            return str2;
        }
    }

    /* renamed from: e */
    public final void mo10553e(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f12205cv;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str, str2).apply();
            }
        } catch (Throwable th) {
            C3117a.m10553a("LibrarySettings$putString", th);
        }
    }

    public final void init(Context context) {
        if (context != null) {
            this.f12204aM = context;
            this.f12205cv = context.getSharedPreferences("lib_shared_preferences", 0);
        }
    }

    /* renamed from: b */
    public final void mo10551b(String str, boolean z) {
        try {
            SharedPreferences sharedPreferences = this.f12205cv;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putBoolean(str, true).apply();
            }
        } catch (Throwable th) {
            C3117a.m10553a("LibrarySettings$putBoolean", th);
        }
    }
}
