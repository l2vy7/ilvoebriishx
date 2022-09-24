package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hn */
/* compiled from: IMASDK */
public final class C4048hn extends C4068ig {
    public C4048hn(C4037hc hcVar, C4115k kVar, int i) {
        super(hcVar, "+CBbXHi/+XdLnSyDhFU51JgiFyDr7i+oHe/ECeOut7QI1M4VCznQFAAROBrz4y9r", "uLz42FqWno2hsY6OwcAoAZ4P+BVsWg+PIwU6Rmo8Y88=", kVar, i, 24);
    }

    /* renamed from: c */
    private final void m17347c() {
        AdvertisingIdClient n = this.f17420a.mo15906n();
        if (n != null) {
            try {
                AdvertisingIdClient.Info info = n.getInfo();
                String a = C4040hf.m17333a(info.getId());
                if (a != null) {
                    synchronized (this.f17423d) {
                        this.f17423d.mo16080o(a);
                        this.f17423d.mo16079n(info.isLimitAdTrackingEnabled());
                        this.f17423d.mo16081p(C4196n.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        if (!this.f17420a.mo15899g()) {
            synchronized (this.f17423d) {
                this.f17423d.mo16080o((String) this.f17424e.invoke((Object) null, new Object[]{this.f17420a.mo15893a()}));
            }
            return;
        }
        m17347c();
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        mo15912d();
        return null;
    }

    /* renamed from: d */
    public final void mo15912d() throws Exception {
        if (this.f17420a.mo15894b()) {
            super.mo15912d();
        } else if (this.f17420a.mo15899g()) {
            m17347c();
        }
    }
}
