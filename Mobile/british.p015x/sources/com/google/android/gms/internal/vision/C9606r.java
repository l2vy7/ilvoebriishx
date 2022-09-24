package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.r */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9606r extends C9643v2<C9606r, C9607a> implements C9538i4 {
    private static volatile C9587o4<C9606r> zzbk;
    /* access modifiers changed from: private */
    public static final C9606r zzof;
    private int zzbm;
    private String zzod = "";
    private String zzoe = "";

    /* renamed from: com.google.android.gms.internal.vision.r$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9607a extends C9643v2.C9644a<C9606r, C9607a> implements C9538i4 {
        private C9607a() {
            super(C9606r.zzof);
        }

        /* renamed from: w */
        public final C9607a mo38563w(String str) {
            if (this.f45908d) {
                mo38615o();
                this.f45908d = false;
            }
            ((C9606r) this.f45907c).m44557y(str);
            return this;
        }

        /* renamed from: y */
        public final C9607a mo38564y(String str) {
            if (this.f45908d) {
                mo38615o();
                this.f45908d = false;
            }
            ((C9606r) this.f45907c).m44558z(str);
            return this;
        }

        /* synthetic */ C9607a(C9598q qVar) {
            this();
        }
    }

    static {
        C9606r rVar = new C9606r();
        zzof = rVar;
        C9643v2.m44627m(C9606r.class, rVar);
    }

    private C9606r() {
    }

    /* renamed from: w */
    public static C9607a m44555w() {
        return (C9607a) zzof.mo38611p();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m44557y(String str) {
        str.getClass();
        this.zzbm |= 1;
        this.zzod = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m44558z(String str) {
        str.getClass();
        this.zzbm |= 2;
        this.zzoe = str;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.r>, com.google.android.gms.internal.vision.v2$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9606r> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9606r();
            case 2:
                return new C9607a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzof, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzbm", "zzod", "zzoe"});
            case 4:
                return zzof;
            case 5:
                C9587o4<C9606r> o4Var2 = zzbk;
                C9587o4<C9606r> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9606r.class) {
                        C9587o4<C9606r> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzof);
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
