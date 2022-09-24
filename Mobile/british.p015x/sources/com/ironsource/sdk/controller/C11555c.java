package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* renamed from: com.ironsource.sdk.controller.c */
public final class C11555c {

    /* renamed from: a */
    private MutableContextWrapper f51937a;

    /* renamed from: a */
    public final Activity mo44689a() {
        return (Activity) this.f51937a.getBaseContext();
    }

    /* renamed from: a */
    public final synchronized void mo44690a(Activity activity) {
        if (this.f51937a == null) {
            this.f51937a = new MutableContextWrapper(activity);
        }
        this.f51937a.setBaseContext(activity);
    }

    /* renamed from: b */
    public final synchronized void mo44691b() {
        this.f51937a = null;
    }
}
