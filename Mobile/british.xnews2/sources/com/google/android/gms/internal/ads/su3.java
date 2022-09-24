package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class su3<T> implements uu3<T> {

    /* renamed from: a */
    private iv3<T> f39069a;

    /* renamed from: a */
    public static <T> void m37554a(iv3<T> iv3, iv3<T> iv32) {
        su3 su3 = (su3) iv3;
        if (su3.f39069a == null) {
            su3.f39069a = iv32;
            return;
        }
        throw new IllegalStateException();
    }

    public final T zzb() {
        iv3<T> iv3 = this.f39069a;
        if (iv3 != null) {
            return iv3.zzb();
        }
        throw new IllegalStateException();
    }
}
