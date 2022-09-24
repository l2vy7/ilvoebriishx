package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;

/* renamed from: com.facebook.appevents.g */
/* compiled from: AppEventsLogger */
public class C3406g {

    /* renamed from: a */
    private C3408h f12850a;

    /* renamed from: com.facebook.appevents.g$a */
    /* compiled from: AppEventsLogger */
    public enum C3407a {
        AUTO,
        EXPLICIT_ONLY
    }

    private C3406g(Context context, String str, AccessToken accessToken) {
        this.f12850a = new C3408h(context, str, accessToken);
    }

    /* renamed from: a */
    public static void m11393a(Application application, String str) {
        C3408h.m11402a(application, str);
    }

    /* renamed from: c */
    public static String m11394c(Context context) {
        return C3408h.m11405e(context);
    }

    /* renamed from: d */
    public static C3407a m11395d() {
        return C3408h.m11406f();
    }

    /* renamed from: e */
    public static String m11396e() {
        return C3390b.m11355b();
    }

    /* renamed from: f */
    public static void m11397f(Context context, String str) {
        C3408h.m11409i(context, str);
    }

    /* renamed from: h */
    public static C3406g m11398h(Context context) {
        return new C3406g(context, (String) null, (AccessToken) null);
    }

    /* renamed from: i */
    public static void m11399i() {
        C3408h.m11413u();
    }

    /* renamed from: b */
    public void mo11828b() {
        this.f12850a.mo11830c();
    }

    /* renamed from: g */
    public void mo11829g(String str, Bundle bundle) {
        this.f12850a.mo11832m(str, bundle);
    }
}
