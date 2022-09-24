package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qs0 extends ms0 {
    public qs0(mq0 mq0) {
        super(mq0);
    }

    /* renamed from: g */
    public final void mo18556g() {
    }

    /* renamed from: s */
    public final boolean mo18567s(String str) {
        String e = vn0.m38849e(str);
        mq0 mq0 = (mq0) this.f20550d.get();
        if (!(mq0 == null || e == null)) {
            mq0.mo18768o(e, this);
        }
        co0.zzj("VideoStreamNoopCache is doing nothing.");
        mo18557i(str, e, "noop", "Noop cache is a noop.");
        return false;
    }
}
