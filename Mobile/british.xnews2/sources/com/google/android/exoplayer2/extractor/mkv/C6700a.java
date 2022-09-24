package com.google.android.exoplayer2.extractor.mkv;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.mkv.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6700a implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6700a f27415a = new C6700a();

    private /* synthetic */ C6700a() {
    }

    public final Extractor[] createExtractors() {
        return MatroskaExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
