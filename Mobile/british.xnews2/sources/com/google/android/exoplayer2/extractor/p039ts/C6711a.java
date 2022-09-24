package com.google.android.exoplayer2.extractor.p039ts;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.ts.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6711a implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6711a f27425a = new C6711a();

    private /* synthetic */ C6711a() {
    }

    public final Extractor[] createExtractors() {
        return Ac3Extractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
