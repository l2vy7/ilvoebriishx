package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0298k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
/* compiled from: MenuAdapter */
public class C0286d extends BaseAdapter {

    /* renamed from: b */
    C0287e f956b;

    /* renamed from: c */
    private int f957c = -1;

    /* renamed from: d */
    private boolean f958d;

    /* renamed from: e */
    private final boolean f959e;

    /* renamed from: f */
    private final LayoutInflater f960f;

    /* renamed from: g */
    private final int f961g;

    public C0286d(C0287e eVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f959e = z;
        this.f960f = layoutInflater;
        this.f956b = eVar;
        this.f961g = i;
        mo1081a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1081a() {
        C0291g x = this.f956b.mo1163x();
        if (x != null) {
            ArrayList<C0291g> B = this.f956b.mo1091B();
            int size = B.size();
            for (int i = 0; i < size; i++) {
                if (B.get(i) == x) {
                    this.f957c = i;
                    return;
                }
            }
        }
        this.f957c = -1;
    }

    /* renamed from: b */
    public C0287e mo1082b() {
        return this.f956b;
    }

    /* renamed from: c */
    public C0291g getItem(int i) {
        ArrayList<C0291g> B = this.f959e ? this.f956b.mo1091B() : this.f956b.mo1095G();
        int i2 = this.f957c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return B.get(i);
    }

    /* renamed from: d */
    public void mo1084d(boolean z) {
        this.f958d = z;
    }

    public int getCount() {
        ArrayList<C0291g> B = this.f959e ? this.f956b.mo1091B() : this.f956b.mo1095G();
        if (this.f957c < 0) {
            return B.size();
        }
        return B.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f960f.inflate(this.f961g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f956b.mo1096H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0298k.C0299a aVar = (C0298k.C0299a) view;
        if (this.f958d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo993e(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo1081a();
        super.notifyDataSetChanged();
    }
}
