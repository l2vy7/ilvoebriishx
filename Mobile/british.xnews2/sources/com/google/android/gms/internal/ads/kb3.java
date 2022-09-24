package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class kb3<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: b */
    private static final Runnable f34228b = new jb3((ib3) null);

    /* renamed from: c */
    private static final Runnable f34229c = new jb3((ib3) null);

    kb3() {
    }

    /* renamed from: c */
    private final void m33890c(Thread thread) {
        Runnable runnable = (Runnable) get();
        hb3 hb3 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof hb3)) {
                if (runnable != f34229c) {
                    break;
                }
            } else {
                hb3 = (hb3) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f34229c;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(hb3);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo30344a() throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract String mo30345b();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo30346d(Throwable th);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo30347e(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract boolean mo30348f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo33056g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            hb3 hb3 = new hb3(this, (gb3) null);
            kb3.super.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, hb3)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f34228b)) == f34229c) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f34228b)) == f34229c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !mo30348f();
            if (z) {
                try {
                    obj = mo30344a();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f34228b)) {
                        m33890c(currentThread);
                    }
                    mo30346d(th);
                    return;
                }
            }
            if (!compareAndSet(currentThread, f34228b)) {
                m33890c(currentThread);
            }
            if (z) {
                mo30347e(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f34228b) {
            str = "running=[DONE]";
        } else if (runnable instanceof hb3) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String b = mo30345b();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(b).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(b);
        return sb2.toString();
    }
}
