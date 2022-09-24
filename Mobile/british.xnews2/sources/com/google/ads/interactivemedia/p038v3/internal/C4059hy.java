package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hy */
/* compiled from: IMASDK */
public final class C4059hy extends C4068ig {

    /* renamed from: h */
    private final StackTraceElement[] f17403h;

    public C4059hy(C4037hc hcVar, C4115k kVar, int i, StackTraceElement[] stackTraceElementArr) {
        super(hcVar, "xXLnjgvEO8a9Q7TcyZH/ERSXaKjHGr9nJbpUT2CESVYEc6tfesE8AizE0M+CGX/K", "BxojPJPaHa1Mei2UyOZREW/8Cm7FQISAUHyKKXUhyes=", kVar, i, 45);
        this.f17403h = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        C3830ab abVar;
        Object obj = this.f17403h;
        if (obj != null) {
            C4030gw gwVar = new C4030gw((String) this.f17424e.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f17423d) {
                this.f17423d.mo16047E(gwVar.f17342a.longValue());
                if (gwVar.f17343b.booleanValue()) {
                    C4115k kVar = this.f17423d;
                    if (gwVar.f17344c.booleanValue()) {
                        abVar = C3830ab.ENUM_FALSE;
                    } else {
                        abVar = C3830ab.ENUM_TRUE;
                    }
                    kVar.mo16085t(abVar);
                } else {
                    this.f17423d.mo16085t(C3830ab.ENUM_FAILURE);
                }
            }
        }
    }
}
