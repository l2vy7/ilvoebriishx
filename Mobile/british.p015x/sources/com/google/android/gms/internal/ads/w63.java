package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w63<K, V> extends k63<V> {

    /* renamed from: c */
    private final transient y63<K, V> f20952c;

    w63(y63<K, V> y63) {
        this.f20952c = y63;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo18346a(Object[] objArr, int i) {
        t83 I = ((p63) this.f20952c.f21017e.values()).listIterator(0);
        while (I.hasNext()) {
            i = ((k63) I.next()).mo18346a(objArr, i);
        }
        return i;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f20952c.mo18508g(obj);
    }

    /* renamed from: g */
    public final s83<V> mo18100g() {
        return new u63(this.f20952c);
    }

    public final /* synthetic */ Iterator iterator() {
        return new u63(this.f20952c);
    }

    public final int size() {
        return this.f20952c.f21018f;
    }
}
