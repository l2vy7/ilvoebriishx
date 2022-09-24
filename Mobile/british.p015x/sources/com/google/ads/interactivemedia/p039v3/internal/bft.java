package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bft */
/* compiled from: IMASDK */
final class bft implements bgj {

    /* renamed from: a */
    final /* synthetic */ Constructor f16252a;

    bft(Constructor constructor) {
        this.f16252a = constructor;
    }

    /* renamed from: a */
    public final Object mo15028a() {
        try {
            return this.f16252a.newInstance((Object[]) null);
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(this.f16252a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 30);
            sb.append("Failed to invoke ");
            sb.append(valueOf);
            sb.append(" with no args");
            throw new RuntimeException(sb.toString(), e);
        } catch (InvocationTargetException e2) {
            String valueOf2 = String.valueOf(this.f16252a);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 30);
            sb2.append("Failed to invoke ");
            sb2.append(valueOf2);
            sb2.append(" with no args");
            throw new RuntimeException(sb2.toString(), e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
