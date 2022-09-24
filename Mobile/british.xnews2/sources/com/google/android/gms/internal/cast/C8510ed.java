package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.ed */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8510ed extends C8624lb<String> implements RandomAccess, C8527fd {

    /* renamed from: d */
    private static final C8510ed f43445d;

    /* renamed from: e */
    public static final C8527fd f43446e;

    /* renamed from: c */
    private final List<Object> f43447c;

    static {
        C8510ed edVar = new C8510ed(10);
        f43445d = edVar;
        edVar.zzb();
        f43446e = edVar;
    }

    public C8510ed() {
        this(10);
    }

    /* renamed from: g */
    private static String m40827g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C8796wb) {
            return ((C8796wb) obj).mo36760t(C8443ad.f43264a);
        }
        return C8443ad.m40692d((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo36587c();
        this.f43447c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo36587c();
        if (collection instanceof C8527fd) {
            collection = ((C8527fd) collection).zzf();
        }
        boolean addAll = this.f43447c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo36587c();
        this.f43447c.clear();
        this.modCount++;
    }

    /* renamed from: f */
    public final String get(int i) {
        Object obj = this.f43447c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C8796wb) {
            C8796wb wbVar = (C8796wb) obj;
            String t = wbVar.mo36760t(C8443ad.f43264a);
            if (wbVar.mo36739j()) {
                this.f43447c.set(i, t);
            }
            return t;
        }
        byte[] bArr = (byte[]) obj;
        String d = C8443ad.m40692d(bArr);
        if (C8443ad.m40691c(bArr)) {
            this.f43447c.set(i, d);
        }
        return d;
    }

    /* renamed from: l */
    public final Object mo36387l(int i) {
        return this.f43447c.get(i);
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C8843zc mo36467p(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f43447c);
            return new C8510ed((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo36587c();
        Object remove = this.f43447c.remove(i);
        this.modCount++;
        return m40827g(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo36587c();
        return m40827g(this.f43447c.set(i, (String) obj));
    }

    public final int size() {
        return this.f43447c.size();
    }

    public final List<?> zzf() {
        return Collections.unmodifiableList(this.f43447c);
    }

    public final C8527fd zzg() {
        return zza() ? new C8462bf(this) : this;
    }

    public C8510ed(int i) {
        this.f43447c = new ArrayList(i);
    }

    private C8510ed(ArrayList<Object> arrayList) {
        this.f43447c = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
