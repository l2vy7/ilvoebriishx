package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.NetworkTypeObserver;

/* renamed from: com.google.android.exoplayer2.upstream.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6997d implements NetworkTypeObserver.Listener {

    /* renamed from: a */
    public final /* synthetic */ DefaultBandwidthMeter f27664a;

    public /* synthetic */ C6997d(DefaultBandwidthMeter defaultBandwidthMeter) {
        this.f27664a = defaultBandwidthMeter;
    }

    public final void onNetworkTypeChanged(int i) {
        this.f27664a.onNetworkTypeChanged(i);
    }
}
