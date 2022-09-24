package com.google.android.exoplayer2.p040ui;

import android.view.View;
import com.google.android.exoplayer2.p040ui.StyledPlayerControlView;

/* renamed from: com.google.android.exoplayer2.ui.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6973o implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ StyledPlayerControlView.PlaybackSpeedAdapter f27644b;

    /* renamed from: c */
    public final /* synthetic */ int f27645c;

    public /* synthetic */ C6973o(StyledPlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter, int i) {
        this.f27644b = playbackSpeedAdapter;
        this.f27645c = i;
    }

    public final void onClick(View view) {
        this.f27644b.lambda$onBindViewHolder$0(this.f27645c, view);
    }
}
