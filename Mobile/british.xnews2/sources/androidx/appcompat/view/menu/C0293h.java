package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import p103l.C5639e;

/* renamed from: androidx.appcompat.view.menu.h */
/* compiled from: MenuPopup */
abstract class C0293h implements C5639e, C0296j, AdapterView.OnItemClickListener {

    /* renamed from: b */
    private Rect f1025b;

    C0293h() {
    }

    /* renamed from: p */
    protected static int m1498p(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: y */
    protected static boolean m1499y(C0287e eVar) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    protected static C0286d m1500z(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0286d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0286d) listAdapter;
    }

    /* renamed from: e */
    public boolean mo1029e(C0287e eVar, C0291g gVar) {
        return false;
    }

    /* renamed from: f */
    public boolean mo1030f(C0287e eVar, C0291g gVar) {
        return false;
    }

    public int getId() {
        return 0;
    }

    /* renamed from: h */
    public void mo1033h(Context context, C0287e eVar) {
    }

    /* renamed from: m */
    public abstract void mo1050m(C0287e eVar);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo1051n() {
        return true;
    }

    /* renamed from: o */
    public Rect mo1253o() {
        return this.f1025b;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m1500z(listAdapter).f956b.mo1103O((MenuItem) listAdapter.getItem(i), this, mo1051n() ? 0 : 4);
    }

    /* renamed from: q */
    public abstract void mo1054q(View view);

    /* renamed from: r */
    public void mo1255r(Rect rect) {
        this.f1025b = rect;
    }

    /* renamed from: s */
    public abstract void mo1055s(boolean z);

    /* renamed from: t */
    public abstract void mo1057t(int i);

    /* renamed from: u */
    public abstract void mo1058u(int i);

    /* renamed from: v */
    public abstract void mo1059v(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: w */
    public abstract void mo1060w(boolean z);

    /* renamed from: x */
    public abstract void mo1061x(int i);
}
