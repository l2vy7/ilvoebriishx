package p005a4;

import p164v3.C6237b;
import p164v3.C6239d;

/* renamed from: a4.h */
/* compiled from: EventStoreModule_StoreConfigFactory */
public final class C0091h implements C6237b<C0080d> {

    /* renamed from: a4.h$a */
    /* compiled from: EventStoreModule_StoreConfigFactory */
    private static final class C0092a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C0091h f227a = new C0091h();
    }

    /* renamed from: a */
    public static C0091h m371a() {
        return C0092a.f227a;
    }

    /* renamed from: c */
    public static C0080d m372c() {
        return (C0080d) C6239d.m27333c(C0083e.m356c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C0080d get() {
        return m372c();
    }
}
