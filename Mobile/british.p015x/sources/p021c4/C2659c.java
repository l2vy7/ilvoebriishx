package p021c4;

import p165v3.C6237b;
import p165v3.C6239d;

/* renamed from: c4.c */
/* compiled from: TimeModule_EventClockFactory */
public final class C2659c implements C6237b<C2657a> {

    /* renamed from: c4.c$a */
    /* compiled from: TimeModule_EventClockFactory */
    private static final class C2660a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2659c f10468a = new C2659c();
    }

    /* renamed from: a */
    public static C2659c m9312a() {
        return C2660a.f10468a;
    }

    /* renamed from: b */
    public static C2657a m9313b() {
        return (C2657a) C6239d.m27333c(C2658b.m9310a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public C2657a get() {
        return m9313b();
    }
}
