package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class s10<T> {

    /* renamed from: a */
    private final String f38831a;

    /* renamed from: b */
    private final T f38832b;

    /* renamed from: c */
    private final int f38833c;

    protected s10(String str, T t, int i) {
        this.f38831a = str;
        this.f38832b = t;
        this.f38833c = i;
    }

    /* renamed from: a */
    public static s10<Double> m37295a(String str, double d) {
        return new s10<>(str, Double.valueOf(d), 3);
    }

    /* renamed from: b */
    public static s10<Long> m37296b(String str, long j) {
        return new s10<>(str, Long.valueOf(j), 2);
    }

    /* renamed from: c */
    public static s10<String> m37297c(String str, String str2) {
        return new s10<>(str, str2, 4);
    }

    /* renamed from: d */
    public static s10<Boolean> m37298d(String str, boolean z) {
        return new s10<>(str, Boolean.valueOf(z), 1);
    }

    /* renamed from: e */
    public final T mo34648e() {
        t20 a = v20.m38683a();
        if (a == null) {
            if (v20.m38684b() != null) {
                v20.m38684b().zza();
            }
            return this.f38832b;
        }
        int i = this.f38833c - 1;
        if (i == 0) {
            return a.mo33452d(this.f38831a, ((Boolean) this.f38832b).booleanValue());
        }
        if (i == 1) {
            return a.mo33451c(this.f38831a, ((Long) this.f38832b).longValue());
        }
        if (i != 2) {
            return a.mo33449a(this.f38831a, (String) this.f38832b);
        }
        return a.mo33450b(this.f38831a, ((Double) this.f38832b).doubleValue());
    }
}
