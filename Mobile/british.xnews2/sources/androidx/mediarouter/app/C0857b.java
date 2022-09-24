package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.C0690c;
import androidx.mediarouter.media.C1001r;

/* renamed from: androidx.mediarouter.app.b */
/* compiled from: MediaRouteChooserDialogFragment */
public class C0857b extends C0690c {

    /* renamed from: C0 */
    private boolean f4072C0 = false;

    /* renamed from: D0 */
    private Dialog f4073D0;

    /* renamed from: E0 */
    private C1001r f4074E0;

    public C0857b() {
        mo3725Z1(true);
    }

    /* renamed from: f2 */
    private void m4518f2() {
        if (this.f4074E0 == null) {
            Bundle u = mo3460u();
            if (u != null) {
                this.f4074E0 = C1001r.m5118d(u.getBundle("selector"));
            }
            if (this.f4074E0 == null) {
                this.f4074E0 = C1001r.f4553c;
            }
        }
    }

    /* renamed from: U1 */
    public Dialog mo3721U1(Bundle bundle) {
        if (this.f4072C0) {
            C0881g i2 = mo4242i2(mo3466w());
            this.f4073D0 = i2;
            C0881g gVar = i2;
            i2.mo4305i(mo4240g2());
        } else {
            C0852a h2 = mo4241h2(mo3466w(), bundle);
            this.f4073D0 = h2;
            C0852a aVar = h2;
            h2.mo4228i(mo4240g2());
        }
        return this.f4073D0;
    }

    /* renamed from: g2 */
    public C1001r mo4240g2() {
        m4518f2();
        return this.f4074E0;
    }

    /* renamed from: h2 */
    public C0852a mo4241h2(Context context, Bundle bundle) {
        return new C0852a(context);
    }

    /* renamed from: i2 */
    public C0881g mo4242i2(Context context) {
        return new C0881g(context);
    }

    /* renamed from: j2 */
    public void mo4243j2(C1001r rVar) {
        if (rVar != null) {
            m4518f2();
            if (!this.f4074E0.equals(rVar)) {
                this.f4074E0 = rVar;
                Bundle u = mo3460u();
                if (u == null) {
                    u = new Bundle();
                }
                u.putBundle("selector", rVar.mo4688a());
                mo3343A1(u);
                Dialog dialog = this.f4073D0;
                if (dialog == null) {
                    return;
                }
                if (this.f4072C0) {
                    ((C0881g) dialog).mo4305i(rVar);
                } else {
                    ((C0852a) dialog).mo4228i(rVar);
                }
            }
        } else {
            throw new IllegalArgumentException("selector must not be null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k2 */
    public void mo4244k2(boolean z) {
        if (this.f4073D0 == null) {
            this.f4072C0 = z;
            return;
        }
        throw new IllegalStateException("This must be called before creating dialog");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.f4073D0;
        if (dialog != null) {
            if (this.f4072C0) {
                ((C0881g) dialog).mo4306k();
            } else {
                ((C0852a) dialog).mo4229k();
            }
        }
    }
}
