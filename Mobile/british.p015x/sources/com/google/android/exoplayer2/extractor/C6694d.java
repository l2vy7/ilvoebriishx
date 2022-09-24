package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.d */
/* compiled from: TrackOutput */
public final /* synthetic */ class C6694d {
    /* renamed from: a */
    public static int m28541a(TrackOutput trackOutput, DataReader dataReader, int i, boolean z) throws IOException {
        return trackOutput.sampleData(dataReader, i, z, 0);
    }

    /* renamed from: b */
    public static void m28542b(TrackOutput trackOutput, ParsableByteArray parsableByteArray, int i) {
        trackOutput.sampleData(parsableByteArray, i, 0);
    }
}
