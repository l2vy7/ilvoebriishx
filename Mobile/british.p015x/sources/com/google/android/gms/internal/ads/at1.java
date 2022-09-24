package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class at1 implements ib1 {

    /* renamed from: b */
    private final xt0 f29755b;

    at1(xt0 xt0) {
        this.f29755b = xt0;
    }

    /* renamed from: C */
    public final void mo18537C(Context context) {
        xt0 xt0 = this.f29755b;
        if (xt0 != null) {
            xt0.destroy();
        }
    }

    /* renamed from: c */
    public final void mo18538c(Context context) {
        xt0 xt0 = this.f29755b;
        if (xt0 != null) {
            xt0.onPause();
        }
    }

    /* renamed from: x */
    public final void mo18542x(Context context) {
        xt0 xt0 = this.f29755b;
        if (xt0 != null) {
            xt0.onResume();
        }
    }
}
