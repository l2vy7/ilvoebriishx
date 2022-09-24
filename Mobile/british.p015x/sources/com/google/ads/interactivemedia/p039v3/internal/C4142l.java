package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.l */
/* compiled from: IMASDK */
public enum C4142l implements bkn {
    DEBUGGER_STATE_UNSPECIFIED(0),
    DEBUGGER_STATE_NOT_INSTALLED(1),
    DEBUGGER_STATE_INSTALLED(2),
    DEBUGGER_STATE_ACTIVE(3),
    DEBUGGER_STATE_ENVVAR(4),
    DEBUGGER_STATE_MACHPORT(5),
    DEBUGGER_STATE_ENVVAR_MACHPORT(6);
    

    /* renamed from: h */
    private final int f17794h;

    private C4142l(int i) {
        this.f17794h = i;
    }

    /* renamed from: a */
    public static C4142l m17816a(int i) {
        switch (i) {
            case 0:
                return DEBUGGER_STATE_UNSPECIFIED;
            case 1:
                return DEBUGGER_STATE_NOT_INSTALLED;
            case 2:
                return DEBUGGER_STATE_INSTALLED;
            case 3:
                return DEBUGGER_STATE_ACTIVE;
            case 4:
                return DEBUGGER_STATE_ENVVAR;
            case 5:
                return DEBUGGER_STATE_MACHPORT;
            case 6:
                return DEBUGGER_STATE_ENVVAR_MACHPORT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bko m17817b() {
        return C4169m.f17919b;
    }

    public final String toString() {
        return "<" + C4142l.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f17794h + " name=" + name() + '>';
    }
}
