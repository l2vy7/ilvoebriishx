package com.google.android.exoplayer2.extractor.wav;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.wav.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6716a implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6716a f27431a = new C6716a();

    private /* synthetic */ C6716a() {
    }

    public final Extractor[] createExtractors() {
        return WavExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
