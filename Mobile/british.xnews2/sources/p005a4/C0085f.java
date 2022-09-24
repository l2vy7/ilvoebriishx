package p005a4;

import p164v3.C6237b;
import p164v3.C6239d;

/* renamed from: a4.f */
/* compiled from: EventStoreModule_DbNameFactory */
public final class C0085f implements C6237b<String> {

    /* renamed from: a4.f$a */
    /* compiled from: EventStoreModule_DbNameFactory */
    private static final class C0086a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C0085f f223a = new C0085f();
    }

    /* renamed from: a */
    public static C0085f m359a() {
        return C0086a.f223a;
    }

    /* renamed from: b */
    public static String m360b() {
        return (String) C6239d.m27333c(C0083e.m354a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public String get() {
        return m360b();
    }
}
