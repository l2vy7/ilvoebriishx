package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9207j8 {

    /* renamed from: d */
    private static final C9207j8 f45101d = new C9207j8(true);

    /* renamed from: a */
    final C9332ra f45102a = new C9224ka(16);

    /* renamed from: b */
    private boolean f45103b;

    /* renamed from: c */
    private boolean f45104c;

    private C9207j8() {
    }

    /* renamed from: a */
    public static C9207j8 m43078a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m43079d(C9192i8 i8Var, Object obj) {
        boolean z;
        C9256mb zzb = i8Var.zzb();
        C9453z8.m43974e(obj);
        C9256mb mbVar = C9256mb.DOUBLE;
        C9271nb nbVar = C9271nb.INT;
        switch (zzb.mo37735d().ordinal()) {
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
                if ((obj instanceof C9329r7) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof C9409w9) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i8Var.zza()), i8Var.zzb().mo37735d(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo37673b() {
        if (!this.f45103b) {
            this.f45102a.mo37693b();
            this.f45103b = true;
        }
    }

    /* renamed from: c */
    public final void mo37674c(C9192i8 i8Var, Object obj) {
        if (!i8Var.zzc()) {
            m43079d(i8Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m43079d(i8Var, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f45102a.put(i8Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C9207j8 j8Var = new C9207j8();
        for (int i = 0; i < this.f45102a.mo37999c(); i++) {
            Map.Entry h = this.f45102a.mo38007h(i);
            j8Var.mo37674c((C9192i8) h.getKey(), h.getValue());
        }
        for (Map.Entry entry : this.f45102a.mo38002d()) {
            j8Var.mo37674c((C9192i8) entry.getKey(), entry.getValue());
        }
        j8Var.f45104c = this.f45104c;
        return j8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9207j8)) {
            return false;
        }
        return this.f45102a.equals(((C9207j8) obj).f45102a);
    }

    public final int hashCode() {
        return this.f45102a.hashCode();
    }

    private C9207j8(boolean z) {
        mo37673b();
        mo37673b();
    }
}
