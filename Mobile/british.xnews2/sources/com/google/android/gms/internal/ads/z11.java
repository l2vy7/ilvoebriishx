package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z11 implements ib1 {

    /* renamed from: b */
    private final rs2 f42257b;

    public z11(rs2 rs2) {
        this.f42257b = rs2;
    }

    /* renamed from: C */
    public final void mo18537C(Context context) {
        try {
            this.f42257b.mo34606j();
        } catch (gs2 e) {
            co0.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    /* renamed from: c */
    public final void mo18538c(Context context) {
        try {
            this.f42257b.mo34618v();
        } catch (gs2 e) {
            co0.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    /* renamed from: x */
    public final void mo18542x(Context context) {
        try {
            this.f42257b.mo34619w();
            if (context != null) {
                this.f42257b.mo34617u(context);
            }
        } catch (gs2 e) {
            co0.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
