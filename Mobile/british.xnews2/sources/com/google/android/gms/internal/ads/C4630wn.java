package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.wn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4630wn {

    /* renamed from: a */
    private final int f20960a;

    /* renamed from: b */
    private final int f20961b;

    /* renamed from: c */
    private final int f20962c;

    /* renamed from: d */
    private final boolean f20963d;

    /* renamed from: e */
    private final C7948mo f20964e;

    /* renamed from: f */
    private final C8234uo f20965f;

    /* renamed from: g */
    private final Object f20966g = new Object();

    /* renamed from: h */
    private final ArrayList<String> f20967h = new ArrayList<>();

    /* renamed from: i */
    private final ArrayList<String> f20968i = new ArrayList<>();

    /* renamed from: j */
    private final ArrayList<C4613io> f20969j = new ArrayList<>();

    /* renamed from: k */
    private int f20970k = 0;

    /* renamed from: l */
    private int f20971l = 0;

    /* renamed from: m */
    private int f20972m = 0;

    /* renamed from: n */
    private int f20973n;

    /* renamed from: o */
    private String f20974o = "";

    /* renamed from: p */
    private String f20975p = "";

    /* renamed from: q */
    private String f20976q = "";

    public C4630wn(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f20960a = i;
        this.f20961b = i2;
        this.f20962c = i3;
        this.f20963d = z;
        this.f20964e = new C7948mo(i4);
        this.f20965f = new C8234uo(i5, i6, i7);
    }

    /* renamed from: p */
    private final void m21101p(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f20962c) {
            synchronized (this.f20966g) {
                this.f20967h.add(str);
                this.f20970k += str.length();
                if (z) {
                    this.f20968i.add(str);
                    this.f20969j.add(new C4613io(f, f2, f3, f4, this.f20968i.size() - 1));
                }
            }
        }
    }

    /* renamed from: q */
    private static final String m21102q(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append(arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo18929a(int i, int i2) {
        return this.f20963d ? this.f20961b : (i * this.f20960a) + (i2 * this.f20961b);
    }

    /* renamed from: b */
    public final int mo18930b() {
        return this.f20973n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo18931c() {
        return this.f20970k;
    }

    /* renamed from: d */
    public final String mo18932d() {
        return this.f20974o;
    }

    /* renamed from: e */
    public final String mo18933e() {
        return this.f20975p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4630wn)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C4630wn) obj).f20974o;
        return str != null && str.equals(this.f20974o);
    }

    /* renamed from: f */
    public final String mo18935f() {
        return this.f20976q;
    }

    /* renamed from: g */
    public final void mo18936g() {
        synchronized (this.f20966g) {
            this.f20972m--;
        }
    }

    /* renamed from: h */
    public final void mo18937h() {
        synchronized (this.f20966g) {
            this.f20972m++;
        }
    }

    public final int hashCode() {
        return this.f20974o.hashCode();
    }

    /* renamed from: i */
    public final void mo18939i() {
        synchronized (this.f20966g) {
            this.f20973n -= 100;
        }
    }

    /* renamed from: j */
    public final void mo18940j(int i) {
        this.f20971l = i;
    }

    /* renamed from: k */
    public final void mo18941k(String str, boolean z, float f, float f2, float f3, float f4) {
        m21101p(str, z, f, f2, f3, f4);
    }

    /* renamed from: l */
    public final void mo18942l(String str, boolean z, float f, float f2, float f3, float f4) {
        m21101p(str, z, f, f2, f3, f4);
        synchronized (this.f20966g) {
            if (this.f20972m < 0) {
                co0.zze("ActivityContent: negative number of WebViews.");
            }
            mo18943m();
        }
    }

    /* renamed from: m */
    public final void mo18943m() {
        synchronized (this.f20966g) {
            int a = mo18929a(this.f20970k, this.f20971l);
            if (a > this.f20973n) {
                this.f20973n = a;
                if (!zzt.zzo().mo18583h().zzI()) {
                    this.f20974o = this.f20964e.mo33577a(this.f20967h);
                    this.f20975p = this.f20964e.mo33577a(this.f20968i);
                }
                if (!zzt.zzo().mo18583h().zzJ()) {
                    this.f20976q = this.f20965f.mo35215a(this.f20968i, this.f20969j);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo18944n() {
        synchronized (this.f20966g) {
            int a = mo18929a(this.f20970k, this.f20971l);
            if (a > this.f20973n) {
                this.f20973n = a;
            }
        }
    }

    /* renamed from: o */
    public final boolean mo18945o() {
        boolean z;
        synchronized (this.f20966g) {
            z = this.f20972m == 0;
        }
        return z;
    }

    public final String toString() {
        int i = this.f20971l;
        int i2 = this.f20973n;
        int i3 = this.f20970k;
        String q = m21102q(this.f20967h, 100);
        String q2 = m21102q(this.f20968i, 100);
        String str = this.f20974o;
        String str2 = this.f20975p;
        String str3 = this.f20976q;
        int length = String.valueOf(q).length();
        int length2 = String.valueOf(q2).length();
        int length3 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + length3 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(q);
        sb.append("\n viewableText");
        sb.append(q2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
