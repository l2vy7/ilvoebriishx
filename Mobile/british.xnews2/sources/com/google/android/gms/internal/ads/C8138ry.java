package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ry */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class C8138ry implements InitializationStatus {

    /* renamed from: a */
    public final /* synthetic */ C4632yy f38806a;

    public /* synthetic */ C8138ry(C4632yy yyVar) {
        this.f38806a = yyVar;
    }

    public final Map getAdapterStatusMap() {
        C4632yy yyVar = this.f38806a;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new C8208ty(yyVar));
        return hashMap;
    }
}
