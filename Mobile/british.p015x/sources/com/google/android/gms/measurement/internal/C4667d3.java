package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4604n;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.measurement.internal.d3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C4667d3 extends C9737c5 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f21270c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f21271d = -1;

    /* renamed from: e */
    private String f21272e;

    /* renamed from: f */
    private final C9725b3 f21273f = new C9725b3(this, 6, false, false);

    /* renamed from: g */
    private final C9725b3 f21274g = new C9725b3(this, 6, true, false);

    /* renamed from: h */
    private final C9725b3 f21275h = new C9725b3(this, 6, false, true);

    /* renamed from: i */
    private final C9725b3 f21276i = new C9725b3(this, 5, false, false);

    /* renamed from: j */
    private final C9725b3 f21277j = new C9725b3(this, 5, true, false);

    /* renamed from: k */
    private final C9725b3 f21278k = new C9725b3(this, 5, false, true);

    /* renamed from: l */
    private final C9725b3 f21279l = new C9725b3(this, 4, false, false);

    /* renamed from: m */
    private final C9725b3 f21280m = new C9725b3(this, 3, false, false);

    /* renamed from: n */
    private final C9725b3 f21281n = new C9725b3(this, 2, false, false);

    C4667d3(C4670h4 h4Var) {
        super(h4Var);
    }

    /* renamed from: A */
    static String m21467A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String B = m21468B(z, obj);
        String B2 = m21468B(z, obj2);
        String B3 = m21468B(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(B2)) {
            sb.append(str2);
            sb.append(B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    /* renamed from: B */
    static String m21468B(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String G = m21471G(C4670h4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m21471G(className).equals(G)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C9735c3) {
                return ((C9735c3) obj).f46192a;
            } else {
                if (z) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    /* renamed from: G */
    private static String m21471G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: z */
    protected static Object m21474z(String str) {
        if (str == null) {
            return null;
        }
        return new C9735c3(str);
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    /* renamed from: C */
    public final String mo19278C() {
        String str;
        synchronized (this) {
            if (this.f21272e == null) {
                if (this.f21269a.mo19375Q() != null) {
                    this.f21272e = this.f21269a.mo19375Q();
                } else {
                    this.f21272e = this.f21269a.mo19392z().mo19356w();
                }
            }
            C4604n.m20098k(this.f21272e);
            str = this.f21272e;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo19279F(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo19278C(), i)) {
            Log.println(i, mo19278C(), m21467A(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C4604n.m20098k(str);
            C9766f4 G = this.f21269a.mo19366G();
            if (G == null) {
                Log.println(6, mo19278C(), "Scheduler not set. Not logging error/warn");
            } else if (!G.mo38883m()) {
                Log.println(6, mo19278C(), "Scheduler not initialized. Not logging error/warn");
            } else {
                G.mo38909z(new C9714a3(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo19280h() {
        return false;
    }

    /* renamed from: p */
    public final C9725b3 mo19281p() {
        return this.f21280m;
    }

    /* renamed from: q */
    public final C9725b3 mo19282q() {
        return this.f21273f;
    }

    /* renamed from: s */
    public final C9725b3 mo19283s() {
        return this.f21275h;
    }

    /* renamed from: t */
    public final C9725b3 mo19284t() {
        return this.f21274g;
    }

    /* renamed from: u */
    public final C9725b3 mo19285u() {
        return this.f21279l;
    }

    /* renamed from: v */
    public final C9725b3 mo19286v() {
        return this.f21281n;
    }

    /* renamed from: w */
    public final C9725b3 mo19287w() {
        return this.f21276i;
    }

    /* renamed from: x */
    public final C9725b3 mo19288x() {
        return this.f21278k;
    }

    /* renamed from: y */
    public final C9725b3 mo19289y() {
        return this.f21277j;
    }
}
