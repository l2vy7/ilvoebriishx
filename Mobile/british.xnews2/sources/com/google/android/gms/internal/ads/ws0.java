package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ws0 extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f40860a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    final /* synthetic */ xs0 f40861b;

    ws0(xs0 xs0) {
        this.f40861b = xs0;
    }

    /* renamed from: a */
    private final Socket m39255a(Socket socket) throws SocketException {
        if (this.f40861b.f41303s > 0) {
            socket.setReceiveBufferSize(this.f40861b.f41303s);
        }
        this.f40861b.f41304t.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f40860a.createSocket(str, i);
        m39255a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f40860a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f40860a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f40860a.createSocket(str, i, inetAddress, i2);
        m39255a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f40860a.createSocket(inetAddress, i);
        m39255a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f40860a.createSocket(inetAddress, i, inetAddress2, i2);
        m39255a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f40860a.createSocket(socket, str, i, z);
        m39255a(createSocket);
        return createSocket;
    }
}
