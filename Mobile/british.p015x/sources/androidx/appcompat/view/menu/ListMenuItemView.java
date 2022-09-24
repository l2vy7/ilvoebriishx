package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0298k;
import androidx.appcompat.widget.C0384f0;
import p073f.C5238a;
import p073f.C5243f;
import p073f.C5244g;
import p073f.C5247j;
import p111m0.C5723u;

public class ListMenuItemView extends LinearLayout implements C0298k.C0299a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    private C0291g f880b;

    /* renamed from: c */
    private ImageView f881c;

    /* renamed from: d */
    private RadioButton f882d;

    /* renamed from: e */
    private TextView f883e;

    /* renamed from: f */
    private CheckBox f884f;

    /* renamed from: g */
    private TextView f885g;

    /* renamed from: h */
    private ImageView f886h;

    /* renamed from: i */
    private ImageView f887i;

    /* renamed from: j */
    private LinearLayout f888j;

    /* renamed from: k */
    private Drawable f889k;

    /* renamed from: l */
    private int f890l;

    /* renamed from: m */
    private Context f891m;

    /* renamed from: n */
    private boolean f892n;

    /* renamed from: o */
    private Drawable f893o;

    /* renamed from: p */
    private boolean f894p;

    /* renamed from: q */
    private LayoutInflater f895q;

    /* renamed from: r */
    private boolean f896r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22792F);
    }

    /* renamed from: a */
    private void m1331a(View view) {
        m1332b(view, -1);
    }

    /* renamed from: b */
    private void m1332b(View view, int i) {
        LinearLayout linearLayout = this.f888j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m1333c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C5244g.f22949j, this, false);
        this.f884f = checkBox;
        m1331a(checkBox);
    }

    /* renamed from: f */
    private void m1334f() {
        ImageView imageView = (ImageView) getInflater().inflate(C5244g.f22950k, this, false);
        this.f881c = imageView;
        m1332b(imageView, 0);
    }

    /* renamed from: g */
    private void m1335g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C5244g.f22952m, this, false);
        this.f882d = radioButton;
        m1331a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f895q == null) {
            this.f895q = LayoutInflater.from(getContext());
        }
        return this.f895q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f886h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f887i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f887i.getLayoutParams();
            rect.top += this.f887i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: d */
    public boolean mo992d() {
        return false;
    }

    /* renamed from: e */
    public void mo993e(C0291g gVar, int i) {
        this.f880b = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.mo1201i(this));
        setCheckable(gVar.isCheckable());
        mo1018h(gVar.mo1171A(), gVar.mo1179g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public C0291g getItemData() {
        return this.f880b;
    }

    /* renamed from: h */
    public void mo1018h(boolean z, char c) {
        int i = (!z || !this.f880b.mo1171A()) ? 8 : 0;
        if (i == 0) {
            this.f885g.setText(this.f880b.mo1199h());
        }
        if (this.f885g.getVisibility() != i) {
            this.f885g.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C5723u.m25336r0(this, this.f889k);
        TextView textView = (TextView) findViewById(C5243f.f22910S);
        this.f883e = textView;
        int i = this.f890l;
        if (i != -1) {
            textView.setTextAppearance(this.f891m, i);
        }
        this.f885g = (TextView) findViewById(C5243f.f22903L);
        ImageView imageView = (ImageView) findViewById(C5243f.f22906O);
        this.f886h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f893o);
        }
        this.f887i = (ImageView) findViewById(C5243f.f22934u);
        this.f888j = (LinearLayout) findViewById(C5243f.f22926m);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f881c != null && this.f892n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f881c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f882d != null || this.f884f != null) {
            if (this.f880b.mo1210m()) {
                if (this.f882d == null) {
                    m1335g();
                }
                compoundButton2 = this.f882d;
                compoundButton = this.f884f;
            } else {
                if (this.f884f == null) {
                    m1333c();
                }
                compoundButton2 = this.f884f;
                compoundButton = this.f882d;
            }
            if (z) {
                compoundButton2.setChecked(this.f880b.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f884f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f882d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f880b.mo1210m()) {
            if (this.f882d == null) {
                m1335g();
            }
            compoundButton = this.f882d;
        } else {
            if (this.f884f == null) {
                m1333c();
            }
            compoundButton = this.f884f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f896r = z;
        this.f892n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f887i;
        if (imageView != null) {
            imageView.setVisibility((this.f894p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f880b.mo1251z() || this.f896r;
        if (z || this.f892n) {
            ImageView imageView = this.f881c;
            if (imageView != null || drawable != null || this.f892n) {
                if (imageView == null) {
                    m1334f();
                }
                if (drawable != null || this.f892n) {
                    ImageView imageView2 = this.f881c;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f881c.getVisibility() != 0) {
                        this.f881c.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f881c.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f883e.setText(charSequence);
            if (this.f883e.getVisibility() != 0) {
                this.f883e.setVisibility(0);
            }
        } else if (this.f883e.getVisibility() != 8) {
            this.f883e.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0384f0 v = C0384f0.m1994v(getContext(), attributeSet, C5247j.f23102Y1, i, 0);
        this.f889k = v.mo2101g(C5247j.f23113a2);
        this.f890l = v.mo2108n(C5247j.f23107Z1, -1);
        this.f892n = v.mo2095a(C5247j.f23119b2, false);
        this.f891m = context;
        this.f893o = v.mo2101g(C5247j.f23124c2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C5238a.f22788B, 0);
        this.f894p = obtainStyledAttributes.hasValue(0);
        v.mo2114w();
        obtainStyledAttributes.recycle();
    }
}
