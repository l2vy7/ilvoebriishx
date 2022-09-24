package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class x12 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ mb3 f40989a;

    /* renamed from: b */
    public final /* synthetic */ mb3 f40990b;

    /* renamed from: c */
    public final /* synthetic */ mb3 f40991c;

    public /* synthetic */ x12(mb3 mb3, mb3 mb32, mb3 mb33) {
        this.f40989a = mb3;
        this.f40990b = mb32;
        this.f40991c = mb33;
    }

    public final Object call() {
        return new c22((g22) this.f40989a.get(), (JSONObject) this.f40990b.get(), (wi0) this.f40991c.get());
    }
}
