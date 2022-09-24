package com.google.ads.interactivemedia.p038v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.p038v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p038v3.api.FriendlyObstructionPurpose;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.aw */
/* compiled from: IMASDK */
public abstract class C3783aw implements FriendlyObstruction {
    public static C3782av builder() {
        return new C3821u();
    }

    public abstract String detailedReason();

    public String getDetailedReason() {
        return detailedReason();
    }

    public FriendlyObstructionPurpose getPurpose() {
        return purpose();
    }

    public View getView() {
        return view();
    }

    public abstract FriendlyObstructionPurpose purpose();

    public abstract View view();
}
