package p104l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p074f0.C5249b;
import p099k.C5524c;
import p111m0.C5685b;

/* renamed from: l.c */
/* compiled from: MenuItemWrapperICS */
public class C5632c extends C5631b implements MenuItem {

    /* renamed from: d */
    private final C5249b f24197d;

    /* renamed from: e */
    private Method f24198e;

    /* renamed from: l.c$a */
    /* compiled from: MenuItemWrapperICS */
    private class C5633a extends C5685b {

        /* renamed from: a */
        final ActionProvider f24199a;

        C5633a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f24199a = actionProvider;
        }

        public boolean hasSubMenu() {
            return this.f24199a.hasSubMenu();
        }

        public View onCreateActionView() {
            return this.f24199a.onCreateActionView();
        }

        public boolean onPerformDefaultAction() {
            return this.f24199a.onPerformDefaultAction();
        }

        public void onPrepareSubMenu(SubMenu subMenu) {
            this.f24199a.onPrepareSubMenu(C5632c.this.mo22229d(subMenu));
        }
    }

    /* renamed from: l.c$b */
    /* compiled from: MenuItemWrapperICS */
    private class C5634b extends C5633a implements ActionProvider.VisibilityListener {

        /* renamed from: c */
        private C5685b.C5687b f24201c;

        C5634b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean isVisible() {
            return this.f24199a.isVisible();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C5685b.C5687b bVar = this.f24201c;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }

        public View onCreateActionView(MenuItem menuItem) {
            return this.f24199a.onCreateActionView(menuItem);
        }

        public boolean overridesItemVisibility() {
            return this.f24199a.overridesItemVisibility();
        }

        public void refreshVisibility() {
            this.f24199a.refreshVisibility();
        }

        public void setVisibilityListener(C5685b.C5687b bVar) {
            this.f24201c = bVar;
            this.f24199a.setVisibilityListener(bVar != null ? this : null);
        }
    }

    /* renamed from: l.c$c */
    /* compiled from: MenuItemWrapperICS */
    static class C5635c extends FrameLayout implements C5524c {

        /* renamed from: b */
        final CollapsibleActionView f24203b;

        C5635c(View view) {
            super(view.getContext());
            this.f24203b = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo22294a() {
            return (View) this.f24203b;
        }

        /* renamed from: c */
        public void mo1803c() {
            this.f24203b.onActionViewExpanded();
        }

        /* renamed from: f */
        public void mo1806f() {
            this.f24203b.onActionViewCollapsed();
        }
    }

    /* renamed from: l.c$d */
    /* compiled from: MenuItemWrapperICS */
    private class C5636d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f24204a;

        C5636d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f24204a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f24204a.onMenuItemActionCollapse(C5632c.this.mo22228c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f24204a.onMenuItemActionExpand(C5632c.this.mo22228c(menuItem));
        }
    }

    /* renamed from: l.c$e */
    /* compiled from: MenuItemWrapperICS */
    private class C5637e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f24206a;

        C5637e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f24206a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f24206a.onMenuItemClick(C5632c.this.mo22228c(menuItem));
        }
    }

    public C5632c(Context context, C5249b bVar) {
        super(context);
        if (bVar != null) {
            this.f24197d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f24197d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f24197d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C5685b a = this.f24197d.mo1173a();
        if (a instanceof C5633a) {
            return ((C5633a) a).f24199a;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f24197d.getActionView();
        return actionView instanceof C5635c ? ((C5635c) actionView).mo22294a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f24197d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f24197d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f24197d.getContentDescription();
    }

    public int getGroupId() {
        return this.f24197d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f24197d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f24197d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f24197d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f24197d.getIntent();
    }

    public int getItemId() {
        return this.f24197d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f24197d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f24197d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f24197d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f24197d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo22229d(this.f24197d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f24197d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f24197d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f24197d.getTooltipText();
    }

    /* renamed from: h */
    public void mo22254h(boolean z) {
        try {
            if (this.f24198e == null) {
                this.f24198e = this.f24197d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f24198e.invoke(this.f24197d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean hasSubMenu() {
        return this.f24197d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f24197d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f24197d.isCheckable();
    }

    public boolean isChecked() {
        return this.f24197d.isChecked();
    }

    public boolean isEnabled() {
        return this.f24197d.isEnabled();
    }

    public boolean isVisible() {
        return this.f24197d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C5685b bVar;
        if (Build.VERSION.SDK_INT >= 16) {
            bVar = new C5634b(this.f24194a, actionProvider);
        } else {
            bVar = new C5633a(this.f24194a, actionProvider);
        }
        C5249b bVar2 = this.f24197d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo1174b(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C5635c(view);
        }
        this.f24197d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f24197d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f24197d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f24197d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f24197d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f24197d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f24197d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24197d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24197d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f24197d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f24197d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24197d.setOnActionExpandListener(onActionExpandListener != null ? new C5636d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24197d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C5637e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f24197d.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f24197d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f24197d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f24197d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24197d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f24197d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f24197d.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f24197d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f24197d.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f24197d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f24197d.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f24197d.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f24197d.setActionView(i);
        View actionView = this.f24197d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f24197d.setActionView((View) new C5635c(actionView));
        }
        return this;
    }
}
