package p312i9;

/* renamed from: i9.c */
/* compiled from: HttpConnectionParams */
public final class C12789c {
    /* renamed from: a */
    public static int m54259a(C12790d dVar) {
        if (dVar != null) {
            return dVar.mo47928b("http.connection.timeout", 0);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: b */
    public static int m54260b(C12790d dVar) {
        if (dVar != null) {
            return dVar.mo47928b("http.socket.linger", -1);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: c */
    public static boolean m54261c(C12790d dVar) {
        if (dVar != null) {
            return dVar.mo47931h("http.socket.reuseaddr", false);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: d */
    public static int m54262d(C12790d dVar) {
        if (dVar != null) {
            return dVar.mo47928b("http.socket.timeout", 0);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: e */
    public static int m54263e(C12790d dVar) {
        if (dVar != null) {
            return dVar.mo47928b("http.socket.buffer-size", -1);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: f */
    public static boolean m54264f(C12790d dVar) {
        if (dVar != null) {
            return dVar.mo47931h("http.tcp.nodelay", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: g */
    public static boolean m54265g(C12790d dVar) {
        if (dVar != null) {
            return dVar.mo47931h("http.connection.stalecheck", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: h */
    public static void m54266h(C12790d dVar, int i) {
        if (dVar != null) {
            dVar.mo47927a("http.connection.timeout", i);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: i */
    public static void m54267i(C12790d dVar, int i) {
        if (dVar != null) {
            dVar.mo47927a("http.socket.timeout", i);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: j */
    public static void m54268j(C12790d dVar, int i) {
        if (dVar != null) {
            dVar.mo47927a("http.socket.buffer-size", i);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: k */
    public static void m54269k(C12790d dVar, boolean z) {
        if (dVar != null) {
            dVar.mo47930g("http.tcp.nodelay", z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
