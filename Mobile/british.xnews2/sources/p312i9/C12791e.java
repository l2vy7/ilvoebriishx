package p312i9;

import com.google.android.exoplayer2.C6540C;
import p307g8.C12736t;
import p307g8.C12742z;

/* renamed from: i9.e */
/* compiled from: HttpProtocolParams */
public final class C12791e {
    /* renamed from: a */
    public static String m54278a(C12790d dVar) {
        if (dVar != null) {
            String str = (String) dVar.mo43553i("http.protocol.element-charset");
            return str == null ? C6540C.ASCII_NAME : str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: b */
    public static String m54279b(C12790d dVar) {
        if (dVar != null) {
            return (String) dVar.mo43553i("http.useragent");
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: c */
    public static C12742z m54280c(C12790d dVar) {
        if (dVar != null) {
            Object i = dVar.mo43553i("http.protocol.version");
            if (i == null) {
                return C12736t.f55407g;
            }
            return (C12742z) i;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: d */
    public static void m54281d(C12790d dVar, String str) {
        if (dVar != null) {
            dVar.mo43552c("http.protocol.content-charset", str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: e */
    public static void m54282e(C12790d dVar, String str) {
        if (dVar != null) {
            dVar.mo43552c("http.useragent", str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: f */
    public static void m54283f(C12790d dVar, C12742z zVar) {
        if (dVar != null) {
            dVar.mo43552c("http.protocol.version", zVar);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: g */
    public static boolean m54284g(C12790d dVar) {
        if (dVar != null) {
            return dVar.mo47931h("http.protocol.expect-continue", false);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
