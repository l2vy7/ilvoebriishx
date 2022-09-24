package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qc3 {

    /* renamed from: a */
    private final dk3 f37973a;

    private qc3(dk3 dk3) {
        this.f37973a = dk3;
    }

    /* renamed from: d */
    public static qc3 m36428d(String str, byte[] bArr, int i) {
        ck3 E = dk3.m31453E();
        E.mo30949y(str);
        E.mo30947B(eo3.m31873L(bArr));
        int i2 = i - 1;
        E.mo30948C(i2 != 0 ? i2 != 1 ? 5 : 4 : 3);
        return new qc3((dk3) E.mo32424p());
    }

    /* renamed from: a */
    public final String mo34317a() {
        return this.f37973a.mo31287J();
    }

    /* renamed from: b */
    public final byte[] mo34318b() {
        return this.f37973a.mo31286I().mo31616f();
    }

    /* renamed from: c */
    public final int mo34319c() {
        int M = this.f37973a.mo31288M() - 2;
        int i = 1;
        if (M != 1) {
            i = 2;
            if (M != 2) {
                i = 3;
                if (M != 3) {
                    if (M == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
