package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bli */
/* compiled from: IMASDK */
public final class bli {
    bli() {
    }

    /* renamed from: a */
    public static final Map<?, ?> m16404a(Object obj) {
        return (blh) obj;
    }

    /* renamed from: b */
    public static final blg<?, ?> m16405b(Object obj) {
        bli bli = (bli) obj;
        throw null;
    }

    /* renamed from: c */
    public static final Map<?, ?> m16406c(Object obj) {
        return (blh) obj;
    }

    /* renamed from: d */
    public static final int m16407d(Object obj, Object obj2) {
        blh blh = (blh) obj;
        bli bli = (bli) obj2;
        if (blh.isEmpty()) {
            return 0;
        }
        Iterator it = blh.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: e */
    public static final boolean m16408e(Object obj) {
        return !((blh) obj).mo15437e();
    }

    /* renamed from: f */
    public static final Object m16409f(Object obj, Object obj2) {
        blh blh = (blh) obj;
        blh blh2 = (blh) obj2;
        if (!blh2.isEmpty()) {
            if (!blh.mo15437e()) {
                blh = blh.mo15434c();
            }
            blh.mo15433b(blh2);
        }
        return blh;
    }

    /* renamed from: g */
    public static final Object m16410g() {
        return blh.m16397a().mo15434c();
    }

    /* renamed from: h */
    public static final void m16411h(Object obj) {
        ((blh) obj).mo15436d();
    }

    /* renamed from: i */
    static <K, V> void m16412i(bjw bjw, blg<K, V> blg, K k, V v) throws IOException {
        bnb bnb = blg.f16630a;
        bke.m16285f(bjw, 1, k);
        bke.m16285f(bjw, 2, v);
    }

    /* renamed from: j */
    static <K, V> int m16413j(blg<K, V> blg, K k, V v) {
        bnb bnb = blg.f16630a;
        return bke.m16283d(1, k) + bke.m16283d(2, v);
    }
}
