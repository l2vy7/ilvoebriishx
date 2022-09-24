package com.google.android.exoplayer2.extractor.flv;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.flv.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6698a implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6698a f27414a = new C6698a();

    private /* synthetic */ C6698a() {
    }

    public final Extractor[] createExtractors() {
        return FlvExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
