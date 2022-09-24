package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.view.menu.C0298k;
import java.util.ArrayList;
import p073f.C5244g;

/* renamed from: androidx.appcompat.view.menu.c */
/* compiled from: ListMenuPresenter */
public class C0284c implements C0296j, AdapterView.OnItemClickListener {

    /* renamed from: b */
    Context f944b;

    /* renamed from: c */
    LayoutInflater f945c;

    /* renamed from: d */
    C0287e f946d;

    /* renamed from: e */
    ExpandedMenuView f947e;

    /* renamed from: f */
    int f948f;

    /* renamed from: g */
    int f949g;

    /* renamed from: h */
    int f950h;

    /* renamed from: i */
    private C0296j.C0297a f951i;

    /* renamed from: j */
    C0285a f952j;

    /* renamed from: k */
    private int f953k;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    /* compiled from: ListMenuPresenter */
    private class C0285a extends BaseAdapter {

        /* renamed from: b */
        private int f954b = -1;

        public C0285a() {
            mo1074a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1074a() {
            C0291g x = C0284c.this.f946d.mo1163x();
            if (x != null) {
                ArrayList<C0291g> B = C0284c.this.f946d.mo1091B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (B.get(i) == x) {
                        this.f954b = i;
                        return;
                    }
                }
            }
            this.f954b = -1;
        }

        /* renamed from: b */
        public C0291g getItem(int i) {
            ArrayList<C0291g> B = C0284c.this.f946d.mo1091B();
            int i2 = i + C0284c.this.f948f;
            int i3 = this.f954b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return B.get(i2);
        }

        public int getCount() {
            int size = C0284c.this.f946d.mo1091B().size() - C0284c.this.f948f;
            return this.f954b < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0284c cVar = C0284c.this;
                view = cVar.f945c.inflate(cVar.f950h, viewGroup, false);
            }
            ((C0298k.C0299a) view).mo993e(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo1074a();
            super.notifyDataSetChanged();
        }
    }

    public C0284c(Context context, int i) {
        this(i, 0);
        this.f944b = context;
        this.f945c = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter mo1069a() {
        if (this.f952j == null) {
            this.f952j = new C0285a();
        }
        return this.f952j;
    }

    /* renamed from: b */
    public void mo1027b(C0287e eVar, boolean z) {
        C0296j.C0297a aVar = this.f951i;
        if (aVar != null) {
            aVar.mo877b(eVar, z);
        }
    }

    /* renamed from: c */
    public void mo1028c(boolean z) {
        C0285a aVar = this.f952j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public boolean mo1045d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo1029e(C0287e eVar, C0291g gVar) {
        return false;
    }

    /* renamed from: f */
    public boolean mo1030f(C0287e eVar, C0291g gVar) {
        return false;
    }

    /* renamed from: g */
    public void mo1031g(C0296j.C0297a aVar) {
        this.f951i = aVar;
    }

    public int getId() {
        return this.f953k;
    }

    /* renamed from: h */
    public void mo1033h(Context context, C0287e eVar) {
        if (this.f949g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f949g);
            this.f944b = contextThemeWrapper;
            this.f945c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f944b != null) {
            this.f944b = context;
            if (this.f945c == null) {
                this.f945c = LayoutInflater.from(context);
            }
        }
        this.f946d = eVar;
        C0285a aVar = this.f952j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: i */
    public void mo1047i(Parcelable parcelable) {
        mo1071m((Bundle) parcelable);
    }

    /* renamed from: j */
    public C0298k mo1070j(ViewGroup viewGroup) {
        if (this.f947e == null) {
            this.f947e = (ExpandedMenuView) this.f945c.inflate(C5244g.f22948i, viewGroup, false);
            if (this.f952j == null) {
                this.f952j = new C0285a();
            }
            this.f947e.setAdapter(this.f952j);
            this.f947e.setOnItemClickListener(this);
        }
        return this.f947e;
    }

    /* renamed from: k */
    public boolean mo1035k(C0303m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new C0290f(mVar).mo1167d((IBinder) null);
        C0296j.C0297a aVar = this.f951i;
        if (aVar == null) {
            return true;
        }
        aVar.mo878c(mVar);
        return true;
    }

    /* renamed from: l */
    public Parcelable mo1049l() {
        if (this.f947e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo1072n(bundle);
        return bundle;
    }

    /* renamed from: m */
    public void mo1071m(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f947e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: n */
    public void mo1072n(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f947e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f946d.mo1103O(this.f952j.getItem(i), this, 0);
    }

    public C0284c(int i, int i2) {
        this.f950h = i;
        this.f949g = i2;
    }
}
