package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.t6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8180t6 {

    /* renamed from: a */
    private final int f39297a;

    /* renamed from: b */
    private final List<C7929m5> f39298b;

    /* renamed from: c */
    private final int f39299c;

    /* renamed from: d */
    private final InputStream f39300d;

    public C8180t6(int i, List<C7929m5> list, int i2, InputStream inputStream) {
        this.f39297a = i;
        this.f39298b = list;
        this.f39299c = i2;
        this.f39300d = inputStream;
    }

    /* renamed from: a */
    public final int mo34860a() {
        return this.f39299c;
    }

    /* renamed from: b */
    public final int mo34861b() {
        return this.f39297a;
    }

    /* renamed from: c */
    public final InputStream mo34862c() {
        InputStream inputStream = this.f39300d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    /* renamed from: d */
    public final List<C7929m5> mo34863d() {
        return Collections.unmodifiableList(this.f39298b);
    }
}
