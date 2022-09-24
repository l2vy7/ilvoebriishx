package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.File;
import java.util.HashSet;
import p006a5.C6488j;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d23 {

    /* renamed from: f */
    private static final Object f30614f = new Object();

    /* renamed from: a */
    private final Context f30615a;

    /* renamed from: b */
    private final SharedPreferences f30616b;

    /* renamed from: c */
    private final String f30617c;

    /* renamed from: d */
    private final o13 f30618d;

    /* renamed from: e */
    private boolean f30619e = false;

    public d23(Context context, int i, o13 o13, boolean z) {
        this.f30615a = context;
        this.f30617c = Integer.toString(i - 1);
        this.f30616b = context.getSharedPreferences("pcvmspf", 0);
        this.f30618d = o13;
        this.f30619e = z;
    }

    /* renamed from: e */
    private final File m31220e(String str) {
        return new File(new File(this.f30615a.getDir("pccache", 0), this.f30617c), str);
    }

    /* renamed from: f */
    private static String m31221f(C8011od odVar) {
        C8082qd I = C8118rd.m37034I();
        I.mo34324I(odVar.mo33868H().mo34529O());
        I.mo34325y(odVar.mo33868H().mo34528N());
        I.mo34321B(odVar.mo33868H().mo34525E());
        I.mo34323H(odVar.mo33868H().mo34527H());
        I.mo34322C(odVar.mo33868H().mo34526F());
        return C6488j.m28271a(((C8118rd) I.mo32424p()).mo33364c().mo31616f());
    }

    /* renamed from: g */
    private final String m31222g() {
        String valueOf = String.valueOf(this.f30617c);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    /* renamed from: h */
    private final String m31223h() {
        String valueOf = String.valueOf(this.f30617c);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    /* renamed from: i */
    private final void m31224i(int i, long j) {
        o13 o13 = this.f30618d;
        if (o13 != null) {
            o13.zza(i, j);
        }
    }

    /* renamed from: j */
    private final void m31225j(int i, long j, String str) {
        o13 o13 = this.f30618d;
        if (o13 != null) {
            o13.zzb(i, j, str);
        }
    }

    /* renamed from: k */
    private final C8118rd m31226k(int i) {
        String str;
        wo3 wo3;
        if (i == 1) {
            str = this.f30616b.getString(m31223h(), (String) null);
        } else {
            str = this.f30616b.getString(m31222g(), (String) null);
        }
        if (str == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            eo3 L = eo3.m31873L(C6488j.m28273c(str));
            if (this.f30619e) {
                wo3 = wo3.m39219a();
            } else {
                wo3 = wo3.m39220b();
            }
            return C8118rd.m37038M(L, wo3);
        } catch (wp3 unused) {
            return null;
        } catch (NullPointerException unused2) {
            m31224i(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            m31224i(2032, currentTimeMillis);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo31088a(com.google.android.gms.internal.ads.C8011od r7) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = f30614f
            monitor-enter(r2)
            com.google.android.gms.internal.ads.rd r3 = r7.mo33868H()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r3.mo34529O()     // Catch:{ all -> 0x0054 }
            java.io.File r3 = r6.m31220e(r3)     // Catch:{ all -> 0x0054 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = "pcbc"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.eo3 r3 = r7.mo33869I()     // Catch:{ all -> 0x0054 }
            byte[] r3 = r3.mo31616f()     // Catch:{ all -> 0x0054 }
            boolean r3 = com.google.android.gms.internal.ads.y13.m39728e(r4, r3)     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0030
            r7 = 4020(0xfb4, float:5.633E-42)
            r6.m31224i(r7, r0)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            r7 = 0
            return r7
        L_0x0030:
            java.lang.String r7 = m31221f(r7)     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences r3 = r6.f30616b     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r6.m31223h()     // Catch:{ all -> 0x0054 }
            r3.putString(r4, r7)     // Catch:{ all -> 0x0054 }
            boolean r7 = r3.commit()     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x004d
            r3 = 5015(0x1397, float:7.028E-42)
            r6.m31224i(r3, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x004d:
            r3 = 4021(0xfb5, float:5.635E-42)
            r6.m31224i(r3, r0)     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r7
        L_0x0054:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d23.mo31088a(com.google.android.gms.internal.ads.od):boolean");
    }

    /* renamed from: b */
    public final boolean mo31089b(C8011od odVar, c23 c23) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f30614f) {
            C8118rd k = m31226k(1);
            String O = odVar.mo33868H().mo34529O();
            if (k == null || !k.mo34529O().equals(O)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File e = m31220e(O);
                if (e.exists()) {
                    boolean isDirectory = e.isDirectory();
                    String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (true != isDirectory) {
                        str2 = SessionDescription.SUPPORTED_SDP_VERSION;
                    }
                    boolean isFile = e.isFile();
                    String str3 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (true != isFile) {
                        str3 = SessionDescription.SUPPORTED_SDP_VERSION;
                    }
                    StringBuilder sb = new StringBuilder(str2.length() + 5 + str3.length());
                    sb.append("d:");
                    sb.append(str2);
                    sb.append(",f:");
                    sb.append(str3);
                    m31225j(4023, currentTimeMillis2, sb.toString());
                    m31224i(4015, currentTimeMillis2);
                } else if (!e.mkdirs()) {
                    boolean canWrite = e.canWrite();
                    String str4 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (true != canWrite) {
                        str4 = SessionDescription.SUPPORTED_SDP_VERSION;
                    }
                    if (str4.length() != 0) {
                        str = "cw:".concat(str4);
                    } else {
                        str = new String("cw:");
                    }
                    m31225j(4024, currentTimeMillis2, str);
                    m31224i(4015, currentTimeMillis2);
                    return false;
                }
                File e2 = m31220e(O);
                File file = new File(e2, "pcam.jar");
                File file2 = new File(e2, "pcbc");
                if (!y13.m39728e(file, odVar.mo33870J().mo31616f())) {
                    m31224i(4016, currentTimeMillis);
                    return false;
                } else if (!y13.m39728e(file2, odVar.mo33869I().mo31616f())) {
                    m31224i(4017, currentTimeMillis);
                    return false;
                } else if (c23 == null || c23.mo30844a(file)) {
                    String f = m31221f(odVar);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    String string = this.f30616b.getString(m31223h(), (String) null);
                    SharedPreferences.Editor edit = this.f30616b.edit();
                    edit.putString(m31223h(), f);
                    if (string != null) {
                        edit.putString(m31222g(), string);
                    }
                    if (!edit.commit()) {
                        m31224i(4019, currentTimeMillis3);
                        return false;
                    }
                    HashSet hashSet = new HashSet();
                    C8118rd k2 = m31226k(1);
                    if (k2 != null) {
                        hashSet.add(k2.mo34529O());
                    }
                    C8118rd k3 = m31226k(2);
                    if (k3 != null) {
                        hashSet.add(k3.mo34529O());
                    }
                    for (File file3 : new File(this.f30615a.getDir("pccache", 0), this.f30617c).listFiles()) {
                        if (!hashSet.contains(file3.getName())) {
                            y13.m39727d(file3);
                        }
                    }
                    m31224i(5014, currentTimeMillis);
                    return true;
                } else {
                    m31224i(4018, currentTimeMillis);
                    y13.m39727d(e2);
                    return false;
                }
            } else {
                m31224i(4014, currentTimeMillis);
                return false;
            }
        }
    }

    /* renamed from: c */
    public final w13 mo31090c(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f30614f) {
            C8118rd k = m31226k(1);
            if (k == null) {
                m31224i(4022, currentTimeMillis);
                return null;
            }
            File e = m31220e(k.mo34529O());
            File file = new File(e, "pcam.jar");
            if (!file.exists()) {
                file = new File(e, "pcam");
            }
            File file2 = new File(e, "pcbc");
            File file3 = new File(e, "pcopt");
            m31224i(5016, currentTimeMillis);
            w13 w13 = new w13(k, file, file2, file3);
            return w13;
        }
    }

    /* renamed from: d */
    public final boolean mo31091d(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f30614f) {
            C8118rd k = m31226k(1);
            if (k == null) {
                m31224i(4025, currentTimeMillis);
                return false;
            }
            File e = m31220e(k.mo34529O());
            if (!new File(e, "pcam.jar").exists()) {
                m31224i(4026, currentTimeMillis);
                return false;
            } else if (!new File(e, "pcbc").exists()) {
                m31224i(4027, currentTimeMillis);
                return false;
            } else {
                m31224i(5019, currentTimeMillis);
                return true;
            }
        }
    }
}
