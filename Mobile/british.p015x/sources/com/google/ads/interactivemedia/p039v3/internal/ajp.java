package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajp */
/* compiled from: IMASDK */
public final class ajp implements ajf {

    /* renamed from: a */
    private final Context f15101a;

    /* renamed from: b */
    private final ajf f15102b;

    public ajp(Context context) {
        this(context, (String) null);
    }

    /* renamed from: b */
    public final ajo mo13800a() {
        return new ajo(this.f15101a, ((ajr) this.f15102b).mo13800a());
    }

    public ajp(Context context, String str) {
        ajr ajr = new ajr();
        ajr.mo13830c(str);
        this.f15101a = context.getApplicationContext();
        this.f15102b = ajr;
    }
}
