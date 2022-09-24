package com.google.android.exoplayer2.p040ui;

import com.google.android.exoplayer2.p040ui.TrackSelectionDialogBuilder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.h0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6965h0 implements TrackSelectionDialogBuilder.DialogCallback {

    /* renamed from: a */
    public final /* synthetic */ DefaultTrackSelector f27633a;

    /* renamed from: b */
    public final /* synthetic */ DefaultTrackSelector.Parameters f27634b;

    /* renamed from: c */
    public final /* synthetic */ int f27635c;

    /* renamed from: d */
    public final /* synthetic */ TrackGroupArray f27636d;

    public /* synthetic */ C6965h0(DefaultTrackSelector defaultTrackSelector, DefaultTrackSelector.Parameters parameters, int i, TrackGroupArray trackGroupArray) {
        this.f27633a = defaultTrackSelector;
        this.f27634b = parameters;
        this.f27635c = i;
        this.f27636d = trackGroupArray;
    }

    public final void onTracksSelected(boolean z, List list) {
        TrackSelectionDialogBuilder.lambda$new$0(this.f27633a, this.f27634b, this.f27635c, this.f27636d, z, list);
    }
}
