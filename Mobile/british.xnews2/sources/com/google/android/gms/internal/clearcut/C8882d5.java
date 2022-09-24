package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.d5 */
public enum C8882d5 implements C8917i1 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    

    /* renamed from: h */
    private static final C8927j1<C8882d5> f44501h = null;

    /* renamed from: b */
    private final int f44503b;

    static {
        f44501h = new C8914h5();
    }

    private C8882d5(int i) {
        this.f44503b = i;
    }

    /* renamed from: a */
    public static C8882d5 m41681a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }

    public final int zzc() {
        return this.f44503b;
    }
}
