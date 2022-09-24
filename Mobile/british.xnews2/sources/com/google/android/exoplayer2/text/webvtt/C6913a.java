package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.webvtt.WebvttCueParser;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.text.webvtt.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6913a implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C6913a f27612b = new C6913a();

    private /* synthetic */ C6913a() {
    }

    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((WebvttCueParser.Element) obj).startTag.position, ((WebvttCueParser.Element) obj2).startTag.position);
    }
}
