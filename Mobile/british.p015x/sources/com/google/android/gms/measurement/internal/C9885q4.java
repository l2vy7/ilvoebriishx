package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.q4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9885q4 {

    /* renamed from: A */
    private long f46586A;

    /* renamed from: B */
    private String f46587B;

    /* renamed from: C */
    private boolean f46588C;

    /* renamed from: D */
    private long f46589D;

    /* renamed from: E */
    private long f46590E;

    /* renamed from: a */
    private final C4670h4 f46591a;

    /* renamed from: b */
    private final String f46592b;

    /* renamed from: c */
    private String f46593c;

    /* renamed from: d */
    private String f46594d;

    /* renamed from: e */
    private String f46595e;

    /* renamed from: f */
    private String f46596f;

    /* renamed from: g */
    private long f46597g;

    /* renamed from: h */
    private long f46598h;

    /* renamed from: i */
    private long f46599i;

    /* renamed from: j */
    private String f46600j;

    /* renamed from: k */
    private long f46601k;

    /* renamed from: l */
    private String f46602l;

    /* renamed from: m */
    private long f46603m;

    /* renamed from: n */
    private long f46604n;

    /* renamed from: o */
    private boolean f46605o;

    /* renamed from: p */
    private long f46606p;

    /* renamed from: q */
    private boolean f46607q;

    /* renamed from: r */
    private String f46608r;

    /* renamed from: s */
    private Boolean f46609s;

    /* renamed from: t */
    private long f46610t;

    /* renamed from: u */
    private List f46611u;

    /* renamed from: v */
    private long f46612v;

    /* renamed from: w */
    private long f46613w;

    /* renamed from: x */
    private long f46614x;

    /* renamed from: y */
    private long f46615y;

    /* renamed from: z */
    private long f46616z;

    C9885q4(C4670h4 h4Var, String str) {
        C4604n.m20098k(h4Var);
        C4604n.m20094g(str);
        this.f46591a = h4Var;
        this.f46592b = str;
        h4Var.mo19273e().mo19272b();
    }

    /* renamed from: A */
    public final long mo39107A() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46606p;
    }

    /* renamed from: B */
    public final void mo39108B(long j) {
        boolean z = true;
        C4604n.m20088a(j >= 0);
        this.f46591a.mo19273e().mo19272b();
        boolean z2 = this.f46588C;
        if (this.f46597g == j) {
            z = false;
        }
        this.f46588C = z | z2;
        this.f46597g = j;
    }

    /* renamed from: C */
    public final void mo39109C(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46598h != j;
        this.f46598h = j;
    }

    /* renamed from: D */
    public final void mo39110D(boolean z) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46605o != z;
        this.f46605o = z;
    }

    /* renamed from: E */
    public final void mo39111E(Boolean bool) {
        this.f46591a.mo19273e().mo19272b();
        boolean z = this.f46588C;
        Boolean bool2 = this.f46609s;
        int i = C4668d9.f21284i;
        this.f46588C = z | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
        this.f46609s = bool;
    }

    /* renamed from: F */
    public final void mo39112F(String str) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= !C4668d9.m21491Z(this.f46595e, str);
        this.f46595e = str;
    }

    /* renamed from: G */
    public final void mo39113G(List list) {
        this.f46591a.mo19273e().mo19272b();
        List list2 = this.f46611u;
        int i = C4668d9.f21284i;
        if (list2 != null || list != null) {
            if (list2 == null || !list2.equals(list)) {
                this.f46588C = true;
                this.f46611u = list != null ? new ArrayList(list) : null;
            }
        }
    }

    /* renamed from: H */
    public final boolean mo39114H() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46607q;
    }

    /* renamed from: I */
    public final boolean mo39115I() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46605o;
    }

    /* renamed from: J */
    public final boolean mo39116J() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46588C;
    }

    /* renamed from: K */
    public final long mo39117K() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46601k;
    }

    /* renamed from: L */
    public final long mo39118L() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46589D;
    }

    /* renamed from: M */
    public final long mo39119M() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46615y;
    }

    /* renamed from: N */
    public final long mo39120N() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46616z;
    }

    /* renamed from: O */
    public final long mo39121O() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46614x;
    }

    /* renamed from: P */
    public final long mo39122P() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46613w;
    }

    /* renamed from: Q */
    public final long mo39123Q() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46586A;
    }

    /* renamed from: R */
    public final long mo39124R() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46612v;
    }

    /* renamed from: S */
    public final long mo39125S() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46604n;
    }

    /* renamed from: T */
    public final long mo39126T() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46610t;
    }

    /* renamed from: U */
    public final long mo39127U() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46590E;
    }

    /* renamed from: V */
    public final long mo39128V() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46603m;
    }

    /* renamed from: W */
    public final long mo39129W() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46599i;
    }

    /* renamed from: X */
    public final long mo39130X() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46597g;
    }

    /* renamed from: Y */
    public final long mo39131Y() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46598h;
    }

    /* renamed from: Z */
    public final Boolean mo39132Z() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46609s;
    }

    /* renamed from: a */
    public final String mo39133a() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46595e;
    }

    /* renamed from: a0 */
    public final String mo39134a0() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46608r;
    }

    /* renamed from: b */
    public final List mo39135b() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46611u;
    }

    /* renamed from: b0 */
    public final String mo39136b0() {
        this.f46591a.mo19273e().mo19272b();
        String str = this.f46587B;
        mo39166y((String) null);
        return str;
    }

    /* renamed from: c */
    public final void mo39137c() {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C = false;
    }

    /* renamed from: c0 */
    public final String mo39138c0() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46592b;
    }

    /* renamed from: d */
    public final void mo39139d() {
        this.f46591a.mo19273e().mo19272b();
        long j = this.f46597g + 1;
        if (j > 2147483647L) {
            this.f46591a.mo19276j().mo19287w().mo38857b("Bundle index overflow. appId", C4667d3.m21474z(this.f46592b));
            j = 0;
        }
        this.f46588C = true;
        this.f46597g = j;
    }

    /* renamed from: d0 */
    public final String mo39140d0() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46593c;
    }

    /* renamed from: e */
    public final void mo39141e(String str) {
        this.f46591a.mo19273e().mo19272b();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f46588C |= true ^ C4668d9.m21491Z(this.f46608r, str);
        this.f46608r = str;
    }

    /* renamed from: e0 */
    public final String mo39142e0() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46602l;
    }

    /* renamed from: f */
    public final void mo39143f(boolean z) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46607q != z;
        this.f46607q = z;
    }

    /* renamed from: f0 */
    public final String mo39144f0() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46600j;
    }

    /* renamed from: g */
    public final void mo39145g(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46606p != j;
        this.f46606p = j;
    }

    /* renamed from: g0 */
    public final String mo39146g0() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46596f;
    }

    /* renamed from: h */
    public final void mo39147h(String str) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= !C4668d9.m21491Z(this.f46593c, str);
        this.f46593c = str;
    }

    /* renamed from: h0 */
    public final String mo39148h0() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46594d;
    }

    /* renamed from: i */
    public final void mo39149i(String str) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= !C4668d9.m21491Z(this.f46602l, str);
        this.f46602l = str;
    }

    /* renamed from: i0 */
    public final String mo39150i0() {
        this.f46591a.mo19273e().mo19272b();
        return this.f46587B;
    }

    /* renamed from: j */
    public final void mo39151j(String str) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= !C4668d9.m21491Z(this.f46600j, str);
        this.f46600j = str;
    }

    /* renamed from: k */
    public final void mo39152k(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46601k != j;
        this.f46601k = j;
    }

    /* renamed from: l */
    public final void mo39153l(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46589D != j;
        this.f46589D = j;
    }

    /* renamed from: m */
    public final void mo39154m(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46615y != j;
        this.f46615y = j;
    }

    /* renamed from: n */
    public final void mo39155n(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46616z != j;
        this.f46616z = j;
    }

    /* renamed from: o */
    public final void mo39156o(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46614x != j;
        this.f46614x = j;
    }

    /* renamed from: p */
    public final void mo39157p(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46613w != j;
        this.f46613w = j;
    }

    /* renamed from: q */
    public final void mo39158q(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46586A != j;
        this.f46586A = j;
    }

    /* renamed from: r */
    public final void mo39159r(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46612v != j;
        this.f46612v = j;
    }

    /* renamed from: s */
    public final void mo39160s(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46604n != j;
        this.f46604n = j;
    }

    /* renamed from: t */
    public final void mo39161t(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46610t != j;
        this.f46610t = j;
    }

    /* renamed from: u */
    public final void mo39162u(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46590E != j;
        this.f46590E = j;
    }

    /* renamed from: v */
    public final void mo39163v(String str) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= !C4668d9.m21491Z(this.f46596f, str);
        this.f46596f = str;
    }

    /* renamed from: w */
    public final void mo39164w(String str) {
        this.f46591a.mo19273e().mo19272b();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f46588C |= true ^ C4668d9.m21491Z(this.f46594d, str);
        this.f46594d = str;
    }

    /* renamed from: x */
    public final void mo39165x(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46603m != j;
        this.f46603m = j;
    }

    /* renamed from: y */
    public final void mo39166y(String str) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= !C4668d9.m21491Z(this.f46587B, str);
        this.f46587B = str;
    }

    /* renamed from: z */
    public final void mo39167z(long j) {
        this.f46591a.mo19273e().mo19272b();
        this.f46588C |= this.f46599i != j;
        this.f46599i = j;
    }
}
