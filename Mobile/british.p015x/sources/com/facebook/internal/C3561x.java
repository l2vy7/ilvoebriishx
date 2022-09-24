package com.facebook.internal;

import android.util.Log;
import com.facebook.C3642m;
import com.facebook.C3752u;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.x */
/* compiled from: Logger */
public class C3561x {

    /* renamed from: e */
    private static final HashMap<String, String> f13276e = new HashMap<>();

    /* renamed from: a */
    private final C3752u f13277a;

    /* renamed from: b */
    private final String f13278b;

    /* renamed from: c */
    private StringBuilder f13279c;

    /* renamed from: d */
    private int f13280d = 3;

    public C3561x(C3752u uVar, String str) {
        C3489g0.m11688j(str, "tag");
        this.f13277a = uVar;
        this.f13278b = "FacebookSDK." + str;
        this.f13279c = new StringBuilder();
    }

    /* renamed from: e */
    public static void m11891e(C3752u uVar, int i, String str, String str2) {
        if (C3642m.m12298x(uVar)) {
            String l = m11897l(str2);
            if (!str.startsWith("FacebookSDK.")) {
                str = "FacebookSDK." + str;
            }
            Log.println(i, str, l);
            if (uVar == C3752u.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public static void m11892f(C3752u uVar, int i, String str, String str2, Object... objArr) {
        if (C3642m.m12298x(uVar)) {
            m11891e(uVar, i, str, String.format(str2, objArr));
        }
    }

    /* renamed from: g */
    public static void m11893g(C3752u uVar, String str, String str2) {
        m11891e(uVar, 3, str, str2);
    }

    /* renamed from: h */
    public static void m11894h(C3752u uVar, String str, String str2, Object... objArr) {
        if (C3642m.m12298x(uVar)) {
            m11891e(uVar, 3, str, String.format(str2, objArr));
        }
    }

    /* renamed from: j */
    public static synchronized void m11895j(String str) {
        synchronized (C3561x.class) {
            if (!C3642m.m12298x(C3752u.INCLUDE_ACCESS_TOKENS)) {
                m11896k(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    /* renamed from: k */
    public static synchronized void m11896k(String str, String str2) {
        synchronized (C3561x.class) {
            f13276e.put(str, str2);
        }
    }

    /* renamed from: l */
    private static synchronized String m11897l(String str) {
        synchronized (C3561x.class) {
            for (Map.Entry next : f13276e.entrySet()) {
                str = str.replace((CharSequence) next.getKey(), (CharSequence) next.getValue());
            }
        }
        return str;
    }

    /* renamed from: m */
    private boolean m11898m() {
        return C3642m.m12298x(this.f13277a);
    }

    /* renamed from: a */
    public void mo12080a(String str) {
        if (m11898m()) {
            this.f13279c.append(str);
        }
    }

    /* renamed from: b */
    public void mo12081b(String str, Object... objArr) {
        if (m11898m()) {
            this.f13279c.append(String.format(str, objArr));
        }
    }

    /* renamed from: c */
    public void mo12082c(String str, Object obj) {
        mo12081b("  %s:\t%s\n", str, obj);
    }

    /* renamed from: d */
    public void mo12083d() {
        mo12084i(this.f13279c.toString());
        this.f13279c = new StringBuilder();
    }

    /* renamed from: i */
    public void mo12084i(String str) {
        m11891e(this.f13277a, this.f13280d, this.f13278b, str);
    }
}
