package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ld */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C7900ld implements PackageManager.OnChecksumsReadyListener {

    /* renamed from: a */
    public final /* synthetic */ ub3 f34994a;

    public /* synthetic */ C7900ld(ub3 ub3) {
        this.f34994a = ub3;
    }

    public final void onChecksumsReady(List list) {
        ub3 ub3 = this.f34994a;
        if (list == null) {
            ub3.mo18663v(null);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    ub3.mo18663v(C7569cc.m30945c(apkChecksum.getValue()));
                    return;
                }
            }
            ub3.mo18663v(null);
        } catch (Throwable unused) {
            ub3.mo18663v(null);
        }
    }
}
