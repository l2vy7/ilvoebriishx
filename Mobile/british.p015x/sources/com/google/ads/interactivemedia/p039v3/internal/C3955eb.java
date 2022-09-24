package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.api.AdEvent;
import com.google.ads.interactivemedia.p039v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.p039v3.api.CuePoint;
import com.google.ads.interactivemedia.p039v3.impl.data.C3803c;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.eb */
/* compiled from: IMASDK */
public final class C3955eb {

    /* renamed from: a */
    public final AdEvent.AdEventType f16958a;

    /* renamed from: b */
    public final C3803c f16959b;

    /* renamed from: c */
    public Map<String, String> f16960c;

    /* renamed from: d */
    public List<CuePoint> f16961d;

    /* renamed from: e */
    AdProgressInfo f16962e;

    /* renamed from: f */
    public double f16963f;

    public C3955eb(AdEvent.AdEventType adEventType, C3803c cVar) {
        this.f16958a = adEventType;
        this.f16959b = cVar;
    }

    public final boolean equals(Object obj) {
        return bnh.m16832c(this, obj, new String[0]);
    }

    public final int hashCode() {
        return bnj.m16840b(this, new String[0]);
    }
}
