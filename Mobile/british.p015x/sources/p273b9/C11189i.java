package p273b9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import p308g8.C12726j;
import p308g8.C12731o;
import p314j8.C12800h;
import p315j9.C12811e;

/* renamed from: b9.i */
/* compiled from: DefaultHttpRequestRetryHandler */
public class C11189i implements C12800h {

    /* renamed from: a */
    private final int f50261a;

    /* renamed from: b */
    private final boolean f50262b;

    public C11189i(int i, boolean z) {
        this.f50261a = i;
        this.f50262b = z;
    }

    /* renamed from: b */
    private boolean m49928b(C12731o oVar) {
        return !(oVar instanceof C12726j);
    }

    /* renamed from: a */
    public boolean mo43555a(IOException iOException, int i, C12811e eVar) {
        if (iOException == null) {
            throw new IllegalArgumentException("Exception parameter may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (i > this.f50261a || (iOException instanceof InterruptedIOException) || (iOException instanceof UnknownHostException) || (iOException instanceof ConnectException) || (iOException instanceof SSLException)) {
            return false;
        } else {
            if (m49928b((C12731o) eVar.mo43606b("http.request"))) {
                return true;
            }
            Boolean bool = (Boolean) eVar.mo43606b("http.request_sent");
            if (!(bool != null && bool.booleanValue()) || this.f50262b) {
                return true;
            }
            return false;
        }
    }

    public C11189i() {
        this(3, false);
    }
}
