package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class by2 {
    /* renamed from: a */
    public static by2 m30869a(cy2 cy2, dy2 dy2) {
        if (yx2.m40101b()) {
            return new fy2(cy2, dy2);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: b */
    public abstract void mo30822b(View view, hy2 hy2, String str);

    /* renamed from: c */
    public abstract void mo30823c();

    /* renamed from: d */
    public abstract void mo30824d(View view);

    /* renamed from: e */
    public abstract void mo30825e();
}
