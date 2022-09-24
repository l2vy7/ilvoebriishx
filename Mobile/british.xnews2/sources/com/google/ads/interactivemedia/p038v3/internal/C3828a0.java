package com.google.ads.interactivemedia.p038v3.internal;

import sun.misc.Unsafe;

/* renamed from: com.google.ads.interactivemedia.v3.internal.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3828a0 {
    /* renamed from: a */
    public static /* synthetic */ boolean m12686a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
