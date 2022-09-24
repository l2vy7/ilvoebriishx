package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;

public class ContextProvider {

    /* renamed from: e */
    private static volatile ContextProvider f21976e;

    /* renamed from: a */
    private Activity f21977a;

    /* renamed from: b */
    private Context f21978b;

    /* renamed from: c */
    private ConcurrentHashMap<String, C4951a> f21979c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private Handler f21980d = new Handler(Looper.getMainLooper());

    /* renamed from: com.ironsource.environment.ContextProvider$a */
    public interface C4951a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f21976e == null) {
            synchronized (ContextProvider.class) {
                if (f21976e == null) {
                    f21976e = new ContextProvider();
                }
            }
        }
        return f21976e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f21977a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context getApplicationContext() {
        /*
            r2 = this;
            android.content.Context r0 = r2.f21978b
            if (r0 != 0) goto L_0x000c
            android.app.Activity r1 = r2.f21977a
            if (r1 == 0) goto L_0x000c
            android.content.Context r0 = r1.getApplicationContext()
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.ContextProvider.getApplicationContext():android.content.Context");
    }

    public Activity getCurrentActiveActivity() {
        return this.f21977a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            for (C4951a onPause : this.f21979c.values()) {
                onPause.onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f21977a = activity;
            for (C4951a onResume : this.f21979c.values()) {
                onResume.onResume(this.f21977a);
            }
        }
    }

    public void postOnUIThread(Runnable runnable) {
        Handler handler = this.f21980d;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void registerLifeCycleListener(C4951a aVar) {
        this.f21979c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void runOnUIThread(Runnable runnable) {
        Activity activity = this.f21977a;
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f21977a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f21978b = context;
        }
    }
}
