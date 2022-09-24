package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.widget.C0384f0;

public final class ExpandedMenuView extends ListView implements C0287e.C0289b, C0298k, AdapterView.OnItemClickListener {

    /* renamed from: d */
    private static final int[] f877d = {16842964, 16843049};

    /* renamed from: b */
    private C0287e f878b;

    /* renamed from: c */
    private int f879c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: a */
    public boolean mo1012a(C0291g gVar) {
        return this.f878b.mo1102N(gVar, 0);
    }

    /* renamed from: b */
    public void mo1013b(C0287e eVar) {
        this.f878b = eVar;
    }

    public int getWindowAnimations() {
        return this.f879c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1012a((C0291g) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0384f0 v = C0384f0.m1994v(context, attributeSet, f877d, i, 0);
        if (v.mo2113s(0)) {
            setBackgroundDrawable(v.mo2101g(0));
        }
        if (v.mo2113s(1)) {
            setDivider(v.mo2101g(1));
        }
        v.mo2114w();
    }
}
