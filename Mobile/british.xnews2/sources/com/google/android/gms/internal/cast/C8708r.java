package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.common.internal.C4604n;
import p114m4.C5759d;
import p125o4.C10843a;

/* renamed from: com.google.android.gms.internal.cast.r */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8708r extends C10843a {

    /* renamed from: b */
    private final View f43927b;

    /* renamed from: c */
    private final int f43928c;

    public C8708r(View view, int i) {
        this.f43927b = view;
        this.f43928c = i;
        view.setEnabled(false);
    }

    /* renamed from: g */
    private final void m41258g() {
        Integer H0;
        C4580e b = mo36472b();
        if (b != null && b.mo17850o()) {
            MediaStatus mediaStatus = (MediaStatus) C4604n.m20098k(b.mo17846k());
            if ((mediaStatus.mo29351X0(128) || mediaStatus.mo29346S0() != 0 || ((H0 = mediaStatus.mo29335H0(mediaStatus.mo29333F0())) != null && H0.intValue() > 0)) && !b.mo17856u()) {
                this.f43927b.setVisibility(0);
                this.f43927b.setEnabled(true);
                return;
            }
        }
        this.f43927b.setVisibility(this.f43928c);
        this.f43927b.setEnabled(false);
    }

    /* renamed from: c */
    public final void mo36473c() {
        m41258g();
    }

    /* renamed from: d */
    public final void mo36537d() {
        this.f43927b.setEnabled(false);
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        m41258g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        this.f43927b.setEnabled(false);
        super.mo36475f();
    }
}
