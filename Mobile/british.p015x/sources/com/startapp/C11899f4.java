package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.f4 */
/* compiled from: Sta */
public class C11899f4 {

    /* renamed from: a */
    public final double f52934a;

    /* renamed from: b */
    public final int f52935b;

    /* renamed from: c */
    public final int f52936c;

    /* renamed from: d */
    public final boolean f52937d;

    /* renamed from: e */
    public final long f52938e;

    /* renamed from: f */
    public final long f52939f;

    /* renamed from: g */
    public final List<C11936h4> f52940g;

    /* renamed from: com.startapp.f4$a */
    /* compiled from: Sta */
    public static class C11900a {

        /* renamed from: a */
        public double f52941a = 1.0d;

        /* renamed from: b */
        public int f52942b;

        /* renamed from: c */
        public int f52943c;

        /* renamed from: d */
        public boolean f52944d;

        /* renamed from: e */
        public String f52945e;

        /* renamed from: f */
        public String f52946f;

        /* renamed from: g */
        public List<C11936h4> f52947g;

        /* renamed from: a */
        public double mo45353a() {
            return this.f52941a;
        }

        /* renamed from: b */
        public List<C11936h4> mo45355b() {
            return this.f52947g;
        }

        /* renamed from: c */
        public String mo45356c() {
            return this.f52946f;
        }

        /* renamed from: d */
        public int mo45357d() {
            return this.f52942b;
        }

        /* renamed from: e */
        public int mo45358e() {
            return this.f52943c;
        }

        /* renamed from: f */
        public String mo45359f() {
            return this.f52945e;
        }

        /* renamed from: g */
        public boolean mo45360g() {
            return this.f52944d;
        }

        /* renamed from: a */
        public C11900a mo45354a(C11936h4 h4Var) {
            if (this.f52947g == null) {
                this.f52947g = new ArrayList();
            }
            this.f52947g.add(h4Var);
            return this;
        }
    }

    public C11899f4(C11900a aVar) {
        this.f52934a = aVar.mo45353a();
        this.f52935b = aVar.mo45357d();
        this.f52936c = aVar.mo45358e();
        this.f52937d = aVar.mo45360g();
        this.f52938e = Math.max(60000, C5015nb.m22935e(aVar.mo45359f()));
        this.f52939f = Math.max(0, C5015nb.m22935e(aVar.mo45356c()));
        this.f52940g = C5015nb.m22928b(aVar.mo45355b());
    }

    /* renamed from: a */
    public static <T> T m52295a(T t, T t2) {
        return t2 != null ? t2 : t;
    }

    /* renamed from: a */
    public double mo45346a() {
        return this.f52934a;
    }

    /* renamed from: b */
    public List<C11936h4> mo45347b() {
        return this.f52940g;
    }

    /* renamed from: c */
    public long mo45348c() {
        return this.f52939f;
    }

    /* renamed from: d */
    public int mo45349d() {
        return this.f52935b;
    }

    /* renamed from: e */
    public int mo45350e() {
        return this.f52936c;
    }

    /* renamed from: f */
    public long mo45351f() {
        return this.f52938e;
    }

    /* renamed from: g */
    public boolean mo45352g() {
        return this.f52937d;
    }

    public C11899f4(C11899f4 f4Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        this.f52934a = ((Double) m52295a(Double.valueOf(f4Var.mo45346a()), analyticsCategoryConfig.mo46290a())).doubleValue();
        this.f52935b = ((Integer) m52295a(Integer.valueOf(f4Var.mo45349d()), analyticsCategoryConfig.mo46293d())).intValue();
        this.f52936c = ((Integer) m52295a(Integer.valueOf(f4Var.mo45350e()), analyticsCategoryConfig.mo46294e())).intValue();
        this.f52937d = ((Boolean) m52295a(Boolean.valueOf(f4Var.mo45352g()), analyticsCategoryConfig.mo46296f())).booleanValue();
        this.f52938e = analyticsCategoryConfig.mo46297g() == null ? f4Var.mo45351f() : Math.max(60000, C5015nb.m22935e(analyticsCategoryConfig.mo46297g()));
        this.f52939f = analyticsCategoryConfig.mo46292c() == null ? f4Var.mo45348c() : Math.max(0, C5015nb.m22935e(analyticsCategoryConfig.mo46292c()));
        this.f52940g = (List) m52295a(f4Var.mo45347b(), C11936h4.m52383a(analyticsCategoryConfig.mo46291b()));
    }
}
