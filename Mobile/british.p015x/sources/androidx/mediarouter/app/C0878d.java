package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.C0690c;
import androidx.mediarouter.media.C1001r;

/* renamed from: androidx.mediarouter.app.d */
/* compiled from: MediaRouteControllerDialogFragment */
public class C0878d extends C0690c {

    /* renamed from: C0 */
    private boolean f4173C0 = false;

    /* renamed from: D0 */
    private Dialog f4174D0;

    /* renamed from: E0 */
    private C1001r f4175E0;

    public C0878d() {
        mo3725Z1(true);
    }

    /* renamed from: f2 */
    private void m4571f2() {
        if (this.f4175E0 == null) {
            Bundle u = mo3460u();
            if (u != null) {
                this.f4175E0 = C1001r.m5118d(u.getBundle("selector"));
            }
            if (this.f4175E0 == null) {
                this.f4175E0 = C1001r.f4553c;
            }
        }
    }

    /* renamed from: R0 */
    public void mo3389R0() {
        super.mo3389R0();
        Dialog dialog = this.f4174D0;
        if (dialog != null && !this.f4173C0) {
            ((C0858c) dialog).mo4256n(false);
        }
    }

    /* renamed from: U1 */
    public Dialog mo3721U1(Bundle bundle) {
        if (this.f4173C0) {
            C0891h h2 = mo4297h2(mo3466w());
            this.f4174D0 = h2;
            C0891h hVar = h2;
            h2.mo4333q(this.f4175E0);
        } else {
            this.f4174D0 = mo4296g2(mo3466w(), bundle);
        }
        return this.f4174D0;
    }

    /* renamed from: g2 */
    public C0858c mo4296g2(Context context, Bundle bundle) {
        return new C0858c(context);
    }

    /* renamed from: h2 */
    public C0891h mo4297h2(Context context) {
        return new C0891h(context);
    }

    /* renamed from: i2 */
    public void mo4298i2(C1001r rVar) {
        if (rVar != null) {
            m4571f2();
            if (!this.f4175E0.equals(rVar)) {
                this.f4175E0 = rVar;
                Bundle u = mo3460u();
                if (u == null) {
                    u = new Bundle();
                }
                u.putBundle("selector", rVar.mo4688a());
                mo3343A1(u);
                Dialog dialog = this.f4174D0;
                if (dialog != null && this.f4173C0) {
                    ((C0891h) dialog).mo4333q(rVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j2 */
    public void mo4299j2(boolean z) {
        if (this.f4174D0 == null) {
            this.f4173C0 = z;
            return;
        }
        throw new IllegalStateException("This must be called before creating dialog");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.f4174D0;
        if (dialog == null) {
            return;
        }
        if (this.f4173C0) {
            ((C0891h) dialog).mo4334s();
        } else {
            ((C0858c) dialog).mo4251J();
        }
    }
}
