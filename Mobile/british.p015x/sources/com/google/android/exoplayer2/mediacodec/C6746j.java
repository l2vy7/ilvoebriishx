package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.mediacodec.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6746j implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ MediaCodecUtil.ScoreProvider f27463b;

    public /* synthetic */ C6746j(MediaCodecUtil.ScoreProvider scoreProvider) {
        this.f27463b = scoreProvider;
    }

    public final int compare(Object obj, Object obj2) {
        return MediaCodecUtil.lambda$sortByScore$3(this.f27463b, obj, obj2);
    }
}
