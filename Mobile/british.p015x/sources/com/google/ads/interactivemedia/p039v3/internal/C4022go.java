package com.google.ads.interactivemedia.p039v3.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.go */
/* compiled from: IMASDK */
public class C4022go extends C4020gm {

    /* renamed from: r */
    protected static final Object f17327r = new Object();

    /* renamed from: s */
    static boolean f17328s = false;

    /* renamed from: u */
    private static final String f17329u = "go";

    /* renamed from: v */
    private static long f17330v;

    /* renamed from: t */
    protected final String f17331t;

    protected C4022go(Context context) {
        super(context);
        this.f17331t = "";
    }

    /* renamed from: o */
    protected static synchronized void m17260o(Context context, boolean z) {
        synchronized (C4022go.class) {
            if (!f17328s) {
                f17330v = System.currentTimeMillis() / 1000;
                C4020gm.f17306a = m17261p(context, z);
                f17328s = true;
            }
        }
    }

    /* renamed from: p */
    protected static C4037hc m17261p(Context context, boolean z) {
        if (C4020gm.f17306a == null) {
            synchronized (f17327r) {
                if (C4020gm.f17306a == null) {
                    C4037hc s = C4037hc.m17292s(context, z);
                    if (s.mo15894b()) {
                        try {
                            if (aok.f15494j.mo14149f().booleanValue()) {
                                s.mo15909t("wCJZ843zNtSkKMoGSMKdcpsu6ggFXNA5rmM9kRCtd4jNPRIXc7Yg/+6vw3D1/ShN", "fqoL5OqbNwpX0+STfRhZkkeT0CV4fkIJkgX1nxTEgm8=", new Class[0]);
                            }
                        } catch (IllegalStateException unused) {
                        }
                        s.mo15909t("+CBbXHi/+XdLnSyDhFU51JgiFyDr7i+oHe/ECeOut7QI1M4VCznQFAAROBrz4y9r", "uLz42FqWno2hsY6OwcAoAZ4P+BVsWg+PIwU6Rmo8Y88=", Context.class);
                        s.mo15909t("yPgicEGzwf3pLaq/3P+u7LLtd+dkw8DYS9ofUgpVqMp2QWe7dGdxtv2HaEVDUnS9", "u860xWUndVipWEY9XVs+6Wwt96gWjvwTExZKaE1+WsQ=", Context.class);
                        s.mo15909t("tHdRNe/jhDrKe9TJQvcUj84NPZ0s3GzvdUdmVGo+tKBBdeggC8tn8wP69jltn3ho", "39psGfDY061ys4/Wj2pOCaqnZF5wiqQFlwVMT/Ve3NQ=", Context.class);
                        s.mo15909t("wGiQh6oIQPcfvqINgsDcKObtfJMmkAPkTuuTR+YWtX6ruuv68EJcK0wD9PuGwMVm", "Xn+NIOTt9a+kGD9HWjVPlcFOa97eg3lCTKq+K8aWyZk=", Context.class);
                        s.mo15909t("x4TAQ4qNDjcsh7j4oHW71VqDI+r54XTU4JPMh6pCCbiz57ynFdfjAFfk3XIa299B", "DvUyptF/hQcR4Inmjfcrb+c7g/f+r9r2uspdu0hFiK0=", Context.class);
                        Class cls = Boolean.TYPE;
                        s.mo15909t("z/Tn7JC6F4F+FkxUewfYz6OrIXZqnQo4XmAO6JXjjTzqzXvsXM/GDvmB3nhnuEAY", "o84OYee2NEh7lM/t6/LVSxy5Aa2CqVjhBA8rs1be3iY=", Context.class, cls);
                        s.mo15909t("ve98w3uvwL+WbIhcx9tIAXYisv3RoRLLGwxFdq305Znx3OEzhYuRa3SMbNvxvcZ5", "COyKgr9nLwjtPmD4ZyUGB47tHeKQEqJ+6+4+oYNfjv8=", Context.class);
                        s.mo15909t("ymEBQrm9U6oe66zraL8TMCz2DXOLL9KQTnrV40u0sowIyd/opEzPMlsdilx/qVZg", "EUHQvfImnZF71YZIWfpsbLorbTgsT1XsQrZZ+fhXkl4=", Context.class);
                        s.mo15909t("4ahSrt735BiJdoZiF/uEX9Uv7h2+4i6SsZbaHBZm4R8f4xsgVkaRBOI68SXKv5Zm", "jhE4qOkDAS8ohnMSHqV/0/2NdffjX4lb1nsDJQv2sQA=", MotionEvent.class, DisplayMetrics.class);
                        s.mo15909t("+MBKou0lC1EpuYXPlEddpmhFvfr48MEvso/c8bwZdQRvEGzM7sc1ailp1xL6yn7j", "jdxcOV6w06BSkplNeKgTDzzQPiPcoPj8KknL31XEkGo=", MotionEvent.class, DisplayMetrics.class);
                        s.mo15909t("5OYIQdsidStip3SBjywYm0rOM8tyA+MY9PPNX7JmSvza1Onp24UtEjVR4gU3Ig+9", "GcgQ+JQVen6BN2jyFQVqgjJfTksMX5RTfakx+qKDe48=", new Class[0]);
                        s.mo15909t("dtSI0aKX7UTEtNqwwKeUCAgkaGFO8NldeUWoEFEF24FGt0zcuIxq/320xj/CPQVD", "aR1qQgZoj5moBo+qhq9c0z5J3aresRgomgvyzjE3nwA=", new Class[0]);
                        s.mo15909t("ZhDCYxrCMcgSZPuGcM9wAQ/lryfELH/hwoSWjI7UgCmBL/U4jm1j8231unJQcN7G", "Tx6BN+D/YHy1QRF0a4sTUKKvc/7PTkfUYoCdGLIghAs=", new Class[0]);
                        s.mo15909t("2jgw5zKbHso9qSu2FHWgkwMGYpWraOZgKzMlINCc6R3raSWmpy2CL0CBKMif8Xd3", "xwe9uWAuGPfe//9yVRExw0dL2o3Hs2ICdfgY11WBl0c=", new Class[0]);
                        s.mo15909t("3kDC/5zdzriiTlLT98JAXh+tBEcp8Zs9D/7C5pBfnPMFpbO41uhjttSiwgYBtCds", "XaEk5xUvARugMaH/yLgQFFyBRau1nqpoJU7dPEEG4NA=", new Class[0]);
                        s.mo15909t("TY1qARfzSNIbOKTsxZ2/qLqxXbprFPLtmSjGSoaLL0AXrx2GQJJzrWpvMiB9EXW+", "u/4CWKH1BBOS+RLAQ+X4TaSgp+NDB66fPGwtynaeTFs=", new Class[0]);
                        s.mo15909t("p0TRkXE/NcSM6BGJMq+2rh+IfZ8Yp9IA3qvak/Mk1iX+ge9M5970NOJ17+Rrke0X", "xE1tXj7CYUbdHr3leN0Im7M6KUUnC9YYnjqy9MQetUk=", Context.class, cls, cls, String.class);
                        s.mo15909t("xXLnjgvEO8a9Q7TcyZH/ERSXaKjHGr9nJbpUT2CESVYEc6tfesE8AizE0M+CGX/K", "BxojPJPaHa1Mei2UyOZREW/8Cm7FQISAUHyKKXUhyes=", StackTraceElement[].class);
                        s.mo15909t("vefonVnYKoEEgd6CSCVE/bYu22aLs4D8v1V0lNqO4hdlAYob7Lw72sorrCIN3zpD", "gYJIsaJeV9lPo/cCsxCjt1P0O4OoIzIZoy68hFiQOi8=", View.class, DisplayMetrics.class, cls);
                        s.mo15909t("YGljdmTqVecnIT/TcNBW8EyCW98CifULQ4UQ5x4xY9d0w3w6sROgLyygqbyghtw3", "UuCnFh6ovoijq9XZ+A2Y7XU13mSANZwBIMCWkOnrp4k=", Context.class, cls);
                        s.mo15909t("1qMISOTSx5LOeeGh6nSz8PYEzoejuRAC4EdfuciyBbkI+FHNWZcPaORqu4cM0K/u", "IM/hCZ+LcSDatkBfeN3nTF1nFLmV/4whLclWEAX4BNg=", View.class, Activity.class, cls);
                        s.mo15909t("/PoX3bCyipS3p2k7kjc4HvQ27M63u+31cicZbFfWzwv/nsnLRaohqBhTdPid92VG", "Empsd+ouV88t4n5YSBzcvDK1RtnsR/tpf2QPTdrQaLw=", Long.TYPE);
                        try {
                            if (aok.f15498n.mo14149f().booleanValue()) {
                                s.mo15909t("1awJYzD+83j7B9eX6wfFcblqRy0I5IsvjjNLhcUURSjwWlhd1c9W/cfZ/PPMWvlS", "HJEi+2IOFxRSipNp6qbDeqGjXnf50mdvT5qWzt7Vsy8=", Context.class);
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        s.mo15909t("J5+/Yv+DORzfXYmLmfpwZ7m0NDrN6TeCSyl+cPylEzbqtpvEhJ6xrGlUtBFU3/z1", "Yqf2i3Vb0gxdMGchHOFN+MKx/oIzrAjebUVZwCo/YRY=", Context.class);
                        try {
                            if (aok.f15499o.mo14149f().booleanValue()) {
                                s.mo15909t("60YchRDHtYgn+jrXsAiXQ78ahHfcFJ28zV7ePSwE3DCfsWrThvx6YdamlK6zJai4", "o/z33E/qFqmtNZJeOJPsSeZru5kxGPNbHHRyvgfyKxQ=", Context.class);
                            }
                        } catch (IllegalStateException unused3) {
                        }
                    }
                    C4020gm.f17306a = s;
                }
            }
        }
        return C4020gm.f17306a;
    }

    /* renamed from: q */
    static C4039he m17262q(C4037hc hcVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws C4029gv {
        Method m = hcVar.mo15905m("4ahSrt735BiJdoZiF/uEX9Uv7h2+4i6SsZbaHBZm4R8f4xsgVkaRBOI68SXKv5Zm", "jhE4qOkDAS8ohnMSHqV/0/2NdffjX4lb1nsDJQv2sQA=");
        if (m == null || motionEvent == null) {
            throw new C4029gv();
        }
        try {
            return new C4039he((String) m.invoke((Object) null, new Object[]{motionEvent, displayMetrics}));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new C4029gv(e);
        }
    }

    /* renamed from: s */
    protected static final void m17263s(List<Callable<Void>> list) {
        ExecutorService c;
        if (C4020gm.f17306a != null && (c = C4020gm.f17306a.mo15895c()) != null && !list.isEmpty()) {
            try {
                c.invokeAll(list, aok.f15489e.mo14149f().longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Log.d(f17329u, String.format("class methods got exception: %s", new Object[]{C4040hf.m17334b(e)}));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C4115k mo15868d(Context context, C3980f fVar) {
        C4115k g = C4385u.m19061g();
        if (!TextUtils.isEmpty(this.f17331t)) {
            g.mo16069d(this.f17331t);
        }
        mo15875l(m17261p(context, false), context, g, fVar);
        if (fVar != null && fVar.mo15766d() && aok.f15492h.mo14149f().booleanValue() && !C4040hf.m17335c(fVar.mo15767e().mo15985c())) {
            C3834ae a = C3835af.m13418a();
            a.mo13519a(fVar.mo15767e().mo15985c());
            g.mo16045C((C3835af) a.mo15385ae());
        }
        return g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C4039he mo15869e(MotionEvent motionEvent) throws C4029gv {
        Method m = C4020gm.f17306a.mo15905m("+MBKou0lC1EpuYXPlEddpmhFvfr48MEvso/c8bwZdQRvEGzM7sc1ailp1xL6yn7j", "jdxcOV6w06BSkplNeKgTDzzQPiPcoPj8KknL31XEkGo=");
        if (m == null || motionEvent == null) {
            throw new C4029gv();
        }
        try {
            return new C4039he((String) m.invoke((Object) null, new Object[]{motionEvent, this.f17322q}));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new C4029gv(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo15870f(StackTraceElement[] stackTraceElementArr) throws C4029gv {
        Method m = C4020gm.f17306a.mo15905m("xXLnjgvEO8a9Q7TcyZH/ERSXaKjHGr9nJbpUT2CESVYEc6tfesE8AizE0M+CGX/K", "BxojPJPaHa1Mei2UyOZREW/8Cm7FQISAUHyKKXUhyes=");
        if (m == null || stackTraceElementArr == null) {
            throw new C4029gv();
        }
        try {
            return new C4030gw((String) m.invoke((Object) null, new Object[]{stackTraceElementArr})).f17342a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new C4029gv(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C4115k mo15872h(Context context) {
        C4115k g = C4385u.m19061g();
        if (!TextUtils.isEmpty(this.f17331t)) {
            g.mo16069d(this.f17331t);
        }
        mo15878r(m17261p(context, false), g, true);
        return g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C4115k mo15873i(Context context) {
        C4115k g = C4385u.m19061g();
        g.mo16069d(this.f17331t);
        mo15878r(m17261p(context, false), g, false);
        return g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo15875l(C4037hc hcVar, Context context, C4115k kVar, C3980f fVar) {
        if (hcVar.mo15895c() != null) {
            m17263s(mo15876m(hcVar, context, kVar, fVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public List<Callable<Void>> mo15876m(C4037hc hcVar, Context context, C4115k kVar, C3980f fVar) {
        int o = hcVar.mo15907o();
        ArrayList arrayList = new ArrayList();
        if (!hcVar.mo15894b()) {
            kVar.mo16044B((long) C4223o.PSN_INITIALIZATION_FAIL.mo16388a());
            return arrayList;
        }
        C4037hc hcVar2 = hcVar;
        C4115k kVar2 = kVar;
        arrayList.add(new C4044hj(hcVar2, kVar2, o, context, fVar));
        arrayList.add(new C4047hm(hcVar2, kVar2, f17330v, o));
        arrayList.add(new C4054ht(hcVar, kVar, o));
        arrayList.add(new C4057hw(hcVar, kVar, o));
        arrayList.add(new C4063ib(hcVar, kVar, o));
        arrayList.add(new C4043hi(hcVar, kVar, o, context));
        arrayList.add(new C4045hk(hcVar, kVar, o));
        arrayList.add(new C4053hs(hcVar, kVar, o));
        arrayList.add(new C4055hu(hcVar, kVar, o));
        arrayList.add(new C4046hl(hcVar, kVar, o));
        arrayList.add(new C4050hp(hcVar, kVar, o));
        arrayList.add(new C4064ic(hcVar, kVar, o));
        arrayList.add(new C4042hh(hcVar, kVar, o));
        arrayList.add(new C4060hz(hcVar, kVar, o));
        arrayList.add(new C4058hx(hcVar, kVar, o));
        if (aok.f15499o.mo14149f().booleanValue()) {
            arrayList.add(new C4052hr(hcVar, kVar, o));
        }
        if (aok.f15498n.mo14149f().booleanValue()) {
            arrayList.add(new C4056hv(hcVar, kVar, o));
        }
        arrayList.add(new C4051hq(hcVar, kVar, o));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo15878r(C4037hc hcVar, C4115k kVar, boolean z) {
        List list;
        Long l;
        MotionEvent motionEvent;
        if (!hcVar.mo15894b()) {
            kVar.mo16044B((long) C4223o.PSN_INITIALIZATION_FAIL.mo16388a());
            list = Arrays.asList(new Callable[]{new C4049ho(hcVar, kVar)});
        } else {
            try {
                C4039he q = m17262q(hcVar, this.f17307b, this.f17322q);
                Long l2 = q.f17376a;
                if (l2 != null) {
                    kVar.mo16055M(l2.longValue());
                }
                Long l3 = q.f17377b;
                if (l3 != null) {
                    kVar.mo16056N(l3.longValue());
                }
                Long l4 = q.f17378c;
                if (l4 != null) {
                    kVar.mo16053K(l4.longValue());
                }
                if (this.f17321p) {
                    Long l5 = q.f17379d;
                    if (l5 != null) {
                        kVar.mo16052J(l5.longValue());
                    }
                    Long l6 = q.f17380e;
                    if (l6 != null) {
                        kVar.mo16049G(l6.longValue());
                    }
                }
            } catch (C4029gv unused) {
            }
            C4277q a = C4304r.m18721a();
            if (this.f17309d > 0 && C4040hf.m17337e(this.f17322q)) {
                a.mo16550f(C4040hf.m17338f(this.f17316k, this.f17322q));
                a.mo16563s(C4040hf.m17338f((double) (this.f17319n - this.f17317l), this.f17322q));
                a.mo16564t(C4040hf.m17338f((double) (this.f17320o - this.f17318m), this.f17322q));
                a.mo16556l(C4040hf.m17338f((double) this.f17317l, this.f17322q));
                a.mo16558n(C4040hf.m17338f((double) this.f17318m, this.f17322q));
                if (this.f17321p && (motionEvent = this.f17307b) != null) {
                    long f = C4040hf.m17338f((double) (((this.f17317l - this.f17319n) + motionEvent.getRawX()) - this.f17307b.getX()), this.f17322q);
                    if (f != 0) {
                        a.mo16561q(f);
                    }
                    long f2 = C4040hf.m17338f((double) (((this.f17318m - this.f17320o) + this.f17307b.getRawY()) - this.f17307b.getY()), this.f17322q);
                    if (f2 != 0) {
                        a.mo16562r(f2);
                    }
                }
            }
            try {
                C4039he e = mo15869e(this.f17307b);
                Long l7 = e.f17376a;
                if (l7 != null) {
                    a.mo16557m(l7.longValue());
                }
                Long l8 = e.f17377b;
                if (l8 != null) {
                    a.mo16559o(l8.longValue());
                }
                a.mo16555k(e.f17378c.longValue());
                if (this.f17321p) {
                    Long l9 = e.f17380e;
                    if (l9 != null) {
                        a.mo16553i(l9.longValue());
                    }
                    Long l10 = e.f17379d;
                    if (l10 != null) {
                        a.mo16554j(l10.longValue());
                    }
                    Long l11 = e.f17381f;
                    if (l11 != null) {
                        a.mo16549e(l11.longValue() != 0 ? C3830ab.ENUM_TRUE : C3830ab.ENUM_FALSE);
                    }
                    if (this.f17310e > 0) {
                        if (C4040hf.m17337e(this.f17322q)) {
                            double d = (double) this.f17315j;
                            double d2 = (double) this.f17310e;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            l = Long.valueOf(Math.round(d / d2));
                        } else {
                            l = null;
                        }
                        if (l != null) {
                            a.mo16546b(l.longValue());
                        } else {
                            a.mo16545a();
                        }
                        double d3 = (double) this.f17314i;
                        double d4 = (double) this.f17310e;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        a.mo16547c(Math.round(d3 / d4));
                    }
                    Long l12 = e.f17384i;
                    if (l12 != null) {
                        a.mo16551g(l12.longValue());
                    }
                    Long l13 = e.f17385j;
                    if (l13 != null) {
                        a.mo16560p(l13.longValue());
                    }
                    Long l14 = e.f17386k;
                    if (l14 != null) {
                        a.mo16548d(l14.longValue() != 0 ? C3830ab.ENUM_TRUE : C3830ab.ENUM_FALSE);
                    }
                }
            } catch (C4029gv unused2) {
            }
            long j = this.f17313h;
            if (j > 0) {
                a.mo16552h(j);
            }
            kVar.mo16057O((C4304r) a.mo15385ae());
            long j2 = this.f17309d;
            if (j2 > 0) {
                kVar.mo16050H(j2);
            }
            long j3 = this.f17310e;
            if (j3 > 0) {
                kVar.mo16051I(j3);
            }
            long j4 = this.f17311f;
            if (j4 > 0) {
                kVar.mo16054L(j4);
            }
            long j5 = this.f17312g;
            if (j5 > 0) {
                kVar.mo16048F(j5);
            }
            try {
                int size = this.f17308c.size() - 1;
                if (size > 0) {
                    kVar.mo16067b();
                    for (int i = 0; i < size; i++) {
                        C4039he q2 = m17262q(C4020gm.f17306a, this.f17308c.get(i), this.f17322q);
                        C4277q a2 = C4304r.m18721a();
                        a2.mo16557m(q2.f17376a.longValue());
                        a2.mo16559o(q2.f17377b.longValue());
                        kVar.mo16066a((C4304r) a2.mo15385ae());
                    }
                }
            } catch (C4029gv unused3) {
                kVar.mo16067b();
            }
            ArrayList arrayList = new ArrayList();
            if (hcVar.mo15895c() != null) {
                int o = hcVar.mo15907o();
                arrayList.add(new C4049ho(hcVar, kVar));
                arrayList.add(new C4054ht(hcVar, kVar, o));
                arrayList.add(new C4047hm(hcVar, kVar, f17330v, o));
                arrayList.add(new C4046hl(hcVar, kVar, o));
                arrayList.add(new C4053hs(hcVar, kVar, o));
                arrayList.add(new C4055hu(hcVar, kVar, o));
                arrayList.add(new C4050hp(hcVar, kVar, o));
                arrayList.add(new C4045hk(hcVar, kVar, o));
                arrayList.add(new C4064ic(hcVar, kVar, o));
                arrayList.add(new C4042hh(hcVar, kVar, o));
                arrayList.add(new C4060hz(hcVar, kVar, o));
                arrayList.add(new C4059hy(hcVar, kVar, o, new Throwable().getStackTrace()));
                arrayList.add(new C4065id(hcVar, kVar, o));
                arrayList.add(new C4058hx(hcVar, kVar, o));
                if (aok.f15490f.mo14149f().booleanValue()) {
                    arrayList.add(new C4041hg(hcVar, kVar, o));
                }
                if (z && aok.f15491g.mo14149f().booleanValue()) {
                    arrayList.add(new C4062ia(hcVar, kVar, o));
                }
            }
            list = arrayList;
        }
        m17263s(list);
    }

    protected C4022go(Context context, byte[] bArr) {
        super(context);
        this.f17331t = "a.3.23.0";
    }
}
