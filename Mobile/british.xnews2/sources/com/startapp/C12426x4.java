package com.startapp;

import android.content.Context;
import com.startapp.networkTest.enums.CtTestTypes;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.startapp.x4 */
/* compiled from: Sta */
public class C12426x4 implements X509TrustManager {

    /* renamed from: e */
    private static final boolean f55115e = false;

    /* renamed from: f */
    private static final String f55116f = C12426x4.class.getSimpleName();

    /* renamed from: g */
    private static String f55117g = "";

    /* renamed from: h */
    private static boolean f55118h = false;

    /* renamed from: i */
    private static X509TrustManager f55119i = null;

    /* renamed from: j */
    private static X509TrustManager f55120j = null;

    /* renamed from: k */
    private static final String f55121k = "R_hqKukfFZxKn52";

    /* renamed from: l */
    private static final X509TrustManager f55122l = new C12427a();

    /* renamed from: a */
    private X509TrustManager[] f55123a;

    /* renamed from: b */
    private CtTestTypes[] f55124b;

    /* renamed from: c */
    private String f55125c = "";

    /* renamed from: d */
    private CtTestTypes f55126d = CtTestTypes.Unknown;

    /* renamed from: com.startapp.x4$a */
    /* compiled from: Sta */
    public class C12427a implements X509TrustManager {
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public C12426x4(Context context, boolean z) {
        m53745a(context, z);
        X509TrustManager[] x509TrustManagerArr = new X509TrustManager[3];
        this.f55123a = x509TrustManagerArr;
        CtTestTypes[] ctTestTypesArr = new CtTestTypes[3];
        this.f55124b = ctTestTypesArr;
        x509TrustManagerArr[0] = f55119i;
        ctTestTypesArr[0] = CtTestTypes.SSLOwnTs;
        x509TrustManagerArr[1] = f55120j;
        ctTestTypesArr[1] = CtTestTypes.SSLDeviceTs;
        x509TrustManagerArr[2] = f55122l;
        ctTestTypesArr[2] = CtTestTypes.SSLTrustAll;
        this.f55125c = f55117g;
    }

    /* renamed from: a */
    public String mo46808a() {
        return this.f55125c;
    }

    /* renamed from: b */
    public CtTestTypes mo46809b() {
        return this.f55126d;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        int i = 0;
        while (true) {
            X509TrustManager[] x509TrustManagerArr = this.f55123a;
            if (i < x509TrustManagerArr.length) {
                X509TrustManager x509TrustManager = x509TrustManagerArr[i];
                if (x509TrustManager != null) {
                    try {
                        this.f55126d = this.f55124b[i];
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        return;
                    } catch (CertificateException e) {
                        if (i == 0) {
                            this.f55125c += e.getMessage();
                        }
                        if (i + 1 == this.f55123a.length) {
                            throw e;
                        }
                    }
                } else {
                    i++;
                }
            } else {
                return;
            }
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f55120j.getAcceptedIssuers();
    }

    /* renamed from: a */
    private void m53745a(Context context, boolean z) {
        if (!f55118h || z) {
            synchronized (C12426x4.class) {
                if (!f55118h || z) {
                    f55117g = "";
                    int i = 0;
                    try {
                        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        instance.init((KeyStore) null);
                        TrustManager[] trustManagers = instance.getTrustManagers();
                        int length = trustManagers.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            TrustManager trustManager = trustManagers[i2];
                            if (trustManager instanceof X509TrustManager) {
                                f55120j = (X509TrustManager) trustManager;
                                break;
                            }
                            i2++;
                        }
                    } catch (Throwable th) {
                        C12356u2.m53522a(th);
                        f55117g += th.getMessage();
                    }
                    try {
                        File c = C11907fb.m52320c(context);
                        File d = C11907fb.m52321d(context);
                        if (!c.exists() || !d.exists()) {
                            throw new KeyStoreException("Downloaded truststore not available");
                        }
                        if (C12385v4.m53561b().CONNECTIVITY_TEST_VERIFY_TRUSTSTORE_SIGNATURE() ? C11907fb.m52318a(c, d) : true) {
                            FileInputStream fileInputStream = new FileInputStream(c);
                            KeyStore instance2 = KeyStore.getInstance("BKS");
                            instance2.load(fileInputStream, f55121k.toCharArray());
                            fileInputStream.close();
                            TrustManagerFactory instance3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                            instance3.init(instance2);
                            TrustManager[] trustManagers2 = instance3.getTrustManagers();
                            int length2 = trustManagers2.length;
                            while (true) {
                                if (i >= length2) {
                                    break;
                                }
                                TrustManager trustManager2 = trustManagers2[i];
                                if (trustManager2 instanceof X509TrustManager) {
                                    f55119i = (X509TrustManager) trustManager2;
                                    break;
                                }
                                i++;
                            }
                            f55118h = true;
                            return;
                        }
                        throw new KeyStoreException("Verification of downloaded truststore failed");
                    } catch (Throwable th2) {
                        C12356u2.m53522a(th2);
                        f55117g += th2.getMessage();
                    }
                } else {
                    return;
                }
            }
        } else {
            return;
        }
    }
}
