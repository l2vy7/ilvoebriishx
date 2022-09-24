package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alh */
/* compiled from: IMASDK */
public final class alh<T> {

    /* renamed from: a */
    private final aks f15200a;

    /* renamed from: b */
    private final alb f15201b;

    /* renamed from: c */
    private final alf<T> f15202c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<alg<T>> f15203d;

    /* renamed from: e */
    private final ArrayDeque<Runnable> f15204e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f15205f;

    /* renamed from: g */
    private boolean f15206g;

    public alh(Looper looper, aks aks, alf<T> alf) {
        this(new CopyOnWriteArraySet(), looper, aks, alf);
    }

    /* renamed from: a */
    public final alh<T> mo13900a(Looper looper, alf<T> alf) {
        return new alh<>(this.f15203d, looper, this.f15200a, alf);
    }

    /* renamed from: b */
    public final void mo13901b(T t) {
        if (!this.f15206g) {
            aup.m14890u(t);
            this.f15203d.add(new alg(t));
        }
    }

    /* renamed from: c */
    public final void mo13902c(T t) {
        Iterator<alg<T>> it = this.f15203d.iterator();
        while (it.hasNext()) {
            alg next = it.next();
            if (next.f15196a.equals(t)) {
                next.mo13895a(this.f15202c);
                this.f15203d.remove(next);
            }
        }
    }

    /* renamed from: d */
    public final void mo13903d(int i, ale<T> ale) {
        this.f15205f.add(new ald(new CopyOnWriteArraySet(this.f15203d), i, ale));
    }

    /* renamed from: e */
    public final void mo13904e() {
        if (!this.f15205f.isEmpty()) {
            if (!this.f15201b.mo13883d()) {
                this.f15201b.mo13880a(0).mo13879a();
            }
            boolean isEmpty = this.f15204e.isEmpty();
            this.f15204e.addAll(this.f15205f);
            this.f15205f.clear();
            if (!(!isEmpty)) {
                while (!this.f15204e.isEmpty()) {
                    this.f15204e.peekFirst().run();
                    this.f15204e.removeFirst();
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo13905f(int i, ale<T> ale) {
        mo13903d(i, ale);
        mo13904e();
    }

    /* renamed from: g */
    public final void mo13906g() {
        Iterator<alg<T>> it = this.f15203d.iterator();
        while (it.hasNext()) {
            it.next().mo13895a(this.f15202c);
        }
        this.f15203d.clear();
        this.f15206g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13907h(Message message) {
        int i = message.what;
        if (i == 0) {
            Iterator<alg<T>> it = this.f15203d.iterator();
            while (it.hasNext()) {
                it.next().mo13897c(this.f15202c);
                if (this.f15201b.mo13883d()) {
                    return;
                }
            }
        } else if (i == 1) {
            mo13905f(message.arg1, (ale) message.obj);
            mo13906g();
        }
    }

    /* renamed from: i */
    public final void mo13908i(ale<T> ale) {
        this.f15201b.mo13882c(1, 1036, 0, ale).mo13879a();
    }

    private alh(CopyOnWriteArraySet<alg<T>> copyOnWriteArraySet, Looper looper, aks aks, alf<T> alf) {
        this.f15200a = aks;
        this.f15203d = copyOnWriteArraySet;
        this.f15202c = alf;
        this.f15204e = new ArrayDeque<>();
        this.f15205f = new ArrayDeque<>();
        this.f15201b = aks.mo13858b(looper, new alc(this));
    }
}
