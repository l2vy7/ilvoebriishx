package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class eb2<T> {

    /* renamed from: a */
    private final ov1 f31292a;

    /* renamed from: b */
    private final y42 f31293b;

    /* renamed from: c */
    private final c92<T> f31294c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<da2<T>> f31295d;

    /* renamed from: e */
    private final ArrayDeque<Runnable> f31296e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f31297f;

    /* renamed from: g */
    private boolean f31298g;

    public eb2(Looper looper, ov1 ov1, c92<T> c92) {
        this(new CopyOnWriteArraySet(), looper, ov1, c92);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m31759g(eb2 eb2, Message message) {
        Iterator<da2<T>> it = eb2.f31295d.iterator();
        while (it.hasNext()) {
            it.next().mo18230b(eb2.f31294c);
            if (eb2.f31293b.zzf(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final eb2<T> mo31512a(Looper looper, c92<T> c92) {
        return new eb2<>(this.f31295d, looper, this.f31292a, c92);
    }

    /* renamed from: b */
    public final void mo31513b(T t) {
        if (!this.f31298g) {
            Objects.requireNonNull(t);
            this.f31295d.add(new da2(t));
        }
    }

    /* renamed from: c */
    public final void mo31514c() {
        if (!this.f31297f.isEmpty()) {
            if (!this.f31293b.zzf(0)) {
                y42 y42 = this.f31293b;
                y42.mo35877g(y42.mo35879m(0));
            }
            boolean isEmpty = this.f31296e.isEmpty();
            this.f31296e.addAll(this.f31297f);
            this.f31297f.clear();
            if (!(!isEmpty)) {
                while (!this.f31296e.isEmpty()) {
                    this.f31296e.peekFirst().run();
                    this.f31296e.removeFirst();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo31515d(int i, b82<T> b82) {
        this.f31297f.add(new a72(new CopyOnWriteArraySet(this.f31295d), i, b82));
    }

    /* renamed from: e */
    public final void mo31516e() {
        Iterator<da2<T>> it = this.f31295d.iterator();
        while (it.hasNext()) {
            it.next().mo18231c(this.f31294c);
        }
        this.f31295d.clear();
        this.f31298g = true;
    }

    /* renamed from: f */
    public final void mo31517f(T t) {
        Iterator<da2<T>> it = this.f31295d.iterator();
        while (it.hasNext()) {
            da2 next = it.next();
            if (next.f20258a.equals(t)) {
                next.mo18231c(this.f31294c);
                this.f31295d.remove(next);
            }
        }
    }

    private eb2(CopyOnWriteArraySet<da2<T>> copyOnWriteArraySet, Looper looper, ov1 ov1, c92<T> c92) {
        this.f31292a = ov1;
        this.f31295d = copyOnWriteArraySet;
        this.f31294c = c92;
        this.f31296e = new ArrayDeque<>();
        this.f31297f = new ArrayDeque<>();
        this.f31293b = ov1.mo34015a(looper, new z52(this));
    }
}
