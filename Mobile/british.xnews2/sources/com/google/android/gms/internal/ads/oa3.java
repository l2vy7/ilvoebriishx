package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class oa3<V> extends z93<Object, V> {
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: q */
    public na3<?> f20612q;

    oa3(k63<? extends mb3<?>> k63, boolean z, Executor executor, Callable<V> callable) {
        super(k63, z, false);
        this.f20612q = new ma3(this, callable, executor);
        mo19054T();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo18517L(int i) {
        super.mo18517L(i);
        if (i == 1) {
            this.f20612q = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final void mo18518R(int i, @CheckForNull Object obj) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo18519S() {
        na3<?> na3 = this.f20612q;
        if (na3 != null) {
            na3.mo33673i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo18605s() {
        na3<?> na3 = this.f20612q;
        if (na3 != null) {
            na3.mo33056g();
        }
    }
}
