package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xv0 {

    /* renamed from: a */
    private final zzcjf f41338a;

    /* renamed from: b */
    private final Context f41339b;

    /* renamed from: c */
    private final WeakReference<Context> f41340c;

    /* synthetic */ xv0(vv0 vv0, wv0 wv0) {
        this.f41338a = vv0.f40560a;
        this.f41339b = vv0.f40561b;
        this.f41340c = vv0.f40562c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo35803a() {
        return this.f41339b;
    }

    /* renamed from: b */
    public final C7497ab mo35804b() {
        return new C7497ab(new zzi(this.f41339b, this.f41338a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final x20 mo35805c() {
        return new x20(this.f41339b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final zzcjf mo35806d() {
        return this.f41338a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo35807e() {
        return zzt.zzp().zzd(this.f41339b, this.f41338a.f43036b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final WeakReference<Context> mo35808f() {
        return this.f41340c;
    }
}
