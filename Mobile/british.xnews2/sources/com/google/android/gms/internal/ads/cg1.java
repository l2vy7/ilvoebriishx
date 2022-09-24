package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class cg1<ListenerT> {
    @GuardedBy("this")

    /* renamed from: b */
    protected final Map<ListenerT, Executor> f30361b = new HashMap();

    protected cg1(Set<yh1<ListenerT>> set) {
        mo30922z0(set);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final synchronized void mo30919B0(bg1<ListenerT> bg1) {
        for (Map.Entry next : this.f30361b.entrySet()) {
            ((Executor) next.getValue()).execute(new zf1(bg1, next.getKey()));
        }
    }

    /* renamed from: p0 */
    public final synchronized void mo30920p0(yh1<ListenerT> yh1) {
        mo30921s0(yh1.f41864a, yh1.f41865b);
    }

    /* renamed from: s0 */
    public final synchronized void mo30921s0(ListenerT listenert, Executor executor) {
        this.f30361b.put(listenert, executor);
    }

    /* renamed from: z0 */
    public final synchronized void mo30922z0(Set<yh1<ListenerT>> set) {
        for (yh1<ListenerT> p0 : set) {
            mo30920p0(p0);
        }
    }
}
