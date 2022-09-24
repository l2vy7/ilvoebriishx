package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xa0 extends bp0<eb0> {

    /* renamed from: c */
    private final Object f41117c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final cb0 f41118d;

    /* renamed from: e */
    private boolean f41119e;

    public xa0(cb0 cb0) {
        this.f41118d = cb0;
    }

    /* renamed from: g */
    public final void mo35743g() {
        synchronized (this.f41117c) {
            if (!this.f41119e) {
                this.f41119e = true;
                mo30763e(new ua0(this), new xo0());
                mo30763e(new va0(this), new wa0(this));
            }
        }
    }
}
