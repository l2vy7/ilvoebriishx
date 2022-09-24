package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fr3 implements rq3 {

    /* renamed from: a */
    private final uq3 f31862a;

    /* renamed from: b */
    private final String f31863b;

    /* renamed from: c */
    private final Object[] f31864c;

    /* renamed from: d */
    private final int f31865d;

    fr3(uq3 uq3, String str, Object[] objArr) {
        this.f31862a = uq3;
        this.f31863b = str;
        this.f31864c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f31865d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f31865d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo31920a() {
        return this.f31863b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo31921b() {
        return this.f31864c;
    }

    public final uq3 zza() {
        return this.f31862a;
    }

    public final boolean zzb() {
        return (this.f31865d & 2) == 2;
    }

    public final int zzc() {
        return (this.f31865d & 1) == 1 ? 1 : 2;
    }
}
