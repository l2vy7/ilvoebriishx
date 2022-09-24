package com.google.ads.interactivemedia.p039v3.impl.data;

import android.os.Build;
import android.view.View;
import com.google.ads.interactivemedia.p039v3.api.FriendlyObstructionPurpose;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bf */
/* compiled from: IMASDK */
public abstract class C3793bf {
    public abstract C3793bf attached(boolean z);

    public abstract C3793bf bounds(C3778ar arVar);

    public abstract C3794bg build();

    public abstract C3793bf detailedReason(String str);

    public abstract C3793bf hidden(boolean z);

    public abstract C3793bf purpose(FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract C3793bf type(String str);

    /* access modifiers changed from: package-private */
    public C3793bf view(View view) {
        return attached(Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : true).bounds(C3778ar.builder().locationOnScreenOfView(view).build()).hidden(!view.isShown()).type(view.getClass().getCanonicalName());
    }
}
