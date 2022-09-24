package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class ez1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C7497ab f31553a;

    /* renamed from: b */
    public final /* synthetic */ Context f31554b;

    public /* synthetic */ ez1(C7497ab abVar, Context context) {
        this.f31553a = abVar;
        this.f31554b = context;
    }

    public final Object call() {
        C7497ab abVar = this.f31553a;
        return abVar.mo30331c().zzg(this.f31554b);
    }
}
