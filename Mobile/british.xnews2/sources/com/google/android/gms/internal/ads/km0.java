package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class km0 {

    /* renamed from: a */
    private final AtomicReference<ExecutorService> f20482a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    private final Object f20483b = new Object();
    @GuardedBy("gmpAppIdLock")

    /* renamed from: c */
    private String f20484c = null;
    @GuardedBy("gmpAppIdLock")

    /* renamed from: d */
    private String f20485d = null;

    /* renamed from: e */
    final AtomicBoolean f20486e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicInteger f20487f = new AtomicInteger(-1);

    /* renamed from: g */
    private final AtomicReference<Object> f20488g = new AtomicReference<>((Object) null);

    /* renamed from: h */
    private final AtomicReference<Object> f20489h = new AtomicReference<>((Object) null);

    /* renamed from: i */
    private final ConcurrentMap<String, Method> f20490i = new ConcurrentHashMap(9);

    /* renamed from: j */
    private final AtomicReference<qv0> f20491j = new AtomicReference<>((Object) null);
    @GuardedBy("proxyReference")

    /* renamed from: k */
    private final BlockingQueue<FutureTask<?>> f20492k = new ArrayBlockingQueue(20);

    /* renamed from: l */
    private final Object f20493l = new Object();

    /* renamed from: A */
    static final boolean m20629A(Context context) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37058c0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.m30155a(context, ModuleDescriptor.MODULE_ID) < ((Integer) C8311wv.m39277c().mo18570b(p00.f37067d0)).intValue()) {
            return false;
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37076e0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    /* renamed from: B */
    private final <T> T m20630B(String str, T t, im0<T> im0) {
        synchronized (this.f20491j) {
            if (this.f20491j.get() != null) {
                try {
                    T a = im0.mo30421a(this.f20491j.get());
                    return a;
                } catch (Exception unused) {
                    m20636c(str, false);
                    return t;
                }
            }
        }
    }

    /* renamed from: C */
    private final Object m20631C(String str, Context context) {
        if (!m20638e(context, "com.google.android.gms.measurement.AppMeasurement", this.f20488g, true)) {
            return null;
        }
        try {
            return m20632D(context, str).invoke(this.f20488g.get(), new Object[0]);
        } catch (Exception unused) {
            m20636c(str, true);
            return null;
        }
    }

    /* renamed from: D */
    private final Method m20632D(Context context, String str) {
        Method method = (Method) this.f20490i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f20490i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m20636c(str, false);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.concurrent.ExecutorService m20633E() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r0 = r9.f20482a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0065
            boolean r0 = p006a5.C6482d.m28249a()
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.z23 r0 = com.google.android.gms.internal.ads.c33.m30893a()
            com.google.android.gms.internal.ads.h00<java.lang.Integer> r1 = com.google.android.gms.internal.ads.p00.f37049b0
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r1 = r2.mo18570b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.android.gms.internal.ads.hm0 r2 = new com.google.android.gms.internal.ads.hm0
            r2.<init>(r9)
            r3 = 2
            java.util.concurrent.ExecutorService r0 = r0.mo30615a(r1, r2, r3)
            goto L_0x005f
        L_0x002d:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            com.google.android.gms.internal.ads.h00<java.lang.Integer> r1 = com.google.android.gms.internal.ads.p00.f37049b0
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r2 = r2.mo18570b(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.gms.internal.ads.n00 r3 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r1 = r3.mo18570b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = r1.intValue()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            com.google.android.gms.internal.ads.hm0 r8 = new com.google.android.gms.internal.ads.hm0
            r8.<init>(r9)
            r4 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
        L_0x005f:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r1 = r9.f20482a
            r2 = 0
            r1.compareAndSet(r2, r0)
        L_0x0065:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r0 = r9.f20482a
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.km0.m20633E():java.util.concurrent.ExecutorService");
    }

    /* renamed from: a */
    private final void m20634a(Context context, String str, String str2) {
        if (m20638e(context, "com.google.android.gms.measurement.AppMeasurement", this.f20488g, true)) {
            Method method = (Method) this.f20490i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, new Class[]{String.class});
                    this.f20490i.put(str2, method);
                } catch (Exception unused) {
                    m20636c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f20488g.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zze.zza(sb.toString());
            } catch (Exception unused2) {
                m20636c(str2, false);
            }
        }
    }

    /* renamed from: b */
    private final void m20635b(Context context, String str, String str2, Bundle bundle) {
        String str3;
        Class<String> cls = String.class;
        if (mo18501z(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str3 = "Invalid event ID: ".concat(valueOf);
                } else {
                    str3 = new String("Invalid event ID: ");
                }
                co0.zzh(str3, e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (m20629A(context)) {
                m20637d("logEventInternal", new ul0(str, bundle2));
            } else if (m20638e(context, "com.google.android.gms.measurement.AppMeasurement", this.f20488g, true)) {
                Method method = (Method) this.f20490i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{cls, cls, Bundle.class});
                        this.f20490i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        m20636c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f20488g.get(), new Object[]{"am", str, bundle2});
                } catch (Exception unused2) {
                    m20636c("logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: c */
    private final void m20636c(String str, boolean z) {
        if (!this.f20486e.get()) {
            StringBuilder sb = new StringBuilder(str.length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            co0.zzj(sb.toString());
            if (z) {
                co0.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f20486e.set(true);
            }
        }
    }

    /* renamed from: d */
    private final void m20637d(String str, jm0 jm0) {
        synchronized (this.f20491j) {
            FutureTask futureTask = new FutureTask(new vl0(this, jm0, str), (Object) null);
            if (this.f20491j.get() != null) {
                futureTask.run();
            } else {
                this.f20492k.offer(futureTask);
            }
        }
    }

    /* renamed from: e */
    private final boolean m20638e(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception unused) {
                m20636c("getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo18481f(Context context) {
        if (!mo18501z(context)) {
            return null;
        }
        if (m20629A(context)) {
            Long l = (Long) m20630B("getAdEventId", (Object) null, yl0.f41910a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object C = m20631C("generateEventId", context);
        if (C != null) {
            return C.toString();
        }
        return null;
    }

    /* renamed from: g */
    public final String mo18482g(Context context) {
        if (!mo18501z(context)) {
            return null;
        }
        synchronized (this.f20483b) {
            String str = this.f20485d;
            if (str != null) {
                return str;
            }
            if (m20629A(context)) {
                this.f20485d = (String) m20630B("getAppIdOrigin", this.f20485d, zl0.f42497a);
            } else {
                this.f20485d = "fa";
            }
            String str2 = this.f20485d;
            return str2;
        }
    }

    /* renamed from: h */
    public final String mo18483h(Context context) {
        if (!mo18501z(context)) {
            return null;
        }
        long longValue = ((Long) C8311wv.m39277c().mo18570b(p00.f37040a0)).longValue();
        if (m20629A(context)) {
            if (longValue >= 0) {
                return (String) m20633E().submit(new wl0(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) m20630B("getAppInstanceId", (Object) null, am0.f29691a);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) m20631C("getAppInstanceId", context);
        } else {
            try {
                return (String) m20633E().submit(new xl0(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused3) {
                return "TIME_OUT";
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo18484i(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.mo18501z(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            boolean r1 = m20629A(r7)
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.tl0 r7 = com.google.android.gms.internal.ads.tl0.f39442a
            java.lang.String r0 = "getCurrentScreenNameOrScreenClass"
            java.lang.Object r7 = r6.m20630B(r0, r2, r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.f20488g
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.m20638e(r7, r4, r1, r3)
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            r1 = 0
            java.lang.reflect.Method r3 = r6.m20632D(r7, r0)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.f20488g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.m20632D(r7, r3)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3 = r6.f20488g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch:{ Exception -> 0x0056 }
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            return r3
        L_0x0055:
            return r2
        L_0x0056:
            r6.m20636c(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.km0.mo18484i(android.content.Context):java.lang.String");
    }

    /* renamed from: j */
    public final String mo18485j(Context context) {
        if (!mo18501z(context)) {
            return null;
        }
        synchronized (this.f20483b) {
            String str = this.f20484c;
            if (str != null) {
                return str;
            }
            if (m20629A(context)) {
                this.f20484c = (String) m20630B("getGmpAppId", this.f20484c, bm0.f30040a);
            } else {
                this.f20484c = (String) m20631C("getGmpAppId", context);
            }
            String str2 = this.f20484c;
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ String mo18486k() throws Exception {
        return (String) m20630B("getAppInstanceId", (Object) null, am0.f29691a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ String mo18487l(Context context) throws Exception {
        return (String) m20631C("getAppInstanceId", context);
    }

    /* renamed from: m */
    public final void mo18488m(Context context, String str) {
        if (mo18501z(context)) {
            if (m20629A(context)) {
                m20637d("beginAdUnitExposure", new fm0(str));
            } else {
                m20634a(context, str, "beginAdUnitExposure");
            }
        }
    }

    /* renamed from: n */
    public final void mo18489n(Context context, String str) {
        if (mo18501z(context)) {
            if (m20629A(context)) {
                m20637d("endAdUnitExposure", new gm0(str));
            } else {
                m20634a(context, str, "endAdUnitExposure");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo18490o(jm0 jm0, String str) {
        if (this.f20491j.get() != null) {
            try {
                jm0.mo31293a(this.f20491j.get());
            } catch (Exception unused) {
                m20636c(str, false);
            }
        }
    }

    /* renamed from: p */
    public final void mo18491p(Context context, String str) {
        m20635b(context, "_aa", str, (Bundle) null);
    }

    /* renamed from: q */
    public final void mo18492q(Context context, String str) {
        m20635b(context, "_aq", str, (Bundle) null);
    }

    /* renamed from: r */
    public final void mo18493r(Context context, String str) {
        m20635b(context, "_ac", str, (Bundle) null);
    }

    /* renamed from: s */
    public final void mo18494s(Context context, String str) {
        m20635b(context, "_ai", str, (Bundle) null);
    }

    /* renamed from: t */
    public final void mo18495t(Context context, String str, String str2, String str3, int i) {
        if (mo18501z(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            m20635b(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            zze.zza(sb.toString());
        }
    }

    /* renamed from: u */
    public final void mo18496u(Context context, zzbfd zzbfd) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37103h0)).booleanValue() && mo18501z(context) && m20629A(context)) {
            synchronized (this.f20493l) {
            }
        }
    }

    /* renamed from: v */
    public final void mo18497v(Context context, zzbkk zzbkk) {
        lm0.m34501d(context).mo33357b().mo33555d(zzbkk);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37103h0)).booleanValue() && mo18501z(context) && m20629A(context)) {
            synchronized (this.f20493l) {
            }
        }
    }

    /* renamed from: w */
    public final void mo18498w(Bundle bundle) {
        m20637d("setConsent", new em0(bundle));
    }

    @Deprecated
    /* renamed from: x */
    public final void mo18499x(Context context, String str) {
        Class<String> cls = String.class;
        if (!mo18501z(context) || !(context instanceof Activity)) {
            return;
        }
        if (m20629A(context)) {
            m20637d("setScreenName", new dm0(context, str));
        } else if (m20638e(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f20489h, false)) {
            Method method = (Method) this.f20490i.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", new Class[]{Activity.class, cls, cls});
                    this.f20490i.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    m20636c("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f20489h.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception unused2) {
                m20636c("setCurrentScreen", false);
            }
        }
    }

    /* renamed from: y */
    public final boolean mo18500y() {
        synchronized (this.f20493l) {
        }
        return false;
    }

    /* renamed from: z */
    public final boolean mo18501z(Context context) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36999V)).booleanValue() && !this.f20486e.get()) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37085f0)).booleanValue()) {
                return true;
            }
            if (this.f20487f.get() == -1) {
                C8241uv.m38463b();
                if (!vn0.m38855n(context, C7355d.f29215a)) {
                    C8241uv.m38463b();
                    if (vn0.m38856o(context)) {
                        co0.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f20487f.set(0);
                    }
                }
                this.f20487f.set(1);
            }
            if (this.f20487f.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
