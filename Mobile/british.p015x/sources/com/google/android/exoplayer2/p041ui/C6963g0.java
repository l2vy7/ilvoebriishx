package com.google.android.exoplayer2.p041ui;

import android.content.DialogInterface;

/* renamed from: com.google.android.exoplayer2.ui.g0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6963g0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ TrackSelectionDialogBuilder f27631b;

    /* renamed from: c */
    public final /* synthetic */ TrackSelectionView f27632c;

    public /* synthetic */ C6963g0(TrackSelectionDialogBuilder trackSelectionDialogBuilder, TrackSelectionView trackSelectionView) {
        this.f27631b = trackSelectionDialogBuilder;
        this.f27632c = trackSelectionView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f27631b.lambda$setUpDialogView$1(this.f27632c, dialogInterface, i);
    }
}
