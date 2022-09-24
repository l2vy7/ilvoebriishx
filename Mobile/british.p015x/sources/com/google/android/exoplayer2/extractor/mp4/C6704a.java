package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C6693c;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6704a implements ExtractorsFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6704a f27420a = new C6704a();

    private /* synthetic */ C6704a() {
    }

    public final Extractor[] createExtractors() {
        return FragmentedMp4Extractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return C6693c.m28538a(this, uri, map);
    }
}
