package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f23 {

    /* renamed from: g */
    private static final HashMap<String, Class<?>> f31586g = new HashMap<>();

    /* renamed from: a */
    private final Context f31587a;

    /* renamed from: b */
    private final g23 f31588b;

    /* renamed from: c */
    private final k03 f31589c;

    /* renamed from: d */
    private final f03 f31590d;

    /* renamed from: e */
    private v13 f31591e;

    /* renamed from: f */
    private final Object f31592f = new Object();

    public f23(Context context, g23 g23, k03 k03, f03 f03) {
        this.f31587a = context;
        this.f31588b = g23;
        this.f31589c = k03;
        this.f31590d = f03;
    }

    /* renamed from: d */
    private final synchronized Class<?> m32011d(w13 w13) throws e23 {
        String O = w13.mo35538a().mo34529O();
        HashMap<String, Class<?>> hashMap = f31586g;
        Class<?> cls = hashMap.get(O);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.f31590d.mo31707a(w13.mo35540c())) {
                File b = w13.mo35539b();
                if (!b.exists()) {
                    b.mkdirs();
                }
                Class<?> loadClass = new DexClassLoader(w13.mo35540c().getAbsolutePath(), b.getAbsolutePath(), (String) null, this.f31587a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(O, loadClass);
                return loadClass;
            }
            throw new e23(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e) {
            throw new e23(2026, (Throwable) e);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
            throw new e23((int) AdError.REMOTE_ADS_SERVICE_ERROR, e2);
        }
    }

    /* renamed from: a */
    public final n03 mo31711a() {
        v13 v13;
        synchronized (this.f31592f) {
            v13 = this.f31591e;
        }
        return v13;
    }

    /* renamed from: b */
    public final w13 mo31712b() {
        synchronized (this.f31592f) {
            v13 v13 = this.f31591e;
            if (v13 == null) {
                return null;
            }
            w13 f = v13.mo35346f();
            return f;
        }
    }

    /* renamed from: c */
    public final boolean mo31713c(w13 w13) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class<?> d = m32011d(w13);
            v13 v13 = new v13(d.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.f31587a, "msa-r", w13.mo35542e(), null, new Bundle(), 2}), w13, this.f31588b, this.f31589c);
            if (v13.mo35348h()) {
                int e = v13.mo35345e();
                if (e == 0) {
                    synchronized (this.f31592f) {
                        v13 v132 = this.f31591e;
                        if (v132 != null) {
                            try {
                                v132.mo35347g();
                            } catch (e23 e2) {
                                this.f31589c.mo33005c(e2.mo31456a(), -1, e2);
                            }
                        }
                        this.f31591e = v13;
                    }
                    this.f31589c.mo33006d(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(e);
                throw new e23(4001, sb.toString());
            }
            throw new e23(4000, "init failed");
        } catch (Exception e3) {
            throw new e23(2004, (Throwable) e3);
        } catch (e23 e4) {
            this.f31589c.mo33005c(e4.mo31456a(), System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.f31589c.mo33005c(4010, System.currentTimeMillis() - currentTimeMillis, e5);
            return false;
        }
    }
}
