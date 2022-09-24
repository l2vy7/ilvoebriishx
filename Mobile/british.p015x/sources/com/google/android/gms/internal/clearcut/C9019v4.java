package com.google.android.gms.internal.clearcut;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.v4 */
final class C9019v4 implements Cloneable {

    /* renamed from: b */
    private C9005t4<?, ?> f44765b;

    /* renamed from: c */
    private Object f44766c;

    /* renamed from: d */
    private List<Object> f44767d = new ArrayList();

    C9019v4() {
    }

    /* renamed from: a */
    private final byte[] m42425a() throws IOException {
        byte[] bArr = new byte[mo37202c()];
        mo37201b(C8984q4.m42296q(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C9019v4 clone() {
        Object clone;
        C9019v4 v4Var = new C9019v4();
        try {
            List<Object> list = this.f44767d;
            if (list == null) {
                v4Var.f44767d = null;
            } else {
                v4Var.f44767d.addAll(list);
            }
            Object obj = this.f44766c;
            if (obj != null) {
                if (obj instanceof C9033x4) {
                    clone = (C9033x4) ((C9033x4) obj).clone();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        v4Var.f44766c = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        clone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        clone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        clone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        clone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        clone = ((double[]) obj).clone();
                    } else if (obj instanceof C9033x4[]) {
                        C9033x4[] x4VarArr = (C9033x4[]) obj;
                        C9033x4[] x4VarArr2 = new C9033x4[x4VarArr.length];
                        v4Var.f44766c = x4VarArr2;
                        while (i < x4VarArr.length) {
                            x4VarArr2[i] = (C9033x4) x4VarArr[i].clone();
                            i++;
                        }
                    }
                }
                v4Var.f44766c = clone;
            }
            return v4Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo37201b(C8984q4 q4Var) throws IOException {
        if (this.f44766c == null) {
            Iterator<Object> it = this.f44767d.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo37202c() {
        if (this.f44766c == null) {
            Iterator<Object> it = this.f44767d.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<Object> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9019v4)) {
            return false;
        }
        C9019v4 v4Var = (C9019v4) obj;
        if (this.f44766c == null || v4Var.f44766c == null) {
            List<Object> list2 = this.f44767d;
            if (list2 != null && (list = v4Var.f44767d) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(m42425a(), v4Var.m42425a());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f44765b != v4Var.f44765b) {
            return false;
        } else {
            throw null;
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m42425a()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
