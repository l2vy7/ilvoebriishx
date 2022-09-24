package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7424r0;
import com.google.android.gms.common.internal.C7428s0;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import p006a5.C6479a;
import p006a5.C6488j;
import p199d5.C10489b;
import p252t4.C11019i;

/* renamed from: com.google.android.gms.common.q */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7452q {

    /* renamed from: a */
    static final C7450o f29403a = new C7363i(C7448m.m30102f3("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b */
    static final C7450o f29404b = new C7445j(C7448m.m30102f3("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c */
    static final C7450o f29405c = new C7446k(C7448m.m30102f3("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d */
    static final C7450o f29406d = new C7447l(C7448m.m30102f3("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e */
    private static volatile C7428s0 f29407e;

    /* renamed from: f */
    private static final Object f29408f = new Object();

    /* renamed from: g */
    private static Context f29409g;

    /* renamed from: a */
    static C4605w m30107a(String str, C7448m mVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m30112f(str, mVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [d5.a, android.os.IBinder] */
    /* renamed from: b */
    static C4605w m30108b(String str, boolean z, boolean z2, boolean z3) {
        C4605w wVar;
        String str2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C4604n.m20098k(f29409g);
            try {
                m30113g();
                zzq k3 = f29407e.mo30154k3(new zzn(str, z, false, C10489b.m48195m6(f29409g), false));
                if (k3.mo18011D0()) {
                    wVar = C4605w.m20105b();
                } else {
                    String C0 = k3.mo18010C0();
                    if (C0 == null) {
                        C0 = "error checking package certificate";
                    }
                    wVar = k3.zzc() == 4 ? C4605w.m20107d(C0, new PackageManager.NameNotFoundException()) : C4605w.m20106c(C0);
                }
            } catch (DynamiteModule.C7468a e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "module init: ".concat(valueOf);
                } else {
                    str2 = new String("module init: ");
                }
                wVar = C4605w.m20107d(str2, e);
            }
        } catch (RemoteException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            wVar = C4605w.m20107d("module call", e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return wVar;
    }

    /* renamed from: c */
    static /* synthetic */ String m30109c(boolean z, String str, C7448m mVar) throws Exception {
        String str2 = true != (!z && m30112f(str, mVar, true, false).f20072a) ? "not allowed" : "debug cert rejected";
        MessageDigest b = C6479a.m28235b("SHA-1");
        C4604n.m20098k(b);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{str2, str, C6488j.m28271a(b.digest(mVar.mo30190m6())), Boolean.valueOf(z), "12451000.false"});
    }

    /* renamed from: d */
    static synchronized void m30110d(Context context) {
        synchronized (C7452q.class) {
            if (f29409g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f29409g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    static boolean m30111e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m30113g();
            boolean zzg = f29407e.zzg();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzg;
        } catch (RemoteException | DynamiteModule.C7468a e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: f */
    private static C4605w m30112f(String str, C7448m mVar, boolean z, boolean z2) {
        String str2;
        try {
            m30113g();
            C4604n.m20098k(f29409g);
            try {
                return f29407e.mo30155k5(new zzs(str, mVar, z, z2), C10489b.m48195m6(f29409g.getPackageManager())) ? C4605w.m20105b() : new C7467v(new C7362h(z, str, mVar), (C11019i) null);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C4605w.m20107d("module call", e);
            }
        } catch (DynamiteModule.C7468a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                str2 = "module init: ".concat(valueOf);
            } else {
                str2 = new String("module init: ");
            }
            return C4605w.m20107d(str2, e2);
        }
    }

    /* renamed from: g */
    private static void m30113g() throws DynamiteModule.C7468a {
        if (f29407e == null) {
            C4604n.m20098k(f29409g);
            synchronized (f29408f) {
                if (f29407e == null) {
                    f29407e = C7424r0.m30063b2(DynamiteModule.m30157e(f29409g, DynamiteModule.f29458f, "com.google.android.gms.googlecertificates").mo30249d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
