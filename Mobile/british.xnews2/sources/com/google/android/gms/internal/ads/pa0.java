package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzce;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pa0 implements e70<eb0> {

    /* renamed from: a */
    final /* synthetic */ x90 f37559a;

    /* renamed from: b */
    final /* synthetic */ zzce f37560b;

    /* renamed from: c */
    final /* synthetic */ db0 f37561c;

    pa0(db0 db0, C7497ab abVar, x90 x90, zzce zzce) {
        this.f37561c = db0;
        this.f37559a = x90;
        this.f37560b = zzce;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.ads.e70] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        eb0 eb0 = (eb0) obj;
        synchronized (this.f37561c.f20262a) {
            co0.zzi("JS Engine is requesting an update");
            if (this.f37561c.f20269h == 0) {
                co0.zzi("Starting reload.");
                this.f37561c.f20269h = 2;
                this.f37561c.mo18235d((C7497ab) null);
            }
            this.f37559a.mo18315B0("/requestReload", this.f37560b.zza());
        }
    }
}
