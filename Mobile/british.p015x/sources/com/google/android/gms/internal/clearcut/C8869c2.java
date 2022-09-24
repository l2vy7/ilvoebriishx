package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.c2 */
final class C8869c2 implements C8935k2 {

    /* renamed from: a */
    private C8935k2[] f44442a;

    C8869c2(C8935k2... k2VarArr) {
        this.f44442a = k2VarArr;
    }

    /* renamed from: a */
    public final boolean mo36836a(Class<?> cls) {
        for (C8935k2 a : this.f44442a) {
            if (a.mo36836a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C8928j2 mo36837b(Class<?> cls) {
        for (C8935k2 k2Var : this.f44442a) {
            if (k2Var.mo36836a(cls)) {
                return k2Var.mo36837b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
