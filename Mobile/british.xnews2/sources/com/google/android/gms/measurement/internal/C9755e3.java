package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.e3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9755e3 {

    /* renamed from: a */
    public final String f46226a;

    /* renamed from: b */
    public final String f46227b;

    /* renamed from: c */
    public final long f46228c;

    /* renamed from: d */
    public final Bundle f46229d;

    public C9755e3(String str, String str2, Bundle bundle, long j) {
        this.f46226a = str;
        this.f46227b = str2;
        this.f46229d = bundle;
        this.f46228c = j;
    }

    /* renamed from: b */
    public static C9755e3 m45043b(zzau zzau) {
        return new C9755e3(zzau.f46937b, zzau.f46939d, zzau.f46938c.mo39355D0(), zzau.f46940e);
    }

    /* renamed from: a */
    public final zzau mo38893a() {
        return new zzau(this.f46226a, new zzas(new Bundle(this.f46229d)), this.f46227b, this.f46228c);
    }

    public final String toString() {
        String str = this.f46227b;
        String str2 = this.f46226a;
        String obj = this.f46229d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + obj.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(obj);
        return sb.toString();
    }
}
