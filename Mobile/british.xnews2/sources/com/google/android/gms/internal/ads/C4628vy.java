package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.ads.vy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C4628vy extends C8243ux {
    /* synthetic */ C4628vy(C8244uy uyVar) {
    }

    public final void zze(@Nullable zzbew zzbew) {
        AdInspectorError adInspectorError;
        OnAdInspectorClosedListener b = C4632yy.m21230f().f21027f;
        if (b != null) {
            if (zzbew == null) {
                adInspectorError = null;
            } else {
                adInspectorError = new AdInspectorError(zzbew.f42935b, zzbew.f42936c, zzbew.f42937d);
            }
            b.onAdInspectorClosed(adInspectorError);
        }
    }
}
