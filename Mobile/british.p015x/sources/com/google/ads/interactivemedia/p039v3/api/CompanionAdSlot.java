package com.google.ads.interactivemedia.p039v3.api;

import android.view.ViewGroup;

/* renamed from: com.google.ads.interactivemedia.v3.api.CompanionAdSlot */
/* compiled from: IMASDK */
public interface CompanionAdSlot {

    /* renamed from: com.google.ads.interactivemedia.v3.api.CompanionAdSlot$ClickListener */
    /* compiled from: IMASDK */
    public interface ClickListener {
        void onCompanionAdClick();
    }

    void addClickListener(ClickListener clickListener);

    ViewGroup getContainer();

    int getHeight();

    int getWidth();

    boolean isFilled();

    void removeClickListener(ClickListener clickListener);

    void setContainer(ViewGroup viewGroup);

    void setSize(int i, int i2);
}
