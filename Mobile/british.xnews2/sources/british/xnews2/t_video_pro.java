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

public class t_video_pro extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    String f10189A;

    /* renamed from: B */
    String f10190B;

    /* renamed from: C */
    String f10191C;

    /* renamed from: D */
    ProgressBar f10192D;

    /* renamed from: E */
    SharedPreferences f10193E;

    /* renamed from: F */
    LinearLayout f10194F;

    /* renamed from: G */
    Bitmap f10195G;

    /* renamed from: H */
    File f10196H;

    /* renamed from: I */
    C2567u f10197I;

    /* renamed from: J */
    C2571y f10198J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public ArrayList<C1789f0> f10199K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C1770e0 f10200L;

    /* renamed from: M */
    C2568v f10201M;

    /* renamed from: N */
    AlertDialog.Builder f10202N;

    /* renamed from: O */
    View f10203O;

    /* renamed from: P */
    ListView f10204P;

    /* renamed from: Q */
    boolean f10205Q = false;

    /* renamed from: R */
    boolean f10206R = false;

    /* renamed from: S */
    FullscreenVideoLayout_pro f10207S;

    /* renamed from: T */
    int f10208T = 0;

    /* renamed from: m */
    C1692config f10209m;

    /* renamed from: n */
    Bundle f10210n;

    /* renamed from: o */
    long f10211o;

    /* renamed from: p */
    int f10212p;

    /* renamed from: q */
    int f10213q = 0;

    /* renamed from: r */
    int f10214r;

    /* renamed from: s */
    C1603c f10215s;

    /* renamed from: t */
    boolean f10216t = false;

    /* renamed from: u */
    boolean f10217u;

    /* renamed from: v */
    String f10218v;

    /* renamed from: w */
    String f10219w;

    /* renamed from: x */
    String f10220x;

    /* renamed from: y */
    String f10221y;

    /* renamed from: z */
    String f10222z;

    /* renamed from: british.xnews2.t_video_pro$a */
    class C2542a implements AdapterView.OnItemClickListener {
        C2542a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1789f0 f0Var = (C1789f0) t_video_pro.this.f10199K.get(i);
            if (f0Var.f7709c) {
                C2568v vVar = t_video_pro.this.f10201M;
                if (vVar == null || vVar.getStatus() != AsyncTask.Status.RUNNING) {
                    t_video_pro.this.f10201M = new C2568v();
                    t_video_pro.this.f10201M.execute(new String[0]);
                    return;
                }
                return;
            }
            String str = f0Var.f7712f;
            if (!str.equals(t_video_pro.this.f10211o + "")) {
                String str2 = f0Var.f7712f;
                if (!str2.equals(t_video_pro.this.f10222z + "")) {
                    Intent intent = new Intent(t_video_pro.this, profile.class);
                    intent.putExtra(TtmlNode.ATTR_ID, f0Var.f7712f);
                    intent.putExtra("privados", f0Var.f7714h);
                    intent.putExtra("nombre", f0Var.f7711e);
                    intent.putExtra("coments", f0Var.f7716j);
                    intent.putExtra("fnac_d", f0Var.f7717k);
                    intent.putExtra("fnac_m", f0Var.f7718l);
                    intent.putExtra("fnac_a", f0Var.f7719m);
                    intent.putExtra("sexo", f0Var.f7715i);
                    intent.putExtra("vfoto", f0Var.f7713g);
                    if (t_video_pro.this.f10210n.containsKey("desdepriv")) {
                        intent.putExtra("desdepriv", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    }
                    intent.putExtra("p_fnac", t_video_pro.this.f10210n.getInt("p_fnac"));
                    intent.putExtra("p_sexo", t_video_pro.this.f10210n.getInt("p_sexo"));
                    intent.putExtra("p_descr", t_video_pro.this.f10210n.getInt("p_descr"));
                    intent.putExtra("p_dist", t_video_pro.this.f10210n.getInt("p_dist"));
                    intent.putExtra("coments_chat", t_video_pro.this.f10210n.getBoolean("coments_chat"));
                    intent.putExtra("galeria", t_video_pro.this.f10210n.getBoolean("galeria"));
                    intent.putExtra("privados_chat", t_video_pro.this.f10210n.getBoolean("privados_chat"));
                    intent.putExtra("fotos_perfil", t_video_pro.this.f10210n.getInt("fotos_perfil"));
                    intent.putExtra("fotos_chat", t_video_pro.this.f10210n.getInt("fotos_chat"));
                    t_video_pro.this.startActivityForResult(intent, 0);
                }
            }
        }
    }

    /* renamed from: british.xnews2.t_video_pro$a0 */
    private class C2543a0 extends AsyncTask<String, Void, String> {
        private C2543a0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/reportar_videogal.php?idusu=" + t_video_pro.this.f10211o + "&c=" + t_video_pro.this.f10218v + "&idusu_pro=" + t_video_pro.this.f10222z + "&idv=" + t_video_pro.this.f10220x);
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

    /* renamed from: british.xnews2.t_video_pro$b */
    class C2544b implements DialogInterface.OnClickListener {
        C2544b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            t_video_pro.this.findViewById(R.id.iv_reportar).setVisibility(8);
            t_video_pro t_video_pro = t_video_pro.this;
            C1692config.m8157K0(Toast.makeText(t_video_pro, t_video_pro.getResources().getString(R.string.enviando), 0));
            new C2543a0().execute(new String[0]);
        }
    }

    /* renamed from: british.xnews2.t_video_pro$b0 */
    private class C2545b0 extends AsyncTask<String, Void, String> {
        private C2545b0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/video_visto.php?idusu=" + t_video_pro.this.f10211o + "&c=" + t_video_pro.this.f10218v + "&idv=" + t_video_pro.this.f10220x);
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

    /* renamed from: british.xnews2.t_video_pro$c */
    class C2546c implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f10227a;

        C2546c(AlertDialog alertDialog) {
            this.f10227a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f10227a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_video_pro.this.f6656b));
            Button button2 = this.f10227a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + t_video_pro.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.t_video_pro$d */
    class C2547d implements DialogInterface.OnClickListener {
        C2547d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            t_video_pro t_video_pro = t_video_pro.this;
            new C2570x(t_video_pro.f10220x).execute(new String[0]);
            Intent intent = new Intent();
            intent.putExtra("elim_video", t_video_pro.this.f10220x);
            intent.putExtra("indv", t_video_pro.this.f10212p);
            t_video_pro.this.setResult(-1, intent);
            t_video_pro.this.finish();
        }
    }

    /* renamed from: british.xnews2.t_video_pro$e */
    class C2548e implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f10230a;

        C2548e(AlertDialog alertDialog) {
            this.f10230a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f10230a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_video_pro.this.f6656b));
            Button button2 = this.f10230a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + t_video_pro.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.t_video_pro$f */
    class C2549f implements View.OnClickListener {
        C2549f() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.xnews2.t_video_pro$g */
    class C2550g implements View.OnClickListener {
        C2550g() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.xnews2.t_video_pro$h */
    class C2551h extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f10234a;

        /* renamed from: british.xnews2.t_video_pro$h$a */
        class C2552a extends FullScreenContentCallback {
            C2552a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_video_pro t_video_pro = t_video_pro.this;
                if (t_video_pro.f10216t) {
                    t_video_pro.abrir_secc(t_video_pro.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_video_pro t_video_pro = t_video_pro.this;
                t_video_pro.abrir_secc(t_video_pro.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_video_pro$h$b */
        class C2553b implements OnUserEarnedRewardListener {
            C2553b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2551h hVar = C2551h.this;
                t_video_pro.this.f10216t = true;
                C1692config.m8175Y0(hVar.f10234a);
            }
        }

        C2551h(Context context) {
            this.f10234a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_video_pro.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2552a());
            rewardedAd.show((Activity) this.f10234a, new C2553b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_video_pro t_video_pro = t_video_pro.this;
            if (!t_video_pro.f10209m.mo7502f(this.f10234a, t_video_pro.f6663i)) {
                t_video_pro.this.f6661g.cancel();
                t_video_pro t_video_pro2 = t_video_pro.this;
                t_video_pro2.abrir_secc(t_video_pro2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.t_video_pro$i */
    class C2554i implements AdDisplayListener {
        C2554i() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_video_pro t_video_pro = t_video_pro.this;
            if (t_video_pro.f10216t) {
                t_video_pro.abrir_secc(t_video_pro.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.t_video_pro$j */
    class C2555j extends AdColonyInterstitialListener {
        C2555j() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_video_pro t_video_pro = t_video_pro.this;
            if (t_video_pro.f10216t) {
                t_video_pro.abrir_secc(t_video_pro.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_video_pro.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_video_pro.this.f6661g.cancel();
            t_video_pro t_video_pro = t_video_pro.this;
            t_video_pro.abrir_secc(t_video_pro.f6660f);
        }
    }

    /* renamed from: british.xnews2.t_video_pro$k */
    class C2556k implements SearchManager.OnCancelListener {
        C2556k() {
        }

        public void onCancel() {
            t_video_pro t_video_pro = t_video_pro.this;
            t_video_pro.f6657c = false;
            t_video_pro.setResult(0);
        }
    }

    /* renamed from: british.xnews2.t_video_pro$l */
    class C2557l implements SearchManager.OnDismissListener {
        C2557l() {
        }

        public void onDismiss() {
            t_video_pro.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.t_video_pro$m */
    class C2558m implements View.OnClickListener {
        C2558m() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.xnews2.t_video_pro$n */
    class C2559n implements View.OnClickListener {
        C2559n() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.xnews2.t_video_pro$o */
    class C2560o implements MediaPlayer.OnPreparedListener {
        C2560o() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    /* renamed from: british.xnews2.t_video_pro$p */
    class C2561p implements MediaPlayer.OnErrorListener {
        C2561p() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return false;
        }
    }

    /* renamed from: british.xnews2.t_video_pro$q */
    class C2562q implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ View f10246b;

        /* renamed from: c */
        final /* synthetic */ String f10247c;

        C2562q(View view, String str) {
            this.f10246b = view;
            this.f10247c = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f10246b.setVisibility(8);
            int indexOfChild = ((LinearLayout) this.f10246b.getParent()).indexOfChild(this.f10246b);
            SharedPreferences.Editor edit = t_video_pro.this.f10193E.edit();
            while (indexOfChild < 4) {
                SharedPreferences sharedPreferences = t_video_pro.this.f10193E;
                StringBuilder sb = new StringBuilder();
                sb.append("idcomv");
                int i2 = indexOfChild + 1;
                sb.append(i2);
                sb.append("_");
                sb.append(t_video_pro.this.f10220x);
                edit.putString("idcomv" + indexOfChild + "_" + t_video_pro.this.f10220x, sharedPreferences.getString(sb.toString(), ""));
                edit.putString("comv" + indexOfChild + "_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_" + t_video_pro.this.f10220x, ""));
                edit.putString("comv" + indexOfChild + "_fcrea_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_fcrea_" + t_video_pro.this.f10220x, ""));
                edit.putString("comv" + indexOfChild + "_idusucrea_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_idusucrea_" + t_video_pro.this.f10220x, ""));
                edit.putString("comv" + indexOfChild + "_nombre_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_nombre_" + t_video_pro.this.f10220x, ""));
                edit.putString("comv" + indexOfChild + "_vfoto_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_vfoto_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("comv" + indexOfChild + "_privados_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_privados_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("comv" + indexOfChild + "_fnacd_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_fnacd_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("comv" + indexOfChild + "_fnacm_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_fnacm_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("comv" + indexOfChild + "_fnaca_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_fnaca_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("comv" + indexOfChild + "_sexo_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_sexo_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("comv" + indexOfChild + "_coments_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_coments_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                indexOfChild = i2;
            }
            edit.commit();
            new C2569w(this.f10247c).execute(new String[0]);
        }
    }

    /* renamed from: british.xnews2.t_video_pro$r */
    class C2563r implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f10249a;

        C2563r(AlertDialog alertDialog) {
            this.f10249a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f10249a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_video_pro.this.f6656b));
            Button button2 = this.f10249a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + t_video_pro.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.t_video_pro$s */
    private class C2564s extends AsyncTask<String, Void, String> {

        /* renamed from: british.xnews2.t_video_pro$s$a */
        class C2565a implements View.OnClickListener {
            C2565a() {
            }

            public void onClick(View view) {
                t_video_pro.this.findViewById(R.id.ll_btns).setVisibility(8);
                t_video_pro.this.f10207S.mo7148h();
                t_video_pro.this.m9062e();
            }
        }

        private C2564s() {
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
                british.xnews2.t_video_pro r1 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x007c }
                british.xnews2.config r1 = r1.f10209m     // Catch:{ Exception -> 0x007c }
                java.lang.String r1 = r1.f7274V2     // Catch:{ Exception -> 0x007c }
                r0.append(r1)     // Catch:{ Exception -> 0x007c }
                java.lang.String r1 = "&type=vast&vast_ver=3.0&duration=all&packageId="
                r0.append(r1)     // Catch:{ Exception -> 0x007c }
                british.xnews2.t_video_pro r1 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x007c }
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
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_video_pro.C2564s.doInBackground(java.lang.String[]):java.lang.String");
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
                british.xnews2.t_video_pro r5 = british.xnews2.t_video_pro.this
                british.xnews2.FullscreenVideoLayout_pro r5 = r5.f10207S
                java.lang.String r0 = r7.substring(r0, r4)
                r5.f6708x = r0
                java.lang.String r0 = "<ClickThrough><![CDATA["
                int r0 = r7.indexOf(r0)
                if (r0 == r2) goto L_0x0058
                int r0 = r0 + 23
                int r4 = r7.indexOf(r3, r0)
                british.xnews2.t_video_pro r5 = british.xnews2.t_video_pro.this
                british.xnews2.FullscreenVideoLayout_pro r5 = r5.f10207S
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
                british.xnews2.t_video_pro r0 = british.xnews2.t_video_pro.this
                r2 = 2131361958(0x7f0a00a6, float:1.8343683E38)
                android.view.View r0 = r0.findViewById(r2)
                british.xnews2.t_video_pro$s$a r2 = new british.xnews2.t_video_pro$s$a
                r2.<init>()
                r0.setOnClickListener(r2)
                british.xnews2.t_video_pro r0 = british.xnews2.t_video_pro.this
                british.xnews2.FullscreenVideoLayout_pro r0 = r0.f10207S
                r0.f6706K = r1
                r0.mo7159p()
                british.xnews2.t_video_pro r0 = british.xnews2.t_video_pro.this     // Catch:{ IOException -> 0x0084 }
                british.xnews2.FullscreenVideoLayout_pro r0 = r0.f10207S     // Catch:{ IOException -> 0x0084 }
                r1 = 0
                r0.mo7203k(r7, r1)     // Catch:{ IOException -> 0x0084 }
                goto L_0x008e
            L_0x0084:
                r7 = move-exception
                r7.printStackTrace()
                goto L_0x008e
            L_0x0089:
                british.xnews2.t_video_pro r7 = british.xnews2.t_video_pro.this
                r7.m9062e()
            L_0x008e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_video_pro.C2564s.onPostExecute(java.lang.String):void");
        }
    }

    /* renamed from: british.xnews2.t_video_pro$t */
    private class C2566t extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        boolean f10253a;

        C2566t(boolean z) {
            this.f10253a = z;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00bf  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                british.xnews2.t_video_pro r7 = british.xnews2.t_video_pro.this
                java.lang.String r7 = r7.f10189A
                boolean r0 = r6.f10253a
                java.lang.String r1 = "0"
                if (r0 == 0) goto L_0x000f
                java.lang.String r7 = "1"
                r5 = r1
                r1 = r7
                r7 = r5
            L_0x000f:
                r0 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bb }
                r2.<init>()     // Catch:{ Exception -> 0x00bb }
                java.lang.String r3 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x00bb }
                r2.append(r3)     // Catch:{ Exception -> 0x00bb }
                java.lang.String r3 = "/srv/coments_video.php?idusu="
                r2.append(r3)     // Catch:{ Exception -> 0x00bb }
                british.xnews2.t_video_pro r3 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x00bb }
                long r3 = r3.f10211o     // Catch:{ Exception -> 0x00bb }
                r2.append(r3)     // Catch:{ Exception -> 0x00bb }
                java.lang.String r3 = "&c="
                r2.append(r3)     // Catch:{ Exception -> 0x00bb }
                british.xnews2.t_video_pro r3 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x00bb }
                java.lang.String r3 = r3.f10218v     // Catch:{ Exception -> 0x00bb }
                r2.append(r3)     // Catch:{ Exception -> 0x00bb }
                java.lang.String r3 = "&idusu_pro="
                r2.append(r3)     // Catch:{ Exception -> 0x00bb }
                british.xnews2.t_video_pro r3 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x00bb }
                java.lang.String r3 = r3.f10222z     // Catch:{ Exception -> 0x00bb }
                r2.append(r3)     // Catch:{ Exception -> 0x00bb }
                java.lang.String r3 = "&idv="
                r2.append(r3)     // Catch:{ Exception -> 0x00bb }
                british.xnews2.t_video_pro r3 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x00bb }
                java.lang.String r3 = r3.f10220x     // Catch:{ Exception -> 0x00bb }
                r2.append(r3)     // Catch:{ Exception -> 0x00bb }
                java.lang.String r3 = "&idc="
                r2.append(r3)     // Catch:{ Exception -> 0x00bb }
                r2.append(r7)     // Catch:{ Exception -> 0x00bb }
                java.lang.String r7 = "&es_ini="
                r2.append(r7)     // Catch:{ Exception -> 0x00bb }
                r2.append(r1)     // Catch:{ Exception -> 0x00bb }
                java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x00bb }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00bb }
                r1.<init>(r7)     // Catch:{ Exception -> 0x00bb }
                java.net.URLConnection r7 = r1.openConnection()     // Catch:{ Exception -> 0x00bb }
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Exception -> 0x00bb }
                r0 = 1
                r7.setDoInput(r0)     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                r0 = 10000(0x2710, float:1.4013E-41)
                r7.setConnectTimeout(r0)     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                r7.setReadTimeout(r0)     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                java.lang.String r0 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r7.setRequestProperty(r0, r1)     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                java.io.InputStream r0 = r7.getInputStream()     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                r0.<init>()     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
            L_0x008f:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                if (r2 == 0) goto L_0x00aa
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                r3.<init>()     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                r3.append(r2)     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                r0.append(r2)     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                goto L_0x008f
            L_0x00aa:
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
                r7.disconnect()
                return r0
            L_0x00b2:
                r0 = move-exception
                goto L_0x00c3
            L_0x00b4:
                r0 = r7
                goto L_0x00bb
            L_0x00b6:
                r7 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x00c3
            L_0x00bb:
                java.lang.String r7 = ""
                if (r0 == 0) goto L_0x00c2
                r0.disconnect()
            L_0x00c2:
                return r7
            L_0x00c3:
                if (r7 == 0) goto L_0x00c8
                r7.disconnect()
            L_0x00c8:
                goto L_0x00ca
            L_0x00c9:
                throw r0
            L_0x00ca:
                goto L_0x00c9
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_video_pro.C2566t.doInBackground(java.lang.String[]):java.lang.String");
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
                t_video_pro.this.findViewById(R.id.pb_mascoments).setVisibility(8);
                t_video_pro.this.findViewById(R.id.pb_mascoments_inv).setVisibility(8);
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
                if (!this.f10253a) {
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
                        t_video_pro t_video_pro = t_video_pro.this;
                        Boolean bool = Boolean.FALSE;
                        t_video_pro.mo9151j(bool, bool, split2[0], split2[3], split2[4], split2[2], replace, split2[5], split2[6], split2[7], split2[8], split2[9], split2[10], split2[11]);
                        i3 = i + 1;
                        str19 = str2;
                        str18 = str22;
                    }
                } else {
                    SharedPreferences.Editor edit = t_video_pro.this.f10193E.edit();
                    int i4 = 0;
                    while (true) {
                        str3 = "_sexo_";
                        str4 = "_fnaca_";
                        str5 = "_fnacm_";
                        str6 = str14;
                        str7 = "_fcrea_";
                        str8 = str17;
                        str9 = "idcomv";
                        str10 = str15;
                        str11 = "_";
                        str12 = str16;
                        strArr = split;
                        if (i4 >= 4) {
                            break;
                        }
                        edit.remove(str9 + i4 + str11 + t_video_pro.this.f10220x);
                        edit.remove("comv" + i4 + str11 + t_video_pro.this.f10220x);
                        edit.remove("comv" + i4 + str7 + t_video_pro.this.f10220x);
                        edit.remove("comv" + i4 + "_idusucrea_" + t_video_pro.this.f10220x);
                        edit.remove("comv" + i4 + "_nombre_" + t_video_pro.this.f10220x);
                        edit.remove("comv" + i4 + "_vfoto_" + t_video_pro.this.f10220x);
                        edit.remove("comv" + i4 + "_privados_" + t_video_pro.this.f10220x);
                        edit.remove("comv" + i4 + "_fnacd_" + t_video_pro.this.f10220x);
                        edit.remove("comv" + i4 + str5 + t_video_pro.this.f10220x);
                        edit.remove("comv" + i4 + str4 + t_video_pro.this.f10220x);
                        edit.remove("comv" + i4 + str3 + t_video_pro.this.f10220x);
                        edit.remove("comv" + i4 + "_coments_" + t_video_pro.this.f10220x);
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
                        sb.append(t_video_pro.this.f10220x);
                        String str29 = str5;
                        edit.putString(sb.toString(), split3[0]);
                        String str30 = str11;
                        String str31 = str6;
                        edit.putString("comv" + i + str11 + t_video_pro.this.f10220x, split3[1].replace("@X@", str26).replace("@Y@", str31));
                        edit.putString("comv" + i + str7 + t_video_pro.this.f10220x, split3[2]);
                        edit.putString("comv" + i + "_idusucrea_" + t_video_pro.this.f10220x, split3[3]);
                        edit.putString("comv" + i + "_nombre_" + t_video_pro.this.f10220x, split3[4]);
                        edit.putString("comv" + i + "_vfoto_" + t_video_pro.this.f10220x, split3[5]);
                        edit.putString("comv" + i + "_privados_" + t_video_pro.this.f10220x, split3[6]);
                        edit.putString("comv" + i + "_fnacd_" + t_video_pro.this.f10220x, split3[7]);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("comv");
                        sb2.append(i);
                        String str32 = str29;
                        sb2.append(str32);
                        sb2.append(t_video_pro.this.f10220x);
                        edit.putString(sb2.toString(), split3[8]);
                        edit.putString("comv" + i + str27 + t_video_pro.this.f10220x, split3[9]);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("comv");
                        sb3.append(i);
                        String str33 = str23;
                        sb3.append(str33);
                        sb3.append(t_video_pro.this.f10220x);
                        edit.putString(sb3.toString(), split3[10]);
                        edit.putString("comv" + i + "_coments_" + t_video_pro.this.f10220x, split3[11]);
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
                    t_video_pro.this.mo9152k(false);
                    str2 = str12;
                }
                C2567u uVar = t_video_pro.this.f10197I;
                if (uVar == null || uVar.getStatus() != AsyncTask.Status.RUNNING) {
                    t_video_pro t_video_pro2 = t_video_pro.this;
                    t_video_pro2.f10197I = new C2567u();
                    i2 = 0;
                    t_video_pro.this.f10197I.execute(new String[0]);
                } else {
                    i2 = 0;
                }
                if (strArr[i].equals(str2)) {
                    t_video_pro.this.findViewById(R.id.fl_mascoments).setVisibility(i2);
                }
                if (this.f10253a && !t_video_pro.this.f10210n.containsKey("nlikes")) {
                    t_video_pro t_video_pro3 = t_video_pro.this;
                    t_video_pro3.f10219w = strArr[i + 1];
                    t_video_pro3.f10221y = strArr[i + 2];
                    t_video_pro3.m9065l();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_video_pro.this.findViewById(R.id.fl_mascoments).setVisibility(8);
            t_video_pro t_video_pro = t_video_pro.this;
            if (t_video_pro.f10217u) {
                t_video_pro.findViewById(R.id.pb_mascoments_inv).setVisibility(0);
            } else {
                t_video_pro.findViewById(R.id.pb_mascoments).setVisibility(0);
            }
        }
    }

    /* renamed from: british.xnews2.t_video_pro$u */
    private class C2567u extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f10255a;

        /* renamed from: b */
        String f10256b;

        /* renamed from: c */
        Bitmap f10257c;

        private C2567u() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                java.lang.String r0 = r4.f10255a
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
                java.lang.String r2 = r4.f10255a     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_1_p.jpg?v="
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f10256b     // Catch:{  }
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
                r4.f10257c = r2     // Catch:{ MalformedURLException -> 0x0088 }
                r1.close()     // Catch:{  }
                r0.disconnect()     // Catch:{  }
                java.io.File r0 = new java.io.File     // Catch:{  }
                british.xnews2.t_video_pro r1 = british.xnews2.t_video_pro.this     // Catch:{  }
                java.io.File r1 = r1.f10196H     // Catch:{  }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                r2.<init>()     // Catch:{  }
                java.lang.String r3 = "fperfil_"
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = r4.f10255a     // Catch:{  }
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = ".jpg"
                r2.append(r3)     // Catch:{  }
                java.lang.String r2 = r2.toString()     // Catch:{  }
                r0.<init>(r1, r2)     // Catch:{  }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r0)     // Catch:{  }
                android.graphics.Bitmap r0 = r4.f10257c     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 70
                r0.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
            L_0x0088:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_video_pro.C2567u.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (t_video_pro.this.f10194F != null && this.f10255a != null && !str.equals("-1")) {
                if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                    SharedPreferences.Editor edit = t_video_pro.this.f10193E.edit();
                    edit.putString("fperfil_" + this.f10255a, this.f10256b);
                    edit.commit();
                }
                int childCount = t_video_pro.this.f10194F.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    String str2 = (String) t_video_pro.this.f10194F.getChildAt(i).findViewById(R.id.iv_usucoment).getTag(R.id.idaux1);
                    if (str2 != null && str2.equals(this.f10255a)) {
                        t_video_pro.this.f10194F.getChildAt(i).findViewById(R.id.iv_usucoment).setTag(R.id.idaux2, this.f10256b);
                        if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                            ((ImageView) t_video_pro.this.f10194F.getChildAt(i).findViewById(R.id.iv_usucoment)).setImageBitmap(this.f10257c);
                        }
                    }
                }
                new C2567u().execute(new String[0]);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            for (int i = 0; i < t_video_pro.this.f10194F.getChildCount(); i++) {
                LinearLayout linearLayout = (LinearLayout) t_video_pro.this.f10194F.getChildAt(i);
                String str = (String) linearLayout.findViewById(R.id.iv_usucoment).getTag(R.id.idaux1);
                String str2 = (String) linearLayout.findViewById(R.id.iv_usucoment).getTag(R.id.idaux2);
                this.f10256b = str2;
                if (str2 != null && !str2.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                    String str3 = this.f10256b;
                    SharedPreferences sharedPreferences = t_video_pro.this.f10193E;
                    if (!str3.equals(sharedPreferences.getString("fperfil_" + str, SessionDescription.SUPPORTED_SDP_VERSION))) {
                        this.f10255a = str;
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: british.xnews2.t_video_pro$v */
    private class C2568v extends AsyncTask<String, Void, String> {
        private C2568v() {
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
                british.xnews2.t_video_pro r1 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x009c }
                long r1 = r1.f10211o     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.t_video_pro r1 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = r1.f10218v     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&id_videogal="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.t_video_pro r1 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = r1.f10220x     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&n="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.t_video_pro r1 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x009c }
                int r1 = r1.f10213q     // Catch:{ Exception -> 0x009c }
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
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_video_pro.C2568v.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            boolean z;
            try {
                t_video_pro.this.f10203O.findViewById(R.id.likes_pb).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                if (t_video_pro.this.f10199K.size() == 0) {
                    if (t_video_pro.this.f10221y.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                        C1789f0 f0Var = new C1789f0();
                        f0Var.f7712f = t_video_pro.this.f10211o + "";
                        f0Var.f7711e = t_video_pro.this.getResources().getString(R.string.tu);
                        t_video_pro t_video_pro = t_video_pro.this;
                        f0Var.f7708b = t_video_pro.f10209m.mo7516l0(t_video_pro, 1).exists();
                        t_video_pro.this.f10199K.add(f0Var);
                    }
                } else if (((C1789f0) t_video_pro.this.f10199K.get(t_video_pro.this.f10199K.size() - 1)).f7709c) {
                    t_video_pro.this.f10199K.remove(t_video_pro.this.f10199K.size() - 1);
                }
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    int i2 = 0;
                    while (true) {
                        if (i2 >= t_video_pro.this.f10199K.size()) {
                            z = false;
                            break;
                        } else if (((C1789f0) t_video_pro.this.f10199K.get(i2)).f7712f.equals(split2[0])) {
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
                        t_video_pro.this.f10199K.add(f0Var2);
                        t_video_pro.this.f10213q++;
                    }
                    i++;
                }
                if (split[i].equals("S")) {
                    C1789f0 f0Var3 = new C1789f0();
                    f0Var3.f7709c = true;
                    t_video_pro.this.f10199K.add(f0Var3);
                }
                t_video_pro.this.f10200L.notifyDataSetChanged();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_video_pro.this.f10203O.findViewById(R.id.likes_pb).setVisibility(0);
        }
    }

    /* renamed from: british.xnews2.t_video_pro$w */
    private class C2569w extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f10260a;

        C2569w(String str) {
            this.f10260a = str;
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
                java.lang.String r1 = "/srv/eliminar_coment_video.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.t_video_pro r1 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x0082 }
                long r1 = r1.f10211o     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.t_video_pro r1 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r1.f10218v     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&idc="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r5.f10260a     // Catch:{ Exception -> 0x0082 }
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
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_video_pro.C2569w.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: british.xnews2.t_video_pro$x */
    private class C2570x extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f10262a;

        C2570x(String str) {
            this.f10262a = str;
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
                java.lang.String r1 = "/srv/eliminar_videogal.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.t_video_pro r1 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x0082 }
                long r1 = r1.f10211o     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.t_video_pro r1 = british.xnews2.t_video_pro.this     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r1.f10218v     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&idv="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r5.f10262a     // Catch:{ Exception -> 0x0082 }
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
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_video_pro.C2570x.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: british.xnews2.t_video_pro$y */
    private class C2571y extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f10264a;

        /* renamed from: british.xnews2.t_video_pro$y$a */
        class C2572a implements Runnable {
            C2572a() {
            }

            public void run() {
                try {
                    ((ScrollView) t_video_pro.this.findViewById(R.id.sc_pro)).smoothScrollTo(0, t_video_pro.this.findViewById(R.id.tv_coments).getTop());
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: british.xnews2.t_video_pro$y$b */
        class C2573b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f10267a;

            C2573b(AlertDialog alertDialog) {
                this.f10267a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f10267a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_video_pro.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.t_video_pro$y$c */
        class C2574c implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f10269a;

            C2574c(AlertDialog alertDialog) {
                this.f10269a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f10269a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_video_pro.this.f6656b));
            }
        }

        public C2571y(String str) {
            this.f10264a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/enviar_coment_video.php?idusu=" + t_video_pro.this.f10211o + "&c=" + t_video_pro.this.f10218v + "&idusu_pro=" + t_video_pro.this.f10222z + "&idv=" + t_video_pro.this.f10220x);
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                gVar.mo48144c("m", new C12982f(URLEncoder.encode(this.f10264a, C6540C.UTF8_NAME)));
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
            AlertDialog.Builder builder = new AlertDialog.Builder(t_video_pro.this);
            try {
                t_video_pro.this.f10192D.setVisibility(8);
                t_video_pro t_video_pro = t_video_pro.this;
                if (t_video_pro.f10217u || Build.VERSION.SDK_INT <= 12) {
                    ((TextView) t_video_pro.findViewById(R.id.et_coment_self)).setTextColor(-16777216);
                } else {
                    ((TextView) t_video_pro.findViewById(R.id.et_coment_self)).setTextColor(-1);
                }
            } catch (Exception unused) {
            }
            if (str2.indexOf("ANDROID:OK ID:") != -1) {
                int indexOf = str2.indexOf("ANDROID:OK ID:") + 14;
                String substring = str2.substring(indexOf, str2.indexOf("-", indexOf));
                ((EditText) t_video_pro.this.findViewById(R.id.et_coment_self)).setText("");
                String v = C1692config.m8201v(new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
                t_video_pro.this.mo9151j(Boolean.FALSE, Boolean.TRUE, substring, t_video_pro.this.f10211o + "", t_video_pro.this.getResources().getString(R.string.tu), v, this.f10264a, SessionDescription.SUPPORTED_SDP_VERSION, "", "", "", "", "", "");
                SharedPreferences.Editor edit = t_video_pro.this.f10193E.edit();
                for (int i = 3; i > 0; i += -1) {
                    SharedPreferences sharedPreferences = t_video_pro.this.f10193E;
                    StringBuilder sb = new StringBuilder();
                    sb.append("idcomv");
                    int i2 = i - 1;
                    sb.append(i2);
                    sb.append("_");
                    sb.append(t_video_pro.this.f10220x);
                    edit.putString("idcomv" + i + "_" + t_video_pro.this.f10220x, sharedPreferences.getString(sb.toString(), ""));
                    edit.putString("comv" + i + "_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_" + t_video_pro.this.f10220x, ""));
                    edit.putString("comv" + i + "_fcrea_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_fcrea_" + t_video_pro.this.f10220x, ""));
                    edit.putString("comv" + i + "_idusucrea_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_idusucrea_" + t_video_pro.this.f10220x, ""));
                    edit.putString("comv" + i + "_nombre_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_nombre_" + t_video_pro.this.f10220x, ""));
                    edit.putString("comv" + i + "_vfoto_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_vfoto_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("comv" + i + "_privados_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_privados_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("comv" + i + "_fnacd_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_fnacd_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("comv" + i + "_fnacm_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_fnacm_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("comv" + i + "_fnaca_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_fnaca_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("comv" + i + "_sexo_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_sexo_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("comv" + i + "_coments_" + t_video_pro.this.f10220x, t_video_pro.this.f10193E.getString("comv" + i2 + "_coments_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION));
                }
                edit.putString("idcomv0_" + t_video_pro.this.f10220x, substring);
                edit.putString("comv0_" + t_video_pro.this.f10220x, this.f10264a);
                edit.putString("comv0_fcrea_" + t_video_pro.this.f10220x, v);
                edit.putString("comv0_idusucrea_" + t_video_pro.this.f10220x, t_video_pro.this.f10211o + "");
                edit.putString("comv0_nombre_" + t_video_pro.this.f10220x, t_video_pro.this.getResources().getString(R.string.tu));
                edit.putString("comv0_vfoto_" + t_video_pro.this.f10220x, SessionDescription.SUPPORTED_SDP_VERSION);
                edit.commit();
                try {
                    t_video_pro.this.findViewById(R.id.sc_pro).post(new C2572a());
                } catch (Exception unused2) {
                }
            } else if (str2.indexOf("ANDROID:KO MOTIVO:NOADMITE") != -1) {
                AlertDialog create = builder.setCancelable(false).setPositiveButton(t_video_pro.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.noadmitecoments).create();
                if (!t_video_pro.this.f6656b.equals("")) {
                    create.setOnShowListener(new C2573b(create));
                }
                create.show();
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                AlertDialog create2 = builder.setCancelable(false).setPositiveButton(t_video_pro.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.error_http).create();
                if (!t_video_pro.this.f6656b.equals("")) {
                    create2.setOnShowListener(new C2574c(create2));
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }
    }

    /* renamed from: british.xnews2.t_video_pro$z */
    private class C2575z extends AsyncTask<String, Void, String> {
        private C2575z() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/like_videogal.php?idusu=" + t_video_pro.this.f10211o + "&c=" + t_video_pro.this.f10218v + "&idusu_pro=" + t_video_pro.this.f10222z + "&idv=" + t_video_pro.this.f10220x + "&modo=" + t_video_pro.this.f10221y);
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
    public void m9062e() {
        FullscreenVideoLayout_pro fullscreenVideoLayout_pro = this.f10207S;
        fullscreenVideoLayout_pro.f6707w = false;
        this.f10205Q = false;
        fullscreenVideoLayout_pro.mo7161r(false, false);
        FullscreenVideoLayout_pro fullscreenVideoLayout_pro2 = this.f10207S;
        boolean z = this.f10205Q;
        fullscreenVideoLayout_pro2.f6706K = z;
        if (z) {
            fullscreenVideoLayout_pro2.mo7160q();
        }
        this.f10207S.setOnPreparedListener(new C2560o());
        this.f10207S.setOnErrorListener(new C2561p());
        try {
            this.f10207S.mo7203k(Uri.parse(this.f10210n.getString("url")), "Android Vinebre Software");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private void m9063f(Context context) {
        this.f6662h = new C2551h(context);
    }

    /* renamed from: g */
    private void m9064g(boolean z) {
        String trim = ((TextView) findViewById(R.id.et_coment_self)).getText().toString().replace("@", "").trim();
        if (!trim.equals("")) {
            ((TextView) findViewById(R.id.et_coment_self)).setTextColor(-7829368);
            this.f10192D.setVisibility(0);
            C2571y yVar = this.f10198J;
            if (yVar == null || yVar.getStatus() != AsyncTask.Status.RUNNING) {
                C2571y yVar2 = new C2571y(trim);
                this.f10198J = yVar2;
                yVar2.execute(new String[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m9065l() {
        TextView textView = (TextView) findViewById(R.id.tv_likes_n);
        findViewById(R.id.tv_likes_n).setBackgroundDrawable(getResources().getDrawable(R.drawable.likes_izq_p));
        textView.setTextColor(C1692config.f7101A5);
        textView.setText(this.f10219w);
        ((TextView) findViewById(R.id.tv_likes)).setText(this.f10221y.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) ? getResources().getString(R.string.tegusta) : "");
        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.tv_likes_n).setOnClickListener(this);
        findViewById(R.id.ll_likes).setVisibility(0);
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f10209m.mo7510j0(view, this);
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
                    if (this.f10209m.f7427t4 != 2) {
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
    public void mo9149h() {
        Intent intent = new Intent();
        intent.putExtra("nlikesv", this.f10219w);
        intent.putExtra("liked", this.f10221y);
        intent.putExtra("idv", this.f10220x);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9150i() {
        int q0 = this.f10209m.mo7522q0(this);
        int i = this.f10209m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f10204P = listView;
            this.f10209m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f10209m.f7231O1;
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
            int[] iArr = this.f10209m.f7249R1;
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
    public void mo9151j(java.lang.Boolean r20, java.lang.Boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
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
            boolean r12 = r0.f10217u
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
            long r6 = r0.f10211o
            r12.append(r6)
            r12.append(r14)
            java.lang.String r6 = r12.toString()
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x00aa
            java.lang.String r6 = r0.f10222z
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r12 = r5
            long r4 = r0.f10211o
            r7.append(r4)
            r7.append(r14)
            java.lang.String r4 = r7.toString()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x00c7
            goto L_0x00ab
        L_0x00aa:
            r12 = r5
        L_0x00ab:
            boolean r4 = r0.f10217u
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
            long r5 = r0.f10211o
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
            int r5 = r0.f10214r
            if (r5 <= 0) goto L_0x027e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r8 = r0.f10211o
            r5.append(r8)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            boolean r5 = r2.equals(r5)
            java.lang.String r6 = "0"
            if (r5 == 0) goto L_0x01a5
            r5 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            r7.setTag(r5, r6)
            android.graphics.Bitmap r6 = r0.f10195G
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
            boolean r5 = r0.f10217u
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
            java.io.File r10 = r0.f10196H     // Catch:{ Exception -> 0x0261, OutOfMemoryError -> 0x025f }
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
            boolean r5 = r0.f10217u
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
            long r6 = r0.f10211o
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
            android.widget.LinearLayout r2 = r0.f10194F
            r3 = 0
            r2.addView(r6, r3)
            goto L_0x02fb
        L_0x02f6:
            android.widget.LinearLayout r2 = r0.f10194F
            r2.addView(r6)
        L_0x02fb:
            r0.f10189A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_video_pro.mo9151j(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo9152k(boolean z) {
        this.f10194F.removeAllViews();
        int i = 0;
        while (i < 4) {
            SharedPreferences sharedPreferences = this.f10193E;
            if (!sharedPreferences.getString("idcomv" + i + "_" + this.f10220x, "").equals("")) {
                Boolean valueOf = Boolean.valueOf(z);
                Boolean bool = Boolean.FALSE;
                SharedPreferences sharedPreferences2 = this.f10193E;
                String string = sharedPreferences2.getString("idcomv" + i + "_" + this.f10220x, "");
                SharedPreferences sharedPreferences3 = this.f10193E;
                String string2 = sharedPreferences3.getString("comv" + i + "_idusucrea_" + this.f10220x, "");
                SharedPreferences sharedPreferences4 = this.f10193E;
                String string3 = sharedPreferences4.getString("comv" + i + "_nombre_" + this.f10220x, "");
                SharedPreferences sharedPreferences5 = this.f10193E;
                String string4 = sharedPreferences5.getString("comv" + i + "_fcrea_" + this.f10220x, "");
                SharedPreferences sharedPreferences6 = this.f10193E;
                String string5 = sharedPreferences6.getString("comv" + i + "_" + this.f10220x, "");
                SharedPreferences sharedPreferences7 = this.f10193E;
                String string6 = sharedPreferences7.getString("comv" + i + "_vfoto_" + this.f10220x, "");
                SharedPreferences sharedPreferences8 = this.f10193E;
                String string7 = sharedPreferences8.getString("comv" + i + "_privados_" + this.f10220x, "");
                SharedPreferences sharedPreferences9 = this.f10193E;
                String string8 = sharedPreferences9.getString("comv" + i + "_fnacd_" + this.f10220x, "");
                SharedPreferences sharedPreferences10 = this.f10193E;
                String string9 = sharedPreferences10.getString("comv" + i + "_fnacm_" + this.f10220x, "");
                SharedPreferences sharedPreferences11 = this.f10193E;
                String string10 = sharedPreferences11.getString("comv" + i + "_fnaca_" + this.f10220x, "");
                SharedPreferences sharedPreferences12 = this.f10193E;
                String string11 = sharedPreferences12.getString("comv" + i + "_sexo_" + this.f10220x, "");
                SharedPreferences sharedPreferences13 = this.f10193E;
                mo9151j(valueOf, bool, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, sharedPreferences13.getString("comv" + i + "_coments_" + this.f10220x, ""));
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
                for (int i3 = 0; i3 < this.f10199K.size(); i3++) {
                    if (this.f10199K.get(i3).f7712f.equals(intent.getStringExtra("accion_usu_fav_id"))) {
                        this.f10199K.get(i3).f7710d = intent.getBooleanExtra("accion_usu_fav_accion", false);
                        this.f10200L.notifyDataSetChanged();
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
        if (this.f10216t) {
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
        if (this.f10207S.mo7195c()) {
            this.f10207S.setFullscreen(false);
        } else if (!this.f6659e || this.f10206R || !this.f10209m.f7365k5) {
            mo9149h();
            super.onBackPressed();
        } else {
            this.f10206R = true;
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
        if (view.getId() == R.id.iv_enviarcoment) {
            m9064g(false);
            return;
        }
        String str9 = "";
        if (view.getId() == R.id.iv_elimcoment) {
            View view2 = (View) view.getParent().getParent();
            String str10 = (String) view2.getTag(R.id.idaux2);
            if (str10 != null) {
                AlertDialog create = new AlertDialog.Builder(this).setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.si, new C2562q(view2, str10)).setMessage(R.string.confirmar_elimcoment).create();
                if (!this.f6656b.equals(str9)) {
                    create.setOnShowListener(new C2563r(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            }
        } else if (view.getId() == R.id.iv_mascoments) {
            new C2566t(false).execute(new String[0]);
        } else if (view.getTag(R.id.idaux1) != null && view.getTag(R.id.idaux1).equals("ESCOMENT")) {
            Intent intent = new Intent(this, profile.class);
            intent.putExtra(TtmlNode.ATTR_ID, (String) view.getTag(R.id.idaux2));
            intent.putExtra("privados", (String) view.getTag(R.id.idaux5));
            intent.putExtra("nombre", (String) view.getTag(R.id.idaux3));
            intent.putExtra("coments", (String) view.getTag(R.id.idaux10));
            intent.putExtra("fnac_d", (String) view.getTag(R.id.idaux6));
            intent.putExtra("fnac_m", (String) view.getTag(R.id.idaux7));
            intent.putExtra("fnac_a", (String) view.getTag(R.id.idaux8));
            intent.putExtra("sexo", (String) view.getTag(R.id.idaux9));
            intent.putExtra("vfoto", (String) view.getTag(R.id.idaux4));
            if (this.f10210n.containsKey("desdepriv")) {
                intent.putExtra("desdepriv", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            }
            intent.putExtra("p_fnac", this.f10210n.getInt("p_fnac"));
            intent.putExtra("p_sexo", this.f10210n.getInt("p_sexo"));
            intent.putExtra("p_descr", this.f10210n.getInt("p_descr"));
            intent.putExtra("p_dist", this.f10210n.getInt("p_dist"));
            intent.putExtra("coments_chat", this.f10210n.getBoolean("coments_chat"));
            intent.putExtra("galeria", this.f10210n.getBoolean("galeria"));
            intent.putExtra("privados_chat", this.f10210n.getBoolean("privados_chat"));
            intent.putExtra("fotos_perfil", this.f10214r);
            intent.putExtra("fotos_chat", this.f10210n.getInt("fotos_chat"));
            startActivityForResult(intent, 0);
        } else if (view.getId() == R.id.tv_likes_n) {
            if (!this.f10219w.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                this.f10202N = new AlertDialog.Builder(this);
                View inflate = getLayoutInflater().inflate(R.layout.likes_list, (ViewGroup) null);
                this.f10203O = inflate;
                if (Build.VERSION.SDK_INT > 20) {
                    C1692config.m8168S0((ProgressBar) inflate.findViewById(R.id.likes_pb), this.f10209m.f7368l1);
                }
                this.f10202N.setView(this.f10203O);
                this.f10202N.setCancelable(true);
                ListView listView = (ListView) this.f10203O.findViewById(R.id.lv);
                listView.setCacheColorHint(0);
                C1770e0 e0Var = new C1770e0(this, R.layout.likes_item, this.f10199K, this.f10211o);
                this.f10200L = e0Var;
                listView.setAdapter(e0Var);
                listView.setOnItemClickListener(new C2542a());
                this.f10202N.show();
                if (this.f10199K.size() == 0) {
                    C2568v vVar = this.f10201M;
                    if (vVar == null || vVar.getStatus() != AsyncTask.Status.RUNNING) {
                        C2568v vVar2 = new C2568v();
                        this.f10201M = vVar2;
                        vVar2.execute(new String[0]);
                    }
                }
            }
        } else if (view.getId() == R.id.iv_like) {
            if (this.f10221y.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                this.f10219w = (Integer.parseInt(this.f10219w) + 1) + str9;
                this.f10221y = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                String str11 = this.f10222z;
                if (!str11.equals(this.f10211o + str9)) {
                    SharedPreferences sharedPreferences = this.f10193E;
                    if (!sharedPreferences.contains("usufav_" + this.f10222z)) {
                        SharedPreferences sharedPreferences2 = this.f10193E;
                        if (!sharedPreferences2.contains("usufav_noactivar_" + this.f10222z)) {
                            SharedPreferences.Editor edit = this.f10193E.edit();
                            edit.putBoolean("usufav_" + this.f10222z, true);
                            edit.commit();
                        }
                    }
                }
                if (this.f10199K.size() > 0) {
                    String str12 = this.f10199K.get(0).f7712f;
                    if (!str12.equals(this.f10211o + str9)) {
                        C1789f0 f0Var = new C1789f0();
                        f0Var.f7712f = this.f10211o + str9;
                        f0Var.f7711e = getResources().getString(R.string.tu);
                        f0Var.f7708b = this.f10209m.mo7516l0(this, 1).exists();
                        this.f10199K.add(0, f0Var);
                        this.f10200L.notifyDataSetChanged();
                    }
                }
            } else {
                this.f10219w = (Integer.parseInt(this.f10219w) - 1) + str9;
                this.f10221y = SessionDescription.SUPPORTED_SDP_VERSION;
                if (this.f10199K.size() > 0) {
                    String str13 = this.f10199K.get(0).f7712f;
                    if (str13.equals(this.f10211o + str9)) {
                        this.f10199K.remove(0);
                        this.f10200L.notifyDataSetChanged();
                    }
                }
            }
            ((TextView) findViewById(R.id.tv_likes_n)).setText(this.f10219w);
            if (this.f10221y.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                str9 = getResources().getString(R.string.tegusta);
            }
            ((TextView) findViewById(R.id.tv_likes)).setText(str9);
            new C2575z().execute(new String[0]);
        } else if (view.getId() == R.id.iv_reportar) {
            AlertDialog create2 = new AlertDialog.Builder(this).setNegativeButton(R.string.cancelar, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.aceptar, new C2544b()).setMessage(R.string.confirmar_reportarvideo).create();
            if (!this.f6656b.equals(str9)) {
                create2.setOnShowListener(new C2546c(create2));
            }
            create2.show();
            ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } else if (view.getId() == R.id.iv_elim) {
            AlertDialog create3 = new AlertDialog.Builder(this).setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.si, new C2547d()).setMessage(R.string.confirmar_elimvideo).create();
            if (!this.f6656b.equals(str9)) {
                create3.setOnShowListener(new C2548e(create3));
            }
            create3.show();
            ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } else {
            String str14 = this.f10209m.f7251R3;
            if ((str14 == null || str14.equals(str9)) && (((str = this.f10209m.f7281W3) == null || str.equals(str9)) && (((str2 = this.f10209m.f7250R2) == null || str2.equals(str9)) && (((str3 = this.f10209m.f7245Q3) == null || str3.equals(str9)) && (((str4 = this.f10209m.f7269U3) == null || str4.equals(str9)) && (((str5 = this.f10209m.f7275V3) == null || str5.equals(str9)) && (((str6 = this.f10209m.f7358j4) == null || str6.equals(str9)) && (((str7 = this.f10209m.f7287X3) == null || str7.equals(str9)) && ((str8 = this.f10209m.f7293Y3) == null || str8.equals(str9)))))))))) {
                abrir_secc(view);
                return;
            }
            String str15 = this.f10209m.f7251R3;
            if (str15 != null && !str15.equals(str9)) {
                this.f6663i = new RewardedVideo((Context) this, this.f10209m.f7251R3);
            }
            String str16 = this.f10209m.f7245Q3;
            if (str16 != null) {
                str16.equals(str9);
            }
            String str17 = this.f10209m.f7269U3;
            if (str17 != null && !str17.equals(str9)) {
                this.f6664j = new RewardedVideoAd(this, this.f10209m.f7269U3);
            }
            String str18 = this.f10209m.f7275V3;
            if (str18 != null && !str18.equals(str9)) {
                this.f6665k = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6661g = progressDialog;
            this.f6660f = view;
            if (!this.f10209m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                abrir_secc(view);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo9150i();
        if (this.f10209m.f7427t4 == 1) {
            ((ImageView) findViewById(R.id.iv_drawer)).setOnClickListener(new C2549f());
            ((ImageView) findViewById(R.id.icohome)).setOnClickListener(new C2550g());
        }
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f10215s;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f10215s;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f10215s = this.f10209m.mo7474A0(this, false);
        if (configuration.orientation == 2) {
            if (!this.f10207S.mo7195c()) {
                this.f10207S.setFullscreen(true);
            } else {
                this.f10207S.mo7201i();
            }
        } else if (this.f10207S.mo7195c()) {
            this.f10207S.setFullscreen(false);
        } else {
            this.f10207S.mo7201i();
        }
    }

    @TargetApi(14)
    public void onCreate(Bundle bundle) {
        C1692config config;
        int i;
        Bundle bundle2 = bundle;
        C1692config config2 = (C1692config) getApplicationContext();
        this.f10209m = config2;
        if (config2.f7313c1 == null) {
            config2.mo7490V0();
        }
        m9063f(this);
        this.f6666l = new C2555j();
        Bundle extras = getIntent().getExtras();
        this.f10210n = extras;
        C1692config config3 = this.f10209m;
        this.f10190B = config3.f7313c1;
        this.f10191C = config3.f7319d1;
        int i2 = config3.f7318d;
        if (i2 != -1) {
            C1855l[] lVarArr = config3.f7231O1;
            this.f10190B = lVarArr[i2].f7916g;
            this.f10191C = lVarArr[i2].f7919h;
        }
        if (extras.containsKey("bg1")) {
            this.f10190B = this.f10210n.getString("bg1");
            this.f10191C = this.f10210n.getString("bg2");
        }
        this.f10217u = true;
        if (bundle2 == null) {
            Bundle bundle3 = this.f10210n;
            this.f6659e = bundle3 != null && bundle3.containsKey("es_root") && this.f10210n.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle2.containsKey("es_root") && bundle2.getBoolean("es_root", false);
        }
        this.f10214r = this.f10210n.getInt("fotos_perfil");
        this.f6656b = C1692config.m8189h(this.f10190B, this.f10209m.f7368l1);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 12) {
            if (!C1692config.m8153I("#" + this.f10190B)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_video_pro);
        mo9150i();
        this.f10209m.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2556k());
        searchManager.setOnDismissListener(new C2557l());
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f10193E = sharedPreferences;
        this.f10211o = sharedPreferences.getLong("idusu", 0);
        this.f10218v = this.f10193E.getString("cod", "");
        if (this.f10210n.containsKey("nlikes")) {
            this.f10219w = this.f10210n.getString("nlikes");
            this.f10221y = this.f10210n.getString("liked");
            m9065l();
        }
        this.f10220x = this.f10210n.getString("idv");
        this.f10212p = this.f10210n.getInt("indv");
        this.f10222z = this.f10210n.getString("idusu_profile");
        this.f10196H = getFilesDir();
        this.f10199K = new ArrayList<>();
        this.f10192D = (ProgressBar) findViewById(R.id.pb_chat_env_inv);
        if (!this.f10217u && i3 > 12) {
            this.f10192D = (ProgressBar) findViewById(R.id.pb_chat_env);
        }
        String str = this.f10222z;
        if (str.equals(this.f10211o + "")) {
            findViewById(R.id.iv_reportar).setVisibility(8);
            findViewById(R.id.iv_elim).setOnClickListener(this);
            findViewById(R.id.iv_elim).setVisibility(0);
        } else {
            findViewById(R.id.iv_reportar).setOnClickListener(this);
        }
        if (this.f10209m.f7427t4 == 1) {
            ((ImageView) findViewById(R.id.iv_drawer)).setOnClickListener(new C2558m());
            ((ImageView) findViewById(R.id.icohome)).setOnClickListener(new C2559n());
        }
        this.f10215s = this.f10209m.mo7474A0(this, false);
        if (!this.f10190B.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f10190B), Color.parseColor("#" + this.f10191C)}));
        }
        if (i3 > 20) {
            C1692config.m8168S0((ProgressBar) findViewById(R.id.pb_mascoments), this.f10209m.f7368l1);
            C1692config.m8168S0((ProgressBar) findViewById(R.id.pb_mascoments_inv), this.f10209m.f7368l1);
            C1692config.m8168S0((ProgressBar) findViewById(R.id.pb_chat_env), this.f10209m.f7368l1);
            C1692config.m8168S0((ProgressBar) findViewById(R.id.pb_chat_env_inv), this.f10209m.f7368l1);
        }
        if (this.f10217u) {
            this.f10195G = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto);
        } else {
            this.f10195G = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto_light);
        }
        if (this.f10214r > 0) {
            File l0 = this.f10209m.mo7516l0(this, 1);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(l0.getPath(), options);
                int i4 = options.outWidth;
                int i5 = options.outHeight;
                if (!(i4 <= 75 && i5 <= 100)) {
                    int round = Math.round(((float) i4) / ((float) C1692config.m8193n(i4, i5, 75, 100)));
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = round;
                    this.f10195G = BitmapFactory.decodeFile(l0.getPath(), options2);
                } else {
                    this.f10195G = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(l0));
                }
            } catch (Exception | OutOfMemoryError unused) {
            }
        }
        this.f10207S = (FullscreenVideoLayout_pro) findViewById(R.id.vv);
        this.f10194F = (LinearLayout) findViewById(R.id.ll_coments);
        if (!this.f10210n.getString("coments").equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) || !this.f10210n.getBoolean("coments_chat")) {
            this.f10207S.f6760o = false;
            findViewById(R.id.sc_coments).setVisibility(8);
            new C2545b0().execute(new String[0]);
        } else {
            this.f10207S.f6760o = true;
            int i6 = -16777216;
            if (!this.f10217u) {
                i6 = -1;
            }
            ((TextView) findViewById(R.id.tv_coments)).setTextColor(i6);
            if (C1692config.m8153I("#" + this.f10209m.f7368l1)) {
                findViewById(R.id.iv_enviarcom_fondo_n).setVisibility(0);
            } else {
                findViewById(R.id.iv_enviarcom_fondo_b).setVisibility(0);
            }
            Drawable drawable = getResources().getDrawable(R.drawable.btn_enviar);
            drawable.setColorFilter(Color.parseColor("#" + this.f10209m.f7368l1), PorterDuff.Mode.MULTIPLY);
            ((ImageView) findViewById(R.id.iv_enviarcoment)).setImageDrawable(drawable);
            if (C1692config.m8153I("#" + this.f10209m.f7368l1)) {
                findViewById(R.id.iv_mascoments_fondo_n).setVisibility(0);
            } else {
                findViewById(R.id.iv_mascoments_fondo_b).setVisibility(0);
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.mas_btn);
            drawable2.setColorFilter(Color.parseColor("#" + this.f10209m.f7368l1), PorterDuff.Mode.MULTIPLY);
            ((ImageView) findViewById(R.id.iv_mascoments)).setImageDrawable(drawable2);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 > 20) {
                C1692config.m8150F((EditText) findViewById(R.id.et_coment_self), Boolean.valueOf(!this.f10217u), this.f10209m.f7368l1);
            } else if (i7 > 12) {
                ((EditText) findViewById(R.id.et_coment_self)).setTextColor(i6);
            }
            findViewById(R.id.iv_enviarcoment).setOnClickListener(this);
            findViewById(R.id.iv_mascoments).setOnClickListener(this);
            ((ImageView) findViewById(R.id.iv_usucoment_self)).setImageBitmap(this.f10195G);
            mo9152k(true);
            new C2566t(true).execute(new String[0]);
        }
        if (this.f10217u) {
            ((TextView) findViewById(R.id.tv_tu)).setTextColor(C1692config.f7101A5);
        } else {
            ((TextView) findViewById(R.id.tv_tu)).setTextColor(-1);
        }
        String str2 = this.f10222z;
        if (str2.equals(this.f10211o + "")) {
            m9062e();
            return;
        }
        SharedPreferences sharedPreferences2 = getSharedPreferences("sh", 0);
        int i8 = sharedPreferences2.getInt("appnext_video_n", 0) + 1;
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.putInt("appnext_video_n", i8);
        edit.commit();
        if (this.f10209m.f7274V2.equals("") || i8 < (i = config.f7286X2) || (i8 - i) % (config = this.f10209m).f7280W2 != 0) {
            m9062e();
            return;
        }
        this.f10207S.f6707w = true;
        new C2564s().execute(new String[0]);
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f10209m.f7384n3 == 0 || (cVar3 = this.f10215s) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f10209m.f7384n3 == 0 || (cVar2 = this.f10215s) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f10209m.f7384n3 == 0 || (cVar = this.f10215s) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (!(this.f10209m.f7384n3 == 0 || (cVar = this.f10215s) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
        this.f10208T = this.f10207S.getCurrentPosition();
        this.f10207S.mo7146e();
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2554i());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        FullscreenVideoLayout_pro fullscreenVideoLayout_pro = this.f10207S;
        if (fullscreenVideoLayout_pro != null && fullscreenVideoLayout_pro.f6751f) {
            fullscreenVideoLayout_pro.mo7202j(this.f10208T);
            this.f10207S.mo7149l();
        }
        if (this.f10209m.f7384n3 != 0 && (cVar = this.f10215s) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f10216t = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f10216t) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f10216t = true;
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
        this.f10216t = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f10216t = true;
        C1692config.m8175Y0(this);
    }
}
