package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.e0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9499e0 extends C9643v2<C9499e0, C9500a> implements C9538i4 {
    private static volatile C9587o4<C9499e0> zzbk;
    /* access modifiers changed from: private */
    public static final C9499e0 zzrs;
    private int zzbm;
    private C9630u zzro;
    private int zzrp;
    private C9677y zzrq;
    private C9622t zzrr;

    /* renamed from: com.google.android.gms.internal.vision.e0$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9500a extends C9643v2.C9644a<C9499e0, C9500a> implements C9538i4 {
        private C9500a() {
            super(C9499e0.zzrs);
        }

        /* synthetic */ C9500a(C9598q qVar) {
            this();
        }
    }

    static {
        C9499e0 e0Var = new C9499e0();
        zzrs = e0Var;
        C9643v2.m44627m(C9499e0.class, e0Var);
    }

    private C9499e0() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.e0>, com.google.android.gms.internal.vision.v2$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9499e0> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9499e0();
            case 2:
                return new C9500a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzrs, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzbm", "zzro", "zzrp", "zzrq", "zzrr"});
            case 4:
                return zzrs;
            case 5:
                C9587o4<C9499e0> o4Var2 = zzbk;
                C9587o4<C9499e0> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9499e0.class) {
                        C9587o4<C9499e0> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzrs);
                            zzbk = bVar;
                            o4Var = bVar;
                        }
                    }
                    o4Var3 = o4Var;
                }
                return o4Var3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
