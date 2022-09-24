package com.google.ads.interactivemedia.p038v3.internal;

import android.util.SparseArray;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aan */
/* compiled from: IMASDK */
public final class aan implements abl {

    /* renamed from: a */
    private final SparseArray<abl> f13957a;

    /* renamed from: b */
    private final int[] f13958b;

    public aan(ajf ajf, C4311rg rgVar) {
        Class<ajf> cls = ajf.class;
        Class<abl> cls2 = abl.class;
        SparseArray<abl> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (abl) adx.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{ajf}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (abl) SsMediaSource.Factory.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{ajf}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (abl) afz.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{ajf}));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new aby(ajf, rgVar));
        this.f13957a = sparseArray;
        this.f13958b = new int[sparseArray.size()];
        for (int i = 0; i < this.f13957a.size(); i++) {
            this.f13958b[i] = this.f13957a.keyAt(i);
        }
    }
}
