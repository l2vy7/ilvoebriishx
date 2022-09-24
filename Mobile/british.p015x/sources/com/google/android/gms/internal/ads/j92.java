package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class j92 implements gk1 {

    /* renamed from: a */
    public final /* synthetic */ u42 f33811a;

    public /* synthetic */ j92(u42 u42) {
        this.f33811a = u42;
    }

    /* renamed from: a */
    public final void mo32020a(boolean z, Context context, ab1 ab1) {
        u42 u42 = this.f33811a;
        try {
            ((rs2) u42.f39763b).mo34620x(z);
            ((rs2) u42.f39763b).mo34595B();
        } catch (gs2 e) {
            co0.zzk("Cannot show rewarded video.", e);
            throw new fk1(e.getCause());
        }
    }
}
