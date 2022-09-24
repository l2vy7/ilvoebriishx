package com.ironsource.environment.p059c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C4952a;
import com.ironsource.environment.C4979h;
import com.ironsource.p056c.C4946a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.environment.c.a */
public final class C4962a {

    /* renamed from: a */
    public ConcurrentHashMap<String, Object> f22018a;

    /* renamed from: b */
    AtomicBoolean f22019b;

    /* renamed from: c */
    AtomicBoolean f22020c;

    /* renamed from: com.ironsource.environment.c.a$a */
    public static class C4964a {

        /* renamed from: a */
        public static volatile C4962a f22023a = new C4962a((byte) 0);
    }

    /* renamed from: com.ironsource.environment.c.a$b */
    class C4965b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Context f22024b;

        C4965b(Context context) {
            this.f22024b = context;
        }

        public final void run() {
            try {
                C4962a aVar = C4962a.this;
                Context context = this.f22024b;
                if (context != null) {
                    try {
                        String[] a = C4979h.m22787a(context);
                        String str = a[0];
                        Boolean valueOf = Boolean.valueOf(a[1]);
                        if (!TextUtils.isEmpty(str)) {
                            aVar.mo20581a("gaid", str);
                            aVar.mo20581a("lat", valueOf);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            C4962a.this.f22019b.set(false);
        }
    }

    private C4962a() {
        this.f22019b = new AtomicBoolean(false);
        this.f22020c = new AtomicBoolean(false);
        this.f22018a = new ConcurrentHashMap<>();
    }

    /* synthetic */ C4962a(byte b) {
        this();
    }

    /* renamed from: b */
    private void m22752b(String str) {
        try {
            this.f22018a.remove(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private void m22753c(Context context) {
        if (!this.f22019b.get()) {
            try {
                this.f22019b.set(true);
                new Thread(new C4965b(context)).start();
            } catch (Exception e) {
                e.printStackTrace();
                this.f22019b.set(false);
            }
        }
    }

    /* renamed from: d */
    private boolean m22754d(String str) {
        try {
            return this.f22018a.containsKey(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public void mo20580a(Context context) {
        if (context != null) {
            m22753c(context);
            String C = C4979h.m22782C(context);
            if (!TextUtils.isEmpty(C)) {
                mo20581a("asid", C);
            } else if (m22754d("asid")) {
                m22752b("asid");
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                mo20581a("lang", language.toUpperCase());
            }
            String c = C4979h.m22791c();
            if (!TextUtils.isEmpty(c)) {
                mo20581a("tz", c);
            }
            String a = C4946a.m22688a(context);
            if (!TextUtils.isEmpty(a) && !a.equals("none")) {
                mo20581a("connt", a);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                mo20581a("vpn", Boolean.valueOf(C4946a.m22693c(context)));
            }
            String k = C4979h.m22811k(context);
            if (!TextUtils.isEmpty(k)) {
                mo20581a("icc", k);
            }
            mo20581a("vol", Float.valueOf(C4979h.m22814m(context)));
            mo20581a("dfs", String.valueOf(C4979h.m22821p()));
            mo20581a("scrnw", Integer.valueOf(C4979h.m22810k()));
            mo20581a("scrnh", Integer.valueOf(C4979h.m22812l()));
            mo20581a("ltime", String.valueOf(C4979h.m22783a()));
            mo20581a("tzoff", String.valueOf(C4979h.m22788b()));
            mo20581a("mcc", Integer.valueOf(C4952a.C49531.m22727c(context)));
            mo20581a("mnc", Integer.valueOf(C4952a.C49531.m22730d(context)));
            mo20581a("sdcrd", Boolean.valueOf(C4979h.m22795d()));
            mo20581a("chrg", Boolean.valueOf(C4979h.m22801f(context)));
            mo20581a("chrgt", Integer.valueOf(C4979h.m22802g(context)));
            mo20581a("apm", Boolean.valueOf(C4979h.m22805h(context)));
            mo20581a("owp", Boolean.valueOf(C4979h.m22807i(context)));
            mo20581a("rt", Boolean.valueOf(C4979h.m22809j()));
            mo20581a("sscl", String.valueOf(C4979h.m22818o()));
            mo20581a("bat", Integer.valueOf(C4979h.m22831w(context)));
            mo20581a("lpm", Boolean.valueOf(C4979h.m22832x(context)));
            mo20581a("apor", C4979h.m22819o(context));
            mo20581a("ua", C4979h.m22824r());
        }
    }

    /* renamed from: a */
    public void mo20581a(String str, Object obj) {
        if (str != null && obj != null) {
            try {
                if (obj instanceof Boolean) {
                    obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                this.f22018a.put(str, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
