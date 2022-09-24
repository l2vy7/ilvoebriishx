package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.C3456a0;

@Deprecated
/* renamed from: com.facebook.share.internal.e */
/* compiled from: LikeStatusClient */
final class C3700e extends C3456a0 {

    /* renamed from: k */
    private String f13704k;

    C3700e(Context context, String str, String str2) {
        super(context, 65542, 65543, 20141001, str);
        this.f13704k = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo11910d(Bundle bundle) {
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", this.f13704k);
    }
}
