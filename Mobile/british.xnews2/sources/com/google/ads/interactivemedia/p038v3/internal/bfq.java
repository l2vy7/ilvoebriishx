package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfq */
/* compiled from: IMASDK */
final class bfq implements bgj {

    /* renamed from: a */
    private final /* synthetic */ int f16245a = 0;

    bfq() {
    }

    bfq(byte[] bArr) {
    }

    bfq(char[] cArr) {
    }

    bfq(float[] fArr) {
    }

    bfq(int[] iArr) {
    }

    bfq(short[] sArr) {
    }

    bfq(boolean[] zArr) {
    }

    bfq(byte[][] bArr) {
    }

    bfq(char[][] cArr) {
    }

    /* renamed from: a */
    public final Object mo15028a() {
        switch (this.f16245a) {
            case 0:
                return new TreeMap();
            case 1:
                return new ConcurrentHashMap();
            case 2:
                return new LinkedHashMap();
            case 3:
                return new bgi();
            case 4:
                return new TreeSet();
            case 5:
                return new LinkedHashSet();
            case 6:
                return new ArrayDeque();
            case 7:
                return new ArrayList();
            default:
                return new ConcurrentSkipListMap();
        }
    }
}
