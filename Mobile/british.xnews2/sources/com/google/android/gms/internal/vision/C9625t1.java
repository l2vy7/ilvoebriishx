package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.t1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9625t1 {

    /* renamed from: a */
    private final C9482c2 f45877a;

    /* renamed from: b */
    private final byte[] f45878b;

    private C9625t1(int i) {
        byte[] bArr = new byte[i];
        this.f45878b = bArr;
        this.f45877a = C9482c2.m44077Z(bArr);
    }

    /* renamed from: a */
    public final C9552k1 mo38577a() {
        this.f45877a.mo38276e0();
        return new C9642v1(this.f45878b);
    }

    /* renamed from: b */
    public final C9482c2 mo38578b() {
        return this.f45877a;
    }

    /* synthetic */ C9625t1(int i, C9576n1 n1Var) {
        this(i);
    }
}
