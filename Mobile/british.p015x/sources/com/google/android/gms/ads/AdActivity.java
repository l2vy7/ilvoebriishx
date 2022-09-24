package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.yg0;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdActivity extends Activity {
    @RecentlyNonNull
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";

    /* renamed from: b */
    private yg0 f27722b;

    /* renamed from: a */
    private final void m28774a() {
        yg0 yg0 = this.f27722b;
        if (yg0 != null) {
            try {
                yg0.zzv();
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, @RecentlyNonNull Intent intent) {
        try {
            yg0 yg0 = this.f27722b;
            if (yg0 != null) {
                yg0.zzg(i, i2, intent);
            }
        } catch (Exception e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        try {
            yg0 yg0 = this.f27722b;
            if (yg0 != null && !yg0.zzE()) {
                return;
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            yg0 yg02 = this.f27722b;
            if (yg02 != null) {
                yg02.zzh();
            }
        } catch (RemoteException e2) {
            co0.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            yg0 yg0 = this.f27722b;
            if (yg0 != null) {
                yg0.zzj(C10489b.m48195m6(configuration));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yg0 n = C8241uv.m38462a().mo34800n(this);
        this.f27722b = n;
        if (n != null) {
            try {
                n.zzk(bundle);
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
                finish();
            }
        } else {
            co0.zzl("#007 Could not call remote method.", (Throwable) null);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            yg0 yg0 = this.f27722b;
            if (yg0 != null) {
                yg0.zzl();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            yg0 yg0 = this.f27722b;
            if (yg0 != null) {
                yg0.zzn();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            yg0 yg0 = this.f27722b;
            if (yg0 != null) {
                yg0.zzo();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            yg0 yg0 = this.f27722b;
            if (yg0 != null) {
                yg0.zzp();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        try {
            yg0 yg0 = this.f27722b;
            if (yg0 != null) {
                yg0.zzq(bundle);
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            yg0 yg0 = this.f27722b;
            if (yg0 != null) {
                yg0.zzr();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            yg0 yg0 = this.f27722b;
            if (yg0 != null) {
                yg0.zzs();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            yg0 yg0 = this.f27722b;
            if (yg0 != null) {
                yg0.zzt();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        m28774a();
    }

    public final void setContentView(@RecentlyNonNull View view) {
        super.setContentView(view);
        m28774a();
    }

    public final void setContentView(@RecentlyNonNull View view, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m28774a();
    }
}
