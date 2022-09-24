package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afn */
/* compiled from: IMASDK */
public final class afn implements afw {

    /* renamed from: b */
    private static final int[] f14531b = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b */
    private static void m13459b(int i, List<Integer> list) {
        int[] iArr = f14531b;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < 7) {
            if (iArr[i2] != i) {
                i2++;
            } else if (i2 != -1) {
                Integer valueOf = Integer.valueOf(i);
                if (!list.contains(valueOf)) {
                    list.add(valueOf);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private static boolean m13460c(C4306rb rbVar, C4307rc rcVar) throws IOException {
        try {
            boolean d = rbVar.mo13689d(rcVar);
            rcVar.mo16603j();
            return d;
        } catch (EOFException unused) {
            rcVar.mo16603j();
            return false;
        } catch (Throwable th) {
            rcVar.mo16603j();
            throw th;
        }
    }

    /* renamed from: a */
    public final afl mo13607a(Uri uri, C4120ke keVar, List<C4120ke> list, amk amk, Map<String, List<String>> map, C4307rc rcVar) throws IOException {
        C4306rb rbVar;
        int i;
        List<C4120ke> list2;
        List<C4120ke> list3;
        int i2;
        C4120ke keVar2 = keVar;
        amk amk2 = amk;
        int j = C4396uk.m19141j(keVar2.f17681l);
        int i3 = C4396uk.m19140i(map);
        int k = C4396uk.m19142k(uri);
        int[] iArr = f14531b;
        int length = iArr.length;
        int i4 = 7;
        ArrayList arrayList = new ArrayList(7);
        m13459b(j, arrayList);
        m13459b(i3, arrayList);
        m13459b(k, arrayList);
        int length2 = iArr.length;
        for (int i5 = 0; i5 < 7; i5++) {
            m13459b(iArr[i5], arrayList);
        }
        rcVar.mo16603j();
        int i6 = 0;
        C4306rb rbVar2 = null;
        while (i6 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i6)).intValue();
            if (intValue == 0) {
                rbVar = new C4421vi();
            } else if (intValue == 1) {
                rbVar = new C4424vl();
            } else if (intValue == 2) {
                rbVar = new C4427vo();
            } else if (intValue == i4) {
                rbVar = new C4369tk(0);
            } else if (intValue == 8) {
                C4507yn ynVar = keVar2.f17679j;
                if (ynVar != null) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= ynVar.mo16831a()) {
                            break;
                        }
                        C4506ym b = ynVar.mo16832b(i7);
                        if (!(b instanceof agl)) {
                            i7++;
                        } else if (!((agl) b).f14707c.isEmpty()) {
                            i = 4;
                        }
                    }
                }
                i = 0;
                if (list != null) {
                    list2 = list;
                } else {
                    list2 = Collections.emptyList();
                }
                rbVar = new C4389ud(i, amk2, list2);
            } else if (intValue == 11) {
                if (list != null) {
                    i2 = 48;
                    list3 = list;
                } else {
                    C4119kd kdVar = new C4119kd();
                    kdVar.mo16120ae(MimeTypes.APPLICATION_CEA608);
                    list3 = Collections.singletonList(kdVar.mo16115a());
                    i2 = 16;
                }
                String str = keVar2.f17678i;
                if (!TextUtils.isEmpty(str)) {
                    if (!aln.m14036f(str, MimeTypes.AUDIO_AAC)) {
                        i2 |= 2;
                    }
                    if (!aln.m14036f(str, MimeTypes.VIDEO_H264)) {
                        i2 |= 4;
                    }
                }
                rbVar = new C4464wy(2, amk2, new C4429vq(i2, list3), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
            } else if (intValue != 13) {
                rbVar = null;
            } else {
                rbVar = new ago(keVar2.f17672c, amk2);
            }
            aup.m14890u(rbVar);
            if (m13460c(rbVar, rcVar)) {
                return new afl(rbVar, keVar2, amk2);
            }
            if (rbVar2 == null && (intValue == j || intValue == i3 || intValue == k || intValue == 11)) {
                rbVar2 = rbVar;
            }
            i6++;
            i4 = 7;
        }
        aup.m14890u(rbVar2);
        return new afl(rbVar2, keVar2, amk2);
    }
}
