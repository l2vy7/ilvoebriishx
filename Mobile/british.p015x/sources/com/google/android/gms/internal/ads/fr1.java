package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fr1 implements Callable<ir1> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zza f31847a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ku0 f31848b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f31849c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final nv1 f31850d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final nw2 f31851e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final f42 f31852f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Executor f31853g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C7497ab f31854h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zzcjf f31855i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final sx2 f31856j;

    public fr1(Context context, Executor executor, C7497ab abVar, zzcjf zzcjf, zza zza, ku0 ku0, f42 f42, sx2 sx2, nv1 nv1, nw2 nw2) {
        this.f31849c = context;
        this.f31853g = executor;
        this.f31854h = abVar;
        this.f31855i = zzcjf;
        this.f31847a = zza;
        this.f31848b = ku0;
        this.f31852f = f42;
        this.f31856j = sx2;
        this.f31850d = nv1;
        this.f31851e = nw2;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        ir1 ir1 = new ir1(this);
        ir1.mo32757h();
        return ir1;
    }
}
