package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7191a.C7193b;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C7310t<A extends C7191a.C7193b, ResultT> {

    /* renamed from: a */
    private final Feature[] f29138a;

    /* renamed from: b */
    private final boolean f29139b;

    /* renamed from: c */
    private final int f29140c;

    /* renamed from: com.google.android.gms.common.api.internal.t$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C7311a<A extends C7191a.C7193b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C7291p<A, TaskCompletionSource<ResultT>> f29141a;

        /* renamed from: b */
        private boolean f29142b = true;

        /* renamed from: c */
        private Feature[] f29143c;

        /* renamed from: d */
        private int f29144d = 0;

        /* synthetic */ C7311a(C7289o2 o2Var) {
        }

        /* renamed from: a */
        public C7310t<A, ResultT> mo29937a() {
            C4604n.m20089b(this.f29141a != null, "execute parameter required");
            return new C7283n2(this, this.f29143c, this.f29142b, this.f29144d);
        }

        /* renamed from: b */
        public C7311a<A, ResultT> mo29938b(C7291p<A, TaskCompletionSource<ResultT>> pVar) {
            this.f29141a = pVar;
            return this;
        }

        /* renamed from: c */
        public C7311a<A, ResultT> mo29939c(boolean z) {
            this.f29142b = z;
            return this;
        }

        /* renamed from: d */
        public C7311a<A, ResultT> mo29940d(Feature... featureArr) {
            this.f29143c = featureArr;
            return this;
        }

        /* renamed from: e */
        public C7311a<A, ResultT> mo29941e(int i) {
            this.f29144d = i;
            return this;
        }
    }

    @Deprecated
    public C7310t() {
        this.f29138a = null;
        this.f29139b = false;
        this.f29140c = 0;
    }

    protected C7310t(Feature[] featureArr, boolean z, int i) {
        this.f29138a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f29139b = z2;
        this.f29140c = i;
    }

    /* renamed from: a */
    public static <A extends C7191a.C7193b, ResultT> C7311a<A, ResultT> m29801a() {
        return new C7311a<>((C7289o2) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo29906b(A a, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    /* renamed from: c */
    public boolean mo29934c() {
        return this.f29139b;
    }

    /* renamed from: d */
    public final int mo29935d() {
        return this.f29140c;
    }

    /* renamed from: e */
    public final Feature[] mo29936e() {
        return this.f29138a;
    }
}
