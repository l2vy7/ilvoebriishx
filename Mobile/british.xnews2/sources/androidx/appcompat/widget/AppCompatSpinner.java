package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0252a;
import p072f.C5238a;
import p078g.C5264a;
import p103l.C5639e;
import p110m0.C5722t;
import p110m0.C5723u;

public class AppCompatSpinner extends Spinner implements C5722t {

    /* renamed from: j */
    private static final int[] f1230j = {16843505};

    /* renamed from: b */
    private final C0378d f1231b;

    /* renamed from: c */
    private final Context f1232c;

    /* renamed from: d */
    private C0415s f1233d;

    /* renamed from: e */
    private SpinnerAdapter f1234e;

    /* renamed from: f */
    private final boolean f1235f;

    /* renamed from: g */
    private C0337f f1236g;

    /* renamed from: h */
    int f1237h;

    /* renamed from: i */
    final Rect f1238i;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0328a();

        /* renamed from: b */
        boolean f1239b;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        class C0328a implements Parcelable.Creator<SavedState> {
            C0328a() {
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1239b ? (byte) 1 : 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1239b = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    class C0329a extends C0415s {

        /* renamed from: k */
        final /* synthetic */ C0333e f1240k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0329a(View view, C0333e eVar) {
            super(view);
            this.f1240k = eVar;
        }

        /* renamed from: b */
        public C5639e mo1009b() {
            return this.f1240k;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo1010c() {
            if (AppCompatSpinner.this.getInternalPopup().mo1618a()) {
                return true;
            }
            AppCompatSpinner.this.mo1587b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    class C0330b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0330b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo1618a()) {
                AppCompatSpinner.this.mo1587b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    class C0331c implements C0337f, DialogInterface.OnClickListener {

        /* renamed from: b */
        C0252a f1243b;

        /* renamed from: c */
        private ListAdapter f1244c;

        /* renamed from: d */
        private CharSequence f1245d;

        C0331c() {
        }

        /* renamed from: a */
        public boolean mo1618a() {
            C0252a aVar = this.f1243b;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        /* renamed from: b */
        public void mo1619b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: c */
        public int mo1620c() {
            return 0;
        }

        public void dismiss() {
            C0252a aVar = this.f1243b;
            if (aVar != null) {
                aVar.dismiss();
                this.f1243b = null;
            }
        }

        /* renamed from: e */
        public void mo1622e(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: f */
        public CharSequence mo1623f() {
            return this.f1245d;
        }

        /* renamed from: h */
        public Drawable mo1624h() {
            return null;
        }

        /* renamed from: i */
        public void mo1625i(CharSequence charSequence) {
            this.f1245d = charSequence;
        }

        /* renamed from: k */
        public void mo1626k(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: l */
        public void mo1627l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: m */
        public void mo1628m(int i, int i2) {
            if (this.f1244c != null) {
                C0252a.C0253a aVar = new C0252a.C0253a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f1245d;
                if (charSequence != null) {
                    aVar.setTitle(charSequence);
                }
                C0252a create = aVar.mo913e(this.f1244c, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
                this.f1243b = create;
                ListView f = create.mo903f();
                if (Build.VERSION.SDK_INT >= 17) {
                    f.setTextDirection(i);
                    f.setTextAlignment(i2);
                }
                this.f1243b.show();
            }
        }

        /* renamed from: n */
        public int mo1629n() {
            return 0;
        }

        /* renamed from: o */
        public void mo1630o(ListAdapter listAdapter) {
            this.f1244c = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i, this.f1244c.getItemId(i));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    private static class C0332d implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        private SpinnerAdapter f1247b;

        /* renamed from: c */
        private ListAdapter f1248c;

        public C0332d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1247b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1248c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0375b0) {
                C0375b0 b0Var = (C0375b0) spinnerAdapter;
                if (b0Var.getDropDownViewTheme() == null) {
                    b0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1248c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1247b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1247b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1247b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1247b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1247b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1248c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1247b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1247b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    class C0333e extends ListPopupWindow implements C0337f {

        /* renamed from: K */
        private CharSequence f1249K;

        /* renamed from: L */
        ListAdapter f1250L;

        /* renamed from: M */
        private final Rect f1251M = new Rect();

        /* renamed from: N */
        private int f1252N;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        class C0334a implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ AppCompatSpinner f1254b;

            C0334a(AppCompatSpinner appCompatSpinner) {
                this.f1254b = appCompatSpinner;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0333e eVar = C0333e.this;
                    AppCompatSpinner.this.performItemClick(view, i, eVar.f1250L.getItemId(i));
                }
                C0333e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        class C0335b implements ViewTreeObserver.OnGlobalLayoutListener {
            C0335b() {
            }

            public void onGlobalLayout() {
                C0333e eVar = C0333e.this;
                if (!eVar.mo1647T(AppCompatSpinner.this)) {
                    C0333e.this.dismiss();
                    return;
                }
                C0333e.this.mo1645R();
                C0333e.super.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        class C0336c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1257b;

            C0336c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1257b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1257b);
                }
            }
        }

        public C0333e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo1751C(AppCompatSpinner.this);
            mo1757I(true);
            mo1761N(0);
            mo1759K(new C0334a(AppCompatSpinner.this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: R */
        public void mo1645R() {
            int i;
            int i2;
            Drawable h = mo1767h();
            int i3 = 0;
            if (h != null) {
                h.getPadding(AppCompatSpinner.this.f1238i);
                if (C0401l0.m2125b(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.f1238i.right;
                } else {
                    i2 = -AppCompatSpinner.this.f1238i.left;
                }
                i3 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.f1238i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i4 = appCompatSpinner.f1237h;
            if (i4 == -2) {
                int a = appCompatSpinner.mo1586a((SpinnerAdapter) this.f1250L, mo1767h());
                int i5 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1238i;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a > i6) {
                    a = i6;
                }
                mo1753E(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                mo1753E((width - paddingLeft) - paddingRight);
            } else {
                mo1753E(i4);
            }
            if (C0401l0.m2125b(AppCompatSpinner.this)) {
                i = i3 + (((width - paddingRight) - mo1777y()) - mo1646S());
            } else {
                i = i3 + paddingLeft + mo1646S();
            }
            mo1766e(i);
        }

        /* renamed from: S */
        public int mo1646S() {
            return this.f1252N;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: T */
        public boolean mo1647T(View view) {
            return C5723u.m25293S(view) && view.getGlobalVisibleRect(this.f1251M);
        }

        /* renamed from: f */
        public CharSequence mo1623f() {
            return this.f1249K;
        }

        /* renamed from: i */
        public void mo1625i(CharSequence charSequence) {
            this.f1249K = charSequence;
        }

        /* renamed from: l */
        public void mo1627l(int i) {
            this.f1252N = i;
        }

        /* renamed from: m */
        public void mo1628m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a = mo1044a();
            mo1645R();
            mo1756H(2);
            super.show();
            ListView j = mo1048j();
            j.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                j.setTextDirection(i);
                j.setTextAlignment(i2);
            }
            mo1762O(AppCompatSpinner.this.getSelectedItemPosition());
            if (!a && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                C0335b bVar = new C0335b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo1758J(new C0336c(bVar));
            }
        }

        /* renamed from: o */
        public void mo1630o(ListAdapter listAdapter) {
            super.mo1630o(listAdapter);
            this.f1250L = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    interface C0337f {
        /* renamed from: a */
        boolean mo1618a();

        /* renamed from: b */
        void mo1619b(Drawable drawable);

        /* renamed from: c */
        int mo1620c();

        void dismiss();

        /* renamed from: e */
        void mo1622e(int i);

        /* renamed from: f */
        CharSequence mo1623f();

        /* renamed from: h */
        Drawable mo1624h();

        /* renamed from: i */
        void mo1625i(CharSequence charSequence);

        /* renamed from: k */
        void mo1626k(int i);

        /* renamed from: l */
        void mo1627l(int i);

        /* renamed from: m */
        void mo1628m(int i, int i2);

        /* renamed from: n */
        int mo1629n();

        /* renamed from: o */
        void mo1630o(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22800N);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1586a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1238i);
        Rect rect = this.f1238i;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1587b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1236g.mo1628m(getTextDirection(), getTextAlignment());
        } else {
            this.f1236g.mo1628m(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0378d dVar = this.f1231b;
        if (dVar != null) {
            dVar.mo2067b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0337f fVar = this.f1236g;
        if (fVar != null) {
            return fVar.mo1620c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0337f fVar = this.f1236g;
        if (fVar != null) {
            return fVar.mo1629n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1236g != null) {
            return this.f1237h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final C0337f getInternalPopup() {
        return this.f1236g;
    }

    public Drawable getPopupBackground() {
        C0337f fVar = this.f1236g;
        if (fVar != null) {
            return fVar.mo1624h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1232c;
    }

    public CharSequence getPrompt() {
        C0337f fVar = this.f1236g;
        return fVar != null ? fVar.mo1623f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0378d dVar = this.f1231b;
        if (dVar != null) {
            return dVar.mo2068c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0378d dVar = this.f1231b;
        if (dVar != null) {
            return dVar.mo2069d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0337f fVar = this.f1236g;
        if (fVar != null && fVar.mo1618a()) {
            this.f1236g.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1236g != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1586a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f1239b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0330b());
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0337f fVar = this.f1236g;
        savedState.f1239b = fVar != null && fVar.mo1618a();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0415s sVar = this.f1233d;
        if (sVar == null || !sVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0337f fVar = this.f1236g;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.mo1618a()) {
            return true;
        }
        mo1587b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378d dVar = this.f1231b;
        if (dVar != null) {
            dVar.mo2071f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378d dVar = this.f1231b;
        if (dVar != null) {
            dVar.mo2072g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0337f fVar = this.f1236g;
        if (fVar != null) {
            fVar.mo1627l(i);
            this.f1236g.mo1622e(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0337f fVar = this.f1236g;
        if (fVar != null) {
            fVar.mo1626k(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1236g != null) {
            this.f1237h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0337f fVar = this.f1236g;
        if (fVar != null) {
            fVar.mo1619b(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C5264a.m23789d(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0337f fVar = this.f1236g;
        if (fVar != null) {
            fVar.mo1625i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0378d dVar = this.f1231b;
        if (dVar != null) {
            dVar.mo2074i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0378d dVar = this.f1231b;
        if (dVar != null) {
            dVar.mo2075j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1235f) {
            this.f1234e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1236g != null) {
            Context context = this.f1232c;
            if (context == null) {
                context = getContext();
            }
            this.f1236g.mo1630o(new C0332d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1238i = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.C0373a0.m1942a(r6, r0)
            int[] r0 = p072f.C5247j.f22993C2
            r1 = 0
            androidx.appcompat.widget.f0 r0 = androidx.appcompat.widget.C0384f0.m1994v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r6)
            r6.f1231b = r2
            if (r11 == 0) goto L_0x0029
            k.d r2 = new k.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f1232c = r2
            goto L_0x003b
        L_0x0029:
            int r11 = p072f.C5247j.f23018H2
            int r11 = r0.mo2108n(r11, r1)
            if (r11 == 0) goto L_0x0039
            k.d r2 = new k.d
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.f1232c = r2
            goto L_0x003b
        L_0x0039:
            r6.f1232c = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006b
            int[] r11 = f1230j     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x004f
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
        L_0x004f:
            r11.recycle()
            goto L_0x006b
        L_0x0053:
            r3 = move-exception
            goto L_0x0059
        L_0x0055:
            r7 = move-exception
            goto L_0x0065
        L_0x0057:
            r3 = move-exception
            r11 = r2
        L_0x0059:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x006b
            goto L_0x004f
        L_0x0063:
            r7 = move-exception
            r2 = r11
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.recycle()
        L_0x006a:
            throw r7
        L_0x006b:
            r11 = 1
            if (r10 == 0) goto L_0x00a8
            if (r10 == r11) goto L_0x0071
            goto L_0x00b8
        L_0x0071:
            androidx.appcompat.widget.AppCompatSpinner$e r10 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r3 = r6.f1232c
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1232c
            int[] r4 = p072f.C5247j.f22993C2
            androidx.appcompat.widget.f0 r1 = androidx.appcompat.widget.C0384f0.m1994v(r3, r8, r4, r9, r1)
            int r3 = p072f.C5247j.f23013G2
            r4 = -2
            int r3 = r1.mo2107m(r3, r4)
            r6.f1237h = r3
            int r3 = p072f.C5247j.f23003E2
            android.graphics.drawable.Drawable r3 = r1.mo2101g(r3)
            r10.mo1764b(r3)
            int r3 = p072f.C5247j.f23008F2
            java.lang.String r3 = r0.mo2109o(r3)
            r10.mo1625i(r3)
            r1.mo2114w()
            r6.f1236g = r10
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r6, r10)
            r6.f1233d = r1
            goto L_0x00b8
        L_0x00a8:
            androidx.appcompat.widget.AppCompatSpinner$c r10 = new androidx.appcompat.widget.AppCompatSpinner$c
            r10.<init>()
            r6.f1236g = r10
            int r1 = p072f.C5247j.f23008F2
            java.lang.String r1 = r0.mo2109o(r1)
            r10.mo1625i(r1)
        L_0x00b8:
            int r10 = p072f.C5247j.f22998D2
            java.lang.CharSequence[] r10 = r0.mo2111q(r10)
            if (r10 == 0) goto L_0x00d0
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p072f.C5244g.f22961v
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d0:
            r0.mo2114w()
            r6.f1235f = r11
            android.widget.SpinnerAdapter r7 = r6.f1234e
            if (r7 == 0) goto L_0x00de
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1234e = r2
        L_0x00de:
            androidx.appcompat.widget.d r7 = r6.f1231b
            r7.mo2070e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
