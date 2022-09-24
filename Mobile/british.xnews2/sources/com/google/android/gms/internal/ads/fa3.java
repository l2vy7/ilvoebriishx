package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class fa3<OutputT> extends n93<OutputT> {

    /* renamed from: k */
    private static final ba3 f20330k;

    /* renamed from: l */
    private static final Logger f20331l = Logger.getLogger(fa3.class.getName());
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: i */
    public volatile Set<Throwable> f20332i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile int f20333j;

    static {
        Throwable th;
        ba3 ba3;
        try {
            ba3 = new ca3(AtomicReferenceFieldUpdater.newUpdater(fa3.class, Set.class, "i"), AtomicIntegerFieldUpdater.newUpdater(fa3.class, "j"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            ba3 = new ea3((da3) null);
        }
        f20330k = ba3;
        if (th != null) {
            f20331l.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    fa3(int i) {
        this.f20333j = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final int mo18333E() {
        return f20330k.mo18117a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final Set<Throwable> mo18334G() {
        Set<Throwable> set = this.f20332i;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        mo18336K(newSetFromMap);
        f20330k.mo18118b(this, (Set<Throwable>) null, newSetFromMap);
        Set<Throwable> set2 = this.f20332i;
        set2.getClass();
        return set2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo18335J() {
        this.f20332i = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public abstract void mo18336K(Set<Throwable> set);
}
