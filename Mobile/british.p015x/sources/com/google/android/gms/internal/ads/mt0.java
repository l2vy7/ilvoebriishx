package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class mt0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ mq0 f35614b;

    /* renamed from: c */
    public final /* synthetic */ Map f35615c;

    public /* synthetic */ mt0(mq0 mq0, Map map) {
        this.f35614b = mq0;
        this.f35615c = map;
    }

    public final void run() {
        mq0 mq0 = this.f35614b;
        Map map = this.f35615c;
        int i = nt0.f36107w;
        mq0.mo18321Z("onGcacheInfoEvent", map);
    }
}
