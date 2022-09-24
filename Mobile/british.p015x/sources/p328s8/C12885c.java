package p328s8;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import p313i9.C12789c;
import p313i9.C12790d;
import p322p8.C12854f;

/* renamed from: s8.c */
/* compiled from: PlainSocketFactory */
public class C12885c implements C12888f {

    /* renamed from: a */
    private final C12883a f55560a = null;

    /* renamed from: f */
    public static C12885c m54528f() {
        return new C12885c();
    }

    /* renamed from: a */
    public Socket mo48043a(C12790d dVar) {
        return new Socket();
    }

    /* renamed from: b */
    public Socket mo48044b(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, C12790d dVar) throws IOException, C12854f {
        if (inetSocketAddress == null) {
            throw new IllegalArgumentException("Remote address may not be null");
        } else if (dVar != null) {
            if (socket == null) {
                socket = mo48046e();
            }
            if (inetSocketAddress2 != null) {
                socket.setReuseAddress(C12789c.m54261c(dVar));
                socket.bind(inetSocketAddress2);
            }
            int a = C12789c.m54259a(dVar);
            try {
                socket.setSoTimeout(C12789c.m54262d(dVar));
                socket.connect(inetSocketAddress, a);
                return socket;
            } catch (SocketTimeoutException unused) {
                throw new C12854f("Connect to " + inetSocketAddress.getHostName() + "/" + inetSocketAddress.getAddress() + " timed out");
            }
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    /* renamed from: d */
    public final boolean mo48045d(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        } else if (!socket.isClosed()) {
            return false;
        } else {
            throw new IllegalArgumentException("Socket is closed.");
        }
    }

    /* renamed from: e */
    public Socket mo48046e() {
        return new Socket();
    }
}
