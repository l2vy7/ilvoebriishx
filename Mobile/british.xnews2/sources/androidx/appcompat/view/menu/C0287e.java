package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0600b;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p073f0.C5248a;
import p110m0.C5685b;
import p110m0.C5737v;

/* renamed from: androidx.appcompat.view.menu.e */
/* compiled from: MenuBuilder */
public class C0287e implements C5248a {

    /* renamed from: A */
    private static final int[] f962A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f963a;

    /* renamed from: b */
    private final Resources f964b;

    /* renamed from: c */
    private boolean f965c;

    /* renamed from: d */
    private boolean f966d;

    /* renamed from: e */
    private C0288a f967e;

    /* renamed from: f */
    private ArrayList<C0291g> f968f;

    /* renamed from: g */
    private ArrayList<C0291g> f969g;

    /* renamed from: h */
    private boolean f970h;

    /* renamed from: i */
    private ArrayList<C0291g> f971i;

    /* renamed from: j */
    private ArrayList<C0291g> f972j;

    /* renamed from: k */
    private boolean f973k;

    /* renamed from: l */
    private int f974l = 0;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f975m;

    /* renamed from: n */
    CharSequence f976n;

    /* renamed from: o */
    Drawable f977o;

    /* renamed from: p */
    View f978p;

    /* renamed from: q */
    private boolean f979q = false;

    /* renamed from: r */
    private boolean f980r = false;

    /* renamed from: s */
    private boolean f981s = false;

    /* renamed from: t */
    private boolean f982t = false;

    /* renamed from: u */
    private boolean f983u = false;

    /* renamed from: v */
    private ArrayList<C0291g> f984v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<C0296j>> f985w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0291g f986x;

    /* renamed from: y */
    private boolean f987y = false;

    /* renamed from: z */
    private boolean f988z;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* compiled from: MenuBuilder */
    public interface C0288a {
        /* renamed from: a */
        boolean mo821a(C0287e eVar, MenuItem menuItem);

        /* renamed from: b */
        void mo822b(C0287e eVar);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* compiled from: MenuBuilder */
    public interface C0289b {
        /* renamed from: a */
        boolean mo1012a(C0291g gVar);
    }

    public C0287e(Context context) {
        this.f963a = context;
        this.f964b = context.getResources();
        this.f968f = new ArrayList<>();
        this.f969g = new ArrayList<>();
        this.f970h = true;
        this.f971i = new ArrayList<>();
        this.f972j = new ArrayList<>();
        this.f973k = true;
        m1406f0(true);
    }

    /* renamed from: D */
    private static int m1403D(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f962A;
            if (i2 < iArr.length) {
                return (i & RtpPacket.MAX_SEQUENCE_NUMBER) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: P */
    private void m1404P(int i, boolean z) {
        if (i >= 0 && i < this.f968f.size()) {
            this.f968f.remove(i);
            if (z) {
                mo1101M(true);
            }
        }
    }

    /* renamed from: a0 */
    private void m1405a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources E = mo1093E();
        if (view != null) {
            this.f978p = view;
            this.f976n = null;
            this.f977o = null;
        } else {
            if (i > 0) {
                this.f976n = E.getText(i);
            } else if (charSequence != null) {
                this.f976n = charSequence;
            }
            if (i2 > 0) {
                this.f977o = C0600b.m3294f(mo1162w(), i2);
            } else if (drawable != null) {
                this.f977o = drawable;
            }
            this.f978p = null;
        }
        mo1101M(false);
    }

    /* renamed from: f0 */
    private void m1406f0(boolean z) {
        boolean z2 = true;
        if (!z || this.f964b.getConfiguration().keyboard == 1 || !C5737v.m25405e(ViewConfiguration.get(this.f963a), this.f963a)) {
            z2 = false;
        }
        this.f966d = z2;
    }

    /* renamed from: g */
    private C0291g m1407g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0291g(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m1408i(boolean z) {
        if (!this.f985w.isEmpty()) {
            mo1140h0();
            Iterator<WeakReference<C0296j>> it = this.f985w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0296j jVar = (C0296j) next.get();
                if (jVar == null) {
                    this.f985w.remove(next);
                } else {
                    jVar.mo1028c(z);
                }
            }
            mo1137g0();
        }
    }

    /* renamed from: j */
    private void m1409j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f985w.isEmpty()) {
            Iterator<WeakReference<C0296j>> it = this.f985w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0296j jVar = (C0296j) next.get();
                if (jVar == null) {
                    this.f985w.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        jVar.mo1047i(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private void m1410k(Bundle bundle) {
        Parcelable l;
        if (!this.f985w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C0296j>> it = this.f985w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0296j jVar = (C0296j) next.get();
                if (jVar == null) {
                    this.f985w.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (l = jVar.mo1049l()) != null) {
                        sparseArray.put(id, l);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: l */
    private boolean m1411l(C0303m mVar, C0296j jVar) {
        boolean z = false;
        if (this.f985w.isEmpty()) {
            return false;
        }
        if (jVar != null) {
            z = jVar.mo1035k(mVar);
        }
        Iterator<WeakReference<C0296j>> it = this.f985w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0296j jVar2 = (C0296j) next.get();
            if (jVar2 == null) {
                this.f985w.remove(next);
            } else if (!z) {
                z = jVar2.mo1035k(mVar);
            }
        }
        return z;
    }

    /* renamed from: p */
    private static int m1412p(ArrayList<C0291g> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo1178f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View mo1090A() {
        return this.f978p;
    }

    /* renamed from: B */
    public ArrayList<C0291g> mo1091B() {
        mo1159t();
        return this.f972j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo1092C() {
        return this.f982t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public Resources mo1093E() {
        return this.f964b;
    }

    /* renamed from: F */
    public C0287e mo1094F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList<C0291g> mo1095G() {
        if (!this.f970h) {
            return this.f969g;
        }
        this.f969g.clear();
        int size = this.f968f.size();
        for (int i = 0; i < size; i++) {
            C0291g gVar = this.f968f.get(i);
            if (gVar.isVisible()) {
                this.f969g.add(gVar);
            }
        }
        this.f970h = false;
        this.f973k = true;
        return this.f969g;
    }

    /* renamed from: H */
    public boolean mo1096H() {
        return this.f987y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo1097I() {
        return this.f965c;
    }

    /* renamed from: J */
    public boolean mo1098J() {
        return this.f966d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo1099K(C0291g gVar) {
        this.f973k = true;
        mo1101M(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo1100L(C0291g gVar) {
        this.f970h = true;
        mo1101M(true);
    }

    /* renamed from: M */
    public void mo1101M(boolean z) {
        if (!this.f979q) {
            if (z) {
                this.f970h = true;
                this.f973k = true;
            }
            m1408i(z);
            return;
        }
        this.f980r = true;
        if (z) {
            this.f981s = true;
        }
    }

    /* renamed from: N */
    public boolean mo1102N(MenuItem menuItem, int i) {
        return mo1103O(menuItem, (C0296j) null, i);
    }

    /* renamed from: O */
    public boolean mo1103O(MenuItem menuItem, C0296j jVar, int i) {
        C0291g gVar = (C0291g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k = gVar.mo1208k();
        C5685b a = gVar.mo1173a();
        boolean z = a != null && a.hasSubMenu();
        if (gVar.mo1207j()) {
            k |= gVar.expandActionView();
            if (k) {
                mo1133e(true);
            }
        } else if (gVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo1133e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.mo1249x(new C0303m(mo1162w(), this, gVar));
            }
            C0303m mVar = (C0303m) gVar.getSubMenu();
            if (z) {
                a.onPrepareSubMenu(mVar);
            }
            k |= m1411l(mVar, jVar);
            if (!k) {
                mo1133e(true);
            }
        } else if ((i & 1) == 0) {
            mo1133e(true);
        }
        return k;
    }

    /* renamed from: Q */
    public void mo1104Q(C0296j jVar) {
        Iterator<WeakReference<C0296j>> it = this.f985w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0296j jVar2 = (C0296j) next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f985w.remove(next);
            }
        }
    }

    /* renamed from: R */
    public void mo1105R(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo1161v());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0303m) item.getSubMenu()).mo1105R(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: S */
    public void mo1106S(Bundle bundle) {
        m1409j(bundle);
    }

    /* renamed from: T */
    public void mo1107T(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0303m) item.getSubMenu()).mo1107T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1161v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void mo1108U(Bundle bundle) {
        m1410k(bundle);
    }

    /* renamed from: V */
    public void mo1109V(C0288a aVar) {
        this.f967e = aVar;
    }

    /* renamed from: W */
    public C0287e mo1110W(int i) {
        this.f974l = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo1111X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f968f.size();
        mo1140h0();
        for (int i = 0; i < size; i++) {
            C0291g gVar = this.f968f.get(i);
            if (gVar.getGroupId() == groupId && gVar.mo1210m() && gVar.isCheckable()) {
                gVar.mo1216s(gVar == menuItem);
            }
        }
        mo1137g0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public C0287e mo1112Y(int i) {
        m1405a0(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public C0287e mo1113Z(Drawable drawable) {
        m1405a0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo1114a(int i, int i2, int i3, CharSequence charSequence) {
        int D = m1403D(i3);
        C0291g g = m1407g(i, i2, i3, D, charSequence, this.f974l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f975m;
        if (contextMenuInfo != null) {
            g.mo1247v(contextMenuInfo);
        }
        ArrayList<C0291g> arrayList = this.f968f;
        arrayList.add(m1412p(arrayList, D), g);
        mo1101M(true);
        return g;
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1114a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f963a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo1124b(C0296j jVar) {
        mo1126c(jVar, this.f963a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public C0287e mo1125b0(int i) {
        m1405a0(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: c */
    public void mo1126c(C0296j jVar, Context context) {
        this.f985w.add(new WeakReference(jVar));
        jVar.mo1033h(context, this);
        this.f973k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public C0287e mo1127c0(CharSequence charSequence) {
        m1405a0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public void clear() {
        C0291g gVar = this.f986x;
        if (gVar != null) {
            mo1135f(gVar);
        }
        this.f968f.clear();
        mo1101M(true);
    }

    public void clearHeader() {
        this.f977o = null;
        this.f976n = null;
        this.f978p = null;
        mo1101M(false);
    }

    public void close() {
        mo1133e(true);
    }

    /* renamed from: d */
    public void mo1131d() {
        C0288a aVar = this.f967e;
        if (aVar != null) {
            aVar.mo822b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public C0287e mo1132d0(View view) {
        m1405a0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* renamed from: e */
    public final void mo1133e(boolean z) {
        if (!this.f983u) {
            this.f983u = true;
            Iterator<WeakReference<C0296j>> it = this.f985w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0296j jVar = (C0296j) next.get();
                if (jVar == null) {
                    this.f985w.remove(next);
                } else {
                    jVar.mo1027b(this, z);
                }
            }
            this.f983u = false;
        }
    }

    /* renamed from: e0 */
    public void mo1134e0(boolean z) {
        this.f988z = z;
    }

    /* renamed from: f */
    public boolean mo1135f(C0291g gVar) {
        boolean z = false;
        if (!this.f985w.isEmpty() && this.f986x == gVar) {
            mo1140h0();
            Iterator<WeakReference<C0296j>> it = this.f985w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0296j jVar = (C0296j) next.get();
                if (jVar == null) {
                    this.f985w.remove(next);
                } else {
                    z = jVar.mo1029e(this, gVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1137g0();
            if (z) {
                this.f986x = null;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0291g gVar = this.f968f.get(i2);
            if (gVar.getItemId() == i) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public void mo1137g0() {
        this.f979q = false;
        if (this.f980r) {
            this.f980r = false;
            mo1101M(this.f981s);
        }
    }

    public MenuItem getItem(int i) {
        return this.f968f.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1139h(C0287e eVar, MenuItem menuItem) {
        C0288a aVar = this.f967e;
        return aVar != null && aVar.mo821a(eVar, menuItem);
    }

    /* renamed from: h0 */
    public void mo1140h0() {
        if (!this.f979q) {
            this.f979q = true;
            this.f980r = false;
            this.f981s = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.f988z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f968f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo1149r(i, keyEvent) != null;
    }

    /* renamed from: m */
    public boolean mo1143m(C0291g gVar) {
        boolean z = false;
        if (this.f985w.isEmpty()) {
            return false;
        }
        mo1140h0();
        Iterator<WeakReference<C0296j>> it = this.f985w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0296j jVar = (C0296j) next.get();
            if (jVar == null) {
                this.f985w.remove(next);
            } else {
                z = jVar.mo1030f(this, gVar);
                if (z) {
                    break;
                }
            }
        }
        mo1137g0();
        if (z) {
            this.f986x = gVar;
        }
        return z;
    }

    /* renamed from: n */
    public int mo1144n(int i) {
        return mo1145o(i, 0);
    }

    /* renamed from: o */
    public int mo1145o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f968f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo1102N(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0291g r = mo1149r(i, keyEvent);
        boolean N = r != null ? mo1102N(r, i2) : false;
        if ((i2 & 2) != 0) {
            mo1133e(true);
        }
        return N;
    }

    /* renamed from: q */
    public int mo1148q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f968f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0291g mo1149r(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0291g> arrayList = this.f984v;
        arrayList.clear();
        mo1152s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean I = mo1097I();
        for (int i2 = 0; i2 < size; i2++) {
            C0291g gVar = arrayList.get(i2);
            if (I) {
                c = gVar.getAlphabeticShortcut();
            } else {
                c = gVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (I && c == 8 && i == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public void removeGroup(int i) {
        int n = mo1144n(i);
        if (n >= 0) {
            int size = this.f968f.size() - n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f968f.get(n).getGroupId() != i) {
                    mo1101M(true);
                } else {
                    m1404P(n, false);
                    i2 = i3;
                }
            }
            mo1101M(true);
        }
    }

    public void removeItem(int i) {
        m1404P(mo1148q(i), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1152s(List<C0291g> list, int i, KeyEvent keyEvent) {
        boolean I = mo1097I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f968f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0291g gVar = this.f968f.get(i2);
                if (gVar.hasSubMenu()) {
                    ((C0287e) gVar.getSubMenu()).mo1152s(list, i, keyEvent);
                }
                char alphabeticShortcut = I ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((I ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (I && alphabeticShortcut == 8 && i == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f968f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0291g gVar = this.f968f.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.mo1244t(z2);
                gVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f987y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f968f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0291g gVar = this.f968f.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f968f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0291g gVar = this.f968f.get(i2);
            if (gVar.getGroupId() == i && gVar.mo1250y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1101M(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f965c = z;
        mo1101M(false);
    }

    public int size() {
        return this.f968f.size();
    }

    /* renamed from: t */
    public void mo1159t() {
        ArrayList<C0291g> G = mo1095G();
        if (this.f973k) {
            Iterator<WeakReference<C0296j>> it = this.f985w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0296j jVar = (C0296j) next.get();
                if (jVar == null) {
                    this.f985w.remove(next);
                } else {
                    z |= jVar.mo1045d();
                }
            }
            if (z) {
                this.f971i.clear();
                this.f972j.clear();
                int size = G.size();
                for (int i = 0; i < size; i++) {
                    C0291g gVar = G.get(i);
                    if (gVar.mo1209l()) {
                        this.f971i.add(gVar);
                    } else {
                        this.f972j.add(gVar);
                    }
                }
            } else {
                this.f971i.clear();
                this.f972j.clear();
                this.f972j.addAll(mo1095G());
            }
            this.f973k = false;
        }
    }

    /* renamed from: u */
    public ArrayList<C0291g> mo1160u() {
        mo1159t();
        return this.f971i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo1161v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context mo1162w() {
        return this.f963a;
    }

    /* renamed from: x */
    public C0291g mo1163x() {
        return this.f986x;
    }

    /* renamed from: y */
    public Drawable mo1164y() {
        return this.f977o;
    }

    /* renamed from: z */
    public CharSequence mo1165z() {
        return this.f976n;
    }

    public MenuItem add(int i) {
        return mo1114a(0, 0, 0, this.f964b.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f964b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1114a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0291g gVar = (C0291g) mo1114a(i, i2, i3, charSequence);
        C0303m mVar = new C0303m(this.f963a, this, gVar);
        gVar.mo1249x(mVar);
        return mVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1114a(i, i2, i3, this.f964b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f964b.getString(i4));
    }
}
