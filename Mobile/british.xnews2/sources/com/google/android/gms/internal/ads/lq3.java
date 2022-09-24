package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class lq3 implements sq3 {

    /* renamed from: a */
    private final sq3[] f35202a;

    lq3(sq3... sq3Arr) {
        this.f35202a = sq3Arr;
    }

    /* renamed from: b */
    public final rq3 mo32214b(Class<?> cls) {
        sq3[] sq3Arr = this.f35202a;
        for (int i = 0; i < 2; i++) {
            sq3 sq3 = sq3Arr[i];
            if (sq3.mo32215c(cls)) {
                return sq3.mo32214b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    /* renamed from: c */
    public final boolean mo32215c(Class<?> cls) {
        sq3[] sq3Arr = this.f35202a;
        for (int i = 0; i < 2; i++) {
            if (sq3Arr[i].mo32215c(cls)) {
                return true;
            }
        }
        return false;
    }
}
