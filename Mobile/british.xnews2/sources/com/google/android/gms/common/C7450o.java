package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.o */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
abstract class C7450o extends C7448m {

    /* renamed from: d */
    private static final WeakReference<byte[]> f29400d = new WeakReference<>((Object) null);

    /* renamed from: c */
    private WeakReference<byte[]> f29401c = f29400d;

    C7450o(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m6 */
    public final byte[] mo30190m6() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f29401c.get();
            if (bArr == null) {
                bArr = mo29995n6();
                this.f29401c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n6 */
    public abstract byte[] mo29995n6();
}
