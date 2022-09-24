package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.C3440d;
import com.facebook.common.C3441e;
import com.facebook.login.LoginClient;

/* renamed from: com.facebook.login.e */
/* compiled from: LoginFragment */
public class C3604e extends Fragment {

    /* renamed from: m0 */
    private String f13401m0;

    /* renamed from: n0 */
    private LoginClient f13402n0;

    /* renamed from: o0 */
    private LoginClient.Request f13403o0;

    /* renamed from: com.facebook.login.e$a */
    /* compiled from: LoginFragment */
    class C3605a implements LoginClient.C3596c {
        C3605a() {
        }

        /* renamed from: a */
        public void mo12212a(LoginClient.Result result) {
            C3604e.this.m12154S1(result);
        }
    }

    /* renamed from: com.facebook.login.e$b */
    /* compiled from: LoginFragment */
    class C3606b implements LoginClient.C3595b {

        /* renamed from: a */
        final /* synthetic */ View f13405a;

        C3606b(View view) {
            this.f13405a = view;
        }

        /* renamed from: a */
        public void mo12210a() {
            this.f13405a.setVisibility(0);
        }

        /* renamed from: b */
        public void mo12211b() {
            this.f13405a.setVisibility(8);
        }
    }

    /* renamed from: R1 */
    private void m12153R1(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f13401m0 = callingActivity.getPackageName();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public void m12154S1(LoginClient.Result result) {
        this.f13403o0 = null;
        int i = result.f13356b == LoginClient.Result.C3593b.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (mo3406b0()) {
            mo3443p().setResult(i, intent);
            mo3443p().finish();
        }
    }

    /* renamed from: J0 */
    public void mo3369J0() {
        View view;
        super.mo3369J0();
        if (mo3398W() == null) {
            view = null;
        } else {
            view = mo3398W().findViewById(C3440d.com_facebook_login_fragment_progress_bar);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: O0 */
    public void mo3383O0() {
        super.mo3383O0();
        if (this.f13401m0 == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            mo3443p().finish();
            return;
        }
        this.f13402n0.mo12156B(this.f13403o0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public LoginClient mo12242O1() {
        return new LoginClient((Fragment) this);
    }

    /* renamed from: P0 */
    public void mo3385P0(Bundle bundle) {
        super.mo3385P0(bundle);
        bundle.putParcelable("loginClient", this.f13402n0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public int mo12243P1() {
        return C3441e.com_facebook_login_fragment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public LoginClient mo12244Q1() {
        return this.f13402n0;
    }

    /* renamed from: o0 */
    public void mo3438o0(int i, int i2, Intent intent) {
        super.mo3438o0(i, i2, intent);
        this.f13402n0.mo12176x(i, i2, intent);
    }

    /* renamed from: t0 */
    public void mo3457t0(Bundle bundle) {
        Bundle bundleExtra;
        super.mo3457t0(bundle);
        if (bundle != null) {
            LoginClient loginClient = (LoginClient) bundle.getParcelable("loginClient");
            this.f13402n0 = loginClient;
            loginClient.mo12178z(this);
        } else {
            this.f13402n0 = mo12242O1();
        }
        this.f13402n0.mo12155A(new C3605a());
        FragmentActivity p = mo3443p();
        if (p != null) {
            m12153R1(p);
            Intent intent = p.getIntent();
            if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
                this.f13403o0 = (LoginClient.Request) bundleExtra.getParcelable("request");
            }
        }
    }

    /* renamed from: x0 */
    public View mo3468x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo12243P1(), viewGroup, false);
        this.f13402n0.mo12177y(new C3606b(inflate.findViewById(C3440d.com_facebook_login_fragment_progress_bar)));
        return inflate;
    }

    /* renamed from: y0 */
    public void mo3471y0() {
        this.f13402n0.mo12161d();
        super.mo3471y0();
    }
}
