package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9269n9 implements C9194ia {

    /* renamed from: b */
    private static final C9378u9 f45314b = new C9238l9();

    /* renamed from: a */
    private final C9378u9 f45315a;

    public C9269n9() {
        C9378u9 u9Var;
        C9378u9[] u9VarArr = new C9378u9[2];
        u9VarArr[0] = C9268n8.m43243a();
        try {
            u9Var = (C9378u9) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            u9Var = f45314b;
        }
        u9VarArr[1] = u9Var;
        C9254m9 m9Var = new C9254m9(u9VarArr);
        C9453z8.m43975f(m9Var, "messageInfoFactory");
        this.f45315a = m9Var;
    }

    /* renamed from: b */
    private static boolean m43246b(C9347s9 s9Var) {
        return s9Var.zzc() == 1;
    }

    /* renamed from: a */
    public final C9179ha mo37648a(Class cls) {
        Class<C9330r8> cls2 = C9330r8.class;
        C9209ja.m43120g(cls);
        C9347s9 b = this.f45315a.mo37717b(cls);
        if (b.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return C9071aa.m42625g(C9209ja.m43114b(), C9177h8.m42986b(), b.zza());
            }
            return C9071aa.m42625g(C9209ja.m43115b0(), C9177h8.m42985a(), b.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m43246b(b)) {
                return C9454z9.m43980C(cls, b, C9102ca.m42753b(), C9208j9.m43083d(), C9209ja.m43114b(), C9177h8.m42986b(), C9331r9.m43576b());
            }
            return C9454z9.m43980C(cls, b, C9102ca.m42753b(), C9208j9.m43083d(), C9209ja.m43114b(), (C9147f8) null, C9331r9.m43576b());
        } else if (m43246b(b)) {
            return C9454z9.m43980C(cls, b, C9102ca.m42752a(), C9208j9.m43082c(), C9209ja.m43115b0(), C9177h8.m42985a(), C9331r9.m43575a());
        } else {
            return C9454z9.m43980C(cls, b, C9102ca.m42752a(), C9208j9.m43082c(), C9209ja.m43112a(), (C9147f8) null, C9331r9.m43575a());
        }
    }
}
