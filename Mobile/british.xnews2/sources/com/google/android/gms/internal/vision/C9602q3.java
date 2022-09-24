package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.q3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9602q3 extends C9594p3 {
    private C9602q3() {
        super();
    }

    /* renamed from: e */
    private static <E> C9485c3<E> m44537e(Object obj, long j) {
        return (C9485c3) C9652v5.m44670G(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo38543a(Object obj, Object obj2, long j) {
        C9485c3 e = m44537e(obj, j);
        C9485c3 e2 = m44537e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        if (size > 0 && size2 > 0) {
            if (!e.mo38298C()) {
                e = e.mo38300w(size2 + size);
            }
            e.addAll(e2);
        }
        if (size > 0) {
            e2 = e;
        }
        C9652v5.m44684f(obj, j, e2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo38544b(Object obj, long j) {
        m44537e(obj, j).mo38299T();
    }
}
