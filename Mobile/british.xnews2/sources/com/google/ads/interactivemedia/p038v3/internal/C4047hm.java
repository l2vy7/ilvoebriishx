package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hm */
/* compiled from: IMASDK */
public final class C4047hm extends C4068ig {

    /* renamed from: h */
    private final long f17394h;

    public C4047hm(C4037hc hcVar, C4115k kVar, long j, int i) {
        super(hcVar, "5OYIQdsidStip3SBjywYm0rOM8tyA+MY9PPNX7JmSvza1Onp24UtEjVR4gU3Ig+9", "GcgQ+JQVen6BN2jyFQVqgjJfTksMX5RTfakx+qKDe48=", kVar, i, 25);
        this.f17394h = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f17424e.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f17423d) {
            this.f17423d.mo16082q(longValue);
            long j = this.f17394h;
            if (j != 0) {
                this.f17423d.mo16059Q(longValue - j);
                this.f17423d.mo16061S(this.f17394h);
            }
        }
    }
}
