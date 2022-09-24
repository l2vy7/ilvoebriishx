package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class lf0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    final /* synthetic */ nf0 f35016b;

    lf0(nf0 nf0) {
        this.f35016b = nf0;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent i2 = this.f35016b.mo33689i();
        zzt.zzp();
        com.google.android.gms.ads.internal.util.zzt.zzQ(this.f35016b.f35998d, i2);
    }
}
