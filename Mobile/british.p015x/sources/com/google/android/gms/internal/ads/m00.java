package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class m00 implements t20 {

    /* renamed from: a */
    final /* synthetic */ n00 f35326a;

    m00(n00 n00) {
        this.f35326a = n00;
    }

    /* renamed from: a */
    public final String mo33449a(String str, String str2) {
        return this.f35326a.f20555f.getString(str, str2);
    }

    /* renamed from: b */
    public final Double mo33450b(String str, double d) {
        return Double.valueOf((double) this.f35326a.f20555f.getFloat(str, (float) d));
    }

    /* renamed from: c */
    public final Long mo33451c(String str, long j) {
        try {
            return Long.valueOf(this.f35326a.f20555f.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.f35326a.f20555f.getInt(str, (int) j));
        }
    }

    /* renamed from: d */
    public final Boolean mo33452d(String str, boolean z) {
        return Boolean.valueOf(this.f35326a.f20555f.getBoolean(str, z));
    }
}
