package p307f9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import p309g9.C12744b;
import p313i9.C12790d;

/* renamed from: f9.m */
/* compiled from: SocketInputBuffer */
public class C12710m extends C12700c implements C12744b {

    /* renamed from: m */
    private static final Class f55398m = m54046k();

    /* renamed from: k */
    private final Socket f55399k;

    /* renamed from: l */
    private boolean f55400l;

    public C12710m(Socket socket, int i, C12790d dVar) throws IOException {
        if (socket != null) {
            this.f55399k = socket;
            this.f55400l = false;
            i = i < 0 ? socket.getReceiveBufferSize() : i;
            mo47713g(socket.getInputStream(), i < 1024 ? 1024 : i, dVar);
            return;
        }
        throw new IllegalArgumentException("Socket may not be null");
    }

    /* renamed from: k */
    private static Class m54046k() {
        try {
            return Class.forName("java.net.SocketTimeoutException");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private static boolean m54047l(InterruptedIOException interruptedIOException) {
        Class cls = f55398m;
        if (cls != null) {
            return cls.isInstance(interruptedIOException);
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo43656b() {
        return this.f55400l;
    }

    /* renamed from: c */
    public boolean mo43657c(int i) throws IOException {
        boolean f = mo47712f();
        if (!f) {
            int soTimeout = this.f55399k.getSoTimeout();
            try {
                this.f55399k.setSoTimeout(i);
                mo47711e();
                f = mo47712f();
            } catch (InterruptedIOException e) {
                if (!m54047l(e)) {
                    throw e;
                }
            } catch (Throwable th) {
                this.f55399k.setSoTimeout(soTimeout);
                throw th;
            }
            this.f55399k.setSoTimeout(soTimeout);
        }
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo47711e() throws IOException {
        int e = super.mo47711e();
        this.f55400l = e == -1;
        return e;
    }
}
