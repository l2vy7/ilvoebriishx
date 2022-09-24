package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9767f5 {

    /* renamed from: a */
    final Context f46260a;

    /* renamed from: b */
    String f46261b;

    /* renamed from: c */
    String f46262c;

    /* renamed from: d */
    String f46263d;

    /* renamed from: e */
    Boolean f46264e;

    /* renamed from: f */
    long f46265f;

    /* renamed from: g */
    zzcl f46266g;

    /* renamed from: h */
    boolean f46267h = true;

    /* renamed from: i */
    final Long f46268i;

    /* renamed from: j */
    String f46269j;

    public C9767f5(Context context, zzcl zzcl, Long l) {
        C4604n.m20098k(context);
        Context applicationContext = context.getApplicationContext();
        C4604n.m20098k(applicationContext);
        this.f46260a = applicationContext;
        this.f46268i = l;
        if (zzcl != null) {
            this.f46266g = zzcl;
            this.f46261b = zzcl.f45579g;
            this.f46262c = zzcl.f45578f;
            this.f46263d = zzcl.f45577e;
            this.f46267h = zzcl.f45576d;
            this.f46265f = zzcl.f45575c;
            this.f46269j = zzcl.f45581i;
            Bundle bundle = zzcl.f45580h;
            if (bundle != null) {
                this.f46264e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
