package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ea3 extends ba3 {
    /* synthetic */ ea3(da3 da3) {
        super((aa3) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo18117a(fa3<?> fa3) {
        int D;
        synchronized (fa3) {
            D = fa3.f20333j - 1;
            fa3.f20333j = D;
        }
        return D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18118b(fa3<?> fa3, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
        synchronized (fa3) {
            if (fa3.f20332i == null) {
                fa3.f20332i = set2;
            }
        }
    }
}
