package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.v3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9650v3 implements C9495d4 {

    /* renamed from: a */
    private C9495d4[] f45923a;

    C9650v3(C9495d4... d4VarArr) {
        this.f45923a = d4VarArr;
    }

    /* renamed from: a */
    public final boolean mo38332a(Class<?> cls) {
        for (C9495d4 a : this.f45923a) {
            if (a.mo38332a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C9504e4 mo38333b(Class<?> cls) {
        for (C9495d4 d4Var : this.f45923a) {
            if (d4Var.mo38332a(cls)) {
                return d4Var.mo38333b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
