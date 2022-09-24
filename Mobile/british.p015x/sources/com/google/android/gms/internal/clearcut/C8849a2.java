package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8891f1;

/* renamed from: com.google.android.gms.internal.clearcut.a2 */
final class C8849a2 implements C8880d3 {

    /* renamed from: b */
    private static final C8935k2 f44349b = new C8857b2();

    /* renamed from: a */
    private final C8935k2 f44350a;

    public C8849a2() {
        this(new C8869c2(C8885e1.m41683c(), m41503c()));
    }

    private C8849a2(C8935k2 k2Var) {
        this.f44350a = (C8935k2) C8910h1.m41836e(k2Var, "messageInfoFactory");
    }

    /* renamed from: b */
    private static boolean m41502b(C8928j2 j2Var) {
        return j2Var.mo36979a() == C8891f1.C8896e.f44526i;
    }

    /* renamed from: c */
    private static C8935k2 m41503c() {
        try {
            return (C8935k2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f44349b;
        }
    }

    /* renamed from: a */
    public final <T> C8870c3<T> mo36813a(Class<T> cls) {
        Class<C8891f1> cls2 = C8891f1.class;
        C8887e3.m41694I(cls);
        C8928j2 b = this.f44350a.mo36837b(cls);
        if (b.mo36980b()) {
            return cls2.isAssignableFrom(cls) ? C8982q2.m42276d(C8887e3.m41687B(), C9015v0.m42408b(), b.mo36981c()) : C8982q2.m42276d(C8887e3.m41742z(), C9015v0.m42409c(), b.mo36981c());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean b2 = m41502b(b);
            C8996s2 b3 = C9010u2.m42375b();
            C9016v1 d = C9016v1.m42411d();
            C9011u3<?, ?> B = C8887e3.m41687B();
            if (b2) {
                return C8975p2.m42210s(cls, b, b3, d, B, C9015v0.m42408b(), C8918i2.m41857b());
            }
            return C8975p2.m42210s(cls, b, b3, d, B, (C8994s0<?>) null, C8918i2.m41857b());
        }
        boolean b4 = m41502b(b);
        C8996s2 a = C9010u2.m42374a();
        C9016v1 c = C9016v1.m42410c();
        if (b4) {
            return C8975p2.m42210s(cls, b, a, c, C8887e3.m41742z(), C9015v0.m42409c(), C8918i2.m41856a());
        }
        return C8975p2.m42210s(cls, b, a, c, C8887e3.m41686A(), (C8994s0<?>) null, C8918i2.m41856a());
    }
}
