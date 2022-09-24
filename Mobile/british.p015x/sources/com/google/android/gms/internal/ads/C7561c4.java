package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.c4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7561c4 {

    /* renamed from: a */
    public final int f30239a;

    /* renamed from: b */
    public final String f30240b;

    /* renamed from: c */
    public final List<C7526b4> f30241c;

    /* renamed from: d */
    public final byte[] f30242d;

    public C7561c4(int i, String str, List<C7526b4> list, byte[] bArr) {
        List<C7526b4> list2;
        this.f30239a = i;
        this.f30240b = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f30241c = list2;
        this.f30242d = bArr;
    }
}
