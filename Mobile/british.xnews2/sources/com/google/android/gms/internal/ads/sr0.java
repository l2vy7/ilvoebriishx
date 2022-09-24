package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class sr0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ mq0 f39035b;

    /* renamed from: c */
    public final /* synthetic */ Map f39036c;

    public /* synthetic */ sr0(mq0 mq0, Map map) {
        this.f39035b = mq0;
        this.f39036c = map;
    }

    public final void run() {
        mq0 mq0 = this.f39035b;
        Map map = this.f39036c;
        int i = tr0.f39496x;
        mq0.mo18321Z("onGcacheInfoEvent", map);
    }
}
