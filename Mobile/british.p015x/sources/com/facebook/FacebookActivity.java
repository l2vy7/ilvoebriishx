package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.common.C3440d;
import com.facebook.common.C3441e;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3486g;
import com.facebook.internal.C3563z;
import com.facebook.login.C3604e;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;

public class FacebookActivity extends FragmentActivity {

    /* renamed from: r */
    public static String f12733r = "PassThrough";

    /* renamed from: s */
    private static String f12734s = "SingleFragment";

    /* renamed from: t */
    private static final String f12735t = "com.facebook.FacebookActivity";

    /* renamed from: q */
    private Fragment f12736q;

    /* renamed from: D */
    private void m11228D() {
        setResult(0, C3563z.m11921m(getIntent(), (Bundle) null, C3563z.m11926r(C3563z.m11930v(getIntent()))));
        finish();
    }

    /* renamed from: B */
    public Fragment mo11212B() {
        return this.f12736q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public Fragment mo11213C() {
        Intent intent = getIntent();
        FragmentManager r = mo3505r();
        Fragment j0 = r.mo3592j0(f12734s);
        if (j0 != null) {
            return j0;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            C3486g gVar = new C3486g();
            gVar.mo3364H1(true);
            gVar.mo3729e2(r, f12734s);
            return gVar;
        } else if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
            deviceShareDialogFragment.mo3364H1(true);
            deviceShareDialogFragment.mo12383o2((ShareContent) intent.getParcelableExtra("content"));
            deviceShareDialogFragment.mo3729e2(r, f12734s);
            return deviceShareDialogFragment;
        } else {
            C3604e eVar = new C3604e();
            eVar.mo3364H1(true);
            r.mo3598m().mo3850b(C3440d.com_facebook_fragment_container, eVar, f12734s).mo3672g();
            return eVar;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f12736q;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C3642m.m12296v()) {
            C3481f0.m11609T(f12735t, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            C3642m.m12273B(getApplicationContext());
        }
        setContentView(C3441e.com_facebook_activity_layout);
        if (f12733r.equals(intent.getAction())) {
            m11228D();
        } else {
            this.f12736q = mo11213C();
        }
    }
}
