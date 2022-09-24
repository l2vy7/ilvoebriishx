package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.t3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9627t3 implements C9651v4 {

    /* renamed from: b */
    private static final C9495d4 f45880b = new C9663w3();

    /* renamed from: a */
    private final C9495d4 f45881a;

    public C9627t3() {
        this(new C9650v3(C9626t2.m44585c(), m44589c()));
    }

    /* renamed from: b */
    private static boolean m44588b(C9504e4 e4Var) {
        return e4Var.mo38378a() == C9603q4.f45838a;
    }

    /* renamed from: c */
    private static C9495d4 m44589c() {
        try {
            return (C9495d4) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f45880b;
        }
    }

    /* renamed from: a */
    public final <T> C9664w4<T> mo38579a(Class<T> cls) {
        Class<C9643v2> cls2 = C9643v2.class;
        C9683y4.m44895w(cls);
        C9504e4 b = this.f45881a.mo38333b(cls);
        if (b.mo38380c()) {
            if (cls2.isAssignableFrom(cls)) {
                return C9563l4.m44448j(C9683y4.m44844B(), C9561l2.m44446b(), b.mo38379b());
            }
            return C9563l4.m44448j(C9683y4.m44898z(), C9561l2.m44447c(), b.mo38379b());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m44588b(b)) {
                return C9546j4.m44375o(cls, b, C9595p4.m44521b(), C9594p3.m44517d(), C9683y4.m44844B(), C9561l2.m44446b(), C9475b4.m44048b());
            }
            return C9546j4.m44375o(cls, b, C9595p4.m44521b(), C9594p3.m44517d(), C9683y4.m44844B(), (C9528h2<?>) null, C9475b4.m44048b());
        } else if (m44588b(b)) {
            return C9546j4.m44375o(cls, b, C9595p4.m44520a(), C9594p3.m44516c(), C9683y4.m44898z(), C9561l2.m44447c(), C9475b4.m44047a());
        } else {
            return C9546j4.m44375o(cls, b, C9595p4.m44520a(), C9594p3.m44516c(), C9683y4.m44843A(), (C9528h2<?>) null, C9475b4.m44047a());
        }
    }

    private C9627t3(C9495d4 d4Var) {
        this.f45881a = (C9495d4) C9662w2.m44750d(d4Var, "messageInfoFactory");
    }
}
