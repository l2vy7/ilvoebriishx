package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9396vb;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.w3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final /* synthetic */ class C9943w3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C9726b4 f46824a;

    /* renamed from: b */
    public final /* synthetic */ String f46825b;

    public /* synthetic */ C9943w3(C9726b4 b4Var, String str) {
        this.f46824a = b4Var;
        this.f46825b = str;
    }

    public final Object call() {
        return new C9396vb("internal.remoteConfig", new C9715a4(this.f46824a, this.f46825b));
    }
}
