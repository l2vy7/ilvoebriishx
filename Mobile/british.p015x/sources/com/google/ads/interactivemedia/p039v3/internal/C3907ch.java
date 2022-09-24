package com.google.ads.interactivemedia.p039v3.internal;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.ads.interactivemedia.p039v3.impl.data.C3760a;
import com.google.ads.interactivemedia.p039v3.impl.data.C3777aq;
import com.google.ads.interactivemedia.p039v3.impl.data.C3778ar;
import com.google.ads.interactivemedia.p039v3.impl.data.C3787b;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ch */
/* compiled from: IMASDK */
public final class C3907ch implements C3952dz {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3958ee f16811a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f16812b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final View f16813c;

    /* renamed from: d */
    private final C3905cf f16814d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3904ce f16815e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Activity f16816f = null;

    /* renamed from: g */
    private boolean f16817g = false;

    public C3907ch(String str, C3958ee eeVar, View view) {
        C3906cg cgVar = new C3906cg((byte[]) null);
        this.f16812b = str;
        this.f16811a = eeVar;
        this.f16813c = view;
        this.f16814d = cgVar;
    }

    /* renamed from: n */
    private static int m16908n(int i, float f) {
        return (int) Math.ceil((double) (((float) i) / f));
    }

    /* renamed from: o */
    private static C3778ar m16909o(C3778ar arVar, float f) {
        C3777aq builder = C3778ar.builder();
        builder.left(m16908n(arVar.left(), f));
        builder.top(m16908n(arVar.top(), f));
        builder.height(m16908n(arVar.height(), f));
        builder.width(m16908n(arVar.width(), f));
        return builder.build();
    }

    /* renamed from: p */
    private final DisplayMetrics m16910p() {
        return this.f16813c.getContext().getResources().getDisplayMetrics();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15618a(boolean z) {
        this.f16817g = z;
    }

    /* renamed from: b */
    public final void mo15619b() {
        this.f16811a.mo15711i(this, this.f16812b);
    }

    /* renamed from: c */
    public final void mo15620c() {
        this.f16811a.mo15712j(this.f16812b);
    }

    /* renamed from: d */
    public final void mo15621d() {
        Application c;
        if (this.f16817g && (c = C4130ko.m17747c(this.f16813c.getContext())) != null) {
            C3904ce ceVar = new C3904ce(this);
            this.f16815e = ceVar;
            c.registerActivityLifecycleCallbacks(ceVar);
        }
    }

    /* renamed from: e */
    public final void mo15622e() {
        C3904ce ceVar;
        Application c = C4130ko.m17747c(this.f16813c.getContext());
        if (c != null && (ceVar = this.f16815e) != null) {
            c.unregisterActivityLifecycleCallbacks(ceVar);
        }
    }

    /* renamed from: f */
    public final C3787b mo15623f(String str, String str2, String str3) {
        double d;
        C3778ar o = m16909o(C3778ar.builder().locationOnScreenOfView(this.f16813c).build(), m16910p().density);
        Rect rect = new Rect();
        boolean globalVisibleRect = this.f16813c.getGlobalVisibleRect(rect);
        IBinder windowToken = this.f16813c.getWindowToken();
        boolean z = false;
        if (!globalVisibleRect || windowToken == null || !this.f16813c.isShown()) {
            rect.set(0, 0, 0, 0);
        }
        C3777aq builder = C3778ar.builder();
        builder.left(rect.left);
        builder.top(rect.top);
        builder.height(rect.height());
        builder.width(rect.width());
        C3778ar o2 = m16909o(builder.build(), m16910p().density);
        if (!this.f16813c.getGlobalVisibleRect(new Rect()) || !this.f16813c.isShown()) {
            z = true;
        }
        AudioManager audioManager = (AudioManager) this.f16813c.getContext().getSystemService("audio");
        if (audioManager != null) {
            double streamVolume = (double) audioManager.getStreamVolume(3);
            double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
            Double.isNaN(streamVolume);
            Double.isNaN(streamMaxVolume);
            d = streamVolume / streamMaxVolume;
        } else {
            d = 0.0d;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C3760a builder2 = C3787b.builder();
        builder2.queryId(str);
        builder2.eventId(str2);
        builder2.appState(str3);
        builder2.nativeTime(currentTimeMillis);
        builder2.nativeVolume(d);
        builder2.nativeViewHidden(z);
        builder2.nativeViewBounds(o);
        builder2.nativeViewVisibleBounds(o2);
        return builder2.build();
    }

    /* renamed from: g */
    public final void mo15624g(String str, String str2) {
        this.f16811a.mo15717o(new C3949dw(C3947du.activityMonitor, C3948dv.viewability, this.f16812b, mo15623f(str, str2, "")));
    }
}
