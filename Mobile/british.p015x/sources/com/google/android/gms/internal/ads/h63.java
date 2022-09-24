package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class h63 {
    /* renamed from: a */
    static int m20518a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: b */
    static int m20519b(@CheckForNull Object obj) {
        return m20518a(obj == null ? 0 : obj.hashCode());
    }
}
