package p103l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0600b;
import p062d0.C5135a;
import p073f0.C5249b;
import p110m0.C5685b;

/* renamed from: l.a */
/* compiled from: ActionMenuItem */
public class C5630a implements C5249b {

    /* renamed from: a */
    private final int f24174a;

    /* renamed from: b */
    private final int f24175b;

    /* renamed from: c */
    private final int f24176c;

    /* renamed from: d */
    private CharSequence f24177d;

    /* renamed from: e */
    private CharSequence f24178e;

    /* renamed from: f */
    private Intent f24179f;

    /* renamed from: g */
    private char f24180g;

    /* renamed from: h */
    private int f24181h = 4096;

    /* renamed from: i */
    private char f24182i;

    /* renamed from: j */
    private int f24183j = 4096;

    /* renamed from: k */
    private Drawable f24184k;

    /* renamed from: l */
    private Context f24185l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f24186m;

    /* renamed from: n */
    private CharSequence f24187n;

    /* renamed from: o */
    private CharSequence f24188o;

    /* renamed from: p */
    private ColorStateList f24189p = null;

    /* renamed from: q */
    private PorterDuff.Mode f24190q = null;

    /* renamed from: r */
    private boolean f24191r = false;

    /* renamed from: s */
    private boolean f24192s = false;

    /* renamed from: t */
    private int f24193t = 16;

    public C5630a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f24185l = context;
        this.f24174a = i2;
        this.f24175b = i;
        this.f24176c = i4;
        this.f24177d = charSequence;
    }

    /* renamed from: c */
    private void m24936c() {
        Drawable drawable = this.f24184k;
        if (drawable == null) {
            return;
        }
        if (this.f24191r || this.f24192s) {
            Drawable r = C5135a.m23418r(drawable);
            this.f24184k = r;
            Drawable mutate = r.mutate();
            this.f24184k = mutate;
            if (this.f24191r) {
                C5135a.m23415o(mutate, this.f24189p);
            }
            if (this.f24192s) {
                C5135a.m23416p(this.f24184k, this.f24190q);
            }
        }
    }

    /* renamed from: a */
    public C5685b mo1173a() {
        return null;
    }

    /* renamed from: b */
    public C5249b mo1174b(C5685b bVar) {
        throw new UnsupportedOperationException();
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public C5249b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C5249b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C5249b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f24183j;
    }

    public char getAlphabeticShortcut() {
        return this.f24182i;
    }

    public CharSequence getContentDescription() {
        return this.f24187n;
    }

    public int getGroupId() {
        return this.f24175b;
    }

    public Drawable getIcon() {
        return this.f24184k;
    }

    public ColorStateList getIconTintList() {
        return this.f24189p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f24190q;
    }

    public Intent getIntent() {
        return this.f24179f;
    }

    public int getItemId() {
        return this.f24174a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f24181h;
    }

    public char getNumericShortcut() {
        return this.f24180g;
    }

    public int getOrder() {
        return this.f24176c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f24177d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f24178e;
        return charSequence != null ? charSequence : this.f24177d;
    }

    public CharSequence getTooltipText() {
        return this.f24188o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f24193t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f24193t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f24193t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f24193t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f24182i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f24193t = z | (this.f24193t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f24193t = (z ? 2 : 0) | (this.f24193t & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f24193t = (z ? 16 : 0) | (this.f24193t & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f24184k = drawable;
        m24936c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24189p = colorStateList;
        this.f24191r = true;
        m24936c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24190q = mode;
        this.f24192s = true;
        m24936c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f24179f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f24180g = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24186m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f24180g = c;
        this.f24182i = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f24177d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24178e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f24193t & 8;
        if (z) {
            i = 0;
        }
        this.f24193t = i2 | i;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f24182i = Character.toLowerCase(c);
        this.f24183j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public C5249b setContentDescription(CharSequence charSequence) {
        this.f24187n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f24180g = c;
        this.f24181h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f24177d = this.f24185l.getResources().getString(i);
        return this;
    }

    public C5249b setTooltipText(CharSequence charSequence) {
        this.f24188o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f24184k = C0600b.m3294f(this.f24185l, i);
        m24936c();
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f24180g = c;
        this.f24181h = KeyEvent.normalizeMetaState(i);
        this.f24182i = Character.toLowerCase(c2);
        this.f24183j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
