package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.e9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9133e9 extends C9099c7 implements RandomAccess, C9148f9 {

    /* renamed from: d */
    private static final C9133e9 f45013d;

    /* renamed from: e */
    public static final C9148f9 f45014e;

    /* renamed from: c */
    private final List f45015c;

    static {
        C9133e9 e9Var = new C9133e9(10);
        f45013d = e9Var;
        e9Var.zzb();
        f45014e = e9Var;
    }

    public C9133e9() {
        this(10);
    }

    /* renamed from: g */
    private static String m42827g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C9329r7) {
            return ((C9329r7) obj).mo37989v(C9453z8.f45543b);
        }
        return C9453z8.m43977h((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo37450c();
        this.f45015c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo37450c();
        if (collection instanceof C9148f9) {
            collection = ((C9148f9) collection).zzh();
        }
        boolean addAll = this.f45015c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo37450c();
        this.f45015c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final void mo37419d(C9329r7 r7Var) {
        mo37450c();
        this.f45015c.add(r7Var);
        this.modCount++;
    }

    /* renamed from: f */
    public final String get(int i) {
        Object obj = this.f45015c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C9329r7) {
            C9329r7 r7Var = (C9329r7) obj;
            String v = r7Var.mo37989v(C9453z8.f45543b);
            if (r7Var.mo37928j()) {
                this.f45015c.set(i, v);
            }
            return v;
        }
        byte[] bArr = (byte[]) obj;
        String h = C9453z8.m43977h(bArr);
        if (C9453z8.m43978i(bArr)) {
            this.f45015c.set(i, h);
        }
        return h;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo37450c();
        Object remove = this.f45015c.remove(i);
        this.modCount++;
        return m42827g(remove);
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C9438y8 mo37416s(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f45015c);
            return new C9133e9(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo37450c();
        return m42827g(this.f45015c.set(i, (String) obj));
    }

    public final int size() {
        return this.f45015c.size();
    }

    public final C9148f9 zze() {
        return zzc() ? new C9087bb(this) : this;
    }

    public final Object zzf(int i) {
        return this.f45015c.get(i);
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.f45015c);
    }

    public C9133e9(int i) {
        this.f45015c = new ArrayList(i);
    }

    private C9133e9(ArrayList arrayList) {
        this.f45015c = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
