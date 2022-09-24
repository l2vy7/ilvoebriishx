package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.us2;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzm extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ zzs f27963a;

    zzm(zzs zzs) {
        this.f27963a = zzs;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f27963a.f19887h != null) {
            try {
                this.f27963a.f19887h.mo30548m(us2.m38446d(1, (String) null, (zzbew) null));
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
        if (this.f27963a.f19887h != null) {
            try {
                this.f27963a.f19887h.mo30547l(0);
            } catch (RemoteException e2) {
                co0.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f27963a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (this.f27963a.f19887h != null) {
                try {
                    this.f27963a.f19887h.mo30548m(us2.m38446d(3, (String) null, (zzbew) null));
                } catch (RemoteException e) {
                    co0.zzl("#007 Could not call remote method.", e);
                }
            }
            if (this.f27963a.f19887h != null) {
                try {
                    this.f27963a.f19887h.mo30547l(3);
                } catch (RemoteException e2) {
                    co0.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.f27963a.mo17655n6(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (this.f27963a.f19887h != null) {
                try {
                    this.f27963a.f19887h.mo30548m(us2.m38446d(1, (String) null, (zzbew) null));
                } catch (RemoteException e3) {
                    co0.zzl("#007 Could not call remote method.", e3);
                }
            }
            if (this.f27963a.f19887h != null) {
                try {
                    this.f27963a.f19887h.mo30547l(0);
                } catch (RemoteException e4) {
                    co0.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.f27963a.mo17655n6(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            if (this.f27963a.f19887h != null) {
                try {
                    this.f27963a.f19887h.zzi();
                } catch (RemoteException e5) {
                    co0.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.f27963a.mo17655n6(this.f27963a.mo17654a(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f27963a.f19887h != null) {
                try {
                    this.f27963a.f19887h.zzc();
                    this.f27963a.f19887h.zzh();
                } catch (RemoteException e6) {
                    co0.zzl("#007 Could not call remote method.", e6);
                }
            }
            zzs.m19826w6(this.f27963a, zzs.m19823t6(this.f27963a, str));
            return true;
        }
    }
}
