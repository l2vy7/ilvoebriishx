package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.common.internal.C4604n;
import p115m4.C5759d;
import p126o4.C10843a;

/* renamed from: com.google.android.gms.internal.cast.q */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8693q extends C10843a {

    /* renamed from: b */
    private final View f43913b;

    /* renamed from: c */
    private final int f43914c;

    public C8693q(View view, int i) {
        this.f43913b = view;
        this.f43914c = i;
        view.setEnabled(false);
    }

    /* renamed from: g */
    private final void m41226g() {
        Integer H0;
        C4580e b = mo36472b();
        if (b != null && b.mo17850o()) {
            MediaStatus mediaStatus = (MediaStatus) C4604n.m20098k(b.mo17846k());
            if ((mediaStatus.mo29351X0(64) || mediaStatus.mo29346S0() != 0 || ((H0 = mediaStatus.mo29335H0(mediaStatus.mo29333F0())) != null && H0.intValue() < mediaStatus.mo29345R0() - 1)) && !b.mo17856u()) {
                this.f43913b.setVisibility(0);
                this.f43913b.setEnabled(true);
                return;
            }
        }
        this.f43913b.setVisibility(this.f43914c);
        this.f43913b.setEnabled(false);
    }

    /* renamed from: c */
    public final void mo36473c() {
        m41226g();
    }

    /* renamed from: d */
    public final void mo36537d() {
        this.f43913b.setEnabled(false);
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        m41226g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        this.f43913b.setEnabled(false);
        super.mo36475f();
    }
}
