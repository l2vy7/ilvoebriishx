package com.google.android.exoplayer2.extractor.p040ts;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.ts.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6713c implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6713c f27427a = new C6713c();

    private /* synthetic */ C6713c() {
    }

    public final Extractor[] createExtractors() {
        return AdtsExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
