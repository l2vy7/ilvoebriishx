package com.google.android.exoplayer2.p041ui;

import com.google.android.exoplayer2.p041ui.TrackSelectionView;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.ui.i0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6967i0 implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ Comparator f27638b;

    public /* synthetic */ C6967i0(Comparator comparator) {
        this.f27638b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f27638b.compare(((TrackSelectionView.TrackInfo) obj).format, ((TrackSelectionView.TrackInfo) obj2).format);
    }
}
