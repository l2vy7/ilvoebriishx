package com.google.android.exoplayer2.extractor.mp3;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.mp3.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6701a implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6701a f27416a = new C6701a();

    private /* synthetic */ C6701a() {
    }

    public final Extractor[] createExtractors() {
        return Mp3Extractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
