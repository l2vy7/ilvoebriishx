package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class l93 extends f93 {
    /* synthetic */ l93(r93 r93) {
        super((e93) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18310a(p93 p93, @CheckForNull p93 p932) {
        p93.f20652b = p932;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18311b(p93 p93, Thread thread) {
        p93.f20651a = thread;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo18312c(q93<?> q93, @CheckForNull i93 i93, i93 i932) {
        synchronized (q93) {
            if (q93.f20663c != i93) {
                return false;
            }
            q93.f20663c = i932;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo18313d(q93<?> q93, @CheckForNull Object obj, Object obj2) {
        synchronized (q93) {
            if (q93.f20662b != obj) {
                return false;
            }
            q93.f20662b = obj2;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo18314e(q93<?> q93, @CheckForNull p93 p93, @CheckForNull p93 p932) {
        synchronized (q93) {
            if (q93.f20664d != p93) {
                return false;
            }
            q93.f20664d = p932;
            return true;
        }
    }
}
