package com.google.ads.interactivemedia.p039v3.internal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmq */
/* compiled from: IMASDK */
public final class bmq extends AbstractList<String> implements RandomAccess, bky {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final bky f16708a;

    public bmq(bky bky) {
        this.f16708a = bky;
    }

    /* renamed from: f */
    public final void mo15413f(bjq bjq) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final Object mo15414g(int i) {
        return this.f16708a.mo15414g(i);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((bkx) this.f16708a).get(i);
    }

    /* renamed from: h */
    public final List<?> mo15416h() {
        return this.f16708a.mo15416h();
    }

    /* renamed from: i */
    public final bky mo15417i() {
        return this;
    }

    public final Iterator<String> iterator() {
        return new bmp(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new bmo(this, i);
    }

    public final int size() {
        return this.f16708a.size();
    }
}
