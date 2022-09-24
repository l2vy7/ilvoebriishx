package com.google.ads.interactivemedia.p038v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.ads.interactivemedia.v3.internal.awj */
/* compiled from: IMASDK */
final class awj<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: b */
    private static final Runnable f15853b = new awi((byte[]) null);

    /* renamed from: c */
    private static final Runnable f15854c = new awi((byte[]) null);

    /* renamed from: d */
    private static final Runnable f15855d = new awi((byte[]) null);

    /* renamed from: a */
    final /* synthetic */ awp f15856a;

    /* renamed from: e */
    private final Callable f15857e;

    awj() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14702a() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f15854c)) {
            try {
                Thread thread = (Thread) runnable;
                thread.interrupt();
                if (((Runnable) getAndSet(f15853b)) == f15855d) {
                    LockSupport.unpark(thread);
                }
            } catch (Throwable th) {
                if (((Runnable) getAndSet(f15853b)) == f15855d) {
                    LockSupport.unpark((Thread) runnable);
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo14703b() {
        return this.f15856a.isDone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Object mo14704c() throws Exception {
        return this.f15857e.call();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo14705d(Object obj, Throwable th) {
        if (th == null) {
            this.f15856a.mo14664n(obj);
        } else {
            this.f15856a.mo14665o(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo14706e() {
        return this.f15857e.toString();
    }

    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !mo14703b();
            if (z) {
                try {
                    obj = mo14704c();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f15853b)) {
                        Runnable runnable = (Runnable) get();
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            Runnable runnable2 = f15854c;
                            if (runnable != runnable2 && runnable != f15855d) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                Runnable runnable3 = f15855d;
                                if (runnable == runnable3 || compareAndSet(runnable2, runnable3)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = (Runnable) get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    mo14705d((Object) null, th);
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, f15853b)) {
                Runnable runnable4 = (Runnable) get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    Runnable runnable5 = f15854c;
                    if (runnable4 != runnable5 && runnable4 != f15855d) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        Runnable runnable6 = f15855d;
                        if (runnable4 == runnable6 || compareAndSet(runnable5, runnable6)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable4 = (Runnable) get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                mo14705d(obj, (Throwable) null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f15853b) {
            str = "running=[DONE]";
        } else if (runnable == f15854c) {
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
        String e = mo14706e();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(e).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(e);
        return sb2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    awj(awp awp, Callable callable) {
        this();
        this.f15856a = awp;
        ars.m14627g(callable);
        this.f15857e = callable;
    }
}
