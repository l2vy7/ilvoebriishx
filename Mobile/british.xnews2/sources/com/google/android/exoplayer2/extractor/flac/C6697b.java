package com.google.android.exoplayer2.extractor.flac;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.flac.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6697b implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6697b f27413a = new C6697b();

    private /* synthetic */ C6697b() {
    }

    public final Extractor[] createExtractors() {
        return FlacExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
