package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class rh0 extends nh0 {

    /* renamed from: b */
    final /* synthetic */ UpdateImpressionUrlsCallback f38686b;

    rh0(uh0 uh0, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.f38686b = updateImpressionUrlsCallback;
    }

    /* renamed from: b */
    public final void mo33543b(String str) {
        this.f38686b.onFailure(str);
    }

    /* renamed from: y1 */
    public final void mo33544y1(List<Uri> list) {
        this.f38686b.onSuccess(list);
    }
}
