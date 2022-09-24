package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.gc */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8542gc {

    /* renamed from: b */
    private static volatile C8542gc f43495b;

    /* renamed from: c */
    static final C8542gc f43496c = new C8542gc(true);

    /* renamed from: a */
    private final Map f43497a;

    C8542gc() {
        this.f43497a = new HashMap();
    }

    /* renamed from: a */
    public static C8542gc m40939a() {
        C8542gc gcVar = f43495b;
        if (gcVar == null) {
            synchronized (C8542gc.class) {
                gcVar = f43495b;
                if (gcVar == null) {
                    gcVar = f43496c;
                    f43495b = gcVar;
                }
            }
        }
        return gcVar;
    }

    C8542gc(boolean z) {
        this.f43497a = Collections.emptyMap();
    }
}
