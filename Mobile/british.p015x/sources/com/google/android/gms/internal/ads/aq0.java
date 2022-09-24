package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.C4604n;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class aq0 {

    /* renamed from: a */
    private final Context f29719a;

    /* renamed from: b */
    private final mq0 f29720b;

    /* renamed from: c */
    private final ViewGroup f29721c;

    /* renamed from: d */
    private zp0 f29722d;

    public aq0(Context context, ViewGroup viewGroup, xt0 xt0) {
        this.f29719a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f29721c = viewGroup;
        this.f29720b = xt0;
        this.f29722d = null;
    }

    /* renamed from: a */
    public final zp0 mo30464a() {
        C4604n.m20093f("getAdVideoUnderlay must be called from the UI thread.");
        return this.f29722d;
    }

    /* renamed from: b */
    public final void mo30465b(int i, int i2, int i3, int i4) {
        C4604n.m20093f("The underlay may only be modified from the UI thread.");
        zp0 zp0 = this.f29722d;
        if (zp0 != null) {
            zp0.mo19067d(i, i2, i3, i4);
        }
    }

    /* renamed from: c */
    public final void mo30466c(int i, int i2, int i3, int i4, int i5, boolean z, lq0 lq0) {
        if (this.f29722d == null) {
            w00.m39004a(this.f29720b.zzo().mo18174a(), this.f29720b.zzn(), "vpr2");
            Context context = this.f29719a;
            mq0 mq0 = this.f29720b;
            zp0 zp0 = new zp0(context, mq0, i5, z, mq0.zzo().mo18174a(), lq0);
            this.f29722d = zp0;
            this.f29721c.addView(zp0, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            this.f29722d.mo19067d(i, i2, i3, i4);
            this.f29720b.mo18713C(false);
        }
    }

    /* renamed from: d */
    public final void mo30467d() {
        C4604n.m20093f("onDestroy must be called from the UI thread.");
        zp0 zp0 = this.f29722d;
        if (zp0 != null) {
            zp0.mo19073o();
            this.f29721c.removeView(this.f29722d);
            this.f29722d = null;
        }
    }

    /* renamed from: e */
    public final void mo30468e() {
        C4604n.m20093f("onPause must be called from the UI thread.");
        zp0 zp0 = this.f29722d;
        if (zp0 != null) {
            zp0.mo19079t();
        }
    }

    /* renamed from: f */
    public final void mo30469f(int i) {
        C4604n.m20093f("setPlayerBackgroundColor must be called from the UI thread.");
        zp0 zp0 = this.f29722d;
        if (zp0 != null) {
            zp0.mo19064a(i);
        }
    }
}
