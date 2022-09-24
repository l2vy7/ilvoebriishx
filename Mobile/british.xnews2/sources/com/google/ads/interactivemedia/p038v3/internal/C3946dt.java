package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.api.CompanionAdSlot;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dt */
/* compiled from: IMASDK */
final class C3946dt implements bfe<CompanionAdSlot> {
    C3946dt() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bey mo15001a(Object obj) {
        CompanionAdSlot companionAdSlot = (CompanionAdSlot) obj;
        int width = companionAdSlot.getWidth();
        int height = companionAdSlot.getHeight();
        StringBuilder sb = new StringBuilder(23);
        sb.append(width);
        sb.append("x");
        sb.append(height);
        return new bfd(sb.toString());
    }
}
