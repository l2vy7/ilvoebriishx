package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.x5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8322x5 {

    /* renamed from: a */
    private final AtomicInteger f41025a = new AtomicInteger();

    /* renamed from: b */
    private final Set<C8215u5<?>> f41026b = new HashSet();

    /* renamed from: c */
    private final PriorityBlockingQueue<C8215u5<?>> f41027c = new PriorityBlockingQueue<>();

    /* renamed from: d */
    private final PriorityBlockingQueue<C8215u5<?>> f41028d = new PriorityBlockingQueue<>();

    /* renamed from: e */
    private final C7634e5 f41029e;

    /* renamed from: f */
    private final C7967n5 f41030f;

    /* renamed from: g */
    private final C8003o5[] f41031g;

    /* renamed from: h */
    private C7708g5 f41032h;

    /* renamed from: i */
    private final List<C8286w5> f41033i = new ArrayList();

    /* renamed from: j */
    private final List<C8252v5> f41034j = new ArrayList();

    /* renamed from: k */
    private final C7892l5 f41035k;

    public C8322x5(C7634e5 e5Var, C7967n5 n5Var, int i) {
        C7892l5 l5Var = new C7892l5(new Handler(Looper.getMainLooper()));
        this.f41029e = e5Var;
        this.f41030f = n5Var;
        this.f41031g = new C8003o5[4];
        this.f41035k = l5Var;
    }

    /* renamed from: a */
    public final <T> C8215u5<T> mo35718a(C8215u5<T> u5Var) {
        u5Var.zzf(this);
        synchronized (this.f41026b) {
            this.f41026b.add(u5Var);
        }
        u5Var.zzg(this.f41025a.incrementAndGet());
        u5Var.zzm("add-to-queue");
        mo35720c(u5Var, 0);
        this.f41027c.add(u5Var);
        return u5Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <T> void mo35719b(C8215u5<T> u5Var) {
        synchronized (this.f41026b) {
            this.f41026b.remove(u5Var);
        }
        synchronized (this.f41033i) {
            for (C8286w5 zza : this.f41033i) {
                zza.zza();
            }
        }
        mo35720c(u5Var, 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo35720c(C8215u5<?> u5Var, int i) {
        synchronized (this.f41034j) {
            for (C8252v5 zza : this.f41034j) {
                zza.zza();
            }
        }
    }

    /* renamed from: d */
    public final void mo35721d() {
        C7708g5 g5Var = this.f41032h;
        if (g5Var != null) {
            g5Var.mo32007b();
        }
        C8003o5[] o5VarArr = this.f41031g;
        for (int i = 0; i < 4; i++) {
            C8003o5 o5Var = o5VarArr[i];
            if (o5Var != null) {
                o5Var.mo33835a();
            }
        }
        C7708g5 g5Var2 = new C7708g5(this.f41027c, this.f41028d, this.f41029e, this.f41035k, (C7892l5) null);
        this.f41032h = g5Var2;
        g5Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            C8003o5 o5Var2 = new C8003o5(this.f41028d, this.f41030f, this.f41029e, this.f41035k, (C7892l5) null);
            this.f41031g[i2] = o5Var2;
            o5Var2.start();
        }
    }
}
