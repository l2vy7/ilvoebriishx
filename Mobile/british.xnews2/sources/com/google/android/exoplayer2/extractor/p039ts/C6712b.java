package com.google.android.exoplayer2.extractor.p039ts;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.ts.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6712b implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6712b f27426a = new C6712b();

    private /* synthetic */ C6712b() {
    }

    public final Extractor[] createExtractors() {
        return Ac4Extractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
