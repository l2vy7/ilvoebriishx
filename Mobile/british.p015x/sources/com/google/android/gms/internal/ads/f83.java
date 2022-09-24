package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class f83 extends p63<Map.Entry> {

    /* renamed from: d */
    final /* synthetic */ g83 f31669d;

    f83(g83 g83) {
        this.f31669d = g83;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        b43.m20204a(i, this.f31669d.f20339f, "index");
        int i2 = i + i;
        Object obj = this.f31669d.f20338e[i2];
        obj.getClass();
        Object obj2 = this.f31669d.f20338e[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* renamed from: j */
    public final boolean mo18466j() {
        return true;
    }

    public final int size() {
        return this.f31669d.f20339f;
    }
}
