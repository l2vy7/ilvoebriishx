package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.view.menu.C0298k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.a */
/* compiled from: BaseMenuPresenter */
public abstract class C0277a implements C0296j {

    /* renamed from: b */
    protected Context f897b;

    /* renamed from: c */
    protected Context f898c;

    /* renamed from: d */
    protected C0287e f899d;

    /* renamed from: e */
    protected LayoutInflater f900e;

    /* renamed from: f */
    protected LayoutInflater f901f;

    /* renamed from: g */
    private C0296j.C0297a f902g;

    /* renamed from: h */
    private int f903h;

    /* renamed from: i */
    private int f904i;

    /* renamed from: j */
    protected C0298k f905j;

    /* renamed from: k */
    private int f906k;

    public C0277a(Context context, int i, int i2) {
        this.f897b = context;
        this.f900e = LayoutInflater.from(context);
        this.f903h = i;
        this.f904i = i2;
    }

    /* renamed from: b */
    public void mo1027b(C0287e eVar, boolean z) {
        C0296j.C0297a aVar = this.f902g;
        if (aVar != null) {
            aVar.mo877b(eVar, z);
        }
    }

    /* renamed from: c */
    public void mo1028c(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f905j;
        if (viewGroup != null) {
            C0287e eVar = this.f899d;
            int i = 0;
            if (eVar != null) {
                eVar.mo1159t();
                ArrayList<C0291g> G = this.f899d.mo1095G();
                int size = G.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0291g gVar = G.get(i3);
                    if (mo1043t(i2, gVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0291g itemData = childAt instanceof C0298k.C0299a ? ((C0298k.C0299a) childAt).getItemData() : null;
                        View q = mo1040q(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            q.setPressed(false);
                            q.jumpDrawablesToCurrentState();
                        }
                        if (q != childAt) {
                            mo1034j(q, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo1038o(viewGroup, i)) {
                    i++;
                }
            }
        }
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
        this.f902g = aVar;
    }

    public int getId() {
        return this.f906k;
    }

    /* renamed from: h */
    public void mo1033h(Context context, C0287e eVar) {
        this.f898c = context;
        this.f901f = LayoutInflater.from(context);
        this.f899d = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo1034j(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f905j).addView(view, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1035k(androidx.appcompat.view.menu.C0303m r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.j$a r0 = r1.f902g
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.e r2 = r1.f899d
        L_0x0009:
            boolean r2 = r0.mo878c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0277a.mo1035k(androidx.appcompat.view.menu.m):boolean");
    }

    /* renamed from: m */
    public abstract void mo1036m(C0291g gVar, C0298k.C0299a aVar);

    /* renamed from: n */
    public C0298k.C0299a mo1037n(ViewGroup viewGroup) {
        return (C0298k.C0299a) this.f900e.inflate(this.f904i, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo1038o(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: p */
    public C0296j.C0297a mo1039p() {
        return this.f902g;
    }

    /* renamed from: q */
    public View mo1040q(C0291g gVar, View view, ViewGroup viewGroup) {
        C0298k.C0299a aVar;
        if (view instanceof C0298k.C0299a) {
            aVar = (C0298k.C0299a) view;
        } else {
            aVar = mo1037n(viewGroup);
        }
        mo1036m(gVar, aVar);
        return (View) aVar;
    }

    /* renamed from: r */
    public C0298k mo1041r(ViewGroup viewGroup) {
        if (this.f905j == null) {
            C0298k kVar = (C0298k) this.f900e.inflate(this.f903h, viewGroup, false);
            this.f905j = kVar;
            kVar.mo1013b(this.f899d);
            mo1028c(true);
        }
        return this.f905j;
    }

    /* renamed from: s */
    public void mo1042s(int i) {
        this.f906k = i;
    }

    /* renamed from: t */
    public abstract boolean mo1043t(int i, C0291g gVar);
}
