package com.startapp;

import android.content.Context;
import java.security.PublicKey;

/* renamed from: com.startapp.v4 */
/* compiled from: Sta */
public class C12385v4 {

    /* renamed from: g */
    public static final String f54875g = "insight Core SDK";

    /* renamed from: h */
    public static final String f54876h = "© 2014 - 2020 umlaut insight GmbH";

    /* renamed from: i */
    public static final String f54877i = "20220530140220";

    /* renamed from: j */
    private static C12385v4 f54878j;

    /* renamed from: a */
    private C12341t4 f54879a;

    /* renamed from: b */
    private C12112oa f54880b;

    /* renamed from: c */
    private C12408w4 f54881c;

    /* renamed from: d */
    private Context f54882d;

    /* renamed from: e */
    private PublicKey f54883e;

    /* renamed from: f */
    private C12386a f54884f;

    /* renamed from: com.startapp.v4$a */
    /* compiled from: Sta */
    public interface C12386a {
        /* renamed from: a */
        void mo46673a(String str);
    }

    private C12385v4(Context context) {
        this.f54882d = context;
    }

    /* renamed from: a */
    public static void m53558a(Context context, int i) {
        try {
            m53559a(context, C11888ea.m52277a(context.getResources().openRawResource(i)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Error while opening the raw resource");
        }
    }

    /* renamed from: b */
    public static C12341t4 m53561b() {
        return f54878j.f54879a;
    }

    /* renamed from: c */
    public static C12408w4 m53562c() {
        return f54878j.f54881c;
    }

    /* renamed from: d */
    public static C12386a m53563d() {
        return f54878j.f54884f;
    }

    /* renamed from: e */
    public static PublicKey m53564e() {
        return f54878j.f54883e;
    }

    /* renamed from: f */
    public static synchronized C12112oa m53565f() {
        C12112oa oaVar;
        synchronized (C12385v4.class) {
            oaVar = f54878j.f54880b;
        }
        return oaVar;
    }

    /* renamed from: g */
    private void m53566g() {
        this.f54880b = new C12112oa();
        this.f54881c = new C12408w4(this.f54882d);
    }

    /* renamed from: h */
    public static boolean m53567h() {
        return f54878j != null;
    }

    /* renamed from: a */
    public static void m53559a(Context context, byte[] bArr) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        } else if (bArr == null) {
            throw new IllegalArgumentException("config is null");
        } else if (f54878j == null) {
            try {
                C12360u4 a = C12360u4.m53533a(bArr);
                C12385v4 v4Var = new C12385v4(context);
                f54878j = v4Var;
                v4Var.f54883e = a.f54813a;
                v4Var.f54879a = a.f54814b;
                v4Var.m53566g();
            } catch (Exception unused) {
                throw new IllegalArgumentException("configuration is invalid");
            }
        }
    }

    /* renamed from: a */
    public static void m53560a(C12386a aVar) {
        f54878j.f54884f = aVar;
    }

    /* renamed from: a */
    public static String m53557a() {
        return f54878j.f54881c.mo46775p();
    }
}
