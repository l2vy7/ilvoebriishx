package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.internal.bkd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bke */
/* compiled from: IMASDK */
final class bke<T extends bkd<T>> {

    /* renamed from: d */
    private static final bke f16521d = new bke((byte[]) null);

    /* renamed from: a */
    final bmi<T, Object> f16522a = bmi.m16632b(16);

    /* renamed from: b */
    private boolean f16523b;

    /* renamed from: c */
    private boolean f16524c;

    private bke() {
    }

    /* renamed from: a */
    public static <T extends bkd<T>> bke<T> m16282a() {
        throw null;
    }

    /* renamed from: d */
    static int m16283d(int i, Object obj) {
        int I = bjw.m16181I(i);
        if (bnb.GROUP == null) {
            bkr.m16344g((bln) obj);
            I += I;
        }
        return I + m16284e();
    }

    /* renamed from: e */
    static int m16284e() {
        int i = bkc.f16520c;
        throw null;
    }

    /* renamed from: f */
    static void m16285f(bjw bjw, int i, Object obj) throws IOException {
        if (bnb.GROUP == null) {
            bln bln = (bln) obj;
            bkr.m16344g(bln);
            bjw.mo15297aa(i, 3);
            bjw.mo15296X(bln);
            bjw.mo15297aa(i, 4);
            return;
        }
        throw null;
    }

    /* renamed from: g */
    private static final void m16286g(T t, Object obj) {
        boolean z;
        bnb b = t.mo15368b();
        bkr.m16346i(obj);
        bnb bnb = bnb.DOUBLE;
        bnc bnc = bnc.INT;
        switch (b.mo15555a().ordinal()) {
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
                if ((obj instanceof bjq) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof bkn)) {
                    return;
                }
            case 8:
                if ((obj instanceof bln) || (obj instanceof bkv)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.mo15367a()), t.mo15368b().mo15555a(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo15370b() {
        if (!this.f16523b) {
            this.f16522a.mo15464a();
            this.f16523b = true;
        }
    }

    /* renamed from: c */
    public final void mo15371c(T t, Object obj) {
        if (!t.mo15369c()) {
            m16286g(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m16286g(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof bkv) {
            this.f16524c = true;
        }
        this.f16522a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        bke bke = new bke();
        for (int i = 0; i < this.f16522a.mo15489d(); i++) {
            Map.Entry<T, Object> e = this.f16522a.mo15490e(i);
            bke.mo15371c((bkd) e.getKey(), e.getValue());
        }
        for (Map.Entry next : this.f16522a.mo15493f()) {
            bke.mo15371c((bkd) next.getKey(), next.getValue());
        }
        bke.f16524c = this.f16524c;
        return bke;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bke)) {
            return false;
        }
        return this.f16522a.equals(((bke) obj).f16522a);
    }

    public final int hashCode() {
        return this.f16522a.hashCode();
    }

    private bke(byte[] bArr) {
        mo15370b();
        mo15370b();
    }
}
