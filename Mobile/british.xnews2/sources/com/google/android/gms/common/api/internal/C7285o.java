package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7191a.C7193b;
import com.google.android.gms.common.api.internal.C7259j;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.o */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C7285o<A extends C7191a.C7193b, L> {

    /* renamed from: a */
    public final C7280n<A, L> f29076a;

    /* renamed from: b */
    public final C7320v<A, L> f29077b;

    /* renamed from: c */
    public final Runnable f29078c;

    /* renamed from: com.google.android.gms.common.api.internal.o$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C7286a<A extends C7191a.C7193b, L> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C7291p<A, TaskCompletionSource<Void>> f29079a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C7291p<A, TaskCompletionSource<Boolean>> f29080b;

        /* renamed from: c */
        private Runnable f29081c = C7234d2.f28997b;

        /* renamed from: d */
        private C7259j<L> f29082d;

        /* renamed from: e */
        private Feature[] f29083e;

        /* renamed from: f */
        private boolean f29084f = true;

        /* renamed from: g */
        private int f29085g;

        /* synthetic */ C7286a(C7247g2 g2Var) {
        }

        /* renamed from: a */
        public C7285o<A, L> mo29907a() {
            boolean z = true;
            C4604n.m20089b(this.f29079a != null, "Must set register function");
            C4604n.m20089b(this.f29080b != null, "Must set unregister function");
            if (this.f29082d == null) {
                z = false;
            }
            C4604n.m20089b(z, "Must set holder");
            return new C7285o<>(new C7238e2(this, this.f29082d, this.f29083e, this.f29084f, this.f29085g), new C7243f2(this, (C7259j.C7260a) C4604n.m20099l(this.f29082d.mo29874b(), "Key must not be null")), this.f29081c, (C7252h2) null);
        }

        /* renamed from: b */
        public C7286a<A, L> mo29908b(C7291p<A, TaskCompletionSource<Void>> pVar) {
            this.f29079a = pVar;
            return this;
        }

        /* renamed from: c */
        public C7286a<A, L> mo29909c(Feature... featureArr) {
            this.f29083e = featureArr;
            return this;
        }

        /* renamed from: d */
        public C7286a<A, L> mo29910d(int i) {
            this.f29085g = i;
            return this;
        }

        /* renamed from: e */
        public C7286a<A, L> mo29911e(C7291p<A, TaskCompletionSource<Boolean>> pVar) {
            this.f29080b = pVar;
            return this;
        }

        /* renamed from: f */
        public C7286a<A, L> mo29912f(C7259j<L> jVar) {
            this.f29082d = jVar;
            return this;
        }
    }

    /* synthetic */ C7285o(C7280n nVar, C7320v vVar, Runnable runnable, C7252h2 h2Var) {
        this.f29076a = nVar;
        this.f29077b = vVar;
        this.f29078c = runnable;
    }

    /* renamed from: a */
    public static <A extends C7191a.C7193b, L> C7286a<A, L> m29716a() {
        return new C7286a<>((C7247g2) null);
    }
}
