package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class w93<I, O, F, T> extends ra3<O> implements Runnable {

    /* renamed from: k */
    public static final /* synthetic */ int f20953k = 0;
    @CheckForNull

    /* renamed from: i */
    mb3<? extends I> f20954i;
    @CheckForNull

    /* renamed from: j */
    F f20955j;

    w93(mb3<? extends I> mb3, F f) {
        Objects.requireNonNull(mb3);
        this.f20954i = mb3;
        Objects.requireNonNull(f);
        this.f20955j = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract T mo18925E(F f, I i) throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract void mo18926F(T t);

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: h */
    public final String mo18119h() {
        String str;
        mb3<? extends I> mb3 = this.f20954i;
        F f = this.f20955j;
        String h = super.mo18119h();
        if (mb3 != null) {
            String obj = mb3.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f != null) {
            String obj2 = f.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 11 + obj2.length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(obj2);
            sb2.append("]");
            return sb2.toString();
        } else if (h != null) {
            return h.length() != 0 ? str.concat(h) : new String(str);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo18120i() {
        mo18661t(this.f20954i);
        this.f20954i = null;
        this.f20955j = null;
    }

    public final void run() {
        mb3<? extends I> mb3 = this.f20954i;
        F f = this.f20955j;
        boolean z = true;
        boolean isCancelled = isCancelled() | (mb3 == null);
        if (f != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.f20954i = null;
            if (mb3.isCancelled()) {
                mo18665x(mb3);
                return;
            }
            try {
                try {
                    Object E = mo18925E(f, bb3.m30656p(mb3));
                    this.f20955j = null;
                    mo18926F(E);
                } catch (Throwable th) {
                    this.f20955j = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                mo18664w(e.getCause());
            } catch (RuntimeException e2) {
                mo18664w(e2);
            } catch (Error e3) {
                mo18664w(e3);
            }
        }
    }
}
