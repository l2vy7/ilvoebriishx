package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.appnext.core.C3148Ad;
import com.ironsource.environment.C4979h;
import com.ironsource.sdk.controller.C11618w;
import com.ironsource.sdk.p287a.C11516a;
import com.ironsource.sdk.p287a.C11520d;
import com.ironsource.sdk.p287a.C11522f;
import com.ironsource.sdk.p289c.C11539d;
import com.ironsource.sdk.p290d.C11675b;
import com.ironsource.sdk.p294g.C11700b;
import com.ironsource.sdk.p294g.C11703d;
import com.ironsource.sdk.p296i.C11718a;
import com.ironsource.sdk.p297j.C11730g;
import com.ironsource.sdk.utils.C11759d;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;

public class ControllerActivity extends Activity implements C11617v, C11730g {

    /* renamed from: n */
    private static final String f51886n = "ControllerActivity";

    /* renamed from: o */
    private static String f51887o = "removeWebViewContainerView | mContainer is null";

    /* renamed from: p */
    private static String f51888p = "removeWebViewContainerView | view is null";

    /* renamed from: b */
    private String f51889b;

    /* renamed from: c */
    private C11618w f51890c;
    public int currentRequestedRotation = -1;

    /* renamed from: d */
    private RelativeLayout f51891d;

    /* renamed from: e */
    private FrameLayout f51892e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f51893f = false;

    /* renamed from: g */
    private String f51894g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f51895h = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Runnable f51896i = new C11543a();

    /* renamed from: j */
    private RelativeLayout.LayoutParams f51897j = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: k */
    private C11700b f51898k;

    /* renamed from: l */
    private boolean f51899l;

    /* renamed from: m */
    private boolean f51900m;

    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$a */
    class C11543a implements Runnable {
        C11543a() {
        }

        public final void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f51893f));
        }
    }

    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$b */
    class C11544b implements View.OnSystemUiVisibilityChangeListener {
        C11544b() {
        }

        public final void onSystemUiVisibilityChange(int i) {
            if ((i & 4098) == 0) {
                ControllerActivity.this.f51895h.removeCallbacks(ControllerActivity.this.f51896i);
                ControllerActivity.this.f51895h.postDelayed(ControllerActivity.this.f51896i, 500);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$c */
    class C11545c implements Runnable {
        C11545c() {
        }

        public final void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$d */
    class C11546d implements Runnable {
        C11546d() {
        }

        public final void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    /* renamed from: a */
    private void m51424a() {
        String str = f51886n;
        Logger.m51953i(str, "clearWebviewController");
        C11618w wVar = this.f51890c;
        if (wVar == null) {
            Logger.m51953i(str, "clearWebviewController, null");
            return;
        }
        wVar.f52166y = C11618w.C11653g.Gone;
        wVar.f52129H = null;
        wVar.f52153l0 = null;
        wVar.mo44784a(this.f51894g, "onDestroy");
    }

    /* renamed from: b */
    private void m51425b(String str) {
        if (str == null) {
            return;
        }
        if (C3148Ad.ORIENTATION_LANDSCAPE.equalsIgnoreCase(str)) {
            m51428e();
        } else if (C3148Ad.ORIENTATION_PORTRAIT.equalsIgnoreCase(str)) {
            m51430g();
        } else if ("device".equalsIgnoreCase(str)) {
            if (C4979h.m22825r(this)) {
                setRequestedOrientation(1);
            }
        } else if (getRequestedOrientation() == -1) {
            setRequestedOrientation(4);
        }
    }

    /* renamed from: e */
    private void m51428e() {
        int l = C4979h.m22813l(this);
        String str = f51886n;
        Logger.m51953i(str, "setInitiateLandscapeOrientation");
        if (l == 0) {
            Logger.m51953i(str, "ROTATION_0");
            setRequestedOrientation(0);
        } else if (l == 2) {
            Logger.m51953i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (l == 3) {
            Logger.m51953i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (l == 1) {
            Logger.m51953i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        } else {
            Logger.m51953i(str, "No Rotation");
        }
    }

    /* renamed from: g */
    private void m51430g() {
        int l = C4979h.m22813l(this);
        String str = f51886n;
        Logger.m51953i(str, "setInitiatePortraitOrientation");
        if (l == 0) {
            Logger.m51953i(str, "ROTATION_0");
            setRequestedOrientation(1);
        } else if (l == 2) {
            Logger.m51953i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (l == 1) {
            Logger.m51953i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (l == 3) {
            Logger.m51953i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        } else {
            Logger.m51953i(str, "No Rotation");
        }
    }

    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        Logger.m51953i(f51886n, "onBackPressed");
        new C11718a();
        if (!C11718a.m51847a(this)) {
            super.onBackPressed();
        }
    }

    public void onCloseRequested() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Logger.m51953i(f51886n, "onCreate");
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            C11618w wVar = (C11618w) C11675b.m51709a((Context) this).f52282a.f51962a;
            this.f51890c = wVar;
            wVar.f52165x.setId(1);
            C11618w wVar2 = this.f51890c;
            wVar2.f52153l0 = this;
            wVar2.f52129H = this;
            Intent intent = getIntent();
            this.f51894g = intent.getStringExtra("productType");
            this.f51893f = intent.getBooleanExtra("immersive", false);
            this.f51889b = intent.getStringExtra("adViewId");
            this.f51899l = false;
            this.f51900m = intent.getBooleanExtra("ctrWVPauseResume", false);
            if (this.f51893f) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new C11544b());
                runOnUiThread(this.f51896i);
            }
            if (!TextUtils.isEmpty(this.f51894g) && C11703d.C11708e.OfferWall.toString().equalsIgnoreCase(this.f51894g)) {
                if (bundle != null) {
                    C11700b bVar = (C11700b) bundle.getParcelable("state");
                    if (bVar != null) {
                        this.f51898k = bVar;
                        this.f51890c.mo44783a(bVar);
                    }
                    finish();
                } else {
                    this.f51898k = this.f51890c.f52130I;
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f51891d = relativeLayout;
            setContentView(relativeLayout, this.f51897j);
            String str = this.f51889b;
            this.f51892e = !(!TextUtils.isEmpty(str) && !str.equals(Integer.toString(1))) ? this.f51890c.f52165x : C11759d.m51980a(getApplicationContext(), C11539d.m51410a().mo44638a(str));
            if (this.f51891d.findViewById(1) == null && this.f51892e.getParent() != null) {
                finish();
            }
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("orientation_set_flag");
            intent2.getIntExtra("rotation_set_flag", 0);
            m51425b(stringExtra);
            this.f51891d.addView(this.f51892e, this.f51897j);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Logger.m51953i(f51886n, "onDestroy");
        try {
            if (this.f51891d != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f51892e.getParent();
                View findViewById = this.f51889b == null ? viewGroup2.findViewById(1) : C11539d.m51410a().mo44638a(this.f51889b);
                if (findViewById != null) {
                    if (isFinishing() && (viewGroup = (ViewGroup) findViewById.getParent()) != null) {
                        viewGroup.removeView(findViewById);
                    }
                    viewGroup2.removeView(this.f51892e);
                    if (!this.f51899l) {
                        Logger.m51953i(f51886n, "onDestroy | destroyedFromBackground");
                        m51424a();
                        return;
                    }
                    return;
                }
                throw new Exception(f51888p);
            }
            throw new Exception(f51887o);
        } catch (Exception e) {
            C11520d.m51360a(C11522f.f51818q, (Map<String, Object>) new C11516a().mo44598a("callfailreason", e.getMessage()).f51793a);
            String str = f51886n;
            Logger.m51953i(str, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C11618w wVar = this.f51890c;
            if (wVar.f52162u != null) {
                wVar.f52161t.onHideCustomView();
                return true;
            }
        }
        if (this.f51893f && (i == 25 || i == 24)) {
            this.f51895h.removeCallbacks(this.f51896i);
            this.f51895h.postDelayed(this.f51896i, 500);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onOrientationChanged(String str, int i) {
        m51425b(str);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        String str = f51886n;
        Logger.m51953i(str, "onPause, isFinishing=" + isFinishing());
        try {
            ((AudioManager) getSystemService("audio")).abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        C11618w wVar = this.f51890c;
        if (wVar != null) {
            wVar.mo44717b((Context) this);
            if (!this.f51900m) {
                this.f51890c.mo44791i();
            }
            this.f51890c.mo44785a(false, "main");
            this.f51890c.mo44784a(this.f51894g, "onPause");
        }
        if (isFinishing()) {
            this.f51899l = true;
            m51424a();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Logger.m51953i(f51886n, "onResume");
        C11618w wVar = this.f51890c;
        if (wVar != null) {
            wVar.mo44703a((Context) this);
            if (!this.f51900m) {
                this.f51890c.mo44792j();
            }
            this.f51890c.mo44785a(true, "main");
            this.f51890c.mo44784a(this.f51894g, "onResume");
        }
        ((AudioManager) getSystemService("audio")).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 2);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f51894g) && C11703d.C11708e.OfferWall.toString().equalsIgnoreCase(this.f51894g)) {
            C11700b bVar = this.f51898k;
            bVar.f52374d = true;
            bundle.putParcelable("state", bVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Logger.m51953i(f51886n, "onStart");
        C11618w wVar = this.f51890c;
        if (wVar != null) {
            wVar.mo44784a(this.f51894g, "onStart");
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Logger.m51953i(f51886n, "onStop");
        C11618w wVar = this.f51890c;
        if (wVar != null) {
            wVar.mo44784a(this.f51894g, "onStop");
        }
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.m51953i(f51886n, "onUserLeaveHint");
        C11618w wVar = this.f51890c;
        if (wVar != null) {
            wVar.mo44784a(this.f51894g, "onUserLeaveHint");
        }
    }

    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f51893f && z) {
            runOnUiThread(this.f51896i);
        }
    }

    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            String str = f51886n;
            Logger.m51953i(str, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        runOnUiThread(z ? new C11545c() : new C11546d());
    }
}
