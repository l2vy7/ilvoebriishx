package com.google.android.exoplayer2.p040ui;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.AdViewProvider */
public interface AdViewProvider {
    List<AdOverlayInfo> getAdOverlayInfos();

    ViewGroup getAdViewGroup();
}
