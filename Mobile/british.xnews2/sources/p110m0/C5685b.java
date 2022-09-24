package p110m0;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: m0.b */
/* compiled from: ActionProvider */
public abstract class C5685b {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private C5686a mSubUiVisibilityListener;
    private C5687b mVisibilityListener;

    /* renamed from: m0.b$a */
    /* compiled from: ActionProvider */
    public interface C5686a {
        /* renamed from: a */
        void mo1399a(boolean z);
    }

    /* renamed from: m0.b$b */
    /* compiled from: ActionProvider */
    public interface C5687b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C5685b(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener != null && overridesItemVisibility()) {
            this.mVisibilityListener.onActionProviderVisibilityChanged(isVisible());
        }
    }

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    public void setSubUiVisibilityListener(C5686a aVar) {
        this.mSubUiVisibilityListener = aVar;
    }

    public void setVisibilityListener(C5687b bVar) {
        if (!(this.mVisibilityListener == null || bVar == null)) {
            Log.w(TAG, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.mVisibilityListener = bVar;
    }

    public void subUiVisibilityChanged(boolean z) {
        C5686a aVar = this.mSubUiVisibilityListener;
        if (aVar != null) {
            aVar.mo1399a(z);
        }
    }
}
