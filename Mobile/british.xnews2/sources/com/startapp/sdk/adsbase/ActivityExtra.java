package com.startapp.sdk.adsbase;

import android.app.Activity;
import java.io.Serializable;

/* compiled from: Sta */
public class ActivityExtra implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean isActivityFullScreen;

    public ActivityExtra(Activity activity) {
        mo20836a(C5055a.m23155a(activity));
    }

    /* renamed from: a */
    public boolean mo20837a() {
        return this.isActivityFullScreen;
    }

    /* renamed from: a */
    public final void mo20836a(boolean z) {
        this.isActivityFullScreen = z;
    }
}
