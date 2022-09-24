package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xa */
/* compiled from: IMASDK */
public final class C4467xa {

    /* renamed from: a */
    public final int f19526a;

    /* renamed from: b */
    public final String f19527b;

    /* renamed from: c */
    public final List<C4465wz> f19528c;

    /* renamed from: d */
    public final byte[] f19529d;

    public C4467xa(int i, String str, List<C4465wz> list, byte[] bArr) {
        List<C4465wz> list2;
        this.f19526a = i;
        this.f19527b = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f19528c = list2;
        this.f19529d = bArr;
    }
}
