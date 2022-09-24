package british.p015x;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import british.p015x.C1692config;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyAppOptions;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyZone;
import com.appnext.ads.interstitial.Interstitial;
import com.appnext.base.Appnext;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.AppnextError;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.nativeads.AdLoader;
import com.appnext.nativeads.NativeAd;
import com.appnext.nativeads.NativeAdListener;
import com.appnext.nativeads.NativeAdRequest;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.C7190a;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.ads.nativead.NativeAdPreferences;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import p251s5.C10971b;
import p273b9.C11188h;
import p311h9.C12773l;
import p314j8.C12796d;
import p316k8.C12819a;
import p318l8.C12831e;

/* renamed from: british.x.preinicio */
public class preinicio extends Activity {

    /* renamed from: A */
    ProgressDialog f8073A;

    /* renamed from: B */
    ProgressDialog f8074B;

    /* renamed from: C */
    ProgressDialog f8075C;

    /* renamed from: D */
    AlertDialog.Builder f8076D;

    /* renamed from: E */
    Bitmap f8077E = null;

    /* renamed from: F */
    Bitmap f8078F = null;

    /* renamed from: G */
    SharedPreferences f8079G;

    /* renamed from: H */
    Bundle f8080H;

    /* renamed from: I */
    Thread f8081I;

    /* renamed from: J */
    CheckBox f8082J;

    /* renamed from: K */
    EditText f8083K;

    /* renamed from: L */
    C10971b f8084L;

    /* renamed from: b */
    C1692config f8085b;

    /* renamed from: c */
    String f8086c = "";

    /* renamed from: d */
    String f8087d = "";

    /* renamed from: e */
    String f8088e = "";

    /* renamed from: f */
    String f8089f;

    /* renamed from: g */
    String f8090g;

    /* renamed from: h */
    String f8091h;

    /* renamed from: i */
    String f8092i = "splash_ani.gif";

    /* renamed from: j */
    Map<String, String> f8093j;

    /* renamed from: k */
    long f8094k;

    /* renamed from: l */
    int f8095l;

    /* renamed from: m */
    int f8096m;

    /* renamed from: n */
    int f8097n;

    /* renamed from: o */
    int f8098o;

    /* renamed from: p */
    boolean f8099p = true;

    /* renamed from: q */
    boolean f8100q = false;

    /* renamed from: r */
    boolean f8101r = false;

    /* renamed from: s */
    boolean f8102s;

    /* renamed from: t */
    boolean f8103t;

    /* renamed from: u */
    boolean f8104u;

    /* renamed from: v */
    boolean f8105v = false;

    /* renamed from: w */
    boolean f8106w = false;

    /* renamed from: x */
    boolean f8107x = false;

    /* renamed from: y */
    boolean f8108y = false;

    /* renamed from: z */
    boolean f8109z = false;

    /* renamed from: british.x.preinicio$a */
    class C1903a implements RewardedVideoListener {

        /* renamed from: a */
        boolean f8110a;

        C1903a() {
        }

        /* renamed from: a */
        private void m8435a() {
            Context context;
            View view;
            C1692config config = preinicio.this.f8085b;
            if (config != null && (context = config.f7304a4) != null && (view = config.f7310b4) != null) {
                ((C1592a) context).abrir_secc(view);
                C1692config config2 = preinicio.this.f8085b;
                config2.f7304a4 = null;
                config2.f7310b4 = null;
            }
        }

        public void onRewardedVideoAdClicked(Placement placement) {
        }

        public void onRewardedVideoAdClosed() {
            Context context;
            if (this.f8110a) {
                C1692config config = preinicio.this.f8085b;
                if (!(config == null || (context = config.f7304a4) == null || config.f7310b4 == null)) {
                    C1692config.m8175Y0(context);
                }
                m8435a();
                return;
            }
            C1692config config2 = preinicio.this.f8085b;
            if (config2 != null) {
                config2.f7304a4 = null;
                config2.f7310b4 = null;
            }
        }

        public void onRewardedVideoAdEnded() {
        }

        public void onRewardedVideoAdOpened() {
            this.f8110a = false;
        }

        public void onRewardedVideoAdRewarded(Placement placement) {
            this.f8110a = true;
        }

        public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
            this.f8110a = false;
            m8435a();
        }

        public void onRewardedVideoAdStarted() {
        }

        public void onRewardedVideoAvailabilityChanged(boolean z) {
        }
    }

    /* renamed from: british.x.preinicio$a0 */
    class C1904a0 implements OnAdError {
        C1904a0() {
        }

        public void adError(String str) {
            C1692config.f7133g6 = null;
        }
    }

    /* renamed from: british.x.preinicio$a1 */
    private class C1905a1 extends AsyncTask<String, Void, Byte> {
        private C1905a1() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/comprobar_contra_app.php?v=1&idapp=" + 2261075 + "&idusu=" + preinicio.this.f8094k);
            StringBuilder sb = new StringBuilder();
            try {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new C12773l("contra", preinicio.this.f8089f));
                eVar.mo47986B(new C12819a(arrayList));
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo43518a(eVar).mo47805b().mo43577k()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                if (sb.indexOf("ANDROID:KO") != -1) {
                    return (byte) 2;
                }
                if (sb.indexOf("ANDROID:OK") != -1) {
                    return (byte) 1;
                }
                return (byte) 0;
            } catch (C12796d unused) {
                return (byte) 0;
            } catch (IOException unused2) {
                return (byte) 0;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            try {
                preinicio.this.f8075C.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() == 1) {
                if (preinicio.this.f8079G.getBoolean("pwd_nomostrarmas_def", true)) {
                    SharedPreferences.Editor edit = preinicio.this.f8079G.edit();
                    edit.putBoolean("pwd_validado", true);
                    edit.commit();
                }
                preinicio.this.m8417o();
            } else if (b.byteValue() == 2) {
                preinicio preinicio = preinicio.this;
                preinicio.f8105v = true;
                preinicio.mo7814C();
            } else {
                preinicio preinicio2 = preinicio.this;
                preinicio2.mo7830y(preinicio2.getString(R.string.error_http_tit), preinicio.this.getString(R.string.error_http));
            }
        }
    }

    /* renamed from: british.x.preinicio$b */
    class C1906b extends NativeAdListener {
        C1906b() {
        }

        public void onAdLoaded(NativeAd nativeAd, AppnextAdCreativeType appnextAdCreativeType) {
            super.onAdLoaded(nativeAd, appnextAdCreativeType);
            try {
                preinicio.this.f8085b.f7463y5.add(nativeAd);
            } catch (Exception unused) {
            }
        }

        public void onError(NativeAd nativeAd, AppnextError appnextError) {
            super.onError(nativeAd, appnextError);
        }
    }

    /* renamed from: british.x.preinicio$b0 */
    class C1907b0 implements AdDisplayListener {
        C1907b0() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            C1692config.f7135i6 = null;
            preinicio.this.mo7815E();
        }

        public void adNotDisplayed(C5041Ad ad) {
            C1692config.f7135i6 = null;
            preinicio.this.mo7815E();
        }
    }

    /* renamed from: british.x.preinicio$c */
    class C1908c implements AdEventListener {

        /* renamed from: b */
        final /* synthetic */ StartAppNativeAd f8116b;

        C1908c(StartAppNativeAd startAppNativeAd) {
            this.f8116b = startAppNativeAd;
        }

        public void onFailedToReceiveAd(C5041Ad ad) {
        }

        public void onReceiveAd(C5041Ad ad) {
            preinicio.this.f8085b.f7470z5 = this.f8116b.getNativeAds();
        }
    }

    /* renamed from: british.x.preinicio$c0 */
    class C1909c0 implements AdEventListener {

        /* renamed from: british.x.preinicio$c0$a */
        class C1910a implements AdDisplayListener {
            C1910a() {
            }

            public void adClicked(C5041Ad ad) {
            }

            public void adDisplayed(C5041Ad ad) {
            }

            public void adHidden(C5041Ad ad) {
                C1692config.f7135i6 = null;
            }

            public void adNotDisplayed(C5041Ad ad) {
                C1692config.f7135i6 = null;
            }
        }

        C1909c0() {
        }

        public void onFailedToReceiveAd(C5041Ad ad) {
            C1692config.f7135i6 = null;
        }

        public void onReceiveAd(C5041Ad ad) {
            if (C1692config.f7135i6 != null) {
                C1692config.f7135i6.showAd(C1692config.f7139m6 == 1 ? "Intersticial entrada" : "INTERSTITIAL", new C1910a());
            }
        }
    }

    /* renamed from: british.x.preinicio$d */
    class C1911d implements IUnityAdsInitializationListener {
        C1911d() {
        }

        public void onInitializationComplete() {
        }

        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        }
    }

    /* renamed from: british.x.preinicio$d0 */
    class C1912d0 extends AdColonyInterstitialListener {
        C1912d0() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            preinicio.this.mo7815E();
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            preinicio.this.mo7815E();
        }
    }

    /* renamed from: british.x.preinicio$e */
    class C1913e implements DialogInterface.OnClickListener {
        C1913e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            preinicio preinicio = preinicio.this;
            if (preinicio.f8085b.f7252R4 && preinicio.f8082J.isChecked()) {
                SharedPreferences.Editor edit = preinicio.this.f8079G.edit();
                edit.putBoolean("bienvenida_nomas", true);
                edit.commit();
            }
            preinicio.this.m8402F();
        }
    }

    /* renamed from: british.x.preinicio$e0 */
    class C1914e0 implements DialogInterface.OnClickListener {
        C1914e0() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            preinicio.this.finish();
        }
    }

    /* renamed from: british.x.preinicio$f */
    class C1915f extends Thread {

        /* renamed from: british.x.preinicio$f$a */
        class C1916a implements Runnable {

            /* renamed from: british.x.preinicio$f$a$a */
            class C1917a implements DialogInterface.OnShowListener {

                /* renamed from: a */
                final /* synthetic */ AlertDialog f8126a;

                C1917a(AlertDialog alertDialog) {
                    this.f8126a = alertDialog;
                }

                public void onShow(DialogInterface dialogInterface) {
                    Button button = this.f8126a.getButton(-1);
                    button.setTextColor(Color.parseColor("#" + preinicio.this.f8090g));
                }
            }

            C1916a() {
            }

            public void run() {
                preinicio preinicio = preinicio.this;
                if (preinicio.f8100q) {
                    AlertDialog create = preinicio.f8076D.create();
                    if (!preinicio.this.f8090g.equals("")) {
                        create.setOnShowListener(new C1917a(create));
                    }
                    try {
                        create.show();
                        if (!preinicio.this.f8085b.f7252R4) {
                            try {
                                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                        preinicio.this.m8402F();
                    }
                } else {
                    preinicio.m8402F();
                }
            }
        }

        C1915f() {
        }

        public void run() {
            try {
                Thread.sleep((long) preinicio.this.f8085b.f7443w);
            } catch (InterruptedException unused) {
            }
            preinicio.this.runOnUiThread(new C1916a());
        }
    }

    /* renamed from: british.x.preinicio$f0 */
    class C1918f0 implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8128a;

        C1918f0(AlertDialog alertDialog) {
            this.f8128a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8128a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + preinicio.this.f8090g));
        }
    }

    /* renamed from: british.x.preinicio$g */
    class C1919g implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8130a;

        C1919g(AlertDialog alertDialog) {
            this.f8130a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8130a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + preinicio.this.f8090g));
        }
    }

    /* renamed from: british.x.preinicio$g0 */
    class C1920g0 implements View.OnTouchListener {
        C1920g0() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return motionEvent.getAction() == 2;
        }
    }

    /* renamed from: british.x.preinicio$h */
    class C1921h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ RatingBar f8133b;

        C1921h(RatingBar ratingBar) {
            this.f8133b = ratingBar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SharedPreferences.Editor edit = preinicio.this.f8079G.edit();
            edit.putInt("rt_n", -1);
            edit.commit();
            preinicio preinicio = preinicio.this;
            int i2 = preinicio.f8085b.f7300Z4;
            if (i2 == 0) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + preinicio.this.getPackageName()));
                intent.addFlags(1208483840);
                preinicio preinicio2 = preinicio.this;
                preinicio2.f8106w = true;
                try {
                    preinicio2.startActivity(intent);
                } catch (Exception unused) {
                    preinicio preinicio3 = preinicio.this;
                    preinicio3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + preinicio.this.getPackageName())));
                }
            } else if (i2 == 1) {
                String string = Settings.Secure.getString(preinicio.getContentResolver(), "android_id");
                new C1692config.C1728p0(C1692config.f7109I5 + "/srv/rate.php?idusu=" + preinicio.this.f8094k + "&cod_g=" + preinicio.this.f8091h + "&aid=" + string + "&r=" + this.f8133b.getRating(), "Android Vinebre Software").execute(new String[0]);
                preinicio.this.m8401D();
            }
        }
    }

    /* renamed from: british.x.preinicio$h0 */
    class C1922h0 implements DialogInterface.OnShowListener {
        C1922h0() {
        }

        public void onShow(DialogInterface dialogInterface) {
            C1692config.m8168S0((ProgressBar) preinicio.this.f8073A.findViewById(16908301), preinicio.this.f8088e);
        }
    }

    /* renamed from: british.x.preinicio$i */
    class C1923i implements DialogInterface.OnClickListener {
        C1923i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            preinicio.this.m8401D();
        }
    }

    /* renamed from: british.x.preinicio$i0 */
    class C1924i0 implements DialogInterface.OnClickListener {

        /* renamed from: british.x.preinicio$i0$a */
        class C1925a implements DialogInterface.OnShowListener {
            C1925a() {
            }

            public void onShow(DialogInterface dialogInterface) {
                C1692config.m8168S0((ProgressBar) preinicio.this.f8075C.findViewById(16908301), preinicio.this.f8088e);
            }
        }

        C1924i0() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SharedPreferences.Editor edit = preinicio.this.f8079G.edit();
            if (preinicio.this.f8082J.isChecked()) {
                edit.putBoolean("pwd_nomostrarmas_def", true);
            } else {
                edit.putBoolean("pwd_nomostrarmas_def", false);
            }
            edit.commit();
            preinicio.this.f8075C = new ProgressDialog(preinicio.this);
            preinicio preinicio = preinicio.this;
            preinicio.f8075C.setMessage(preinicio.getString(R.string.comprobando));
            preinicio.this.f8075C.setIndeterminate(true);
            if (Build.VERSION.SDK_INT > 20 && !preinicio.this.f8088e.equals("")) {
                preinicio.this.f8075C.setOnShowListener(new C1925a());
            }
            try {
                preinicio.this.f8075C.show();
            } catch (Exception unused) {
            }
            preinicio preinicio2 = preinicio.this;
            preinicio2.f8089f = preinicio2.f8083K.getText().toString();
            new C1905a1().execute(new String[0]);
        }
    }

    /* renamed from: british.x.preinicio$j */
    class C1926j implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8139a;

        C1926j(AlertDialog alertDialog) {
            this.f8139a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8139a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + preinicio.this.f8090g));
            Button button2 = this.f8139a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + preinicio.this.f8090g));
        }
    }

    /* renamed from: british.x.preinicio$j0 */
    class C1927j0 implements DialogInterface.OnClickListener {
        C1927j0() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            preinicio.this.finish();
        }
    }

    /* renamed from: british.x.preinicio$k */
    class C1928k implements DialogInterface.OnClickListener {
        C1928k() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            preinicio.this.finish();
        }
    }

    /* renamed from: british.x.preinicio$k0 */
    class C1929k0 implements DialogInterface.OnCancelListener {
        C1929k0() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            preinicio.this.finish();
        }
    }

    /* renamed from: british.x.preinicio$l */
    class C1930l extends NativeAdListener {
        C1930l() {
        }

        public void adImpression(NativeAd nativeAd) {
            super.adImpression(nativeAd);
        }

        public void onAdClicked(NativeAd nativeAd) {
            super.onAdClicked(nativeAd);
        }

        public void onAdLoaded(NativeAd nativeAd, AppnextAdCreativeType appnextAdCreativeType) {
            super.onAdLoaded(nativeAd, appnextAdCreativeType);
            preinicio.this.m8415k(Boolean.FALSE, nativeAd);
        }

        public void onError(NativeAd nativeAd, AppnextError appnextError) {
            super.onError(nativeAd, appnextError);
            preinicio.this.findViewById(R.id.progressBar).setVisibility(8);
            preinicio preinicio = preinicio.this;
            if (!preinicio.f8101r) {
                C1692config.f7133g6 = null;
                preinicio.f8101r = true;
                preinicio.mo7815E();
            }
        }
    }

    /* renamed from: british.x.preinicio$l0 */
    class C1931l0 implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8145a;

        C1931l0(AlertDialog alertDialog) {
            this.f8145a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8145a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + preinicio.this.f8090g));
            Button button2 = this.f8145a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + preinicio.this.f8090g));
        }
    }

    /* renamed from: british.x.preinicio$m */
    class C1932m implements View.OnClickListener {
        C1932m() {
        }

        public void onClick(View view) {
            preinicio preinicio = preinicio.this;
            if (!preinicio.f8101r) {
                preinicio.f8101r = true;
                preinicio.mo7815E();
            }
        }
    }

    /* renamed from: british.x.preinicio$m0 */
    class C1933m0 implements DialogInterface.OnCancelListener {
        C1933m0() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            try {
                preinicio.this.f8081I.interrupt();
            } catch (Exception unused) {
            }
            preinicio.this.finish();
        }
    }

    /* renamed from: british.x.preinicio$n */
    class C1934n implements View.OnClickListener {
        C1934n() {
        }

        public void onClick(View view) {
            preinicio.this.m8414j();
        }
    }

    /* renamed from: british.x.preinicio$n0 */
    class C1935n0 extends Handler {
        C1935n0() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            preinicio preinicio = preinicio.this;
            int i = preinicio.f8096m;
            if (i > 0) {
                preinicio.f8096m = i - 1;
                try {
                    ProgressDialog progressDialog = preinicio.f8074B;
                    progressDialog.setMessage(preinicio.this.f8096m + "s.");
                } catch (Exception unused) {
                }
                preinicio preinicio2 = preinicio.this;
                if (preinicio2.f8096m == 0) {
                    preinicio2.m8404H();
                }
            }
        }
    }

    /* renamed from: british.x.preinicio$o */
    class C1936o implements View.OnClickListener {
        C1936o() {
        }

        public void onClick(View view) {
            preinicio.this.m8414j();
        }
    }

    /* renamed from: british.x.preinicio$o0 */
    class C1937o0 implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Handler f8152b;

        C1937o0(Handler handler) {
            this.f8152b = handler;
        }

        public void run() {
            while (preinicio.this.f8096m > 0) {
                try {
                    Thread.sleep(1000);
                    Handler handler = this.f8152b;
                    handler.sendMessage(handler.obtainMessage());
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: british.x.preinicio$p */
    class C1938p implements View.OnClickListener {
        C1938p() {
        }

        public void onClick(View view) {
            preinicio.this.m8414j();
        }
    }

    /* renamed from: british.x.preinicio$p0 */
    class C1939p0 implements DialogInterface.OnClickListener {
        C1939p0() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            preinicio.this.finish();
        }
    }

    /* renamed from: british.x.preinicio$q */
    class C1940q implements View.OnClickListener {
        C1940q() {
        }

        public void onClick(View view) {
            preinicio.this.m8414j();
        }
    }

    /* renamed from: british.x.preinicio$q0 */
    class C1941q0 implements DialogInterface.OnClickListener {
        C1941q0() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SharedPreferences.Editor edit = preinicio.this.f8079G.edit();
            edit.putBoolean("cookies_aceptado", true);
            edit.commit();
            preinicio.this.m8403G();
        }
    }

    /* renamed from: british.x.preinicio$r */
    class C1942r implements View.OnClickListener {
        C1942r() {
        }

        public void onClick(View view) {
            preinicio.this.m8414j();
        }
    }

    /* renamed from: british.x.preinicio$r0 */
    class C1943r0 implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8159a;

        C1943r0(AlertDialog alertDialog) {
            this.f8159a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8159a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + preinicio.this.f8090g));
            Button button2 = this.f8159a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + preinicio.this.f8090g));
        }
    }

    /* renamed from: british.x.preinicio$s */
    class C1944s implements View.OnClickListener {
        C1944s() {
        }

        public void onClick(View view) {
            preinicio.this.m8414j();
        }
    }

    /* renamed from: british.x.preinicio$s0 */
    private class C1945s0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: british.x.preinicio$s0$a */
        class C1946a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ String f8163b;

            C1946a(String str) {
                this.f8163b = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                preinicio.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://apk.e-droid.net/apk/app2261075" + "-n6uezi" + ".apk?v=" + this.f8163b)));
                preinicio.this.finish();
            }
        }

        /* renamed from: british.x.preinicio$s0$b */
        class C1947b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f8165a;

            C1947b(AlertDialog alertDialog) {
                this.f8165a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f8165a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + preinicio.this.f8090g));
            }
        }

        /* renamed from: british.x.preinicio$s0$c */
        class C1948c implements OnSuccessListener<Location> {
            C1948c() {
            }

            /* renamed from: a */
            public void onSuccess(Location location) {
                if (location != null) {
                    String str = location.getLatitude() + "";
                    String str2 = location.getLongitude() + "";
                    SharedPreferences sharedPreferences = preinicio.this.getSharedPreferences("sh", 0);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("x", str);
                    edit.putString("y", str2);
                    edit.commit();
                    long j = sharedPreferences.getLong("idusu", 0);
                    String string = sharedPreferences.getString("cod", "");
                    if (j != 0 && !string.equals("")) {
                        new C1692config.C1728p0(C1692config.f7109I5 + "/srv/guardarpos.php?idusu=" + j + "&c=" + string + "&x=" + str + "&y=" + str2, "Android Vinebre Software").execute(new String[0]);
                    }
                }
            }
        }

        private C1945s0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x01c1, code lost:
            r9.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x01bb */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x01c1  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01c7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r9) {
            /*
                r8 = this;
                british.x.preinicio r9 = british.p015x.preinicio.this
                boolean r0 = r9.f8107x
                r1 = 0
                java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
                if (r0 == 0) goto L_0x000c
                return r1
            L_0x000c:
                boolean r0 = r9.f8102s
                java.lang.String r2 = ""
                if (r0 == 0) goto L_0x0015
                java.lang.String r0 = "&recup_todo=1"
                goto L_0x0016
            L_0x0015:
                r0 = r2
            L_0x0016:
                android.content.SharedPreferences r9 = r9.f8079G
                java.lang.String r3 = "fultsync"
                java.lang.String r4 = "010100000000"
                java.lang.String r9 = r9.getString(r3, r4)
                british.x.preinicio r3 = british.p015x.preinicio.this
                android.os.Bundle r3 = r3.f8080H
                if (r3 == 0) goto L_0x0057
                java.lang.String r4 = "notif_id"
                java.lang.String r3 = r3.getString(r4)
                if (r3 == 0) goto L_0x0057
                british.x.preinicio r3 = british.p015x.preinicio.this
                android.os.Bundle r3 = r3.f8080H
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r5 = "0"
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x0057
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "&notif="
                r2.append(r3)
                british.x.preinicio r3 = british.p015x.preinicio.this
                android.os.Bundle r3 = r3.f8080H
                java.lang.String r3 = r3.getString(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
            L_0x0057:
                british.x.preinicio r3 = british.p015x.preinicio.this
                android.os.Bundle r3 = r3.f8080H
                r4 = 1
                if (r3 == 0) goto L_0x009b
                java.lang.String r5 = "idnotif_marcar"
                boolean r3 = r3.containsKey(r5)
                if (r3 == 0) goto L_0x009b
                british.x.preinicio r3 = british.p015x.preinicio.this
                android.content.SharedPreferences r3 = r3.f8079G
                android.content.SharedPreferences$Editor r3 = r3.edit()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "notif_"
                r6.append(r7)
                british.x.preinicio r7 = british.p015x.preinicio.this
                android.os.Bundle r7 = r7.f8080H
                int r5 = r7.getInt(r5)
                r6.append(r5)
                java.lang.String r5 = "_leida"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                r3.putBoolean(r5, r4)
                r3.commit()
                british.x.preinicio r3 = british.p015x.preinicio.this
                android.content.Context r3 = r3.getApplicationContext()
                british.p015x.C1692config.m8184e(r3)
            L_0x009b:
                british.x.preinicio r3 = british.p015x.preinicio.this
                android.content.ContentResolver r3 = r3.getContentResolver()
                java.lang.String r5 = "android_id"
                java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = british.p015x.C1692config.f7107G5
                r5.append(r6)
                java.lang.String r6 = "config.e-droid.net/srv/config.php?v="
                r5.append(r6)
                r6 = 144(0x90, float:2.02E-43)
                r5.append(r6)
                java.lang.String r6 = "&vname="
                r5.append(r6)
                british.x.preinicio r6 = british.p015x.preinicio.this
                java.lang.String r6 = british.p015x.C1692config.m8185e0(r6)
                r5.append(r6)
                java.lang.String r6 = "&idapp="
                r5.append(r6)
                r6 = 2261075(0x228053, float:3.168441E-39)
                r5.append(r6)
                java.lang.String r6 = "&idusu="
                r5.append(r6)
                british.x.preinicio r6 = british.p015x.preinicio.this
                long r6 = r6.f8094k
                r5.append(r6)
                java.lang.String r6 = "&cod_g="
                r5.append(r6)
                british.x.preinicio r6 = british.p015x.preinicio.this
                java.lang.String r6 = r6.f8091h
                r5.append(r6)
                java.lang.String r6 = "&gp="
                r5.append(r6)
                british.x.preinicio r6 = british.p015x.preinicio.this
                int r6 = r6.f8097n
                r5.append(r6)
                java.lang.String r6 = "&am="
                r5.append(r6)
                british.x.preinicio r6 = british.p015x.preinicio.this
                int r6 = r6.f8098o
                r5.append(r6)
                java.lang.String r6 = "&idl="
                r5.append(r6)
                java.util.Locale r6 = java.util.Locale.getDefault()
                java.lang.String r6 = r6.getLanguage()
                r5.append(r6)
                java.lang.String r6 = "&pa_env=1&pa="
                r5.append(r6)
                java.util.Locale r6 = java.util.Locale.getDefault()
                java.lang.String r6 = r6.getCountry()
                r5.append(r6)
                java.lang.String r6 = "&pn="
                r5.append(r6)
                british.x.preinicio r6 = british.p015x.preinicio.this
                java.lang.String r6 = r6.getPackageName()
                r5.append(r6)
                java.lang.String r6 = "&fus="
                r5.append(r6)
                r5.append(r9)
                r5.append(r0)
                r5.append(r2)
                java.lang.String r9 = "&aid="
                r5.append(r9)
                r5.append(r3)
                java.lang.String r9 = r5.toString()
                r0 = -1
                java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01cb }
                r2.<init>(r9)     // Catch:{ MalformedURLException -> 0x01cb }
                r9 = 0
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x01bb }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x01bb }
                r2.setDoInput(r4)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                r9 = 10000(0x2710, float:1.4013E-41)
                r2.setConnectTimeout(r9)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                r2.setReadTimeout(r9)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                java.lang.String r9 = "User-Agent"
                java.lang.String r3 = "Android Vinebre Software"
                r2.setRequestProperty(r9, r3)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                java.io.InputStream r9 = r2.getInputStream()     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                r4.<init>(r9)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                r9.<init>()     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            L_0x017e:
                java.lang.String r4 = r3.readLine()     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                if (r4 == 0) goto L_0x0199
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                r5.<init>()     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                r5.append(r4)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                java.lang.String r4 = "\n"
                r5.append(r4)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                r9.append(r4)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                goto L_0x017e
            L_0x0199:
                british.x.preinicio r3 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                r3.f8086c = r9     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                british.x.preinicio r9 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                java.lang.String r3 = r9.f8086c     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                java.lang.String r4 = "@EURO@"
                java.lang.String r5 = "€"
                java.lang.String r3 = r3.replace(r4, r5)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                r9.f8086c = r3     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
                r2.disconnect()
                return r1
            L_0x01b3:
                r9 = move-exception
                goto L_0x01c5
            L_0x01b5:
                r9 = r2
                goto L_0x01bb
            L_0x01b7:
                r0 = move-exception
                r2 = r9
                r9 = r0
                goto L_0x01c5
            L_0x01bb:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x01b7 }
                if (r9 == 0) goto L_0x01c4
                r9.disconnect()
            L_0x01c4:
                return r0
            L_0x01c5:
                if (r2 == 0) goto L_0x01ca
                r2.disconnect()
            L_0x01ca:
                throw r9
            L_0x01cb:
                r9 = move-exception
                r9.printStackTrace()
                java.lang.Byte r9 = java.lang.Byte.valueOf(r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.C1945s0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x0294 */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:188:0x16c1  */
        /* JADX WARNING: Removed duplicated region for block: B:191:0x172e  */
        /* JADX WARNING: Removed duplicated region for block: B:192:0x1746  */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x174e  */
        /* JADX WARNING: Removed duplicated region for block: B:306:0x216e  */
        /* JADX WARNING: Removed duplicated region for block: B:307:0x217a  */
        /* JADX WARNING: Removed duplicated region for block: B:326:0x1bff A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.Byte r26) {
            /*
                r25 = this;
                r1 = r25
                british.x.preinicio r0 = british.p015x.preinicio.this
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                r0.f8093j = r2
                british.x.preinicio r0 = british.p015x.preinicio.this
                java.lang.String r0 = r0.f8086c
                java.lang.String r2 = "\\]"
                java.lang.String[] r0 = r0.split(r2)
                british.x.preinicio r2 = british.p015x.preinicio.this
                r3 = 0
                r2.f8086c = r3
                r2 = 0
                r4 = 0
            L_0x001c:
                int r5 = r0.length
                java.lang.String r6 = ""
                r7 = 2
                r8 = 1
                if (r4 >= r5) goto L_0x0065
                r5 = r0[r4]
                java.lang.String r9 = "="
                java.lang.String[] r5 = r5.split(r9, r7)
                r0[r4] = r3
                int r7 = r5.length
                if (r7 <= 0) goto L_0x0062
                r7 = r5[r2]
                boolean r7 = r7.equals(r3)
                if (r7 != 0) goto L_0x0062
                r7 = r5[r2]
                int r7 = r7.length()
                if (r7 <= r8) goto L_0x0062
                r7 = r5[r2]
                java.lang.String r7 = r7.substring(r8)
                int r9 = r5.length
                if (r9 <= r8) goto L_0x005b
                r9 = r5[r8]
                boolean r9 = r9.equals(r3)
                if (r9 != 0) goto L_0x005b
                r9 = r5[r8]
                int r9 = r9.length()
                if (r9 <= 0) goto L_0x005b
                r6 = r5[r8]
            L_0x005b:
                british.x.preinicio r5 = british.p015x.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f8093j
                r5.put(r7, r6)
            L_0x0062:
                int r4 = r4 + 1
                goto L_0x001c
            L_0x0065:
                british.x.preinicio r0 = british.p015x.preinicio.this
                r0.mo7813B()
                british.x.preinicio r0 = british.p015x.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f8093j
                java.lang.String r4 = "FIN"
                boolean r0 = r0.containsKey(r4)
                if (r0 != 0) goto L_0x00a1
                british.x.preinicio r0 = british.p015x.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f8093j
                r0.clear()
                british.x.preinicio r0 = british.p015x.preinicio.this
                r0.f8099p = r2
                long r4 = r0.f8094k
                r9 = 0
                int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r11 == 0) goto L_0x008d
                boolean r4 = r0.f8102s
                if (r4 == 0) goto L_0x00a1
            L_0x008d:
                r2 = 2131820789(0x7f1100f5, float:1.9274303E38)
                java.lang.String r2 = r0.getString(r2)
                british.x.preinicio r3 = british.p015x.preinicio.this
                r4 = 2131820788(0x7f1100f4, float:1.92743E38)
                java.lang.String r3 = r3.getString(r4)
                r0.mo7830y(r2, r3)
                return
            L_0x00a1:
                british.x.preinicio r0 = british.p015x.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f8093j
                java.lang.String r4 = "sac"
                boolean r0 = r0.containsKey(r4)
                java.lang.String r4 = "sin_acceso"
                if (r0 == 0) goto L_0x00c9
                british.x.preinicio r0 = british.p015x.preinicio.this
                android.content.SharedPreferences r0 = r0.f8079G
                boolean r0 = r0.contains(r4)
                if (r0 != 0) goto L_0x00e2
                british.x.preinicio r0 = british.p015x.preinicio.this
                android.content.SharedPreferences r0 = r0.f8079G
                android.content.SharedPreferences$Editor r0 = r0.edit()
                android.content.SharedPreferences$Editor r0 = r0.putBoolean(r4, r8)
                r0.commit()
                goto L_0x00e2
            L_0x00c9:
                british.x.preinicio r0 = british.p015x.preinicio.this
                android.content.SharedPreferences r0 = r0.f8079G
                boolean r0 = r0.contains(r4)
                if (r0 == 0) goto L_0x00e2
                british.x.preinicio r0 = british.p015x.preinicio.this
                android.content.SharedPreferences r0 = r0.f8079G
                android.content.SharedPreferences$Editor r0 = r0.edit()
                android.content.SharedPreferences$Editor r0 = r0.remove(r4)
                r0.commit()
            L_0x00e2:
                british.x.preinicio r0 = british.p015x.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f8093j
                java.lang.String r4 = "APLICNODISP"
                boolean r0 = r0.containsKey(r4)
                if (r0 == 0) goto L_0x00fb
                british.x.preinicio r0 = british.p015x.preinicio.this
                r2 = 2131820787(0x7f1100f3, float:1.9274299E38)
                java.lang.String r2 = r0.getString(r2)
                r0.mo7830y(r6, r2)
                return
            L_0x00fb:
                british.x.preinicio r0 = british.p015x.preinicio.this
                java.lang.String r4 = "msg_err"
                java.lang.String r0 = r0.mo7822p(r4)
                boolean r4 = r0.equals(r6)
                if (r4 != 0) goto L_0x0117
                british.x.preinicio r2 = british.p015x.preinicio.this
                java.lang.String r3 = "msg_err_tit"
                java.lang.String r2 = r2.mo7822p(r3)
                british.x.preinicio r3 = british.p015x.preinicio.this
                r3.mo7830y(r2, r0)
                return
            L_0x0117:
                british.x.preinicio r0 = british.p015x.preinicio.this
                android.content.SharedPreferences r0 = r0.f8079G
                java.lang.String r4 = "imgs"
                java.lang.String r0 = r0.getString(r4, r6)
                british.x.preinicio r5 = british.p015x.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f8093j
                boolean r5 = r5.containsKey(r4)
                if (r5 == 0) goto L_0x0149
                british.x.preinicio r0 = british.p015x.preinicio.this
                java.lang.String r0 = r0.mo7822p(r4)
                boolean r5 = r0.equals(r6)
                if (r5 != 0) goto L_0x0151
                british.p015x.C1692config.f7108H5 = r0
                british.x.preinicio r5 = british.p015x.preinicio.this
                android.content.SharedPreferences r5 = r5.f8079G
                android.content.SharedPreferences$Editor r5 = r5.edit()
                android.content.SharedPreferences$Editor r0 = r5.putString(r4, r0)
                r0.apply()
                goto L_0x0151
            L_0x0149:
                boolean r4 = r0.equals(r6)
                if (r4 != 0) goto L_0x0151
                british.p015x.C1692config.f7108H5 = r0
            L_0x0151:
                british.x.preinicio r0 = british.p015x.preinicio.this
                boolean r4 = r0.f8107x
                if (r4 != 0) goto L_0x0201
                int r4 = r0.f8097n
                if (r4 != 0) goto L_0x0201
                android.os.Bundle r0 = r0.f8080H
                if (r0 == 0) goto L_0x017f
                java.lang.String r4 = "notif_id"
                java.lang.String r0 = r0.getString(r4)
                if (r0 != 0) goto L_0x0201
                british.x.preinicio r0 = british.p015x.preinicio.this
                android.os.Bundle r0 = r0.f8080H
                java.lang.String r4 = "notif_idtema"
                java.lang.String r0 = r0.getString(r4)
                if (r0 != 0) goto L_0x0201
                british.x.preinicio r0 = british.p015x.preinicio.this
                android.os.Bundle r0 = r0.f8080H
                java.lang.String r4 = "id_remit"
                java.lang.String r0 = r0.getString(r4)
                if (r0 != 0) goto L_0x0201
            L_0x017f:
                british.x.preinicio r0 = british.p015x.preinicio.this
                java.lang.String r4 = "v"
                java.lang.String r0 = r0.mo7822p(r4)
                boolean r4 = r0.equals(r6)
                if (r4 != 0) goto L_0x0201
                int r4 = java.lang.Integer.parseInt(r0)
                r5 = -1
                british.x.preinicio r9 = british.p015x.preinicio.this     // Catch:{ NameNotFoundException -> 0x01a5 }
                android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01a5 }
                british.x.preinicio r10 = british.p015x.preinicio.this     // Catch:{ NameNotFoundException -> 0x01a5 }
                java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x01a5 }
                android.content.pm.PackageInfo r9 = r9.getPackageInfo(r10, r2)     // Catch:{ NameNotFoundException -> 0x01a5 }
                int r5 = r9.versionCode     // Catch:{ NameNotFoundException -> 0x01a5 }
                goto L_0x01a6
            L_0x01a5:
            L_0x01a6:
                r9 = -1
                if (r5 == r9) goto L_0x0201
                if (r5 >= r4) goto L_0x0201
                android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
                british.x.preinicio r4 = british.p015x.preinicio.this
                r3.<init>(r4)
                android.app.AlertDialog$Builder r2 = r3.setCancelable(r2)
                british.x.preinicio r3 = british.p015x.preinicio.this
                r4 = 2131820772(0x7f1100e4, float:1.9274268E38)
                java.lang.String r3 = r3.getString(r4)
                british.x.preinicio$s0$a r4 = new british.x.preinicio$s0$a
                r4.<init>(r0)
                android.app.AlertDialog$Builder r0 = r2.setPositiveButton(r3, r4)
                british.x.preinicio r2 = british.p015x.preinicio.this
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131821004(0x7f1101cc, float:1.9274739E38)
                java.lang.String r2 = r2.getString(r3)
                android.app.AlertDialog$Builder r0 = r0.setMessage(r2)
                android.app.AlertDialog r0 = r0.create()
                british.x.preinicio r2 = british.p015x.preinicio.this
                java.lang.String r2 = r2.f8090g
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x01ef
                british.x.preinicio$s0$b r2 = new british.x.preinicio$s0$b
                r2.<init>(r0)
                r0.setOnShowListener(r2)
            L_0x01ef:
                r0.show()     // Catch:{ Exception -> 0x01f2 }
            L_0x01f2:
                r2 = 16908299(0x102000b, float:2.387726E-38)
                android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x0200 }
                android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x0200 }
                android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0200 }
                r0.setTypeface(r2)     // Catch:{ Exception -> 0x0200 }
            L_0x0200:
                return
            L_0x0201:
                british.x.preinicio r0 = british.p015x.preinicio.this
                android.content.SharedPreferences r0 = r0.f8079G
                android.content.SharedPreferences$Editor r0 = r0.edit()
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r5 = "idusu"
                java.lang.String r4 = r4.mo7822p(r5)
                boolean r5 = r4.equals(r6)
                if (r5 != 0) goto L_0x02a4
                british.x.preinicio r5 = british.p015x.preinicio.this
                java.lang.String r9 = "cod"
                r5.mo7816m(r9, r7, r0)
                british.x.preinicio r5 = british.p015x.preinicio.this
                long r9 = java.lang.Long.parseLong(r4)
                r5.f8094k = r9
                british.x.preinicio r5 = british.p015x.preinicio.this
                long r9 = r5.f8094k
                java.lang.String r5 = "idusu"
                r0.putLong(r5, r9)
                british.x.preinicio r5 = british.p015x.preinicio.this
                java.lang.String r9 = "cod_g"
                java.lang.String r5 = r5.mo7822p(r9)
                boolean r9 = r5.equals(r6)
                if (r9 == 0) goto L_0x0241
                british.x.preinicio r5 = british.p015x.preinicio.this
                java.lang.String r5 = r5.f8091h
            L_0x0241:
                boolean r9 = r5.equals(r6)
                if (r9 != 0) goto L_0x0250
                british.x.preinicio r9 = british.p015x.preinicio.this
                r9.f8091h = r5
                java.lang.String r9 = "cod_g"
                r0.putString(r9, r5)
            L_0x0250:
                british.x.preinicio r5 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x02a2, all -> 0x029d }
                java.io.File r5 = r5.getFilesDir()     // Catch:{ Exception -> 0x02a2, all -> 0x029d }
                java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x02a2, all -> 0x029d }
                java.lang.String r10 = "vinebre_ac.txt"
                r9.<init>(r5, r10)     // Catch:{ Exception -> 0x02a2, all -> 0x029d }
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x02a2, all -> 0x029d }
                r5.<init>(r9)     // Catch:{ Exception -> 0x02a2, all -> 0x029d }
                java.io.BufferedWriter r9 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                java.io.OutputStreamWriter r10 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                r10.<init>(r5)     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                r9.<init>(r10)     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                british.x.preinicio r10 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                java.lang.String r10 = r10.f8091h     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                boolean r10 = r10.equals(r6)     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                if (r10 != 0) goto L_0x028e
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                r10.<init>()     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                r10.append(r4)     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                java.lang.String r4 = "@"
                r10.append(r4)     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                british.x.preinicio r4 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                java.lang.String r4 = r4.f8091h     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                r10.append(r4)     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                java.lang.String r4 = r10.toString()     // Catch:{ Exception -> 0x0294, all -> 0x029a }
            L_0x028e:
                r9.write(r4)     // Catch:{ Exception -> 0x0294, all -> 0x029a }
                r9.close()     // Catch:{ Exception -> 0x0294, all -> 0x029a }
            L_0x0294:
                r5.close()     // Catch:{ Exception -> 0x0298 }
                goto L_0x02a4
            L_0x0298:
                goto L_0x02a4
            L_0x029a:
                r0 = move-exception
                r3 = r5
                goto L_0x029e
            L_0x029d:
                r0 = move-exception
            L_0x029e:
                r3.close()     // Catch:{ Exception -> 0x02a1 }
            L_0x02a1:
                throw r0
            L_0x02a2:
                r5 = r3
                goto L_0x0294
            L_0x02a4:
                british.x.preinicio r4 = british.p015x.preinicio.this
                boolean r5 = r4.f8107x
                if (r5 != 0) goto L_0x02fc
                boolean r4 = r4.m8416l()
                if (r4 == 0) goto L_0x02cc
                british.x.preinicio r4 = british.p015x.preinicio.this
                android.content.SharedPreferences r4 = r4.f8079G
                java.lang.String r5 = "SENT_TOKEN_TO_SERVER"
                boolean r4 = r4.getBoolean(r5, r2)
                if (r4 != 0) goto L_0x02cc
                android.content.Intent r4 = new android.content.Intent
                british.x.preinicio r5 = british.p015x.preinicio.this
                java.lang.Class<british.x.RegistrationIntentService> r9 = british.p015x.RegistrationIntentService.class
                r4.<init>(r5, r9)
                british.x.preinicio r5 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x02cb }
                r5.startService(r4)     // Catch:{ Exception -> 0x02cb }
                goto L_0x02cc
            L_0x02cb:
            L_0x02cc:
                british.x.preinicio r4 = british.p015x.preinicio.this
                android.content.pm.PackageManager r4 = r4.getPackageManager()
                british.x.preinicio r5 = british.p015x.preinicio.this
                java.lang.String r5 = r5.getPackageName()
                java.lang.String r9 = "android.permission.ACCESS_FINE_LOCATION"
                int r4 = r4.checkPermission(r9, r5)
                if (r4 != 0) goto L_0x02fc
                british.x.preinicio r4 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x02fb }
                s5.b r5 = p251s5.C10975f.m49324a(r4)     // Catch:{ Exception -> 0x02fb }
                r4.f8084L = r5     // Catch:{ Exception -> 0x02fb }
                british.x.preinicio r4 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x02fb }
                s5.b r4 = r4.f8084L     // Catch:{ Exception -> 0x02fb }
                com.google.android.gms.tasks.Task r4 = r4.mo43269g()     // Catch:{ Exception -> 0x02fb }
                british.x.preinicio r5 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x02fb }
                british.x.preinicio$s0$c r9 = new british.x.preinicio$s0$c     // Catch:{ Exception -> 0x02fb }
                r9.<init>()     // Catch:{ Exception -> 0x02fb }
                r4.addOnSuccessListener((android.app.Activity) r5, r9)     // Catch:{ Exception -> 0x02fb }
                goto L_0x02fc
            L_0x02fb:
            L_0x02fc:
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r5 = "f_p_elim"
                java.lang.String r4 = r4.mo7822p(r5)
                java.lang.String r5 = "1"
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x0319
                british.x.preinicio r4 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x0318 }
                british.x.config r9 = r4.f8085b     // Catch:{ Exception -> 0x0318 }
                java.io.File r4 = r9.mo7516l0(r4, r8)     // Catch:{ Exception -> 0x0318 }
                r4.delete()     // Catch:{ Exception -> 0x0318 }
                goto L_0x0319
            L_0x0318:
            L_0x0319:
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r9 = "splash"
                java.lang.String r4 = r4.mo7822p(r9)
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x033c
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r10 = "c1_sp"
                r4.mo7816m(r10, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r10 = "c2_sp"
                r4.mo7816m(r10, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r10 = "sp_i"
                r4.mo7816m(r10, r7, r0)
            L_0x033c:
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r4 = r4.f8093j
                java.lang.String r10 = "adotro2_cod"
                boolean r4 = r4.containsKey(r10)
                if (r4 == 0) goto L_0x0356
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r10 = "adotro2_cod"
                r4.mo7816m(r10, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r10 = "adotro2_tipo"
                r4.mo7816m(r10, r8, r0)
            L_0x0356:
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r10 = "ico_share_ord"
                java.lang.String r4 = r4.mo7822p(r10)
                boolean r4 = r4.equals(r6)
                java.lang.String r10 = "0"
                if (r4 != 0) goto L_0x0ab5
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "nd_t"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "nd_s"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "nd_u"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "nd_i"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ico_ofics_ord"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ico_share_ord"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ico_busc_ord"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ico_exit_ord"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ico_notif_ord"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ic_po"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ic_so"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "io1"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "io2"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "io3"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "io4"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ib1"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ib2"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ib3"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ib4"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "is1"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "is2"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "is3"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "is4"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ir1"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ir2"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ir3"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ir4"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ie1"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ie2"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ie3"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ie4"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "in1"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "in2"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "in3"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "in4"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ip1"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ip2"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ip3"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ip4"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ip5"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "share_subject"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "share_text"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "tcn"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "admob_cod"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "admob_pos"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "admob_sma"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "fbb"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "fbi"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "fbm"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "fbp"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "fbr"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "pfc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "stb"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "sti"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "stm"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "stp"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "str"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "iiu"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "piu"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "aai"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "abc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "aic"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "arc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "uai"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ubc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "uic"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "urc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "iai"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ibc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ipc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "imc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "irc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "iqc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "iic"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "iwc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "icc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "a_ra"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "n_ra"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "f_ra"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "st_ra"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "a_qr"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "n_qr"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "f_qr"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "st_qr"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "n_i_c"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "st_i_c"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ic_1"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ic_v"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "a_p_c"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "n_p_c"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "upc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "a_m_c"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "n_m_c"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "a_r_c"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "n_r_c"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "a_p_s"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "a_m_s"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_mo"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_ms"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_pms"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r4 = r4.f8093j
                java.lang.String r11 = "ca_a"
                boolean r4 = r4.containsKey(r11)
                if (r4 == 0) goto L_0x064f
                british.x.preinicio r4 = british.p015x.preinicio.this
                british.x.config r11 = r4.f8085b
                r11.f7413r4 = r8
                java.lang.String r11 = "ca_a"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ca_n"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ca_f"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ca_s"
                r4.mo7816m(r11, r7, r0)
                goto L_0x0655
            L_0x064f:
                british.x.preinicio r4 = british.p015x.preinicio.this
                british.x.config r4 = r4.f8085b
                r4.f7413r4 = r2
            L_0x0655:
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "fca"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "fcs"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "a"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "our"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "admob_int_cod"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "admob_int_v"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "aigi"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "admob_inte_v"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "admob_ch_v"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "b_c"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "l_c"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "fp"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cvm"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "emo"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "i"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "i2"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cb"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "fv"
                r4.mo7816m(r11, r8, r0)
                r4 = 1
            L_0x06d4:
                r11 = 6
                if (r4 >= r11) goto L_0x06f0
                british.x.preinicio r11 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "mb_"
                r12.append(r13)
                r12.append(r4)
                java.lang.String r12 = r12.toString()
                r11.mo7816m(r12, r7, r0)
                int r4 = r4 + 1
                goto L_0x06d4
            L_0x06f0:
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "mb_cbg"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "mb_cit"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "vipe"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "vipr"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "vifo"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "vivi"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "viem"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "vien"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "vp"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "mv"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_p"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_t_c"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_a_s"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_s_s"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_a_b"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_s_b"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_a_c"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_s_c"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "r_a"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cs_v"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cs_r"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cs_p"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cs_c"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cs_g"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cs_ap"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cs_fp"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cs_pf"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cs_ps"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cs_pde"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "cs_pdi"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "apn_v"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "apn_vi"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "vi"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "acad"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "appnext_ch_v"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "appnext_cod"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "appnext_cod_int_e"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "appnext_cod_int_ia"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ap"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "mu"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "appnextb_cod"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "admob_int_exit_v"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "admob_int_exit_r"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "adotro_cod"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "mf_v"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "tipomenu"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "petic_ask_nombre"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "petic_ask_email"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "petic_ask_tel"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c1"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c2"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_icos"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_icos_t"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_secc_noactiv"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_secc_activ"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_linea"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "t_ind"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_ind"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "t_mas"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "sep_secc"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_sep_secc"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c1_ofic"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c2_ofic"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_ssl"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_tit_ofic"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_sep_ofic"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_ico_sep_ofic"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_txt_ofic"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_icos_ofic"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_ir_ofic"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c1_prods"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c2_prods"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_txt_prods"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_icos_prods"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_icos_2_prods"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_tit_prods"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_sep_prods"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_ico_sep_prods"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c1_prods_l"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c2_prods_l"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_perprod"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_tit_prods_l"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_precio_prods_l"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_antiguedad_prods_l"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "c_prods_det"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "splash_w"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "s_v"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "s_h"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_ncols"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_padding"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_txt_radius"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_mostrar_icos"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_mostrar_txt"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_icos_izq"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_anim"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_c"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_txt_c"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_txt_b"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_e"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_txt_bg"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_txt_col"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_c1"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "m_c2"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "msl_c"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "fm"
                java.lang.String r4 = r4.mo7816m(r11, r8, r0)
                boolean r11 = r4.equals(r5)
                if (r11 == 0) goto L_0x09dc
                java.lang.String r4 = "act_fm"
                r0.putBoolean(r4, r8)
                goto L_0x09e7
            L_0x09dc:
                boolean r4 = r4.equals(r10)
                if (r4 == 0) goto L_0x09e7
                java.lang.String r4 = "act_fm"
                r0.putBoolean(r4, r2)
            L_0x09e7:
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "vf"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "tm"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "dom"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "fb_m"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "vcn"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "hcn"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "conf_ex"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "pp"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "pp2"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "notif_int"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "bv_txt"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "bv_tit"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "bv_nomas_mostrar"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "bv_nomas_def"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "ps"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "pd"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "pt"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "pm"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "rt_tit"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "rt_txt"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "rt_ok"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "rt_ko"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "rt_1v"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "rt_int"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "rt_t"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "pwd"
                java.lang.String r4 = r4.mo7816m(r11, r8, r0)
                boolean r11 = r4.equals(r10)
                if (r11 == 0) goto L_0x0aaa
                java.lang.String r4 = "pwd_validado"
                r0.putBoolean(r4, r8)
                goto L_0x0ab5
            L_0x0aaa:
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x0ab5
                java.lang.String r4 = "pwd_validado"
                r0.putBoolean(r4, r2)
            L_0x0ab5:
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "busc_campos"
                java.lang.String r4 = r4.mo7822p(r11)
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0b17
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "divisa"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "busc_campos"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "busc_orden"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "busc_def"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "prods_tit"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "prods_masinfo"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "prods_comprar"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "prods_masinfo_mostrar"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "prods_linksexternos"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "prods_adaptar_ancho"
                r4.mo7816m(r11, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "pp_email"
                r4.mo7816m(r11, r7, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r11 = "pp_div"
                r4.mo7816m(r11, r7, r0)
            L_0x0b17:
                british.x.preinicio r4 = british.p015x.preinicio.this
                android.content.SharedPreferences r4 = r4.f8079G
                java.lang.String r11 = "nsecc"
                int r4 = r4.getInt(r11, r2)
                british.x.preinicio r12 = british.p015x.preinicio.this
                java.lang.String r12 = r12.mo7822p(r11)
                boolean r13 = r12.equals(r6)
                if (r13 != 0) goto L_0x0b34
                int r4 = java.lang.Integer.parseInt(r12)
                r0.putInt(r11, r4)
            L_0x0b34:
                if (r4 != 0) goto L_0x0b43
                british.x.preinicio r0 = british.p015x.preinicio.this
                r2 = 2131820791(0x7f1100f7, float:1.9274307E38)
                java.lang.String r2 = r0.getString(r2)
                r0.mo7830y(r6, r2)
                return
            L_0x0b43:
                british.x.preinicio r4 = british.p015x.preinicio.this
                android.content.SharedPreferences r4 = r4.f8079G
                java.lang.String r11 = "idseccs"
                java.lang.String r4 = r4.getString(r11, r6)
                british.x.preinicio r12 = british.p015x.preinicio.this
                java.lang.String r12 = r12.mo7822p(r11)
                boolean r13 = r12.equals(r6)
                if (r13 != 0) goto L_0x0b5d
                r0.putString(r11, r12)
                r4 = r12
            L_0x0b5d:
                java.lang.String r11 = ","
                java.lang.String[] r4 = r4.split(r11)
                r12 = 0
                r13 = 0
            L_0x0b65:
                int r14 = r4.length
                java.lang.String r15 = "_nfotos"
                java.lang.String r3 = "_idfotos"
                java.lang.String r2 = "_ord"
                if (r12 >= r14) goto L_0x1c0f
                r14 = r4[r12]
                british.x.preinicio r7 = british.p015x.preinicio.this
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r16 = r9
                java.lang.String r9 = "s"
                r8.append(r9)
                r8.append(r14)
                r8.append(r2)
                java.lang.String r8 = r8.toString()
                java.lang.String r7 = r7.mo7822p(r8)
                boolean r7 = r7.equals(r6)
                if (r7 != 0) goto L_0x167e
                british.x.preinicio r7 = british.p015x.preinicio.this
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r9)
                r8.append(r14)
                r8.append(r2)
                java.lang.String r8 = r8.toString()
                r17 = r4
                r4 = 1
                r7.mo7816m(r8, r4, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_tit"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_de"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_k"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_i"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_idgo"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_ocu"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_tp"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_r"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_d"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_r_m"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_ext"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_adapt"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_stream"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_idfondo"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_vf"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_fondo_modif"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_tm"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_tipo"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_url"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_ua"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_html"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_pur"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_loa"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_zoo"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_i1"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_i2"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_c1"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_c2"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_c_peritem"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_c_tit"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_c_fecha"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_mostrar_img"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_mostrar_fecha"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_vin"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_v"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_ptit"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_ptxt"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_pwd"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                java.lang.String r4 = r4.mo7816m(r7, r8, r0)
                boolean r7 = r4.equals(r10)
                if (r7 == 0) goto L_0x0fa9
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "chat"
                r4.append(r7)
                r4.append(r14)
                java.lang.String r7 = "_validado"
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r0.putBoolean(r4, r8)
                goto L_0x0fc9
            L_0x0fa9:
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x0fc9
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "chat"
                r4.append(r7)
                r4.append(r14)
                java.lang.String r7 = "_validado"
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r7 = 0
                r0.putBoolean(r4, r7)
            L_0x0fc9:
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_f_perfil"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_f_p_amp"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_f_chat"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_priv"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_accext"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_cat"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_sub"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_fnac"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_sexo"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_descr"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_dist"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_com"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_gal"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_fdist"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_fsexo"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_fn"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_fedad1"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_fedad2"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_fdist_d"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_fsexo_d"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_fedad1_d"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_fedad2_d"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_i16"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_t_di"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_t_mp"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_t_mv"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_t_de"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_t_fa"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_t_ul"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_t_pr"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_cats"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_idg"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_cl"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_cp"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_iw"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_st"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_sta"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_ad"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_mc"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_tv"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_cv"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_ncols"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_padding"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_txt_radius"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_mostrar_icos"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_mostrar_txt"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_icos_izq"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_anim"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_c"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_txt_c"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_txt_b"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_e"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_txt_bg"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_txt_col"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_seccs"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_incl"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 2
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_ico_id"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_v_ico"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_w_ico"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_h_ico"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_ico"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                java.lang.String r4 = r4.mo7816m(r7, r8, r0)
                boolean r4 = r4.equals(r10)
                if (r4 == 0) goto L_0x1638
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "img_s"
                r7.append(r8)
                r7.append(r14)
                java.lang.String r8 = "_ico"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r4.deleteFile(r7)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "img_s"
                r7.append(r8)
                r7.append(r14)
                java.lang.String r8 = "_ico_g"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r4.deleteFile(r7)
            L_0x1638:
                if (r13 != 0) goto L_0x1680
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r7 = "wv_sc"
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r7 = "wv_sc_txt"
                r13 = 2
                r4.mo7816m(r7, r13, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r7 = "wv_c"
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r7 = "rss_i"
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r7 = "rss_n"
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r7 = "rss_t"
                r13 = 2
                r4.mo7816m(r7, r13, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r7 = "vfs"
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r7 = "vls"
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r7 = "vc"
                r4.mo7816m(r7, r8, r0)
                r13 = 1
                goto L_0x1681
            L_0x167e:
                r17 = r4
            L_0x1680:
                r8 = 1
            L_0x1681:
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r7 = "vcv"
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                android.content.SharedPreferences r4 = r4.f8079G
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_idtemas"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r4.getString(r7, r6)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                java.lang.String r4 = r4.mo7822p(r7)
                boolean r7 = r4.equals(r6)
                if (r7 != 0) goto L_0x16d6
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r0.putString(r7, r4)
            L_0x16d6:
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_nitems"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 1
                r4.mo7816m(r7, r8, r0)
                british.x.preinicio r4 = british.p015x.preinicio.this
                android.content.SharedPreferences r4 = r4.f8079G
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_iditems"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                java.lang.String r4 = r4.getString(r7, r6)
                british.x.preinicio r7 = british.p015x.preinicio.this
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r9)
                r8.append(r14)
                r18 = r4
                java.lang.String r4 = "_iditems"
                r8.append(r4)
                java.lang.String r4 = r8.toString()
                java.lang.String r4 = r7.mo7822p(r4)
                boolean r7 = r4.equals(r6)
                if (r7 != 0) goto L_0x1746
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                r7.append(r14)
                java.lang.String r8 = "_iditems"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r0.putString(r7, r4)
                goto L_0x1748
            L_0x1746:
                r4 = r18
            L_0x1748:
                boolean r7 = r4.equals(r6)
                if (r7 != 0) goto L_0x1bff
                java.lang.String[] r4 = r4.split(r11)
                r7 = 0
            L_0x1753:
                int r8 = r4.length
                if (r7 >= r8) goto L_0x1bff
                r8 = r4[r7]
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r18 = r4
                java.lang.String r4 = "it"
                r14.append(r4)
                r14.append(r8)
                r14.append(r2)
                java.lang.String r14 = r14.toString()
                java.lang.String r9 = r9.mo7822p(r14)
                boolean r9 = r9.equals(r6)
                if (r9 != 0) goto L_0x1b09
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r4)
                r14.append(r8)
                r14.append(r2)
                java.lang.String r14 = r14.toString()
                r19 = r13
                r13 = 1
                r9.mo7816m(r14, r13, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit1"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 2
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit1_c"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_fcab_id"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_fcab_modif"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_fcab_c"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_fcab_url"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 2
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit2"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 2
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit2_c"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_txt"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 2
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_txt_c"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_txt_h"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_fotos_pos"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_fotos_c"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_fotos_h"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_fcab_z"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_fotos_z"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit1_b"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit1_i"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit1_f"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit1_col"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 2
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit1_u"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit1_s"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit2_b"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit2_i"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit2_f"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit2_col"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 2
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit2_u"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_tit2_s"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_txt_b"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_txt_i"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_txt_f"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_txt_col"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 2
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_txt_u"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                java.lang.String r14 = "_txt_s"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                goto L_0x1b0c
            L_0x1b09:
                r19 = r13
                r14 = 1
            L_0x1b0c:
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                r13.append(r15)
                java.lang.String r13 = r13.toString()
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                android.content.SharedPreferences r9 = r9.f8079G
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r4)
                r13.append(r8)
                r13.append(r3)
                java.lang.String r13 = r13.toString()
                java.lang.String r9 = r9.getString(r13, r6)
                british.x.preinicio r13 = british.p015x.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r4)
                r14.append(r8)
                r14.append(r3)
                java.lang.String r14 = r14.toString()
                java.lang.String r13 = r13.mo7822p(r14)
                british.x.preinicio r14 = british.p015x.preinicio.this
                r20 = r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r4)
                r9.append(r8)
                r9.append(r15)
                java.lang.String r9 = r9.toString()
                java.lang.String r9 = r14.mo7822p(r9)
                boolean r9 = r9.equals(r6)
                if (r9 != 0) goto L_0x1b8c
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r4)
                r9.append(r8)
                r9.append(r3)
                java.lang.String r4 = r9.toString()
                r0.putString(r4, r13)
                r9 = r13
                goto L_0x1b8e
            L_0x1b8c:
                r9 = r20
            L_0x1b8e:
                boolean r4 = r9.equals(r6)
                if (r4 != 0) goto L_0x1bf7
                java.lang.String[] r4 = r9.split(r11)
                r8 = 0
            L_0x1b99:
                int r9 = r4.length
                if (r8 >= r9) goto L_0x1bf7
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "it_f"
                r13.append(r14)
                r14 = r4[r8]
                r13.append(r14)
                r13.append(r2)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "it_f"
                r13.append(r14)
                r14 = r4[r8]
                r13.append(r14)
                java.lang.String r14 = "_modif"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 1
                r9.mo7816m(r13, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "it_f"
                r13.append(r14)
                r14 = r4[r8]
                r13.append(r14)
                java.lang.String r14 = "_url"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r14 = 2
                r9.mo7816m(r13, r14, r0)
                int r8 = r8 + 1
                goto L_0x1b99
            L_0x1bf7:
                int r7 = r7 + 1
                r4 = r18
                r13 = r19
                goto L_0x1753
            L_0x1bff:
                r19 = r13
                int r12 = r12 + 1
                r9 = r16
                r4 = r17
                r13 = r19
                r2 = 0
                r3 = 0
                r7 = 2
                r8 = 1
                goto L_0x0b65
            L_0x1c0f:
                r17 = r4
                r16 = r9
                british.x.preinicio r4 = british.p015x.preinicio.this
                android.content.SharedPreferences r4 = r4.f8079G
                java.lang.String r7 = "noficc"
                r8 = 0
                r4.getInt(r7, r8)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r4 = r4.mo7822p(r7)
                boolean r8 = r4.equals(r6)
                if (r8 != 0) goto L_0x1c30
                int r8 = java.lang.Integer.parseInt(r4)
                r0.putInt(r7, r8)
            L_0x1c30:
                british.x.preinicio r7 = british.p015x.preinicio.this
                android.content.SharedPreferences r7 = r7.f8079G
                java.lang.String r8 = "idofics"
                java.lang.String r7 = r7.getString(r8, r6)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.String r9 = r9.mo7822p(r8)
                boolean r12 = r9.equals(r6)
                if (r12 == 0) goto L_0x1c4c
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x1c50
            L_0x1c4c:
                r0.putString(r8, r9)
                r7 = r9
            L_0x1c50:
                r4 = 0
                java.lang.String[] r8 = new java.lang.String[r4]
                boolean r4 = r7.equals(r6)
                if (r4 != 0) goto L_0x1f44
                java.lang.String[] r8 = r7.split(r11)
                r4 = 0
            L_0x1c5e:
                int r7 = r8.length
                if (r4 >= r7) goto L_0x1f42
                r7 = r8[r4]
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "o"
                r12.append(r13)
                r12.append(r7)
                r12.append(r2)
                java.lang.String r12 = r12.toString()
                java.lang.String r9 = r9.mo7822p(r12)
                boolean r9 = r9.equals(r6)
                if (r9 != 0) goto L_0x1e70
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                r12.append(r2)
                java.lang.String r12 = r12.toString()
                r14 = 1
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_tit"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 2
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_dir1"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 2
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_dir2"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 2
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_cp"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 2
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_pob"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 2
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_prov"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 2
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_tel1"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 2
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_tel2"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 2
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_horario"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 2
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_x"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 1
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_y"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 1
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_z"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 1
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_email"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 2
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_t_email"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 1
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_web"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 2
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_wp"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 1
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_chat"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 1
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                java.lang.String r14 = "_zoo"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                r14 = 1
                r9.mo7816m(r12, r14, r0)
                goto L_0x1e71
            L_0x1e70:
                r14 = 1
            L_0x1e71:
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                r12.append(r15)
                java.lang.String r12 = r12.toString()
                r9.mo7816m(r12, r14, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                android.content.SharedPreferences r9 = r9.f8079G
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r13)
                r12.append(r7)
                r12.append(r3)
                java.lang.String r12 = r12.toString()
                java.lang.String r9 = r9.getString(r12, r6)
                british.x.preinicio r12 = british.p015x.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r13)
                r14.append(r7)
                r14.append(r3)
                java.lang.String r14 = r14.toString()
                java.lang.String r12 = r12.mo7822p(r14)
                british.x.preinicio r14 = british.p015x.preinicio.this
                r18 = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r13)
                r8.append(r7)
                r8.append(r15)
                java.lang.String r8 = r8.toString()
                java.lang.String r8 = r14.mo7822p(r8)
                boolean r8 = r8.equals(r6)
                if (r8 != 0) goto L_0x1ef0
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r13)
                r8.append(r7)
                r8.append(r3)
                java.lang.String r7 = r8.toString()
                r0.putString(r7, r12)
                r9 = r12
            L_0x1ef0:
                boolean r7 = r9.equals(r6)
                if (r7 != 0) goto L_0x1f3c
                java.lang.String[] r7 = r9.split(r11)
                r8 = 0
            L_0x1efb:
                int r9 = r7.length
                if (r8 >= r9) goto L_0x1f3c
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "o_f"
                r12.append(r13)
                r13 = r7[r8]
                r12.append(r13)
                r12.append(r2)
                java.lang.String r12 = r12.toString()
                r13 = 1
                r9.mo7816m(r12, r13, r0)
                british.x.preinicio r9 = british.p015x.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "o_f"
                r12.append(r13)
                r13 = r7[r8]
                r12.append(r13)
                java.lang.String r13 = "_modif"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r13 = 10
                r9.mo7816m(r12, r13, r0)
                int r8 = r8 + 1
                goto L_0x1efb
            L_0x1f3c:
                int r4 = r4 + 1
                r8 = r18
                goto L_0x1c5e
            L_0x1f42:
                r18 = r8
            L_0x1f44:
                r0.commit()
                british.x.preinicio r2 = british.p015x.preinicio.this
                java.lang.String r3 = "cats"
                java.lang.String r2 = r2.mo7822p(r3)
                boolean r3 = r2.equals(r6)
                if (r3 != 0) goto L_0x1fc3
                british.x.q r3 = new british.x.q     // Catch:{ Exception -> 0x1fc2 }
                british.x.preinicio r4 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x1fc2 }
                android.content.Context r4 = r4.getApplicationContext()     // Catch:{ Exception -> 0x1fc2 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x1fc2 }
                android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch:{ Exception -> 0x1fc2 }
                if (r3 == 0) goto L_0x1fc3
                java.lang.String r4 = "DELETE FROM cats"
                r3.execSQL(r4)     // Catch:{ Exception -> 0x1fc2 }
                boolean r4 = r2.equals(r10)     // Catch:{ Exception -> 0x1fc2 }
                if (r4 != 0) goto L_0x1fbe
                java.lang.String r4 = ";"
                java.lang.String[] r2 = r2.split(r4)     // Catch:{ Exception -> 0x1fc2 }
                r4 = 0
            L_0x1f78:
                int r7 = r2.length     // Catch:{ Exception -> 0x1fc2 }
                if (r4 >= r7) goto L_0x1fbe
                r7 = r2[r4]     // Catch:{ Exception -> 0x1fc2 }
                java.lang.String r9 = "@"
                java.lang.String[] r7 = r7.split(r9)     // Catch:{ Exception -> 0x1fc2 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1fc2 }
                r9.<init>()     // Catch:{ Exception -> 0x1fc2 }
                java.lang.String r12 = "INSERT INTO cats(_id,idcat,descr)VALUES("
                r9.append(r12)     // Catch:{ Exception -> 0x1fc2 }
                r12 = 0
                r13 = r7[r12]     // Catch:{ Exception -> 0x1fc2 }
                r9.append(r13)     // Catch:{ Exception -> 0x1fc2 }
                r9.append(r11)     // Catch:{ Exception -> 0x1fc2 }
                r12 = 1
                r13 = r7[r12]     // Catch:{ Exception -> 0x1fc2 }
                r9.append(r13)     // Catch:{ Exception -> 0x1fc2 }
                java.lang.String r12 = ",'"
                r9.append(r12)     // Catch:{ Exception -> 0x1fc2 }
                r12 = 2
                r7 = r7[r12]     // Catch:{ Exception -> 0x1fc2 }
                java.lang.String r12 = "'"
                java.lang.String r13 = "''"
                java.lang.String r7 = r7.replace(r12, r13)     // Catch:{ Exception -> 0x1fc2 }
                r9.append(r7)     // Catch:{ Exception -> 0x1fc2 }
                java.lang.String r7 = "')"
                r9.append(r7)     // Catch:{ Exception -> 0x1fc2 }
                java.lang.String r7 = r9.toString()     // Catch:{ Exception -> 0x1fc2 }
                r3.execSQL(r7)     // Catch:{ Exception -> 0x1fc2 }
                int r4 = r4 + 1
                goto L_0x1f78
            L_0x1fbe:
                r3.close()     // Catch:{ Exception -> 0x1fc2 }
                goto L_0x1fc3
            L_0x1fc2:
            L_0x1fc3:
                british.x.preinicio r2 = british.p015x.preinicio.this
                british.x.config r3 = r2.f8085b
                android.os.Bundle r4 = r2.f8080H
                android.content.Intent r7 = r2.getIntent()
                r9 = r17
                int r3 = r3.mo7529z(r9, r8, r4, r7)
                r2.f8095l = r3
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 20
                if (r2 <= r3) goto L_0x1ff0
                british.x.preinicio r3 = british.p015x.preinicio.this
                british.x.config r3 = r3.f8085b
                java.lang.String r3 = r3.f7313c1
                boolean r3 = r3.equals(r6)
                if (r3 != 0) goto L_0x1ff0
                british.x.preinicio r3 = british.p015x.preinicio.this
                british.x.config r4 = r3.f8085b
                java.lang.String r4 = r4.f7313c1
                british.p015x.C1692config.m8190i(r3, r4)
            L_0x1ff0:
                british.x.preinicio r3 = british.p015x.preinicio.this
                android.content.SharedPreferences r3 = r3.f8079G
                java.lang.String r4 = "i"
                java.lang.String r3 = r3.getString(r4, r6)
                boolean r4 = r3.equals(r6)
                if (r4 != 0) goto L_0x207d
                int r4 = r3.length()
                r7 = 22
                if (r4 <= r7) goto L_0x207d
                r4 = 22
                r7 = 23
                java.lang.String r3 = r3.substring(r4, r7)
                boolean r3 = r3.equals(r5)
                if (r3 == 0) goto L_0x207d
                british.x.preinicio r3 = british.p015x.preinicio.this
                british.x.config r3 = r3.f8085b
                boolean r3 = r3.mo7484M()
                if (r3 == 0) goto L_0x207d
                british.x.preinicio r0 = british.p015x.preinicio.this
                r2 = 2131820789(0x7f1100f5, float:1.9274303E38)
                java.lang.String r2 = r0.getString(r2)
                british.x.preinicio r3 = british.p015x.preinicio.this
                r4 = 2131820788(0x7f1100f4, float:1.92743E38)
                java.lang.String r3 = r3.getString(r4)
                r0.mo7830y(r2, r3)
                british.x.preinicio r0 = british.p015x.preinicio.this
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.lang.String r2 = "android_id"
                java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r2)
                british.x.config$p0 r2 = new british.x.config$p0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = british.p015x.C1692config.f7109I5
                r3.append(r4)
                java.lang.String r4 = "/srv/prt_bloq.php?idusu="
                r3.append(r4)
                british.x.preinicio r4 = british.p015x.preinicio.this
                long r4 = r4.f8094k
                r3.append(r4)
                java.lang.String r4 = "&cod_g="
                r3.append(r4)
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.String r4 = r4.f8091h
                r3.append(r4)
                java.lang.String r4 = "&aid="
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                java.lang.String r3 = "Android Vinebre Software"
                r2.<init>(r0, r3)
                r3 = 0
                java.lang.String[] r0 = new java.lang.String[r3]
                r2.execute(r0)
                return
            L_0x207d:
                r3 = 0
                british.x.preinicio r4 = british.p015x.preinicio.this
                android.content.SharedPreferences r4 = r4.f8079G
                java.lang.String r7 = "hatenidonotif"
                boolean r4 = r4.getBoolean(r7, r3)
                if (r4 != 0) goto L_0x210c
                british.x.preinicio r3 = british.p015x.preinicio.this
                british.x.config r3 = r3.f8085b
                java.lang.String r3 = r3.f7435u5
                boolean r3 = r3.equals(r6)
                if (r3 != 0) goto L_0x210c
                android.content.Intent r3 = new android.content.Intent
                british.x.preinicio r4 = british.p015x.preinicio.this
                java.lang.Class<british.x.preinicio> r7 = british.p015x.preinicio.class
                r3.<init>(r4, r7)
                r4 = 11
                if (r2 < r4) goto L_0x20a9
                r2 = 268468224(0x10008000, float:2.5342157E-29)
                r3.setFlags(r2)
            L_0x20a9:
                java.lang.String r2 = "notif_id"
                r3.putExtra(r2, r5)
                british.x.preinicio r2 = british.p015x.preinicio.this
                british.x.config r2 = r2.f8085b
                int r4 = r2.f7421s5
                if (r4 != 0) goto L_0x20c7
                java.lang.String r2 = r2.f7449w5
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x20c7
                british.x.preinicio r2 = british.p015x.preinicio.this
                british.x.config r2 = r2.f8085b
                java.lang.String r10 = r2.f7449w5
                java.lang.String r2 = "2"
                goto L_0x20e7
            L_0x20c7:
                british.x.preinicio r2 = british.p015x.preinicio.this
                british.x.config r2 = r2.f8085b
                int r2 = r2.f7421s5
                if (r2 <= 0) goto L_0x20e6
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                british.x.preinicio r4 = british.p015x.preinicio.this
                british.x.config r4 = r4.f8085b
                int r4 = r4.f7421s5
                r2.append(r4)
                r2.append(r6)
                java.lang.String r10 = r2.toString()
                r2 = r5
                goto L_0x20e7
            L_0x20e6:
                r2 = r10
            L_0x20e7:
                java.lang.String r4 = "notif_idelem"
                r3.putExtra(r4, r10)
                java.lang.String r4 = "notif_tipo"
                r3.putExtra(r4, r2)
                british.x.preinicio r2 = british.p015x.preinicio.this
                british.x.config r4 = r2.f8085b
                java.lang.String r7 = r4.f7435u5
                java.lang.String r4 = r4.f7442v5
                r21 = 0
                r22 = 1
                java.lang.String r23 = "0"
                java.lang.String r24 = "0"
                r17 = r2
                r18 = r7
                r19 = r4
                r20 = r3
                british.p015x.C1692config.m8146A(r17, r18, r19, r20, r21, r22, r23, r24)
            L_0x210c:
                british.x.preinicio r2 = british.p015x.preinicio.this
                boolean r3 = r2.f8107x
                if (r3 == 0) goto L_0x2117
                r2.m8417o()
                goto L_0x2230
            L_0x2117:
                r3 = r16
                java.lang.String r2 = r2.mo7822p(r3)
                boolean r4 = r2.equals(r5)
                if (r4 == 0) goto L_0x21f2
                british.x.preinicio r2 = british.p015x.preinicio.this
                java.lang.String r3 = "sa"
                java.lang.String r2 = r2.mo7822p(r3)
                boolean r3 = r2.equals(r6)
                if (r3 != 0) goto L_0x216b
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{  }
                java.lang.String r3 = "sa"
                r0.putInt(r3, r2)     // Catch:{  }
                r0.commit()     // Catch:{  }
                if (r2 <= 0) goto L_0x216b
                british.x.preinicio r0 = british.p015x.preinicio.this     // Catch:{  }
                int r0 = british.p015x.C1692config.m8183d0(r0)     // Catch:{  }
                if (r2 > r0) goto L_0x216b
                british.x.preinicio r0 = british.p015x.preinicio.this     // Catch:{  }
                android.content.res.Resources r0 = r0.getResources()     // Catch:{  }
                android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{  }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x216b }
                r2.<init>()     // Catch:{ Exception -> 0x216b }
                java.lang.String r3 = "altres/"
                r2.append(r3)     // Catch:{ Exception -> 0x216b }
                british.x.preinicio r3 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x216b }
                java.lang.String r3 = r3.f8092i     // Catch:{ Exception -> 0x216b }
                r2.append(r3)     // Catch:{ Exception -> 0x216b }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x216b }
                r0.open(r2)     // Catch:{ Exception -> 0x216b }
                r0 = 1
                goto L_0x216c
            L_0x216b:
                r0 = 0
            L_0x216c:
                if (r0 == 0) goto L_0x217a
                british.x.preinicio r0 = british.p015x.preinicio.this
                r0.mo7812A()
                british.x.preinicio r0 = british.p015x.preinicio.this
                r0.mo7823q()
                goto L_0x2230
            L_0x217a:
                british.x.preinicio r0 = british.p015x.preinicio.this
                british.x.config r0 = r0.f8085b
                java.lang.String r0 = r0.f7195I1
                boolean r0 = r0.equals(r6)
                if (r0 != 0) goto L_0x21d8
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
                r3 = 2
                int[] r3 = new int[r3]
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "#"
                r4.append(r5)
                british.x.preinicio r5 = british.p015x.preinicio.this
                british.x.config r5 = r5.f8085b
                java.lang.String r5 = r5.f7195I1
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                int r4 = android.graphics.Color.parseColor(r4)
                r5 = 0
                r3[r5] = r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "#"
                r4.append(r5)
                british.x.preinicio r5 = british.p015x.preinicio.this
                british.x.config r5 = r5.f8085b
                java.lang.String r5 = r5.f7201J1
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                int r4 = android.graphics.Color.parseColor(r4)
                r5 = 1
                r3[r5] = r4
                r0.<init>(r2, r3)
                british.x.preinicio r2 = british.p015x.preinicio.this
                r3 = 2131362240(0x7f0a01c0, float:1.8344255E38)
                android.view.View r2 = r2.findViewById(r3)
                r2.setBackgroundDrawable(r0)
            L_0x21d8:
                british.x.preinicio r0 = british.p015x.preinicio.this
                java.lang.String r2 = "vsp"
                java.lang.String r0 = r0.mo7822p(r2)
                british.x.preinicio$y0 r2 = new british.x.preinicio$y0
                british.x.preinicio r3 = british.p015x.preinicio.this
                r4 = 0
                r2.<init>()
                r3 = 1
                java.lang.String[] r3 = new java.lang.String[r3]
                r4 = 0
                r3[r4] = r0
                r2.execute(r3)
                goto L_0x2230
            L_0x21f2:
                java.lang.String r4 = "2"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x222b
                british.x.preinicio r2 = british.p015x.preinicio.this
                r4 = 2131362407(0x7f0a0267, float:1.8344594E38)
                android.view.View r2 = r2.findViewById(r4)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r4 = 0
                r2.setImageBitmap(r4)
                british.x.preinicio r2 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x220e }
                r2.deleteFile(r3)     // Catch:{ Exception -> 0x220e }
            L_0x220e:
                british.x.preinicio r2 = british.p015x.preinicio.this
                r3 = 2131363256(0x7f0a05b8, float:1.8346316E38)
                android.view.View r2 = r2.findViewById(r3)
                r3 = 8
                r2.setVisibility(r3)
                java.lang.String r2 = "sa"
                r3 = 0
                r0.putInt(r2, r3)
                r0.commit()
                british.x.preinicio r0 = british.p015x.preinicio.this
                r0.mo7823q()
                goto L_0x2230
            L_0x222b:
                british.x.preinicio r0 = british.p015x.preinicio.this
                r0.mo7823q()
            L_0x2230:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.C1945s0.onPostExecute(java.lang.Byte):void");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            preinicio preinicio = preinicio.this;
            if (!preinicio.f8107x) {
                preinicio.mo7831z(R.string.inicializando);
            }
        }
    }

    /* renamed from: british.x.preinicio$t */
    class C1949t implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ String f8168a;

        C1949t(String str) {
            this.f8168a = str;
        }

        public void onAnimationEnd(Animation animation) {
            preinicio.this.m8418x(this.f8168a);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: british.x.preinicio$t0 */
    private class C1950t0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f8170a;

        private C1950t0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x006a */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r6 = r6[r0]
                r5.f8170a = r6
                r6 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0074 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0074 }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x0074 }
                java.lang.String r3 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x0074 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0074 }
                java.lang.String r3 = "/srv/imgs/fonts/app"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0074 }
                r3 = 2261075(0x228053, float:3.168441E-39)
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0074 }
                java.lang.String r3 = ".ttf?v="
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0074 }
                java.lang.String r3 = r5.f8170a     // Catch:{ MalformedURLException -> 0x0074 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0074 }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x0074 }
                r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x0074 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x006f }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x006f }
                r2 = 1
                r1.setDoInput(r2)     // Catch:{ IOException -> 0x006f }
                r2 = 5000(0x1388, float:7.006E-42)
                r1.setConnectTimeout(r2)     // Catch:{ IOException -> 0x006f }
                r2 = 7000(0x1b58, float:9.809E-42)
                r1.setReadTimeout(r2)     // Catch:{ IOException -> 0x006f }
                r1.connect()     // Catch:{ IOException -> 0x006f }
                java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x006f }
                british.x.preinicio r2 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x006a }
                java.lang.String r3 = "font"
                java.io.FileOutputStream r2 = r2.openFileOutput(r3, r0)     // Catch:{ Exception -> 0x006a }
                r3 = 1024(0x400, float:1.435E-42)
                byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x006a }
            L_0x0055:
                int r4 = r1.read(r3)     // Catch:{ Exception -> 0x006a }
                if (r4 <= 0) goto L_0x005f
                r2.write(r3, r0, r4)     // Catch:{ Exception -> 0x006a }
                goto L_0x0055
            L_0x005f:
                r2.close()     // Catch:{ Exception -> 0x006a }
                r1.close()     // Catch:{ Exception -> 0x006a }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x006a:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch:{ IOException -> 0x006f }
                return r6
            L_0x006f:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x0074:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.C1950t0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            preinicio.this.mo7813B();
            if (b.byteValue() == -1) {
                preinicio.this.f8099p = false;
            } else {
                SharedPreferences.Editor edit = preinicio.this.f8079G.edit();
                edit.putString("vfu_act", this.f8170a);
                edit.commit();
                preinicio.this.f8085b.mo7487Q(1);
            }
            preinicio.this.mo7828v();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            preinicio.this.mo7831z(R.string.cargando_recursos);
        }
    }

    /* renamed from: british.x.preinicio$u */
    class C1951u implements OnAdLoaded {
        C1951u() {
        }

        public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
            try {
                C1692config.f7133g6.showAd();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: british.x.preinicio$u0 */
    private class C1952u0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f8173a;

        private C1952u0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0070, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x006c */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r6 = r6[r0]
                r5.f8173a = r6
                r6 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0076 }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.String r3 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x0076 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.String r3 = "/srv/imgs/gen/"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0076 }
                r3 = 2261075(0x228053, float:3.168441E-39)
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.String r3 = "_icohome.png?v="
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.String r3 = r5.f8173a     // Catch:{ MalformedURLException -> 0x0076 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x0076 }
                r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x0076 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x0071 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x0071 }
                r2 = 1
                r1.setDoInput(r2)     // Catch:{ IOException -> 0x0071 }
                r2 = 5000(0x1388, float:7.006E-42)
                r1.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0071 }
                r2 = 7000(0x1b58, float:9.809E-42)
                r1.setReadTimeout(r2)     // Catch:{ IOException -> 0x0071 }
                r1.connect()     // Catch:{ IOException -> 0x0071 }
                java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0071 }
                british.x.preinicio r2 = british.p015x.preinicio.this     // Catch:{ IOException -> 0x0071 }
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ IOException -> 0x0071 }
                r2.f8078F = r1     // Catch:{ IOException -> 0x0071 }
                british.x.preinicio r1 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x006c }
                java.lang.String r2 = "icohome"
                java.io.FileOutputStream r1 = r1.openFileOutput(r2, r0)     // Catch:{ Exception -> 0x006c }
                british.x.preinicio r2 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x006c }
                android.graphics.Bitmap r2 = r2.f8078F     // Catch:{ Exception -> 0x006c }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x006c }
                r4 = 100
                r2.compress(r3, r4, r1)     // Catch:{ Exception -> 0x006c }
                r1.close()     // Catch:{ Exception -> 0x006c }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x006c:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch:{ IOException -> 0x0071 }
                return r6
            L_0x0071:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x0076:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.C1952u0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            preinicio.this.mo7813B();
            if (b.byteValue() == -1) {
                preinicio.this.f8099p = false;
            }
            preinicio.this.mo7827u();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            preinicio.this.mo7831z(R.string.cargando_icohome);
        }
    }

    /* renamed from: british.x.preinicio$v */
    class C1953v implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8175a;

        C1953v(AlertDialog alertDialog) {
            this.f8175a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8175a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + preinicio.this.f8090g));
        }
    }

    /* renamed from: british.x.preinicio$v0 */
    private class C1954v0 extends AsyncTask<String, Void, Byte> {
        private C1954v0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x019b, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0197 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r14) {
            /*
                r13 = this;
                british.x.preinicio r14 = british.p015x.preinicio.this
                android.content.SharedPreferences r14 = r14.f8079G
                android.content.SharedPreferences$Editor r14 = r14.edit()
                r0 = 0
                java.lang.String r1 = ""
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
            L_0x000f:
                r6 = 7
                if (r2 >= r6) goto L_0x01aa
                r6 = 1
                java.lang.String r7 = "_imgperso_v_act"
                if (r2 != 0) goto L_0x003b
                java.lang.String r1 = "ofics"
                british.x.preinicio r3 = british.p015x.preinicio.this
                british.x.config r4 = r3.f8085b
                boolean r5 = r4.f7367l0
                int r4 = r4.f7374m0
                android.content.SharedPreferences r3 = r3.f8079G
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r1)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                int r3 = r3.getInt(r8, r0)
            L_0x0036:
                r12 = r5
                r5 = r3
                r3 = r12
                goto L_0x010f
            L_0x003b:
                if (r2 != r6) goto L_0x005d
                java.lang.String r1 = "busc"
                british.x.preinicio r3 = british.p015x.preinicio.this
                british.x.config r4 = r3.f8085b
                boolean r5 = r4.f7277W
                int r4 = r4.f7283X
                android.content.SharedPreferences r3 = r3.f8079G
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r1)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                int r3 = r3.getInt(r8, r0)
                goto L_0x0036
            L_0x005d:
                r8 = 2
                if (r2 != r8) goto L_0x0080
                java.lang.String r1 = "share"
                british.x.preinicio r3 = british.p015x.preinicio.this
                british.x.config r4 = r3.f8085b
                boolean r5 = r4.f7229O
                int r4 = r4.f7235P
                android.content.SharedPreferences r3 = r3.f8079G
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r1)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                int r3 = r3.getInt(r8, r0)
                goto L_0x0036
            L_0x0080:
                r8 = 3
                if (r2 != r8) goto L_0x00a3
                java.lang.String r1 = "exit"
                british.x.preinicio r3 = british.p015x.preinicio.this
                british.x.config r4 = r3.f8085b
                boolean r5 = r4.f7395p0
                int r4 = r4.f7402q0
                android.content.SharedPreferences r3 = r3.f8079G
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r1)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                int r3 = r3.getInt(r8, r0)
                goto L_0x0036
            L_0x00a3:
                r8 = 4
                if (r2 != r8) goto L_0x00c7
                java.lang.String r1 = "notif"
                british.x.preinicio r3 = british.p015x.preinicio.this
                british.x.config r4 = r3.f8085b
                boolean r5 = r4.f7423t0
                int r4 = r4.f7430u0
                android.content.SharedPreferences r3 = r3.f8079G
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r1)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                int r3 = r3.getInt(r8, r0)
                goto L_0x0036
            L_0x00c7:
                r8 = 5
                if (r2 != r8) goto L_0x00eb
                java.lang.String r1 = "perfil"
                british.x.preinicio r3 = british.p015x.preinicio.this
                british.x.config r4 = r3.f8085b
                boolean r5 = r4.f7451x0
                int r4 = r4.f7458y0
                android.content.SharedPreferences r3 = r3.f8079G
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r1)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                int r3 = r3.getInt(r8, r0)
                goto L_0x0036
            L_0x00eb:
                r8 = 6
                if (r2 != r8) goto L_0x010f
                java.lang.String r1 = "search"
                british.x.preinicio r3 = british.p015x.preinicio.this
                british.x.config r4 = r3.f8085b
                boolean r5 = r4.f7253S
                int r4 = r4.f7259T
                android.content.SharedPreferences r3 = r3.f8079G
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r1)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                int r3 = r3.getInt(r8, r0)
                goto L_0x0036
            L_0x010f:
                if (r3 == 0) goto L_0x01a6
                if (r4 <= r5) goto L_0x01a6
                r8 = -1
                java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01a1 }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x01a1 }
                r10.<init>()     // Catch:{ MalformedURLException -> 0x01a1 }
                java.lang.String r11 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x01a1 }
                r10.append(r11)     // Catch:{ MalformedURLException -> 0x01a1 }
                java.lang.String r11 = "/srv/imgs/icos/app"
                r10.append(r11)     // Catch:{ MalformedURLException -> 0x01a1 }
                r11 = 2261075(0x228053, float:3.168441E-39)
                r10.append(r11)     // Catch:{ MalformedURLException -> 0x01a1 }
                java.lang.String r11 = "_"
                r10.append(r11)     // Catch:{ MalformedURLException -> 0x01a1 }
                r10.append(r1)     // Catch:{ MalformedURLException -> 0x01a1 }
                java.lang.String r11 = ".png?v="
                r10.append(r11)     // Catch:{ MalformedURLException -> 0x01a1 }
                r10.append(r4)     // Catch:{ MalformedURLException -> 0x01a1 }
                java.lang.String r10 = r10.toString()     // Catch:{ MalformedURLException -> 0x01a1 }
                r9.<init>(r10)     // Catch:{ MalformedURLException -> 0x01a1 }
                java.net.URLConnection r9 = r9.openConnection()     // Catch:{ IOException -> 0x019c }
                java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ IOException -> 0x019c }
                r9.setDoInput(r6)     // Catch:{ IOException -> 0x019c }
                r6 = 5000(0x1388, float:7.006E-42)
                r9.setConnectTimeout(r6)     // Catch:{ IOException -> 0x019c }
                r6 = 7000(0x1b58, float:9.809E-42)
                r9.setReadTimeout(r6)     // Catch:{ IOException -> 0x019c }
                r9.connect()     // Catch:{ IOException -> 0x019c }
                java.io.InputStream r6 = r9.getInputStream()     // Catch:{ IOException -> 0x019c }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x019c }
                british.x.preinicio r9 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x0197 }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0197 }
                r10.<init>()     // Catch:{ Exception -> 0x0197 }
                java.lang.String r11 = "ico_"
                r10.append(r11)     // Catch:{ Exception -> 0x0197 }
                r10.append(r1)     // Catch:{ Exception -> 0x0197 }
                java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0197 }
                java.io.FileOutputStream r9 = r9.openFileOutput(r10, r0)     // Catch:{ Exception -> 0x0197 }
                android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0197 }
                r11 = 100
                r6.compress(r10, r11, r9)     // Catch:{ Exception -> 0x0197 }
                r9.close()     // Catch:{ Exception -> 0x0197 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r1)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r14.putInt(r6, r4)
                r14.commit()
                goto L_0x01a6
            L_0x0197:
                java.lang.Byte r14 = java.lang.Byte.valueOf(r8)     // Catch:{ IOException -> 0x019c }
                return r14
            L_0x019c:
                java.lang.Byte r14 = java.lang.Byte.valueOf(r8)
                return r14
            L_0x01a1:
                java.lang.Byte r14 = java.lang.Byte.valueOf(r8)
                return r14
            L_0x01a6:
                int r2 = r2 + 1
                goto L_0x000f
            L_0x01aa:
                java.lang.Byte r14 = java.lang.Byte.valueOf(r0)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.C1954v0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            preinicio.this.mo7813B();
            if (b.byteValue() == -1) {
                preinicio.this.f8099p = false;
            }
            preinicio.this.mo7826t();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            preinicio.this.mo7831z(R.string.cargando_recursos);
        }
    }

    /* renamed from: british.x.preinicio$w */
    class C1955w implements OnAdClosed {
        C1955w() {
        }

        public void onAdClosed() {
            preinicio preinicio = preinicio.this;
            if (!preinicio.f8101r) {
                C1692config.f7133g6 = null;
                preinicio.f8101r = true;
                preinicio.mo7815E();
            }
        }
    }

    /* renamed from: british.x.preinicio$w0 */
    private class C1956w0 extends AsyncTask<String, Void, Byte> {
        private C1956w0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ca, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x00c6 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r11) {
            /*
                r10 = this;
                british.x.preinicio r11 = british.p015x.preinicio.this
                android.content.SharedPreferences r11 = r11.f8079G
                android.content.SharedPreferences$Editor r11 = r11.edit()
                r0 = 0
                r1 = 0
            L_0x000a:
                british.x.config$q0[] r2 = british.p015x.C1692config.f7115O5
                int r3 = r2.length
                if (r1 >= r3) goto L_0x00d9
                r2 = r2[r1]
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "mb_it"
                r3.append(r4)
                int r4 = r2.f7544b
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                int r2 = r2.f7546d
                british.x.preinicio r4 = british.p015x.preinicio.this
                android.content.SharedPreferences r4 = r4.f8079G
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r3)
                java.lang.String r6 = "_v_act"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                int r4 = r4.getInt(r5, r0)
                if (r2 <= r4) goto L_0x00d5
                r4 = -1
                java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00d0 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00d0 }
                r7.<init>()     // Catch:{ MalformedURLException -> 0x00d0 }
                java.lang.String r8 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x00d0 }
                r7.append(r8)     // Catch:{ MalformedURLException -> 0x00d0 }
                java.lang.String r8 = "/srv/imgs/icos/app"
                r7.append(r8)     // Catch:{ MalformedURLException -> 0x00d0 }
                r8 = 2261075(0x228053, float:3.168441E-39)
                r7.append(r8)     // Catch:{ MalformedURLException -> 0x00d0 }
                java.lang.String r8 = "_"
                r7.append(r8)     // Catch:{ MalformedURLException -> 0x00d0 }
                r7.append(r3)     // Catch:{ MalformedURLException -> 0x00d0 }
                java.lang.String r8 = ".png?v="
                r7.append(r8)     // Catch:{ MalformedURLException -> 0x00d0 }
                r7.append(r2)     // Catch:{ MalformedURLException -> 0x00d0 }
                java.lang.String r7 = r7.toString()     // Catch:{ MalformedURLException -> 0x00d0 }
                r5.<init>(r7)     // Catch:{ MalformedURLException -> 0x00d0 }
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{ IOException -> 0x00cb }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x00cb }
                r7 = 1
                r5.setDoInput(r7)     // Catch:{ IOException -> 0x00cb }
                r7 = 5000(0x1388, float:7.006E-42)
                r5.setConnectTimeout(r7)     // Catch:{ IOException -> 0x00cb }
                r7 = 7000(0x1b58, float:9.809E-42)
                r5.setReadTimeout(r7)     // Catch:{ IOException -> 0x00cb }
                r5.connect()     // Catch:{ IOException -> 0x00cb }
                java.io.InputStream r5 = r5.getInputStream()     // Catch:{ IOException -> 0x00cb }
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ IOException -> 0x00cb }
                british.x.preinicio r7 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x00c6 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
                r8.<init>()     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r9 = "ico_"
                r8.append(r9)     // Catch:{ Exception -> 0x00c6 }
                r8.append(r3)     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00c6 }
                java.io.FileOutputStream r7 = r7.openFileOutput(r8, r0)     // Catch:{ Exception -> 0x00c6 }
                android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x00c6 }
                r9 = 100
                r5.compress(r8, r9, r7)     // Catch:{ Exception -> 0x00c6 }
                r7.close()     // Catch:{ Exception -> 0x00c6 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                r4.append(r6)
                java.lang.String r3 = r4.toString()
                r11.putInt(r3, r2)
                r11.commit()
                goto L_0x00d5
            L_0x00c6:
                java.lang.Byte r11 = java.lang.Byte.valueOf(r4)     // Catch:{ IOException -> 0x00cb }
                return r11
            L_0x00cb:
                java.lang.Byte r11 = java.lang.Byte.valueOf(r4)
                return r11
            L_0x00d0:
                java.lang.Byte r11 = java.lang.Byte.valueOf(r4)
                return r11
            L_0x00d5:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x00d9:
                java.lang.Byte r11 = java.lang.Byte.valueOf(r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.C1956w0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            preinicio.this.mo7813B();
            if (b.byteValue() == -1) {
                preinicio.this.f8099p = false;
            }
            preinicio.this.mo7824r();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            preinicio.this.mo7831z(R.string.cargando_recursos);
        }
    }

    /* renamed from: british.x.preinicio$x */
    class C1957x implements OnAdError {
        C1957x() {
        }

        public void adError(String str) {
            preinicio preinicio = preinicio.this;
            if (!preinicio.f8101r) {
                C1692config.f7133g6 = null;
                preinicio.f8101r = true;
                preinicio.mo7815E();
            }
        }
    }

    /* renamed from: british.x.preinicio$x0 */
    private class C1958x0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f8181a;

        /* renamed from: b */
        String f8182b;

        private C1958x0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x008d, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0089 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r1 = r6[r0]
                r5.f8181a = r1
                r1 = 1
                r6 = r6[r1]
                r5.f8182b = r6
                r6 = -1
                java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0093 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0093 }
                r3.<init>()     // Catch:{ MalformedURLException -> 0x0093 }
                java.lang.String r4 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x0093 }
                r3.append(r4)     // Catch:{ MalformedURLException -> 0x0093 }
                java.lang.String r4 = "/srv/imgs/sounds/app"
                r3.append(r4)     // Catch:{ MalformedURLException -> 0x0093 }
                r4 = 2261075(0x228053, float:3.168441E-39)
                r3.append(r4)     // Catch:{ MalformedURLException -> 0x0093 }
                java.lang.String r4 = "_"
                r3.append(r4)     // Catch:{ MalformedURLException -> 0x0093 }
                java.lang.String r4 = r5.f8182b     // Catch:{ MalformedURLException -> 0x0093 }
                r3.append(r4)     // Catch:{ MalformedURLException -> 0x0093 }
                java.lang.String r4 = ".wav?v="
                r3.append(r4)     // Catch:{ MalformedURLException -> 0x0093 }
                java.lang.String r4 = r5.f8181a     // Catch:{ MalformedURLException -> 0x0093 }
                r3.append(r4)     // Catch:{ MalformedURLException -> 0x0093 }
                java.lang.String r3 = r3.toString()     // Catch:{ MalformedURLException -> 0x0093 }
                r2.<init>(r3)     // Catch:{ MalformedURLException -> 0x0093 }
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x008e }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x008e }
                r2.setDoInput(r1)     // Catch:{ IOException -> 0x008e }
                r1 = 5000(0x1388, float:7.006E-42)
                r2.setConnectTimeout(r1)     // Catch:{ IOException -> 0x008e }
                r1 = 7000(0x1b58, float:9.809E-42)
                r2.setReadTimeout(r1)     // Catch:{ IOException -> 0x008e }
                r2.connect()     // Catch:{ IOException -> 0x008e }
                java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x008e }
                british.x.preinicio r2 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x0089 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089 }
                r3.<init>()     // Catch:{ Exception -> 0x0089 }
                java.lang.String r4 = "sound_"
                r3.append(r4)     // Catch:{ Exception -> 0x0089 }
                java.lang.String r4 = r5.f8182b     // Catch:{ Exception -> 0x0089 }
                r3.append(r4)     // Catch:{ Exception -> 0x0089 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0089 }
                java.io.FileOutputStream r2 = r2.openFileOutput(r3, r0)     // Catch:{ Exception -> 0x0089 }
                r3 = 1024(0x400, float:1.435E-42)
                byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0089 }
            L_0x0074:
                int r4 = r1.read(r3)     // Catch:{ Exception -> 0x0089 }
                if (r4 <= 0) goto L_0x007e
                r2.write(r3, r0, r4)     // Catch:{ Exception -> 0x0089 }
                goto L_0x0074
            L_0x007e:
                r2.close()     // Catch:{ Exception -> 0x0089 }
                r1.close()     // Catch:{ Exception -> 0x0089 }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x0089:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch:{ IOException -> 0x008e }
                return r6
            L_0x008e:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x0093:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.C1958x0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            preinicio.this.mo7813B();
            if (b.byteValue() == -1) {
                preinicio.this.f8099p = false;
            } else {
                SharedPreferences.Editor edit = preinicio.this.f8079G.edit();
                if (this.f8182b.equals("in")) {
                    edit.putString("vsi_act", this.f8181a);
                } else {
                    edit.putString("vso_act", this.f8181a);
                }
                edit.commit();
            }
            if (this.f8182b.equals("out")) {
                preinicio.this.mo7825s();
            } else {
                preinicio.this.mo7829w();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            preinicio.this.mo7831z(R.string.cargando_recursos);
        }
    }

    /* renamed from: british.x.preinicio$y */
    class C1959y implements OnAdLoaded {
        C1959y() {
        }

        public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
            try {
                C1692config.f7133g6.showAd();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: british.x.preinicio$y0 */
    private class C1960y0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f8185a;

        private C1960y0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0070, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x006c */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r6 = r6[r0]
                r5.f8185a = r6
                r6 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0076 }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.String r3 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x0076 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.String r3 = "/srv/imgs/gen/"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0076 }
                r3 = 2261075(0x228053, float:3.168441E-39)
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.String r3 = "_splash.png?v="
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.String r3 = r5.f8185a     // Catch:{ MalformedURLException -> 0x0076 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0076 }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x0076 }
                r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x0076 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x0071 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x0071 }
                r2 = 1
                r1.setDoInput(r2)     // Catch:{ IOException -> 0x0071 }
                r2 = 5000(0x1388, float:7.006E-42)
                r1.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0071 }
                r2 = 7000(0x1b58, float:9.809E-42)
                r1.setReadTimeout(r2)     // Catch:{ IOException -> 0x0071 }
                r1.connect()     // Catch:{ IOException -> 0x0071 }
                java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0071 }
                british.x.preinicio r2 = british.p015x.preinicio.this     // Catch:{ IOException -> 0x0071 }
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ IOException -> 0x0071 }
                r2.f8077E = r1     // Catch:{ IOException -> 0x0071 }
                british.x.preinicio r1 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x006c }
                java.lang.String r2 = "splash"
                java.io.FileOutputStream r1 = r1.openFileOutput(r2, r0)     // Catch:{ Exception -> 0x006c }
                british.x.preinicio r2 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x006c }
                android.graphics.Bitmap r2 = r2.f8077E     // Catch:{ Exception -> 0x006c }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x006c }
                r4 = 100
                r2.compress(r3, r4, r1)     // Catch:{ Exception -> 0x006c }
                r1.close()     // Catch:{ Exception -> 0x006c }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x006c:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch:{ IOException -> 0x0071 }
                return r6
            L_0x0071:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x0076:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.C1960y0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            preinicio.this.mo7813B();
            if (b.byteValue() == -1) {
                preinicio.this.f8099p = false;
            } else {
                ImageView imageView = (ImageView) preinicio.this.findViewById(R.id.iv_splash);
                try {
                    C1692config config = preinicio.this.f8085b;
                    config.mo7514k1(imageView, Boolean.valueOf(config.f7464z), preinicio.this.f8085b.f7151B);
                } catch (Exception unused) {
                }
                imageView.setImageBitmap(preinicio.this.f8077E);
                imageView.setVisibility(0);
            }
            preinicio.this.mo7823q();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            preinicio.this.mo7831z(R.string.cargando_splash);
        }
    }

    /* renamed from: british.x.preinicio$z */
    class C1961z implements OnAdClosed {
        C1961z() {
        }

        public void onAdClosed() {
            C1692config.f7133g6 = null;
        }
    }

    /* renamed from: british.x.preinicio$z0 */
    class C1962z0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        int f8188a;

        C1962z0(int i) {
            this.f8188a = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
            r9.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x008f */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r9) {
            /*
                r8 = this;
                int r9 = r8.f8188a
                java.lang.String r0 = "https://imgs1.e-droid.net/srv/imgs/anun/"
                if (r9 != 0) goto L_0x001c
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r0)
                british.x.preinicio r0 = british.p015x.preinicio.this
                british.x.config r0 = r0.f8085b
                java.lang.String r0 = r0.f7226N2
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                goto L_0x0031
            L_0x001c:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r0)
                british.x.preinicio r0 = british.p015x.preinicio.this
                british.x.config r0 = r0.f8085b
                java.lang.String r0 = r0.f7220M2
                r9.append(r0)
                java.lang.String r9 = r9.toString()
            L_0x0031:
                r0 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x009f }
                r1.<init>(r9)     // Catch:{ MalformedURLException -> 0x009f }
                r9 = 0
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x008f }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x008f }
                r9 = 1
                r1.setDoInput(r9)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                r2 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                r1.connect()     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                british.x.preinicio r3 = british.p015x.preinicio.this     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                r4.<init>()     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                java.lang.String r5 = "acad_temp_"
                r4.append(r5)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                int r5 = r8.f8188a     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                r4.append(r5)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                r5 = 0
                java.io.FileOutputStream r3 = r3.openFileOutput(r4, r5)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                r4 = 256(0x100, float:3.59E-43)
                byte[] r6 = new byte[r4]     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            L_0x006f:
                int r7 = r2.read(r6, r5, r4)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                if (r7 < 0) goto L_0x0079
                r3.write(r6, r5, r7)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                goto L_0x006f
            L_0x0079:
                r3.close()     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                r2.close()     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
                r1.disconnect()
                java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
                return r9
            L_0x0087:
                r9 = move-exception
                goto L_0x0099
            L_0x0089:
                r9 = r1
                goto L_0x008f
            L_0x008b:
                r0 = move-exception
                r1 = r9
                r9 = r0
                goto L_0x0099
            L_0x008f:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x008b }
                if (r9 == 0) goto L_0x0098
                r9.disconnect()
            L_0x0098:
                return r0
            L_0x0099:
                if (r1 == 0) goto L_0x009e
                r1.disconnect()
            L_0x009e:
                throw r9
            L_0x009f:
                java.lang.Byte r9 = java.lang.Byte.valueOf(r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.C1962z0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            ImageView imageView;
            if (b.byteValue() == 1) {
                try {
                    preinicio preinicio = preinicio.this;
                    FileInputStream openFileInput = preinicio.openFileInput("acad_temp_" + this.f8188a);
                    if (this.f8188a == 0) {
                        imageView = (ImageView) preinicio.this.findViewById(R.id.acad_na_icon);
                    } else {
                        imageView = (ImageView) preinicio.this.findViewById(R.id.acad_na_media);
                    }
                    imageView.setImageBitmap(BitmapFactory.decodeStream(openFileInput));
                    openFileInput.close();
                } catch (FileNotFoundException | IOException | OutOfMemoryError unused) {
                }
            }
            if (this.f8188a == 0) {
                preinicio.this.f8108y = true;
            } else {
                preinicio.this.f8109z = true;
            }
            preinicio preinicio2 = preinicio.this;
            if (preinicio2.f8108y && preinicio2.f8109z) {
                preinicio2.findViewById(R.id.progressBar).setVisibility(8);
                preinicio.this.findViewById(R.id.acad_na_view).setVisibility(0);
                new C1692config.C1728p0(C1692config.f7109I5 + "/srv/acad.php?idapp=" + 2261075 + "&idusu=" + preinicio.this.f8094k + "&tipo=1&ref=" + preinicio.this.f8085b.f7244Q2, "Android Vinebre Software").execute(new String[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m8401D() {
        this.f8103t = false;
        this.f8104u = false;
        int j1 = this.f8085b.mo7511j1();
        if (j1 == 2 || j1 == 5) {
            if (j1 != 5 && !C1692config.m8195o0(this)) {
                Interstitial interstitial = new Interstitial(getApplicationContext(), C1692config.f7122V5);
                C1692config.f7133g6 = interstitial;
                interstitial.setMute(true);
                if (!C1692config.f7131e6.booleanValue()) {
                    C1692config.f7133g6.setAutoPlay(false);
                }
                C1692config.f7133g6.setBackButtonCanClose(true);
                C1692config.f7133g6.setSkipText(getResources().getString(R.string.ad_saltar));
                C1692config.f7133g6.setOnAdLoadedCallback(new C1959y());
                C1692config.f7133g6.setOnAdClosedCallback(new C1961z());
                C1692config.f7133g6.setOnAdErrorCallback(new C1904a0());
                C1692config.f7133g6.loadAd();
                mo7815E();
            } else if (j1 == 5 || C1692config.f7140n6 == 1) {
                String str = j1 == 2 ? C1692config.f7122V5 : null;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.3f, 1.0f, 0.3f, 1, 0.5f, 1, 0.0f);
                scaleAnimation.setFillAfter(true);
                scaleAnimation.setDuration(500);
                scaleAnimation.setAnimationListener(new C1949t(str));
                ImageView imageView = (ImageView) findViewById(R.id.iv_splash);
                WebView webView = (WebView) findViewById(R.id.wv_splash);
                if (webView.getVisibility() == 0) {
                    webView.setVisibility(8);
                    findViewById(R.id.v_anext).setVisibility(8);
                    findViewById(R.id.rl_anext).setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    m8418x(str);
                } else if (imageView.getVisibility() == 0) {
                    imageView.startAnimation(scaleAnimation);
                } else {
                    findViewById(R.id.v_anext).setVisibility(8);
                    findViewById(R.id.rl_anext).setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    m8418x(str);
                }
            } else {
                Interstitial interstitial2 = new Interstitial(getApplicationContext(), C1692config.f7122V5);
                C1692config.f7133g6 = interstitial2;
                interstitial2.setMute(true);
                if (!C1692config.f7131e6.booleanValue()) {
                    C1692config.f7133g6.setAutoPlay(false);
                }
                C1692config.f7133g6.setBackButtonCanClose(true);
                C1692config.f7133g6.setSkipText(getResources().getString(R.string.ad_saltar));
                C1692config.f7133g6.setOnAdLoadedCallback(new C1951u());
                C1692config.f7133g6.setOnAdClosedCallback(new C1955w());
                C1692config.f7133g6.setOnAdErrorCallback(new C1957x());
                C1692config.f7133g6.loadAd();
            }
        } else if (j1 == 1) {
            this.f8103t = true;
            mo7815E();
        } else if (j1 == 3) {
            this.f8104u = true;
            mo7815E();
        } else if (j1 == 4) {
            if (C1692config.m8195o0(this)) {
                C1692config.f7135i6 = new StartAppAd(getApplicationContext());
                C1692config.f7135i6.showAd(C1692config.f7139m6 == 1 ? "Intersticial entrada" : "INTERSTITIAL", new C1907b0());
                return;
            }
            StartAppAd startAppAd = new StartAppAd(getApplicationContext());
            C1692config.f7135i6 = startAppAd;
            startAppAd.loadAd((AdEventListener) new C1909c0());
            mo7815E();
        } else if (j1 == 8) {
            AdColony.requestInterstitial(C1692config.f7127a6, new C1912d0());
        } else if (j1 == 9) {
            C1692config.f7137k6 = 9;
            mo7815E();
        } else if (j1 == 10) {
            C1692config.f7137k6 = 10;
            mo7815E();
        } else {
            mo7815E();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m8402F() {
        int i;
        if (this.f8085b.f7288X4 > 0) {
            int i2 = this.f8079G.getInt("rt_n", 0);
            if (i2 == -1) {
                m8401D();
                return;
            }
            int i3 = i2 + 1;
            SharedPreferences.Editor edit = this.f8079G.edit();
            edit.putInt("rt_n", i3);
            edit.commit();
            C1692config config = this.f8085b;
            int i4 = config.f7288X4;
            if (i3 < i4) {
                m8401D();
            } else if (i3 == i4 || ((i = config.f7294Y4) > 0 && (i3 - i4) % i == 0)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                RatingBar ratingBar = new RatingBar(this);
                if (this.f8085b.f7300Z4 == 1) {
                    ratingBar.setNumStars(5);
                    try {
                        if (!this.f8090g.equals("")) {
                            LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
                            Drawable drawable = layerDrawable.getDrawable(2);
                            drawable.setColorFilter(Color.parseColor("#" + this.f8090g), PorterDuff.Mode.SRC_ATOP);
                            Drawable drawable2 = layerDrawable.getDrawable(1);
                            drawable2.setColorFilter(Color.parseColor("#" + this.f8090g), PorterDuff.Mode.SRC_ATOP);
                        }
                    } catch (Exception unused) {
                    }
                    LinearLayout linearLayout = new LinearLayout(this);
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    linearLayout.setGravity(17);
                    linearLayout.addView(ratingBar);
                    builder.setView(linearLayout);
                }
                builder.setCancelable(false);
                builder.setPositiveButton(this.f8085b.f7276V4.equals("") ? getResources().getString(R.string.aceptar) : this.f8085b.f7276V4, new C1921h(ratingBar));
                builder.setNegativeButton(this.f8085b.f7282W4.equals("") ? getResources().getString(R.string.cancelar) : this.f8085b.f7282W4, new C1923i());
                if (!this.f8085b.f7264T4.equals("")) {
                    builder.setTitle(this.f8085b.f7264T4);
                }
                if (!this.f8085b.f7270U4.equals("")) {
                    builder.setMessage(this.f8085b.f7270U4);
                }
                AlertDialog create = builder.create();
                if (!this.f8090g.equals("")) {
                    create.setOnShowListener(new C1926j(create));
                }
                try {
                    create.show();
                } catch (Exception unused2) {
                }
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused3) {
                }
            } else {
                m8401D();
            }
        } else {
            m8401D();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m8403G() {
        String str;
        String str2;
        Drawable drawable;
        String str3;
        String str4;
        String str5;
        C1692config.f7120T5 = "";
        try {
            C1692config.f7120T5 = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString("com.google.android.gms.ads.APPLICATION_ID", "");
        } catch (Exception unused) {
        }
        if (C1692config.f7120T5.equals("")) {
            C1692config config = this.f8085b;
            config.f7315c3 = "";
            C1692config.f7124X5 = "";
            config.f7321d3 = "";
            config.f7454x3 = "";
            config.f7161C3 = "";
            config.f7197I3 = "";
            config.f7245Q3 = "";
        } else {
            MobileAds.initialize(this);
        }
        boolean z = true;
        if (!this.f8085b.f7377m3.equals("")) {
            IronSource.setConsent(true);
            IronSource.setMetaData("do_not_sell", "true");
            if (!this.f8085b.f7293Y3.equals("")) {
                IronSource.setRewardedVideoListener(new C1903a());
                IronSource.init(this, this.f8085b.f7377m3, IronSource.AD_UNIT.REWARDED_VIDEO);
            }
            if (!this.f8085b.f7357j3.equals("") || !this.f8085b.f7233O3.equals("") || !this.f8085b.f7239P3.equals("") || !this.f8085b.f7155B3.equals("") || !this.f8085b.f7185G3.equals("") || !this.f8085b.f7299Z3.equals("")) {
                IronSource.init(this, this.f8085b.f7377m3, IronSource.AD_UNIT.BANNER);
            }
            if (!C1692config.f7129c6.equals("")) {
                IronSource.init(this, this.f8085b.f7377m3, IronSource.AD_UNIT.INTERSTITIAL);
            }
        }
        Boolean bool = Boolean.FALSE;
        String str6 = this.f8085b.f7309b3;
        if (str6 == null || str6.equals("")) {
            String str7 = this.f8085b.f7191H3;
            if (str7 == null || str7.equals("")) {
                String str8 = this.f8085b.f7203J3;
                if (str8 == null || str8.equals("")) {
                    C1692config config2 = this.f8085b;
                    if (!config2.f7413r4 || (str5 = config2.f7392o4) == null || str5.equals("")) {
                        String str9 = this.f8085b.f7371l4;
                        if (str9 == null || str9.equals("")) {
                            String str10 = this.f8085b.f7426t3;
                            if (str10 == null || str10.equals("")) {
                                str = "";
                            } else {
                                str = this.f8085b.f7426t3;
                            }
                        } else {
                            str = this.f8085b.f7371l4;
                        }
                    } else {
                        str = this.f8085b.f7392o4;
                    }
                } else {
                    str = this.f8085b.f7203J3;
                }
            } else {
                str = this.f8085b.f7191H3;
            }
        } else {
            str = this.f8085b.f7309b3;
        }
        if (!str.equals("")) {
            bool = Boolean.TRUE;
        } else {
            String str11 = C1692config.f7121U5;
            if ((str11 != null && !str11.equals("")) || (((str3 = C1692config.f7122V5) != null && !str3.equals("")) || ((str4 = C1692config.f7123W5) != null && !str4.equals("")))) {
                bool = Boolean.TRUE;
            }
        }
        if (bool.booleanValue()) {
            Appnext.init(this);
            Appnext.setParam("consent", "true");
        }
        if (!str.equals("")) {
            this.f8085b.f7463y5 = new ArrayList<>();
            AdLoader.load(getApplicationContext(), str, new NativeAdRequest(), new C1906b(), 4);
        }
        if (!C1692config.f7126Z5.equals("")) {
            str2 = C1692config.f7126Z5;
        } else if (!this.f8085b.f7339g3.equals("")) {
            str2 = this.f8085b.f7339g3;
        } else if (!this.f8085b.f7149A3.equals("")) {
            str2 = this.f8085b.f7149A3;
        } else if (!this.f8085b.f7221M3.equals("")) {
            str2 = this.f8085b.f7221M3;
        } else if (!this.f8085b.f7227N3.equals("")) {
            str2 = this.f8085b.f7227N3;
        } else if (!this.f8085b.f7275V3.equals("")) {
            str2 = this.f8085b.f7275V3;
        } else {
            C1692config config3 = this.f8085b;
            if (!config3.f7413r4 || config3.f7406q4.equals("")) {
                String str12 = this.f8085b.f7378m4;
                if (str12 == null || str12.equals("")) {
                    String str13 = this.f8085b.f7433u3;
                    if (str13 == null || str13.equals("")) {
                        str2 = "";
                    } else {
                        str2 = this.f8085b.f7433u3;
                    }
                } else {
                    str2 = this.f8085b.f7378m4;
                }
            } else {
                str2 = this.f8085b.f7406q4;
            }
        }
        if (!str2.equals("")) {
            int i = this.f8079G.getInt("fnac_a", 0);
            int i2 = this.f8079G.getInt("sexo", 0);
            if (i != 0 || i2 == 1 || i2 == 2) {
                SDKAdPreferences sDKAdPreferences = new SDKAdPreferences();
                if (i != 0) {
                    Calendar instance = Calendar.getInstance();
                    instance.set(i, 0, 1);
                    sDKAdPreferences.setAge(Calendar.getInstance().get(1) - instance.get(1));
                }
                if (i2 == 1) {
                    sDKAdPreferences.setGender(SDKAdPreferences.Gender.MALE);
                } else if (i2 == 2) {
                    sDKAdPreferences.setGender(SDKAdPreferences.Gender.FEMALE);
                }
                StartAppSDK.init((Context) this, str2, sDKAdPreferences, false);
            } else {
                StartAppSDK.init((Context) this, str2, false);
            }
            StartAppAd.disableSplash();
            StartAppAd.enableConsent(this, false);
            StartAppSDK.setUserConsent(this, "pas", System.currentTimeMillis(), true);
            String str14 = this.f8085b.f7433u3;
            if (str14 != null && !str14.equals("")) {
                StartAppNativeAd startAppNativeAd = new StartAppNativeAd(this);
                NativeAdPreferences secondaryImageSize = new NativeAdPreferences().setAdsNumber(4).setAutoBitmapDownload(true).setPrimaryImageSize(4).setSecondaryImageSize(0);
                secondaryImageSize.setAdTag("IN-CHAT");
                startAppNativeAd.loadAd(secondaryImageSize, new C1908c(startAppNativeAd));
            }
        }
        if (!this.f8085b.f7363k3.equals("") && (!this.f8085b.f7345h3.equals("") || !C1692config.f7127a6.equals("") || !this.f8085b.f7281W3.equals(""))) {
            AdColonyAppOptions adColonyAppOptions = new AdColonyAppOptions();
            if (C1692config.f7119S5) {
                adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.GDPR, true);
            } else {
                adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.GDPR, false);
            }
            adColonyAppOptions.setPrivacyConsentString(AdColonyAppOptions.GDPR, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            C1692config config4 = this.f8085b;
            AdColony.configure((Activity) this, adColonyAppOptions, config4.f7363k3, config4.f7345h3, C1692config.f7127a6, config4.f7281W3);
        }
        if (!this.f8085b.f7370l3.equals("") && (!this.f8085b.f7351i3.equals("") || !C1692config.f7128b6.equals("") || !this.f8085b.f7287X3.equals("") || !this.f8085b.f7327e3.equals(""))) {
            MetaData metaData = new MetaData(this);
            Boolean bool2 = Boolean.TRUE;
            metaData.set("privacy.consent", (Object) bool2);
            metaData.commit();
            if (C1692config.f7119S5) {
                MetaData metaData2 = new MetaData(this);
                metaData2.set("gdpr.consent", (Object) bool2);
                metaData2.commit();
            }
            try {
                UnityAds.initialize(this, this.f8085b.f7370l3, false, new C1911d());
            } catch (Exception unused2) {
            }
        }
        this.f8100q = false;
        if (!this.f8085b.f7246Q4.equals("") && !this.f8079G.getBoolean("bienvenida_nomas", false)) {
            this.f8100q = true;
            this.f8076D = new AlertDialog.Builder(this);
            if (!this.f8085b.f7240P4.equals("")) {
                this.f8076D.setTitle(this.f8085b.f7240P4);
            }
            C1692config config5 = this.f8085b;
            if (config5.f7252R4) {
                View inflate = getLayoutInflater().inflate(R.layout.bienvenida, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.message);
                textView.setMovementMethod(new ScrollingMovementMethod());
                textView.setText(Html.fromHtml(this.f8085b.f7246Q4));
                this.f8082J = (CheckBox) inflate.findViewById(R.id.skip);
                if (!this.f8090g.equals("")) {
                    C1692config.m8197q(this.f8082J, this.f8090g);
                }
                this.f8082J.setChecked(this.f8085b.f7258S4);
                this.f8076D.setView(inflate);
            } else {
                this.f8076D.setMessage(Html.fromHtml(config5.f7246Q4));
            }
            this.f8076D.setCancelable(false);
            this.f8076D.setPositiveButton(getString(R.string.aceptar), new C1913e());
        }
        if (this.f8085b.f7443w <= 0 || (findViewById(R.id.wv_splash).getVisibility() != 0 && ((drawable = ((ImageView) findViewById(R.id.iv_splash)).getDrawable()) == null || ((BitmapDrawable) drawable).getBitmap() == null))) {
            z = false;
        }
        if (z) {
            new C1915f().start();
        } else if (this.f8100q) {
            AlertDialog create = this.f8076D.create();
            if (!this.f8090g.equals("")) {
                create.setOnShowListener(new C1919g(create));
            }
            try {
                create.show();
                if (!this.f8085b.f7252R4) {
                    try {
                        ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                    } catch (Exception unused3) {
                    }
                }
            } catch (Exception unused4) {
                m8402F();
            }
        } else {
            m8402F();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m8404H() {
        if (!this.f8085b.f7290Y0 || this.f8079G.getInt("a", 0) != 1 || this.f8079G.contains("cookies_aceptado")) {
            m8403G();
            return;
        }
        String country = Locale.getDefault().getCountry();
        if (country != null) {
            C1692config.f7119S5 = Arrays.asList(new String[]{"BE", "LT", "PT", "BG", "ES", "LU", "RO", "CZ", "FR", "HU", "SI", "DK", "MT", "SK", "DE", "IT", "NL", "FI", "EE", "CY", "AT", "SE", "IE", "LV", "PL", "CH", "NO", IronSourceConstants.INTERSTITIAL_EVENT_TYPE, "LI", "HR", "GR", "GB", "UK"}).contains(country.toUpperCase());
        }
        if (C1692config.f7119S5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getString(R.string.cookies_txt)).setTitle(getString(R.string.aviso));
            builder.setCancelable(false);
            builder.setNegativeButton(R.string.no, new C1939p0());
            builder.setPositiveButton(R.string.si, new C1941q0());
            AlertDialog create = builder.create();
            if (!this.f8090g.equals("")) {
                create.setOnShowListener(new C1943r0(create));
            }
            try {
                create.show();
            } catch (Exception unused) {
            }
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused2) {
            }
        } else {
            m8403G();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m8414j() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + this.f8085b.f7238P2 + "&referrer=" + this.f8085b.f7244Q2)));
        new C1692config.C1728p0(C1692config.f7109I5 + "/srv/acad.php?idapp=" + 2261075 + "&idusu=" + this.f8094k + "&tipo=2&ref=" + this.f8085b.f7244Q2, "Android Vinebre Software").execute(new String[0]);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x0360 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x028a  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8415k(java.lang.Boolean r22, com.appnext.nativeads.NativeAd r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r22.booleanValue()
            r3 = 8
            if (r2 != 0) goto L_0x0016
            r2 = 2131362810(0x7f0a03fa, float:1.8345411E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
        L_0x0016:
            r2 = 2131362809(0x7f0a03f9, float:1.834541E38)
            r4 = 3
            android.view.View r5 = r0.findViewById(r2)     // Catch:{ Exception -> 0x0026 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0026 }
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0026 }
            r5.setTypeface(r6, r4)     // Catch:{ Exception -> 0x0026 }
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            android.content.SharedPreferences r5 = r0.f8079G
            java.lang.String r6 = "c1_sp"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.getString(r6, r7)
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x005e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "#"
            r5.append(r8)
            android.content.SharedPreferences r8 = r0.f8079G
            java.lang.String r6 = r8.getString(r6, r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            boolean r5 = british.p015x.C1692config.m8153I(r5)
            if (r5 != 0) goto L_0x005e
            android.view.View r5 = r0.findViewById(r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = -1
            r5.setTextColor(r6)
        L_0x005e:
            android.view.View r2 = r0.findViewById(r2)
            r5 = 0
            r2.setVisibility(r5)
            boolean r2 = r22.booleanValue()
            r6 = 2131362671(0x7f0a036f, float:1.834513E38)
            r7 = 1
            if (r2 == 0) goto L_0x0085
            british.x.preinicio$z0 r2 = new british.x.preinicio$z0
            r2.<init>(r5)
            java.lang.String[] r8 = new java.lang.String[r5]
            r2.execute(r8)
            british.x.preinicio$z0 r2 = new british.x.preinicio$z0
            r2.<init>(r7)
            java.lang.String[] r8 = new java.lang.String[r5]
            r2.execute(r8)
            goto L_0x0092
        L_0x0085:
            android.view.View r2 = r0.findViewById(r6)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.String r8 = r23.getIconURL()
            r1.downloadAndDisplayImage(r0, r2, r8)
        L_0x0092:
            boolean r2 = r22.booleanValue()
            r8 = 2131361821(0x7f0a001d, float:1.8343405E38)
            r9 = 2131362674(0x7f0a0372, float:1.8345135E38)
            if (r2 == 0) goto L_0x00ac
            android.view.View r2 = r0.findViewById(r8)
            android.widget.TextView r2 = (android.widget.TextView) r2
            british.x.config r10 = r0.f8085b
            java.lang.String r10 = r10.f7208K2
            r2.setText(r10)
            goto L_0x00b9
        L_0x00ac:
            android.view.View r2 = r0.findViewById(r9)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r10 = r23.getAdTitle()
            r2.setText(r10)
        L_0x00b9:
            android.graphics.Typeface r10 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x00bf }
            r2.setTypeface(r10, r7)     // Catch:{ Exception -> 0x00bf }
            goto L_0x00c0
        L_0x00bf:
        L_0x00c0:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 2131034119(0x7f050007, float:1.7678747E38)
            r12 = 17
            r13 = 4
            if (r10 < r12) goto L_0x00d7
            android.content.res.Resources r10 = r21.getResources()
            boolean r10 = r10.getBoolean(r11)
            if (r10 == 0) goto L_0x00d7
            r2.setTextDirection(r13)
        L_0x00d7:
            boolean r2 = r22.booleanValue()
            r10 = 2131361820(0x7f0a001c, float:1.8343403E38)
            r14 = 0
            if (r2 == 0) goto L_0x00e8
            android.view.View r2 = r0.findViewById(r10)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            goto L_0x00fc
        L_0x00e8:
            r2 = 2131362673(0x7f0a0371, float:1.8345133E38)
            android.view.View r2 = r0.findViewById(r2)
            com.appnext.nativeads.MediaView r2 = (com.appnext.nativeads.MediaView) r2
            r2.setMute(r7)     // Catch:{ Exception -> 0x00f4 }
        L_0x00f4:
            r1.setMediaView(r2)
            r20 = r14
            r14 = r2
            r2 = r20
        L_0x00fc:
            android.content.res.Resources r15 = r21.getResources()
            android.content.res.Configuration r15 = r15.getConfiguration()
            int r15 = r15.orientation
            r9 = 2
            if (r15 != r9) goto L_0x010b
        L_0x0109:
            r6 = 1
            goto L_0x0141
        L_0x010b:
            r15 = 372(0x174, float:5.21E-43)
            android.content.Context r6 = r21.getApplicationContext()
            int r6 = british.p015x.C1692config.m8149E(r6, r15)
            android.content.Context r15 = r21.getApplicationContext()
            java.lang.String r10 = "window"
            java.lang.Object r10 = r15.getSystemService(r10)
            android.view.WindowManager r10 = (android.view.WindowManager) r10
            android.view.Display r10 = r10.getDefaultDisplay()
            android.graphics.Point r15 = new android.graphics.Point
            r15.<init>()
            r10.getSize(r15)
            int r10 = r15.y
            double r11 = (double) r10
            r16 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r16
            double r8 = (double) r6
            int r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0140
            goto L_0x0109
        L_0x0140:
            r6 = 0
        L_0x0141:
            r8 = 2131361816(0x7f0a0018, float:1.8343395E38)
            r9 = 2131362102(0x7f0a0136, float:1.8343975E38)
            if (r6 == 0) goto L_0x0168
            boolean r6 = r22.booleanValue()
            if (r6 == 0) goto L_0x015c
            r2.setVisibility(r3)
            android.view.View r2 = r0.findViewById(r8)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setMaxLines(r7)
            goto L_0x0168
        L_0x015c:
            r14.setVisibility(r3)
            android.view.View r2 = r0.findViewById(r9)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setMaxLines(r7)
        L_0x0168:
            boolean r2 = r22.booleanValue()
            if (r2 == 0) goto L_0x0173
            british.x.config r2 = r0.f8085b
            java.lang.String r2 = r2.f7232O2
            goto L_0x0177
        L_0x0173:
            java.lang.String r2 = r23.getStoreRating()
        L_0x0177:
            if (r2 == 0) goto L_0x02de
            int r3 = r2.length()
            if (r3 != r4) goto L_0x02de
            boolean r3 = r22.booleanValue()
            if (r3 == 0) goto L_0x01e3
            r3 = 2131361823(0x7f0a001f, float:1.834341E38)
            android.view.View r3 = r0.findViewById(r3)
            r6 = 2131361826(0x7f0a0022, float:1.8343415E38)
            android.view.View r6 = r0.findViewById(r6)
            r11 = 2131361829(0x7f0a0025, float:1.8343421E38)
            android.view.View r11 = r0.findViewById(r11)
            r12 = 2131361832(0x7f0a0028, float:1.8343427E38)
            android.view.View r12 = r0.findViewById(r12)
            r10 = 2131361835(0x7f0a002b, float:1.8343434E38)
            android.view.View r10 = r0.findViewById(r10)
            r15 = 2131361828(0x7f0a0024, float:1.834342E38)
            android.view.View r15 = r0.findViewById(r15)
            r9 = 2131361831(0x7f0a0027, float:1.8343425E38)
            android.view.View r9 = r0.findViewById(r9)
            r8 = 2131361834(0x7f0a002a, float:1.8343432E38)
            android.view.View r8 = r0.findViewById(r8)
            r13 = 2131361837(0x7f0a002d, float:1.8343438E38)
            android.view.View r13 = r0.findViewById(r13)
            r4 = 2131361827(0x7f0a0023, float:1.8343417E38)
            android.view.View r4 = r0.findViewById(r4)
            r5 = 2131361830(0x7f0a0026, float:1.8343423E38)
            android.view.View r5 = r0.findViewById(r5)
            r7 = 2131361833(0x7f0a0029, float:1.834343E38)
            android.view.View r7 = r0.findViewById(r7)
            r18 = r3
            r3 = 2131361836(0x7f0a002c, float:1.8343436E38)
            android.view.View r3 = r0.findViewById(r3)
            goto L_0x0240
        L_0x01e3:
            r3 = 2131362815(0x7f0a03ff, float:1.8345421E38)
            android.view.View r3 = r0.findViewById(r3)
            r4 = 2131362818(0x7f0a0402, float:1.8345427E38)
            android.view.View r6 = r0.findViewById(r4)
            r4 = 2131362821(0x7f0a0405, float:1.8345433E38)
            android.view.View r11 = r0.findViewById(r4)
            r4 = 2131362824(0x7f0a0408, float:1.834544E38)
            android.view.View r12 = r0.findViewById(r4)
            r4 = 2131362827(0x7f0a040b, float:1.8345446E38)
            android.view.View r10 = r0.findViewById(r4)
            r4 = 2131362820(0x7f0a0404, float:1.8345431E38)
            android.view.View r15 = r0.findViewById(r4)
            r4 = 2131362823(0x7f0a0407, float:1.8345437E38)
            android.view.View r9 = r0.findViewById(r4)
            r4 = 2131362826(0x7f0a040a, float:1.8345444E38)
            android.view.View r8 = r0.findViewById(r4)
            r4 = 2131362829(0x7f0a040d, float:1.834545E38)
            android.view.View r13 = r0.findViewById(r4)
            r4 = 2131362819(0x7f0a0403, float:1.834543E38)
            android.view.View r4 = r0.findViewById(r4)
            r5 = 2131362822(0x7f0a0406, float:1.8345435E38)
            android.view.View r5 = r0.findViewById(r5)
            r7 = 2131362825(0x7f0a0409, float:1.8345442E38)
            android.view.View r7 = r0.findViewById(r7)
            r18 = r3
            r3 = 2131362828(0x7f0a040c, float:1.8345448E38)
            android.view.View r3 = r0.findViewById(r3)
        L_0x0240:
            r1 = r15
            r15 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r18
            r18 = r14
            r0 = 0
            r14 = 1
            java.lang.String r19 = r2.substring(r0, r14)     // Catch:{ Exception -> 0x026a }
            int r0 = java.lang.Integer.parseInt(r19)     // Catch:{ Exception -> 0x026a }
            r19 = r0
            r0 = 3
            r14 = 2
            java.lang.String r2 = r2.substring(r14, r0)     // Catch:{ Exception -> 0x0267 }
            int r0 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0267 }
            goto L_0x026e
        L_0x0267:
            r0 = r19
            goto L_0x026b
        L_0x026a:
            r0 = 0
        L_0x026b:
            r19 = r0
            r0 = 0
        L_0x026e:
            r14 = 3
            if (r0 >= r14) goto L_0x0275
        L_0x0271:
            r14 = r19
            r0 = 0
            goto L_0x027e
        L_0x0275:
            r14 = 7
            if (r0 <= r14) goto L_0x027b
            int r19 = r19 + 1
            goto L_0x0271
        L_0x027b:
            r14 = r19
            r0 = 5
        L_0x027e:
            if (r14 <= 0) goto L_0x02e0
            r2 = 6
            if (r14 >= r2) goto L_0x02e0
            r2 = 0
            r3.setVisibility(r2)
            r3 = 1
            if (r14 <= r3) goto L_0x02ca
            r7.setVisibility(r2)
            r1 = 2
            if (r14 <= r1) goto L_0x02b9
            r12.setVisibility(r2)
            r1 = 3
            if (r14 <= r1) goto L_0x02ab
            r13.setVisibility(r2)
            r1 = 4
            if (r14 <= r1) goto L_0x02a0
            r11.setVisibility(r2)
            goto L_0x02e0
        L_0x02a0:
            r3 = 5
            if (r0 != r3) goto L_0x02a7
            r15.setVisibility(r2)
            goto L_0x02e0
        L_0x02a7:
            r4.setVisibility(r2)
            goto L_0x02e0
        L_0x02ab:
            r3 = 5
            if (r0 != r3) goto L_0x02b2
            r9.setVisibility(r2)
            goto L_0x02b5
        L_0x02b2:
            r8.setVisibility(r2)
        L_0x02b5:
            r4.setVisibility(r2)
            goto L_0x02e0
        L_0x02b9:
            r3 = 5
            if (r0 != r3) goto L_0x02c0
            r10.setVisibility(r2)
            goto L_0x02c3
        L_0x02c0:
            r6.setVisibility(r2)
        L_0x02c3:
            r8.setVisibility(r2)
            r4.setVisibility(r2)
            goto L_0x02e0
        L_0x02ca:
            r3 = 5
            if (r0 != r3) goto L_0x02d1
            r1.setVisibility(r2)
            goto L_0x02d4
        L_0x02d1:
            r5.setVisibility(r2)
        L_0x02d4:
            r6.setVisibility(r2)
            r8.setVisibility(r2)
            r4.setVisibility(r2)
            goto L_0x02e0
        L_0x02de:
            r18 = r14
        L_0x02e0:
            boolean r0 = r22.booleanValue()
            r1 = 2131361817(0x7f0a0019, float:1.8343397E38)
            if (r0 == 0) goto L_0x030b
            r2 = 2131361816(0x7f0a0018, float:1.8343395E38)
            r0 = r21
            android.view.View r3 = r0.findViewById(r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            british.x.config r2 = r0.f8085b
            java.lang.String r2 = r2.f7214L2
            r3.setText(r2)
            r2 = 2131361815(0x7f0a0017, float:1.8343393E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.View r4 = r0.findViewById(r1)
            android.widget.Button r4 = (android.widget.Button) r4
            goto L_0x032f
        L_0x030b:
            r2 = 2131362102(0x7f0a0136, float:1.8343975E38)
            r0 = r21
            android.view.View r3 = r0.findViewById(r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r2 = r23.getAdDescription()
            r3.setText(r2)
            r2 = 2131362079(0x7f0a011f, float:1.8343928E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4 = 2131362315(0x7f0a020b, float:1.8344407E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
        L_0x032f:
            android.graphics.Typeface r5 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0335 }
            r3.setTypeface(r5)     // Catch:{ Exception -> 0x0335 }
            goto L_0x0336
        L_0x0335:
        L_0x0336:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            if (r5 < r6) goto L_0x034d
            android.content.res.Resources r5 = r21.getResources()
            r6 = 2131034119(0x7f050007, float:1.7678747E38)
            boolean r5 = r5.getBoolean(r6)
            if (r5 == 0) goto L_0x034d
            r5 = 4
            r3.setTextDirection(r5)
        L_0x034d:
            android.content.res.Resources r3 = r21.getResources()
            r5 = 2131820579(0x7f110023, float:1.9273877E38)
            java.lang.String r3 = r3.getString(r5)
            r4.setText(r3)
            android.graphics.Typeface r3 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0360 }
            r4.setTypeface(r3)     // Catch:{ Exception -> 0x0360 }
        L_0x0360:
            android.graphics.Typeface r3 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0366 }
            r2.setTypeface(r3)     // Catch:{ Exception -> 0x0366 }
            goto L_0x0367
        L_0x0366:
        L_0x0367:
            british.x.preinicio$m r3 = new british.x.preinicio$m
            r3.<init>()
            r2.setOnClickListener(r3)
            boolean r2 = r22.booleanValue()
            if (r2 == 0) goto L_0x03cd
            r2 = 2131361819(0x7f0a001b, float:1.8343401E38)
            android.view.View r2 = r0.findViewById(r2)
            british.x.preinicio$n r3 = new british.x.preinicio$n
            r3.<init>()
            r2.setOnClickListener(r3)
            r2 = 2131361821(0x7f0a001d, float:1.8343405E38)
            android.view.View r2 = r0.findViewById(r2)
            british.x.preinicio$o r3 = new british.x.preinicio$o
            r3.<init>()
            r2.setOnClickListener(r3)
            r2 = 2131361838(0x7f0a002e, float:1.834344E38)
            android.view.View r2 = r0.findViewById(r2)
            british.x.preinicio$p r3 = new british.x.preinicio$p
            r3.<init>()
            r2.setOnClickListener(r3)
            r2 = 2131361816(0x7f0a0018, float:1.8343395E38)
            android.view.View r2 = r0.findViewById(r2)
            british.x.preinicio$q r3 = new british.x.preinicio$q
            r3.<init>()
            r2.setOnClickListener(r3)
            android.view.View r1 = r0.findViewById(r1)
            british.x.preinicio$r r2 = new british.x.preinicio$r
            r2.<init>()
            r1.setOnClickListener(r2)
            r1 = 2131361820(0x7f0a001c, float:1.8343403E38)
            android.view.View r1 = r0.findViewById(r1)
            british.x.preinicio$s r2 = new british.x.preinicio$s
            r2.<init>()
            r1.setOnClickListener(r2)
            goto L_0x0413
        L_0x03cd:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 2131362671(0x7f0a036f, float:1.834513E38)
            android.view.View r2 = r0.findViewById(r2)
            r1.add(r2)
            r2 = 2131362674(0x7f0a0372, float:1.8345135E38)
            android.view.View r2 = r0.findViewById(r2)
            r1.add(r2)
            r2 = 2131362830(0x7f0a040e, float:1.8345452E38)
            android.view.View r2 = r0.findViewById(r2)
            r1.add(r2)
            r2 = 2131362102(0x7f0a0136, float:1.8343975E38)
            android.view.View r2 = r0.findViewById(r2)
            r1.add(r2)
            r1.add(r4)
            r14 = r18
            r1.add(r14)
            r2 = r23
            r2.registerClickableViews((java.util.List<android.view.View>) r1)
            r1 = 2131362675(0x7f0a0373, float:1.8345137E38)
            android.view.View r1 = r0.findViewById(r1)
            com.appnext.nativeads.NativeAdView r1 = (com.appnext.nativeads.NativeAdView) r1
            r2.setNativeAdView(r1)
        L_0x0413:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.m8415k(java.lang.Boolean, com.appnext.nativeads.NativeAd):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public boolean m8416l() {
        return C7190a.m29483q().mo29708i(this) == 0;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r1.mo7516l0(r0, 1).exists() == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r0.f8079G.getInt("fnac_a", 0) == 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        if (r0.f8079G.getInt("sexo", 0) == 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        if (r0.f8079G.getString("descr", r6).equals(r6) != false) goto L_0x0098;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8417o() {
        /*
            r16 = this;
            r0 = r16
            british.x.config r1 = r0.f8085b
            int r1 = r1.f7439v2
            java.lang.String r2 = "fb_entrar"
            java.lang.String r3 = "ad_entrar"
            java.lang.String r4 = "sexo"
            r5 = 900(0x384, float:1.261E-42)
            java.lang.String r6 = ""
            r7 = 2
            java.lang.String r8 = "es_root"
            r9 = 0
            r10 = 1
            if (r1 <= 0) goto L_0x00c4
            if (r1 <= r10) goto L_0x0023
            android.content.SharedPreferences r1 = r0.f8079G
            java.lang.String r11 = "glob_acceso_validado"
            boolean r1 = r1.getBoolean(r11, r9)
            if (r1 == 0) goto L_0x0098
        L_0x0023:
            android.content.SharedPreferences r1 = r0.f8079G
            java.lang.String r11 = "nick"
            java.lang.String r1 = r1.getString(r11, r6)
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0098
            british.x.config r1 = r0.f8085b
            int r1 = r1.f7393o5
            r11 = 3
            if (r1 != r11) goto L_0x0042
            android.content.SharedPreferences r1 = r0.f8079G
            java.lang.String r11 = "email_confirmado"
            boolean r1 = r1.getBoolean(r11, r9)
            if (r1 == 0) goto L_0x0098
        L_0x0042:
            british.x.config r1 = r0.f8085b
            int r11 = r1.f7446w2
            if (r11 != r7) goto L_0x0052
            java.io.File r1 = r1.mo7516l0(r0, r10)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x0098
        L_0x0052:
            british.x.config r1 = r0.f8085b
            int r1 = r1.f7453x2
            if (r1 != r7) goto L_0x0076
            android.content.SharedPreferences r1 = r0.f8079G
            java.lang.String r11 = "fnac_d"
            int r1 = r1.getInt(r11, r9)
            if (r1 == 0) goto L_0x0098
            android.content.SharedPreferences r1 = r0.f8079G
            java.lang.String r11 = "fnac_m"
            int r1 = r1.getInt(r11, r9)
            if (r1 == 0) goto L_0x0098
            android.content.SharedPreferences r1 = r0.f8079G
            java.lang.String r11 = "fnac_a"
            int r1 = r1.getInt(r11, r9)
            if (r1 == 0) goto L_0x0098
        L_0x0076:
            british.x.config r1 = r0.f8085b
            int r1 = r1.f7460y2
            if (r1 != r7) goto L_0x0084
            android.content.SharedPreferences r1 = r0.f8079G
            int r1 = r1.getInt(r4, r9)
            if (r1 == 0) goto L_0x0098
        L_0x0084:
            british.x.config r1 = r0.f8085b
            int r1 = r1.f7467z2
            if (r1 != r7) goto L_0x00c4
            android.content.SharedPreferences r1 = r0.f8079G
            java.lang.String r11 = "descr"
            java.lang.String r1 = r1.getString(r11, r6)
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00c4
        L_0x0098:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<british.x.chat_perfil> r4 = british.p015x.chat_perfil.class
            r1.<init>(r0, r4)
            boolean r4 = r0.f8103t
            if (r4 == 0) goto L_0x00a7
            r1.putExtra(r3, r10)
            goto L_0x00ae
        L_0x00a7:
            boolean r3 = r0.f8104u
            if (r3 == 0) goto L_0x00ae
            r1.putExtra(r2, r10)
        L_0x00ae:
            java.lang.String r2 = "desde_main"
            r1.putExtra(r2, r10)
            java.lang.String r2 = "desde_main_oblig"
            r1.putExtra(r2, r10)
            british.x.config r2 = r0.f8085b
            r2.f7312c = r5
            r1.putExtra(r8, r10)
            r0.startActivity(r1)
            goto L_0x0820
        L_0x00c4:
            android.os.Bundle r1 = r0.f8080H
            r11 = 9997(0x270d, float:1.4009E-41)
            java.lang.String r12 = "privados"
            java.lang.String r13 = "ind_secc_sel"
            java.lang.String r14 = "fotos_chat"
            java.lang.String r15 = "fotos_perfil"
            java.lang.String r10 = "galeria"
            java.lang.String r7 = "coments"
            if (r1 == 0) goto L_0x0329
            java.lang.String r9 = "abrir_perfil"
            java.lang.String r1 = r1.getString(r9)
            if (r1 == 0) goto L_0x0329
            british.x.config r1 = r0.f8085b
            int r2 = r0.f8095l
            r1.f7312c = r2
            r1.f7318d = r2
            if (r2 == r11) goto L_0x00f0
            british.x.l[] r3 = r1.f7231O1
            r3 = r3[r2]
            boolean r3 = r3.f7848B
            if (r3 == 0) goto L_0x00f7
        L_0x00f0:
            r1.f7312c = r5
            if (r2 != r11) goto L_0x00f7
            r2 = 0
            r1.f7318d = r2
        L_0x00f7:
            android.content.SharedPreferences r1 = r0.f8079G
            android.content.SharedPreferences$Editor r1 = r1.edit()
            british.x.config r2 = r0.f8085b
            int r2 = r2.f7312c
            r1.putInt(r13, r2)
            british.x.config r2 = r0.f8085b
            int r2 = r2.f7318d
            java.lang.String r3 = "ind_secc_sel_2"
            r1.putInt(r3, r2)
            r1.commit()
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r2 = "abrir_perfilv"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0152
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r2 = "abrir_perfilv_formato"
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x012d
            java.lang.String r6 = "mp4"
            goto L_0x0152
        L_0x012d:
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r2 = "abrir_perfilv_formato"
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0140
            java.lang.String r6 = "3gp"
            goto L_0x0152
        L_0x0140:
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r2 = "abrir_perfilv_formato"
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            java.lang.String r6 = "webm"
        L_0x0152:
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r2 = "abrir_perfilv"
            boolean r1 = r1.containsKey(r2)
            java.lang.String r2 = "p_dist"
            java.lang.String r3 = "p_descr"
            java.lang.String r5 = "p_sexo"
            java.lang.String r9 = "p_fnac"
            if (r1 == 0) goto L_0x0224
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0224
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r4 = "abrir_perfil"
            java.lang.String r1 = r1.getString(r4)
            android.os.Bundle r4 = r0.f8080H
            java.lang.String r11 = "abrir_perfilv"
            java.lang.String r4 = r4.getString(r11)
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<british.x.t_video_pro> r12 = british.p015x.t_video_pro.class
            r11.<init>(r0, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "https://video.e-droid.net/files_pro/v"
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = "_"
            r12.append(r13)
            r12.append(r1)
            java.lang.String r13 = "."
            r12.append(r13)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            java.lang.String r12 = "url"
            r11.putExtra(r12, r6)
            british.x.config r6 = r0.f8085b
            int r6 = r6.f7318d
            java.lang.String r12 = "ind"
            r11.putExtra(r12, r6)
            java.lang.String r6 = "idv"
            r11.putExtra(r6, r4)
            r4 = -1
            java.lang.String r6 = "indv"
            r11.putExtra(r6, r4)
            java.lang.String r4 = "idusu_profile"
            r11.putExtra(r4, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r1 = r1.getString(r7)
            r11.putExtra(r7, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r9)
            r11.putExtra(r9, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r5)
            r11.putExtra(r5, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r3)
            r11.putExtra(r3, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r2)
            r11.putExtra(r2, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r2 = "coments_chat"
            boolean r1 = r1.getBoolean(r2)
            java.lang.String r2 = "coments_chat"
            r11.putExtra(r2, r1)
            android.os.Bundle r1 = r0.f8080H
            boolean r1 = r1.getBoolean(r10)
            r11.putExtra(r10, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r2 = "privados_chat"
            boolean r1 = r1.getBoolean(r2)
            java.lang.String r2 = "privados_chat"
            r11.putExtra(r2, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r15)
            r11.putExtra(r15, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r14)
            r11.putExtra(r14, r1)
            goto L_0x0304
        L_0x0224:
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<british.x.profile> r1 = british.p015x.profile.class
            r11.<init>(r0, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r6 = "abrir_perfil"
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r6 = "id"
            r11.putExtra(r6, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r1 = r1.getString(r12)
            r11.putExtra(r12, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r6 = "nombre"
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r6 = "nombre"
            r11.putExtra(r6, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r1 = r1.getString(r7)
            r11.putExtra(r7, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r6 = "fnac_d"
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r6 = "fnac_d"
            r11.putExtra(r6, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r6 = "fnac_m"
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r6 = "fnac_m"
            r11.putExtra(r6, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r6 = "fnac_a"
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r6 = "fnac_a"
            r11.putExtra(r6, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r1 = r1.getString(r4)
            r11.putExtra(r4, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r4 = "vfoto"
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r4 = "vfoto"
            r11.putExtra(r4, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r9)
            r11.putExtra(r9, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r5)
            r11.putExtra(r5, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r3)
            r11.putExtra(r3, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r2)
            r11.putExtra(r2, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r2 = "coments_chat"
            boolean r1 = r1.getBoolean(r2)
            java.lang.String r2 = "coments_chat"
            r11.putExtra(r2, r1)
            android.os.Bundle r1 = r0.f8080H
            boolean r1 = r1.getBoolean(r10)
            r11.putExtra(r10, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r2 = "privados_chat"
            boolean r1 = r1.getBoolean(r2)
            java.lang.String r2 = "privados_chat"
            r11.putExtra(r2, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r15)
            r11.putExtra(r15, r1)
            android.os.Bundle r1 = r0.f8080H
            int r1 = r1.getInt(r14)
            r11.putExtra(r14, r1)
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r2 = "abrir_game"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0304
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r2 = "abrir_game"
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "abrir_game"
            r11.putExtra(r2, r1)
        L_0x0304:
            british.x.config r1 = r0.f8085b
            int r1 = r1.f7427t4
            r2 = 2
            if (r1 != r2) goto L_0x0320
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<british.x.t_menugrid> r2 = british.p015x.t_menugrid.class
            r1.<init>(r0, r2)
            java.lang.String r2 = "intent_abrir"
            r1.putExtra(r2, r11)
            r2 = 1
            r1.putExtra(r8, r2)
            r0.startActivity(r1)
            goto L_0x0820
        L_0x0320:
            r2 = 1
            r11.putExtra(r8, r2)
            r0.startActivity(r11)
            goto L_0x0820
        L_0x0329:
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r9 = "notif_id"
            if (r1 == 0) goto L_0x03a8
            java.lang.String r1 = r1.getString(r9)
            if (r1 == 0) goto L_0x03a8
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r11 = "notif_tipo"
            java.lang.String r1 = r1.getString(r11)
            java.lang.String r11 = "2"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x03a8
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<british.x.t_url> r4 = british.p015x.t_url.class
            r1.<init>(r0, r4)
            boolean r4 = r0.f8103t
            if (r4 == 0) goto L_0x0355
            r4 = 1
            r1.putExtra(r3, r4)
            goto L_0x035d
        L_0x0355:
            r4 = 1
            boolean r3 = r0.f8104u
            if (r3 == 0) goto L_0x035d
            r1.putExtra(r2, r4)
        L_0x035d:
            android.os.Bundle r2 = r0.f8080H
            java.lang.String r3 = "notif_idelem"
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "url"
            r1.putExtra(r3, r2)
            british.x.config r2 = r0.f8085b
            r2.f7312c = r5
            java.lang.String r2 = "sh"
            r3 = 0
            android.content.SharedPreferences r2 = r0.getSharedPreferences(r2, r3)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            british.x.config r3 = r0.f8085b
            int r3 = r3.f7312c
            r2.putInt(r13, r3)
            r2.commit()
            british.x.config r2 = r0.f8085b
            int r2 = r2.f7427t4
            r3 = 2
            if (r2 != r3) goto L_0x039f
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<british.x.t_menugrid> r3 = british.p015x.t_menugrid.class
            r2.<init>(r0, r3)
            java.lang.String r3 = "intent_abrir"
            r2.putExtra(r3, r1)
            r3 = 1
            r2.putExtra(r8, r3)
            r0.startActivity(r2)
            goto L_0x0820
        L_0x039f:
            r3 = 1
            r1.putExtra(r8, r3)
            r0.startActivity(r1)
            goto L_0x0820
        L_0x03a8:
            android.os.Bundle r1 = r0.f8080H
            if (r1 == 0) goto L_0x0413
            java.lang.String r1 = r1.getString(r9)
            if (r1 == 0) goto L_0x0413
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r11 = "notif_tipo"
            java.lang.String r1 = r1.getString(r11)
            java.lang.String r11 = "3"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0413
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<british.x.chat> r4 = british.p015x.chat.class
            r1.<init>(r0, r4)
            boolean r4 = r0.f8103t
            if (r4 == 0) goto L_0x03d2
            r4 = 1
            r1.putExtra(r3, r4)
            goto L_0x03da
        L_0x03d2:
            r4 = 1
            boolean r3 = r0.f8104u
            if (r3 == 0) goto L_0x03da
            r1.putExtra(r2, r4)
        L_0x03da:
            british.x.config r2 = r0.f8085b
            r2.f7312c = r5
            android.content.SharedPreferences r2 = r0.f8079G
            android.content.SharedPreferences$Editor r2 = r2.edit()
            british.x.config r3 = r0.f8085b
            int r3 = r3.f7312c
            r2.putInt(r13, r3)
            r2.commit()
            british.x.config r2 = r0.f8085b
            int r2 = r2.f7427t4
            r3 = 2
            if (r2 != r3) goto L_0x040a
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<british.x.t_menugrid> r3 = british.p015x.t_menugrid.class
            r2.<init>(r0, r3)
            java.lang.String r3 = "intent_abrir"
            r2.putExtra(r3, r1)
            r3 = 1
            r2.putExtra(r8, r3)
            r0.startActivity(r2)
            goto L_0x0820
        L_0x040a:
            r3 = 1
            r1.putExtra(r8, r3)
            r0.startActivity(r1)
            goto L_0x0820
        L_0x0413:
            british.x.config r1 = r0.f8085b
            int r1 = r1.f7427t4
            java.lang.String r11 = "id_remit"
            r5 = 2
            if (r1 != r5) goto L_0x04bc
            android.os.Bundle r1 = r0.f8080H
            if (r1 == 0) goto L_0x0436
            java.lang.String r1 = r1.getString(r9)
            if (r1 == 0) goto L_0x0436
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r5 = "notif_tipo"
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r5 = "0"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0440
        L_0x0436:
            android.os.Bundle r1 = r0.f8080H
            if (r1 == 0) goto L_0x0440
            java.lang.String r1 = r1.getString(r9)
            if (r1 != 0) goto L_0x04bc
        L_0x0440:
            android.os.Bundle r1 = r0.f8080H
            if (r1 == 0) goto L_0x0454
            java.lang.String r5 = "notif_idtema"
            java.lang.String r1 = r1.getString(r5)
            if (r1 != 0) goto L_0x04bc
            android.os.Bundle r1 = r0.f8080H
            java.lang.String r1 = r1.getString(r11)
            if (r1 != 0) goto L_0x04bc
        L_0x0454:
            android.os.Bundle r1 = r0.f8080H
            if (r1 == 0) goto L_0x0460
            java.lang.String r5 = "abrir_idtema"
            java.lang.String r1 = r1.getString(r5)
            if (r1 != 0) goto L_0x04bc
        L_0x0460:
            android.os.Bundle r1 = r0.f8080H
            if (r1 == 0) goto L_0x046c
            java.lang.String r5 = "abrir_idsecc"
            java.lang.String r1 = r1.getString(r5)
            if (r1 != 0) goto L_0x04bc
        L_0x046c:
            android.content.Intent r1 = r16.getIntent()
            java.lang.String r1 = r1.getDataString()
            if (r1 == 0) goto L_0x0486
            android.content.Intent r1 = r16.getIntent()
            java.lang.String r1 = r1.getDataString()
            java.lang.String r5 = "www.appcreator24.com/open2261075-n6uezi/"
            boolean r1 = r1.endsWith(r5)
            if (r1 == 0) goto L_0x04bc
        L_0x0486:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<british.x.t_menugrid> r4 = british.p015x.t_menugrid.class
            r1.<init>(r0, r4)
            boolean r4 = r0.f8103t
            if (r4 == 0) goto L_0x0496
            r4 = 1
            r1.putExtra(r3, r4)
            goto L_0x049e
        L_0x0496:
            r4 = 1
            boolean r3 = r0.f8104u
            if (r3 == 0) goto L_0x049e
            r1.putExtra(r2, r4)
        L_0x049e:
            british.x.config r2 = r0.f8085b
            r3 = 900(0x384, float:1.261E-42)
            r2.f7312c = r3
            android.content.SharedPreferences r2 = r0.f8079G
            android.content.SharedPreferences$Editor r2 = r2.edit()
            british.x.config r3 = r0.f8085b
            int r3 = r3.f7312c
            r2.putInt(r13, r3)
            r2.commit()
            r1.putExtra(r8, r4)
            r0.startActivity(r1)
            goto L_0x0820
        L_0x04bc:
            int r1 = r0.f8095l
            r5 = 9997(0x270d, float:1.4009E-41)
            if (r1 == r5) goto L_0x04cc
            british.x.config r5 = r0.f8085b
            british.x.l[] r5 = r5.f7231O1
            r1 = r5[r1]
            boolean r1 = r1.f7848B
            if (r1 == 0) goto L_0x04e2
        L_0x04cc:
            british.x.config r1 = r0.f8085b
            r5 = 900(0x384, float:1.261E-42)
            r1.f7312c = r5
            android.content.SharedPreferences r1 = r0.f8079G
            android.content.SharedPreferences$Editor r1 = r1.edit()
            british.x.config r5 = r0.f8085b
            int r5 = r5.f7312c
            r1.putInt(r13, r5)
            r1.commit()
        L_0x04e2:
            british.x.config r1 = r0.f8085b
            int r5 = r0.f8095l
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            british.x.j r1 = r1.mo7475B(r5, r0)
            boolean r5 = r0.f8103t
            if (r5 == 0) goto L_0x04f9
            android.content.Intent r2 = r1.f7842a
            r5 = 1
            r2.putExtra(r3, r5)
            goto L_0x0503
        L_0x04f9:
            r5 = 1
            boolean r3 = r0.f8104u
            if (r3 == 0) goto L_0x0503
            android.content.Intent r3 = r1.f7842a
            r3.putExtra(r2, r5)
        L_0x0503:
            android.os.Bundle r2 = r0.f8080H
            if (r2 == 0) goto L_0x0535
            java.lang.String r2 = r2.getString(r11)
            if (r2 == 0) goto L_0x0535
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r3 = r3.getString(r11)
            r2.putExtra(r11, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "nombre_remit"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "nombre_remit"
            r2.putExtra(r5, r3)
            boolean r2 = r0.f8107x
            if (r2 == 0) goto L_0x06a5
            android.content.Intent r2 = r1.f7842a
            java.lang.String r3 = "empezar_privado"
            r5 = 1
            r2.putExtra(r3, r5)
            goto L_0x06a5
        L_0x0535:
            android.os.Bundle r2 = r0.f8080H
            if (r2 == 0) goto L_0x059a
            java.lang.String r3 = "abrir_idtema"
            java.lang.String r2 = r2.getString(r3)
            if (r2 == 0) goto L_0x059a
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_idcat"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_idcat"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_idtema"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_idtema"
            r2.putExtra(r5, r3)
            android.os.Bundle r2 = r0.f8080H
            java.lang.String r3 = "abrir_idresp"
            java.lang.String r2 = r2.getString(r3)
            if (r2 == 0) goto L_0x0589
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_idresp"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_idresp"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "idcoment_ir"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "idcoment_ir"
            r2.putExtra(r5, r3)
            goto L_0x06a5
        L_0x0589:
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "idresp_ir"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "idresp_ir"
            r2.putExtra(r5, r3)
            goto L_0x06a5
        L_0x059a:
            android.os.Bundle r2 = r0.f8080H
            if (r2 == 0) goto L_0x06a5
            java.lang.String r3 = "abrir_buscvideo"
            java.lang.String r2 = r2.getString(r3)
            if (r2 == 0) goto L_0x06a5
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_idsecc"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_idsecc"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_formato"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_formato"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_idusu"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_idusu"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_nombre"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_nombre"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_nlikes"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_nlikes"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_liked"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_liked"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_descr"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_descr"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_nvideos"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_nvideos"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_fcrea"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_fcrea"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_coments"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_coments"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_fnac_d"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_fnac_d"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_fnac_m"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_fnac_m"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_fnac_a"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_fnac_a"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_sexo"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_sexo"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_privados"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_privados"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "abrir_buscvideo_vfoto"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "abrir_buscvideo_vfoto"
            r2.putExtra(r5, r3)
        L_0x06a5:
            int r2 = r0.f8095l
            r3 = 9997(0x270d, float:1.4009E-41)
            if (r2 != r3) goto L_0x07f8
            android.os.Bundle r2 = r0.f8080H
            if (r2 == 0) goto L_0x07f8
            java.lang.String r2 = r2.getString(r11)
            if (r2 != 0) goto L_0x06bf
            android.os.Bundle r2 = r0.f8080H
            java.lang.String r3 = "notif_idtema"
            java.lang.String r2 = r2.getString(r3)
            if (r2 == 0) goto L_0x07f8
        L_0x06bf:
            android.content.Intent r2 = r1.f7842a
            java.lang.String r3 = "externo"
            r5 = 1
            r2.putExtra(r3, r5)
            android.os.Bundle r2 = r0.f8080H
            java.lang.String r2 = r2.getString(r11)
            if (r2 == 0) goto L_0x0745
            android.content.Intent r2 = r1.f7842a
            java.lang.String r3 = "idchat"
            r9 = 0
            r2.putExtra(r3, r9)
            android.content.Intent r2 = r1.f7842a
            java.lang.String r3 = "idtema"
            r2.putExtra(r3, r9)
            android.content.Intent r2 = r1.f7842a
            r2.putExtra(r15, r5)
            android.content.Intent r2 = r1.f7842a
            java.lang.String r3 = "fnac"
            r2.putExtra(r3, r5)
            android.content.Intent r2 = r1.f7842a
            r2.putExtra(r4, r5)
            android.content.Intent r2 = r1.f7842a
            java.lang.String r3 = "descr"
            r2.putExtra(r3, r5)
            android.content.Intent r2 = r1.f7842a
            java.lang.String r3 = "dist"
            r2.putExtra(r3, r5)
            android.content.Intent r2 = r1.f7842a
            r2.putExtra(r12, r5)
            android.content.Intent r2 = r1.f7842a
            r2.putExtra(r7, r5)
            android.content.Intent r2 = r1.f7842a
            r2.putExtra(r10, r5)
            android.content.Intent r2 = r1.f7842a
            r2.putExtra(r14, r5)
            british.x.config r2 = r0.f8085b
            british.x.l[] r3 = r2.f7231O1
            int r2 = r2.f7318d
            r4 = r3[r2]
            java.lang.String r4 = r4.f7916g
            r2 = r3[r2]
            java.lang.String r2 = r2.f7919h
            android.content.Intent r3 = r1.f7842a
            boolean r5 = r4.equals(r6)
            if (r5 == 0) goto L_0x072c
            british.x.config r5 = r0.f8085b
            java.lang.String r5 = r5.f7313c1
            goto L_0x072d
        L_0x072c:
            r5 = r4
        L_0x072d:
            java.lang.String r7 = "c1"
            r3.putExtra(r7, r5)
            android.content.Intent r3 = r1.f7842a
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x073e
            british.x.config r2 = r0.f8085b
            java.lang.String r2 = r2.f7319d1
        L_0x073e:
            java.lang.String r4 = "c2"
            r3.putExtra(r4, r2)
            goto L_0x07f8
        L_0x0745:
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "notif_idsecc"
            java.lang.String r3 = r3.getString(r5)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.String r5 = "idchat"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "notif_idtema"
            java.lang.String r3 = r3.getString(r5)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.String r5 = "idtema"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            int r3 = r3.getInt(r15)
            r2.putExtra(r15, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r5 = "fnac"
            int r3 = r3.getInt(r5)
            java.lang.String r5 = "fnac"
            r2.putExtra(r5, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            int r3 = r3.getInt(r4)
            r2.putExtra(r4, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r4 = "descr"
            int r3 = r3.getInt(r4)
            java.lang.String r4 = "descr"
            r2.putExtra(r4, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r4 = "dist"
            int r3 = r3.getInt(r4)
            java.lang.String r4 = "dist"
            r2.putExtra(r4, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            boolean r3 = r3.getBoolean(r12)
            r2.putExtra(r12, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            boolean r3 = r3.getBoolean(r7)
            r2.putExtra(r7, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            boolean r3 = r3.getBoolean(r10)
            r2.putExtra(r10, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            int r3 = r3.getInt(r14)
            r2.putExtra(r14, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r4 = "c1"
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "c1"
            r2.putExtra(r4, r3)
            android.content.Intent r2 = r1.f7842a
            android.os.Bundle r3 = r0.f8080H
            java.lang.String r4 = "c2"
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "c2"
            r2.putExtra(r4, r3)
        L_0x07f8:
            british.x.config r2 = r0.f8085b
            int r2 = r2.f7427t4
            r3 = 2
            if (r2 != r3) goto L_0x0815
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<british.x.t_menugrid> r3 = british.p015x.t_menugrid.class
            r2.<init>(r0, r3)
            android.content.Intent r1 = r1.f7842a
            java.lang.String r3 = "intent_abrir"
            r2.putExtra(r3, r1)
            r3 = 1
            r2.putExtra(r8, r3)
            r0.startActivity(r2)
            goto L_0x0820
        L_0x0815:
            r3 = 1
            android.content.Intent r2 = r1.f7842a
            r2.putExtra(r8, r3)
            android.content.Intent r1 = r1.f7842a
            r0.startActivity(r1)
        L_0x0820:
            r16.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.m8417o():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m8418x(String str) {
        boolean z = !this.f8085b.f7208K2.equals("");
        NativeAd nativeAd = !z ? new NativeAd(getApplicationContext(), str) : null;
        findViewById(R.id.iv_splash).setVisibility(8);
        findViewById(R.id.wv_splash).setVisibility(8);
        findViewById(R.id.v_anext).setVisibility(0);
        int i = this.f8085b.f7205K;
        if (i == 1) {
            C1692config.m8168S0((ProgressBar) findViewById(R.id.progressBar), this.f8088e);
        } else if (i == 2) {
            C1692config.m8168S0((ProgressBar) findViewById(R.id.progressBar), this.f8085b.f7223N);
        }
        findViewById(R.id.rl_anext).setVisibility(0);
        if (!z) {
            findViewById(R.id.na_view).setVisibility(0);
            nativeAd.setPrivacyPolicyColor(0);
            nativeAd.setAdListener(new C1930l());
            nativeAd.loadAd(new NativeAdRequest().setCachingPolicy(NativeAdRequest.CachingPolicy.STATIC_ONLY).setCreativeType(NativeAdRequest.CreativeType.STATIC_ONLY).setVideoLength(NativeAdRequest.VideoLength.SHORT).setVideoQuality(NativeAdRequest.VideoQuality.LOW));
            return;
        }
        m8415k(Boolean.TRUE, (NativeAd) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo7812A() {
        int i;
        int i2;
        findViewById(R.id.iv_splash).setVisibility(8);
        WebView webView = (WebView) findViewById(R.id.wv_splash);
        webView.setOnTouchListener(new C1920g0());
        int i3 = 0;
        webView.setVisibility(0);
        Bitmap bitmap = null;
        try {
            InputStream open = getResources().getAssets().open("altres/" + this.f8092i);
            bitmap = BitmapFactory.decodeStream(open);
            open.close();
        } catch (Exception | OutOfMemoryError unused) {
        }
        if (bitmap != null) {
            Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int E = (this.f8085b.f7464z ? C1692config.m8149E(this, 10) : 0) * 2;
            int i4 = point.x - E;
            int i5 = point.y - E;
            int E2 = C1692config.m8149E(this, 25);
            int identifier = getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            if (identifier > 0) {
                E2 = getResources().getDimensionPixelSize(identifier);
            }
            int i6 = i5 - E2;
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            int i7 = this.f8085b.f7151B;
            int i8 = 1;
            if (i7 == 1) {
                if (width > i4) {
                    height = (height * i4) / width;
                    width = i4;
                    i3 = 1;
                }
                if (height > i6) {
                    width = (width * i6) / height;
                    height = i6;
                } else {
                    i8 = i3;
                }
                if (i8 == 0) {
                    i2 = (height * i4) / width;
                    if (i2 > i6) {
                        i = (width * i6) / height;
                    }
                    i = i4;
                }
                i3 = height;
            } else if (i7 == 2) {
                if (width < i4) {
                    i3 = (height * i4) / width;
                    width = i4;
                } else {
                    i3 = height;
                }
                if (i3 < i6) {
                    i = (i * i6) / i3;
                }
            } else {
                if (i7 == 3) {
                    i2 = i6;
                    i = i4;
                }
                i3 = height;
            }
            i3 = i6;
        } else {
            i = 0;
        }
        String str = "";
        if (!this.f8079G.getString("c1_sp", str).equals(str)) {
            str = "background: #" + this.f8079G.getString("c1_sp", str).substring(2) + ";background: linear-gradient(#" + this.f8079G.getString("c1_sp", str).substring(2) + ", #" + this.f8079G.getString("c2_sp", str).substring(2) + ");";
        }
        webView.loadDataWithBaseURL("file:///android_asset/altres/", "<html style='height:100%;margin:0;padding:0;'><head></head><body style='" + str + "height:100%;margin:0;padding:0;'><table style='border:0;width:100%;height:100%;'><tr><td align='center'><img style='padding:0;margin:0;width:" + C1692config.m8171U0(this, (float) i) + "px;height:" + C1692config.m8171U0(this, (float) i3) + "px;' src='" + this.f8092i + "'></td></tr></table></body></html>", "text/html", "utf-8", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo7813B() {
        if (this.f8085b.f7205K == 1) {
            try {
                this.f8073A.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo7814C() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        this.f8076D = builder;
        builder.setTitle(getResources().getString(R.string.chat_acceso));
        View inflate = getLayoutInflater().inflate(R.layout.contra, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.message)).setText(getResources().getString(R.string.chat_introduce_contra));
        this.f8083K = (EditText) inflate.findViewById(R.id.et_contra);
        if (this.f8105v) {
            inflate.findViewById(R.id.message_error).setVisibility(0);
        }
        this.f8082J = (CheckBox) inflate.findViewById(R.id.skip);
        if (!this.f8090g.equals("")) {
            EditText editText = this.f8083K;
            C1692config.m8150F(editText, Boolean.valueOf(!C1692config.m8153I("#" + this.f8087d)), this.f8090g);
            C1692config.m8197q(this.f8082J, this.f8090g);
        }
        this.f8082J.setChecked(this.f8079G.getBoolean("pwd_nomostrarmas_def", true));
        this.f8076D.setView(inflate);
        this.f8076D.setCancelable(true);
        this.f8076D.setPositiveButton(getString(R.string.aceptar), new C1924i0());
        this.f8076D.setNegativeButton(getString(R.string.cancelar), new C1927j0());
        this.f8076D.setOnCancelListener(new C1929k0());
        AlertDialog create = this.f8076D.create();
        if (!this.f8090g.equals("")) {
            create.setOnShowListener(new C1931l0(create));
        }
        try {
            create.show();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo7815E() {
        if (!this.f8079G.getBoolean("pwd_validado", true)) {
            mo7814C();
        } else {
            m8417o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo7816m(String str, int i, SharedPreferences.Editor editor) {
        if (!this.f8093j.containsKey(str)) {
            return "";
        }
        String str2 = this.f8093j.get(str);
        if (i == 1) {
            editor.putInt(str, Integer.parseInt(str2));
            return str2;
        } else if (i == 2) {
            editor.putString(str, str2);
            return str2;
        } else if (i == 3) {
            editor.putFloat(str, Float.parseFloat(str2));
            return str2;
        } else if (i != 10) {
            return str2;
        } else {
            editor.putBoolean(str, true);
            editor.putBoolean(str + "_g", true);
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo7817n() {
        findViewById(R.id.pb_splash).setVisibility(8);
        if (this.f8099p) {
            String p = mo7822p("fus");
            if (!p.equals("")) {
                SharedPreferences.Editor edit = this.f8079G.edit();
                edit.putString("fultsync", p);
                edit.commit();
            }
        }
        if (this.f8093j.containsKey("espera")) {
            this.f8096m = Integer.parseInt(mo7822p("espera"));
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f8074B = progressDialog;
            progressDialog.setCancelable(true);
            this.f8074B.setCanceledOnTouchOutside(false);
            this.f8074B.setTitle(getResources().getString(R.string.appnoreg));
            ProgressDialog progressDialog2 = this.f8074B;
            progressDialog2.setMessage(this.f8096m + "s.");
            this.f8074B.setIndeterminate(true);
            this.f8074B.setOnCancelListener(new C1933m0());
            try {
                this.f8074B.show();
            } catch (Exception unused) {
            }
            Thread thread = new Thread(new C1937o0(new C1935n0()));
            this.f8081I = thread;
            thread.start();
            return;
        }
        m8404H();
    }

    public void onBackPressed() {
        if (findViewById(R.id.rl_anext).getVisibility() != 0) {
            super.onBackPressed();
        } else if (!this.f8101r) {
            this.f8101r = true;
            mo7815E();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (findViewById(R.id.rl_anext).getVisibility() == 0) {
            findViewById(R.id.v_anext).setVisibility(8);
            findViewById(R.id.iv_splash).setVisibility(8);
            ((ImageView) findViewById(R.id.iv_splash)).setImageBitmap((Bitmap) null);
            findViewById(R.id.wv_splash).setVisibility(8);
            findViewById(R.id.na_media).setVisibility(8);
            findViewById(R.id.acad_na_media).setVisibility(8);
        } else if (findViewById(R.id.wv_splash).getVisibility() == 0) {
            mo7812A();
        }
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            java.lang.String r0 = "idusu"
            java.lang.String r1 = "sh"
            r2 = 0
            android.content.SharedPreferences r1 = r11.getSharedPreferences(r1, r2)
            r11.f8079G = r1
            java.lang.String r3 = "c1_sp"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.getString(r3, r4)
            r11.f8087d = r1
            android.content.SharedPreferences r1 = r11.f8079G
            java.lang.String r5 = "c_icos"
            java.lang.String r1 = r1.getString(r5, r4)
            r11.f8088e = r1
            android.content.Intent r1 = r11.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r11.f8080H = r1
            java.lang.String r1 = r11.f8087d
            java.lang.String r5 = r11.f8088e
            java.lang.String r1 = british.p015x.C1692config.m8189h(r1, r5)
            r11.f8090g = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r5 = "#"
            r6 = 12
            if (r1 <= r6) goto L_0x0060
            java.lang.String r1 = r11.f8087d
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0060
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r7 = r11.f8087d
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.p015x.C1692config.m8153I(r1)
            if (r1 != 0) goto L_0x0060
            r1 = 2131886906(0x7f12033a, float:1.9408404E38)
            r11.setTheme(r1)
        L_0x0060:
            super.onCreate(r12)
            android.os.Bundle r12 = r11.f8080H
            r1 = 1
            if (r12 == 0) goto L_0x007a
            java.lang.String r7 = "directo"
            boolean r12 = r12.containsKey(r7)
            if (r12 == 0) goto L_0x007a
            android.os.Bundle r12 = r11.f8080H
            boolean r12 = r12.getBoolean(r7, r2)
            if (r12 == 0) goto L_0x007a
            r11.f8107x = r1
        L_0x007a:
            r12 = 2131558620(0x7f0d00dc, float:1.874256E38)
            r11.setContentView(r12)
            android.content.Context r12 = r11.getApplicationContext()
            british.x.config r12 = (british.p015x.C1692config) r12
            r11.f8085b = r12
            android.content.SharedPreferences r7 = r11.f8079G
            java.lang.String r8 = "ft"
            java.lang.String r9 = "0"
            java.lang.String r7 = r7.getString(r8, r9)
            int r7 = java.lang.Integer.parseInt(r7)
            r12.mo7487Q(r7)
            java.lang.String r12 = android.os.Environment.getExternalStorageState()
            java.lang.String r7 = "mounted"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L_0x00e4
            android.app.AlertDialog$Builder r12 = new android.app.AlertDialog$Builder
            r12.<init>(r11)
            r0 = 2131820577(0x7f110021, float:1.9273873E38)
            british.x.preinicio$k r1 = new british.x.preinicio$k
            r1.<init>()
            android.app.AlertDialog$Builder r12 = r12.setPositiveButton(r0, r1)
            r0 = 2131821000(0x7f1101c8, float:1.927473E38)
            android.app.AlertDialog$Builder r12 = r12.setMessage(r0)
            android.app.AlertDialog r12 = r12.create()
            java.lang.String r0 = r11.f8090g
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00d1
            british.x.preinicio$v r0 = new british.x.preinicio$v
            r0.<init>(r12)
            r12.setOnShowListener(r0)
        L_0x00d1:
            r12.show()     // Catch:{ Exception -> 0x032c }
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r12 = r12.findViewById(r0)     // Catch:{ Exception -> 0x032c }
            android.widget.TextView r12 = (android.widget.TextView) r12     // Catch:{ Exception -> 0x032c }
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x032c }
            r12.setTypeface(r0)     // Catch:{ Exception -> 0x032c }
            goto L_0x032c
        L_0x00e4:
            boolean r12 = r11.f8107x
            r7 = 0
            if (r12 != 0) goto L_0x0104
            android.content.SharedPreferences r12 = r11.f8079G
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences r9 = r11.f8079G
            java.lang.String r10 = "n_opens"
            int r9 = r9.getInt(r10, r2)
            int r9 = r9 + r1
            r12.putInt(r10, r9)
            java.lang.String r9 = "f_ult_notif"
            r12.putLong(r9, r7)
            r12.commit()
        L_0x0104:
            android.content.SharedPreferences r12 = r11.f8079G     // Catch:{ ClassCastException -> 0x010d }
            long r9 = r12.getLong(r0, r7)     // Catch:{ ClassCastException -> 0x010d }
            r11.f8094k = r9     // Catch:{ ClassCastException -> 0x010d }
            goto L_0x012a
        L_0x010d:
            android.content.SharedPreferences r12 = r11.f8079G
            int r12 = r12.getInt(r0, r2)
            long r9 = (long) r12
            r11.f8094k = r9
            android.content.SharedPreferences r12 = r11.f8079G
            android.content.SharedPreferences$Editor r12 = r12.edit()
            r12.remove(r0)
            r12.commit()
            long r9 = r11.f8094k
            r12.putLong(r0, r9)
            r12.commit()
        L_0x012a:
            android.content.SharedPreferences r12 = r11.f8079G
            java.lang.String r0 = "cod_g"
            java.lang.String r12 = r12.getString(r0, r4)
            r11.f8091h = r12
            r11.f8102s = r2
            long r9 = r11.f8094k
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x017d
            java.io.File r12 = r11.getFilesDir()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            java.io.File r0 = new java.io.File     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            java.lang.String r9 = "vinebre_ac.txt"
            r0.<init>(r12, r9)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            boolean r12 = r0.exists()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            if (r12 == 0) goto L_0x017d
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            r12.<init>(r0)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            r9.<init>(r12)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            r0.<init>(r9)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            java.lang.String r0 = r0.readLine()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            r12.close()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            java.lang.String r12 = "@"
            java.lang.String[] r12 = r0.split(r12)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            r0 = r12[r2]     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            long r9 = (long) r0     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            r11.f8094k = r9     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            int r0 = r12.length     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            if (r0 <= r1) goto L_0x0179
            r12 = r12[r1]     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            r11.f8091h = r12     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
        L_0x0179:
            r11.f8102s = r1     // Catch:{ FileNotFoundException | IOException | Exception -> 0x017c }
            goto L_0x017d
        L_0x017c:
        L_0x017d:
            long r9 = r11.f8094k
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x02b2
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 20
            if (r12 <= r0) goto L_0x01a0
            android.content.SharedPreferences r12 = r11.f8079G
            java.lang.String r0 = "c1"
            java.lang.String r12 = r12.getString(r0, r4)
            boolean r12 = r12.equals(r4)
            if (r12 != 0) goto L_0x01a0
            android.content.SharedPreferences r12 = r11.f8079G
            java.lang.String r12 = r12.getString(r0, r4)
            british.p015x.C1692config.m8190i(r11, r12)
        L_0x01a0:
            boolean r12 = r11.f8107x
            if (r12 != 0) goto L_0x02b2
            android.content.SharedPreferences r12 = r11.f8079G
            java.lang.String r0 = "sa"
            int r12 = r12.getInt(r0, r2)
            if (r12 <= 0) goto L_0x01da
            android.content.SharedPreferences r12 = r11.f8079G
            int r12 = r12.getInt(r0, r2)
            int r0 = british.p015x.C1692config.m8183d0(r11)
            if (r12 > r0) goto L_0x01da
            android.content.res.Resources r12 = r11.getResources()
            android.content.res.AssetManager r12 = r12.getAssets()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01da }
            r0.<init>()     // Catch:{ IOException -> 0x01da }
            java.lang.String r7 = "altres/"
            r0.append(r7)     // Catch:{ IOException -> 0x01da }
            java.lang.String r7 = r11.f8092i     // Catch:{ IOException -> 0x01da }
            r0.append(r7)     // Catch:{ IOException -> 0x01da }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x01da }
            r12.open(r0)     // Catch:{ IOException -> 0x01da }
            r12 = 1
            goto L_0x01db
        L_0x01da:
            r12 = 0
        L_0x01db:
            if (r12 != 0) goto L_0x02af
            r12 = 2131362407(0x7f0a0267, float:1.8344594E38)
            android.view.View r0 = r11.findViewById(r12)
            r0.setVisibility(r2)
            java.lang.String r0 = "splash"
            java.io.FileInputStream r0 = r11.openFileInput(r0)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x01fc }
            java.io.FileDescriptor r7 = r0.getFD()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x01fc }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeFileDescriptor(r7)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x01fc }
            r11.f8077E = r7     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x01fc }
            r0.close()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x01fc }
            r0 = 1
            goto L_0x01fd
        L_0x01fc:
            r0 = 0
        L_0x01fd:
            if (r0 == 0) goto L_0x02b2
            android.content.SharedPreferences r0 = r11.f8079G
            java.lang.String r0 = r0.getString(r3, r4)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0257
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r7 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r8 = 2
            int[] r8 = new int[r8]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            android.content.SharedPreferences r10 = r11.f8079G
            java.lang.String r3 = r10.getString(r3, r4)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r8[r2] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            android.content.SharedPreferences r5 = r11.f8079G
            java.lang.String r9 = "c2_sp"
            java.lang.String r5 = r5.getString(r9, r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r8[r1] = r3
            r0.<init>(r7, r8)
            r3 = 2131362240(0x7f0a01c0, float:1.8344255E38)
            android.view.View r3 = r11.findViewById(r3)
            r3.setBackgroundDrawable(r0)
        L_0x0257:
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.content.SharedPreferences r0 = r11.f8079G
            java.lang.String r3 = "i"
            java.lang.String r0 = r0.getString(r3, r4)
            boolean r3 = r0.equals(r4)
            if (r3 != 0) goto L_0x0295
            int r3 = r0.length()
            r5 = 13
            if (r3 <= r6) goto L_0x0281
            british.x.config r3 = r11.f8085b
            java.lang.String r6 = r0.substring(r6, r5)
            java.lang.String r7 = "1"
            boolean r6 = r6.equals(r7)
            r3.f7464z = r6
        L_0x0281:
            int r3 = r0.length()
            if (r3 <= r5) goto L_0x0295
            british.x.config r3 = r11.f8085b
            r6 = 14
            java.lang.String r0 = r0.substring(r5, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r3.f7151B = r0
        L_0x0295:
            british.x.config r0 = r11.f8085b     // Catch:{ Exception -> 0x02a5 }
            boolean r3 = r0.f7464z     // Catch:{ Exception -> 0x02a5 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x02a5 }
            british.x.config r5 = r11.f8085b     // Catch:{ Exception -> 0x02a5 }
            int r5 = r5.f7151B     // Catch:{ Exception -> 0x02a5 }
            r0.mo7514k1(r12, r3, r5)     // Catch:{ Exception -> 0x02a5 }
            goto L_0x02a9
        L_0x02a5:
            r0 = move-exception
            r0.printStackTrace()
        L_0x02a9:
            android.graphics.Bitmap r0 = r11.f8077E
            r12.setImageBitmap(r0)
            goto L_0x02b2
        L_0x02af:
            r11.mo7812A()
        L_0x02b2:
            r11.f8097n = r2
            r11.f8098o = r2
            android.content.pm.PackageManager r12 = r11.getPackageManager()
            java.lang.String r0 = r11.getPackageName()     // Catch:{ Exception -> 0x02df }
            android.content.pm.ApplicationInfo r0 = r12.getApplicationInfo(r0, r2)     // Catch:{ Exception -> 0x02df }
            java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x02df }
            java.lang.String r12 = r12.getInstallerPackageName(r0)     // Catch:{ Exception -> 0x02df }
            if (r12 == 0) goto L_0x02df
            java.lang.String r0 = "com.android.vending"
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x02df }
            if (r0 == 0) goto L_0x02d5
            r11.f8097n = r1     // Catch:{ Exception -> 0x02df }
            goto L_0x02df
        L_0x02d5:
            java.lang.String r0 = "com.amazon.venezia"
            boolean r12 = r0.equals(r12)     // Catch:{ Exception -> 0x02df }
            if (r12 == 0) goto L_0x02df
            r11.f8098o = r1     // Catch:{ Exception -> 0x02df }
        L_0x02df:
            r12 = 0
            british.p015x.C1692config.f7132f6 = r12
            british.p015x.C1692config.f7111K5 = r2
            british.p015x.C1692config.f7133g6 = r12
            british.p015x.C1692config.f7135i6 = r12
            british.p015x.C1692config.f7134h6 = r12
            british.p015x.C1692config.f7136j6 = r12
            british.x.config r0 = r11.f8085b
            r0.f7470z5 = r12
            r0.f7433u3 = r12
            r0.f7463y5 = r12
            r0.f7426t3 = r12
            r0.f7346h4 = r4
            r0.f7352i4 = r4
            r0.f7363k3 = r4
            r0.f7345h3 = r4
            british.p015x.C1692config.f7127a6 = r4
            r0.f7281W3 = r4
            r0.f7370l3 = r4
            r0.f7351i3 = r4
            r0.f7327e3 = r4
            british.p015x.C1692config.f7128b6 = r4
            r0.f7287X3 = r4
            r0.f7377m3 = r4
            r0.f7357j3 = r4
            r0.f7233O3 = r4
            r0.f7239P3 = r4
            r0.f7155B3 = r4
            r0.f7185G3 = r4
            british.p015x.C1692config.f7129c6 = r4
            r0.f7293Y3 = r4
            r0.f7299Z3 = r4
            r0.f7208K2 = r4
            british.p015x.C1692config.f7112L5 = r2
            british.x.preinicio$s0 r0 = new british.x.preinicio$s0
            r0.<init>()
            java.lang.String[] r12 = new java.lang.String[r2]
            r0.execute(r12)
        L_0x032c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.preinicio.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f8106w) {
            m8401D();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo7822p(String str) {
        if (this.f8107x) {
            return "";
        }
        try {
            if (this.f8093j.containsKey(str)) {
                return this.f8093j.get(str);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo7823q() {
        String p = mo7822p("ft");
        String p2 = mo7822p("vfu");
        if (p2.equals("")) {
            p2 = SessionDescription.SUPPORTED_SDP_VERSION;
        }
        if (p.equals("")) {
            mo7828v();
            return;
        }
        SharedPreferences.Editor edit = this.f8079G.edit();
        edit.putString("ft", p);
        edit.putString("vfu", p2);
        edit.commit();
        if (p.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
            this.f8085b.mo7487Q(0);
            mo7828v();
        } else if (p.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            if (Integer.parseInt(p2) > Integer.parseInt(this.f8079G.getString("vfu_act", SessionDescription.SUPPORTED_SDP_VERSION))) {
                new C1950t0().execute(new String[]{p2});
                return;
            }
            this.f8085b.mo7487Q(1);
            mo7828v();
        } else {
            this.f8085b.mo7487Q(Integer.parseInt(p));
            mo7828v();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo7824r() {
        String p = mo7822p("icohome");
        if (p.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            String p2 = mo7822p("vih");
            new C1952u0().execute(new String[]{p2});
        } else if (p.equals("2")) {
            deleteFile("icohome");
            mo7827u();
        } else {
            mo7827u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo7825s() {
        C1692config config = this.f8085b;
        if (!config.f7367l0 || config.f7374m0 <= this.f8079G.getInt("ofics_imgperso_v_act", 0)) {
            C1692config config2 = this.f8085b;
            if (!config2.f7277W || config2.f7283X <= this.f8079G.getInt("busc_imgperso_v_act", 0)) {
                C1692config config3 = this.f8085b;
                if (!config3.f7229O || config3.f7235P <= this.f8079G.getInt("share_imgperso_v_act", 0)) {
                    C1692config config4 = this.f8085b;
                    if (!config4.f7395p0 || config4.f7402q0 <= this.f8079G.getInt("exit_imgperso_v_act", 0)) {
                        C1692config config5 = this.f8085b;
                        if (!config5.f7423t0 || config5.f7430u0 <= this.f8079G.getInt("notif_imgperso_v_act", 0)) {
                            C1692config config6 = this.f8085b;
                            if (!config6.f7451x0 || config6.f7458y0 <= this.f8079G.getInt("perfil_imgperso_v_act", 0)) {
                                C1692config config7 = this.f8085b;
                                if (!config7.f7253S || config7.f7259T <= this.f8079G.getInt("search_imgperso_v_act", 0)) {
                                    mo7826t();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        new C1954v0().execute(new String[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo7826t() {
        boolean z;
        if (C1692config.f7115O5.length > 0) {
            int i = 0;
            while (true) {
                C1692config.C1730q0[] q0VarArr = C1692config.f7115O5;
                if (i >= q0VarArr.length) {
                    z = false;
                    break;
                }
                int i2 = q0VarArr[i].f7546d;
                SharedPreferences sharedPreferences = this.f8079G;
                if (i2 > sharedPreferences.getInt("mb_it" + C1692config.f7115O5[i].f7544b + "_v_act", 0)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                new C1956w0().execute(new String[0]);
            } else {
                mo7824r();
            }
        } else {
            mo7824r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo7827u() {
        if (this.f8085b.f7163D > 0 && this.f8079G.getInt("fondo_v_act", 0) != this.f8085b.f7163D) {
            startService(new Intent(this, s_cargar_fondo.class));
        }
        Boolean valueOf = Boolean.valueOf(this.f8085b.f7169E > 0 && this.f8079G.getInt("v_ico_perfil_act", 0) != this.f8085b.f7169E);
        Boolean valueOf2 = Boolean.valueOf(this.f8085b.f7175F > 0 && this.f8079G.getInt("v_ico_privados_act", 0) != this.f8085b.f7175F);
        Boolean valueOf3 = Boolean.valueOf(this.f8085b.f7181G > 0 && this.f8079G.getInt("v_ico_foto_act", 0) != this.f8085b.f7181G);
        Boolean valueOf4 = Boolean.valueOf(this.f8085b.f7187H > 0 && this.f8079G.getInt("v_ico_video_act", 0) != this.f8085b.f7187H);
        Boolean valueOf5 = Boolean.valueOf(this.f8085b.f7193I > 0 && this.f8079G.getInt("v_ico_emotic_act", 0) != this.f8085b.f7193I);
        Boolean valueOf6 = Boolean.valueOf(this.f8085b.f7199J > 0 && this.f8079G.getInt("v_ico_enviar_act", 0) != this.f8085b.f7199J);
        if (valueOf.booleanValue() || valueOf2.booleanValue() || valueOf3.booleanValue() || valueOf4.booleanValue() || valueOf5.booleanValue() || valueOf6.booleanValue()) {
            Intent intent = new Intent(this, s_cargar_icos_gen.class);
            intent.putExtra("act_ico_perfil", valueOf);
            intent.putExtra("act_ico_privados", valueOf2);
            intent.putExtra("act_ico_foto", valueOf3);
            intent.putExtra("act_ico_video", valueOf4);
            intent.putExtra("act_ico_emotic", valueOf5);
            intent.putExtra("act_ico_enviar", valueOf6);
            startService(intent);
        }
        C1692config config = this.f8085b;
        int i = config.f7427t4;
        if (i != 2 || !config.f7219M1) {
            if (i == 1 && config.f7450x > 0 && this.f8079G.getInt("slider_v_act", 0) != this.f8085b.f7450x) {
                try {
                    startService(new Intent(this, s_cargar_sliderheader.class));
                } catch (Exception unused) {
                }
            }
            mo7817n();
            return;
        }
        startService(new Intent(this, s_cargar_icos.class));
        mo7817n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo7828v() {
        String p = mo7822p("sit");
        String p2 = mo7822p("vsi");
        if (p2.equals("")) {
            p2 = SessionDescription.SUPPORTED_SDP_VERSION;
        }
        if (p.equals("")) {
            mo7829w();
            return;
        }
        SharedPreferences.Editor edit = this.f8079G.edit();
        edit.putString("sit", p);
        edit.putString("vsi", p2);
        edit.commit();
        if (p.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
            mo7829w();
        } else if (p.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            if (Integer.parseInt(p2) > Integer.parseInt(this.f8079G.getString("vsi_act", SessionDescription.SUPPORTED_SDP_VERSION))) {
                new C1958x0().execute(new String[]{p2, "in"});
                return;
            }
            mo7829w();
        } else {
            mo7829w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo7829w() {
        String p = mo7822p("sot");
        String p2 = mo7822p("vso");
        if (p2.equals("")) {
            p2 = SessionDescription.SUPPORTED_SDP_VERSION;
        }
        if (p.equals("")) {
            mo7825s();
            return;
        }
        SharedPreferences.Editor edit = this.f8079G.edit();
        edit.putString("sot", p);
        edit.putString("vso", p2);
        edit.commit();
        if (p.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
            mo7825s();
        } else if (p.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            if (Integer.parseInt(p2) > Integer.parseInt(this.f8079G.getString("vso_act", SessionDescription.SUPPORTED_SDP_VERSION))) {
                new C1958x0().execute(new String[]{p2, "out"});
                return;
            }
            mo7825s();
        } else {
            mo7825s();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo7830y(String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false).setPositiveButton(getString(R.string.cerrar), new C1914e0()).setMessage(str2);
        if (!str.equals("")) {
            builder.setTitle(str);
        }
        AlertDialog create = builder.create();
        if (!this.f8090g.equals("")) {
            create.setOnShowListener(new C1918f0(create));
        }
        try {
            create.show();
        } catch (Exception unused) {
        }
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused2) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo7831z(int i) {
        int i2;
        int i3 = this.f8085b.f7205K;
        if (i3 == 1) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f8073A = progressDialog;
            progressDialog.setMessage(getString(i));
            this.f8073A.setIndeterminate(true);
            if (Build.VERSION.SDK_INT > 20 && !this.f8088e.equals("")) {
                this.f8073A.setOnShowListener(new C1922h0());
            }
            try {
                this.f8073A.show();
            } catch (Exception unused) {
            }
        } else if (i3 == 2) {
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.pb_splash);
            if (progressBar.getVisibility() == 8) {
                int i4 = this.f8085b.f7217M;
                if (i4 == 0) {
                    i2 = C1692config.m8149E(this, 40);
                } else if (i4 == 1) {
                    i2 = C1692config.m8149E(this, 80);
                } else {
                    i2 = C1692config.m8149E(this, 120);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
                int i5 = this.f8085b.f7211L;
                if (i5 == 1) {
                    layoutParams.gravity = 49;
                } else if (i5 == 2) {
                    layoutParams.gravity = 8388661;
                } else if (i5 == 3) {
                    layoutParams.gravity = 8388629;
                } else if (i5 == 4) {
                    layoutParams.gravity = 8388693;
                } else if (i5 == 5) {
                    layoutParams.gravity = 81;
                } else if (i5 == 6) {
                    layoutParams.gravity = 8388691;
                } else if (i5 == 7) {
                    layoutParams.gravity = 8388627;
                } else if (i5 == 8) {
                    layoutParams.gravity = 8388659;
                } else {
                    layoutParams.gravity = 17;
                }
                int E = C1692config.m8149E(this, 40);
                layoutParams.setMargins(E, E, E, E);
                progressBar.setLayoutParams(layoutParams);
                if (Build.VERSION.SDK_INT > 20) {
                    C1692config.m8168S0(progressBar, this.f8085b.f7223N);
                }
                progressBar.setVisibility(0);
            }
        }
    }
}
