package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9254m9 implements C9378u9 {

    /* renamed from: a */
    private final C9378u9[] f45201a;

    C9254m9(C9378u9... u9VarArr) {
        this.f45201a = u9VarArr;
    }

    /* renamed from: b */
    public final C9347s9 mo37717b(Class cls) {
        C9378u9[] u9VarArr = this.f45201a;
        for (int i = 0; i < 2; i++) {
            C9378u9 u9Var = u9VarArr[i];
            if (u9Var.mo37718c(cls)) {
                return u9Var.mo37717b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    /* renamed from: c */
    public final boolean mo37718c(Class cls) {
        C9378u9[] u9VarArr = this.f45201a;
        for (int i = 0; i < 2; i++) {
            if (u9VarArr[i].mo37718c(cls)) {
                return true;
            }
        }
        return false;
    }
}
