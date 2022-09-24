package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzaz implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Context f27839b;

    /* renamed from: c */
    final /* synthetic */ String f27840c;

    /* renamed from: d */
    final /* synthetic */ boolean f27841d;

    /* renamed from: e */
    final /* synthetic */ boolean f27842e;

    zzaz(zzba zzba, Context context, String str, boolean z, boolean z2) {
        this.f27839b = context;
        this.f27840c = str;
        this.f27841d = z;
        this.f27842e = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f27839b);
        builder.setMessage(this.f27840c);
        if (this.f27841d) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f27842e) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new zzay(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
