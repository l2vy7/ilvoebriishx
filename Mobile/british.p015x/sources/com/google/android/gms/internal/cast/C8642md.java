package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.md */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8642md implements C8752td {

    /* renamed from: a */
    private final C8752td[] f43772a;

    C8642md(C8752td... tdVarArr) {
        this.f43772a = tdVarArr;
    }

    /* renamed from: b */
    public final boolean mo36598b(Class<?> cls) {
        C8752td[] tdVarArr = this.f43772a;
        for (int i = 0; i < 2; i++) {
            if (tdVarArr[i].mo36598b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final C8737sd mo36599c(Class<?> cls) {
        C8752td[] tdVarArr = this.f43772a;
        for (int i = 0; i < 2; i++) {
            C8752td tdVar = tdVarArr[i];
            if (tdVar.mo36598b(cls)) {
                return tdVar.mo36599c(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
