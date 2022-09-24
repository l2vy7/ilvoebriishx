package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wf3 {

    /* renamed from: a */
    private final gc3 f40776a;

    /* renamed from: b */
    private final jc3 f40777b;

    public wf3(gc3 gc3) {
        this.f40776a = gc3;
        this.f40777b = null;
    }

    public wf3(jc3 jc3) {
        this.f40776a = null;
        this.f40777b = jc3;
    }

    /* renamed from: a */
    public final byte[] mo35614a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        gc3 gc3 = this.f40776a;
        if (gc3 != null) {
            return gc3.mo31329a(bArr, bArr2);
        }
        return this.f40777b.mo32115a(bArr, bArr2);
    }
}
