package com.google.android.gms.internal.clearcut;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import androidx.core.content.C0608c;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.clearcut.f */
public abstract class C4649f<T> {

    /* renamed from: h */
    private static final Object f21217h = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: i */
    private static Context f21218i = null;

    /* renamed from: j */
    private static boolean f21219j = false;

    /* renamed from: k */
    private static volatile Boolean f21220k;

    /* renamed from: l */
    private static volatile Boolean f21221l;

    /* renamed from: a */
    private final C8972p f21222a;

    /* renamed from: b */
    final String f21223b;

    /* renamed from: c */
    private final String f21224c;

    /* renamed from: d */
    private final T f21225d;

    /* renamed from: e */
    private T f21226e;

    /* renamed from: f */
    private volatile C8866c f21227f;

    /* renamed from: g */
    private volatile SharedPreferences f21228g;

    private C4649f(C8972p pVar, String str, T t) {
        this.f21226e = null;
        this.f21227f = null;
        this.f21228g = null;
        if (pVar.f44691a == null && pVar.f44692b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (pVar.f44691a == null || pVar.f44692b == null) {
            this.f21222a = pVar;
            String valueOf = String.valueOf(pVar.f44693c);
            String valueOf2 = String.valueOf(str);
            this.f21224c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(pVar.f44694d);
            String valueOf4 = String.valueOf(str);
            this.f21223b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.f21225d = t;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    /* synthetic */ C4649f(C8972p pVar, String str, Object obj, C8925j jVar) {
        this(pVar, str, obj);
    }

    /* renamed from: b */
    public static void m21399b(Context context) {
        if (f21218i == null) {
            synchronized (f21217h) {
                if (Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                }
                if (f21218i != context) {
                    f21220k = null;
                }
                f21218i = context;
            }
            f21219j = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <T> C4649f<T> m21400c(C8972p pVar, String str, T t, C8965o<T> oVar) {
        return new C8946m(pVar, str, t, oVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static C4649f<String> m21401d(C8972p pVar, String str, String str2) {
        return new C8939l(pVar, str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static C4649f<Boolean> m21402e(C8972p pVar, String str, boolean z) {
        return new C8932k(pVar, str, Boolean.valueOf(z));
    }

    /* renamed from: g */
    private static <V> V m21403g(C8958n<V> nVar) {
        long clearCallingIdentity;
        try {
            return nVar.zzp();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zzp = nVar.zzp();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zzp;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: h */
    static boolean m21404h(String str, boolean z) {
        if (m21411p()) {
            return ((Boolean) m21403g(new C8915i(str, false))).booleanValue();
        }
        return false;
    }

    @TargetApi(24)
    @Nullable
    /* renamed from: n */
    private final T m21409n() {
        boolean z;
        if (m21404h("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String valueOf = String.valueOf(this.f21223b);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else if (this.f21222a.f44692b != null) {
            if (this.f21227f == null) {
                this.f21227f = C8866c.m41634a(f21218i.getContentResolver(), this.f21222a.f44692b);
            }
            String str = (String) m21403g(new C8901g(this, this.f21227f));
            if (str != null) {
                return mo19170m(str);
            }
        } else if (this.f21222a.f44691a != null) {
            if (Build.VERSION.SDK_INT < 24 || f21218i.isDeviceProtectedStorage()) {
                z = true;
            } else {
                if (f21221l == null || !f21221l.booleanValue()) {
                    f21221l = Boolean.valueOf(((UserManager) f21218i.getSystemService(UserManager.class)).isUserUnlocked());
                }
                z = f21221l.booleanValue();
            }
            if (!z) {
                return null;
            }
            if (this.f21228g == null) {
                this.f21228g = f21218i.getSharedPreferences(this.f21222a.f44691a, 0);
            }
            SharedPreferences sharedPreferences = this.f21228g;
            if (sharedPreferences.contains(this.f21223b)) {
                return mo19169f(sharedPreferences);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: o */
    private final T m21410o() {
        String str;
        if (this.f21222a.f44695e || !m21411p() || (str = (String) m21403g(new C8908h(this))) == null) {
            return null;
        }
        return mo19170m(str);
    }

    /* renamed from: p */
    private static boolean m21411p() {
        if (f21220k == null) {
            Context context = f21218i;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (C0608c.m3319a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            f21220k = Boolean.valueOf(z);
        }
        return f21220k.booleanValue();
    }

    /* renamed from: a */
    public final T mo19168a() {
        if (f21218i != null) {
            if (this.f21222a.f44696f) {
                T o = m21410o();
                if (o != null) {
                    return o;
                }
                T n = m21409n();
                if (n != null) {
                    return n;
                }
            } else {
                T n2 = m21409n();
                if (n2 != null) {
                    return n2;
                }
                T o2 = m21410o();
                if (o2 != null) {
                    return o2;
                }
            }
            return this.f21225d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract T mo19169f(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract T mo19170m(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ String mo19171q() {
        return C9048z5.m42549c(f21218i.getContentResolver(), this.f21224c, (String) null);
    }
}
