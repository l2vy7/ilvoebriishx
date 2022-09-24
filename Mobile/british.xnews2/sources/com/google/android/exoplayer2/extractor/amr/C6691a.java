package com.google.android.exoplayer2.extractor.amr;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.amr.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6691a implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6691a f27410a = new C6691a();

    private /* synthetic */ C6691a() {
    }

    public final Extractor[] createExtractors() {
        return AmrExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
