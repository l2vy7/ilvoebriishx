package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7213i;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.C7342l;
import com.google.android.gms.common.api.C7343m;
import com.google.android.gms.common.api.C7344n;
import com.google.android.gms.common.api.C7345o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4604n;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.s2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7308s2<R extends C7341k> extends C7345o<R> implements C7342l<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C7344n<? super R, ? extends C7341k> f29127a;

    /* renamed from: b */
    private C7308s2<? extends C7341k> f29128b;

    /* renamed from: c */
    private volatile C7343m<? super R> f29129c;

    /* renamed from: d */
    private final Object f29130d;

    /* renamed from: e */
    private Status f29131e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference<C7206f> f29132f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C7299q2 f29133g;

    /* renamed from: g */
    private final void m29789g(Status status) {
        synchronized (this.f29130d) {
            this.f29131e = status;
            m29790h(status);
        }
    }

    /* renamed from: h */
    private final void m29790h(Status status) {
        synchronized (this.f29130d) {
            C7344n<? super R, ? extends C7341k> nVar = this.f29127a;
            if (nVar != null) {
                ((C7308s2) C4604n.m20098k(this.f29128b)).m29789g((Status) C4604n.m20099l(nVar.mo29964a(status), "onFailure must not return null"));
            } else if (m29791i()) {
                ((C7343m) C4604n.m20098k(this.f29129c)).mo29962b(status);
            }
        }
    }

    @GuardedBy("mSyncToken")
    /* renamed from: i */
    private final boolean m29791i() {
        return (this.f29129c == null || ((C7206f) this.f29132f.get()) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m29792j(C7341k kVar) {
        if (kVar instanceof C7213i) {
            try {
                ((C7213i) kVar).release();
            } catch (RuntimeException e) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(kVar)), e);
            }
        }
    }

    /* renamed from: a */
    public final void mo29606a(R r) {
        synchronized (this.f29130d) {
            if (!r.mo29527p0().mo29735G0()) {
                m29789g(r.mo29527p0());
                m29792j(r);
            } else if (this.f29127a != null) {
                C7257i2.m29679a().submit(new C7294p2(this, r));
            } else if (m29791i()) {
                ((C7343m) C4604n.m20098k(this.f29129c)).mo29963c(r);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo29925f() {
        this.f29129c = null;
    }
}
