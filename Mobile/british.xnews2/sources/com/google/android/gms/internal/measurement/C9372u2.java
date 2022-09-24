package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p006a5.C6483e;
import p006a5.C6486h;
import p252t5.C11020a;
import p255u5.C11037l;
import p255u5.C11047v;

/* renamed from: com.google.android.gms.internal.measurement.u2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
public final class C9372u2 {

    /* renamed from: j */
    private static volatile C9372u2 f45481j;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f45482a;

    /* renamed from: b */
    protected final C6483e f45483b;

    /* renamed from: c */
    protected final ExecutorService f45484c;

    /* renamed from: d */
    private final C11020a f45485d;

    /* renamed from: e */
    private final List f45486e;

    /* renamed from: f */
    private int f45487f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f45488g;

    /* renamed from: h */
    private final String f45489h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile C9140f1 f45490i;

    protected C9372u2(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m43682m(str2, str3)) {
            this.f45482a = "FA";
        } else {
            this.f45482a = str;
        }
        this.f45483b = C6486h.m28261b();
        C9445z0.m43896a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C9141f2(this));
        boolean z = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f45484c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f45485d = new C11020a(this);
        this.f45486e = new ArrayList();
        try {
            if (C11047v.m49451b(context, "google_app_id", C11037l.m49435a(context)) != null && !m43678i()) {
                this.f45489h = null;
                this.f45488g = true;
                Log.w(this.f45482a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m43682m(str2, str3)) {
            this.f45489h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z)) {
                    Log.w(this.f45482a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f45482a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        } else {
            this.f45489h = str2;
        }
        m43681l(new C9355t1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f45482a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C9356t2(this));
        }
    }

    /* renamed from: i */
    protected static final boolean m43678i() {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m43679j(Exception exc, boolean z, boolean z2) {
        this.f45488g |= z;
        if (z) {
            Log.w(this.f45482a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo38071a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f45482a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: k */
    private final void m43680k(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m43681l(new C9187i2(this, l, str, str2, bundle, z, z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m43681l(C9217k2 k2Var) {
        this.f45484c.execute(k2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final boolean m43682m(String str, String str2) {
        return (str2 == null || str == null || m43678i()) ? false : true;
    }

    /* renamed from: t */
    public static C9372u2 m43684t(Context context, String str, String str2, String str3, Bundle bundle) {
        C4604n.m20098k(context);
        if (f45481j == null) {
            synchronized (C9372u2.class) {
                if (f45481j == null) {
                    f45481j = new C9372u2(context, str, str2, str3, bundle);
                }
            }
        }
        return f45481j;
    }

    /* renamed from: A */
    public final List mo38065A(String str, String str2) {
        C9078b1 b1Var = new C9078b1();
        m43681l(new C9308q1(this, str, str2, b1Var));
        List list = (List) C9078b1.m42642m6(b1Var.mo37382b2(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: B */
    public final Map mo38066B(String str, String str2, boolean z) {
        C9078b1 b1Var = new C9078b1();
        m43681l(new C9094c2(this, str, str2, z, b1Var));
        Bundle b2 = b1Var.mo37382b2(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        if (b2 == null || b2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b2.size());
        for (String str3 : b2.keySet()) {
            Object obj = b2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: F */
    public final void mo38067F(String str) {
        m43681l(new C9371u1(this, str));
    }

    /* renamed from: G */
    public final void mo38068G(String str, String str2, Bundle bundle) {
        m43681l(new C9293p1(this, str, str2, bundle));
    }

    /* renamed from: H */
    public final void mo38069H(String str) {
        m43681l(new C9386v1(this, str));
    }

    /* renamed from: I */
    public final void mo38070I(String str, String str2, Bundle bundle) {
        m43680k(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: a */
    public final void mo38071a(int i, String str, Object obj, Object obj2, Object obj3) {
        m43681l(new C9110d2(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* renamed from: b */
    public final void mo38072b(Bundle bundle) {
        m43681l(new C9277o1(this, bundle));
    }

    /* renamed from: c */
    public final void mo38073c(Bundle bundle) {
        m43681l(new C9339s1(this, bundle));
    }

    /* renamed from: d */
    public final void mo38074d(Activity activity, String str, String str2) {
        m43681l(new C9323r1(this, activity, str, str2));
    }

    /* renamed from: e */
    public final void mo38075e(boolean z) {
        m43681l(new C9172h2(this, z));
    }

    /* renamed from: f */
    public final void mo38076f(String str, String str2, Object obj, boolean z) {
        m43681l(new C9202j2(this, str, str2, obj, z));
    }

    /* renamed from: n */
    public final int mo38077n(String str) {
        C9078b1 b1Var = new C9078b1();
        m43681l(new C9157g2(this, str, b1Var));
        Integer num = (Integer) C9078b1.m42642m6(b1Var.mo37382b2(ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: o */
    public final long mo38078o() {
        C9078b1 b1Var = new C9078b1();
        m43681l(new C9446z1(this, b1Var));
        Long l = (Long) C9078b1.m42642m6(b1Var.mo37382b2(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f45483b.currentTimeMillis()).nextLong();
        int i = this.f45487f + 1;
        this.f45487f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: p */
    public final Bundle mo38079p(Bundle bundle, boolean z) {
        C9078b1 b1Var = new C9078b1();
        m43681l(new C9126e2(this, bundle, b1Var));
        if (z) {
            return b1Var.mo37382b2(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        }
        return null;
    }

    /* renamed from: q */
    public final C11020a mo38080q() {
        return this.f45485d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final C9140f1 mo38081s(Context context, boolean z) {
        try {
            return C9125e1.asInterface(DynamiteModule.m30157e(context, DynamiteModule.f29457e, ModuleDescriptor.MODULE_ID).mo30249d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C7468a e) {
            m43679j(e, true, false);
            return null;
        }
    }

    /* renamed from: v */
    public final String mo38082v() {
        return this.f45489h;
    }

    /* renamed from: w */
    public final String mo38083w() {
        C9078b1 b1Var = new C9078b1();
        m43681l(new C9432y1(this, b1Var));
        return b1Var.mo37384f3(50);
    }

    /* renamed from: x */
    public final String mo38084x() {
        C9078b1 b1Var = new C9078b1();
        m43681l(new C9079b2(this, b1Var));
        return b1Var.mo37384f3(500);
    }

    /* renamed from: y */
    public final String mo38085y() {
        C9078b1 b1Var = new C9078b1();
        m43681l(new C9064a2(this, b1Var));
        return b1Var.mo37384f3(500);
    }

    /* renamed from: z */
    public final String mo38086z() {
        C9078b1 b1Var = new C9078b1();
        m43681l(new C9417x1(this, b1Var));
        return b1Var.mo37384f3(500);
    }
}
