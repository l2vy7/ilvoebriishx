package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.C7190a;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.internal.C7215a;
import com.google.android.gms.common.api.internal.C7301r;
import com.google.android.gms.dynamite.DynamiteModule;
import p205f4.C10521a;
import p220j4.C10614h;

/* renamed from: com.google.android.gms.auth.api.signin.b */
public class C7065b extends C4591e<GoogleSignInOptions> {

    /* renamed from: a */
    private static final C7066a f28280a = new C7066a((C7071f) null);

    /* renamed from: b */
    private static int f28281b = C7067b.f28282a;

    /* renamed from: com.google.android.gms.auth.api.signin.b$a */
    private static class C7066a {
        private C7066a() {
        }

        /* synthetic */ C7066a(C7071f fVar) {
            this();
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.auth.api.signin.b$b */
    static final class C7067b {

        /* renamed from: a */
        public static final int f28282a = 1;

        /* renamed from: b */
        public static final int f28283b = 2;

        /* renamed from: c */
        public static final int f28284c = 3;

        /* renamed from: d */
        public static final int f28285d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f28286e = {1, 2, 3, 4};

        /* renamed from: a */
        public static int[] m28999a() {
            return (int[]) f28286e.clone();
        }
    }

    C7065b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C10521a.f49056g, googleSignInOptions, (C7301r) new C7215a());
    }

    /* renamed from: h */
    private final synchronized int m28997h() {
        if (f28281b == C7067b.f28282a) {
            Context applicationContext = getApplicationContext();
            C7190a q = C7190a.m29483q();
            int j = q.mo29709j(applicationContext, C7355d.f29215a);
            if (j == 0) {
                f28281b = C7067b.f28285d;
            } else if (q.mo29705d(applicationContext, j, (String) null) != null || DynamiteModule.m30155a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                f28281b = C7067b.f28283b;
            } else {
                f28281b = C7067b.f28284c;
            }
        }
        return f28281b;
    }

    /* renamed from: g */
    public Intent mo29114g() {
        Context applicationContext = getApplicationContext();
        int i = C7071f.f28287a[m28997h() - 1];
        if (i == 1) {
            return C10614h.m48382d(applicationContext, (GoogleSignInOptions) getApiOptions());
        }
        if (i != 2) {
            return C10614h.m48384f(applicationContext, (GoogleSignInOptions) getApiOptions());
        }
        return C10614h.m48380b(applicationContext, (GoogleSignInOptions) getApiOptions());
    }
}
