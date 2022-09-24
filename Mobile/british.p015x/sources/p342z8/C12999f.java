package p342z8;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import p307f9.C12710m;
import p307f9.C12711n;
import p308g8.C12729m;
import p309g9.C12748f;
import p309g9.C12749g;
import p313i9.C12789c;
import p313i9.C12790d;

/* renamed from: z8.f */
/* compiled from: SocketHttpClientConnection */
public class C12999f extends C12994a implements C12729m {

    /* renamed from: j */
    private volatile boolean f55760j;

    /* renamed from: k */
    private volatile Socket f55761k = null;

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo48181K() {
        if (this.f55760j) {
            throw new IllegalStateException("Connection is already open");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo48182L(Socket socket, C12790d dVar) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        } else if (dVar != null) {
            this.f55761k = socket;
            int e = C12789c.m54263e(dVar);
            mo48173I(mo43641M(socket, e, dVar), mo43642N(socket, e, dVar), dVar);
            this.f55760j = true;
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C12748f mo43641M(Socket socket, int i, C12790d dVar) throws IOException {
        return new C12710m(socket, i, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public C12749g mo43642N(Socket socket, int i, C12790d dVar) throws IOException {
        return new C12711n(socket, i, dVar);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[ExcHandler: UnsupportedOperationException (unused java.lang.UnsupportedOperationException), SYNTHETIC, Splitter:B:8:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r2.f55760j
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r2.f55760j = r0
            java.net.Socket r0 = r2.f55761k
            r2.mo48172H()     // Catch:{ all -> 0x0017 }
            r0.shutdownOutput()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            r0.shutdownInput()     // Catch:{ UnsupportedOperationException -> 0x0013, UnsupportedOperationException -> 0x0013 }
        L_0x0013:
            r0.close()
            return
        L_0x0017:
            r1 = move-exception
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p342z8.C12999f.close():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo48175g() {
        if (!this.f55760j) {
            throw new IllegalStateException("Connection is not open");
        }
    }

    /* renamed from: o */
    public int mo43614o() {
        if (this.f55761k != null) {
            return this.f55761k.getPort();
        }
        return -1;
    }

    /* renamed from: q */
    public boolean mo43616q() {
        return this.f55760j;
    }

    /* renamed from: r */
    public void mo43617r(int i) {
        mo48175g();
        if (this.f55761k != null) {
            try {
                this.f55761k.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    public void shutdown() throws IOException {
        this.f55760j = false;
        Socket socket = this.f55761k;
        if (socket != null) {
            socket.close();
        }
    }

    /* renamed from: w */
    public InetAddress mo43621w() {
        if (this.f55761k != null) {
            return this.f55761k.getInetAddress();
        }
        return null;
    }
}
