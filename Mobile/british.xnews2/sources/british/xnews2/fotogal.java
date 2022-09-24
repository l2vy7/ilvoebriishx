package british.xnews2;

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
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import p272b9.C11188h;
import p312i9.C12788b;
import p312i9.C12789c;
import p317l8.C12831e;
import p337x8.C12957d;
import p337x8.C12960g;

public class fotogal extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    boolean f7720A = false;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public ArrayList<C1789f0> f7721B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C1770e0 f7722C;

    /* renamed from: D */
    C1808n f7723D;

    /* renamed from: E */
    AlertDialog.Builder f7724E;

    /* renamed from: F */
    View f7725F;

    /* renamed from: G */
    ListView f7726G;

    /* renamed from: m */
    C1692config f7727m;

    /* renamed from: n */
    Bundle f7728n;

    /* renamed from: o */
    long f7729o;

    /* renamed from: p */
    int f7730p;

    /* renamed from: q */
    int f7731q = 0;

    /* renamed from: r */
    boolean f7732r = true;

    /* renamed from: s */
    String f7733s;

    /* renamed from: t */
    String f7734t;

    /* renamed from: u */
    String f7735u;

    /* renamed from: v */
    String f7736v;

    /* renamed from: w */
    String f7737w;

    /* renamed from: x */
    SharedPreferences f7738x;

    /* renamed from: y */
    WebView f7739y;

    /* renamed from: z */
    C1603c f7740z;

    /* renamed from: british.xnews2.fotogal$a */
    class C1793a implements DialogInterface.OnClickListener {
        C1793a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            fotogal fotogal = fotogal.this;
            new C1809o(fotogal.f7735u).execute(new String[0]);
            Intent intent = new Intent();
            intent.putExtra("elim_foto", fotogal.this.f7735u);
            intent.putExtra("indf", fotogal.this.f7730p);
            fotogal.this.setResult(-1, intent);
            fotogal.this.finish();
        }
    }

    /* renamed from: british.xnews2.fotogal$b */
    class C1794b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7742a;

        C1794b(AlertDialog alertDialog) {
            this.f7742a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7742a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + fotogal.this.f6656b));
            Button button2 = this.f7742a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + fotogal.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.fotogal$c */
    class C1795c extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f7744a;

        /* renamed from: british.xnews2.fotogal$c$a */
        class C1796a extends FullScreenContentCallback {
            C1796a() {
            }

            public void onAdDismissedFullScreenContent() {
                fotogal fotogal = fotogal.this;
                if (fotogal.f7720A) {
                    fotogal.abrir_secc(fotogal.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                fotogal fotogal = fotogal.this;
                fotogal.abrir_secc(fotogal.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.fotogal$c$b */
        class C1797b implements OnUserEarnedRewardListener {
            C1797b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C1795c cVar = C1795c.this;
                fotogal.this.f7720A = true;
                C1692config.m8175Y0(cVar.f7744a);
            }
        }

        C1795c(Context context) {
            this.f7744a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            fotogal.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C1796a());
            rewardedAd.show((Activity) this.f7744a, new C1797b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            fotogal fotogal = fotogal.this;
            if (!fotogal.f7727m.mo7502f(this.f7744a, fotogal.f6663i)) {
                fotogal.this.f6661g.cancel();
                fotogal fotogal2 = fotogal.this;
                fotogal2.abrir_secc(fotogal2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.fotogal$d */
    class C1798d implements AdDisplayListener {
        C1798d() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            fotogal fotogal = fotogal.this;
            if (fotogal.f7720A) {
                fotogal.abrir_secc(fotogal.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.fotogal$e */
    class C1799e extends AdColonyInterstitialListener {
        C1799e() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            fotogal fotogal = fotogal.this;
            if (fotogal.f7720A) {
                fotogal.abrir_secc(fotogal.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            fotogal.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            fotogal.this.f6661g.cancel();
            fotogal fotogal = fotogal.this;
            fotogal.abrir_secc(fotogal.f6660f);
        }
    }

    /* renamed from: british.xnews2.fotogal$f */
    class C1800f implements SearchManager.OnCancelListener {
        C1800f() {
        }

        public void onCancel() {
            fotogal fotogal = fotogal.this;
            fotogal.f6657c = false;
            fotogal.setResult(0);
        }
    }

    /* renamed from: british.xnews2.fotogal$g */
    class C1801g implements SearchManager.OnDismissListener {
        C1801g() {
        }

        public void onDismiss() {
            fotogal.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.fotogal$h */
    class C1802h extends WebChromeClient {
        C1802h() {
        }
    }

    /* renamed from: british.xnews2.fotogal$i */
    class C1803i implements View.OnTouchListener {
        C1803i() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* renamed from: british.xnews2.fotogal$j */
    class C1804j extends WebViewClient {
        C1804j() {
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            boolean z;
            boolean z2;
            fotogal fotogal = fotogal.this;
            if (!fotogal.f6657c && !fotogal.isFinishing() && !fotogal.this.f7728n.getString("url").contains("youtube.com") && !fotogal.this.f7728n.getString("url").contains("youtu.be")) {
                fotogal fotogal2 = fotogal.this;
                if (fotogal2.f7732r) {
                    Bundle bundle = fotogal2.f7728n;
                    z = true;
                    z2 = bundle != null && bundle.containsKey("ad_entrar");
                    Bundle bundle2 = fotogal.this.f7728n;
                    if (bundle2 == null || !bundle2.containsKey("fb_entrar")) {
                        z = false;
                    }
                    fotogal.this.f7732r = false;
                } else {
                    z2 = false;
                    z = false;
                }
                fotogal fotogal3 = fotogal.this;
                fotogal3.f7727m.mo7504g1(fotogal3, z2, z, false);
            }
        }
    }

    /* renamed from: british.xnews2.fotogal$k */
    class C1805k implements AdapterView.OnItemClickListener {
        C1805k() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1789f0 f0Var = (C1789f0) fotogal.this.f7721B.get(i);
            if (f0Var.f7709c) {
                C1808n nVar = fotogal.this.f7723D;
                if (nVar == null || nVar.getStatus() != AsyncTask.Status.RUNNING) {
                    fotogal.this.f7723D = new C1808n();
                    fotogal.this.f7723D.execute(new String[0]);
                    return;
                }
                return;
            }
            String str = f0Var.f7712f;
            if (!str.equals(fotogal.this.f7729o + "")) {
                String str2 = f0Var.f7712f;
                if (!str2.equals(fotogal.this.f7737w + "")) {
                    Intent intent = new Intent(fotogal.this, profile.class);
                    intent.putExtra(TtmlNode.ATTR_ID, f0Var.f7712f);
                    intent.putExtra("privados", f0Var.f7714h);
                    intent.putExtra("nombre", f0Var.f7711e);
                    intent.putExtra("coments", f0Var.f7716j);
                    intent.putExtra("fnac_d", f0Var.f7717k);
                    intent.putExtra("fnac_m", f0Var.f7718l);
                    intent.putExtra("fnac_a", f0Var.f7719m);
                    intent.putExtra("sexo", f0Var.f7715i);
                    intent.putExtra("vfoto", f0Var.f7713g);
                    if (fotogal.this.f7728n.containsKey("desdepriv")) {
                        intent.putExtra("desdepriv", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    }
                    intent.putExtra("p_fnac", fotogal.this.f7728n.getInt("p_fnac"));
                    intent.putExtra("p_sexo", fotogal.this.f7728n.getInt("p_sexo"));
                    intent.putExtra("p_descr", fotogal.this.f7728n.getInt("p_descr"));
                    intent.putExtra("p_dist", fotogal.this.f7728n.getInt("p_dist"));
                    intent.putExtra("coments_chat", fotogal.this.f7728n.getBoolean("coments_chat"));
                    intent.putExtra("galeria", fotogal.this.f7728n.getBoolean("galeria"));
                    intent.putExtra("privados_chat", fotogal.this.f7728n.getBoolean("privados_chat"));
                    intent.putExtra("fotos_perfil", fotogal.this.f7728n.getInt("fotos_perfil"));
                    intent.putExtra("fotos_chat", fotogal.this.f7728n.getInt("fotos_chat"));
                    fotogal.this.startActivityForResult(intent, 0);
                }
            }
        }
    }

    /* renamed from: british.xnews2.fotogal$l */
    class C1806l implements DialogInterface.OnClickListener {
        C1806l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            fotogal.this.findViewById(R.id.iv_reportar).setVisibility(8);
            fotogal fotogal = fotogal.this;
            C1692config.m8157K0(Toast.makeText(fotogal, fotogal.getResources().getString(R.string.enviando), 0));
            new C1811q().execute(new String[0]);
        }
    }

    /* renamed from: british.xnews2.fotogal$m */
    class C1807m implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7757a;

        C1807m(AlertDialog alertDialog) {
            this.f7757a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7757a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + fotogal.this.f6656b));
            Button button2 = this.f7757a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + fotogal.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.fotogal$n */
    private class C1808n extends AsyncTask<String, Void, String> {
        private C1808n() {
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
                british.xnews2.fotogal r1 = british.xnews2.fotogal.this     // Catch:{ Exception -> 0x009c }
                long r1 = r1.f7729o     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.fotogal r1 = british.xnews2.fotogal.this     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = r1.f7733s     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&id_fotogal="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.fotogal r1 = british.xnews2.fotogal.this     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = r1.f7735u     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&n="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.fotogal r1 = british.xnews2.fotogal.this     // Catch:{ Exception -> 0x009c }
                int r1 = r1.f7731q     // Catch:{ Exception -> 0x009c }
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
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.fotogal.C1808n.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            boolean z;
            try {
                fotogal.this.f7725F.findViewById(R.id.likes_pb).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                if (fotogal.this.f7721B.size() == 0) {
                    if (fotogal.this.f7736v.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                        C1789f0 f0Var = new C1789f0();
                        f0Var.f7712f = fotogal.this.f7729o + "";
                        f0Var.f7711e = fotogal.this.getResources().getString(R.string.tu);
                        fotogal fotogal = fotogal.this;
                        f0Var.f7708b = fotogal.f7727m.mo7516l0(fotogal, 1).exists();
                        fotogal.this.f7721B.add(f0Var);
                    }
                } else if (((C1789f0) fotogal.this.f7721B.get(fotogal.this.f7721B.size() - 1)).f7709c) {
                    fotogal.this.f7721B.remove(fotogal.this.f7721B.size() - 1);
                }
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    int i2 = 0;
                    while (true) {
                        if (i2 >= fotogal.this.f7721B.size()) {
                            z = false;
                            break;
                        } else if (((C1789f0) fotogal.this.f7721B.get(i2)).f7712f.equals(split2[0])) {
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
                        fotogal.this.f7721B.add(f0Var2);
                        fotogal.this.f7731q++;
                    }
                    i++;
                }
                if (split[i].equals("S")) {
                    C1789f0 f0Var3 = new C1789f0();
                    f0Var3.f7709c = true;
                    fotogal.this.f7721B.add(f0Var3);
                }
                fotogal.this.f7722C.notifyDataSetChanged();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            fotogal.this.f7725F.findViewById(R.id.likes_pb).setVisibility(0);
        }
    }

    /* renamed from: british.xnews2.fotogal$o */
    private class C1809o extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f7760a;

        C1809o(String str) {
            this.f7760a = str;
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
                java.lang.String r1 = "/srv/eliminar_fotogal.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.fotogal r1 = british.xnews2.fotogal.this     // Catch:{ Exception -> 0x0082 }
                long r1 = r1.f7729o     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.fotogal r1 = british.xnews2.fotogal.this     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r1.f7733s     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&idf="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r5.f7760a     // Catch:{ Exception -> 0x0082 }
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
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.fotogal.C1809o.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: british.xnews2.fotogal$p */
    private class C1810p extends AsyncTask<String, Void, String> {
        private C1810p() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/like_fotogal.php?idusu=" + fotogal.this.f7729o + "&c=" + fotogal.this.f7733s + "&idusu_pro=" + fotogal.this.f7737w + "&idf=" + fotogal.this.f7735u + "&modo=" + fotogal.this.f7736v);
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

    /* renamed from: british.xnews2.fotogal$q */
    private class C1811q extends AsyncTask<String, Void, String> {
        private C1811q() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/reportar_fotogal.php?idusu=" + fotogal.this.f7729o + "&c=" + fotogal.this.f7733s + "&idusu_pro=" + fotogal.this.f7737w + "&idf=" + fotogal.this.f7735u);
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

    /* renamed from: c */
    private void m8306c(Context context) {
        this.f6662h = new C1795c(context);
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f7727m.mo7510j0(view, this);
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
                    if (this.f7727m.f7427t4 != 2) {
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

    /* renamed from: d */
    public void mo7660d() {
        Intent intent = new Intent();
        intent.putExtra("nlikes", this.f7734t);
        intent.putExtra("liked", this.f7736v);
        intent.putExtra("idf", this.f7735u);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7661e() {
        int q0 = this.f7727m.mo7522q0(this);
        int i = this.f7727m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f7726G = listView;
            this.f7727m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f7727m.f7231O1;
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
            int[] iArr = this.f7727m.f7249R1;
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

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (intent == null || !intent.hasExtra("finalizar")) {
            if (intent != null && intent.hasExtra("accion_usu_fav_id")) {
                for (int i3 = 0; i3 < this.f7721B.size(); i3++) {
                    if (this.f7721B.get(i3).f7712f.equals(intent.getStringExtra("accion_usu_fav_id"))) {
                        this.f7721B.get(i3).f7710d = intent.getBooleanExtra("accion_usu_fav_accion", false);
                        this.f7722C.notifyDataSetChanged();
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
        if (this.f7720A) {
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

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (view.getId() == R.id.iv_cerrar) {
            mo7660d();
        } else if (view.getId() != R.id.tv_likes_n) {
            String str9 = "";
            if (view.getId() == R.id.iv_like) {
                if (this.f7736v.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                    this.f7734t = (Integer.parseInt(this.f7734t) + 1) + str9;
                    this.f7736v = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    String str10 = this.f7737w;
                    if (!str10.equals(this.f7729o + str9)) {
                        SharedPreferences sharedPreferences = this.f7738x;
                        if (!sharedPreferences.contains("usufav_" + this.f7737w)) {
                            SharedPreferences sharedPreferences2 = this.f7738x;
                            if (!sharedPreferences2.contains("usufav_noactivar_" + this.f7737w)) {
                                SharedPreferences.Editor edit = this.f7738x.edit();
                                edit.putBoolean("usufav_" + this.f7737w, true);
                                edit.commit();
                            }
                        }
                    }
                    if (this.f7721B.size() > 0) {
                        String str11 = this.f7721B.get(0).f7712f;
                        if (!str11.equals(this.f7729o + str9)) {
                            C1789f0 f0Var = new C1789f0();
                            f0Var.f7712f = this.f7729o + str9;
                            f0Var.f7711e = getResources().getString(R.string.tu);
                            f0Var.f7708b = this.f7727m.mo7516l0(this, 1).exists();
                            this.f7721B.add(0, f0Var);
                            this.f7722C.notifyDataSetChanged();
                        }
                    }
                } else {
                    this.f7734t = (Integer.parseInt(this.f7734t) - 1) + str9;
                    this.f7736v = SessionDescription.SUPPORTED_SDP_VERSION;
                    if (this.f7721B.size() > 0) {
                        String str12 = this.f7721B.get(0).f7712f;
                        if (str12.equals(this.f7729o + str9)) {
                            this.f7721B.remove(0);
                            this.f7722C.notifyDataSetChanged();
                        }
                    }
                }
                ((TextView) findViewById(R.id.tv_likes_n)).setText(this.f7734t);
                if (this.f7736v.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    str9 = getResources().getString(R.string.tegusta);
                }
                ((TextView) findViewById(R.id.tv_likes)).setText(str9);
                new C1810p().execute(new String[0]);
            } else if (view.getId() == R.id.iv_reportar) {
                AlertDialog create = new AlertDialog.Builder(this).setNegativeButton(R.string.cancelar, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.aceptar, new C1806l()).setMessage(R.string.confirmar_reportarfoto).create();
                if (!this.f6656b.equals(str9)) {
                    create.setOnShowListener(new C1807m(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            } else if (view.getId() == R.id.iv_elim) {
                AlertDialog create2 = new AlertDialog.Builder(this).setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.si, new C1793a()).setMessage(R.string.confirmar_elimfoto).create();
                if (!this.f6656b.equals(str9)) {
                    create2.setOnShowListener(new C1794b(create2));
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                String str13 = this.f7727m.f7251R3;
                if ((str13 == null || str13.equals(str9)) && (((str = this.f7727m.f7281W3) == null || str.equals(str9)) && (((str2 = this.f7727m.f7250R2) == null || str2.equals(str9)) && (((str3 = this.f7727m.f7245Q3) == null || str3.equals(str9)) && (((str4 = this.f7727m.f7269U3) == null || str4.equals(str9)) && (((str5 = this.f7727m.f7275V3) == null || str5.equals(str9)) && (((str6 = this.f7727m.f7358j4) == null || str6.equals(str9)) && (((str7 = this.f7727m.f7287X3) == null || str7.equals(str9)) && ((str8 = this.f7727m.f7293Y3) == null || str8.equals(str9)))))))))) {
                    abrir_secc(view);
                    return;
                }
                String str14 = this.f7727m.f7251R3;
                if (str14 != null && !str14.equals(str9)) {
                    this.f6663i = new RewardedVideo((Context) this, this.f7727m.f7251R3);
                }
                String str15 = this.f7727m.f7245Q3;
                if (str15 != null) {
                    str15.equals(str9);
                }
                String str16 = this.f7727m.f7269U3;
                if (str16 != null && !str16.equals(str9)) {
                    this.f6664j = new RewardedVideoAd(this, this.f7727m.f7269U3);
                }
                String str17 = this.f7727m.f7275V3;
                if (str17 != null && !str17.equals(str9)) {
                    this.f6665k = new StartAppAd(this);
                }
                ProgressDialog progressDialog = new ProgressDialog(this);
                this.f6661g = progressDialog;
                this.f6660f = view;
                if (!this.f7727m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                    abrir_secc(view);
                }
            }
        } else if (!this.f7734t.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
            this.f7724E = new AlertDialog.Builder(this);
            View inflate = getLayoutInflater().inflate(R.layout.likes_list, (ViewGroup) null);
            this.f7725F = inflate;
            if (Build.VERSION.SDK_INT > 20) {
                C1692config.m8168S0((ProgressBar) inflate.findViewById(R.id.likes_pb), this.f7727m.f7368l1);
            }
            this.f7724E.setView(this.f7725F);
            this.f7724E.setCancelable(true);
            ListView listView = (ListView) this.f7725F.findViewById(R.id.lv);
            listView.setCacheColorHint(0);
            C1770e0 e0Var = new C1770e0(this, R.layout.likes_item, this.f7721B, this.f7729o);
            this.f7722C = e0Var;
            listView.setAdapter(e0Var);
            listView.setOnItemClickListener(new C1805k());
            this.f7724E.show();
            if (this.f7721B.size() == 0) {
                C1808n nVar = this.f7723D;
                if (nVar == null || nVar.getStatus() != AsyncTask.Status.RUNNING) {
                    C1808n nVar2 = new C1808n();
                    this.f7723D = nVar2;
                    nVar2.execute(new String[0]);
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo7661e();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f7740z;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f7740z;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f7740z = this.f7727m.mo7474A0(this, false);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        boolean z;
        Uri e;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.compartir) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeFile = BitmapFactory.decodeFile(this.f7728n.getString("url").replace("file://", ""), options);
            try {
                File file = new File(getCacheDir(), "images");
                file.mkdirs();
                FileOutputStream fileOutputStream = new FileOutputStream(file + "/temporal.png");
                decodeFile.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                z = true;
            } catch (IOException e2) {
                z = false;
                e2.printStackTrace();
            }
            if (z && (e = FileProvider.m3280e(this, "british.xnews2.fileprovider", new File(new File(getCacheDir(), "images"), "temporal.png"))) != null) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.addFlags(1);
                intent.setType(getContentResolver().getType(e));
                intent.putExtra("android.intent.extra.STREAM", e);
                startActivity(Intent.createChooser(intent, getResources().getString(R.string.compartir)));
            }
            return true;
        } else if (itemId != R.id.guardar) {
            return super.onContextItemSelected(menuItem);
        } else {
            C1692config.m8174X(this.f7728n.getString("url"), this);
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        C1692config config = (C1692config) getApplicationContext();
        this.f7727m = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8306c(this);
        this.f6666l = new C1799e();
        this.f6656b = C1692config.m8189h("FFFFFFFF", this.f7727m.f7368l1);
        super.onCreate(bundle);
        setContentView(R.layout.fotogal);
        Bundle extras = getIntent().getExtras();
        this.f7728n = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f7728n.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        mo7661e();
        this.f7727m.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C1800f());
        searchManager.setOnDismissListener(new C1801g());
        this.f7740z = this.f7727m.mo7474A0(this, false);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f7738x = sharedPreferences;
        this.f7729o = sharedPreferences.getLong("idusu", 0);
        this.f7733s = this.f7738x.getString("cod", "");
        this.f7734t = this.f7728n.getString("nlikes");
        this.f7735u = this.f7728n.getString("idf");
        this.f7730p = this.f7728n.getInt("indf");
        this.f7736v = this.f7728n.getString("liked");
        this.f7737w = this.f7728n.getString("idusu_profile");
        this.f7721B = new ArrayList<>();
        TextView textView = (TextView) findViewById(R.id.tv_likes_n);
        findViewById(R.id.tv_likes_n).setBackgroundDrawable(getResources().getDrawable(R.drawable.likes_izq));
        textView.setTextColor(C1692config.f7101A5);
        textView.setText(this.f7734t);
        if (this.f7736v.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            str = getResources().getString(R.string.tegusta);
        } else {
            str = "";
        }
        ((TextView) findViewById(R.id.tv_likes)).setText(str);
        findViewById(R.id.iv_cerrar).setOnClickListener(this);
        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.tv_likes_n).setOnClickListener(this);
        String str2 = this.f7737w;
        if (str2.equals(this.f7729o + "")) {
            findViewById(R.id.iv_reportar).setVisibility(8);
            findViewById(R.id.iv_elim).setOnClickListener(this);
            findViewById(R.id.iv_elim).setVisibility(0);
        } else {
            findViewById(R.id.iv_reportar).setOnClickListener(this);
        }
        this.f7739y = (WebView) findViewById(R.id.webview);
        if (this.f7728n.getString("url").startsWith("file://")) {
            this.f7739y.getSettings().setAllowFileAccess(true);
            registerForContextMenu(this.f7739y);
            C1692config config2 = this.f7727m;
            String str3 = config2.f7313c1;
            String str4 = config2.f7319d1;
            int i = config2.f7318d;
            if (i != -1) {
                C1855l[] lVarArr = config2.f7231O1;
                str3 = lVarArr[i].f7916g;
                str4 = lVarArr[i].f7919h;
            }
            if (this.f7728n.containsKey("bg1")) {
                str3 = this.f7728n.getString("bg1");
                str4 = this.f7728n.getString("bg2");
            }
            if (!str3.equals("")) {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + str3), Color.parseColor("#" + str4)}));
                this.f7739y.setBackgroundColor(0);
            }
        }
        this.f7739y.setWebChromeClient(new C1802h());
        this.f7739y.getSettings().setBuiltInZoomControls(true);
        this.f7739y.getSettings().setSupportZoom(true);
        this.f7739y.setOnTouchListener(new C1803i());
        this.f7739y.getSettings().setUseWideViewPort(true);
        this.f7739y.getSettings().setLoadWithOverviewMode(true);
        this.f7739y.setWebViewClient(new C1804j());
        if (bundle == null) {
            this.f7739y.loadUrl(this.f7728n.getString("url"));
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        getMenuInflater().inflate(R.menu.m3, contextMenu);
        MenuItem findItem = contextMenu.findItem(R.id.guardar);
        String str = findItem.getTitle() + "";
        findItem.setTitle(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f7727m.f7384n3 == 0 || (cVar3 = this.f7740z) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f7727m.f7384n3 == 0 || (cVar2 = this.f7740z) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f7727m.f7384n3 == 0 || (cVar = this.f7740z) == null || (adColonyAdView = cVar.f6889d) == null)) {
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

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f7739y.canGoBack()) {
            this.f7739y.goBack();
            return true;
        }
        mo7660d();
        return true;
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f7727m.f7384n3 == 0 || (cVar = this.f7740z) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C1798d());
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f7739y.restoreState(bundle);
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (!(this.f7727m.f7384n3 == 0 || (cVar = this.f7740z) == null || (adView = cVar.f6886a) == null)) {
            adView.resume();
        }
        this.f7739y.onResume();
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f7720A = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f7720A) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f7720A = true;
        C1692config.m8175Y0(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f7739y.saveState(bundle);
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
        this.f7720A = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f7720A = true;
        C1692config.m8175Y0(this);
    }
}
