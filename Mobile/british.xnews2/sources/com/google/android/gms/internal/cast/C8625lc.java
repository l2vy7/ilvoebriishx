package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.C8609kc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.lc */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8625lc<T extends C8609kc<T>> {

    /* renamed from: d */
    private static final C8625lc f43667d = new C8625lc(true);

    /* renamed from: a */
    final C8722re<T, Object> f43668a = new C8611ke(16);

    /* renamed from: b */
    private boolean f43669b;

    /* renamed from: c */
    private boolean f43670c;

    private C8625lc() {
    }

    /* renamed from: a */
    public static <T extends C8609kc<T>> C8625lc<T> m41115a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m41116d(T t, Object obj) {
        boolean z;
        C8628lf zzb = t.zzb();
        C8443ad.m40689a(obj);
        C8628lf lfVar = C8628lf.DOUBLE;
        C8644mf mfVar = C8644mf.INT;
        switch (zzb.mo36603d().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof C8796wb) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C8736sc)) {
                    return;
                }
            case 8:
                if (obj instanceof C8782vd) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.zzb().mo36603d(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo36593b() {
        if (!this.f43669b) {
            this.f43668a.mo36583b();
            this.f43669b = true;
        }
    }

    /* renamed from: c */
    public final void mo36594c(T t, Object obj) {
        if (!t.zzc()) {
            m41116d(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m41116d(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f43668a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C8625lc lcVar = new C8625lc();
        for (int i = 0; i < this.f43668a.mo36712d(); i++) {
            Map.Entry<T, Object> e = this.f43668a.mo36713e(i);
            lcVar.mo36594c((C8609kc) e.getKey(), e.getValue());
        }
        for (Map.Entry next : this.f43668a.mo36716f()) {
            lcVar.mo36594c((C8609kc) next.getKey(), next.getValue());
        }
        lcVar.f43670c = this.f43670c;
        return lcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8625lc)) {
            return false;
        }
        return this.f43668a.equals(((C8625lc) obj).f43668a);
    }

    public final int hashCode() {
        return this.f43668a.hashCode();
    }

    private C8625lc(boolean z) {
        mo36593b();
        mo36593b();
    }
}
