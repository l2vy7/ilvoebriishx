package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class od3 {

    /* renamed from: a */
    private static final Logger f36391a = Logger.getLogger(od3.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, md3> f36392b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, ld3> f36393c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, Boolean> f36394d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<String, hc3<?>> f36395e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap<Class<?>, fd3<?, ?>> f36396f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final ConcurrentMap<String, qc3> f36397g = new ConcurrentHashMap();

    private od3() {
    }

    @Deprecated
    /* renamed from: a */
    public static hc3<?> m35631a(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap<String, hc3<?>> concurrentMap = f36395e;
            Locale locale = Locale.US;
            hc3<?> hc3 = (hc3) concurrentMap.get(str.toLowerCase(locale));
            if (hc3 != null) {
                return hc3;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase(locale).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: b */
    public static nc3<?> m35632b(String str) throws GeneralSecurityException {
        return m35646p(str).zzb();
    }

    /* renamed from: c */
    public static synchronized ak3 m35633c(dk3 dk3) throws GeneralSecurityException {
        ak3 d;
        synchronized (od3.class) {
            nc3<?> b = m35632b(dk3.mo31287J());
            if (((Boolean) f36394d.get(dk3.mo31287J())).booleanValue()) {
                d = b.mo33680d(dk3.mo31286I());
            } else {
                String valueOf = String.valueOf(dk3.mo31287J());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return d;
    }

    /* renamed from: d */
    public static synchronized uq3 m35634d(dk3 dk3) throws GeneralSecurityException {
        uq3 c;
        synchronized (od3.class) {
            nc3<?> b = m35632b(dk3.mo31287J());
            if (((Boolean) f36394d.get(dk3.mo31287J())).booleanValue()) {
                c = b.mo33679c(dk3.mo31286I());
            } else {
                String valueOf = String.valueOf(dk3.mo31287J());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return c;
    }

    /* renamed from: e */
    public static Class<?> m35635e(Class<?> cls) {
        fd3 fd3 = (fd3) f36396f.get(cls);
        if (fd3 == null) {
            return null;
        }
        return fd3.zza();
    }

    /* renamed from: f */
    public static <P> P m35636f(ak3 ak3, Class<P> cls) throws GeneralSecurityException {
        return m35647q(ak3.mo30409J(), ak3.mo30408I(), cls);
    }

    /* renamed from: g */
    public static <P> P m35637g(String str, uq3 uq3, Class<P> cls) throws GeneralSecurityException {
        return m35645o(str, cls).mo33677a(uq3);
    }

    /* renamed from: h */
    public static <P> P m35638h(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return m35647q(str, eo3.m31873L(bArr), cls);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.ed3<B>, com.google.android.gms.internal.ads.ed3] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <B, P> P m35639i(com.google.android.gms.internal.ads.ed3<B> r4, java.lang.Class<P> r5) throws java.security.GeneralSecurityException {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.ads.fd3<?, ?>> r0 = f36396f
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.internal.ads.fd3 r5 = (com.google.android.gms.internal.ads.fd3) r5
            if (r5 != 0) goto L_0x002a
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.Class r4 = r4.mo31549d()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "No wrapper found for "
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0021
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0026
        L_0x0021:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0026:
            r5.<init>(r4)
            throw r5
        L_0x002a:
            java.lang.Class r0 = r5.zza()
            java.lang.Class r1 = r4.mo31549d()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003d
            java.lang.Object r4 = r5.mo31823a(r4)
            return r4
        L_0x003d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Class r5 = r5.zza()
            java.lang.String r5 = r5.toString()
            java.lang.Class r4 = r4.mo31549d()
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r5.length()
            int r2 = r2 + 44
            int r3 = r4.length()
            int r2 = r2 + r3
            r1.<init>(r2)
            java.lang.String r2 = "Wrong input primitive class, expected "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ", got "
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.od3.m35639i(com.google.android.gms.internal.ads.ed3, java.lang.Class):java.lang.Object");
    }

    /* renamed from: j */
    static synchronized Map<String, qc3> m35640j() {
        Map<String, qc3> unmodifiableMap;
        synchronized (od3.class) {
            unmodifiableMap = Collections.unmodifiableMap(f36397g);
        }
        return unmodifiableMap;
    }

    /* renamed from: k */
    public static synchronized <KeyProtoT extends uq3, PublicKeyProtoT extends uq3> void m35641k(hd3<KeyProtoT, PublicKeyProtoT> hd3, vc3<PublicKeyProtoT> vc3, boolean z) throws GeneralSecurityException {
        Class<?> zzd;
        synchronized (od3.class) {
            m35648r("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", hd3.getClass(), hd3.mo30893a().mo30667d(), true);
            m35648r("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", vc3.getClass(), Collections.emptyMap(), false);
            if (!af3.m30313a(1)) {
                String valueOf = String.valueOf(hd3.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            } else if (af3.m30313a(1)) {
                ConcurrentMap<String, md3> concurrentMap = f36392b;
                if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (zzd = ((md3) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).zzd()) != null) {
                    if (!zzd.getName().equals(vc3.getClass().getName())) {
                        f36391a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{hd3.getClass().getName(), zzd.getName(), vc3.getClass().getName()}));
                    }
                }
                if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || ((md3) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).zzd() == null) {
                    concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new kd3(hd3, vc3));
                    f36393c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new ld3(hd3));
                    m35649s("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", hd3.mo30893a().mo30667d());
                }
                ConcurrentMap<String, Boolean> concurrentMap2 = f36394d;
                concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
                if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new jd3(vc3));
                }
                concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
            } else {
                String valueOf2 = String.valueOf(vc3.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 61);
                sb2.append("failed to register key manager ");
                sb2.append(valueOf2);
                sb2.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
    }

    /* renamed from: l */
    public static synchronized <P> void m35642l(nc3<P> nc3, boolean z) throws GeneralSecurityException {
        synchronized (od3.class) {
            if (nc3 != null) {
                String zzf = nc3.zzf();
                m35648r(zzf, nc3.getClass(), Collections.emptyMap(), z);
                f36392b.putIfAbsent(zzf, new C7791id3(nc3));
                f36394d.put(zzf, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: m */
    public static synchronized <KeyProtoT extends uq3> void m35643m(vc3<KeyProtoT> vc3, boolean z) throws GeneralSecurityException {
        synchronized (od3.class) {
            String f = vc3.mo30895f();
            m35648r(f, vc3.getClass(), vc3.mo30893a().mo30667d(), true);
            if (af3.m30313a(vc3.mo30923i())) {
                ConcurrentMap<String, md3> concurrentMap = f36392b;
                if (!concurrentMap.containsKey(f)) {
                    concurrentMap.put(f, new jd3(vc3));
                    f36393c.put(f, new ld3(vc3));
                    m35649s(f, vc3.mo30893a().mo30667d());
                }
                f36394d.put(f, Boolean.TRUE);
            } else {
                String valueOf = String.valueOf(vc3.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            }
        }
    }

    /* renamed from: n */
    public static synchronized <B, P> void m35644n(fd3<B, P> fd3) throws GeneralSecurityException {
        synchronized (od3.class) {
            if (fd3 != null) {
                Class<P> zzb = fd3.zzb();
                ConcurrentMap<Class<?>, fd3<?, ?>> concurrentMap = f36396f;
                if (concurrentMap.containsKey(zzb)) {
                    fd3 fd32 = (fd3) concurrentMap.get(zzb);
                    if (!fd3.getClass().getName().equals(fd32.getClass().getName())) {
                        f36391a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{zzb.getName(), fd32.getClass().getName(), fd3.getClass().getName()}));
                    }
                }
                concurrentMap.put(zzb, fd3);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: o */
    private static <P> nc3<P> m35645o(String str, Class<P> cls) throws GeneralSecurityException {
        md3 p = m35646p(str);
        if (p.zze().contains(cls)) {
            return p.mo32615a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(p.zzc());
        Set<Class<?>> zze = p.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : zze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(name.length() + 77 + valueOf.length() + sb2.length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    /* renamed from: p */
    private static synchronized md3 m35646p(String str) throws GeneralSecurityException {
        md3 md3;
        String str2;
        synchronized (od3.class) {
            ConcurrentMap<String, md3> concurrentMap = f36392b;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "No key manager found for key type ".concat(valueOf);
                } else {
                    str2 = new String("No key manager found for key type ");
                }
                throw new GeneralSecurityException(str2);
            }
            md3 = (md3) concurrentMap.get(str);
        }
        return md3;
    }

    /* renamed from: q */
    private static <P> P m35647q(String str, eo3 eo3, Class<P> cls) throws GeneralSecurityException {
        return m35645o(str, cls).mo33678b(eo3);
    }

    /* renamed from: r */
    private static synchronized <KeyProtoT extends uq3, KeyFormatProtoT extends uq3> void m35648r(String str, Class cls, Map<String, sc3<KeyFormatProtoT>> map, boolean z) throws GeneralSecurityException {
        String str2;
        String str3;
        String str4;
        synchronized (od3.class) {
            ConcurrentMap<String, md3> concurrentMap = f36392b;
            md3 md3 = (md3) concurrentMap.get(str);
            if (md3 != null && !md3.zzc().equals(cls)) {
                Logger logger = f36391a;
                Level level = Level.WARNING;
                if (str.length() != 0) {
                    str4 = "Attempted overwrite of a registered key manager for key type ".concat(str);
                } else {
                    str4 = new String("Attempted overwrite of a registered key manager for key type ");
                }
                logger.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str4);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, md3.zzc().getName(), cls.getName()}));
            } else if (z) {
                ConcurrentMap<String, Boolean> concurrentMap2 = f36394d;
                if (concurrentMap2.containsKey(str) && !((Boolean) concurrentMap2.get(str)).booleanValue()) {
                    if (str.length() != 0) {
                        str3 = "New keys are already disallowed for key type ".concat(str);
                    } else {
                        str3 = new String("New keys are already disallowed for key type ");
                    }
                    throw new GeneralSecurityException(str3);
                } else if (concurrentMap.containsKey(str)) {
                    for (Map.Entry next : map.entrySet()) {
                        if (!f36397g.containsKey(next.getKey())) {
                            String str5 = (String) next.getKey();
                            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 79 + str.length());
                            sb.append("Attempted to register a new key template ");
                            sb.append(str5);
                            sb.append(" from an existing key manager of type ");
                            sb.append(str);
                            throw new GeneralSecurityException(sb.toString());
                        }
                    }
                } else {
                    for (Map.Entry next2 : map.entrySet()) {
                        if (f36397g.containsKey(next2.getKey())) {
                            String valueOf = String.valueOf((String) next2.getKey());
                            if (valueOf.length() != 0) {
                                str2 = "Attempted overwrite of a registered key template ".concat(valueOf);
                            } else {
                                str2 = new String("Attempted overwrite of a registered key template ");
                            }
                            throw new GeneralSecurityException(str2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private static <KeyFormatProtoT extends uq3> void m35649s(String str, Map<String, sc3<KeyFormatProtoT>> map) {
        for (Map.Entry next : map.entrySet()) {
            f36397g.put((String) next.getKey(), qc3.m36428d(str, ((sc3) next.getValue()).f38946a.mo33365g(), ((sc3) next.getValue()).f38947b));
        }
    }
}
