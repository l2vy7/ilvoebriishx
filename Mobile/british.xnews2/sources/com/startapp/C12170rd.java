package com.startapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.iab.omid.library.startio.publisher.AdSessionStatePublisher;
import java.util.Collections;

/* renamed from: com.startapp.rd */
/* compiled from: Sta */
public class C12170rd implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    public static C12170rd f54116d = new C12170rd();

    /* renamed from: a */
    public boolean f54117a;

    /* renamed from: b */
    public boolean f54118b;

    /* renamed from: c */
    public C12171a f54119c;

    /* renamed from: com.startapp.rd$a */
    /* compiled from: Sta */
    public interface C12171a {
    }

    /* renamed from: a */
    public final void mo45731a(boolean z) {
        if (this.f54118b != z) {
            this.f54118b = z;
            if (this.f54117a) {
                mo45730a();
                if (this.f54119c == null) {
                    return;
                }
                if (!z) {
                    C12471za.f55206h.mo46860a();
                    return;
                }
                C12471za.f55206h.getClass();
                Handler handler = C12471za.f55208j;
                if (handler != null) {
                    handler.removeCallbacks(C12471za.f55210l);
                    C12471za.f55208j = null;
                }
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        mo45731a(false);
    }

    public void onActivityStopped(Activity activity) {
        View b;
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z = true;
            boolean z2 = runningAppProcessInfo.importance != 100;
            boolean z3 = true;
            for (T t : Collections.unmodifiableCollection(C11931gd.f53013c.f53015b)) {
                if (t.mo45460c() && (b = t.mo45459b()) != null && b.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            mo45731a(z);
        }
    }

    /* renamed from: a */
    public final void mo45730a() {
        boolean z = !this.f54118b;
        for (T t : Collections.unmodifiableCollection(C11931gd.f53013c.f53014a)) {
            AdSessionStatePublisher adSessionStatePublisher = t.f53128e;
            if (adSessionStatePublisher.f21910a.get() != null) {
                C11973ie.f53134a.mo45464a(adSessionStatePublisher.mo20421c(), "setState", z ? "foregrounded" : "backgrounded");
            }
        }
    }
}
