package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gn */
/* compiled from: IMASDK */
public final class C4021gn extends C4022go {

    /* renamed from: u */
    private AdvertisingIdClient.Info f17326u;

    protected C4021gn(Context context) {
        super(context);
    }

    /* renamed from: j */
    public static C4021gn m17253j(Context context) {
        C4022go.m17260o(context, true);
        return new C4021gn(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C4115k mo15872h(Context context) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C4115k mo15873i(Context context) {
        return null;
    }

    /* renamed from: k */
    public final String mo15874k(String str, String str2) {
        byte[] f = C4001fu.m17214f(str, str2);
        if (f != null) {
            return C4038hd.m17316b(f, true);
        }
        return Integer.toString(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo15875l(C4037hc hcVar, Context context, C4115k kVar, C3980f fVar) {
        if (hcVar.f17359b) {
            AdvertisingIdClient.Info info = this.f17326u;
            if (info != null) {
                String id = info.getId();
                if (!TextUtils.isEmpty(id)) {
                    kVar.mo16080o(C4040hf.m17333a(id));
                    kVar.mo16081p(C4196n.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    kVar.mo16079n(this.f17326u.isLimitAdTrackingEnabled());
                }
                this.f17326u = null;
                return;
            }
            return;
        }
        C4022go.m17263s(mo15876m(hcVar, context, kVar, fVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final List<Callable<Void>> mo15876m(C4037hc hcVar, Context context, C4115k kVar, C3980f fVar) {
        ArrayList arrayList = new ArrayList();
        if (hcVar.mo15895c() == null) {
            return arrayList;
        }
        arrayList.add(new C4048hn(hcVar, kVar, hcVar.mo15907o()));
        return arrayList;
    }

    /* renamed from: n */
    public final void mo15877n(AdvertisingIdClient.Info info) {
        this.f17326u = info;
    }
}
