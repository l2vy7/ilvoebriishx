package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6706c implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6706c f27422a = new C6706c();

    private /* synthetic */ C6706c() {
    }

    public final Extractor[] createExtractors() {
        return Mp4Extractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
