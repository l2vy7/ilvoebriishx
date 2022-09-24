package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0286d;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0291g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.u */
/* compiled from: MenuPopupWindow */
public class C0419u extends ListPopupWindow implements C0418t {

    /* renamed from: L */
    private static Method f1685L;

    /* renamed from: K */
    private C0418t f1686K;

    /* renamed from: androidx.appcompat.widget.u$a */
    /* compiled from: MenuPopupWindow */
    public static class C0420a extends C0410q {

        /* renamed from: p */
        final int f1687p;

        /* renamed from: q */
        final int f1688q;

        /* renamed from: r */
        private C0418t f1689r;

        /* renamed from: s */
        private MenuItem f1690s;

        public C0420a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1687p = 22;
                this.f1688q = 21;
                return;
            }
            this.f1687p = 21;
            this.f1688q = 22;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo2225d(int i, int i2, int i3, int i4, int i5) {
            return super.mo2225d(i, i2, i3, i4, i5);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo2228e(MotionEvent motionEvent, int i) {
            return super.mo2228e(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0286d dVar;
            int pointToPosition;
            int i2;
            if (this.f1689r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    dVar = (C0286d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    dVar = (C0286d) adapter;
                }
                C0291g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < dVar.getCount()) {
                    gVar = dVar.getItem(i2);
                }
                MenuItem menuItem = this.f1690s;
                if (menuItem != gVar) {
                    C0287e b = dVar.mo1082b();
                    if (menuItem != null) {
                        this.f1689r.mo1066g(b, menuItem);
                    }
                    this.f1690s = gVar;
                    if (gVar != null) {
                        this.f1689r.mo1065d(b, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1687p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1688q) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0286d) getAdapter()).mo1082b().mo1133e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C0418t tVar) {
            this.f1689r = tVar;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1685L = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0419u(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: Q */
    public void mo2253Q(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1303G.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: R */
    public void mo2254R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1303G.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: S */
    public void mo2255S(C0418t tVar) {
        this.f1686K = tVar;
    }

    /* renamed from: T */
    public void mo2256T(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1685L;
            if (method != null) {
                try {
                    method.invoke(this.f1303G, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1303G.setTouchModal(z);
        }
    }

    /* renamed from: d */
    public void mo1065d(C0287e eVar, MenuItem menuItem) {
        C0418t tVar = this.f1686K;
        if (tVar != null) {
            tVar.mo1065d(eVar, menuItem);
        }
    }

    /* renamed from: g */
    public void mo1066g(C0287e eVar, MenuItem menuItem) {
        C0418t tVar = this.f1686K;
        if (tVar != null) {
            tVar.mo1066g(eVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0410q mo1771r(Context context, boolean z) {
        C0420a aVar = new C0420a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
