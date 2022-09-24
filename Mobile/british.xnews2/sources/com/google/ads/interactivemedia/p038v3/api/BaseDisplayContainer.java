package com.google.ads.interactivemedia.p038v3.api;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* renamed from: com.google.ads.interactivemedia.v3.api.BaseDisplayContainer */
/* compiled from: IMASDK */
public interface BaseDisplayContainer {
    void claim();

    @Deprecated
    void destroy();

    ViewGroup getAdContainer();

    Collection<CompanionAdSlot> getCompanionSlots();

    void registerFriendlyObstruction(FriendlyObstruction friendlyObstruction);

    @Deprecated
    void registerVideoControlsOverlay(View view);

    @Deprecated
    void setAdContainer(ViewGroup viewGroup);

    void setCompanionSlots(Collection<CompanionAdSlot> collection);

    void unregisterAllFriendlyObstructions();

    @Deprecated
    void unregisterAllVideoControlsOverlays();
}
