package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.k0 */
class C2836k0<T> {

    /* renamed from: a */
    private final List<Callable<T>> f11518a = new ArrayList();

    /* renamed from: b */
    private boolean f11519b = false;

    /* renamed from: com.adcolony.sdk.k0$a */
    interface C2837a<T> extends Callable<T> {
        /* renamed from: a */
        T mo9798a();
    }

    C2836k0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9797a(Callable<T> callable) {
        if (!this.f11519b) {
            this.f11518a.add(callable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<T> mo9795a() {
        return mo9796a(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<T> mo9796a(long j) {
        List<Future<T>> list;
        this.f11519b = true;
        ArrayList arrayList = new ArrayList();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(this.f11518a.size());
        ArrayList arrayList2 = new ArrayList();
        if (j > 0) {
            try {
                list = newFixedThreadPool.invokeAll(this.f11518a, j, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
        } else {
            list = newFixedThreadPool.invokeAll(this.f11518a);
        }
        arrayList2.addAll(list);
        newFixedThreadPool.shutdownNow();
        for (int i = 0; i < arrayList2.size(); i++) {
            Future future = (Future) arrayList2.get(i);
            if (!future.isCancelled()) {
                try {
                    arrayList.add(future.get());
                } catch (Exception unused2) {
                }
            } else if (this.f11518a.get(i) instanceof C2837a) {
                arrayList.add(((C2837a) this.f11518a.get(i)).mo9798a());
            }
        }
        return arrayList;
    }
}
