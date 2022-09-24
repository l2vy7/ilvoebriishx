package com.google.ads.interactivemedia.p039v3.api;

import com.google.ads.interactivemedia.p039v3.internal.C3850ar;

/* renamed from: com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose */
/* compiled from: IMASDK */
public enum FriendlyObstructionPurpose {
    VIDEO_CONTROLS,
    CLOSE_AD,
    NOT_VISIBLE,
    OTHER;

    public C3850ar getOmidPurpose() {
        return (C3850ar) Enum.valueOf(C3850ar.class, name());
    }
}
