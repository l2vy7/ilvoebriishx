package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.C0690c;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C3572j;
import com.facebook.C3642m;
import com.facebook.internal.C3494h0;

/* renamed from: com.facebook.internal.g */
/* compiled from: FacebookDialogFragment */
public class C3486g extends C0690c {

    /* renamed from: C0 */
    private Dialog f13072C0;

    /* renamed from: com.facebook.internal.g$a */
    /* compiled from: FacebookDialogFragment */
    class C3487a implements C3494h0.C3501g {
        C3487a() {
        }

        /* renamed from: a */
        public void mo11939a(Bundle bundle, C3572j jVar) {
            C3486g.this.m11670h2(bundle, jVar);
        }
    }

    /* renamed from: com.facebook.internal.g$b */
    /* compiled from: FacebookDialogFragment */
    class C3488b implements C3494h0.C3501g {
        C3488b() {
        }

        /* renamed from: a */
        public void mo11939a(Bundle bundle, C3572j jVar) {
            C3486g.this.m11671i2(bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public void m11670h2(Bundle bundle, C3572j jVar) {
        FragmentActivity p = mo3443p();
        p.setResult(jVar == null ? -1 : 0, C3563z.m11921m(p.getIntent(), bundle, jVar));
        p.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public void m11671i2(Bundle bundle) {
        FragmentActivity p = mo3443p();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        p.setResult(-1, intent);
        p.finish();
    }

    /* renamed from: A0 */
    public void mo3342A0() {
        if (mo3719S1() != null && mo3382O()) {
            mo3719S1().setDismissMessage((Message) null);
        }
        super.mo3342A0();
    }

    /* renamed from: O0 */
    public void mo3383O0() {
        super.mo3383O0();
        Dialog dialog = this.f13072C0;
        if (dialog instanceof C3494h0) {
            ((C3494h0) dialog).mo11955s();
        }
    }

    /* renamed from: U1 */
    public Dialog mo3721U1(Bundle bundle) {
        if (this.f13072C0 == null) {
            m11670h2((Bundle) null, (C3572j) null);
            mo3726a2(false);
        }
        return this.f13072C0;
    }

    /* renamed from: j2 */
    public void mo11938j2(Dialog dialog) {
        this.f13072C0 = dialog;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f13072C0 instanceof C3494h0) && mo3427k0()) {
            ((C3494h0) this.f13072C0).mo11955s();
        }
    }

    /* renamed from: t0 */
    public void mo3457t0(Bundle bundle) {
        C3494h0 h0Var;
        super.mo3457t0(bundle);
        if (this.f13072C0 == null) {
            FragmentActivity p = mo3443p();
            Bundle v = C3563z.m11930v(p.getIntent());
            if (!v.getBoolean("is_fallback", false)) {
                String string = v.getString("action");
                Bundle bundle2 = v.getBundle("params");
                if (C3481f0.m11604O(string)) {
                    C3481f0.m11609T("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    p.finish();
                    return;
                }
                h0Var = new C3494h0.C3499e(p, string, bundle2).mo11970h(new C3487a()).mo11964a();
            } else {
                String string2 = v.getString("url");
                if (C3481f0.m11604O(string2)) {
                    C3481f0.m11609T("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    p.finish();
                    return;
                }
                h0Var = C3509j.m11752A(p, string2, String.format("fb%s://bridge/", new Object[]{C3642m.m12280f()}));
                h0Var.mo11959w(new C3488b());
            }
            this.f13072C0 = h0Var;
        }
    }
}
