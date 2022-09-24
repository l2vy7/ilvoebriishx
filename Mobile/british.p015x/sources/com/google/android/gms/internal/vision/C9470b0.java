package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.b0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9470b0 extends C9643v2<C9470b0, C9471a> implements C9538i4 {
    private static volatile C9587o4<C9470b0> zzbk;
    /* access modifiers changed from: private */
    public static final C9470b0 zzrj;
    private int zzbm;
    private String zzov = "";
    private String zzpd = "";
    private long zzrf;
    private C9606r zzrg;
    private C9666x zzrh;
    private C9614s zzri;

    /* renamed from: com.google.android.gms.internal.vision.b0$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9471a extends C9643v2.C9644a<C9470b0, C9471a> implements C9538i4 {
        private C9471a() {
            super(C9470b0.zzrj);
        }

        /* synthetic */ C9471a(C9598q qVar) {
            this();
        }
    }

    static {
        C9470b0 b0Var = new C9470b0();
        zzrj = b0Var;
        C9643v2.m44627m(C9470b0.class, b0Var);
    }

    private C9470b0() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.b0>, com.google.android.gms.internal.vision.v2$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9470b0> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9470b0();
            case 2:
                return new C9471a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzrj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzbm", "zzpd", "zzrf", "zzrg", "zzov", "zzrh", "zzri"});
            case 4:
                return zzrj;
            case 5:
                C9587o4<C9470b0> o4Var2 = zzbk;
                C9587o4<C9470b0> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9470b0.class) {
                        C9587o4<C9470b0> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzrj);
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
