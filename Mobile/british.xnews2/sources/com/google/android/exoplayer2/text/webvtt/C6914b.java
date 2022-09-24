package com.google.android.exoplayer2.text.webvtt;

import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.text.webvtt.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6914b implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C6914b f27613b = new C6914b();

    private /* synthetic */ C6914b() {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.compare(((WebvttCueInfo) obj).startTimeUs, ((WebvttCueInfo) obj2).startTimeUs);
    }
}
