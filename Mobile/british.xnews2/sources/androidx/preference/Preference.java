package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import androidx.preference.C1067b;
import java.util.List;
import p010b0.C1532g;

public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    private boolean f4697A;

    /* renamed from: B */
    private boolean f4698B;

    /* renamed from: C */
    private int f4699C;

    /* renamed from: D */
    private int f4700D;

    /* renamed from: E */
    private C1053b f4701E;

    /* renamed from: F */
    private List<Preference> f4702F;

    /* renamed from: G */
    private C1056e f4703G;

    /* renamed from: H */
    private final View.OnClickListener f4704H;

    /* renamed from: b */
    private Context f4705b;

    /* renamed from: c */
    private C1067b f4706c;

    /* renamed from: d */
    private C1054c f4707d;

    /* renamed from: e */
    private C1055d f4708e;

    /* renamed from: f */
    private int f4709f;

    /* renamed from: g */
    private int f4710g;

    /* renamed from: h */
    private CharSequence f4711h;

    /* renamed from: i */
    private CharSequence f4712i;

    /* renamed from: j */
    private int f4713j;

    /* renamed from: k */
    private String f4714k;

    /* renamed from: l */
    private Intent f4715l;

    /* renamed from: m */
    private String f4716m;

    /* renamed from: n */
    private boolean f4717n;

    /* renamed from: o */
    private boolean f4718o;

    /* renamed from: p */
    private boolean f4719p;

    /* renamed from: q */
    private String f4720q;

    /* renamed from: r */
    private Object f4721r;

    /* renamed from: s */
    private boolean f4722s;

    /* renamed from: t */
    private boolean f4723t;

    /* renamed from: u */
    private boolean f4724u;

    /* renamed from: v */
    private boolean f4725v;

    /* renamed from: w */
    private boolean f4726w;

    /* renamed from: x */
    private boolean f4727x;

    /* renamed from: y */
    private boolean f4728y;

    /* renamed from: z */
    private boolean f4729z;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new C1051a();

        /* renamed from: androidx.preference.Preference$BaseSavedState$a */
        static class C1051a implements Parcelable.Creator<BaseSavedState> {
            C1051a() {
            }

            /* renamed from: a */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            /* renamed from: b */
            public BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: androidx.preference.Preference$a */
    class C1052a implements View.OnClickListener {
        C1052a() {
        }

        public void onClick(View view) {
            Preference.this.mo4846H(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    interface C1053b {
        /* renamed from: a */
        void mo4914a(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$c */
    public interface C1054c {
        /* renamed from: a */
        boolean mo4915a(Preference preference, Object obj);
    }

    /* renamed from: androidx.preference.Preference$d */
    public interface C1055d {
        /* renamed from: a */
        boolean mo4916a(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$e */
    public interface C1056e<T extends Preference> {
        /* renamed from: a */
        CharSequence mo4861a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4709f = Integer.MAX_VALUE;
        this.f4710g = 0;
        this.f4717n = true;
        this.f4718o = true;
        this.f4719p = true;
        this.f4722s = true;
        this.f4723t = true;
        this.f4724u = true;
        this.f4725v = true;
        this.f4726w = true;
        this.f4728y = true;
        this.f4698B = true;
        int i3 = C1072e.f4785a;
        this.f4699C = i3;
        this.f4704H = new C1052a();
        this.f4705b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1074g.f4917r0, i, i2);
        this.f4713j = C1532g.m7916n(obtainStyledAttributes, C1074g.f4833P0, C1074g.f4920s0, 0);
        this.f4714k = C1532g.m7917o(obtainStyledAttributes, C1074g.f4842S0, C1074g.f4938y0);
        this.f4711h = C1532g.m7918p(obtainStyledAttributes, C1074g.f4867a1, C1074g.f4932w0);
        this.f4712i = C1532g.m7918p(obtainStyledAttributes, C1074g.f4863Z0, C1074g.f4941z0);
        this.f4709f = C1532g.m7906d(obtainStyledAttributes, C1074g.f4848U0, C1074g.f4788A0, Integer.MAX_VALUE);
        this.f4716m = C1532g.m7917o(obtainStyledAttributes, C1074g.f4830O0, C1074g.f4803F0);
        this.f4699C = C1532g.m7916n(obtainStyledAttributes, C1074g.f4845T0, C1074g.f4929v0, i3);
        this.f4700D = C1532g.m7916n(obtainStyledAttributes, C1074g.f4870b1, C1074g.f4791B0, 0);
        this.f4717n = C1532g.m7904b(obtainStyledAttributes, C1074g.f4827N0, C1074g.f4926u0, true);
        this.f4718o = C1532g.m7904b(obtainStyledAttributes, C1074g.f4854W0, C1074g.f4935x0, true);
        this.f4719p = C1532g.m7904b(obtainStyledAttributes, C1074g.f4851V0, C1074g.f4923t0, true);
        this.f4720q = C1532g.m7917o(obtainStyledAttributes, C1074g.f4821L0, C1074g.f4794C0);
        int i4 = C1074g.f4812I0;
        this.f4725v = C1532g.m7904b(obtainStyledAttributes, i4, i4, this.f4718o);
        int i5 = C1074g.f4815J0;
        this.f4726w = C1532g.m7904b(obtainStyledAttributes, i5, i5, this.f4718o);
        int i6 = C1074g.f4818K0;
        if (obtainStyledAttributes.hasValue(i6)) {
            this.f4721r = mo4853E(obtainStyledAttributes, i6);
        } else {
            int i7 = C1074g.f4797D0;
            if (obtainStyledAttributes.hasValue(i7)) {
                this.f4721r = mo4853E(obtainStyledAttributes, i7);
            }
        }
        this.f4698B = C1532g.m7904b(obtainStyledAttributes, C1074g.f4857X0, C1074g.f4800E0, true);
        int i8 = C1074g.f4860Y0;
        boolean hasValue = obtainStyledAttributes.hasValue(i8);
        this.f4727x = hasValue;
        if (hasValue) {
            this.f4728y = C1532g.m7904b(obtainStyledAttributes, i8, C1074g.f4806G0, true);
        }
        this.f4729z = C1532g.m7904b(obtainStyledAttributes, C1074g.f4836Q0, C1074g.f4809H0, false);
        int i9 = C1074g.f4839R0;
        this.f4724u = C1532g.m7904b(obtainStyledAttributes, i9, i9, true);
        int i10 = C1074g.f4824M0;
        this.f4697A = C1532g.m7904b(obtainStyledAttributes, i10, i10, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: O */
    private void m5384O(SharedPreferences.Editor editor) {
        if (this.f4706c.mo4962i()) {
            editor.apply();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo4849A() {
        C1053b bVar = this.f4701E;
        if (bVar != null) {
            bVar.mo4914a(this);
        }
    }

    /* renamed from: B */
    public void mo4881B(boolean z) {
        List<Preference> list = this.f4702F;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo4882D(this, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo4848C() {
    }

    /* renamed from: D */
    public void mo4882D(Preference preference, boolean z) {
        if (this.f4722s == z) {
            this.f4722s = !z;
            mo4881B(mo4854M());
            mo4849A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Object mo4853E(TypedArray typedArray, int i) {
        return null;
    }

    /* renamed from: F */
    public void mo4883F(Preference preference, boolean z) {
        if (this.f4723t == z) {
            this.f4723t = !z;
            mo4881B(mo4854M());
            mo4849A();
        }
    }

    /* renamed from: G */
    public void mo4884G() {
        C1067b.C1069b f;
        if (mo4906x() && mo4908z()) {
            mo4848C();
            C1055d dVar = this.f4708e;
            if (dVar == null || !dVar.mo4916a(this)) {
                C1067b p = mo4901p();
                if ((p == null || (f = p.mo4959f()) == null || !f.mo4965a(this)) && this.f4715l != null) {
                    mo4893d().startActivity(this.f4715l);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo4846H(View view) {
        mo4884G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo4885I(boolean z) {
        if (!mo4889N()) {
            return false;
        }
        if (z == mo4897l(!z)) {
            return true;
        }
        mo4900o();
        SharedPreferences.Editor d = this.f4706c.mo4957d();
        d.putBoolean(this.f4714k, z);
        m5384O(d);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo4886J(int i) {
        if (!mo4889N()) {
            return false;
        }
        if (i == mo4898m(i ^ -1)) {
            return true;
        }
        mo4900o();
        SharedPreferences.Editor d = this.f4706c.mo4957d();
        d.putInt(this.f4714k, i);
        m5384O(d);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public boolean mo4887K(String str) {
        if (!mo4889N()) {
            return false;
        }
        if (TextUtils.equals(str, mo4899n((String) null))) {
            return true;
        }
        mo4900o();
        SharedPreferences.Editor d = this.f4706c.mo4957d();
        d.putString(this.f4714k, str);
        m5384O(d);
        return true;
    }

    /* renamed from: L */
    public final void mo4888L(C1056e eVar) {
        this.f4703G = eVar;
        mo4849A();
    }

    /* renamed from: M */
    public boolean mo4854M() {
        return !mo4906x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public boolean mo4889N() {
        return this.f4706c != null && mo4907y() && mo4905w();
    }

    /* renamed from: a */
    public boolean mo4890a(Object obj) {
        C1054c cVar = this.f4707d;
        return cVar == null || cVar.mo4915a(this, obj);
    }

    /* renamed from: b */
    public int compareTo(Preference preference) {
        int i = this.f4709f;
        int i2 = preference.f4709f;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f4711h;
        CharSequence charSequence2 = preference.f4711h;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f4711h.toString());
    }

    /* renamed from: d */
    public Context mo4893d() {
        return this.f4705b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public StringBuilder mo4894i() {
        StringBuilder sb = new StringBuilder();
        CharSequence u = mo4904u();
        if (!TextUtils.isEmpty(u)) {
            sb.append(u);
            sb.append(' ');
        }
        CharSequence q = mo4869q();
        if (!TextUtils.isEmpty(q)) {
            sb.append(q);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* renamed from: j */
    public String mo4895j() {
        return this.f4716m;
    }

    /* renamed from: k */
    public Intent mo4896k() {
        return this.f4715l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo4897l(boolean z) {
        if (!mo4889N()) {
            return z;
        }
        mo4900o();
        return this.f4706c.mo4961h().getBoolean(this.f4714k, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo4898m(int i) {
        if (!mo4889N()) {
            return i;
        }
        mo4900o();
        return this.f4706c.mo4961h().getInt(this.f4714k, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo4899n(String str) {
        if (!mo4889N()) {
            return str;
        }
        mo4900o();
        return this.f4706c.mo4961h().getString(this.f4714k, str);
    }

    /* renamed from: o */
    public C1066a mo4900o() {
        C1067b bVar = this.f4706c;
        if (bVar != null) {
            return bVar.mo4960g();
        }
        return null;
    }

    /* renamed from: p */
    public C1067b mo4901p() {
        return this.f4706c;
    }

    /* renamed from: q */
    public CharSequence mo4869q() {
        if (mo4902s() != null) {
            return mo4902s().mo4861a(this);
        }
        return this.f4712i;
    }

    /* renamed from: s */
    public final C1056e mo4902s() {
        return this.f4703G;
    }

    public String toString() {
        return mo4894i().toString();
    }

    /* renamed from: u */
    public CharSequence mo4904u() {
        return this.f4711h;
    }

    /* renamed from: w */
    public boolean mo4905w() {
        return !TextUtils.isEmpty(this.f4714k);
    }

    /* renamed from: x */
    public boolean mo4906x() {
        return this.f4717n && this.f4722s && this.f4723t;
    }

    /* renamed from: y */
    public boolean mo4907y() {
        return this.f4719p;
    }

    /* renamed from: z */
    public boolean mo4908z() {
        return this.f4718o;
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1532g.m7903a(context, C1070c.f4780g, 16842894));
    }
}
