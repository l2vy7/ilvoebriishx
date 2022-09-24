package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class yp1 implements C7763hn {

    /* renamed from: b */
    public final /* synthetic */ xt0 f41949b;

    public /* synthetic */ yp1(xt0 xt0) {
        this.f41949b = xt0;
    }

    /* renamed from: n0 */
    public final void mo18767n0(C7689fn fnVar) {
        xt0 xt0 = this.f41949b;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != fnVar.f31824j ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        xt0.mo18321Z("onAdVisibilityChanged", hashMap);
    }
}
