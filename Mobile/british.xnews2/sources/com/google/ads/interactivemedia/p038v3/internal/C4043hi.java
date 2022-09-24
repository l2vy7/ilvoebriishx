package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hi */
/* compiled from: IMASDK */
public final class C4043hi extends C4068ig {

    /* renamed from: h */
    private static final C4069ih<String> f17387h = new C4069ih<>();

    /* renamed from: i */
    private final Context f17388i;

    public C4043hi(C4037hc hcVar, C4115k kVar, int i, Context context) {
        super(hcVar, "yPgicEGzwf3pLaq/3P+u7LLtd+dkw8DYS9ofUgpVqMp2QWe7dGdxtv2HaEVDUnS9", "u860xWUndVipWEY9XVs+6Wwt96gWjvwTExZKaE1+WsQ=", kVar, i, 29);
        this.f17388i = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        this.f17423d.mo16075j("E");
        AtomicReference<String> a = f17387h.mo15917a(this.f17388i.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f17424e.invoke((Object) null, new Object[]{this.f17388i}));
                }
            }
        }
        String str = a.get();
        synchronized (this.f17423d) {
            this.f17423d.mo16075j(C4038hd.m17316b(str.getBytes(), true));
        }
    }
}
