package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class er0 extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f31476a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    final /* synthetic */ gr0 f31477b;

    er0(gr0 gr0) {
        this.f31477b = gr0;
    }

    /* renamed from: a */
    private final Socket m31918a(Socket socket) throws SocketException {
        if (this.f31477b.f32414o > 0) {
            socket.setReceiveBufferSize(this.f31477b.f32414o);
        }
        this.f31477b.f32415p.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f31476a.createSocket(str, i);
        m31918a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f31476a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f31476a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f31476a.createSocket(str, i, inetAddress, i2);
        m31918a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f31476a.createSocket(inetAddress, i);
        m31918a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f31476a.createSocket(inetAddress, i, inetAddress2, i2);
        m31918a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f31476a.createSocket(socket, str, i, z);
        m31918a(createSocket);
        return createSocket;
    }
}
