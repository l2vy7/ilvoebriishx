package com.google.ads.interactivemedia.p038v3.internal;

import android.os.AsyncTask;
import android.os.Build;
import android.os.RemoteException;
import com.google.ads.interactivemedia.p038v3.api.StreamRequest;
import com.google.ads.interactivemedia.p038v3.impl.data.C3785ay;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ct */
/* compiled from: IMASDK */
final class C3919ct extends AsyncTask<Void, Void, C3917cr> {

    /* renamed from: a */
    final /* synthetic */ C3920cu f16843a;

    /* renamed from: b */
    private final StreamRequest f16844b;

    /* renamed from: c */
    private final String f16845c;

    C3919ct(C3920cu cuVar, StreamRequest streamRequest, String str) {
        this.f16843a = cuVar;
        this.f16844b = streamRequest;
        this.f16845c = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str;
        Void[] voidArr = (Void[]) objArr;
        this.f16843a.mo15643b();
        try {
            C3920cu cuVar = this.f16843a;
            anp anp = cuVar.f16846a;
            if (anp != null) {
                str = anp.mo14142c(cuVar.f16847b);
                return new C3917cr(new C3997fq(this.f16843a.f16847b), str, C3920cu.m16929d(this.f16843a));
            }
        } catch (RemoteException unused) {
        }
        str = "";
        return new C3917cr(new C3997fq(this.f16843a.f16847b), str, C3920cu.m16929d(this.f16843a));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        C3917cr crVar = (C3917cr) obj;
        C3949dw dwVar = new C3949dw(C3947du.adsLoader, C3948dv.requestStream, this.f16845c, C3785ay.createFromStreamRequest(this.f16844b, String.format("android%s:%s:%s", new Object[]{Build.VERSION.RELEASE, "3.23.0", this.f16843a.f16847b.getPackageName()}), crVar.f16840a, C3920cu.m16931f(this.f16843a), this.f16843a.f16855j, C3920cu.m16933h(this.f16843a), C4130ko.m17746b(this.f16843a.f16847b, this.f16843a.f16856k), crVar.f16842c, crVar.f16841b, this.f16843a.f16857l));
        this.f16843a.f16848c.mo15703a(crVar.f16841b);
        this.f16843a.f16848c.mo15717o(dwVar);
    }
}
