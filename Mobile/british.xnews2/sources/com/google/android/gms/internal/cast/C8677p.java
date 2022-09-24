package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.gms.cast.framework.media.C4580e;
import p114m4.C5759d;
import p125o4.C10843a;
import p125o4.C10844c;

/* renamed from: com.google.android.gms.internal.cast.p */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8677p extends C10843a implements C4580e.C4585e {

    /* renamed from: b */
    private final View f43882b;

    /* renamed from: c */
    private final C10844c f43883c;

    public C8677p(View view, C10844c cVar) {
        this.f43882b = view;
        this.f43883c = cVar;
        view.setEnabled(false);
    }

    /* renamed from: a */
    public final void mo17876a(long j, long j2) {
        mo36651g();
    }

    /* renamed from: c */
    public final void mo36473c() {
        mo36651g();
    }

    /* renamed from: d */
    public final void mo36537d() {
        this.f43882b.setEnabled(false);
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        C4580e b = mo36472b();
        if (b != null) {
            b.mo17838c(this, 1000);
        }
        mo36651g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        C4580e b = mo36472b();
        if (b != null) {
            b.mo17822G(this);
        }
        this.f43882b.setEnabled(false);
        super.mo36475f();
        mo36651g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36651g() {
        C4580e b = mo36472b();
        boolean z = false;
        if (b == null || !b.mo17850o() || b.mo17856u()) {
            this.f43882b.setEnabled(false);
        } else if (!b.mo17852q()) {
            this.f43882b.setEnabled(true);
        } else {
            View view = this.f43882b;
            if (b.mo17835T()) {
                C10844c cVar = this.f43883c;
                if ((((long) cVar.mo43013c()) + cVar.mo43018h()) - (((long) cVar.mo43016f()) + cVar.mo43018h()) >= ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS) {
                    z = true;
                }
            }
            view.setEnabled(z);
        }
    }
}
