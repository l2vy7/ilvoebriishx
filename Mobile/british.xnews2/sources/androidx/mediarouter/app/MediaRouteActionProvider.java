package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.mediarouter.media.C1001r;
import androidx.mediarouter.media.C1003s;
import java.lang.ref.WeakReference;
import p017c1.C2643j;
import p110m0.C5685b;

public class MediaRouteActionProvider extends C5685b {
    private static final String TAG = "MRActionProvider";
    private boolean mAlwaysVisible;
    private MediaRouteButton mButton;
    private final C0845a mCallback;
    private C0879e mDialogFactory = C0879e.m4578a();
    private final C1003s mRouter;
    private C1001r mSelector = C1001r.f4553c;

    /* renamed from: androidx.mediarouter.app.MediaRouteActionProvider$a */
    private static final class C0845a extends C1003s.C1005b {

        /* renamed from: a */
        private final WeakReference<MediaRouteActionProvider> f4000a;

        public C0845a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.f4000a = new WeakReference<>(mediaRouteActionProvider);
        }

        /* renamed from: n */
        private void m4459n(C1003s sVar) {
            MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) this.f4000a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.refreshRoute();
            } else {
                sVar.mo4711p(this);
            }
        }

        /* renamed from: a */
        public void mo4165a(C1003s sVar, C1003s.C1021h hVar) {
            m4459n(sVar);
        }

        /* renamed from: b */
        public void mo4166b(C1003s sVar, C1003s.C1021h hVar) {
            m4459n(sVar);
        }

        /* renamed from: c */
        public void mo4167c(C1003s sVar, C1003s.C1021h hVar) {
            m4459n(sVar);
        }

        /* renamed from: d */
        public void mo4168d(C1003s sVar, C1003s.C1022i iVar) {
            m4459n(sVar);
        }

        /* renamed from: e */
        public void mo4169e(C1003s sVar, C1003s.C1022i iVar) {
            m4459n(sVar);
        }

        /* renamed from: g */
        public void mo4170g(C1003s sVar, C1003s.C1022i iVar) {
            m4459n(sVar);
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.mRouter = C1003s.m5133h(context);
        this.mCallback = new C0845a(this);
    }

    @Deprecated
    public void enableDynamicGroup() {
        C2643j j = this.mRouter.mo4707j();
        C2643j.C2644a aVar = j == null ? new C2643j.C2644a() : new C2643j.C2644a(j);
        aVar.mo9302b(2);
        this.mRouter.mo4715t(aVar.mo9301a());
    }

    public C0879e getDialogFactory() {
        return this.mDialogFactory;
    }

    public MediaRouteButton getMediaRouteButton() {
        return this.mButton;
    }

    public C1001r getRouteSelector() {
        return this.mSelector;
    }

    public boolean isVisible() {
        return this.mAlwaysVisible || this.mRouter.mo4710n(this.mSelector, 1);
    }

    public View onCreateActionView() {
        if (this.mButton != null) {
            Log.e(TAG, "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        MediaRouteButton onCreateMediaRouteButton = onCreateMediaRouteButton();
        this.mButton = onCreateMediaRouteButton;
        onCreateMediaRouteButton.setCheatSheetEnabled(true);
        this.mButton.setRouteSelector(this.mSelector);
        this.mButton.setAlwaysVisible(this.mAlwaysVisible);
        this.mButton.setDialogFactory(this.mDialogFactory);
        this.mButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.mButton;
    }

    public MediaRouteButton onCreateMediaRouteButton() {
        return new MediaRouteButton(getContext());
    }

    public boolean onPerformDefaultAction() {
        MediaRouteButton mediaRouteButton = this.mButton;
        if (mediaRouteButton != null) {
            return mediaRouteButton.mo4173d();
        }
        return false;
    }

    public boolean overridesItemVisibility() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void refreshRoute() {
        refreshVisibility();
    }

    public void setAlwaysVisible(boolean z) {
        if (this.mAlwaysVisible != z) {
            this.mAlwaysVisible = z;
            refreshVisibility();
            MediaRouteButton mediaRouteButton = this.mButton;
            if (mediaRouteButton != null) {
                mediaRouteButton.setAlwaysVisible(this.mAlwaysVisible);
            }
        }
    }

    public void setDialogFactory(C0879e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("factory must not be null");
        } else if (this.mDialogFactory != eVar) {
            this.mDialogFactory = eVar;
            MediaRouteButton mediaRouteButton = this.mButton;
            if (mediaRouteButton != null) {
                mediaRouteButton.setDialogFactory(eVar);
            }
        }
    }

    public void setRouteSelector(C1001r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.mSelector.equals(rVar)) {
            if (!this.mSelector.mo4693f()) {
                this.mRouter.mo4711p(this.mCallback);
            }
            if (!rVar.mo4693f()) {
                this.mRouter.mo4702a(rVar, this.mCallback);
            }
            this.mSelector = rVar;
            refreshRoute();
            MediaRouteButton mediaRouteButton = this.mButton;
            if (mediaRouteButton != null) {
                mediaRouteButton.setRouteSelector(rVar);
            }
        }
    }
}
