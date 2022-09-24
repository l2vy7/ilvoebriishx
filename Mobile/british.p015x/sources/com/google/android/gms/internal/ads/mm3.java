package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.um3;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mm3<T_WRAPPER extends um3<T_ENGINE>, T_ENGINE> {

    /* renamed from: b */
    private static final Logger f35563b = Logger.getLogger(mm3.class.getName());

    /* renamed from: c */
    private static final List<Provider> f35564c;

    /* renamed from: d */
    private static final boolean f35565d;

    /* renamed from: e */
    public static final mm3<nm3, Cipher> f35566e = new mm3<>(new nm3());

    /* renamed from: f */
    public static final mm3<rm3, Mac> f35567f = new mm3<>(new rm3());

    /* renamed from: g */
    public static final mm3<tm3, Signature> f35568g = new mm3<>(new tm3());

    /* renamed from: h */
    public static final mm3<sm3, MessageDigest> f35569h = new mm3<>(new sm3());

    /* renamed from: i */
    public static final mm3<om3, KeyAgreement> f35570i = new mm3<>(new om3());

    /* renamed from: j */
    public static final mm3<qm3, KeyPairGenerator> f35571j = new mm3<>(new qm3());

    /* renamed from: k */
    public static final mm3<pm3, KeyFactory> f35572k = new mm3<>(new pm3());

    /* renamed from: a */
    private final T_WRAPPER f35573a;

    static {
        if (bf3.m30694b()) {
            f35564c = m34830b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f35565d = false;
        } else if (fn3.m32208b()) {
            f35564c = m34830b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f35565d = true;
        } else {
            f35564c = new ArrayList();
            f35565d = true;
        }
    }

    public mm3(T_WRAPPER t_wrapper) {
        this.f35573a = t_wrapper;
    }

    /* renamed from: b */
    public static List<Provider> m34830b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f35563b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final T_ENGINE mo33568a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider a : f35564c) {
            try {
                return this.f35573a.mo33718a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f35565d) {
            return this.f35573a.mo33718a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
