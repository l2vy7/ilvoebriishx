package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bq3 extends mn3<String> implements RandomAccess, cq3 {

    /* renamed from: d */
    private static final bq3 f30075d;

    /* renamed from: e */
    public static final cq3 f30076e;

    /* renamed from: c */
    private final List<Object> f30077c;

    static {
        bq3 bq3 = new bq3(10);
        f30075d = bq3;
        bq3.zzb();
        f30076e = bq3;
    }

    public bq3() {
        this(10);
    }

    /* renamed from: g */
    private static String m30811g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof eo3) {
            return ((eo3) obj).mo31613a(up3.f39919b);
        }
        return up3.m38382h((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo33571c();
        this.f30077c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo33571c();
        if (collection instanceof cq3) {
            collection = ((cq3) collection).zzh();
        }
        boolean addAll = this.f30077c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo33571c();
        this.f30077c.clear();
        this.modCount++;
    }

    /* renamed from: f */
    public final String get(int i) {
        Object obj = this.f30077c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof eo3) {
            eo3 eo3 = (eo3) obj;
            String a = eo3.mo31613a(up3.f39919b);
            if (eo3.mo30451F()) {
                this.f30077c.set(i, a);
            }
            return a;
        }
        byte[] bArr = (byte[]) obj;
        String h = up3.m38382h(bArr);
        if (up3.m38383i(bArr)) {
            this.f30077c.set(i, h);
        }
        return h;
    }

    /* renamed from: q0 */
    public final void mo30782q0(eo3 eo3) {
        mo33571c();
        this.f30077c.add(eo3);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo33571c();
        Object remove = this.f30077c.remove(i);
        this.modCount++;
        return m30811g(remove);
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ tp3 mo30784s(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f30077c);
            return new bq3((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo33571c();
        return m30811g(this.f30077c.set(i, (String) obj));
    }

    public final int size() {
        return this.f30077c.size();
    }

    public final cq3 zze() {
        return zzc() ? new ls3(this) : this;
    }

    public final Object zzf(int i) {
        return this.f30077c.get(i);
    }

    public final List<?> zzh() {
        return Collections.unmodifiableList(this.f30077c);
    }

    public bq3(int i) {
        this.f30077c = new ArrayList(i);
    }

    private bq3(ArrayList<Object> arrayList) {
        this.f30077c = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
