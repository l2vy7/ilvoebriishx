package com.google.android.exoplayer2.extractor.ogg;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.ogg.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6709a implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6709a f27424a = new C6709a();

    private /* synthetic */ C6709a() {
    }

    public final Extractor[] createExtractors() {
        return OggExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
