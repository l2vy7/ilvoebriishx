package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.C3642m;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.appevents.b */
/* compiled from: AnalyticsUserIDStore */
class C3390b {

    /* renamed from: a */
    private static final String f12817a = "b";

    /* renamed from: b */
    private static ReentrantReadWriteLock f12818b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static String f12819c;

    /* renamed from: d */
    private static volatile boolean f12820d = false;

    /* renamed from: com.facebook.appevents.b$a */
    /* compiled from: AnalyticsUserIDStore */
    static class C3391a implements Runnable {
        C3391a() {
        }

        public void run() {
            C3390b.m11356c();
        }
    }

    /* renamed from: b */
    public static String m11355b() {
        if (!f12820d) {
            Log.w(f12817a, "initStore should have been called before calling setUserID");
            m11356c();
        }
        f12818b.readLock().lock();
        try {
            return f12819c;
        } finally {
            f12818b.readLock().unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m11356c() {
        if (!f12820d) {
            f12818b.writeLock().lock();
            try {
                if (!f12820d) {
                    f12819c = PreferenceManager.getDefaultSharedPreferences(C3642m.m12279e()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", (String) null);
                    f12820d = true;
                    f12818b.writeLock().unlock();
                }
            } finally {
                f12818b.writeLock().unlock();
            }
        }
    }

    /* renamed from: d */
    public static void m11357d() {
        if (!f12820d) {
            C3420m.m11430b().execute(new C3391a());
        }
    }
}
