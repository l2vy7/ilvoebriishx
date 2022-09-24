package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class la3<V, C> extends z93<V, C> {
    @CheckForNull

    /* renamed from: q */
    private List<ja3<V>> f20528q;

    la3(k63<? extends mb3<? extends V>> k63, boolean z) {
        super(k63, true, true);
        List<ja3<V>> list;
        if (k63.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = i73.m33107a(k63.size());
        }
        for (int i = 0; i < k63.size(); i++) {
            list.add((Object) null);
        }
        this.f20528q = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo18517L(int i) {
        super.mo18517L(i);
        this.f20528q = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final void mo18518R(int i, V v) {
        List<ja3<V>> list = this.f20528q;
        if (list != null) {
            list.set(i, new ja3(v));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo18519S() {
        List<ja3<V>> list = this.f20528q;
        if (list != null) {
            mo18663v(mo18520W(list));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public abstract C mo18520W(List<ja3<V>> list);
}
