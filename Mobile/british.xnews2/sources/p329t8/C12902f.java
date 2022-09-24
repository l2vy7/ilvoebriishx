package p329t8;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: t8.f */
/* compiled from: TrustManagerDecorator */
class C12902f implements X509TrustManager {

    /* renamed from: a */
    private final X509TrustManager f55594a;

    /* renamed from: b */
    private final C12903g f55595b;

    C12902f(X509TrustManager x509TrustManager, C12903g gVar) {
        this.f55594a = x509TrustManager;
        this.f55595b = gVar;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f55594a.checkClientTrusted(x509CertificateArr, str);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.f55595b.mo48077a(x509CertificateArr, str)) {
            this.f55594a.checkServerTrusted(x509CertificateArr, str);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.f55594a.getAcceptedIssuers();
    }
}
