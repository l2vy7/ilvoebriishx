package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0298k;
import com.google.android.exoplayer2.C6540C;
import p063d0.C5135a;
import p073f.C5245h;
import p074f0.C5249b;
import p079g.C5264a;
import p111m0.C5685b;

/* renamed from: androidx.appcompat.view.menu.g */
/* compiled from: MenuItemImpl */
public final class C0291g implements C5249b {

    /* renamed from: A */
    private View f993A;

    /* renamed from: B */
    private C5685b f994B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f995C;

    /* renamed from: D */
    private boolean f996D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f997E;

    /* renamed from: a */
    private final int f998a;

    /* renamed from: b */
    private final int f999b;

    /* renamed from: c */
    private final int f1000c;

    /* renamed from: d */
    private final int f1001d;

    /* renamed from: e */
    private CharSequence f1002e;

    /* renamed from: f */
    private CharSequence f1003f;

    /* renamed from: g */
    private Intent f1004g;

    /* renamed from: h */
    private char f1005h;

    /* renamed from: i */
    private int f1006i = 4096;

    /* renamed from: j */
    private char f1007j;

    /* renamed from: k */
    private int f1008k = 4096;

    /* renamed from: l */
    private Drawable f1009l;

    /* renamed from: m */
    private int f1010m = 0;

    /* renamed from: n */
    C0287e f1011n;

    /* renamed from: o */
    private C0303m f1012o;

    /* renamed from: p */
    private Runnable f1013p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1014q;

    /* renamed from: r */
    private CharSequence f1015r;

    /* renamed from: s */
    private CharSequence f1016s;

    /* renamed from: t */
    private ColorStateList f1017t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1018u = null;

    /* renamed from: v */
    private boolean f1019v = false;

    /* renamed from: w */
    private boolean f1020w = false;

    /* renamed from: x */
    private boolean f1021x = false;

    /* renamed from: y */
    private int f1022y = 16;

    /* renamed from: z */
    private int f1023z = 0;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* compiled from: MenuItemImpl */
    class C0292a implements C5685b.C5687b {
        C0292a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0291g gVar = C0291g.this;
            gVar.f1011n.mo1100L(gVar);
        }
    }

    C0291g(C0287e eVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1011n = eVar;
        this.f998a = i2;
        this.f999b = i;
        this.f1000c = i3;
        this.f1001d = i4;
        this.f1002e = charSequence;
        this.f1023z = i5;
    }

    /* renamed from: d */
    private static void m1470d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m1471e(Drawable drawable) {
        if (drawable != null && this.f1021x && (this.f1019v || this.f1020w)) {
            drawable = C5135a.m23418r(drawable).mutate();
            if (this.f1019v) {
                C5135a.m23415o(drawable, this.f1017t);
            }
            if (this.f1020w) {
                C5135a.m23416p(drawable, this.f1018u);
            }
            this.f1021x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo1171A() {
        return this.f1011n.mo1098J() && mo1179g() != 0;
    }

    /* renamed from: B */
    public boolean mo1172B() {
        return (this.f1023z & 4) == 4;
    }

    /* renamed from: a */
    public C5685b mo1173a() {
        return this.f994B;
    }

    /* renamed from: b */
    public C5249b mo1174b(C5685b bVar) {
        C5685b bVar2 = this.f994B;
        if (bVar2 != null) {
            bVar2.reset();
        }
        this.f993A = null;
        this.f994B = bVar;
        this.f1011n.mo1101M(true);
        C5685b bVar3 = this.f994B;
        if (bVar3 != null) {
            bVar3.setVisibilityListener(new C0292a());
        }
        return this;
    }

    /* renamed from: c */
    public void mo1175c() {
        this.f1011n.mo1099K(this);
    }

    public boolean collapseActionView() {
        if ((this.f1023z & 8) == 0) {
            return false;
        }
        if (this.f993A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f995C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1011n.mo1135f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!mo1207j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f995C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1011n.mo1143m(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo1178f() {
        return this.f1001d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public char mo1179g() {
        return this.f1011n.mo1097I() ? this.f1007j : this.f1005h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f993A;
        if (view != null) {
            return view;
        }
        C5685b bVar = this.f994B;
        if (bVar == null) {
            return null;
        }
        View onCreateActionView = bVar.onCreateActionView(this);
        this.f993A = onCreateActionView;
        return onCreateActionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1008k;
    }

    public char getAlphabeticShortcut() {
        return this.f1007j;
    }

    public CharSequence getContentDescription() {
        return this.f1015r;
    }

    public int getGroupId() {
        return this.f999b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1009l;
        if (drawable != null) {
            return m1471e(drawable);
        }
        if (this.f1010m == 0) {
            return null;
        }
        Drawable d = C5264a.m23789d(this.f1011n.mo1162w(), this.f1010m);
        this.f1010m = 0;
        this.f1009l = d;
        return m1471e(d);
    }

    public ColorStateList getIconTintList() {
        return this.f1017t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1018u;
    }

    public Intent getIntent() {
        return this.f1004g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f998a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f997E;
    }

    public int getNumericModifiers() {
        return this.f1006i;
    }

    public char getNumericShortcut() {
        return this.f1005h;
    }

    public int getOrder() {
        return this.f1000c;
    }

    public SubMenu getSubMenu() {
        return this.f1012o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1002e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1003f;
        if (charSequence == null) {
            charSequence = this.f1002e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f1016s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo1199h() {
        char g = mo1179g();
        if (g == 0) {
            return "";
        }
        Resources resources = this.f1011n.mo1162w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1011n.mo1162w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C5245h.f22973l));
        }
        int i = this.f1011n.mo1097I() ? this.f1008k : this.f1006i;
        m1470d(sb, i, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE, resources.getString(C5245h.f22969h));
        m1470d(sb, i, 4096, resources.getString(C5245h.f22965d));
        m1470d(sb, i, 2, resources.getString(C5245h.f22964c));
        m1470d(sb, i, 1, resources.getString(C5245h.f22970i));
        m1470d(sb, i, 4, resources.getString(C5245h.f22972k));
        m1470d(sb, i, 8, resources.getString(C5245h.f22968g));
        if (g == 8) {
            sb.append(resources.getString(C5245h.f22966e));
        } else if (g == 10) {
            sb.append(resources.getString(C5245h.f22967f));
        } else if (g != ' ') {
            sb.append(g);
        } else {
            sb.append(resources.getString(C5245h.f22971j));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f1012o != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence mo1201i(C0298k.C0299a aVar) {
        if (aVar == null || !aVar.mo992d()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f996D;
    }

    public boolean isCheckable() {
        return (this.f1022y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1022y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1022y & 16) != 0;
    }

    public boolean isVisible() {
        C5685b bVar = this.f994B;
        if (bVar == null || !bVar.overridesItemVisibility()) {
            if ((this.f1022y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f1022y & 8) != 0 || !this.f994B.isVisible()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j */
    public boolean mo1207j() {
        C5685b bVar;
        if ((this.f1023z & 8) == 0) {
            return false;
        }
        if (this.f993A == null && (bVar = this.f994B) != null) {
            this.f993A = bVar.onCreateActionView(this);
        }
        if (this.f993A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo1208k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1014q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0287e eVar = this.f1011n;
        if (eVar.mo1139h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f1013p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1004g != null) {
            try {
                this.f1011n.mo1162w().startActivity(this.f1004g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C5685b bVar = this.f994B;
        if (bVar == null || !bVar.onPerformDefaultAction()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo1209l() {
        return (this.f1022y & 32) == 32;
    }

    /* renamed from: m */
    public boolean mo1210m() {
        return (this.f1022y & 4) != 0;
    }

    /* renamed from: n */
    public boolean mo1211n() {
        return (this.f1023z & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo1212o() {
        return (this.f1023z & 2) == 2;
    }

    /* renamed from: p */
    public C5249b setActionView(int i) {
        Context w = this.f1011n.mo1162w();
        setActionView(LayoutInflater.from(w).inflate(i, new LinearLayout(w), false));
        return this;
    }

    /* renamed from: q */
    public C5249b setActionView(View view) {
        int i;
        this.f993A = view;
        this.f994B = null;
        if (view != null && view.getId() == -1 && (i = this.f998a) > 0) {
            view.setId(i);
        }
        this.f1011n.mo1099K(this);
        return this;
    }

    /* renamed from: r */
    public void mo1215r(boolean z) {
        this.f996D = z;
        this.f1011n.mo1101M(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1216s(boolean z) {
        int i = this.f1022y;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f1022y = i2;
        if (i != i2) {
            this.f1011n.mo1101M(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1007j == c) {
            return this;
        }
        this.f1007j = Character.toLowerCase(c);
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1022y;
        boolean z2 = z | (i & true);
        this.f1022y = z2 ? 1 : 0;
        if (i != z2) {
            this.f1011n.mo1101M(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1022y & 4) != 0) {
            this.f1011n.mo1111X(this);
        } else {
            mo1216s(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1022y |= 16;
        } else {
            this.f1022y &= -17;
        }
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1010m = 0;
        this.f1009l = drawable;
        this.f1021x = true;
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1017t = colorStateList;
        this.f1019v = true;
        this.f1021x = true;
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1018u = mode;
        this.f1020w = true;
        this.f1021x = true;
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1004g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1005h == c) {
            return this;
        }
        this.f1005h = c;
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f995C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1014q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1005h = c;
        this.f1007j = Character.toLowerCase(c2);
        this.f1011n.mo1101M(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1023z = i;
            this.f1011n.mo1099K(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1002e = charSequence;
        this.f1011n.mo1101M(false);
        C0303m mVar = this.f1012o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1003f = charSequence;
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1250y(z)) {
            this.f1011n.mo1100L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo1244t(boolean z) {
        this.f1022y = (z ? 4 : 0) | (this.f1022y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f1002e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void mo1246u(boolean z) {
        if (z) {
            this.f1022y |= 32;
        } else {
            this.f1022y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1247v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f997E = contextMenuInfo;
    }

    /* renamed from: w */
    public C5249b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void mo1249x(C0303m mVar) {
        this.f1012o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo1250y(boolean z) {
        int i = this.f1022y;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f1022y = i2;
        if (i != i2) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean mo1251z() {
        return this.f1011n.mo1092C();
    }

    public C5249b setContentDescription(CharSequence charSequence) {
        this.f1015r = charSequence;
        this.f1011n.mo1101M(false);
        return this;
    }

    public C5249b setTooltipText(CharSequence charSequence) {
        this.f1016s = charSequence;
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1007j == c && this.f1008k == i) {
            return this;
        }
        this.f1007j = Character.toLowerCase(c);
        this.f1008k = KeyEvent.normalizeMetaState(i);
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1005h == c && this.f1006i == i) {
            return this;
        }
        this.f1005h = c;
        this.f1006i = KeyEvent.normalizeMetaState(i);
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1005h = c;
        this.f1006i = KeyEvent.normalizeMetaState(i);
        this.f1007j = Character.toLowerCase(c2);
        this.f1008k = KeyEvent.normalizeMetaState(i2);
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1009l = null;
        this.f1010m = i;
        this.f1021x = true;
        this.f1011n.mo1101M(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f1011n.mo1162w().getString(i));
    }
}
