package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.t1 */
public final class C9002t1 extends C9000t<String> implements C9009u1, RandomAccess {

    /* renamed from: d */
    private static final C9002t1 f44741d;

    /* renamed from: e */
    private static final C9009u1 f44742e;

    /* renamed from: c */
    private final List<Object> f44743c;

    static {
        C9002t1 t1Var = new C9002t1();
        f44741d = t1Var;
        t1Var.zzv();
        f44742e = t1Var;
    }

    public C9002t1() {
        this(10);
    }

    public C9002t1(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private C9002t1(ArrayList<Object> arrayList) {
        this.f44743c = arrayList;
    }

    /* renamed from: e */
    private static String m42360e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C8847a0 ? ((C8847a0) obj).mo36810t() : C8910h1.m41839h((byte[]) obj);
    }

    /* renamed from: B */
    public final List<?> mo37162B() {
        return Collections.unmodifiableList(this.f44743c);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo37158c();
        this.f44743c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo37158c();
        if (collection instanceof C9009u1) {
            collection = ((C9009u1) collection).mo37162B();
        }
        boolean addAll = this.f44743c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        mo37158c();
        this.f44743c.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f44743c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C8847a0) {
            C8847a0 a0Var = (C8847a0) obj;
            String t = a0Var.mo36810t();
            if (a0Var.mo36804f()) {
                this.f44743c.set(i, t);
            }
            return t;
        }
        byte[] bArr = (byte[]) obj;
        String h = C8910h1.m41839h(bArr);
        if (C8910h1.m41838g(bArr)) {
            this.f44743c.set(i, h);
        }
        return h;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ boolean mo36983n() {
        return super.mo36983n();
    }

    /* renamed from: o */
    public final /* synthetic */ C8934k1 mo36878o(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f44743c);
            return new C9002t1((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        mo37158c();
        Object remove = this.f44743c.remove(i);
        this.modCount++;
        return m42360e(remove);
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
        mo37158c();
        return m42360e(this.f44743c.set(i, (String) obj));
    }

    public final int size() {
        return this.f44743c.size();
    }

    /* renamed from: t0 */
    public final C9009u1 mo37168t0() {
        return mo36983n() ? new C9039y3(this) : this;
    }

    /* renamed from: u0 */
    public final Object mo37169u0(int i) {
        return this.f44743c.get(i);
    }
}
