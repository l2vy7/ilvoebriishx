package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C7249h {

    /* renamed from: a */
    private final Object f29016a;

    public C7249h(Activity activity) {
        C4604n.m20099l(activity, "Activity must not be null");
        this.f29016a = activity;
    }

    /* renamed from: a */
    public final Activity mo29862a() {
        return (Activity) this.f29016a;
    }

    /* renamed from: b */
    public final FragmentActivity mo29863b() {
        return (FragmentActivity) this.f29016a;
    }

    /* renamed from: c */
    public final boolean mo29864c() {
        return this.f29016a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean mo29865d() {
        return this.f29016a instanceof FragmentActivity;
    }
}
