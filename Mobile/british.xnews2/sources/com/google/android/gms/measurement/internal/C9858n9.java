package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9158g3;
import com.google.android.gms.internal.measurement.C9264n3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.n9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
abstract class C9858n9 {

    /* renamed from: a */
    final String f46519a;

    /* renamed from: b */
    final int f46520b;

    /* renamed from: c */
    Boolean f46521c;

    /* renamed from: d */
    Boolean f46522d;

    /* renamed from: e */
    Long f46523e;

    /* renamed from: f */
    Long f46524f;

    C9858n9(String str, int i) {
        this.f46519a = str;
        this.f46520b = i;
    }

    /* renamed from: d */
    private static Boolean m45238d(String str, int i, boolean z, String str2, List list, String str3, C4667d3 d3Var) {
        if (i == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (d3Var != null) {
                        d3Var.mo19287w().mo38857b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: e */
    static Boolean m45239e(BigDecimal bigDecimal, C9158g3 g3Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C4604n.m20098k(g3Var);
        if (g3Var.mo37586G()) {
            boolean z = true;
            if (g3Var.mo37591L() != 1) {
                if (g3Var.mo37591L() == 5) {
                    if (!g3Var.mo37590K() || !g3Var.mo37589J()) {
                        return null;
                    }
                } else if (!g3Var.mo37587H()) {
                    return null;
                }
                int L = g3Var.mo37591L();
                if (g3Var.mo37591L() == 5) {
                    if (C9978z8.m45538N(g3Var.mo37584D()) && C9978z8.m45538N(g3Var.mo37583C())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(g3Var.mo37584D());
                            bigDecimal3 = new BigDecimal(g3Var.mo37583C());
                            bigDecimal2 = bigDecimal5;
                            bigDecimal4 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!C9978z8.m45538N(g3Var.mo37582B())) {
                    return null;
                } else {
                    try {
                        bigDecimal4 = new BigDecimal(g3Var.mo37582B());
                        bigDecimal2 = null;
                        bigDecimal3 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (L == 5) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                }
                int i = L - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 || bigDecimal2 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        } else if (bigDecimal4 == null) {
                            return null;
                        } else {
                            if (d != 0.0d) {
                                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                            if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    static Boolean m45240f(String str, C9264n3 n3Var, C4667d3 d3Var) {
        String str2;
        List list;
        C4604n.m20098k(n3Var);
        if (str == null || !n3Var.mo37751I() || n3Var.mo37752J() == 1) {
            return null;
        }
        if (n3Var.mo37752J() == 7) {
            if (n3Var.mo37753z() == 0) {
                return null;
            }
        } else if (!n3Var.mo37750H()) {
            return null;
        }
        int J = n3Var.mo37752J();
        boolean F = n3Var.mo37748F();
        if (F || J == 2 || J == 7) {
            str2 = n3Var.mo37746C();
        } else {
            str2 = n3Var.mo37746C().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (n3Var.mo37753z() == 0) {
            list = null;
        } else {
            List<String> D = n3Var.mo37747D();
            if (!F) {
                ArrayList arrayList = new ArrayList(D.size());
                for (String upperCase : D) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                D = Collections.unmodifiableList(arrayList);
            }
            list = D;
        }
        return m45238d(str, J, F, str3, list, J == 2 ? str3 : null, d3Var);
    }

    /* renamed from: g */
    static Boolean m45241g(double d, C9158g3 g3Var) {
        try {
            return m45239e(new BigDecimal(d), g3Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static Boolean m45242h(long j, C9158g3 g3Var) {
        try {
            return m45239e(new BigDecimal(j), g3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    static Boolean m45243i(String str, C9158g3 g3Var) {
        if (!C9978z8.m45538N(str)) {
            return null;
        }
        try {
            return m45239e(new BigDecimal(str), g3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    static Boolean m45244j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo39069a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo39070b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo39071c();
}
