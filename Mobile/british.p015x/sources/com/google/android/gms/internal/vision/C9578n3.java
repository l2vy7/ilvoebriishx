package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.n3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9578n3 extends C9492d1<String> implements C9570m3, RandomAccess {

    /* renamed from: d */
    private static final C9578n3 f45748d;

    /* renamed from: e */
    private static final C9570m3 f45749e;

    /* renamed from: c */
    private final List<Object> f45750c;

    static {
        C9578n3 n3Var = new C9578n3();
        f45748d = n3Var;
        n3Var.mo38299T();
        f45749e = n3Var;
    }

    public C9578n3() {
        this(10);
    }

    /* renamed from: e */
    private static String m44478e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C9552k1) {
            return ((C9552k1) obj).mo38464t();
        }
        return C9662w2.m44755i((byte[]) obj);
    }

    /* renamed from: C */
    public final /* bridge */ /* synthetic */ boolean mo38298C() {
        return super.mo38298C();
    }

    /* renamed from: R */
    public final C9570m3 mo38501R() {
        return mo38298C() ? new C9596p5(this) : this;
    }

    /* renamed from: Y */
    public final List<?> mo38502Y() {
        return Collections.unmodifiableList(this.f45750c);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo38316c();
        this.f45750c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b0 */
    public final Object mo38503b0(int i) {
        return this.f45750c.get(i);
    }

    public final void clear() {
        mo38316c();
        this.f45750c.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f45750c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C9552k1) {
            C9552k1 k1Var = (C9552k1) obj;
            String t = k1Var.mo38464t();
            if (k1Var.mo38466u()) {
                this.f45750c.set(i, t);
            }
            return t;
        }
        byte[] bArr = (byte[]) obj;
        String i2 = C9662w2.m44755i(bArr);
        if (C9662w2.m44754h(bArr)) {
            this.f45750c.set(i, i2);
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        mo38316c();
        return m44478e(this.f45750c.set(i, (String) obj));
    }

    public final int size() {
        return this.f45750c.size();
    }

    /* renamed from: w */
    public final /* synthetic */ C9485c3 mo38300w(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f45750c);
            return new C9578n3((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public C9578n3(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo38316c();
        if (collection instanceof C9570m3) {
            collection = ((C9570m3) collection).mo38502Y();
        }
        boolean addAll = this.f45750c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        mo38316c();
        Object remove = this.f45750c.remove(i);
        this.modCount++;
        return m44478e(remove);
    }

    private C9578n3(ArrayList<Object> arrayList) {
        this.f45750c = arrayList;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }
}
