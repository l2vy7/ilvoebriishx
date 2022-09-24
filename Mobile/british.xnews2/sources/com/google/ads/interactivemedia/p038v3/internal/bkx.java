package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bkx */
/* compiled from: IMASDK */
public final class bkx extends bje<String> implements RandomAccess, bky {

    /* renamed from: a */
    private static final bkx f16615a;

    /* renamed from: b */
    private final List<Object> f16616b;

    static {
        bkx bkx = new bkx(10);
        f16615a = bkx;
        bkx.mo15178b();
    }

    public bkx() {
        this(10);
    }

    /* renamed from: j */
    private static String m16360j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bjq) {
            return ((bjq) obj).mo15217r();
        }
        return bkr.m16339b((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo15179c();
        this.f16616b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo15179c();
        if (collection instanceof bky) {
            collection = ((bky) collection).mo15416h();
        }
        boolean addAll = this.f16616b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo15179c();
        this.f16616b.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final String get(int i) {
        Object obj = this.f16616b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bjq) {
            bjq bjq = (bjq) obj;
            String r = bjq.mo15217r();
            if (bjq.mo15208g()) {
                this.f16616b.set(i, r);
            }
            return r;
        }
        byte[] bArr = (byte[]) obj;
        String b = bkr.m16339b(bArr);
        if (bkr.m16338a(bArr)) {
            this.f16616b.set(i, b);
        }
        return b;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ bkq mo15190e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f16616b);
            return new bkx((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final void mo15413f(bjq bjq) {
        mo15179c();
        this.f16616b.add(bjq);
        this.modCount++;
    }

    /* renamed from: g */
    public final Object mo15414g(int i) {
        return this.f16616b.get(i);
    }

    /* renamed from: h */
    public final List<?> mo15416h() {
        return Collections.unmodifiableList(this.f16616b);
    }

    /* renamed from: i */
    public final bky mo15417i() {
        return mo15173a() ? new bmq(this) : this;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo15179c();
        Object remove = this.f16616b.remove(i);
        this.modCount++;
        return m16360j(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo15179c();
        return m16360j(this.f16616b.set(i, (String) obj));
    }

    public final int size() {
        return this.f16616b.size();
    }

    public bkx(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private bkx(ArrayList<Object> arrayList) {
        this.f16616b = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
