package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.source.hls.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6863e implements HlsExtractorFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6863e f27551a = new C6863e();

    private /* synthetic */ C6863e() {
    }

    public final HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput) {
        return MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput);
    }
}
