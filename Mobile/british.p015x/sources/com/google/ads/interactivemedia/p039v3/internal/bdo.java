package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.internal.bdq;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdo */
/* compiled from: IMASDK */
public final class bdo<T_WRAPPER extends bdq<T_ENGINE>, T_ENGINE> {

    /* renamed from: a */
    public static final bdo<bdp, Cipher> f16176a = new bdo<>(new bdp((byte[]) null));

    /* renamed from: b */
    public static final bdo<bdp, Mac> f16177b = new bdo<>(new bdp((int[]) null));

    /* renamed from: c */
    public static final bdo<bdp, KeyAgreement> f16178c = new bdo<>(new bdp());

    /* renamed from: d */
    public static final bdo<bdp, KeyPairGenerator> f16179d = new bdo<>(new bdp((short[]) null));

    /* renamed from: e */
    public static final bdo<bdp, KeyFactory> f16180e = new bdo<>(new bdp((char[]) null));

    /* renamed from: f */
    private static final Logger f16181f = Logger.getLogger(bdo.class.getName());

    /* renamed from: g */
    private static final List<Provider> f16182g;

    /* renamed from: h */
    private static final boolean f16183h;

    /* renamed from: i */
    private final T_WRAPPER f16184i;

    static {
        if (art.m14633d()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f16181f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f16182g = arrayList;
            f16183h = true;
        } else {
            f16182g = new ArrayList();
            f16183h = true;
        }
        new bdo(new bdp((float[]) null));
        new bdo(new bdp((boolean[]) null));
    }

    public bdo(T_WRAPPER t_wrapper) {
        this.f16184i = t_wrapper;
    }

    /* renamed from: a */
    public final T_ENGINE mo14949a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider a : f16182g) {
            try {
                return this.f16184i.mo14950a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f16183h) {
            return this.f16184i.mo14950a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
