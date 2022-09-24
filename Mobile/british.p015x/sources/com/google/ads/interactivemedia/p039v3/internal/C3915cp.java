package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.RemoteException;
import com.google.ads.interactivemedia.p039v3.api.AdsRequest;
import com.google.ads.interactivemedia.p039v3.impl.data.C3785ay;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cp */
/* compiled from: IMASDK */
final class C3915cp extends AsyncTask<String, Void, C3916cq> {

    /* renamed from: a */
    final /* synthetic */ C3920cu f16834a;

    /* renamed from: b */
    private final AdsRequest f16835b;

    /* renamed from: c */
    private final String f16836c;

    C3915cp(C3920cu cuVar, AdsRequest adsRequest, String str) {
        this.f16834a = cuVar;
        this.f16835b = adsRequest;
        this.f16836c = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str = ((String[]) objArr)[0];
        this.f16834a.mo15643b();
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                anp anp = this.f16834a.f16846a;
                if (anp != null && anp.mo14140a(parse)) {
                    C3920cu cuVar = this.f16834a;
                    str = cuVar.f16846a.mo14141b(parse, cuVar.f16847b).toString();
                }
            } catch (RemoteException | anv | IllegalStateException unused) {
            }
        }
        return new C3916cq(new C3997fq(this.f16834a.f16847b), str, C3920cu.m16929d(this.f16834a));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        C3916cq cqVar = (C3916cq) obj;
        this.f16835b.setAdTagUrl(cqVar.f16837a);
        C3949dw dwVar = new C3949dw(C3947du.adsLoader, C3948dv.requestAds, this.f16836c, C3785ay.create(this.f16835b, String.format("android%s:%s:%s", new Object[]{Build.VERSION.RELEASE, "3.23.0", this.f16834a.f16847b.getPackageName()}), cqVar.f16838b, C3920cu.m16931f(this.f16834a), this.f16834a.f16855j, C3920cu.m16933h(this.f16834a), C4130ko.m17746b(this.f16834a.f16847b, this.f16834a.f16856k), cqVar.f16839c, this.f16834a.f16858m));
        this.f16834a.f16848c.mo15703a(cqVar.f16839c);
        this.f16834a.f16848c.mo15717o(dwVar);
    }
}
