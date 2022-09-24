package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

/* renamed from: com.google.android.exoplayer2.extractor.flac.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6696a implements BinarySearchSeeker.SeekTimestampConverter {

    /* renamed from: a */
    public final /* synthetic */ FlacStreamMetadata f27412a;

    public /* synthetic */ C6696a(FlacStreamMetadata flacStreamMetadata) {
        this.f27412a = flacStreamMetadata;
    }

    public final long timeUsToTargetTime(long j) {
        return this.f27412a.getSampleNumber(j);
    }
}
