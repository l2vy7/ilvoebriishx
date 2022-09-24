package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7191a.C7193b;
import com.google.android.gms.common.api.internal.C7259j;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.n */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C7280n<A extends C7191a.C7193b, L> {

    /* renamed from: a */
    private final C7259j<L> f29070a;

    /* renamed from: b */
    private final Feature[] f29071b;

    /* renamed from: c */
    private final boolean f29072c;

    /* renamed from: d */
    private final int f29073d;

    protected C7280n(C7259j<L> jVar, Feature[] featureArr, boolean z, int i) {
        this.f29070a = jVar;
        this.f29071b = featureArr;
        this.f29072c = z;
        this.f29073d = i;
    }

    /* renamed from: a */
    public void mo29901a() {
        this.f29070a.mo29873a();
    }

    /* renamed from: b */
    public C7259j.C7260a<L> mo29902b() {
        return this.f29070a.mo29874b();
    }

    /* renamed from: c */
    public Feature[] mo29903c() {
        return this.f29071b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo29853d(A a, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    /* renamed from: e */
    public final int mo29904e() {
        return this.f29073d;
    }

    /* renamed from: f */
    public final boolean mo29905f() {
        return this.f29072c;
    }
}
