package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.f0 */
final class C8890f0 {

    /* renamed from: a */
    private final C8947m0 f44510a;

    /* renamed from: b */
    private final byte[] f44511b;

    private C8890f0(int i) {
        byte[] bArr = new byte[i];
        this.f44511b = bArr;
        this.f44510a = C8947m0.m41946S(bArr);
    }

    /* synthetic */ C8890f0(int i, C8855b0 b0Var) {
        this(i);
    }

    /* renamed from: a */
    public final C8847a0 mo36889a() {
        if (this.f44510a.mo37032u() == 0) {
            return new C8909h0(this.f44511b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final C8947m0 mo36890b() {
        return this.f44510a;
    }
}
