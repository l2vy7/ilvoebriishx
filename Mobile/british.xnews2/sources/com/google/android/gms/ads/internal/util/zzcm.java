package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.cp0;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcm {

    /* renamed from: a */
    private final View f27897a;

    /* renamed from: b */
    private Activity f27898b;

    /* renamed from: c */
    private boolean f27899c;

    /* renamed from: d */
    private boolean f27900d;

    /* renamed from: e */
    private boolean f27901e;

    /* renamed from: f */
    private final ViewTreeObserver.OnGlobalLayoutListener f27902f;

    public zzcm(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f27898b = activity;
        this.f27897a = view;
        this.f27902f = onGlobalLayoutListener;
    }

    /* renamed from: a */
    private static ViewTreeObserver m28835a(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: b */
    private final void m28836b() {
        if (!this.f27899c) {
            Activity activity = this.f27898b;
            if (activity != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f27902f;
                ViewTreeObserver a = m28835a(activity);
                if (a != null) {
                    a.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            zzt.zzx();
            cp0.m31076a(this.f27897a, this.f27902f);
            this.f27899c = true;
        }
    }

    /* renamed from: c */
    private final void m28837c() {
        Activity activity = this.f27898b;
        if (activity != null && this.f27899c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f27902f;
            ViewTreeObserver a = m28835a(activity);
            if (a != null) {
                zzt.zzq();
                a.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f27899c = false;
        }
    }

    public final void zza() {
        this.f27901e = false;
        m28837c();
    }

    public final void zzb() {
        this.f27901e = true;
        if (this.f27900d) {
            m28836b();
        }
    }

    public final void zzc() {
        this.f27900d = true;
        if (this.f27901e) {
            m28836b();
        }
    }

    public final void zzd() {
        this.f27900d = false;
        m28837c();
    }

    public final void zze(Activity activity) {
        this.f27898b = activity;
    }
}
