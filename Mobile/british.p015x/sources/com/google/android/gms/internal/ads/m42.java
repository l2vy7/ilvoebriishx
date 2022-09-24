package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class m42 extends TimerTask {

    /* renamed from: b */
    final /* synthetic */ AlertDialog f35395b;

    /* renamed from: c */
    final /* synthetic */ Timer f35396c;

    /* renamed from: d */
    final /* synthetic */ zzl f35397d;

    m42(AlertDialog alertDialog, Timer timer, zzl zzl) {
        this.f35395b = alertDialog;
        this.f35396c = timer;
        this.f35397d = zzl;
    }

    public final void run() {
        this.f35395b.dismiss();
        this.f35396c.cancel();
        zzl zzl = this.f35397d;
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
