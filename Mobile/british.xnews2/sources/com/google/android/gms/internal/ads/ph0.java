package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class ph0 extends sm0 {

    /* renamed from: b */
    final /* synthetic */ QueryInfoGenerationCallback f37636b;

    ph0(qh0 qh0, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.f37636b = queryInfoGenerationCallback;
    }

    /* renamed from: I1 */
    public final void mo34122I1(String str, String str2, Bundle bundle) {
        this.f37636b.onSuccess(new QueryInfo(new C7521az(str, bundle, str2)));
    }

    /* renamed from: a */
    public final void mo34123a(String str) {
        this.f37636b.onFailure(str);
    }
}
