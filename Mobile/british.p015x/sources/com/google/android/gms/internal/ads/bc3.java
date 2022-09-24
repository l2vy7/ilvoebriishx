package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bc3<V> extends ra3<V> implements RunnableFuture<V> {
    @CheckForNull

    /* renamed from: i */
    private volatile kb3<?> f20127i;

    bc3(ga3<V> ga3) {
        this.f20127i = new zb3(this, ga3);
    }

    /* renamed from: E */
    static <V> bc3<V> m20214E(Runnable runnable, V v) {
        return new bc3<>(Executors.callable(runnable, v));
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: h */
    public final String mo18119h() {
        kb3<?> kb3 = this.f20127i;
        if (kb3 == null) {
            return super.mo18119h();
        }
        String obj = kb3.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo18120i() {
        kb3<?> kb3;
        if (mo18666y() && (kb3 = this.f20127i) != null) {
            kb3.mo33056g();
        }
        this.f20127i = null;
    }

    public final void run() {
        kb3<?> kb3 = this.f20127i;
        if (kb3 != null) {
            kb3.run();
        }
        this.f20127i = null;
    }

    bc3(Callable<V> callable) {
        this.f20127i = new ac3(this, callable);
    }
}
