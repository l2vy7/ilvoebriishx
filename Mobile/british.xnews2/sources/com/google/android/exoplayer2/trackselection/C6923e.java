package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.RandomTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;

/* renamed from: com.google.android.exoplayer2.trackselection.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6923e implements TrackSelectionUtil.AdaptiveTrackSelectionFactory {

    /* renamed from: a */
    public final /* synthetic */ RandomTrackSelection.Factory f27617a;

    public /* synthetic */ C6923e(RandomTrackSelection.Factory factory) {
        this.f27617a = factory;
    }

    public final ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
        return this.f27617a.lambda$createTrackSelections$0(definition);
    }
}
