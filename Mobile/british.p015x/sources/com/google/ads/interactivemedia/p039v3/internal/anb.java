package com.google.ads.interactivemedia.p039v3.internal;

import android.hardware.display.DisplayManager;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anb */
/* compiled from: IMASDK */
final class anb implements DisplayManager.DisplayListener {

    /* renamed from: a */
    final /* synthetic */ and f15400a;

    /* renamed from: b */
    private final DisplayManager f15401b;

    public anb(and and, DisplayManager displayManager) {
        this.f15400a = and;
        this.f15401b = displayManager;
    }

    /* renamed from: a */
    public final void mo14067a() {
        this.f15401b.registerDisplayListener(this, amm.m14241k());
    }

    /* renamed from: b */
    public final void mo14068b() {
        this.f15401b.unregisterDisplayListener(this);
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f15400a.m14352q();
        }
    }

    public final void onDisplayRemoved(int i) {
    }
}
