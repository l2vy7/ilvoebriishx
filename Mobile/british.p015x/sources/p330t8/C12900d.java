package p330t8;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p313i9.C12789c;
import p313i9.C12790d;
import p322p8.C12854f;
import p328s8.C12883a;
import p328s8.C12884b;

/* renamed from: t8.d */
/* compiled from: SSLSocketFactory */
public class C12900d implements C12884b {

    /* renamed from: d */
    public static final C12904h f55588d = new C12898b();

    /* renamed from: e */
    public static final C12904h f55589e = new C12899c();

    /* renamed from: f */
    public static final C12904h f55590f = new C12901e();

    /* renamed from: a */
    private final SSLSocketFactory f55591a;

    /* renamed from: b */
    private final C12883a f55592b;

    /* renamed from: c */
    private volatile C12904h f55593c;

    public C12900d(SSLContext sSLContext) {
        this(sSLContext, f55589e);
    }

    /* renamed from: e */
    private static SSLContext m54568e() {
        try {
            return m54569f("TLS", (KeyStore) null, (String) null, (KeyStore) null, (SecureRandom) null, (C12903g) null);
        } catch (Exception e) {
            throw new IllegalStateException("Failure initializing default SSL context", e);
        }
    }

    /* renamed from: f */
    private static SSLContext m54569f(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, C12903g gVar) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, KeyManagementException {
        if (str == null) {
            str = "TLS";
        }
        KeyManagerFactory instance = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore, str2 != null ? str2.toCharArray() : null);
        KeyManager[] keyManagers = instance.getKeyManagers();
        TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance2.init(keyStore2);
        TrustManager[] trustManagers = instance2.getTrustManagers();
        if (!(trustManagers == null || gVar == null)) {
            for (int i = 0; i < trustManagers.length; i++) {
                TrustManager trustManager = trustManagers[i];
                if (trustManager instanceof X509TrustManager) {
                    trustManagers[i] = new C12902f((X509TrustManager) trustManager, gVar);
                }
            }
        }
        SSLContext instance3 = SSLContext.getInstance(str);
        instance3.init(keyManagers, trustManagers, secureRandom);
        return instance3;
    }

    /* renamed from: g */
    public static C12900d m54570g() {
        return new C12900d();
    }

    /* renamed from: a */
    public Socket mo48043a(C12790d dVar) throws IOException {
        return this.f55591a.createSocket();
    }

    /* renamed from: b */
    public Socket mo48044b(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, C12790d dVar) throws IOException, UnknownHostException, C12854f {
        SSLSocket sSLSocket;
        if (inetSocketAddress == null) {
            throw new IllegalArgumentException("Remote address may not be null");
        } else if (dVar != null) {
            if (socket == null) {
                socket = new Socket();
            }
            if (inetSocketAddress2 != null) {
                socket.setReuseAddress(C12789c.m54261c(dVar));
                socket.bind(inetSocketAddress2);
            }
            int a = C12789c.m54259a(dVar);
            try {
                socket.setSoTimeout(C12789c.m54262d(dVar));
                socket.connect(inetSocketAddress, a);
                if (socket instanceof SSLSocket) {
                    sSLSocket = (SSLSocket) socket;
                } else {
                    sSLSocket = (SSLSocket) this.f55591a.createSocket(socket, inetSocketAddress.getHostName(), inetSocketAddress.getPort(), true);
                }
                if (this.f55593c != null) {
                    try {
                        this.f55593c.mo48066a(inetSocketAddress.getHostName(), sSLSocket);
                    } catch (IOException e) {
                        try {
                            sSLSocket.close();
                        } catch (Exception unused) {
                        }
                        throw e;
                    }
                }
                return sSLSocket;
            } catch (SocketTimeoutException unused2) {
                throw new C12854f("Connect to " + inetSocketAddress.getHostName() + "/" + inetSocketAddress.getAddress() + " timed out");
            }
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    /* renamed from: c */
    public Socket mo48042c(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        SSLSocket sSLSocket = (SSLSocket) this.f55591a.createSocket(socket, str, i, z);
        if (this.f55593c != null) {
            this.f55593c.mo48066a(str, sSLSocket);
        }
        return sSLSocket;
    }

    /* renamed from: d */
    public boolean mo48045d(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        } else if (!(socket instanceof SSLSocket)) {
            throw new IllegalArgumentException("Socket not created by this factory");
        } else if (!socket.isClosed()) {
            return true;
        } else {
            throw new IllegalArgumentException("Socket is closed");
        }
    }

    public C12900d(SSLContext sSLContext, C12904h hVar) {
        this.f55591a = sSLContext.getSocketFactory();
        this.f55593c = hVar;
        this.f55592b = null;
    }

    private C12900d() {
        this(m54568e());
    }
}
