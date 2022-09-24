package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class pn1 implements e70 {

    /* renamed from: a */
    public final /* synthetic */ tn1 f37721a;

    public /* synthetic */ pn1(tn1 tn1) {
        this.f37721a = tn1;
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        xt0.mo18793u0().mo18251F0(new sn1(this.f37721a, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            xt0.loadData(str, "text/html", C6540C.UTF8_NAME);
        } else {
            xt0.loadDataWithBaseURL(str2, str, "text/html", C6540C.UTF8_NAME, (String) null);
        }
    }
}
