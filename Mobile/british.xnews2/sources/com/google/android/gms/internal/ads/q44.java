package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q44 implements o54 {

    /* renamed from: a */
    private final xc1 f37859a;

    /* renamed from: b */
    private final SparseArray<o54> f37860b;

    /* renamed from: c */
    private final int[] f37861c;

    public q44(Context context, cc4 cc4) {
        Class<xc1> cls = xc1.class;
        Class<o54> cls2 = o54.class;
        s84 s84 = new s84(context);
        this.f37859a = s84;
        SparseArray<o54> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (o54) Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{s84}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (o54) Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{s84}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (o54) Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{s84}));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (o54) Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new g64(s84, cc4));
        this.f37860b = sparseArray;
        this.f37861c = new int[sparseArray.size()];
        for (int i = 0; i < this.f37860b.size(); i++) {
            this.f37861c[i] = this.f37860b.keyAt(i);
        }
    }
}
