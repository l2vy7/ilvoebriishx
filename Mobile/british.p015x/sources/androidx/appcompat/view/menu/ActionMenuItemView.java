package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0298k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0390h0;
import androidx.appcompat.widget.C0415s;
import p073f.C5247j;
import p104l.C5639e;

public class ActionMenuItemView extends AppCompatTextView implements C0298k.C0299a, View.OnClickListener, ActionMenuView.C0317a {

    /* renamed from: g */
    C0291g f865g;

    /* renamed from: h */
    private CharSequence f866h;

    /* renamed from: i */
    private Drawable f867i;

    /* renamed from: j */
    C0287e.C0289b f868j;

    /* renamed from: k */
    private C0415s f869k;

    /* renamed from: l */
    C0276b f870l;

    /* renamed from: m */
    private boolean f871m;

    /* renamed from: n */
    private boolean f872n;

    /* renamed from: o */
    private int f873o;

    /* renamed from: p */
    private int f874p;

    /* renamed from: q */
    private int f875q;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0275a extends C0415s {
        public C0275a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C5639e mo1009b() {
            C0276b bVar = ActionMenuItemView.this.f870l;
            if (bVar != null) {
                return bVar.mo1011a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo1010c() {
            C5639e b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0287e.C0289b bVar = actionMenuItemView.f868j;
            if (bVar == null || !bVar.mo1012a(actionMenuItemView.f865g) || (b = mo1009b()) == null || !b.mo1044a()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0276b {
        /* renamed from: a */
        public abstract C5639e mo1011a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: g */
    private boolean m1319g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: h */
    private void m1320h() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f866h);
        if (this.f867i != null && (!this.f865g.mo1172B() || (!this.f871m && !this.f872n))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f866h : null);
        CharSequence contentDescription = this.f865g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f865g.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f865g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f865g.getTitle();
            }
            C0390h0.m2064a(this, charSequence2);
            return;
        }
        C0390h0.m2064a(this, tooltipText);
    }

    /* renamed from: a */
    public boolean mo990a() {
        return mo994f();
    }

    /* renamed from: b */
    public boolean mo991b() {
        return mo994f() && this.f865g.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo992d() {
        return true;
    }

    /* renamed from: e */
    public void mo993e(C0291g gVar, int i) {
        this.f865g = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.mo1201i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f869k == null) {
            this.f869k = new C0275a();
        }
    }

    /* renamed from: f */
    public boolean mo994f() {
        return !TextUtils.isEmpty(getText());
    }

    public C0291g getItemData() {
        return this.f865g;
    }

    public void onClick(View view) {
        C0287e.C0289b bVar = this.f868j;
        if (bVar != null) {
            bVar.mo1012a(this.f865g);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f871m = m1319g();
        m1320h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean f = mo994f();
        if (f && (i4 = this.f874p) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f873o);
        } else {
            i3 = this.f873o;
        }
        if (mode != 1073741824 && this.f873o > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!f && this.f867i != null) {
            super.setPadding((getMeasuredWidth() - this.f867i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0415s sVar;
        if (!this.f865g.hasSubMenu() || (sVar = this.f869k) == null || !sVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f872n != z) {
            this.f872n = z;
            C0291g gVar = this.f865g;
            if (gVar != null) {
                gVar.mo1175c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f867i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f875q;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m1320h();
    }

    public void setItemInvoker(C0287e.C0289b bVar) {
        this.f868j = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f874p = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0276b bVar) {
        this.f870l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f866h = charSequence;
        m1320h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f871m = m1319g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5247j.f23216v, i, 0);
        this.f873o = obtainStyledAttributes.getDimensionPixelSize(C5247j.f23221w, 0);
        obtainStyledAttributes.recycle();
        this.f875q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f874p = -1;
        setSaveEnabled(false);
    }
}
