package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bb3 extends db3 {
    /* renamed from: a */
    public static <V> ab3<V> m30641a(Iterable<? extends mb3<? extends V>> iterable) {
        return new ab3<>(false, p63.m20823x(iterable), (za3) null);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <V> ab3<V> m30642b(mb3<? extends V>... mb3Arr) {
        return new ab3<>(false, p63.m20825z(mb3Arr), (za3) null);
    }

    /* renamed from: c */
    public static <V> ab3<V> m30643c(Iterable<? extends mb3<? extends V>> iterable) {
        return new ab3<>(true, p63.m20823x(iterable), (za3) null);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <V> ab3<V> m30644d(mb3<? extends V>... mb3Arr) {
        return new ab3<>(true, p63.m20825z(mb3Arr), (za3) null);
    }

    /* renamed from: e */
    public static <V> mb3<List<V>> m30645e(Iterable<? extends mb3<? extends V>> iterable) {
        return new ia3(p63.m20823x(iterable), true);
    }

    /* renamed from: f */
    public static <V, X extends Throwable> mb3<V> m30646f(mb3<? extends V> mb3, Class<X> cls, p33<? super X, ? extends V> p33, Executor executor) {
        c93 c93 = new c93(mb3, cls, p33);
        mb3.zzc(c93, tb3.m37772c(executor, c93));
        return c93;
    }

    /* renamed from: g */
    public static <V, X extends Throwable> mb3<V> m30647g(mb3<? extends V> mb3, Class<X> cls, ha3<? super X, ? extends V> ha3, Executor executor) {
        b93 b93 = new b93(mb3, cls, ha3);
        mb3.zzc(b93, tb3.m37772c(executor, b93));
        return b93;
    }

    /* renamed from: h */
    public static <V> mb3<V> m30648h(Throwable th) {
        Objects.requireNonNull(th);
        return new eb3(th);
    }

    /* renamed from: i */
    public static <V> mb3<V> m30649i(V v) {
        if (v == null) {
            return fb3.f31695c;
        }
        return new fb3(v);
    }

    /* renamed from: j */
    public static mb3<Void> m30650j() {
        return fb3.f31695c;
    }

    /* renamed from: k */
    public static <O> mb3<O> m30651k(Callable<O> callable, Executor executor) {
        bc3 bc3 = new bc3(callable);
        executor.execute(bc3);
        return bc3;
    }

    /* renamed from: l */
    public static <O> mb3<O> m30652l(ga3<O> ga3, Executor executor) {
        bc3 bc3 = new bc3(ga3);
        executor.execute(bc3);
        return bc3;
    }

    /* renamed from: m */
    public static <I, O> mb3<O> m30653m(mb3<I> mb3, p33<? super I, ? extends O> p33, Executor executor) {
        int i = w93.f20953k;
        Objects.requireNonNull(p33);
        v93 v93 = new v93(mb3, p33);
        mb3.zzc(v93, tb3.m37772c(executor, v93));
        return v93;
    }

    /* renamed from: n */
    public static <I, O> mb3<O> m30654n(mb3<I> mb3, ha3<? super I, ? extends O> ha3, Executor executor) {
        int i = w93.f20953k;
        Objects.requireNonNull(executor);
        u93 u93 = new u93(mb3, ha3);
        mb3.zzc(u93, tb3.m37772c(executor, u93));
        return u93;
    }

    /* renamed from: o */
    public static <V> mb3<V> m30655o(mb3<V> mb3, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (mb3.isDone()) {
            return mb3;
        }
        return yb3.m21223F(mb3, j, timeUnit, scheduledExecutorService);
    }

    /* renamed from: p */
    public static <V> V m30656p(Future<V> future) throws ExecutionException {
        if (future.isDone()) {
            return dc3.m31349a(future);
        }
        throw new IllegalStateException(m43.m20695b("Future was expected to be done: %s", future));
    }

    /* renamed from: q */
    public static <V> V m30657q(Future<V> future) {
        try {
            return dc3.m31349a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new qa3((Error) cause);
            }
            throw new cc3(cause);
        }
    }

    /* renamed from: r */
    public static <V> void m30658r(mb3<V> mb3, xa3<? super V> xa3, Executor executor) {
        Objects.requireNonNull(xa3);
        mb3.zzc(new ya3(mb3, xa3), executor);
    }
}
