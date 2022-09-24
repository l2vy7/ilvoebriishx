package com.facebook.internal;

import com.facebook.C3642m;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: com.facebook.internal.w */
/* compiled from: LockOnGetVariable */
public class C3559w<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f13272a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CountDownLatch f13273b = new CountDownLatch(1);

    /* renamed from: com.facebook.internal.w$a */
    /* compiled from: LockOnGetVariable */
    class C3560a implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Callable f13274a;

        C3560a(Callable callable) {
            this.f13274a = callable;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public Void call() throws Exception {
            try {
                Object unused = C3559w.this.f13272a = this.f13274a.call();
                C3559w.this.f13273b.countDown();
                return null;
            } catch (Throwable th) {
                C3559w.this.f13273b.countDown();
                throw th;
            }
        }
    }

    public C3559w(Callable<T> callable) {
        C3642m.m12288n().execute(new FutureTask(new C3560a(callable)));
    }

    /* renamed from: d */
    private void m11888d() {
        CountDownLatch countDownLatch = this.f13273b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: c */
    public T mo12077c() {
        m11888d();
        return this.f13272a;
    }
}
