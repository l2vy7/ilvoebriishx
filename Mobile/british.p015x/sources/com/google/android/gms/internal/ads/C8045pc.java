package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.pc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8045pc extends C7827jd {
    public C8045pc(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2) {
        super(zbVar, "pzhIFr8jSwvyB8FXK2qfBOfw0jXHNl6+dmbReaTm1jquB51r9sbZLlTA4zaBxZEm", "RbRyr5uGUYOSrOuNnmzV0kl42YeLvs7OFWbwh2MFm18=", d8Var, i, 24);
    }

    /* renamed from: d */
    private final void m36049d() {
        AdvertisingIdClient h = this.f33845b.mo36034h();
        if (h != null) {
            try {
                AdvertisingIdClient.Info info = h.getInfo();
                String d = C7569cc.m30946d(info.getId());
                if (d != null) {
                    synchronized (this.f33848e) {
                        this.f33848e.mo31179v0(d);
                        this.f33848e.mo31178u0(info.isLimitAdTrackingEnabled());
                        this.f33848e.mo31158a0(6);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        if (!this.f33845b.mo36041q()) {
            synchronized (this.f33848e) {
                this.f33848e.mo31179v0((String) this.f33849f.invoke((Object) null, new Object[]{this.f33845b.mo36029b()}));
            }
            return;
        }
        m36049d();
    }

    /* renamed from: c */
    public final Void mo32879c() throws Exception {
        if (this.f33845b.mo36042r()) {
            super.mo32879c();
            return null;
        }
        if (this.f33845b.mo36041q()) {
            m36049d();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        mo32879c();
        return null;
    }
}
