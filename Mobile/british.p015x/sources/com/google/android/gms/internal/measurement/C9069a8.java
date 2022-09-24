package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9069a8 {

    /* renamed from: a */
    private final C9452z7 f44883a;

    private C9069a8(C9452z7 z7Var) {
        C9453z8.m43975f(z7Var, "output");
        this.f44883a = z7Var;
        z7Var.f45541a = this;
    }

    /* renamed from: l */
    public static C9069a8 m42588l(C9452z7 z7Var) {
        C9069a8 a8Var = z7Var.f45541a;
        return a8Var != null ? a8Var : new C9069a8(z7Var);
    }

    /* renamed from: A */
    public final void mo37318A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38155l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38154k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo37319B(int i, Object obj, C9179ha haVar) throws IOException {
        C9452z7 z7Var = this.f44883a;
        z7Var.mo38162s(i, 3);
        haVar.mo37359f((C9409w9) obj, z7Var.f45541a);
        z7Var.mo38162s(i, 4);
    }

    /* renamed from: C */
    public final void mo37320C(int i, int i2) throws IOException {
        this.f44883a.mo38158o(i, i2);
    }

    /* renamed from: D */
    public final void mo37321D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9452z7.m43950z(((Integer) list.get(i4)).intValue());
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38159p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38158o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo37322E(int i, long j) throws IOException {
        this.f44883a.mo38165v(i, j);
    }

    /* renamed from: F */
    public final void mo37323F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9452z7.m43945b(((Long) list.get(i4)).longValue());
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38166w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38165v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo37324G(int i, Object obj, C9179ha haVar) throws IOException {
        C9409w9 w9Var = (C9409w9) obj;
        C9422x7 x7Var = (C9422x7) this.f44883a;
        x7Var.mo38164u((i << 3) | 2);
        C9083b7 b7Var = (C9083b7) w9Var;
        int f = b7Var.mo37401f();
        if (f == -1) {
            f = haVar.zza(b7Var);
            b7Var.mo37403k(f);
        }
        x7Var.mo38164u(f);
        haVar.mo37359f(w9Var, x7Var.f45541a);
    }

    /* renamed from: H */
    public final void mo37325H(int i, int i2) throws IOException {
        this.f44883a.mo38154k(i, i2);
    }

    /* renamed from: I */
    public final void mo37326I(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38155l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38154k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo37327J(int i, long j) throws IOException {
        this.f44883a.mo38156m(i, j);
    }

    /* renamed from: K */
    public final void mo37328K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38157n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38156m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo37329a(int i, int i2) throws IOException {
        this.f44883a.mo38163t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void mo37330b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += C9452z7.m43944a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                C9452z7 z7Var = this.f44883a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                z7Var.mo38164u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C9452z7 z7Var2 = this.f44883a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            z7Var2.mo38163t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo37331c(int i, long j) throws IOException {
        this.f44883a.mo38165v(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void mo37332d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += C9452z7.m43945b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                C9452z7 z7Var = this.f44883a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                z7Var.mo38166w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C9452z7 z7Var2 = this.f44883a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            z7Var2.mo38165v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void mo37333e(int i) throws IOException {
        this.f44883a.mo38162s(i, 3);
    }

    /* renamed from: f */
    public final void mo37334f(int i, String str) throws IOException {
        this.f44883a.mo38161r(i, str);
    }

    /* renamed from: g */
    public final void mo37335g(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof C9148f9) {
            C9148f9 f9Var = (C9148f9) list;
            while (i2 < list.size()) {
                Object zzf = f9Var.zzf(i2);
                if (zzf instanceof String) {
                    this.f44883a.mo38161r(i, (String) zzf);
                } else {
                    this.f44883a.mo38153j(i, (C9329r7) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38161r(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo37336h(int i, int i2) throws IOException {
        this.f44883a.mo38163t(i, i2);
    }

    /* renamed from: i */
    public final void mo37337i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9452z7.m43944a(((Integer) list.get(i4)).intValue());
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38164u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38163t(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo37338j(int i, long j) throws IOException {
        this.f44883a.mo38165v(i, j);
    }

    /* renamed from: k */
    public final void mo37339k(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9452z7.m43945b(((Long) list.get(i4)).longValue());
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38166w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38165v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo37340m(int i, boolean z) throws IOException {
        this.f44883a.mo38152i(i, z);
    }

    /* renamed from: n */
    public final void mo37341n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38151h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38152i(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo37342o(int i, C9329r7 r7Var) throws IOException {
        this.f44883a.mo38153j(i, r7Var);
    }

    /* renamed from: p */
    public final void mo37343p(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f44883a.mo38153j(i, (C9329r7) list.get(i2));
        }
    }

    /* renamed from: q */
    public final void mo37344q(int i, double d) throws IOException {
        this.f44883a.mo38156m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo37345r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38157n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38156m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: s */
    public final void mo37346s(int i) throws IOException {
        this.f44883a.mo38162s(i, 4);
    }

    /* renamed from: t */
    public final void mo37347t(int i, int i2) throws IOException {
        this.f44883a.mo38158o(i, i2);
    }

    /* renamed from: u */
    public final void mo37348u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9452z7.m43950z(((Integer) list.get(i4)).intValue());
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38159p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38158o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo37349v(int i, int i2) throws IOException {
        this.f44883a.mo38154k(i, i2);
    }

    /* renamed from: w */
    public final void mo37350w(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38155l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38154k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo37351x(int i, long j) throws IOException {
        this.f44883a.mo38156m(i, j);
    }

    /* renamed from: y */
    public final void mo37352y(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44883a.mo38162s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f44883a.mo38164u(i3);
            while (i2 < list.size()) {
                this.f44883a.mo38157n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44883a.mo38156m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo37353z(int i, float f) throws IOException {
        this.f44883a.mo38154k(i, Float.floatToRawIntBits(f));
    }
}
