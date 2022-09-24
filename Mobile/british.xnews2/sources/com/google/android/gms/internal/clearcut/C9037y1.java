package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.y1 */
final class C9037y1 extends C9016v1 {
    private C9037y1() {
        super();
    }

    /* renamed from: e */
    private static <E> C8934k1<E> m42502e(Object obj, long j) {
        return (C8934k1) C8859b4.m41552M(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37190a(Object obj, long j) {
        m42502e(obj, j).zzv();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <E> void mo37191b(Object obj, Object obj2, long j) {
        C8934k1 e = m42502e(obj, j);
        C8934k1 e2 = m42502e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        if (size > 0 && size2 > 0) {
            if (!e.mo36983n()) {
                e = e.mo36878o(size2 + size);
            }
            e.addAll(e2);
        }
        if (size > 0) {
            e2 = e;
        }
        C8859b4.m41569i(obj, j, e2);
    }
}
