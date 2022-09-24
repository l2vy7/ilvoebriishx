package com.google.android.exoplayer2.p041ui;

import android.view.View;
import com.google.android.exoplayer2.p041ui.StyledPlayerControlView;

/* renamed from: com.google.android.exoplayer2.ui.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6976s implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ StyledPlayerControlView.TrackSelectionAdapter f27648b;

    /* renamed from: c */
    public final /* synthetic */ StyledPlayerControlView.TrackInfo f27649c;

    public /* synthetic */ C6976s(StyledPlayerControlView.TrackSelectionAdapter trackSelectionAdapter, StyledPlayerControlView.TrackInfo trackInfo) {
        this.f27648b = trackSelectionAdapter;
        this.f27649c = trackInfo;
    }

    public final void onClick(View view) {
        this.f27648b.lambda$onBindViewHolder$0(this.f27649c, view);
    }
}
