package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ga */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9164ga implements C9347s9 {

    /* renamed from: a */
    private final C9409w9 f45046a;

    /* renamed from: b */
    private final String f45047b;

    /* renamed from: c */
    private final Object[] f45048c;

    /* renamed from: d */
    private final int f45049d;

    C9164ga(C9409w9 w9Var, String str, Object[] objArr) {
        this.f45046a = w9Var;
        this.f45047b = str;
        this.f45048c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f45049d = charAt;
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
                this.f45049d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo37604a() {
        return this.f45047b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo37605b() {
        return this.f45048c;
    }

    public final C9409w9 zza() {
        return this.f45046a;
    }

    public final boolean zzb() {
        return (this.f45049d & 2) == 2;
    }

    public final int zzc() {
        return (this.f45049d & 1) == 1 ? 1 : 2;
    }
}
