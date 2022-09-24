package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import com.google.ads.interactivemedia.p039v3.internal.C4540zt;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zu */
/* compiled from: IMASDK */
public final class C4541zu<T extends C4540zt<T>> implements akk<T> {

    /* renamed from: a */
    private final akk<? extends T> f19780a;

    /* renamed from: b */
    private final List<C4543zw> f19781b;

    public C4541zu(akk<? extends T> akk, List<C4543zw> list) {
        this.f19780a = akk;
        this.f19781b = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13517a(Uri uri, InputStream inputStream) throws IOException {
        C4540zt ztVar = (C4540zt) this.f19780a.mo13517a(uri, inputStream);
        List<C4543zw> list = this.f19781b;
        return (list == null || list.isEmpty()) ? ztVar : (C4540zt) ztVar.mo13564a(this.f19781b);
    }
}
