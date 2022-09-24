package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.x4 */
public class C9033x4 {

    /* renamed from: b */
    protected volatile int f44796b = -1;

    /* renamed from: b */
    public static final void m42492b(C9033x4 x4Var, byte[] bArr, int i, int i2) {
        try {
            C8984q4 t = C8984q4.m42299t(bArr, 0, i2);
            x4Var.mo36988a(t);
            t.mo37128p();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public void mo36988a(C8984q4 q4Var) throws IOException {
    }

    /* renamed from: c */
    public final int mo37228c() {
        int d = mo36990d();
        this.f44796b = d;
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo36990d() {
        return 0;
    }

    /* renamed from: g */
    public C9033x4 clone() throws CloneNotSupportedException {
        return (C9033x4) super.clone();
    }

    public String toString() {
        return C9047z4.m42544a(this);
    }
}
