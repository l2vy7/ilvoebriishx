package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vj2 implements zi2<wj2> {

    /* renamed from: a */
    private final Executor f40444a;

    /* renamed from: b */
    private final String f40445b;

    /* renamed from: c */
    private final PackageInfo f40446c;

    /* renamed from: d */
    private final fn0 f40447d;

    public vj2(fn0 fn0, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.f40447d = fn0;
        this.f40444a = executor;
        this.f40445b = str;
        this.f40446c = packageInfo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ mb3 mo35435a(Throwable th) throws Exception {
        return bb3.m30649i(new wj2(this.f40445b));
    }

    public final mb3<wj2> zzb() {
        return bb3.m30647g(bb3.m30653m(bb3.m30649i(this.f40445b), tj2.f39438a, this.f40444a), Throwable.class, new uj2(this), this.f40444a);
    }
}
