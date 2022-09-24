package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class sh0 extends nh0 {

    /* renamed from: b */
    final /* synthetic */ UpdateClickUrlCallback f38969b;

    sh0(uh0 uh0, UpdateClickUrlCallback updateClickUrlCallback) {
        this.f38969b = updateClickUrlCallback;
    }

    /* renamed from: b */
    public final void mo33543b(String str) {
        this.f38969b.onFailure(str);
    }

    /* renamed from: y1 */
    public final void mo33544y1(List<Uri> list) {
        this.f38969b.onSuccess(list.get(0));
    }
}
