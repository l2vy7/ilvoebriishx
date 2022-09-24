package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzay implements DialogInterface.OnClickListener {

    /* renamed from: b */
    final /* synthetic */ zzaz f27838b;

    zzay(zzaz zzaz) {
        this.f27838b = zzaz;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzt.zzp();
        zzt.zzY(this.f27838b.f27839b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
