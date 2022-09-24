package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class le2 implements p33 {

    /* renamed from: a */
    public static final /* synthetic */ le2 f35014a = new le2();

    private /* synthetic */ le2() {
    }

    public final Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new ne2(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
