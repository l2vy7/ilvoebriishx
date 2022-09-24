package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.widget.C0615b;
import java.lang.ref.WeakReference;
import p010b0.C1523f;
import p072f.C5247j;

/* renamed from: androidx.appcompat.widget.l */
/* compiled from: AppCompatTextHelper */
class C0399l {

    /* renamed from: a */
    private final TextView f1622a;

    /* renamed from: b */
    private C0379d0 f1623b;

    /* renamed from: c */
    private C0379d0 f1624c;

    /* renamed from: d */
    private C0379d0 f1625d;

    /* renamed from: e */
    private C0379d0 f1626e;

    /* renamed from: f */
    private C0379d0 f1627f;

    /* renamed from: g */
    private C0379d0 f1628g;

    /* renamed from: h */
    private C0379d0 f1629h;

    /* renamed from: i */
    private final C0402m f1630i;

    /* renamed from: j */
    private int f1631j = 0;

    /* renamed from: k */
    private int f1632k = -1;

    /* renamed from: l */
    private Typeface f1633l;

    /* renamed from: m */
    private boolean f1634m;

    /* renamed from: androidx.appcompat.widget.l$a */
    /* compiled from: AppCompatTextHelper */
    class C0400a extends C1523f.C1526c {

        /* renamed from: a */
        final /* synthetic */ int f1635a;

        /* renamed from: b */
        final /* synthetic */ int f1636b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1637c;

        C0400a(int i, int i2, WeakReference weakReference) {
            this.f1635a = i;
            this.f1636b = i2;
            this.f1637c = weakReference;
        }

        /* renamed from: d */
        public void mo2206d(int i) {
        }

        /* renamed from: e */
        public void mo2207e(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1635a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f1636b & 2) != 0);
            }
            C0399l.this.mo2195n(this.f1637c, typeface);
        }
    }

    C0399l(TextView textView) {
        this.f1622a = textView;
        this.f1630i = new C0402m(textView);
    }

    /* renamed from: A */
    private void m2094A(int i, float f) {
        this.f1630i.mo2221y(i, f);
    }

    /* renamed from: B */
    private void m2095B(Context context, C0384f0 f0Var) {
        String o;
        this.f1631j = f0Var.mo2105k(C5247j.f23125c3, this.f1631j);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int k = f0Var.mo2105k(C5247j.f23150h3, -1);
            this.f1632k = k;
            if (k != -1) {
                this.f1631j = (this.f1631j & 2) | 0;
            }
        }
        int i2 = C5247j.f23145g3;
        if (f0Var.mo2113s(i2) || f0Var.mo2113s(C5247j.f23155i3)) {
            this.f1633l = null;
            int i3 = C5247j.f23155i3;
            if (f0Var.mo2113s(i3)) {
                i2 = i3;
            }
            int i4 = this.f1632k;
            int i5 = this.f1631j;
            if (!context.isRestricted()) {
                try {
                    Typeface j = f0Var.mo2104j(i2, this.f1631j, new C0400a(i4, i5, new WeakReference(this.f1622a)));
                    if (j != null) {
                        if (i < 28 || this.f1632k == -1) {
                            this.f1633l = j;
                        } else {
                            this.f1633l = Typeface.create(Typeface.create(j, 0), this.f1632k, (this.f1631j & 2) != 0);
                        }
                    }
                    this.f1634m = this.f1633l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1633l == null && (o = f0Var.mo2109o(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1632k == -1) {
                    this.f1633l = Typeface.create(o, this.f1631j);
                    return;
                }
                Typeface create = Typeface.create(o, 0);
                int i6 = this.f1632k;
                if ((this.f1631j & 2) != 0) {
                    z = true;
                }
                this.f1633l = Typeface.create(create, i6, z);
                return;
            }
            return;
        }
        int i7 = C5247j.f23120b3;
        if (f0Var.mo2113s(i7)) {
            this.f1634m = false;
            int k2 = f0Var.mo2105k(i7, 1);
            if (k2 == 1) {
                this.f1633l = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                this.f1633l = Typeface.SERIF;
            } else if (k2 == 3) {
                this.f1633l = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: a */
    private void m2096a(Drawable drawable, C0379d0 d0Var) {
        if (drawable != null && d0Var != null) {
            C0382f.m1974i(drawable, d0Var, this.f1622a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C0379d0 m2097d(Context context, C0382f fVar, int i) {
        ColorStateList f = fVar.mo2088f(context, i);
        if (f == null) {
            return null;
        }
        C0379d0 d0Var = new C0379d0();
        d0Var.f1543d = true;
        d0Var.f1540a = f;
        return d0Var;
    }

    /* renamed from: x */
    private void m2098x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1622a.getCompoundDrawablesRelative();
            TextView textView = this.f1622a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (i >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1622a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1622a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1622a.getCompoundDrawables();
            TextView textView3 = this.f1622a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: y */
    private void m2099y() {
        C0379d0 d0Var = this.f1629h;
        this.f1623b = d0Var;
        this.f1624c = d0Var;
        this.f1625d = d0Var;
        this.f1626e = d0Var;
        this.f1627f = d0Var;
        this.f1628g = d0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2184b() {
        if (!(this.f1623b == null && this.f1624c == null && this.f1625d == null && this.f1626e == null)) {
            Drawable[] compoundDrawables = this.f1622a.getCompoundDrawables();
            m2096a(compoundDrawables[0], this.f1623b);
            m2096a(compoundDrawables[1], this.f1624c);
            m2096a(compoundDrawables[2], this.f1625d);
            m2096a(compoundDrawables[3], this.f1626e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1627f != null || this.f1628g != null) {
            Drawable[] compoundDrawablesRelative = this.f1622a.getCompoundDrawablesRelative();
            m2096a(compoundDrawablesRelative[0], this.f1627f);
            m2096a(compoundDrawablesRelative[2], this.f1628g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2185c() {
        this.f1630i.mo2208b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo2186e() {
        return this.f1630i.mo2210j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo2187f() {
        return this.f1630i.mo2211k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo2188g() {
        return this.f1630i.mo2212l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo2189h() {
        return this.f1630i.mo2213m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo2190i() {
        return this.f1630i.mo2214n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo2191j() {
        C0379d0 d0Var = this.f1629h;
        if (d0Var != null) {
            return d0Var.f1540a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo2192k() {
        C0379d0 d0Var = this.f1629h;
        if (d0Var != null) {
            return d0Var.f1541b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo2193l() {
        return this.f1630i.mo2216s();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2194m(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.f1622a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.f r11 = androidx.appcompat.widget.C0382f.m1971b()
            int[] r2 = p072f.C5247j.f23122c0
            r12 = 0
            androidx.appcompat.widget.f0 r13 = androidx.appcompat.widget.C0384f0.m1994v(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f1622a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.mo2112r()
            r6 = 0
            r3 = r24
            r5 = r25
            p110m0.C5723u.m25326m0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = p072f.C5247j.f23127d0
            r14 = -1
            int r0 = r13.mo2108n(r0, r14)
            int r1 = p072f.C5247j.f23142g0
            boolean r2 = r13.mo2113s(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.mo2108n(r1, r12)
            androidx.appcompat.widget.d0 r1 = m2097d(r10, r11, r1)
            r7.f1623b = r1
        L_0x0042:
            int r1 = p072f.C5247j.f23132e0
            boolean r2 = r13.mo2113s(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.mo2108n(r1, r12)
            androidx.appcompat.widget.d0 r1 = m2097d(r10, r11, r1)
            r7.f1624c = r1
        L_0x0054:
            int r1 = p072f.C5247j.f23147h0
            boolean r2 = r13.mo2113s(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.mo2108n(r1, r12)
            androidx.appcompat.widget.d0 r1 = m2097d(r10, r11, r1)
            r7.f1625d = r1
        L_0x0066:
            int r1 = p072f.C5247j.f23137f0
            boolean r2 = r13.mo2113s(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.mo2108n(r1, r12)
            androidx.appcompat.widget.d0 r1 = m2097d(r10, r11, r1)
            r7.f1626e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x00a2
            int r2 = p072f.C5247j.f23152i0
            boolean r3 = r13.mo2113s(r2)
            if (r3 == 0) goto L_0x0090
            int r2 = r13.mo2108n(r2, r12)
            androidx.appcompat.widget.d0 r2 = m2097d(r10, r11, r2)
            r7.f1627f = r2
        L_0x0090:
            int r2 = p072f.C5247j.f23157j0
            boolean r3 = r13.mo2113s(r2)
            if (r3 == 0) goto L_0x00a2
            int r2 = r13.mo2108n(r2, r12)
            androidx.appcompat.widget.d0 r2 = m2097d(r10, r11, r2)
            r7.f1628g = r2
        L_0x00a2:
            r13.mo2114w()
            android.widget.TextView r2 = r7.f1622a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011e
            int[] r6 = p072f.C5247j.f23108Z2
            androidx.appcompat.widget.f0 r0 = androidx.appcompat.widget.C0384f0.m1992t(r10, r0, r6)
            if (r2 != 0) goto L_0x00c9
            int r6 = p072f.C5247j.f23165k3
            boolean r15 = r0.mo2113s(r6)
            if (r15 == 0) goto L_0x00c9
            boolean r6 = r0.mo2095a(r6, r12)
            r15 = 1
            goto L_0x00cb
        L_0x00c9:
            r6 = 0
            r15 = 0
        L_0x00cb:
            r7.m2095B(r10, r0)
            if (r1 >= r5) goto L_0x00f9
            int r4 = p072f.C5247j.f23130d3
            boolean r17 = r0.mo2113s(r4)
            if (r17 == 0) goto L_0x00dd
            android.content.res.ColorStateList r4 = r0.mo2097c(r4)
            goto L_0x00de
        L_0x00dd:
            r4 = 0
        L_0x00de:
            int r13 = p072f.C5247j.f23135e3
            boolean r18 = r0.mo2113s(r13)
            if (r18 == 0) goto L_0x00eb
            android.content.res.ColorStateList r13 = r0.mo2097c(r13)
            goto L_0x00ec
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            int r14 = p072f.C5247j.f23140f3
            boolean r19 = r0.mo2113s(r14)
            if (r19 == 0) goto L_0x00fb
            android.content.res.ColorStateList r14 = r0.mo2097c(r14)
            goto L_0x00fc
        L_0x00f9:
            r4 = 0
            r13 = 0
        L_0x00fb:
            r14 = 0
        L_0x00fc:
            int r5 = p072f.C5247j.f23170l3
            boolean r20 = r0.mo2113s(r5)
            if (r20 == 0) goto L_0x0109
            java.lang.String r5 = r0.mo2109o(r5)
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r1 < r3) goto L_0x0119
            int r3 = p072f.C5247j.f23160j3
            boolean r21 = r0.mo2113s(r3)
            if (r21 == 0) goto L_0x0119
            java.lang.String r3 = r0.mo2109o(r3)
            goto L_0x011a
        L_0x0119:
            r3 = 0
        L_0x011a:
            r0.mo2114w()
            goto L_0x0125
        L_0x011e:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0125:
            int[] r0 = p072f.C5247j.f23108Z2
            androidx.appcompat.widget.f0 r0 = androidx.appcompat.widget.C0384f0.m1994v(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0140
            int r12 = p072f.C5247j.f23165k3
            boolean r22 = r0.mo2113s(r12)
            if (r22 == 0) goto L_0x0140
            r22 = r3
            r3 = 0
            boolean r6 = r0.mo2095a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0144
        L_0x0140:
            r22 = r3
            r3 = 23
        L_0x0144:
            if (r1 >= r3) goto L_0x016a
            int r3 = p072f.C5247j.f23130d3
            boolean r12 = r0.mo2113s(r3)
            if (r12 == 0) goto L_0x0152
            android.content.res.ColorStateList r4 = r0.mo2097c(r3)
        L_0x0152:
            int r3 = p072f.C5247j.f23135e3
            boolean r12 = r0.mo2113s(r3)
            if (r12 == 0) goto L_0x015e
            android.content.res.ColorStateList r13 = r0.mo2097c(r3)
        L_0x015e:
            int r3 = p072f.C5247j.f23140f3
            boolean r12 = r0.mo2113s(r3)
            if (r12 == 0) goto L_0x016a
            android.content.res.ColorStateList r14 = r0.mo2097c(r3)
        L_0x016a:
            int r3 = p072f.C5247j.f23170l3
            boolean r12 = r0.mo2113s(r3)
            if (r12 == 0) goto L_0x0176
            java.lang.String r5 = r0.mo2109o(r3)
        L_0x0176:
            r3 = 26
            if (r1 < r3) goto L_0x0187
            int r3 = p072f.C5247j.f23160j3
            boolean r12 = r0.mo2113s(r3)
            if (r12 == 0) goto L_0x0187
            java.lang.String r3 = r0.mo2109o(r3)
            goto L_0x0189
        L_0x0187:
            r3 = r22
        L_0x0189:
            r12 = 28
            if (r1 < r12) goto L_0x01a6
            int r12 = p072f.C5247j.f23114a3
            boolean r16 = r0.mo2113s(r12)
            if (r16 == 0) goto L_0x01a6
            r16 = r11
            r11 = -1
            int r12 = r0.mo2100f(r12, r11)
            if (r12 != 0) goto L_0x01a8
            android.widget.TextView r11 = r7.f1622a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a8
        L_0x01a6:
            r16 = r11
        L_0x01a8:
            r7.m2095B(r10, r0)
            r0.mo2114w()
            if (r4 == 0) goto L_0x01b5
            android.widget.TextView r0 = r7.f1622a
            r0.setTextColor(r4)
        L_0x01b5:
            if (r13 == 0) goto L_0x01bc
            android.widget.TextView r0 = r7.f1622a
            r0.setHintTextColor(r13)
        L_0x01bc:
            if (r14 == 0) goto L_0x01c3
            android.widget.TextView r0 = r7.f1622a
            r0.setLinkTextColor(r14)
        L_0x01c3:
            if (r2 != 0) goto L_0x01ca
            if (r15 == 0) goto L_0x01ca
            r7.mo2199r(r6)
        L_0x01ca:
            android.graphics.Typeface r0 = r7.f1633l
            if (r0 == 0) goto L_0x01e0
            int r2 = r7.f1632k
            r4 = -1
            if (r2 != r4) goto L_0x01db
            android.widget.TextView r2 = r7.f1622a
            int r4 = r7.f1631j
            r2.setTypeface(r0, r4)
            goto L_0x01e0
        L_0x01db:
            android.widget.TextView r2 = r7.f1622a
            r2.setTypeface(r0)
        L_0x01e0:
            if (r3 == 0) goto L_0x01e7
            android.widget.TextView r0 = r7.f1622a
            r0.setFontVariationSettings(r3)
        L_0x01e7:
            if (r5 == 0) goto L_0x020f
            r0 = 24
            if (r1 < r0) goto L_0x01f7
            android.widget.TextView r0 = r7.f1622a
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r5)
            r0.setTextLocales(r1)
            goto L_0x020f
        L_0x01f7:
            r0 = 21
            if (r1 < r0) goto L_0x020f
            r0 = 44
            int r0 = r5.indexOf(r0)
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            android.widget.TextView r1 = r7.f1622a
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r1.setTextLocale(r0)
        L_0x020f:
            androidx.appcompat.widget.m r0 = r7.f1630i
            r1 = r24
            r0.mo2217t(r1, r9)
            boolean r0 = androidx.core.widget.C0615b.f3242a0
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.m r0 = r7.f1630i
            int r0 = r0.mo2214n()
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.m r0 = r7.f1630i
            int[] r0 = r0.mo2213m()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0257
            android.widget.TextView r2 = r7.f1622a
            int r2 = r2.getAutoSizeStepGranularity()
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0251
            android.widget.TextView r0 = r7.f1622a
            androidx.appcompat.widget.m r2 = r7.f1630i
            int r2 = r2.mo2211k()
            androidx.appcompat.widget.m r3 = r7.f1630i
            int r3 = r3.mo2210j()
            androidx.appcompat.widget.m r4 = r7.f1630i
            int r4 = r4.mo2212l()
            r5 = 0
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L_0x0257
        L_0x0251:
            r5 = 0
            android.widget.TextView r2 = r7.f1622a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r0, r5)
        L_0x0257:
            int[] r0 = p072f.C5247j.f23162k0
            androidx.appcompat.widget.f0 r8 = androidx.appcompat.widget.C0384f0.m1993u(r10, r1, r0)
            int r0 = p072f.C5247j.f23202s0
            r1 = -1
            int r0 = r8.mo2108n(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x026e
            android.graphics.drawable.Drawable r0 = r2.mo2086c(r10, r0)
            r3 = r0
            goto L_0x026f
        L_0x026e:
            r3 = 0
        L_0x026f:
            int r0 = p072f.C5247j.f23227x0
            int r0 = r8.mo2108n(r0, r1)
            if (r0 == r1) goto L_0x027d
            android.graphics.drawable.Drawable r0 = r2.mo2086c(r10, r0)
            r4 = r0
            goto L_0x027e
        L_0x027d:
            r4 = 0
        L_0x027e:
            int r0 = p072f.C5247j.f23207t0
            int r0 = r8.mo2108n(r0, r1)
            if (r0 == r1) goto L_0x028c
            android.graphics.drawable.Drawable r0 = r2.mo2086c(r10, r0)
            r5 = r0
            goto L_0x028d
        L_0x028c:
            r5 = 0
        L_0x028d:
            int r0 = p072f.C5247j.f23192q0
            int r0 = r8.mo2108n(r0, r1)
            if (r0 == r1) goto L_0x029b
            android.graphics.drawable.Drawable r0 = r2.mo2086c(r10, r0)
            r6 = r0
            goto L_0x029c
        L_0x029b:
            r6 = 0
        L_0x029c:
            int r0 = p072f.C5247j.f23212u0
            int r0 = r8.mo2108n(r0, r1)
            if (r0 == r1) goto L_0x02aa
            android.graphics.drawable.Drawable r0 = r2.mo2086c(r10, r0)
            r9 = r0
            goto L_0x02ab
        L_0x02aa:
            r9 = 0
        L_0x02ab:
            int r0 = p072f.C5247j.f23197r0
            int r0 = r8.mo2108n(r0, r1)
            if (r0 == r1) goto L_0x02b9
            android.graphics.drawable.Drawable r0 = r2.mo2086c(r10, r0)
            r10 = r0
            goto L_0x02ba
        L_0x02b9:
            r10 = 0
        L_0x02ba:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.m2098x(r1, r2, r3, r4, r5, r6)
            int r0 = p072f.C5247j.f23217v0
            boolean r1 = r8.mo2113s(r0)
            if (r1 == 0) goto L_0x02d6
            android.content.res.ColorStateList r0 = r8.mo2097c(r0)
            android.widget.TextView r1 = r7.f1622a
            androidx.core.widget.C0624k.m3460j(r1, r0)
        L_0x02d6:
            int r0 = p072f.C5247j.f23222w0
            boolean r1 = r8.mo2113s(r0)
            if (r1 == 0) goto L_0x02ee
            r1 = -1
            int r0 = r8.mo2105k(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0409p.m2201e(r0, r2)
            android.widget.TextView r2 = r7.f1622a
            androidx.core.widget.C0624k.m3461k(r2, r0)
            goto L_0x02ef
        L_0x02ee:
            r1 = -1
        L_0x02ef:
            int r0 = p072f.C5247j.f23232y0
            int r0 = r8.mo2100f(r0, r1)
            int r2 = p072f.C5247j.f23237z0
            int r2 = r8.mo2100f(r2, r1)
            int r3 = p072f.C5247j.f22981A0
            int r3 = r8.mo2100f(r3, r1)
            r8.mo2114w()
            if (r0 == r1) goto L_0x030b
            android.widget.TextView r4 = r7.f1622a
            androidx.core.widget.C0624k.m3463m(r4, r0)
        L_0x030b:
            if (r2 == r1) goto L_0x0312
            android.widget.TextView r0 = r7.f1622a
            androidx.core.widget.C0624k.m3464n(r0, r2)
        L_0x0312:
            if (r3 == r1) goto L_0x0319
            android.widget.TextView r0 = r7.f1622a
            androidx.core.widget.C0624k.m3465o(r0, r3)
        L_0x0319:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0399l.mo2194m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2195n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1634m) {
            this.f1633l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1631j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2196o(boolean z, int i, int i2, int i3, int i4) {
        if (!C0615b.f3242a0) {
            mo2185c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2197p() {
        mo2184b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2198q(Context context, int i) {
        String o;
        ColorStateList c;
        ColorStateList c2;
        ColorStateList c3;
        C0384f0 t = C0384f0.m1992t(context, i, C5247j.f23108Z2);
        int i2 = C5247j.f23165k3;
        if (t.mo2113s(i2)) {
            mo2199r(t.mo2095a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = C5247j.f23130d3;
            if (t.mo2113s(i4) && (c3 = t.mo2097c(i4)) != null) {
                this.f1622a.setTextColor(c3);
            }
            int i5 = C5247j.f23140f3;
            if (t.mo2113s(i5) && (c2 = t.mo2097c(i5)) != null) {
                this.f1622a.setLinkTextColor(c2);
            }
            int i6 = C5247j.f23135e3;
            if (t.mo2113s(i6) && (c = t.mo2097c(i6)) != null) {
                this.f1622a.setHintTextColor(c);
            }
        }
        int i7 = C5247j.f23114a3;
        if (t.mo2113s(i7) && t.mo2100f(i7, -1) == 0) {
            this.f1622a.setTextSize(0, 0.0f);
        }
        m2095B(context, t);
        if (i3 >= 26) {
            int i8 = C5247j.f23160j3;
            if (t.mo2113s(i8) && (o = t.mo2109o(i8)) != null) {
                this.f1622a.setFontVariationSettings(o);
            }
        }
        t.mo2114w();
        Typeface typeface = this.f1633l;
        if (typeface != null) {
            this.f1622a.setTypeface(typeface, this.f1631j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2199r(boolean z) {
        this.f1622a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2200s(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f1630i.mo2218u(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2201t(int[] iArr, int i) throws IllegalArgumentException {
        this.f1630i.mo2219v(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2202u(int i) {
        this.f1630i.mo2220w(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2203v(ColorStateList colorStateList) {
        if (this.f1629h == null) {
            this.f1629h = new C0379d0();
        }
        C0379d0 d0Var = this.f1629h;
        d0Var.f1540a = colorStateList;
        d0Var.f1543d = colorStateList != null;
        m2099y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2204w(PorterDuff.Mode mode) {
        if (this.f1629h == null) {
            this.f1629h = new C0379d0();
        }
        C0379d0 d0Var = this.f1629h;
        d0Var.f1541b = mode;
        d0Var.f1542c = mode != null;
        m2099y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo2205z(int i, float f) {
        if (!C0615b.f3242a0 && !mo2193l()) {
            m2094A(i, f);
        }
    }
}
