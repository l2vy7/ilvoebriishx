package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.jv3;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.o10;
import p133q.C5918d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzl implements m10 {

    /* renamed from: a */
    final /* synthetic */ o10 f27930a;

    /* renamed from: b */
    final /* synthetic */ Context f27931b;

    /* renamed from: c */
    final /* synthetic */ Uri f27932c;

    zzl(zzt zzt, o10 o10, Context context, Uri uri) {
        this.f27930a = o10;
        this.f27931b = context;
        this.f27932c = uri;
    }

    public final void zza() {
        C5918d a = new C5918d.C5919a(this.f27930a.mo18594a()).mo22909a();
        a.f24786a.setPackage(jv3.m33764a(this.f27931b));
        a.mo22908a(this.f27931b, this.f27932c);
        this.f27930a.mo18599f((Activity) this.f27931b);
    }
}
