package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.C0798a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.Status;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p171x0.C6339c;
import p220j4.C10611e;
import p220j4.C10618l;

@KeepName
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: v */
    private static boolean f28293v = false;

    /* renamed from: q */
    private boolean f28294q = false;

    /* renamed from: r */
    private SignInConfiguration f28295r;

    /* renamed from: s */
    private boolean f28296s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f28297t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Intent f28298u;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    private class C7073a implements C0798a.C0799a<Void> {
        private C7073a() {
        }

        /* renamed from: d */
        public final /* synthetic */ void mo4035d(C6339c cVar, Object obj) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f28297t, SignInHubActivity.this.f28298u);
            SignInHubActivity.this.finish();
        }

        /* renamed from: e */
        public final C6339c<Void> mo4036e(int i, Bundle bundle) {
            return new C10611e(SignInHubActivity.this, C7206f.m29521j());
        }

        /* renamed from: j */
        public final void mo4037j(C6339c<Void> cVar) {
        }
    }

    /* renamed from: C */
    private final void m29003C(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f28293v = false;
    }

    /* renamed from: E */
    private final void m29005E() {
        mo3506s().mo4033c(0, (Bundle) null, new C7073a());
        f28293v = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f28294q) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.mo17814W() != null) {
                        GoogleSignInAccount W = signInAccount.mo17814W();
                        C10618l.m48388c(this).mo42737b(this.f28295r.mo29124C0(), W);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", W);
                        this.f28296s = true;
                        this.f28297t = i2;
                        this.f28298u = intent;
                        m29005E();
                        return;
                    } else if (intent.hasExtra(IronSourceConstants.EVENTS_ERROR_CODE)) {
                        int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m29003C(intExtra);
                        return;
                    }
                }
                m29003C(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m29003C(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
            this.f28295r = signInConfiguration;
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f28296s = z;
                if (z) {
                    this.f28297t = bundle.getInt("signInResultCode");
                    this.f28298u = (Intent) bundle.getParcelable("signInResultData");
                    m29005E();
                }
            } else if (f28293v) {
                setResult(0);
                m29003C(12502);
            } else {
                f28293v = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f28295r);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f28294q = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    m29003C(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f28296s);
        if (this.f28296s) {
            bundle.putInt("signInResultCode", this.f28297t);
            bundle.putParcelable("signInResultData", this.f28298u);
        }
    }
}
