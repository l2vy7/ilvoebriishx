package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0277a;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0291g;
import androidx.appcompat.view.menu.C0294i;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.view.menu.C0298k;
import androidx.appcompat.view.menu.C0303m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p062d0.C5135a;
import p072f.C5238a;
import p072f.C5244g;
import p098k.C5521a;
import p103l.C5639e;
import p110m0.C5685b;

class ActionMenuPresenter extends C0277a implements C5685b.C5686a {

    /* renamed from: A */
    C0310a f1122A;

    /* renamed from: B */
    C0312c f1123B;

    /* renamed from: C */
    private C0311b f1124C;

    /* renamed from: D */
    final C0316f f1125D = new C0316f();

    /* renamed from: E */
    int f1126E;

    /* renamed from: l */
    C0313d f1127l;

    /* renamed from: m */
    private Drawable f1128m;

    /* renamed from: n */
    private boolean f1129n;

    /* renamed from: o */
    private boolean f1130o;

    /* renamed from: p */
    private boolean f1131p;

    /* renamed from: q */
    private int f1132q;

    /* renamed from: r */
    private int f1133r;

    /* renamed from: s */
    private int f1134s;

    /* renamed from: t */
    private boolean f1135t;

    /* renamed from: u */
    private boolean f1136u;

    /* renamed from: v */
    private boolean f1137v;

    /* renamed from: w */
    private boolean f1138w;

    /* renamed from: x */
    private int f1139x;

    /* renamed from: y */
    private final SparseBooleanArray f1140y = new SparseBooleanArray();

    /* renamed from: z */
    C0315e f1141z;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0309a();

        /* renamed from: b */
        public int f1142b;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        class C0309a implements Parcelable.Creator<SavedState> {
            C0309a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1142b);
        }

        SavedState(Parcel parcel) {
            this.f1142b = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    private class C0310a extends C0294i {
        public C0310a(Context context, C0303m mVar, View view) {
            super(context, mVar, view, false, C5238a.f22816l);
            if (!((C0291g) mVar.getItem()).mo1209l()) {
                View view2 = ActionMenuPresenter.this.f1127l;
                mo1260f(view2 == null ? (View) ActionMenuPresenter.this.f905j : view2);
            }
            mo1264j(ActionMenuPresenter.this.f1125D);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1259e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f1122A = null;
            actionMenuPresenter.f1126E = 0;
            super.mo1259e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    private class C0311b extends ActionMenuItemView.C0276b {
        C0311b() {
        }

        /* renamed from: a */
        public C5639e mo1011a() {
            C0310a aVar = ActionMenuPresenter.this.f1122A;
            if (aVar != null) {
                return aVar.mo1257c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    private class C0312c implements Runnable {

        /* renamed from: b */
        private C0315e f1145b;

        public C0312c(C0315e eVar) {
            this.f1145b = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f899d != null) {
                ActionMenuPresenter.this.f899d.mo1131d();
            }
            View view = (View) ActionMenuPresenter.this.f905j;
            if (!(view == null || view.getWindowToken() == null || !this.f1145b.mo1266m())) {
                ActionMenuPresenter.this.f1141z = this.f1145b;
            }
            ActionMenuPresenter.this.f1123B = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    private class C0313d extends AppCompatImageView implements ActionMenuView.C0317a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        class C0314a extends C0415s {

            /* renamed from: k */
            final /* synthetic */ ActionMenuPresenter f1148k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0314a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f1148k = actionMenuPresenter;
            }

            /* renamed from: b */
            public C5639e mo1009b() {
                C0315e eVar = ActionMenuPresenter.this.f1141z;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1257c();
            }

            /* renamed from: c */
            public boolean mo1010c() {
                ActionMenuPresenter.this.mo1398N();
                return true;
            }

            /* renamed from: d */
            public boolean mo1409d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f1123B != null) {
                    return false;
                }
                actionMenuPresenter.mo1389E();
                return true;
            }
        }

        public C0313d(Context context) {
            super(context, (AttributeSet) null, C5238a.f22815k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0390h0.m2064a(this, getContentDescription());
            setOnTouchListener(new C0314a(this, ActionMenuPresenter.this));
        }

        /* renamed from: a */
        public boolean mo990a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo991b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo1398N();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C5135a.m23412l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    private class C0315e extends C0294i {
        public C0315e(Context context, C0287e eVar, View view, boolean z) {
            super(context, eVar, view, z, C5238a.f22816l);
            mo1262h(8388613);
            mo1264j(ActionMenuPresenter.this.f1125D);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1259e() {
            if (ActionMenuPresenter.this.f899d != null) {
                ActionMenuPresenter.this.f899d.close();
            }
            ActionMenuPresenter.this.f1141z = null;
            super.mo1259e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    private class C0316f implements C0296j.C0297a {
        C0316f() {
        }

        /* renamed from: b */
        public void mo877b(C0287e eVar, boolean z) {
            if (eVar instanceof C0303m) {
                eVar.mo1094F().mo1133e(false);
            }
            C0296j.C0297a p = ActionMenuPresenter.this.mo1039p();
            if (p != null) {
                p.mo877b(eVar, z);
            }
        }

        /* renamed from: c */
        public boolean mo878c(C0287e eVar) {
            if (eVar == ActionMenuPresenter.this.f899d) {
                return false;
            }
            ActionMenuPresenter.this.f1126E = ((C0303m) eVar).getItem().getItemId();
            C0296j.C0297a p = ActionMenuPresenter.this.mo1039p();
            if (p != null) {
                return p.mo878c(eVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C5244g.f22942c, C5244g.f22941b);
    }

    /* renamed from: C */
    private View m1615C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f905j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0298k.C0299a) && ((C0298k.C0299a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo1387B() {
        return mo1389E() | mo1390F();
    }

    /* renamed from: D */
    public Drawable mo1388D() {
        C0313d dVar = this.f1127l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1129n) {
            return this.f1128m;
        }
        return null;
    }

    /* renamed from: E */
    public boolean mo1389E() {
        C0298k kVar;
        C0312c cVar = this.f1123B;
        if (cVar == null || (kVar = this.f905j) == null) {
            C0315e eVar = this.f1141z;
            if (eVar == null) {
                return false;
            }
            eVar.mo1256b();
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.f1123B = null;
        return true;
    }

    /* renamed from: F */
    public boolean mo1390F() {
        C0310a aVar = this.f1122A;
        if (aVar == null) {
            return false;
        }
        aVar.mo1256b();
        return true;
    }

    /* renamed from: G */
    public boolean mo1391G() {
        return this.f1123B != null || mo1392H();
    }

    /* renamed from: H */
    public boolean mo1392H() {
        C0315e eVar = this.f1141z;
        return eVar != null && eVar.mo1258d();
    }

    /* renamed from: I */
    public void mo1393I(Configuration configuration) {
        if (!this.f1135t) {
            this.f1134s = C5521a.m24610b(this.f898c).mo22007d();
        }
        C0287e eVar = this.f899d;
        if (eVar != null) {
            eVar.mo1101M(true);
        }
    }

    /* renamed from: J */
    public void mo1394J(boolean z) {
        this.f1138w = z;
    }

    /* renamed from: K */
    public void mo1395K(ActionMenuView actionMenuView) {
        this.f905j = actionMenuView;
        actionMenuView.mo1013b(this.f899d);
    }

    /* renamed from: L */
    public void mo1396L(Drawable drawable) {
        C0313d dVar = this.f1127l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1129n = true;
        this.f1128m = drawable;
    }

    /* renamed from: M */
    public void mo1397M(boolean z) {
        this.f1130o = z;
        this.f1131p = true;
    }

    /* renamed from: N */
    public boolean mo1398N() {
        C0287e eVar;
        if (!this.f1130o || mo1392H() || (eVar = this.f899d) == null || this.f905j == null || this.f1123B != null || eVar.mo1091B().isEmpty()) {
            return false;
        }
        C0312c cVar = new C0312c(new C0315e(this.f898c, this.f899d, this.f1127l, true));
        this.f1123B = cVar;
        ((View) this.f905j).post(cVar);
        return true;
    }

    /* renamed from: a */
    public void mo1399a(boolean z) {
        if (z) {
            super.mo1035k((C0303m) null);
            return;
        }
        C0287e eVar = this.f899d;
        if (eVar != null) {
            eVar.mo1133e(false);
        }
    }

    /* renamed from: b */
    public void mo1027b(C0287e eVar, boolean z) {
        mo1387B();
        super.mo1027b(eVar, z);
    }

    /* renamed from: c */
    public void mo1028c(boolean z) {
        C0298k kVar;
        super.mo1028c(z);
        ((View) this.f905j).requestLayout();
        C0287e eVar = this.f899d;
        boolean z2 = false;
        if (eVar != null) {
            ArrayList<C0291g> u = eVar.mo1160u();
            int size = u.size();
            for (int i = 0; i < size; i++) {
                C5685b a = u.get(i).mo1173a();
                if (a != null) {
                    a.setSubUiVisibilityListener(this);
                }
            }
        }
        C0287e eVar2 = this.f899d;
        ArrayList<C0291g> B = eVar2 != null ? eVar2.mo1091B() : null;
        if (this.f1130o && B != null) {
            int size2 = B.size();
            if (size2 == 1) {
                z2 = !B.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1127l == null) {
                this.f1127l = new C0313d(this.f897b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1127l.getParent();
            if (viewGroup != this.f905j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1127l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f905j;
                actionMenuView.addView(this.f1127l, actionMenuView.mo1414F());
            }
        } else {
            C0313d dVar = this.f1127l;
            if (dVar != null && dVar.getParent() == (kVar = this.f905j)) {
                ((ViewGroup) kVar).removeView(this.f1127l);
            }
        }
        ((ActionMenuView) this.f905j).setOverflowReserved(this.f1130o);
    }

    /* renamed from: d */
    public boolean mo1045d() {
        int i;
        ArrayList<C0291g> arrayList;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        C0287e eVar = actionMenuPresenter.f899d;
        View view = null;
        int i5 = 0;
        if (eVar != null) {
            arrayList = eVar.mo1095G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f1134s;
        int i7 = actionMenuPresenter.f1133r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f905j;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0291g gVar = arrayList.get(i10);
            if (gVar.mo1212o()) {
                i8++;
            } else if (gVar.mo1211n()) {
                i9++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.f1138w && gVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.f1130o && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f1140y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f1136u) {
            int i12 = actionMenuPresenter.f1139x;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0291g gVar2 = arrayList.get(i13);
            if (gVar2.mo1212o()) {
                View q = actionMenuPresenter.mo1040q(gVar2, view, viewGroup);
                if (actionMenuPresenter.f1136u) {
                    i2 -= ActionMenuView.m1659L(q, i3, i2, makeMeasureSpec, i5);
                } else {
                    q.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = q.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.mo1246u(true);
                i4 = i;
            } else if (gVar2.mo1211n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!actionMenuPresenter.f1136u || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View q2 = actionMenuPresenter.mo1040q(gVar2, (View) null, viewGroup);
                    if (actionMenuPresenter.f1136u) {
                        int L = ActionMenuView.m1659L(q2, i3, i2, makeMeasureSpec, 0);
                        i2 -= L;
                        if (L == 0) {
                            z4 = false;
                        }
                    } else {
                        q2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = q2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!actionMenuPresenter.f1136u ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        C0291g gVar3 = arrayList.get(i15);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.mo1209l()) {
                                i11++;
                            }
                            gVar3.mo1246u(false);
                        }
                        i15++;
                    }
                }
                if (z3) {
                    i11--;
                }
                gVar2.mo1246u(z3);
            } else {
                i4 = i;
                gVar2.mo1246u(false);
                i13++;
                view = null;
                actionMenuPresenter = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            actionMenuPresenter = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: h */
    public void mo1033h(Context context, C0287e eVar) {
        super.mo1033h(context, eVar);
        Resources resources = context.getResources();
        C5521a b = C5521a.m24610b(context);
        if (!this.f1131p) {
            this.f1130o = b.mo22011h();
        }
        if (!this.f1137v) {
            this.f1132q = b.mo22006c();
        }
        if (!this.f1135t) {
            this.f1134s = b.mo22007d();
        }
        int i = this.f1132q;
        if (this.f1130o) {
            if (this.f1127l == null) {
                C0313d dVar = new C0313d(this.f897b);
                this.f1127l = dVar;
                if (this.f1129n) {
                    dVar.setImageDrawable(this.f1128m);
                    this.f1128m = null;
                    this.f1129n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1127l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1127l.getMeasuredWidth();
        } else {
            this.f1127l = null;
        }
        this.f1133r = i;
        this.f1139x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: i */
    public void mo1047i(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f1142b) > 0 && (findItem = this.f899d.findItem(i)) != null) {
            mo1035k((C0303m) findItem.getSubMenu());
        }
    }

    /* renamed from: k */
    public boolean mo1035k(C0303m mVar) {
        boolean z = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        C0303m mVar2 = mVar;
        while (mVar2.mo1275i0() != this.f899d) {
            mVar2 = (C0303m) mVar2.mo1275i0();
        }
        View C = m1615C(mVar2.getItem());
        if (C == null) {
            return false;
        }
        this.f1126E = mVar.getItem().getItemId();
        int size = mVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0310a aVar = new C0310a(this.f898c, mVar, C);
        this.f1122A = aVar;
        aVar.mo1261g(z);
        this.f1122A.mo1265k();
        super.mo1035k(mVar);
        return true;
    }

    /* renamed from: l */
    public Parcelable mo1049l() {
        SavedState savedState = new SavedState();
        savedState.f1142b = this.f1126E;
        return savedState;
    }

    /* renamed from: m */
    public void mo1036m(C0291g gVar, C0298k.C0299a aVar) {
        aVar.mo993e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f905j);
        if (this.f1124C == null) {
            this.f1124C = new C0311b();
        }
        actionMenuItemView.setPopupCallback(this.f1124C);
    }

    /* renamed from: o */
    public boolean mo1038o(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1127l) {
            return false;
        }
        return super.mo1038o(viewGroup, i);
    }

    /* renamed from: q */
    public View mo1040q(C0291g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.mo1207j()) {
            actionView = super.mo1040q(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo1434o(layoutParams));
        }
        return actionView;
    }

    /* renamed from: r */
    public C0298k mo1041r(ViewGroup viewGroup) {
        C0298k kVar = this.f905j;
        C0298k r = super.mo1041r(viewGroup);
        if (kVar != r) {
            ((ActionMenuView) r).setPresenter(this);
        }
        return r;
    }

    /* renamed from: t */
    public boolean mo1043t(int i, C0291g gVar) {
        return gVar.mo1209l();
    }
}
