package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class u12 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ mb3 f39720a;

    /* renamed from: b */
    public final /* synthetic */ mb3 f39721b;

    public /* synthetic */ u12(mb3 mb3, mb3 mb32) {
        this.f39720a = mb3;
        this.f39721b = mb32;
    }

    public final Object call() {
        return new j22((JSONObject) this.f39720a.get(), (wi0) this.f39721b.get());
    }
}
