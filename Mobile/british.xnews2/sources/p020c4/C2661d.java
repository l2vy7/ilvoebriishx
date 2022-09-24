package p020c4;

import p164v3.C6237b;
import p164v3.C6239d;

/* renamed from: c4.d */
/* compiled from: TimeModule_UptimeClockFactory */
public final class C2661d implements C6237b<C2657a> {

    /* renamed from: c4.d$a */
    /* compiled from: TimeModule_UptimeClockFactory */
    private static final class C2662a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2661d f10469a = new C2661d();
    }

    /* renamed from: a */
    public static C2661d m9316a() {
        return C2662a.f10469a;
    }

    /* renamed from: c */
    public static C2657a m9317c() {
        return (C2657a) C6239d.m27333c(C2658b.m9311b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C2657a get() {
        return m9317c();
    }
}
