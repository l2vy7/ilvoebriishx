package com.google.ads.interactivemedia.p039v3.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.ads.interactivemedia.p039v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.p039v3.impl.data.ResizeAndPositionVideoMsgData;
import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pg */
/* compiled from: IMASDK */
public final class C4257pg {
    public C4257pg() {
    }

    public C4257pg(akz akz, SparseArray<C4202nf> sparseArray) {
        SparseArray sparseArray2 = new SparseArray(akz.mo13870a());
        for (int i = 0; i < akz.mo13870a(); i++) {
            int b = akz.mo13871b(i);
            C4202nf nfVar = sparseArray.get(b);
            aup.m14890u(nfVar);
            sparseArray2.append(b, nfVar);
        }
    }

    /* renamed from: a */
    public static List<byte[]> m18522a(byte[] bArr) {
        byte b = bArr[11];
        byte b2 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m18530i(m18531j((long) (((b & 255) << 8) | (b2 & 255)))));
        arrayList.add(m18530i(m18531j(3840)));
        return arrayList;
    }

    /* renamed from: b */
    public static C4210nn m18523b(int i, int i2) {
        return new C4210nn(1, 1);
    }

    /* renamed from: c */
    public static boolean m18524c(BaseDisplayContainer baseDisplayContainer, ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        return resizeAndPositionVideoMsgData.mo12903x().intValue() >= 0 && resizeAndPositionVideoMsgData.width().intValue() >= 0 && resizeAndPositionVideoMsgData.mo12903x().intValue() + resizeAndPositionVideoMsgData.width().intValue() <= baseDisplayContainer.getAdContainer().getWidth() && resizeAndPositionVideoMsgData.mo12904y().intValue() >= 0 && resizeAndPositionVideoMsgData.height().intValue() >= 0 && resizeAndPositionVideoMsgData.mo12904y().intValue() + resizeAndPositionVideoMsgData.height().intValue() <= baseDisplayContainer.getAdContainer().getHeight();
    }

    /* renamed from: d */
    public static void m18525d(String str) {
        if (m18532k(1)) {
            Log.i("IMASDK", str);
        }
    }

    /* renamed from: e */
    public static void m18526e(String str) {
        if (m18532k(2)) {
            Log.w("IMASDK", str);
        }
    }

    /* renamed from: f */
    public static void m18527f(String str, Throwable th) {
        if (m18532k(2)) {
            Log.e("IMASDK", str, th);
        }
    }

    /* renamed from: g */
    public static void m18528g(String str) {
        if (m18532k(2)) {
            Log.e("IMASDK", str);
        }
    }

    /* renamed from: h */
    public static void m18529h(String str, Exception exc) {
        if (C3838ai.f14939a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }

    /* renamed from: i */
    private static byte[] m18530i(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    /* renamed from: j */
    private static long m18531j(long j) {
        return (j * C6540C.NANOS_PER_SECOND) / 48000;
    }

    /* renamed from: k */
    private static boolean m18532k(int i) {
        return i + -1 > 0;
    }
}
