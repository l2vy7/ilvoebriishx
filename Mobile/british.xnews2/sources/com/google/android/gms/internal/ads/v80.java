package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C7377d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v80 implements C7377d.C7378a {

    /* renamed from: b */
    final /* synthetic */ uo0 f40343b;

    /* renamed from: c */
    final /* synthetic */ x80 f40344c;

    v80(x80 x80, uo0 uo0) {
        this.f40344c = x80;
        this.f40343b = uo0;
    }

    public final void onConnected(Bundle bundle) {
        try {
            this.f40343b.zzd(this.f40344c.f41070a.mo33290e());
        } catch (DeadObjectException e) {
            this.f40343b.zze(e);
        }
    }

    public final void onConnectionSuspended(int i) {
        uo0 uo0 = this.f40343b;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        uo0.zze(new RuntimeException(sb.toString()));
    }
}
