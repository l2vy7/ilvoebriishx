package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qo */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8093qo {

    /* renamed from: a */
    final long f38205a;

    /* renamed from: b */
    final String f38206b;

    /* renamed from: c */
    final int f38207c;

    C8093qo(long j, String str, int i) {
        this.f38205a = j;
        this.f38206b = str;
        this.f38207c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C8093qo)) {
            C8093qo qoVar = (C8093qo) obj;
            if (qoVar.f38205a == this.f38205a && qoVar.f38207c == this.f38207c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f38205a;
    }
}
