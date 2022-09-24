package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axt */
/* compiled from: IMASDK */
public final class axt {

    /* renamed from: a */
    private static final Logger f15885a = Logger.getLogger(axt.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, axs> f15886b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, axr> f15887c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, Boolean> f15888d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<String, awt<?>> f15889e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap<Class<?>, axm<?, ?>> f15890f = new ConcurrentHashMap();

    private axt() {
    }

    @Deprecated
    /* renamed from: a */
    public static awt<?> m15143a(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap<String, awt<?>> concurrentMap = f15889e;
            Locale locale = Locale.US;
            awt<?> awt = (awt) concurrentMap.get(str.toLowerCase(locale));
            if (awt != null) {
                return awt;
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
    public static synchronized <P> void m15144b(awy<P> awy, boolean z) throws GeneralSecurityException {
        synchronized (axt.class) {
            if (awy != null) {
                String d = awy.mo14723d();
                m15158p(d, awy.getClass(), z);
                f15886b.putIfAbsent(d, new axo(awy));
                f15888d.put(d, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: c */
    public static synchronized <B, P> void m15145c(axm<B, P> axm) throws GeneralSecurityException {
        synchronized (axt.class) {
            if (axm != null) {
                Class<P> b = axm.mo14761b();
                ConcurrentMap<Class<?>, axm<?, ?>> concurrentMap = f15890f;
                if (concurrentMap.containsKey(b)) {
                    axm axm2 = (axm) concurrentMap.get(b);
                    if (!axm.getClass().equals(axm2.getClass())) {
                        Logger logger = f15885a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(b);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 56);
                        sb.append("Attempted overwrite of a registered SetWrapper for type ");
                        sb.append(valueOf);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{b.getName(), axm2.getClass().getName(), axm.getClass().getName()}));
                    }
                }
                concurrentMap.put(b, axm);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: d */
    public static awy<?> m15146d(String str) throws GeneralSecurityException {
        return m15157o(str).mo14764b();
    }

    /* renamed from: e */
    public static synchronized bln m15147e(bcc bcc) throws GeneralSecurityException {
        bln c;
        synchronized (axt.class) {
            awy<?> d = m15146d(bcc.mo14892a());
            if (((Boolean) f15888d.get(bcc.mo14892a())).booleanValue()) {
                c = d.mo14722c(bcc.mo14893c());
            } else {
                String valueOf = String.valueOf(bcc.mo14892a());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return c;
    }

    /* renamed from: f */
    public static <P> P m15148f(String str, bln bln, Class<P> cls) throws GeneralSecurityException {
        return m15159q(str, cls).mo14721b(bln);
    }

    /* renamed from: g */
    public static <P> P m15149g(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return m15160r(str, bjq.m16051n(bArr), cls);
    }

    /* renamed from: h */
    public static <P> P m15150h(bca bca, Class<P> cls) throws GeneralSecurityException {
        return m15160r(bca.mo14887a(), bca.mo14888c(), cls);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.ads.interactivemedia.v3.internal.axl<B>, com.google.ads.interactivemedia.v3.internal.axl] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <B, P> P m15151i(com.google.ads.interactivemedia.p039v3.internal.axl<B> r4, java.lang.Class<P> r5) throws java.security.GeneralSecurityException {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.ads.interactivemedia.v3.internal.axm<?, ?>> r0 = f15890f
            java.lang.Object r5 = r0.get(r5)
            com.google.ads.interactivemedia.v3.internal.axm r5 = (com.google.ads.interactivemedia.p039v3.internal.axm) r5
            if (r5 != 0) goto L_0x002a
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.Class r4 = r4.mo14759e()
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
            java.lang.Class r0 = r5.mo14762c()
            java.lang.Class r1 = r4.mo14759e()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003d
            java.lang.Object r4 = r5.mo14760a(r4)
            return r4
        L_0x003d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Class r5 = r5.mo14762c()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Class r4 = r4.mo14759e()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r5.length()
            int r2 = r4.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 44
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Wrong input primitive class, expected "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = ", got "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.axt.m15151i(com.google.ads.interactivemedia.v3.internal.axl, java.lang.Class):java.lang.Object");
    }

    /* renamed from: j */
    public static Class<?> m15152j(Class<?> cls) {
        axm axm = (axm) f15890f.get(cls);
        if (axm == null) {
            return null;
        }
        return axm.mo14762c();
    }

    /* renamed from: k */
    public static synchronized void m15153k(bcc bcc) throws GeneralSecurityException {
        synchronized (axt.class) {
            awy<?> d = m15146d(bcc.mo14892a());
            if (((Boolean) f15888d.get(bcc.mo14892a())).booleanValue()) {
                d.mo14725f(bcc.mo14893c());
            } else {
                String valueOf = String.valueOf(bcc.mo14892a());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
    }

    /* renamed from: l */
    public static synchronized <KeyProtoT extends bln, PublicKeyProtoT extends bln> void m15154l(axn<KeyProtoT, PublicKeyProtoT> axn, axd<PublicKeyProtoT> axd) throws GeneralSecurityException {
        Class<?> e;
        synchronized (axt.class) {
            m15158p("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", axn.getClass(), true);
            m15158p("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", axd.getClass(), false);
            ConcurrentMap<String, axs> concurrentMap = f15886b;
            if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (e = ((axs) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).mo14767e()) != null) {
                if (!e.equals(axd.getClass())) {
                    Logger logger = f15885a;
                    Level level = Level.WARNING;
                    StringBuilder sb = new StringBuilder(219);
                    sb.append("Attempted overwrite of a registered key manager for key type ");
                    sb.append("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
                    sb.append(" with inconsistent public key type ");
                    sb.append("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                    logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{axn.getClass().getName(), e.getName(), axd.getClass().getName()}));
                }
            }
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || ((axs) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).mo14767e() == null) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new axq(axn, axd));
                f15887c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", m15161s(axn));
            }
            ConcurrentMap<String, Boolean> concurrentMap2 = f15888d;
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", m15156n(axd));
            }
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
        }
    }

    /* renamed from: m */
    public static synchronized <KeyProtoT extends bln> void m15155m(axd<KeyProtoT> axd) throws GeneralSecurityException {
        synchronized (axt.class) {
            String b = axd.mo14735b();
            m15158p(b, axd.getClass(), true);
            ConcurrentMap<String, axs> concurrentMap = f15886b;
            if (!concurrentMap.containsKey(b)) {
                concurrentMap.put(b, m15156n(axd));
                f15887c.put(b, m15161s(axd));
            }
            f15888d.put(b, Boolean.TRUE);
        }
    }

    /* renamed from: n */
    private static <KeyProtoT extends bln> axs m15156n(axd<KeyProtoT> axd) {
        return new axp(axd);
    }

    /* renamed from: o */
    private static synchronized axs m15157o(String str) throws GeneralSecurityException {
        axs axs;
        String str2;
        synchronized (axt.class) {
            ConcurrentMap<String, axs> concurrentMap = f15886b;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "No key manager found for key type ".concat(valueOf);
                } else {
                    str2 = new String("No key manager found for key type ");
                }
                throw new GeneralSecurityException(str2);
            }
            axs = (axs) concurrentMap.get(str);
        }
        return axs;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m15158p(java.lang.String r6, java.lang.Class<?> r7, boolean r8) throws java.security.GeneralSecurityException {
        /*
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.axt> r0 = com.google.ads.interactivemedia.p039v3.internal.axt.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.ads.interactivemedia.v3.internal.axs> r1 = f15886b     // Catch:{ all -> 0x0089 }
            boolean r2 = r1.containsKey(r6)     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0089 }
            com.google.ads.interactivemedia.v3.internal.axs r1 = (com.google.ads.interactivemedia.p039v3.internal.axs) r1     // Catch:{ all -> 0x0089 }
            java.lang.Class r2 = r1.mo14765c()     // Catch:{ all -> 0x0089 }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x005f
            java.util.logging.Logger r8 = f15885a     // Catch:{ all -> 0x0089 }
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            int r4 = r6.length()     // Catch:{ all -> 0x0089 }
            if (r4 == 0) goto L_0x002e
            java.lang.String r3 = r3.concat(r6)     // Catch:{ all -> 0x0089 }
            goto L_0x0034
        L_0x002e:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0089 }
            r4.<init>(r3)     // Catch:{ all -> 0x0089 }
            r3 = r4
        L_0x0034:
            java.lang.String r4 = "com.google.crypto.tink.Registry"
            java.lang.String r5 = "ensureKeyManagerInsertable"
            r8.logp(r2, r4, r5, r3)     // Catch:{ all -> 0x0089 }
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0089 }
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0089 }
            r3 = 0
            r2[r3] = r6     // Catch:{ all -> 0x0089 }
            r6 = 1
            java.lang.Class r1 = r1.mo14765c()     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0089 }
            r2[r6] = r1     // Catch:{ all -> 0x0089 }
            r6 = 2
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x0089 }
            r2[r6] = r7     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r6 = java.lang.String.format(r6, r2)     // Catch:{ all -> 0x0089 }
            r8.<init>(r6)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x005f:
            if (r8 == 0) goto L_0x0087
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r7 = f15888d     // Catch:{ all -> 0x0089 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0089 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0089 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0089 }
            if (r7 != 0) goto L_0x0087
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0089 }
            java.lang.String r8 = "New keys are already disallowed for key type "
            int r1 = r6.length()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x007e
            java.lang.String r6 = r8.concat(r6)     // Catch:{ all -> 0x0089 }
            goto L_0x0083
        L_0x007e:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0089 }
            r6.<init>(r8)     // Catch:{ all -> 0x0089 }
        L_0x0083:
            r7.<init>(r6)     // Catch:{ all -> 0x0089 }
            throw r7     // Catch:{ all -> 0x0089 }
        L_0x0087:
            monitor-exit(r0)
            return
        L_0x0089:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.axt.m15158p(java.lang.String, java.lang.Class, boolean):void");
    }

    /* renamed from: q */
    private static <P> awy<P> m15159q(String str, Class<P> cls) throws GeneralSecurityException {
        axs o = m15157o(str);
        if (o.mo14766d().contains(cls)) {
            return o.mo14763a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(o.mo14765c());
        Set<Class<?>> d = o.mo14766d();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : d) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        int length = name.length();
        StringBuilder sb3 = new StringBuilder(length + 77 + valueOf.length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    /* renamed from: r */
    private static <P> P m15160r(String str, bjq bjq, Class<P> cls) throws GeneralSecurityException {
        return m15159q(str, cls).mo14720a(bjq);
    }

    /* renamed from: s */
    private static <KeyProtoT extends bln> axr m15161s(axd<KeyProtoT> axd) {
        return new axr();
    }
}
