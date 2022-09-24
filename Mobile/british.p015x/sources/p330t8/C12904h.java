package p330t8;

import java.io.IOException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;

/* renamed from: t8.h */
/* compiled from: X509HostnameVerifier */
public interface C12904h extends HostnameVerifier {
    /* renamed from: a */
    void mo48066a(String str, SSLSocket sSLSocket) throws IOException;

    /* renamed from: b */
    void mo48070b(String str, String[] strArr, String[] strArr2) throws SSLException;
}
