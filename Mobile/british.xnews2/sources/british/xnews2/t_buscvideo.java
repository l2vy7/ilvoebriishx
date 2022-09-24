package british.xnews2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.facebook.ads.AdView;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import p272b9.C11188h;
import p312i9.C12788b;
import p312i9.C12789c;
import p317l8.C12831e;
import p337x8.C12957d;
import p337x8.C12960g;
import p339y8.C12982f;

public class t_buscvideo extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    String f8817A;

    /* renamed from: B */
    String f8818B;

    /* renamed from: C */
    String f8819C;

    /* renamed from: D */
    String f8820D;

    /* renamed from: E */
    String f8821E;

    /* renamed from: F */
    String f8822F;

    /* renamed from: G */
    String f8823G;

    /* renamed from: H */
    String f8824H;

    /* renamed from: I */
    String f8825I;

    /* renamed from: J */
    String f8826J;

    /* renamed from: K */
    String f8827K;

    /* renamed from: L */
    String f8828L;

    /* renamed from: M */
    String f8829M;

    /* renamed from: N */
    String f8830N;

    /* renamed from: O */
    ProgressBar f8831O;

    /* renamed from: P */
    SharedPreferences f8832P;

    /* renamed from: Q */
    LinearLayout f8833Q;

    /* renamed from: R */
    Bitmap f8834R;

    /* renamed from: S */
    File f8835S;

    /* renamed from: T */
    C2165u f8836T;

    /* renamed from: U */
    C2169y f8837U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public ArrayList<C1789f0> f8838V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C1770e0 f8839W;

    /* renamed from: X */
    C2166v f8840X;

    /* renamed from: Y */
    AlertDialog.Builder f8841Y;

    /* renamed from: Z */
    View f8842Z;

    /* renamed from: l0 */
    ListView f8843l0;

    /* renamed from: m */
    C1692config f8844m;

    /* renamed from: m0 */
    boolean f8845m0 = false;

    /* renamed from: n */
    Bundle f8846n;

    /* renamed from: n0 */
    boolean f8847n0 = false;

    /* renamed from: o */
    long f8848o;

    /* renamed from: o0 */
    FullscreenVideoLayout_pro f8849o0;

    /* renamed from: p */
    int f8850p;

    /* renamed from: p0 */
    int f8851p0;

    /* renamed from: q */
    int f8852q = 0;

    /* renamed from: q0 */
    int f8853q0 = 0;

    /* renamed from: r */
    int f8854r;

    /* renamed from: s */
    C1603c f8855s;

    /* renamed from: t */
    boolean f8856t = false;

    /* renamed from: u */
    boolean f8857u;

    /* renamed from: v */
    String f8858v;

    /* renamed from: w */
    String f8859w;

    /* renamed from: x */
    String f8860x;

    /* renamed from: y */
    String f8861y;

    /* renamed from: z */
    String f8862z;

    /* renamed from: british.xnews2.t_buscvideo$a */
    class C2140a implements AdapterView.OnItemClickListener {
        C2140a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1789f0 f0Var = (C1789f0) t_buscvideo.this.f8838V.get(i);
            if (f0Var.f7709c) {
                C2166v vVar = t_buscvideo.this.f8840X;
                if (vVar == null || vVar.getStatus() != AsyncTask.Status.RUNNING) {
                    t_buscvideo.this.f8840X = new C2166v();
                    t_buscvideo.this.f8840X.execute(new String[0]);
                    return;
                }
                return;
            }
            String str = f0Var.f7712f;
            if (!str.equals(t_buscvideo.this.f8848o + "")) {
                Intent intent = new Intent(t_buscvideo.this, profile.class);
                intent.putExtra(TtmlNode.ATTR_ID, f0Var.f7712f);
                intent.putExtra("privados", f0Var.f7714h);
                intent.putExtra("nombre", f0Var.f7711e);
                intent.putExtra("coments", f0Var.f7716j);
                intent.putExtra("fnac_d", f0Var.f7717k);
                intent.putExtra("fnac_m", f0Var.f7718l);
                intent.putExtra("fnac_a", f0Var.f7719m);
                intent.putExtra("sexo", f0Var.f7715i);
                intent.putExtra("vfoto", f0Var.f7713g);
                if (t_buscvideo.this.f8846n.containsKey("desdepriv")) {
                    intent.putExtra("desdepriv", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                }
                t_buscvideo t_buscvideo = t_buscvideo.this;
                intent.putExtra("p_fnac", t_buscvideo.f8844m.f7231O1[t_buscvideo.f8851p0].f7851C0);
                t_buscvideo t_buscvideo2 = t_buscvideo.this;
                intent.putExtra("p_sexo", t_buscvideo2.f8844m.f7231O1[t_buscvideo2.f8851p0].f7853D0);
                t_buscvideo t_buscvideo3 = t_buscvideo.this;
                intent.putExtra("p_descr", t_buscvideo3.f8844m.f7231O1[t_buscvideo3.f8851p0].f7855E0);
                t_buscvideo t_buscvideo4 = t_buscvideo.this;
                intent.putExtra("p_dist", t_buscvideo4.f8844m.f7231O1[t_buscvideo4.f8851p0].f7857F0);
                t_buscvideo t_buscvideo5 = t_buscvideo.this;
                intent.putExtra("coments_chat", t_buscvideo5.f8844m.f7231O1[t_buscvideo5.f8851p0].f7886U);
                t_buscvideo t_buscvideo6 = t_buscvideo.this;
                intent.putExtra("galeria", t_buscvideo6.f8844m.f7231O1[t_buscvideo6.f8851p0].f7888V);
                t_buscvideo t_buscvideo7 = t_buscvideo.this;
                intent.putExtra("privados_chat", t_buscvideo7.f8844m.f7231O1[t_buscvideo7.f8851p0].f7884T);
                intent.putExtra("fotos_perfil", t_buscvideo.this.f8854r);
                intent.putExtra("fotos_chat", 1);
                t_buscvideo.this.startActivityForResult(intent, 0);
            }
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$a0 */
    private class C2141a0 extends AsyncTask<String, Void, String> {
        private C2141a0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/reportar_buscvideo.php?idusu=" + t_buscvideo.this.f8848o + "&c=" + t_buscvideo.this.f8858v + "&idv=" + t_buscvideo.this.f8860x);
                eVar.mo47986B(new C12960g(C12957d.BROWSER_COMPATIBLE));
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                hVar.mo43518a(eVar);
                return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$b */
    class C2142b implements DialogInterface.OnClickListener {
        C2142b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            t_buscvideo.this.findViewById(R.id.iv_reportar).setVisibility(8);
            t_buscvideo t_buscvideo = t_buscvideo.this;
            C1692config.m8157K0(Toast.makeText(t_buscvideo, t_buscvideo.getResources().getString(R.string.enviando), 0));
            new C2141a0().execute(new String[0]);
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$b0 */
    private class C2143b0 extends AsyncTask<String, Void, String> {
        private C2143b0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/buscvideo_visto.php?idusu=" + t_buscvideo.this.f8848o + "&c=" + t_buscvideo.this.f8858v + "&idv=" + t_buscvideo.this.f8860x);
                eVar.mo47986B(new C12960g(C12957d.BROWSER_COMPATIBLE));
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                hVar.mo43518a(eVar);
                return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$c */
    class C2144c implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8867a;

        C2144c(AlertDialog alertDialog) {
            this.f8867a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8867a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_buscvideo.this.f6656b));
            Button button2 = this.f8867a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + t_buscvideo.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$d */
    class C2145d implements DialogInterface.OnClickListener {
        C2145d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            t_buscvideo t_buscvideo = t_buscvideo.this;
            new C2168x(t_buscvideo.f8860x).execute(new String[0]);
            Intent intent = new Intent();
            intent.putExtra("elim_video", t_buscvideo.this.f8860x);
            intent.putExtra("indv", t_buscvideo.this.f8850p);
            t_buscvideo.this.setResult(-1, intent);
            t_buscvideo.this.finish();
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$e */
    class C2146e implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8870a;

        C2146e(AlertDialog alertDialog) {
            this.f8870a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8870a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_buscvideo.this.f6656b));
            Button button2 = this.f8870a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + t_buscvideo.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$f */
    class C2147f implements View.OnClickListener {
        C2147f() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$g */
    class C2148g implements View.OnClickListener {
        C2148g() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$h */
    class C2149h extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f8874a;

        /* renamed from: british.xnews2.t_buscvideo$h$a */
        class C2150a extends FullScreenContentCallback {
            C2150a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_buscvideo t_buscvideo = t_buscvideo.this;
                if (t_buscvideo.f8856t) {
                    t_buscvideo.abrir_secc(t_buscvideo.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_buscvideo t_buscvideo = t_buscvideo.this;
                t_buscvideo.abrir_secc(t_buscvideo.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_buscvideo$h$b */
        class C2151b implements OnUserEarnedRewardListener {
            C2151b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2149h hVar = C2149h.this;
                t_buscvideo.this.f8856t = true;
                C1692config.m8175Y0(hVar.f8874a);
            }
        }

        C2149h(Context context) {
            this.f8874a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_buscvideo.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2150a());
            rewardedAd.show((Activity) this.f8874a, new C2151b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_buscvideo t_buscvideo = t_buscvideo.this;
            if (!t_buscvideo.f8844m.mo7502f(this.f8874a, t_buscvideo.f6663i)) {
                t_buscvideo.this.f6661g.cancel();
                t_buscvideo t_buscvideo2 = t_buscvideo.this;
                t_buscvideo2.abrir_secc(t_buscvideo2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$i */
    class C2152i implements AdDisplayListener {
        C2152i() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_buscvideo t_buscvideo = t_buscvideo.this;
            if (t_buscvideo.f8856t) {
                t_buscvideo.abrir_secc(t_buscvideo.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$j */
    class C2153j extends AdColonyInterstitialListener {
        C2153j() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_buscvideo t_buscvideo = t_buscvideo.this;
            if (t_buscvideo.f8856t) {
                t_buscvideo.abrir_secc(t_buscvideo.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_buscvideo.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_buscvideo.this.f6661g.cancel();
            t_buscvideo t_buscvideo = t_buscvideo.this;
            t_buscvideo.abrir_secc(t_buscvideo.f6660f);
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$k */
    class C2154k implements SearchManager.OnCancelListener {
        C2154k() {
        }

        public void onCancel() {
            t_buscvideo t_buscvideo = t_buscvideo.this;
            t_buscvideo.f6657c = false;
            t_buscvideo.setResult(0);
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$l */
    class C2155l implements SearchManager.OnDismissListener {
        C2155l() {
        }

        public void onDismiss() {
            t_buscvideo.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$m */
    class C2156m implements View.OnClickListener {
        C2156m() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$n */
    class C2157n implements View.OnClickListener {
        C2157n() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$o */
    class C2158o implements MediaPlayer.OnPreparedListener {
        C2158o() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$p */
    class C2159p implements MediaPlayer.OnErrorListener {
        C2159p() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return false;
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$q */
    class C2160q implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ View f8886b;

        /* renamed from: c */
        final /* synthetic */ String f8887c;

        C2160q(View view, String str) {
            this.f8886b = view;
            this.f8887c = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f8886b.setVisibility(8);
            int indexOfChild = ((LinearLayout) this.f8886b.getParent()).indexOfChild(this.f8886b);
            SharedPreferences.Editor edit = t_buscvideo.this.f8832P.edit();
            while (indexOfChild < 4) {
                SharedPreferences sharedPreferences = t_buscvideo.this.f8832P;
                StringBuilder sb = new StringBuilder();
                sb.append("idcombv");
                int i2 = indexOfChild + 1;
                sb.append(i2);
                sb.append("_");
                sb.append(t_buscvideo.this.f8860x);
                edit.putString("idcombv" + indexOfChild + "_" + t_buscvideo.this.f8860x, sharedPreferences.getString(sb.toString(), ""));
                edit.putString("combv" + indexOfChild + "_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_" + t_buscvideo.this.f8860x, ""));
                edit.putString("combv" + indexOfChild + "_fcrea_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_fcrea_" + t_buscvideo.this.f8860x, ""));
                edit.putString("combv" + indexOfChild + "_idusucrea_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_idusucrea_" + t_buscvideo.this.f8860x, ""));
                edit.putString("combv" + indexOfChild + "_nombre_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_nombre_" + t_buscvideo.this.f8860x, ""));
                edit.putString("combv" + indexOfChild + "_vfoto_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_vfoto_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("combv" + indexOfChild + "_privados_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_privados_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("combv" + indexOfChild + "_fnacd_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_fnacd_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("combv" + indexOfChild + "_fnacm_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_fnacm_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("combv" + indexOfChild + "_fnaca_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_fnaca_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("combv" + indexOfChild + "_sexo_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_sexo_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("combv" + indexOfChild + "_coments_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_coments_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                indexOfChild = i2;
            }
            edit.commit();
            new C2167w(this.f8887c).execute(new String[0]);
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$r */
    class C2161r implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8889a;

        C2161r(AlertDialog alertDialog) {
            this.f8889a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8889a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_buscvideo.this.f6656b));
            Button button2 = this.f8889a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + t_buscvideo.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$s */
    private class C2162s extends AsyncTask<String, Void, String> {

        /* renamed from: british.xnews2.t_buscvideo$s$a */
        class C2163a implements View.OnClickListener {
            C2163a() {
            }

            public void onClick(View view) {
                t_buscvideo.this.findViewById(R.id.ll_btns).setVisibility(8);
                t_buscvideo.this.f8849o0.mo7148h();
                t_buscvideo.this.m8624e();
            }
        }

        private C2162s() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007c }
                r0.<init>()     // Catch:{ Exception -> 0x007c }
                java.lang.String r1 = "https://global.appnext.com/offerWallApi.aspx?id="
                r0.append(r1)     // Catch:{ Exception -> 0x007c }
                british.xnews2.t_buscvideo r1 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x007c }
                british.xnews2.config r1 = r1.f8844m     // Catch:{ Exception -> 0x007c }
                java.lang.String r1 = r1.f7274V2     // Catch:{ Exception -> 0x007c }
                r0.append(r1)     // Catch:{ Exception -> 0x007c }
                java.lang.String r1 = "&type=vast&vast_ver=3.0&duration=all&packageId="
                r0.append(r1)     // Catch:{ Exception -> 0x007c }
                british.xnews2.t_buscvideo r1 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x007c }
                java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x007c }
                r0.append(r1)     // Catch:{ Exception -> 0x007c }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x007c }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x007c }
                r1.<init>(r0)     // Catch:{ Exception -> 0x007c }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x007c }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x007c }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r6.<init>()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            L_0x0050:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                if (r2 == 0) goto L_0x006b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r3.<init>()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r3.append(r2)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r6.append(r2)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                goto L_0x0050
            L_0x006b:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r0.disconnect()
                return r6
            L_0x0073:
                r6 = move-exception
                goto L_0x0084
            L_0x0075:
                r6 = r0
                goto L_0x007c
            L_0x0077:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0084
            L_0x007c:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x0083
                r6.disconnect()
            L_0x0083:
                return r0
            L_0x0084:
                if (r0 == 0) goto L_0x0089
                r0.disconnect()
            L_0x0089:
                goto L_0x008b
            L_0x008a:
                throw r6
            L_0x008b:
                goto L_0x008a
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideo.C2162s.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.String r0 = "<Ad id="
                boolean r0 = r7.contains(r0)
                r1 = 0
                if (r0 == 0) goto L_0x0058
                java.lang.String r0 = "<Impression><![CDATA["
                int r0 = r7.indexOf(r0)
                r2 = -1
                if (r0 == r2) goto L_0x0058
                int r0 = r0 + 21
                java.lang.String r3 = "]"
                int r4 = r7.indexOf(r3, r0)
                british.xnews2.t_buscvideo r5 = british.xnews2.t_buscvideo.this
                british.xnews2.FullscreenVideoLayout_pro r5 = r5.f8849o0
                java.lang.String r0 = r7.substring(r0, r4)
                r5.f6708x = r0
                java.lang.String r0 = "<ClickThrough><![CDATA["
                int r0 = r7.indexOf(r0)
                if (r0 == r2) goto L_0x0058
                int r0 = r0 + 23
                int r4 = r7.indexOf(r3, r0)
                british.xnews2.t_buscvideo r5 = british.xnews2.t_buscvideo.this
                british.xnews2.FullscreenVideoLayout_pro r5 = r5.f8849o0
                java.lang.String r0 = r7.substring(r0, r4)
                r5.f6709y = r0
                java.lang.String r0 = "width=\"320\" height=\"180\""
                int r0 = r7.indexOf(r0)
                if (r0 == r2) goto L_0x0058
                java.lang.String r4 = "><![CDATA["
                int r0 = r7.indexOf(r4, r0)
                if (r0 == r2) goto L_0x0058
                int r0 = r0 + 10
                int r2 = r7.indexOf(r3, r0)
                java.lang.String r7 = r7.substring(r0, r2)
                r0 = 1
                goto L_0x005b
            L_0x0058:
                java.lang.String r7 = ""
                r0 = 0
            L_0x005b:
                if (r0 == 0) goto L_0x0089
                android.net.Uri r7 = android.net.Uri.parse(r7)
                british.xnews2.t_buscvideo r0 = british.xnews2.t_buscvideo.this
                r2 = 2131361958(0x7f0a00a6, float:1.8343683E38)
                android.view.View r0 = r0.findViewById(r2)
                british.xnews2.t_buscvideo$s$a r2 = new british.xnews2.t_buscvideo$s$a
                r2.<init>()
                r0.setOnClickListener(r2)
                british.xnews2.t_buscvideo r0 = british.xnews2.t_buscvideo.this
                british.xnews2.FullscreenVideoLayout_pro r0 = r0.f8849o0
                r0.f6706K = r1
                r0.mo7159p()
                british.xnews2.t_buscvideo r0 = british.xnews2.t_buscvideo.this     // Catch:{ IOException -> 0x0084 }
                british.xnews2.FullscreenVideoLayout_pro r0 = r0.f8849o0     // Catch:{ IOException -> 0x0084 }
                r1 = 0
                r0.mo7203k(r7, r1)     // Catch:{ IOException -> 0x0084 }
                goto L_0x008e
            L_0x0084:
                r7 = move-exception
                r7.printStackTrace()
                goto L_0x008e
            L_0x0089:
                british.xnews2.t_buscvideo r7 = british.xnews2.t_buscvideo.this
                r7.m8624e()
            L_0x008e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideo.C2162s.onPostExecute(java.lang.String):void");
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$t */
    private class C2164t extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        boolean f8893a;

        C2164t(boolean z) {
            this.f8893a = z;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00b3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                british.xnews2.t_buscvideo r7 = british.xnews2.t_buscvideo.this
                java.lang.String r7 = r7.f8818B
                boolean r0 = r6.f8893a
                java.lang.String r1 = "0"
                if (r0 == 0) goto L_0x000f
                java.lang.String r7 = "1"
                r5 = r1
                r1 = r7
                r7 = r5
            L_0x000f:
                r0 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af }
                r2.<init>()     // Catch:{ Exception -> 0x00af }
                java.lang.String r3 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x00af }
                r2.append(r3)     // Catch:{ Exception -> 0x00af }
                java.lang.String r3 = "/srv/coments_buscvideo.php?idusu="
                r2.append(r3)     // Catch:{ Exception -> 0x00af }
                british.xnews2.t_buscvideo r3 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x00af }
                long r3 = r3.f8848o     // Catch:{ Exception -> 0x00af }
                r2.append(r3)     // Catch:{ Exception -> 0x00af }
                java.lang.String r3 = "&c="
                r2.append(r3)     // Catch:{ Exception -> 0x00af }
                british.xnews2.t_buscvideo r3 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x00af }
                java.lang.String r3 = r3.f8858v     // Catch:{ Exception -> 0x00af }
                r2.append(r3)     // Catch:{ Exception -> 0x00af }
                java.lang.String r3 = "&idv="
                r2.append(r3)     // Catch:{ Exception -> 0x00af }
                british.xnews2.t_buscvideo r3 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x00af }
                java.lang.String r3 = r3.f8860x     // Catch:{ Exception -> 0x00af }
                r2.append(r3)     // Catch:{ Exception -> 0x00af }
                java.lang.String r3 = "&idc="
                r2.append(r3)     // Catch:{ Exception -> 0x00af }
                r2.append(r7)     // Catch:{ Exception -> 0x00af }
                java.lang.String r7 = "&es_ini="
                r2.append(r7)     // Catch:{ Exception -> 0x00af }
                r2.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x00af }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00af }
                r1.<init>(r7)     // Catch:{ Exception -> 0x00af }
                java.net.URLConnection r7 = r1.openConnection()     // Catch:{ Exception -> 0x00af }
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Exception -> 0x00af }
                r0 = 1
                r7.setDoInput(r0)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r0 = 10000(0x2710, float:1.4013E-41)
                r7.setConnectTimeout(r0)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r7.setReadTimeout(r0)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.lang.String r0 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r7.setRequestProperty(r0, r1)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.io.InputStream r0 = r7.getInputStream()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r0.<init>()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            L_0x0083:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                if (r2 == 0) goto L_0x009e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r3.<init>()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r3.append(r2)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r0.append(r2)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                goto L_0x0083
            L_0x009e:
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r7.disconnect()
                return r0
            L_0x00a6:
                r0 = move-exception
                goto L_0x00b7
            L_0x00a8:
                r0 = r7
                goto L_0x00af
            L_0x00aa:
                r7 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x00b7
            L_0x00af:
                java.lang.String r7 = ""
                if (r0 == 0) goto L_0x00b6
                r0.disconnect()
            L_0x00b6:
                return r7
            L_0x00b7:
                if (r7 == 0) goto L_0x00bc
                r7.disconnect()
            L_0x00bc:
                goto L_0x00be
            L_0x00bd:
                throw r0
            L_0x00be:
                goto L_0x00bd
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideo.C2164t.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String[] strArr;
            String str2;
            int i;
            int i2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13 = str;
            try {
                t_buscvideo.this.findViewById(R.id.pb_mascoments).setVisibility(8);
                t_buscvideo.this.findViewById(R.id.pb_mascoments_inv).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str13.contains("ANDROID:OK DATOS:")) {
                int indexOf = str13.indexOf("DATOS:") + 6;
                String substring = str13.substring(indexOf, str13.indexOf(";", indexOf));
                String str14 = ",";
                String[] split = substring.split(str14);
                String str15 = "N";
                String str16 = "S";
                String str17 = "-";
                if (!this.f8893a) {
                    strArr = split;
                    String str18 = str15;
                    String str19 = str16;
                    String str20 = str17;
                    String str21 = str14;
                    int i3 = 0;
                    while (true) {
                        str2 = str19;
                        if (strArr[i].equals(str2)) {
                            break;
                        }
                        String str22 = str18;
                        if (strArr[i].equals(str22)) {
                            break;
                        }
                        String[] split2 = strArr[i].split(str20);
                        String replace = split2[1].replace("@X@", str20).replace("@Y@", str21);
                        t_buscvideo t_buscvideo = t_buscvideo.this;
                        Boolean bool = Boolean.FALSE;
                        t_buscvideo.mo8309j(bool, bool, split2[0], split2[3], split2[4], split2[2], replace, split2[5], split2[6], split2[7], split2[8], split2[9], split2[10], split2[11]);
                        i3 = i + 1;
                        str19 = str2;
                        str18 = str22;
                    }
                } else {
                    SharedPreferences.Editor edit = t_buscvideo.this.f8832P.edit();
                    int i4 = 0;
                    while (true) {
                        str3 = "_sexo_";
                        str4 = "_fnaca_";
                        str5 = "_fnacm_";
                        str6 = str14;
                        str7 = "_fcrea_";
                        str8 = str17;
                        str9 = "idcombv";
                        str10 = str15;
                        str11 = "_";
                        str12 = str16;
                        strArr = split;
                        if (i4 >= 4) {
                            break;
                        }
                        edit.remove(str9 + i4 + str11 + t_buscvideo.this.f8860x);
                        edit.remove("combv" + i4 + str11 + t_buscvideo.this.f8860x);
                        edit.remove("combv" + i4 + str7 + t_buscvideo.this.f8860x);
                        edit.remove("combv" + i4 + "_idusucrea_" + t_buscvideo.this.f8860x);
                        edit.remove("combv" + i4 + "_nombre_" + t_buscvideo.this.f8860x);
                        edit.remove("combv" + i4 + "_vfoto_" + t_buscvideo.this.f8860x);
                        edit.remove("combv" + i4 + "_privados_" + t_buscvideo.this.f8860x);
                        edit.remove("combv" + i4 + "_fnacd_" + t_buscvideo.this.f8860x);
                        edit.remove("combv" + i4 + str5 + t_buscvideo.this.f8860x);
                        edit.remove("combv" + i4 + str4 + t_buscvideo.this.f8860x);
                        edit.remove("combv" + i4 + str3 + t_buscvideo.this.f8860x);
                        edit.remove("combv" + i4 + "_coments_" + t_buscvideo.this.f8860x);
                        i4++;
                        str14 = str6;
                        str17 = str8;
                        str15 = str10;
                        str16 = str12;
                        split = strArr;
                    }
                    i = 0;
                    while (true) {
                        String str23 = str3;
                        String str24 = str12;
                        if (strArr[i].equals(str24)) {
                            str12 = str24;
                            break;
                        }
                        str12 = str24;
                        String str25 = str10;
                        if (strArr[i].equals(str25)) {
                            break;
                        }
                        str10 = str25;
                        String str26 = str8;
                        String[] split3 = strArr[i].split(str26);
                        String str27 = str4;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str9);
                        sb.append(i);
                        sb.append(str11);
                        String str28 = str9;
                        sb.append(t_buscvideo.this.f8860x);
                        String str29 = str5;
                        edit.putString(sb.toString(), split3[0]);
                        String str30 = str11;
                        String str31 = str6;
                        edit.putString("combv" + i + str11 + t_buscvideo.this.f8860x, split3[1].replace("@X@", str26).replace("@Y@", str31));
                        edit.putString("combv" + i + str7 + t_buscvideo.this.f8860x, split3[2]);
                        edit.putString("combv" + i + "_idusucrea_" + t_buscvideo.this.f8860x, split3[3]);
                        edit.putString("combv" + i + "_nombre_" + t_buscvideo.this.f8860x, split3[4]);
                        edit.putString("combv" + i + "_vfoto_" + t_buscvideo.this.f8860x, split3[5]);
                        edit.putString("combv" + i + "_privados_" + t_buscvideo.this.f8860x, split3[6]);
                        edit.putString("combv" + i + "_fnacd_" + t_buscvideo.this.f8860x, split3[7]);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("combv");
                        sb2.append(i);
                        String str32 = str29;
                        sb2.append(str32);
                        sb2.append(t_buscvideo.this.f8860x);
                        edit.putString(sb2.toString(), split3[8]);
                        edit.putString("combv" + i + str27 + t_buscvideo.this.f8860x, split3[9]);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("combv");
                        sb3.append(i);
                        String str33 = str23;
                        sb3.append(str33);
                        sb3.append(t_buscvideo.this.f8860x);
                        edit.putString(sb3.toString(), split3[10]);
                        edit.putString("combv" + i + "_coments_" + t_buscvideo.this.f8860x, split3[11]);
                        i++;
                        str5 = str32;
                        str7 = str7;
                        str9 = str28;
                        str6 = str31;
                        str11 = str30;
                        String str34 = str27;
                        str8 = str26;
                        str3 = str33;
                        str4 = str34;
                    }
                    edit.commit();
                    t_buscvideo.this.mo8310k(false);
                    str2 = str12;
                }
                C2165u uVar = t_buscvideo.this.f8836T;
                if (uVar == null || uVar.getStatus() != AsyncTask.Status.RUNNING) {
                    t_buscvideo t_buscvideo2 = t_buscvideo.this;
                    t_buscvideo2.f8836T = new C2165u();
                    i2 = 0;
                    t_buscvideo.this.f8836T.execute(new String[0]);
                } else {
                    i2 = 0;
                }
                if (strArr[i].equals(str2)) {
                    t_buscvideo.this.findViewById(R.id.fl_mascoments).setVisibility(i2);
                }
                if (this.f8893a && !t_buscvideo.this.f8846n.containsKey("nlikes")) {
                    t_buscvideo t_buscvideo3 = t_buscvideo.this;
                    t_buscvideo3.f8859w = strArr[i + 1];
                    t_buscvideo3.f8861y = strArr[i + 2];
                    t_buscvideo3.m8627l();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_buscvideo.this.findViewById(R.id.fl_mascoments).setVisibility(8);
            t_buscvideo t_buscvideo = t_buscvideo.this;
            if (t_buscvideo.f8857u) {
                t_buscvideo.findViewById(R.id.pb_mascoments_inv).setVisibility(0);
            } else {
                t_buscvideo.findViewById(R.id.pb_mascoments).setVisibility(0);
            }
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$u */
    private class C2165u extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f8895a;

        /* renamed from: b */
        String f8896b;

        /* renamed from: c */
        Bitmap f8897c;

        private C2165u() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                java.lang.String r0 = r4.f8895a
                if (r0 != 0) goto L_0x0009
                java.lang.String r5 = "-1"
                return r5
            L_0x0009:
                java.net.URL r0 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.xnews2.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/usus/"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f8895a     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_1_p.jpg?v="
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f8896b     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r0.<init>(r1)     // Catch:{  }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{  }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{  }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{  }
                r1 = 20000(0x4e20, float:2.8026E-41)
                r0.setReadTimeout(r1)     // Catch:{  }
                r0.connect()     // Catch:{  }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{  }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ MalformedURLException -> 0x0088 }
                r4.f8897c = r2     // Catch:{ MalformedURLException -> 0x0088 }
                r1.close()     // Catch:{  }
                r0.disconnect()     // Catch:{  }
                java.io.File r0 = new java.io.File     // Catch:{  }
                british.xnews2.t_buscvideo r1 = british.xnews2.t_buscvideo.this     // Catch:{  }
                java.io.File r1 = r1.f8835S     // Catch:{  }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                r2.<init>()     // Catch:{  }
                java.lang.String r3 = "fperfil_"
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = r4.f8895a     // Catch:{  }
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = ".jpg"
                r2.append(r3)     // Catch:{  }
                java.lang.String r2 = r2.toString()     // Catch:{  }
                r0.<init>(r1, r2)     // Catch:{  }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r0)     // Catch:{  }
                android.graphics.Bitmap r0 = r4.f8897c     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 70
                r0.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
            L_0x0088:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideo.C2165u.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (t_buscvideo.this.f8833Q != null && this.f8895a != null && !str.equals("-1")) {
                if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                    SharedPreferences.Editor edit = t_buscvideo.this.f8832P.edit();
                    edit.putString("fperfil_" + this.f8895a, this.f8896b);
                    edit.commit();
                }
                int childCount = t_buscvideo.this.f8833Q.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    String str2 = (String) t_buscvideo.this.f8833Q.getChildAt(i).findViewById(R.id.iv_usucoment).getTag(R.id.idaux1);
                    if (str2 != null && str2.equals(this.f8895a)) {
                        t_buscvideo.this.f8833Q.getChildAt(i).findViewById(R.id.iv_usucoment).setTag(R.id.idaux2, this.f8896b);
                        if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                            ((ImageView) t_buscvideo.this.f8833Q.getChildAt(i).findViewById(R.id.iv_usucoment)).setImageBitmap(this.f8897c);
                        }
                    }
                }
                new C2165u().execute(new String[0]);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            for (int i = 0; i < t_buscvideo.this.f8833Q.getChildCount(); i++) {
                LinearLayout linearLayout = (LinearLayout) t_buscvideo.this.f8833Q.getChildAt(i);
                String str = (String) linearLayout.findViewById(R.id.iv_usucoment).getTag(R.id.idaux1);
                String str2 = (String) linearLayout.findViewById(R.id.iv_usucoment).getTag(R.id.idaux2);
                this.f8896b = str2;
                if (str2 != null && !str2.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                    String str3 = this.f8896b;
                    SharedPreferences sharedPreferences = t_buscvideo.this.f8832P;
                    if (!str3.equals(sharedPreferences.getString("fperfil_" + str, SessionDescription.SUPPORTED_SDP_VERSION))) {
                        this.f8895a = str;
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$v */
    private class C2166v extends AsyncTask<String, Void, String> {
        private C2166v() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00a0  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009c }
                r0.<init>()     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "/srv/likes.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.t_buscvideo r1 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x009c }
                long r1 = r1.f8848o     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.t_buscvideo r1 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = r1.f8858v     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&id_buscvideo="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.t_buscvideo r1 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = r1.f8860x     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&n="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.t_buscvideo r1 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x009c }
                int r1 = r1.f8852q     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x009c }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x009c }
                r1.<init>(r0)     // Catch:{ Exception -> 0x009c }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x009c }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x009c }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r6.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            L_0x0070:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                if (r2 == 0) goto L_0x008b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r3.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r3.append(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r6.append(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                goto L_0x0070
            L_0x008b:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r0.disconnect()
                return r6
            L_0x0093:
                r6 = move-exception
                goto L_0x00a4
            L_0x0095:
                r6 = r0
                goto L_0x009c
            L_0x0097:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00a4
            L_0x009c:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x00a3
                r6.disconnect()
            L_0x00a3:
                return r0
            L_0x00a4:
                if (r0 == 0) goto L_0x00a9
                r0.disconnect()
            L_0x00a9:
                goto L_0x00ab
            L_0x00aa:
                throw r6
            L_0x00ab:
                goto L_0x00aa
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideo.C2166v.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            boolean z;
            try {
                t_buscvideo.this.f8842Z.findViewById(R.id.likes_pb).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                if (t_buscvideo.this.f8838V.size() == 0) {
                    if (t_buscvideo.this.f8861y.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                        C1789f0 f0Var = new C1789f0();
                        f0Var.f7712f = t_buscvideo.this.f8848o + "";
                        f0Var.f7711e = t_buscvideo.this.getResources().getString(R.string.tu);
                        t_buscvideo t_buscvideo = t_buscvideo.this;
                        f0Var.f7708b = t_buscvideo.f8844m.mo7516l0(t_buscvideo, 1).exists();
                        t_buscvideo.this.f8838V.add(f0Var);
                    }
                } else if (((C1789f0) t_buscvideo.this.f8838V.get(t_buscvideo.this.f8838V.size() - 1)).f7709c) {
                    t_buscvideo.this.f8838V.remove(t_buscvideo.this.f8838V.size() - 1);
                }
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    int i2 = 0;
                    while (true) {
                        if (i2 >= t_buscvideo.this.f8838V.size()) {
                            z = false;
                            break;
                        } else if (((C1789f0) t_buscvideo.this.f8838V.get(i2)).f7712f.equals(split2[0])) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        C1789f0 f0Var2 = new C1789f0();
                        f0Var2.f7712f = split2[0];
                        f0Var2.f7711e = split2[1].replace("@X@", ",").replace("@Y@", "-");
                        String str2 = split2[2];
                        f0Var2.f7713g = str2;
                        if (!str2.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                            f0Var2.f7708b = true;
                        }
                        f0Var2.f7714h = split2[3];
                        f0Var2.f7717k = split2[4];
                        f0Var2.f7718l = split2[5];
                        f0Var2.f7719m = split2[6];
                        f0Var2.f7715i = split2[7];
                        f0Var2.f7716j = split2[8];
                        f0Var2.f7710d = split2[9].equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        t_buscvideo.this.f8838V.add(f0Var2);
                        t_buscvideo.this.f8852q++;
                    }
                    i++;
                }
                if (split[i].equals("S")) {
                    C1789f0 f0Var3 = new C1789f0();
                    f0Var3.f7709c = true;
                    t_buscvideo.this.f8838V.add(f0Var3);
                }
                t_buscvideo.this.f8839W.notifyDataSetChanged();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_buscvideo.this.f8842Z.findViewById(R.id.likes_pb).setVisibility(0);
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$w */
    private class C2167w extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f8900a;

        C2167w(String str) {
            this.f8900a = str;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
                r0.<init>()     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "/srv/eliminar_coment_buscvideo.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.t_buscvideo r1 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x0082 }
                long r1 = r1.f8848o     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.t_buscvideo r1 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r1.f8858v     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&idc="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r5.f8900a     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0082 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0082 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0082 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x0082 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0082 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r0.setReadTimeout(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.lang.String r1 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r0.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r3.<init>(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
            L_0x005d:
                java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                if (r1 == 0) goto L_0x0071
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r3.<init>()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r3.append(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.lang.String r1 = "\n"
                r3.append(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                goto L_0x005d
            L_0x0071:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r0.disconnect()
                return r6
            L_0x0079:
                r6 = move-exception
                goto L_0x008d
            L_0x007b:
                r6 = r0
                goto L_0x0082
            L_0x007d:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x008d
            L_0x0082:
                r0 = 2
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x007d }
                if (r6 == 0) goto L_0x008c
                r6.disconnect()
            L_0x008c:
                return r0
            L_0x008d:
                if (r0 == 0) goto L_0x0092
                r0.disconnect()
            L_0x0092:
                goto L_0x0094
            L_0x0093:
                throw r6
            L_0x0094:
                goto L_0x0093
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideo.C2167w.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$x */
    private class C2168x extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f8902a;

        C2168x(String str) {
            this.f8902a = str;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
                r0.<init>()     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "/srv/eliminar_buscvideo.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.t_buscvideo r1 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x0082 }
                long r1 = r1.f8848o     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.t_buscvideo r1 = british.xnews2.t_buscvideo.this     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r1.f8858v     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&idv="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r5.f8902a     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0082 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0082 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0082 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x0082 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0082 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r0.setReadTimeout(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.lang.String r1 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r0.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r3.<init>(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
            L_0x005d:
                java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                if (r1 == 0) goto L_0x0071
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r3.<init>()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r3.append(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.lang.String r1 = "\n"
                r3.append(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                goto L_0x005d
            L_0x0071:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r0.disconnect()
                return r6
            L_0x0079:
                r6 = move-exception
                goto L_0x008d
            L_0x007b:
                r6 = r0
                goto L_0x0082
            L_0x007d:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x008d
            L_0x0082:
                r0 = 2
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x007d }
                if (r6 == 0) goto L_0x008c
                r6.disconnect()
            L_0x008c:
                return r0
            L_0x008d:
                if (r0 == 0) goto L_0x0092
                r0.disconnect()
            L_0x0092:
                goto L_0x0094
            L_0x0093:
                throw r6
            L_0x0094:
                goto L_0x0093
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideo.C2168x.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$y */
    private class C2169y extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f8904a;

        /* renamed from: british.xnews2.t_buscvideo$y$a */
        class C2170a implements Runnable {
            C2170a() {
            }

            public void run() {
                try {
                    ((ScrollView) t_buscvideo.this.findViewById(R.id.sc_pro)).smoothScrollTo(0, t_buscvideo.this.findViewById(R.id.tv_coments).getTop());
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: british.xnews2.t_buscvideo$y$b */
        class C2171b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f8907a;

            C2171b(AlertDialog alertDialog) {
                this.f8907a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f8907a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_buscvideo.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.t_buscvideo$y$c */
        class C2172c implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f8909a;

            C2172c(AlertDialog alertDialog) {
                this.f8909a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f8909a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_buscvideo.this.f6656b));
            }
        }

        public C2169y(String str) {
            this.f8904a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/enviar_coment_buscvideo.php?idusu=" + t_buscvideo.this.f8848o + "&c=" + t_buscvideo.this.f8858v + "&idv=" + t_buscvideo.this.f8860x);
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                gVar.mo48144c("m", new C12982f(URLEncoder.encode(this.f8904a, C6540C.UTF8_NAME)));
                eVar.mo47986B(gVar);
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo43518a(eVar).mo47805b().mo43577k(), C6540C.UTF8_NAME));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb.toString();
                    }
                    sb.append(readLine);
                }
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String str2 = str;
            AlertDialog.Builder builder = new AlertDialog.Builder(t_buscvideo.this);
            try {
                t_buscvideo.this.f8831O.setVisibility(8);
                t_buscvideo t_buscvideo = t_buscvideo.this;
                if (t_buscvideo.f8857u || Build.VERSION.SDK_INT <= 12) {
                    ((TextView) t_buscvideo.findViewById(R.id.et_coment_self)).setTextColor(-16777216);
                } else {
                    ((TextView) t_buscvideo.findViewById(R.id.et_coment_self)).setTextColor(-1);
                }
            } catch (Exception unused) {
            }
            if (str2.indexOf("ANDROID:OK ID:") != -1) {
                int indexOf = str2.indexOf("ANDROID:OK ID:") + 14;
                String substring = str2.substring(indexOf, str2.indexOf("-", indexOf));
                ((EditText) t_buscvideo.this.findViewById(R.id.et_coment_self)).setText("");
                String v = C1692config.m8201v(new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
                t_buscvideo.this.mo8309j(Boolean.FALSE, Boolean.TRUE, substring, t_buscvideo.this.f8848o + "", t_buscvideo.this.getResources().getString(R.string.tu), v, this.f8904a, SessionDescription.SUPPORTED_SDP_VERSION, "", "", "", "", "", "");
                SharedPreferences.Editor edit = t_buscvideo.this.f8832P.edit();
                for (int i = 3; i > 0; i += -1) {
                    SharedPreferences sharedPreferences = t_buscvideo.this.f8832P;
                    StringBuilder sb = new StringBuilder();
                    sb.append("idcombv");
                    int i2 = i - 1;
                    sb.append(i2);
                    sb.append("_");
                    sb.append(t_buscvideo.this.f8860x);
                    edit.putString("idcombv" + i + "_" + t_buscvideo.this.f8860x, sharedPreferences.getString(sb.toString(), ""));
                    edit.putString("combv" + i + "_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_" + t_buscvideo.this.f8860x, ""));
                    edit.putString("combv" + i + "_fcrea_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_fcrea_" + t_buscvideo.this.f8860x, ""));
                    edit.putString("combv" + i + "_idusucrea_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_idusucrea_" + t_buscvideo.this.f8860x, ""));
                    edit.putString("combv" + i + "_nombre_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_nombre_" + t_buscvideo.this.f8860x, ""));
                    edit.putString("combv" + i + "_vfoto_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_vfoto_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("combv" + i + "_privados_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_privados_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("combv" + i + "_fnacd_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_fnacd_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("combv" + i + "_fnacm_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_fnacm_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("combv" + i + "_fnaca_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_fnaca_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("combv" + i + "_sexo_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_sexo_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("combv" + i + "_coments_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8832P.getString("combv" + i2 + "_coments_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION));
                }
                edit.putString("idcombv0_" + t_buscvideo.this.f8860x, substring);
                edit.putString("combv0_" + t_buscvideo.this.f8860x, this.f8904a);
                edit.putString("combv0_fcrea_" + t_buscvideo.this.f8860x, v);
                edit.putString("combv0_idusucrea_" + t_buscvideo.this.f8860x, t_buscvideo.this.f8848o + "");
                edit.putString("combv0_nombre_" + t_buscvideo.this.f8860x, t_buscvideo.this.getResources().getString(R.string.tu));
                edit.putString("combv0_vfoto_" + t_buscvideo.this.f8860x, SessionDescription.SUPPORTED_SDP_VERSION);
                edit.commit();
                try {
                    t_buscvideo.this.findViewById(R.id.sc_pro).post(new C2170a());
                } catch (Exception unused2) {
                }
            } else if (str2.indexOf("ANDROID:KO MOTIVO:NOADMITE") != -1) {
                AlertDialog create = builder.setCancelable(false).setPositiveButton(t_buscvideo.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.noadmitecoments).create();
                if (!t_buscvideo.this.f6656b.equals("")) {
                    create.setOnShowListener(new C2171b(create));
                }
                create.show();
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                AlertDialog create2 = builder.setCancelable(false).setPositiveButton(t_buscvideo.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.error_http).create();
                if (!t_buscvideo.this.f6656b.equals("")) {
                    create2.setOnShowListener(new C2172c(create2));
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }
    }

    /* renamed from: british.xnews2.t_buscvideo$z */
    private class C2173z extends AsyncTask<String, Void, String> {
        private C2173z() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/like_buscvideo.php?idusu=" + t_buscvideo.this.f8848o + "&c=" + t_buscvideo.this.f8858v + "&idv=" + t_buscvideo.this.f8860x + "&modo=" + t_buscvideo.this.f8861y);
                eVar.mo47986B(new C12960g(C12957d.BROWSER_COMPATIBLE));
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                hVar.mo43518a(eVar);
                return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m8624e() {
        FullscreenVideoLayout_pro fullscreenVideoLayout_pro = this.f8849o0;
        fullscreenVideoLayout_pro.f6707w = false;
        this.f8845m0 = false;
        fullscreenVideoLayout_pro.mo7161r(false, this.f8844m.f7231O1[this.f8851p0].f7862I);
        FullscreenVideoLayout_pro fullscreenVideoLayout_pro2 = this.f8849o0;
        boolean z = this.f8845m0;
        fullscreenVideoLayout_pro2.f6706K = z;
        if (z) {
            fullscreenVideoLayout_pro2.mo7160q();
        }
        this.f8849o0.setOnPreparedListener(new C2158o());
        this.f8849o0.setOnErrorListener(new C2159p());
        try {
            this.f8849o0.mo7203k(Uri.parse(this.f8846n.getString("url")), "Android Vinebre Software");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private void m8625f(Context context) {
        this.f6662h = new C2149h(context);
    }

    /* renamed from: g */
    private void m8626g(boolean z) {
        String trim = ((TextView) findViewById(R.id.et_coment_self)).getText().toString().replace("@", "").trim();
        if (!trim.equals("")) {
            ((TextView) findViewById(R.id.et_coment_self)).setTextColor(-7829368);
            this.f8831O.setVisibility(0);
            C2169y yVar = this.f8837U;
            if (yVar == null || yVar.getStatus() != AsyncTask.Status.RUNNING) {
                C2169y yVar2 = new C2169y(trim);
                this.f8837U = yVar2;
                yVar2.execute(new String[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m8627l() {
        TextView textView = (TextView) findViewById(R.id.tv_likes_n);
        findViewById(R.id.tv_likes_n).setBackgroundDrawable(getResources().getDrawable(R.drawable.likes_izq_p));
        textView.setTextColor(C1692config.f7101A5);
        textView.setText(this.f8859w);
        ((TextView) findViewById(R.id.tv_likes)).setText(this.f8861y.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) ? getResources().getString(R.string.tegusta) : "");
        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.tv_likes_n).setOnClickListener(this);
        findViewById(R.id.ll_likes).setVisibility(0);
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f8844m.mo7510j0(view, this);
        if (j0.f7843b) {
            this.f6657c = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", j0.f7844c);
            setResult(-1, intent);
        }
        if (j0.f7845d) {
            startActivityForResult(j0.f7842a, 0);
        } else {
            Intent intent2 = j0.f7842a;
            if (intent2 != null) {
                if (j0.f7843b) {
                    this.f6659e = false;
                    if (this.f8844m.f7427t4 != 2) {
                        intent2.putExtra("es_root", true);
                    }
                    try {
                        startActivity(j0.f7842a);
                    } catch (Exception unused) {
                    }
                } else {
                    startActivityForResult(intent2, 0);
                }
            }
        }
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void adError(String str) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
        this.f6661g.cancel();
        this.f6663i.showAd();
    }

    /* renamed from: h */
    public void mo8307h(Boolean bool) {
        Intent intent = new Intent();
        intent.putExtra("nlikesv", this.f8859w);
        intent.putExtra("liked", this.f8861y);
        intent.putExtra("idv", this.f8860x);
        if (bool.booleanValue()) {
            intent.putExtra("idusu_abrir", this.f8862z);
            intent.putExtra("nombreusu_abrir", this.f8822F);
        } else {
            intent.putExtra("idusu_abrir", "");
        }
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8308i() {
        int q0 = this.f8844m.mo7522q0(this);
        int i = this.f8844m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8843l0 = listView;
            this.f8844m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8844m.f7231O1;
                if (i3 >= lVarArr.length) {
                    break;
                }
                if (!lVarArr[i3].f7848B) {
                    findViewById(i3).setOnClickListener(this);
                    i4++;
                    if (i4 == q0) {
                        break;
                    }
                }
                i3++;
            }
            if (findViewById(R.id.idaux9999) != null && findViewById(R.id.idaux9999).getVisibility() == 0) {
                findViewById(R.id.idaux9999).setOnClickListener(this);
            }
        }
        while (true) {
            int[] iArr = this.f8844m.f7249R1;
            if (i2 < iArr.length) {
                if (iArr[i2] > 0) {
                    findViewById(iArr[i2]).setOnClickListener(this);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00a7, code lost:
        if (r6.equals(r7.toString()) != false) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02f6  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8309j(java.lang.Boolean r20, java.lang.Boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r27
            java.lang.String r5 = "layout_inflater"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.view.LayoutInflater r5 = (android.view.LayoutInflater) r5
            r6 = 2131558474(0x7f0d004a, float:1.8742265E38)
            r7 = 0
            android.view.View r5 = r5.inflate(r6, r7)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r6 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            r5.setTag(r6, r1)
            r7 = 2131362420(0x7f0a0274, float:1.834462E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r8 = 2131363150(0x7f0a054e, float:1.83461E38)
            android.view.View r8 = r5.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131363112(0x7f0a0528, float:1.8346024E38)
            android.view.View r9 = r5.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131363096(0x7f0a0518, float:1.8345991E38)
            android.view.View r10 = r5.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131362352(0x7f0a0230, float:1.8344482E38)
            android.view.View r11 = r5.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            boolean r12 = r0.f8857u
            if (r12 == 0) goto L_0x0061
            int r12 = british.xnews2.C1692config.f7101A5
            r8.setTextColor(r12)
            int r13 = british.xnews2.C1692config.f7106F5
            r9.setTextColor(r13)
            r10.setTextColor(r12)
            goto L_0x006d
        L_0x0061:
            r12 = -1
            r8.setTextColor(r12)
            int r13 = british.xnews2.C1692config.f7105E5
            r9.setTextColor(r13)
            r10.setTextColor(r12)
        L_0x006d:
            boolean r12 = r20.booleanValue()
            r13 = 0
            java.lang.String r14 = ""
            if (r12 != 0) goto L_0x00c4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r16 = r7
            long r6 = r0.f8848o
            r12.append(r6)
            r12.append(r14)
            java.lang.String r6 = r12.toString()
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x00aa
            java.lang.String r6 = r0.f8862z
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r12 = r5
            long r4 = r0.f8848o
            r7.append(r4)
            r7.append(r14)
            java.lang.String r4 = r7.toString()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x00c7
            goto L_0x00ab
        L_0x00aa:
            r12 = r5
        L_0x00ab:
            boolean r4 = r0.f8857u
            if (r4 == 0) goto L_0x00bd
            android.content.res.Resources r4 = r19.getResources()
            r5 = 2131231006(0x7f08011e, float:1.807808E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            r11.setImageDrawable(r4)
        L_0x00bd:
            r11.setOnClickListener(r0)
            r11.setVisibility(r13)
            goto L_0x00c7
        L_0x00c4:
            r12 = r5
            r16 = r7
        L_0x00c7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            long r5 = r0.f8848o
            r4.append(r5)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x00ed
            android.content.res.Resources r4 = r19.getResources()
            r5 = 2131821091(0x7f110223, float:1.9274915E38)
            java.lang.String r4 = r4.getString(r5)
            r8.setText(r4)
            goto L_0x00f0
        L_0x00ed:
            r8.setText(r3)
        L_0x00f0:
            java.lang.String r4 = british.xnews2.C1692config.m8200u(r25)
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r6 = "ddMMyyHHmm"
            r5.<init>(r6)
            r6 = 1
            java.text.DateFormat r7 = android.text.format.DateFormat.getDateFormat(r19)     // Catch:{ Exception -> 0x016c }
            java.text.DateFormat r8 = android.text.format.DateFormat.getTimeFormat(r19)     // Catch:{ Exception -> 0x016c }
            java.util.Date r4 = r5.parse(r4)     // Catch:{ Exception -> 0x016c }
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x016c }
            java.util.Calendar r11 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x016c }
            r11.setTime(r4)     // Catch:{ Exception -> 0x016c }
            int r15 = r11.get(r6)     // Catch:{ Exception -> 0x016c }
            int r13 = r5.get(r6)     // Catch:{ Exception -> 0x016c }
            java.lang.String r6 = " "
            if (r15 != r13) goto L_0x014f
            r13 = 6
            int r11 = r11.get(r13)     // Catch:{ Exception -> 0x016c }
            int r5 = r5.get(r13)     // Catch:{ Exception -> 0x016c }
            if (r11 != r5) goto L_0x014f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016c }
            r5.<init>()     // Catch:{ Exception -> 0x016c }
            android.content.res.Resources r7 = r19.getResources()     // Catch:{ Exception -> 0x016c }
            r11 = 2131820893(0x7f11015d, float:1.9274514E38)
            java.lang.String r7 = r7.getString(r11)     // Catch:{ Exception -> 0x016c }
            r5.append(r7)     // Catch:{ Exception -> 0x016c }
            r5.append(r6)     // Catch:{ Exception -> 0x016c }
            java.lang.String r4 = r8.format(r4)     // Catch:{ Exception -> 0x016c }
            r5.append(r4)     // Catch:{ Exception -> 0x016c }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x016c }
            r9.setText(r4)     // Catch:{ Exception -> 0x016c }
            goto L_0x016c
        L_0x014f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016c }
            r5.<init>()     // Catch:{ Exception -> 0x016c }
            java.lang.String r7 = r7.format(r4)     // Catch:{ Exception -> 0x016c }
            r5.append(r7)     // Catch:{ Exception -> 0x016c }
            r5.append(r6)     // Catch:{ Exception -> 0x016c }
            java.lang.String r4 = r8.format(r4)     // Catch:{ Exception -> 0x016c }
            r5.append(r4)     // Catch:{ Exception -> 0x016c }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x016c }
            r9.setText(r4)     // Catch:{ Exception -> 0x016c }
        L_0x016c:
            r4 = r26
            r10.setText(r4)
            r4 = 2131362292(0x7f0a01f4, float:1.834436E38)
            r7 = r16
            r7.setTag(r4, r2)
            int r5 = r0.f8854r
            if (r5 <= 0) goto L_0x027e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r8 = r0.f8848o
            r5.append(r8)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            boolean r5 = r2.equals(r5)
            java.lang.String r6 = "0"
            if (r5 == 0) goto L_0x01a5
            r5 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            r7.setTag(r5, r6)
            android.graphics.Bitmap r6 = r0.f8834R
            r7.setImageBitmap(r6)
            r8 = r27
            goto L_0x0285
        L_0x01a5:
            r8 = r27
            r5 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            r7.setTag(r5, r8)
            boolean r5 = r8.equals(r6)
            r6 = 2131231485(0x7f0802fd, float:1.8079052E38)
            r9 = 2131231487(0x7f0802ff, float:1.8079056E38)
            if (r5 == 0) goto L_0x01d7
            boolean r5 = r0.f8857u
            if (r5 == 0) goto L_0x01ca
            android.content.res.Resources r5 = r19.getResources()
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            r7.setImageDrawable(r5)
            goto L_0x0285
        L_0x01ca:
            android.content.res.Resources r5 = r19.getResources()
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r9)
            r7.setImageDrawable(r5)
            goto L_0x0285
        L_0x01d7:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            java.io.File r10 = r0.f8835S     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            r11.<init>()     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            java.lang.String r13 = "fperfil_"
            r11.append(r13)     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            r11.append(r2)     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            java.lang.String r13 = ".jpg"
            r11.append(r13)     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            r5.<init>(r10, r11)     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            r10.<init>()     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            r11 = 1
            r10.inJustDecodeBounds = r11     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            java.lang.String r13 = r5.getPath()     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            android.graphics.BitmapFactory.decodeFile(r13, r10)     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            android.content.res.Resources r13 = r19.getResources()     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            float r13 = r13.density     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            r16 = 1111490560(0x42400000, float:48.0)
            float r13 = r13 * r16
            r17 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r17
            int r13 = (int) r13     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            android.content.res.Resources r18 = r19.getResources()     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            android.util.DisplayMetrics r11 = r18.getDisplayMetrics()     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            float r11 = r11.density     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            float r11 = r11 * r16
            float r11 = r11 + r17
            int r11 = (int) r11     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            int r15 = r10.outWidth     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            int r10 = r10.outHeight     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            if (r15 > r13) goto L_0x0230
            if (r10 > r11) goto L_0x0230
            r16 = 1
            goto L_0x0232
        L_0x0230:
            r16 = 0
        L_0x0232:
            if (r16 != 0) goto L_0x024f
            int r10 = british.xnews2.C1692config.m8193n(r15, r10, r13, r11)     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            float r11 = (float) r15     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            float r10 = (float) r10     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            float r11 = r11 / r10
            int r10 = java.lang.Math.round(r11)     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            r11.<init>()     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            r11.inSampleSize = r10     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            java.lang.String r5 = r5.getPath()     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r5, r11)     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            goto L_0x025b
        L_0x024f:
            android.content.ContentResolver r10 = r19.getContentResolver()     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            android.net.Uri r5 = android.net.Uri.fromFile(r5)     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            android.graphics.Bitmap r5 = android.provider.MediaStore.Images.Media.getBitmap(r10, r5)     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
        L_0x025b:
            r7.setImageBitmap(r5)     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
            goto L_0x0285
        L_0x025f:
            goto L_0x0285
        L_0x0261:
            boolean r5 = r0.f8857u
            if (r5 == 0) goto L_0x0272
            android.content.res.Resources r5 = r19.getResources()
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            r7.setImageDrawable(r5)
            goto L_0x0285
        L_0x0272:
            android.content.res.Resources r5 = r19.getResources()
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r9)
            r7.setImageDrawable(r5)
            goto L_0x0285
        L_0x027e:
            r8 = r27
            r5 = 8
            r7.setVisibility(r5)
        L_0x0285:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r6 = r0.f8848o
            r5.append(r6)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x02e8
            java.lang.String r5 = "ESCOMENT"
            r6 = r12
            r6.setTag(r4, r5)
            r4 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            r6.setTag(r4, r2)
            r2 = 2131362295(0x7f0a01f7, float:1.8344367E38)
            r6.setTag(r2, r3)
            r2 = 2131362296(0x7f0a01f8, float:1.8344369E38)
            r6.setTag(r2, r8)
            r2 = 2131362297(0x7f0a01f9, float:1.834437E38)
            r3 = r28
            r6.setTag(r2, r3)
            r2 = 2131362298(0x7f0a01fa, float:1.8344373E38)
            r3 = r29
            r6.setTag(r2, r3)
            r2 = 2131362299(0x7f0a01fb, float:1.8344375E38)
            r3 = r30
            r6.setTag(r2, r3)
            r2 = 2131362300(0x7f0a01fc, float:1.8344377E38)
            r3 = r31
            r6.setTag(r2, r3)
            r2 = 2131362301(0x7f0a01fd, float:1.8344379E38)
            r3 = r32
            r6.setTag(r2, r3)
            r2 = 2131362293(0x7f0a01f5, float:1.8344362E38)
            r3 = r33
            r6.setTag(r2, r3)
            r6.setOnClickListener(r0)
            goto L_0x02e9
        L_0x02e8:
            r6 = r12
        L_0x02e9:
            boolean r2 = r21.booleanValue()
            if (r2 == 0) goto L_0x02f6
            android.widget.LinearLayout r2 = r0.f8833Q
            r3 = 0
            r2.addView(r6, r3)
            goto L_0x02fb
        L_0x02f6:
            android.widget.LinearLayout r2 = r0.f8833Q
            r2.addView(r6)
        L_0x02fb:
            r0.f8818B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideo.mo8309j(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo8310k(boolean z) {
        this.f8833Q.removeAllViews();
        int i = 0;
        while (i < 4) {
            SharedPreferences sharedPreferences = this.f8832P;
            if (!sharedPreferences.getString("idcombv" + i + "_" + this.f8860x, "").equals("")) {
                Boolean valueOf = Boolean.valueOf(z);
                Boolean bool = Boolean.FALSE;
                SharedPreferences sharedPreferences2 = this.f8832P;
                String string = sharedPreferences2.getString("idcombv" + i + "_" + this.f8860x, "");
                SharedPreferences sharedPreferences3 = this.f8832P;
                String string2 = sharedPreferences3.getString("combv" + i + "_idusucrea_" + this.f8860x, "");
                SharedPreferences sharedPreferences4 = this.f8832P;
                String string3 = sharedPreferences4.getString("combv" + i + "_nombre_" + this.f8860x, "");
                SharedPreferences sharedPreferences5 = this.f8832P;
                String string4 = sharedPreferences5.getString("combv" + i + "_fcrea_" + this.f8860x, "");
                SharedPreferences sharedPreferences6 = this.f8832P;
                String string5 = sharedPreferences6.getString("combv" + i + "_" + this.f8860x, "");
                SharedPreferences sharedPreferences7 = this.f8832P;
                String string6 = sharedPreferences7.getString("combv" + i + "_vfoto_" + this.f8860x, "");
                SharedPreferences sharedPreferences8 = this.f8832P;
                String string7 = sharedPreferences8.getString("combv" + i + "_privados_" + this.f8860x, "");
                SharedPreferences sharedPreferences9 = this.f8832P;
                String string8 = sharedPreferences9.getString("combv" + i + "_fnacd_" + this.f8860x, "");
                SharedPreferences sharedPreferences10 = this.f8832P;
                String string9 = sharedPreferences10.getString("combv" + i + "_fnacm_" + this.f8860x, "");
                SharedPreferences sharedPreferences11 = this.f8832P;
                String string10 = sharedPreferences11.getString("combv" + i + "_fnaca_" + this.f8860x, "");
                SharedPreferences sharedPreferences12 = this.f8832P;
                String string11 = sharedPreferences12.getString("combv" + i + "_sexo_" + this.f8860x, "");
                SharedPreferences sharedPreferences13 = this.f8832P;
                mo8309j(valueOf, bool, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, sharedPreferences13.getString("combv" + i + "_coments_" + this.f8860x, ""));
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (intent == null || !intent.hasExtra("finalizar")) {
            if (intent != null && intent.hasExtra("accion_usu_fav_id")) {
                for (int i3 = 0; i3 < this.f8838V.size(); i3++) {
                    if (this.f8838V.get(i3).f7712f.equals(intent.getStringExtra("accion_usu_fav_id"))) {
                        this.f8838V.get(i3).f7710d = intent.getBooleanExtra("accion_usu_fav_accion", false);
                        this.f8839W.notifyDataSetChanged();
                        return;
                    }
                }
            }
        } else if (intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f6659e = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f8856t) {
            abrir_secc(this.f6660f);
        }
    }

    public void onAdLoaded(C3371Ad ad) {
        this.f6661g.cancel();
        this.f6664j.show();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onBackPressed() {
        if (this.f8849o0.mo7195c()) {
            this.f8849o0.setFullscreen(false);
        } else if (!this.f6659e || this.f8847n0 || !this.f8844m.f7365k5) {
            mo8307h(Boolean.FALSE);
            super.onBackPressed();
        } else {
            this.f8847n0 = true;
            C1692config.m8199t(this);
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        View view2 = view;
        if (view.getId() == R.id.iv_enviarcoment) {
            m8626g(false);
        } else if (view.getId() == R.id.iv_elimcoment) {
            View view3 = (View) view.getParent().getParent();
            String str10 = (String) view3.getTag(R.id.idaux2);
            if (str10 != null) {
                AlertDialog create = new AlertDialog.Builder(this).setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.si, new C2160q(view3, str10)).setMessage(R.string.confirmar_elimcoment).create();
                if (!this.f6656b.equals("")) {
                    create.setOnShowListener(new C2161r(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            }
        } else if (view.getId() == R.id.iv_mascoments) {
            new C2164t(false).execute(new String[0]);
        } else if (view.getId() == R.id.rl_playlist) {
            mo8307h(Boolean.TRUE);
        } else {
            String str11 = "";
            String str12 = "p_sexo";
            if (view.getId() == R.id.videoUser || view.getId() == R.id.tv_nombre) {
                String str13 = str12;
                Intent intent = new Intent(this, profile.class);
                StringBuilder sb = new StringBuilder();
                String str14 = "p_fnac";
                sb.append(this.f8862z);
                sb.append(str11);
                intent.putExtra(TtmlNode.ATTR_ID, sb.toString());
                intent.putExtra("privados", this.f8829M);
                intent.putExtra("nombre", this.f8822F);
                intent.putExtra("coments", this.f8824H);
                intent.putExtra("fnac_d", this.f8825I);
                intent.putExtra("fnac_m", this.f8826J);
                intent.putExtra("fnac_a", this.f8827K);
                intent.putExtra("sexo", this.f8828L);
                intent.putExtra("vfoto", this.f8830N);
                if (this.f8846n.containsKey("desdepriv")) {
                    intent.putExtra("desdepriv", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                }
                intent.putExtra(str14, this.f8844m.f7231O1[this.f8851p0].f7851C0);
                intent.putExtra(str13, this.f8844m.f7231O1[this.f8851p0].f7853D0);
                intent.putExtra("p_descr", this.f8844m.f7231O1[this.f8851p0].f7855E0);
                intent.putExtra("p_dist", this.f8844m.f7231O1[this.f8851p0].f7857F0);
                intent.putExtra("coments_chat", this.f8844m.f7231O1[this.f8851p0].f7886U);
                intent.putExtra("galeria", this.f8844m.f7231O1[this.f8851p0].f7888V);
                intent.putExtra("privados_chat", this.f8844m.f7231O1[this.f8851p0].f7884T);
                intent.putExtra("fotos_perfil", this.f8854r);
                intent.putExtra("fotos_chat", 1);
                startActivityForResult(intent, 0);
            } else if (view2.getTag(R.id.idaux1) != null && view2.getTag(R.id.idaux1).equals("ESCOMENT")) {
                Intent intent2 = new Intent(this, profile.class);
                intent2.putExtra(TtmlNode.ATTR_ID, (String) view2.getTag(R.id.idaux2));
                intent2.putExtra("privados", (String) view2.getTag(R.id.idaux5));
                intent2.putExtra("nombre", (String) view2.getTag(R.id.idaux3));
                intent2.putExtra("coments", (String) view2.getTag(R.id.idaux10));
                intent2.putExtra("fnac_d", (String) view2.getTag(R.id.idaux6));
                intent2.putExtra("fnac_m", (String) view2.getTag(R.id.idaux7));
                intent2.putExtra("fnac_a", (String) view2.getTag(R.id.idaux8));
                intent2.putExtra("sexo", (String) view2.getTag(R.id.idaux9));
                intent2.putExtra("vfoto", (String) view2.getTag(R.id.idaux4));
                if (this.f8846n.containsKey("desdepriv")) {
                    intent2.putExtra("desdepriv", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                }
                intent2.putExtra("p_fnac", this.f8844m.f7231O1[this.f8851p0].f7851C0);
                intent2.putExtra(str12, this.f8844m.f7231O1[this.f8851p0].f7853D0);
                intent2.putExtra("p_descr", this.f8844m.f7231O1[this.f8851p0].f7855E0);
                intent2.putExtra("p_dist", this.f8844m.f7231O1[this.f8851p0].f7857F0);
                intent2.putExtra("coments_chat", this.f8844m.f7231O1[this.f8851p0].f7886U);
                intent2.putExtra("galeria", this.f8844m.f7231O1[this.f8851p0].f7888V);
                intent2.putExtra("privados_chat", this.f8844m.f7231O1[this.f8851p0].f7884T);
                intent2.putExtra("fotos_perfil", this.f8854r);
                intent2.putExtra("fotos_chat", 1);
                startActivityForResult(intent2, 0);
            } else if (view.getId() == R.id.tv_likes_n) {
                if (!this.f8859w.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                    this.f8841Y = new AlertDialog.Builder(this);
                    View inflate = getLayoutInflater().inflate(R.layout.likes_list, (ViewGroup) null);
                    this.f8842Z = inflate;
                    if (Build.VERSION.SDK_INT > 20) {
                        C1692config.m8168S0((ProgressBar) inflate.findViewById(R.id.likes_pb), this.f6656b);
                    }
                    this.f8841Y.setView(this.f8842Z);
                    this.f8841Y.setCancelable(true);
                    ListView listView = (ListView) this.f8842Z.findViewById(R.id.lv);
                    listView.setCacheColorHint(0);
                    C1770e0 e0Var = new C1770e0(this, R.layout.likes_item, this.f8838V, this.f8848o);
                    this.f8839W = e0Var;
                    listView.setAdapter(e0Var);
                    listView.setOnItemClickListener(new C2140a());
                    this.f8841Y.show();
                    if (this.f8838V.size() == 0) {
                        C2166v vVar = this.f8840X;
                        if (vVar == null || vVar.getStatus() != AsyncTask.Status.RUNNING) {
                            C2166v vVar2 = new C2166v();
                            this.f8840X = vVar2;
                            vVar2.execute(new String[0]);
                        }
                    }
                }
            } else if (view.getId() == R.id.iv_like) {
                if (this.f8861y.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Integer.parseInt(this.f8859w) + 1);
                    str9 = str11;
                    sb2.append(str9);
                    this.f8859w = sb2.toString();
                    this.f8861y = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    String str15 = this.f8862z;
                    if (!str15.equals(this.f8848o + str9)) {
                        SharedPreferences sharedPreferences = this.f8832P;
                        if (!sharedPreferences.contains("usufav_" + this.f8862z)) {
                            SharedPreferences sharedPreferences2 = this.f8832P;
                            if (!sharedPreferences2.contains("usufav_noactivar_" + this.f8862z)) {
                                SharedPreferences.Editor edit = this.f8832P.edit();
                                edit.putBoolean("usufav_" + this.f8862z, true);
                                edit.commit();
                            }
                        }
                    }
                    if (this.f8838V.size() > 0) {
                        String str16 = this.f8838V.get(0).f7712f;
                        if (!str16.equals(this.f8848o + str9)) {
                            C1789f0 f0Var = new C1789f0();
                            f0Var.f7712f = this.f8848o + str9;
                            f0Var.f7711e = getResources().getString(R.string.tu);
                            f0Var.f7708b = this.f8844m.mo7516l0(this, 1).exists();
                            this.f8838V.add(0, f0Var);
                            this.f8839W.notifyDataSetChanged();
                        }
                    }
                } else {
                    str9 = str11;
                    this.f8859w = (Integer.parseInt(this.f8859w) - 1) + str9;
                    this.f8861y = SessionDescription.SUPPORTED_SDP_VERSION;
                    if (this.f8838V.size() > 0) {
                        String str17 = this.f8838V.get(0).f7712f;
                        if (str17.equals(this.f8848o + str9)) {
                            this.f8838V.remove(0);
                            this.f8839W.notifyDataSetChanged();
                        }
                    }
                }
                ((TextView) findViewById(R.id.tv_likes_n)).setText(this.f8859w);
                ((TextView) findViewById(R.id.tv_likes)).setText(this.f8861y.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) ? getResources().getString(R.string.tegusta) : str9);
                new C2173z().execute(new String[0]);
            } else {
                String str18 = str11;
                if (view.getId() == R.id.iv_reportar) {
                    AlertDialog create2 = new AlertDialog.Builder(this).setNegativeButton(R.string.cancelar, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.aceptar, new C2142b()).setMessage(R.string.confirmar_reportarvideo).create();
                    if (!this.f6656b.equals(str18)) {
                        create2.setOnShowListener(new C2144c(create2));
                    }
                    create2.show();
                    ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } else if (view.getId() == R.id.iv_elim) {
                    AlertDialog create3 = new AlertDialog.Builder(this).setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.si, new C2145d()).setMessage(R.string.confirmar_elimvideo).create();
                    if (!this.f6656b.equals(str18)) {
                        create3.setOnShowListener(new C2146e(create3));
                    }
                    create3.show();
                    ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } else {
                    String str19 = this.f8844m.f7251R3;
                    if ((str19 == null || str19.equals(str18)) && (((str = this.f8844m.f7281W3) == null || str.equals(str18)) && (((str2 = this.f8844m.f7250R2) == null || str2.equals(str18)) && (((str3 = this.f8844m.f7245Q3) == null || str3.equals(str18)) && (((str4 = this.f8844m.f7269U3) == null || str4.equals(str18)) && (((str5 = this.f8844m.f7275V3) == null || str5.equals(str18)) && (((str6 = this.f8844m.f7358j4) == null || str6.equals(str18)) && (((str7 = this.f8844m.f7287X3) == null || str7.equals(str18)) && ((str8 = this.f8844m.f7293Y3) == null || str8.equals(str18)))))))))) {
                        abrir_secc(view);
                        return;
                    }
                    String str20 = this.f8844m.f7251R3;
                    if (str20 != null && !str20.equals(str18)) {
                        this.f6663i = new RewardedVideo((Context) this, this.f8844m.f7251R3);
                    }
                    String str21 = this.f8844m.f7245Q3;
                    if (str21 != null) {
                        str21.equals(str18);
                    }
                    String str22 = this.f8844m.f7269U3;
                    if (str22 != null && !str22.equals(str18)) {
                        this.f6664j = new RewardedVideoAd(this, this.f8844m.f7269U3);
                    }
                    String str23 = this.f8844m.f7275V3;
                    if (str23 != null && !str23.equals(str18)) {
                        this.f6665k = new StartAppAd(this);
                    }
                    ProgressDialog progressDialog = new ProgressDialog(this);
                    this.f6661g = progressDialog;
                    this.f6660f = view2;
                    if (!this.f8844m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                        abrir_secc(view);
                    }
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8308i();
        if (this.f8844m.f7427t4 == 1) {
            ((ImageView) findViewById(R.id.iv_drawer)).setOnClickListener(new C2147f());
            ((ImageView) findViewById(R.id.icohome)).setOnClickListener(new C2148g());
        }
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f8855s;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f8855s;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f8855s = this.f8844m.mo7474A0(this, false);
        if (configuration.orientation == 2) {
            if (!this.f8849o0.mo7195c()) {
                this.f8849o0.setFullscreen(true);
            } else {
                this.f8849o0.mo7201i();
            }
        } else if (this.f8849o0.mo7195c()) {
            this.f8849o0.setFullscreen(false);
        } else {
            this.f8849o0.mo7201i();
        }
    }

    @TargetApi(14)
    public void onCreate(Bundle bundle) {
        C1692config config;
        int i;
        int i2;
        Bitmap bitmap;
        Bundle bundle2 = bundle;
        C1692config config2 = (C1692config) getApplicationContext();
        this.f8844m = config2;
        if (config2.f7313c1 == null) {
            config2.mo7490V0();
        }
        m8625f(this);
        this.f6666l = new C2153j();
        Bundle extras = getIntent().getExtras();
        this.f8846n = extras;
        C1692config config3 = this.f8844m;
        this.f8819C = config3.f7313c1;
        this.f8820D = config3.f7319d1;
        int i3 = config3.f7318d;
        if (i3 != -1) {
            C1855l[] lVarArr = config3.f7231O1;
            this.f8819C = lVarArr[i3].f7916g;
            this.f8820D = lVarArr[i3].f7919h;
        }
        if (extras.containsKey("bg1")) {
            this.f8819C = this.f8846n.getString("bg1");
            this.f8820D = this.f8846n.getString("bg2");
        }
        this.f8857u = true;
        if (bundle2 == null) {
            Bundle bundle3 = this.f8846n;
            this.f6659e = bundle3 != null && bundle3.containsKey("es_root") && this.f8846n.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle2.containsKey("es_root") && bundle2.getBoolean("es_root", false);
        }
        int i4 = this.f8846n.getInt("ind");
        this.f8851p0 = i4;
        C1692config config4 = this.f8844m;
        this.f8854r = config4.f7231O1[i4].f7849B0;
        this.f6656b = C1692config.m8189h(this.f8819C, config4.f7368l1);
        this.f8817A = C1692config.m8189h("FFE0E0E0", this.f8844m.f7368l1);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 12) {
            if (!C1692config.m8153I("#" + this.f8819C)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_buscvideo);
        mo8308i();
        this.f8844m.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2154k());
        searchManager.setOnDismissListener(new C2155l());
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f8832P = sharedPreferences;
        this.f8848o = sharedPreferences.getLong("idusu", 0);
        this.f8858v = this.f8832P.getString("cod", "");
        this.f8859w = this.f8846n.getString("nlikes");
        this.f8861y = this.f8846n.getString("liked");
        m8627l();
        this.f8860x = this.f8846n.getString("idv");
        this.f8850p = this.f8846n.getInt("indv");
        this.f8862z = this.f8846n.getString("idusuv");
        this.f8821E = this.f8846n.getString("descr");
        this.f8822F = this.f8846n.getString("nombre");
        this.f8823G = this.f8846n.getString("fcrea");
        this.f8830N = this.f8846n.getString("vfoto");
        this.f8824H = this.f8846n.getString("coments");
        this.f8825I = this.f8846n.getString("fnac_d");
        this.f8826J = this.f8846n.getString("fnac_m");
        this.f8827K = this.f8846n.getString("fnac_a");
        this.f8829M = this.f8846n.getString("privados");
        this.f8828L = this.f8846n.getString("sexo");
        this.f8835S = getFilesDir();
        this.f8838V = new ArrayList<>();
        this.f8831O = (ProgressBar) findViewById(R.id.pb_chat_env_inv);
        if (!this.f8857u && i5 > 12) {
            this.f8831O = (ProgressBar) findViewById(R.id.pb_chat_env);
        }
        if (this.f8862z.equals(this.f8848o + "")) {
            findViewById(R.id.iv_reportar).setVisibility(8);
            findViewById(R.id.iv_elim).setOnClickListener(this);
            findViewById(R.id.iv_elim).setVisibility(0);
        } else {
            findViewById(R.id.iv_reportar).setOnClickListener(this);
        }
        this.f8849o0 = (FullscreenVideoLayout_pro) findViewById(R.id.vv);
        if (this.f8822F.equals("") || this.f8854r == 0) {
            findViewById(R.id.videoUser).setVisibility(8);
        } else {
            File file = new File(this.f8835S, "fperfil_" + this.f8862z + ".jpg");
            if (this.f8830N.equals(SessionDescription.SUPPORTED_SDP_VERSION) || !file.exists()) {
                bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto);
            } else {
                try {
                    bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(file));
                } catch (IOException unused) {
                    bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto);
                }
            }
            ((ImageView) findViewById(R.id.videoUser)).setImageBitmap(C1692config.m8188g0(bitmap, 1));
        }
        if (!this.f8821E.equals("") || !this.f8822F.equals("") || !this.f8823G.equals("")) {
            this.f8849o0.f6761p = true;
            findViewById(R.id.ll_descr).setVisibility(0);
            if (!this.f8821E.equals("")) {
                ((TextView) findViewById(R.id.tv_descr)).setText(this.f8821E);
                findViewById(R.id.tv_descr).setVisibility(0);
            }
            if (!this.f8822F.equals("") || !this.f8823G.equals("")) {
                String str = this.f8822F;
                if (!this.f8823G.equals("")) {
                    if (!str.equals("")) {
                        str = str + ", ";
                    }
                    str = str + this.f8823G;
                }
                ((TextView) findViewById(R.id.tv_nombre)).setText(str);
                if (!this.f8822F.equals("")) {
                    int parseInt = Integer.parseInt(this.f8846n.getString("nvideos", SessionDescription.SUPPORTED_SDP_VERSION));
                    if (this.f8844m.f7231O1[this.f8851p0].f7955t0 && !this.f8846n.getBoolean("desde_videosdeusu", false) && parseInt > 0) {
                        int E = C1692config.m8149E(this, 3);
                        if (parseInt < 10) {
                            i2 = C1692config.m8149E(this, 8);
                        } else {
                            i2 = C1692config.m8149E(this, 4);
                        }
                        TextView textView = (TextView) findViewById(R.id.playlist_badge);
                        textView.setPadding(i2, E, i2, E);
                        textView.setText("" + parseInt);
                        findViewById(R.id.rl_playlist).setOnClickListener(this);
                        findViewById(R.id.rl_playlist).setVisibility(0);
                    }
                    if (!this.f8862z.equals(this.f8848o + "")) {
                        findViewById(R.id.videoUser).setOnClickListener(this);
                        findViewById(R.id.tv_nombre).setOnClickListener(this);
                    }
                }
            } else {
                findViewById(R.id.tv_nombre).setVisibility(8);
            }
        } else {
            this.f8849o0.f6761p = false;
        }
        if (this.f8844m.f7427t4 == 1) {
            ((ImageView) findViewById(R.id.iv_drawer)).setOnClickListener(new C2156m());
            ((ImageView) findViewById(R.id.icohome)).setOnClickListener(new C2157n());
        }
        this.f8855s = this.f8844m.mo7474A0(this, false);
        if (!this.f8819C.equals("")) {
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#" + this.f8819C), Color.parseColor("#" + this.f8820D)}));
        }
        if (Build.VERSION.SDK_INT > 20) {
            C1692config.m8168S0((ProgressBar) findViewById(R.id.pb_mascoments), this.f8817A);
            C1692config.m8168S0((ProgressBar) findViewById(R.id.pb_mascoments_inv), this.f8817A);
            C1692config.m8168S0((ProgressBar) findViewById(R.id.pb_chat_env), this.f8817A);
            C1692config.m8168S0((ProgressBar) findViewById(R.id.pb_chat_env_inv), this.f8817A);
        }
        if (this.f8857u) {
            this.f8834R = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto);
        } else {
            this.f8834R = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto_light);
        }
        if (this.f8854r > 0) {
            File l0 = this.f8844m.mo7516l0(this, 1);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(l0.getPath(), options);
                int i6 = options.outWidth;
                int i7 = options.outHeight;
                if (!(i6 <= 75 && i7 <= 100)) {
                    int round = Math.round(((float) i6) / ((float) C1692config.m8193n(i6, i7, 75, 100)));
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = round;
                    this.f8834R = BitmapFactory.decodeFile(l0.getPath(), options2);
                } else {
                    this.f8834R = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(l0));
                }
            } catch (Exception | OutOfMemoryError unused2) {
            }
        } else {
            findViewById(R.id.iv_usucoment_self).setVisibility(8);
        }
        this.f8833Q = (LinearLayout) findViewById(R.id.ll_coments);
        if (this.f8844m.f7231O1[this.f8851p0].f7944p0 == 1) {
            this.f8849o0.f6760o = true;
            int i8 = -16777216;
            if (!this.f8857u) {
                i8 = -1;
            }
            ((TextView) findViewById(R.id.tv_coments)).setTextColor(i8);
            if (C1692config.m8153I("#" + this.f8817A)) {
                findViewById(R.id.iv_enviarcom_fondo_n).setVisibility(0);
            } else {
                findViewById(R.id.iv_enviarcom_fondo_b).setVisibility(0);
            }
            Drawable drawable = getResources().getDrawable(R.drawable.btn_enviar);
            if (!this.f8817A.equals("")) {
                drawable.setColorFilter(Color.parseColor("#" + this.f8817A), PorterDuff.Mode.MULTIPLY);
            }
            ((ImageView) findViewById(R.id.iv_enviarcoment)).setImageDrawable(drawable);
            if (C1692config.m8153I("#" + this.f8817A)) {
                findViewById(R.id.iv_mascoments_fondo_n).setVisibility(0);
            } else {
                findViewById(R.id.iv_mascoments_fondo_b).setVisibility(0);
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.mas_btn);
            if (!this.f8817A.equals("")) {
                drawable2.setColorFilter(Color.parseColor("#" + this.f8817A), PorterDuff.Mode.MULTIPLY);
            }
            ((ImageView) findViewById(R.id.iv_mascoments)).setImageDrawable(drawable2);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 > 20) {
                C1692config.m8150F((EditText) findViewById(R.id.et_coment_self), Boolean.valueOf(!this.f8857u), this.f8817A);
            } else if (i9 > 12) {
                ((EditText) findViewById(R.id.et_coment_self)).setTextColor(i8);
            }
            findViewById(R.id.iv_enviarcoment).setOnClickListener(this);
            findViewById(R.id.iv_mascoments).setOnClickListener(this);
            ((ImageView) findViewById(R.id.iv_usucoment_self)).setImageBitmap(this.f8834R);
            mo8310k(true);
            new C2164t(true).execute(new String[0]);
        } else {
            this.f8849o0.f6760o = false;
            findViewById(R.id.tv_coments).setVisibility(8);
            findViewById(R.id.rl_enviarcoment).setVisibility(8);
            findViewById(R.id.ll_coments).setVisibility(8);
            new C2143b0().execute(new String[0]);
        }
        if (this.f8857u) {
            ((TextView) findViewById(R.id.tv_tu)).setTextColor(C1692config.f7101A5);
        } else {
            ((TextView) findViewById(R.id.tv_tu)).setTextColor(-1);
        }
        if (this.f8862z.equals(this.f8848o + "")) {
            m8624e();
            return;
        }
        SharedPreferences sharedPreferences2 = getSharedPreferences("sh", 0);
        int i10 = sharedPreferences2.getInt("appnext_video_n", 0) + 1;
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.putInt("appnext_video_n", i10);
        edit.commit();
        if (this.f8844m.f7274V2.equals("") || i10 < (i = config.f7286X2) || (i10 - i) % (config = this.f8844m).f7280W2 != 0) {
            m8624e();
            return;
        }
        this.f8849o0.f6707w = true;
        new C2162s().execute(new String[0]);
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f8844m.f7384n3 == 0 || (cVar3 = this.f8855s) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f8844m.f7384n3 == 0 || (cVar2 = this.f8855s) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f8844m.f7384n3 == 0 || (cVar = this.f8855s) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
        }
        if ((this.f6659e && isFinishing()) || C1692config.f7111K5) {
            C1692config.m8176Z(this);
        }
        super.onDestroy();
    }

    public void onError(C3371Ad ad, com.facebook.ads.AdError adError) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f8844m.f7384n3 == 0 || (cVar = this.f8855s) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
        this.f8853q0 = this.f8849o0.getCurrentPosition();
        this.f8849o0.mo7146e();
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2152i());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        FullscreenVideoLayout_pro fullscreenVideoLayout_pro = this.f8849o0;
        if (fullscreenVideoLayout_pro != null && fullscreenVideoLayout_pro.f6751f) {
            fullscreenVideoLayout_pro.mo7202j(this.f8853q0);
            this.f8849o0.mo7149l();
        }
        if (this.f8844m.f7384n3 != 0 && (cVar = this.f8855s) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f8856t = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f8856t) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f8856t = true;
        C1692config.m8175Y0(this);
    }

    public boolean onSearchRequested() {
        this.f6657c = true;
        this.f6658d = true;
        return super.onSearchRequested();
    }

    public void onStop() {
        super.onStop();
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f8856t = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f8856t = true;
        C1692config.m8175Y0(this);
    }
}
