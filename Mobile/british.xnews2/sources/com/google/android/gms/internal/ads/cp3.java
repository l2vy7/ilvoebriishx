package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bp3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cp3<T extends bp3<T>> {

    /* renamed from: d */
    private static final cp3 f30452d = new cp3(true);

    /* renamed from: a */
    final cs3<T, Object> f30453a = new rr3(16);

    /* renamed from: b */
    private boolean f30454b;

    /* renamed from: c */
    private boolean f30455c;

    private cp3() {
    }

    /* renamed from: a */
    public static <T extends bp3<T>> cp3<T> m31078a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m31079d(T t, Object obj) {
        boolean z;
        ws3 zzb = t.zzb();
        up3.m38379e(obj);
        ws3 ws3 = ws3.DOUBLE;
        xs3 xs3 = xs3.INT;
        switch (zzb.mo35670d().ordinal()) {
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
                if ((obj instanceof eo3) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C7950mp3)) {
                    return;
                }
            case 8:
                if (obj instanceof uq3) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.zzb().mo35670d(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo30976b() {
        if (!this.f30454b) {
            this.f30453a.mo31022b();
            this.f30454b = true;
        }
    }

    /* renamed from: c */
    public final void mo30977c(T t, Object obj) {
        if (!t.zzc()) {
            m31079d(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m31079d(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f30453a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        cp3 cp3 = new cp3();
        for (int i = 0; i < this.f30453a.mo31023c(); i++) {
            Map.Entry<T, Object> h = this.f30453a.mo31031h(i);
            cp3.mo30977c((bp3) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f30453a.mo31026d()) {
            cp3.mo30977c((bp3) next.getKey(), next.getValue());
        }
        cp3.f30455c = this.f30455c;
        return cp3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp3)) {
            return false;
        }
        return this.f30453a.equals(((cp3) obj).f30453a);
    }

    public final int hashCode() {
        return this.f30453a.hashCode();
    }

    private cp3(boolean z) {
        mo30976b();
        mo30976b();
    }
}
