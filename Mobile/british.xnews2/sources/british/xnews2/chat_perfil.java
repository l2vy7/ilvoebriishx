package british.xnews2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
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
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Html;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.content.C0600b;
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
import com.facebook.AccessToken;
import com.facebook.C3448e;
import com.facebook.C3453h;
import com.facebook.C3572j;
import com.facebook.C3655r;
import com.facebook.GraphRequest;
import com.facebook.ads.AdView;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.login.C3615h;
import com.facebook.login.widget.LoginButton;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.auth.api.signin.C7065b;
import com.google.android.gms.tasks.OnSuccessListener;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import p001a0.C0008a;
import p250s5.C10971b;
import p250s5.C10975f;
import p272b9.C11188h;
import p307g8.C12725i;
import p312i9.C12788b;
import p312i9.C12789c;
import p316k9.C12823d;
import p317l8.C12831e;
import p337x8.C12957d;
import p337x8.C12960g;
import p339y8.C12982f;

public class chat_perfil extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    ProgressBar f6934A;

    /* renamed from: B */
    ListView f6935B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public long f6936C;

    /* renamed from: D */
    private int f6937D = 0;

    /* renamed from: E */
    private int f6938E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f6939F;

    /* renamed from: G */
    private int f6940G;

    /* renamed from: H */
    private int f6941H;

    /* renamed from: I */
    private int f6942I;

    /* renamed from: J */
    private int f6943J;

    /* renamed from: K */
    private int f6944K;

    /* renamed from: L */
    private int f6945L;

    /* renamed from: M */
    private int f6946M;

    /* renamed from: N */
    private boolean f6947N;

    /* renamed from: O */
    private ImageView f6948O;

    /* renamed from: P */
    private ImageView f6949P;

    /* renamed from: Q */
    private ImageView f6950Q;

    /* renamed from: R */
    private String f6951R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public String f6952S;

    /* renamed from: T */
    private String f6953T;

    /* renamed from: U */
    private String f6954U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public String f6955V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public String f6956W;

    /* renamed from: X */
    private Spinner f6957X;

    /* renamed from: Y */
    private Spinner f6958Y;

    /* renamed from: Z */
    private Spinner f6959Z;

    /* renamed from: l0 */
    private Spinner f6960l0;

    /* renamed from: m */
    C1692config f6961m;

    /* renamed from: m0 */
    private Spinner f6962m0;

    /* renamed from: n */
    boolean f6963n = false;

    /* renamed from: n0 */
    private Spinner f6964n0;

    /* renamed from: o */
    boolean f6965o;

    /* renamed from: o0 */
    private Spinner f6966o0;

    /* renamed from: p */
    boolean f6967p;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public SharedPreferences f6968p0;

    /* renamed from: q */
    boolean f6969q;

    /* renamed from: q0 */
    Bundle f6970q0;

    /* renamed from: r */
    boolean f6971r;

    /* renamed from: r0 */
    Long f6972r0;

    /* renamed from: s */
    boolean f6973s;

    /* renamed from: s0 */
    C3448e f6974s0;

    /* renamed from: t */
    boolean f6975t;

    /* renamed from: t0 */
    LoginButton f6976t0;

    /* renamed from: u */
    ProgressDialog f6977u;

    /* renamed from: u0 */
    C10971b f6978u0;

    /* renamed from: v */
    ProgressDialog f6979v;

    /* renamed from: w */
    ProgressDialog f6980w;

    /* renamed from: x */
    Dialog f6981x;

    /* renamed from: y */
    C1603c f6982y;

    /* renamed from: z */
    boolean f6983z = false;

    /* renamed from: british.xnews2.chat_perfil$a */
    class C1626a implements DialogInterface.OnClickListener {
        C1626a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            chat_perfil.this.startActivityForResult(intent, 2);
        }
    }

    /* renamed from: british.xnews2.chat_perfil$a0 */
    class C1627a0 implements SearchManager.OnDismissListener {
        C1627a0() {
        }

        public void onDismiss() {
            chat_perfil.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.chat_perfil$b */
    class C1628b implements DialogInterface.OnClickListener {
        C1628b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            chat_perfil chat_perfil = chat_perfil.this;
            if (!chat_perfil.f6961m.mo7500d1(chat_perfil, 107)) {
                chat_perfil.this.f6972r0 = Long.valueOf(System.currentTimeMillis());
                chat_perfil chat_perfil2 = chat_perfil.this;
                C1692config config = chat_perfil2.f6961m;
                config.mo7525s0(chat_perfil2, config.mo7505h0(chat_perfil2, 2));
            }
        }
    }

    /* renamed from: british.xnews2.chat_perfil$b0 */
    class C1629b0 implements C3453h<C3615h> {

        /* renamed from: british.xnews2.chat_perfil$b0$a */
        class C1630a implements GraphRequest.C3361g {

            /* renamed from: a */
            final /* synthetic */ AccessToken f6988a;

            /* renamed from: british.xnews2.chat_perfil$b0$a$a */
            class C1631a implements GraphRequest.C3360f {

                /* renamed from: a */
                final /* synthetic */ String f6990a;

                /* renamed from: b */
                final /* synthetic */ String f6991b;

                C1631a(String str, String str2) {
                    this.f6990a = str;
                    this.f6991b = str2;
                }

                /* renamed from: b */
                public void mo7382b(C3655r rVar) {
                    String str;
                    try {
                        str = rVar.mo12381h().getJSONObject("data").getString("is_silhouette");
                    } catch (Exception e) {
                        e.printStackTrace();
                        str = "true";
                    }
                    String str2 = str == "false" ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION;
                    C1630a aVar = C1630a.this;
                    new C1654k0(aVar.f6988a.mo11191r(), this.f6990a, "", this.f6991b, SessionDescription.SUPPORTED_SDP_VERSION, str2).execute(new String[0]);
                }
            }

            C1630a(AccessToken accessToken) {
                this.f6988a = accessToken;
            }

            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo7381a(org.json.JSONObject r4, com.facebook.C3655r r5) {
                /*
                    r3 = this;
                    java.lang.String r5 = "id"
                    java.lang.String r5 = r4.getString(r5)     // Catch:{ Exception -> 0x0042 }
                    java.lang.String r0 = "name"
                    java.lang.String r4 = r4.getString(r0)     // Catch:{  }
                    if (r5 == 0) goto L_0x0042
                    java.lang.String r0 = ""
                    boolean r1 = r5.equals(r0)
                    if (r1 != 0) goto L_0x0042
                    if (r4 == 0) goto L_0x0042
                    boolean r0 = r4.equals(r0)
                    if (r0 != 0) goto L_0x0042
                    com.facebook.AccessToken r0 = r3.f6988a
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "/"
                    r1.append(r2)
                    r1.append(r5)
                    java.lang.String r2 = "/picture?redirect=false"
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    british.xnews2.chat_perfil$b0$a$a r2 = new british.xnews2.chat_perfil$b0$a$a
                    r2.<init>(r5, r4)
                    com.facebook.GraphRequest r4 = com.facebook.GraphRequest.m11252J(r0, r1, r2)
                    r4.mo11251i()
                L_0x0042:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: british.xnews2.chat_perfil.C1629b0.C1630a.mo7381a(org.json.JSONObject, com.facebook.r):void");
            }
        }

        C1629b0() {
        }

        /* renamed from: a */
        public void mo7377a(C3572j jVar) {
        }

        /* renamed from: b */
        public void onSuccess(C3615h hVar) {
            GraphRequest K = GraphRequest.m11253K(hVar.mo12267a(), new C1630a(hVar.mo12267a()));
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,name");
            K.mo11246a0(bundle);
            K.mo11251i();
        }

        public void onCancel() {
        }
    }

    /* renamed from: british.xnews2.chat_perfil$c */
    class C1632c implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f6993a;

        C1632c(AlertDialog alertDialog) {
            this.f6993a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f6993a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            Button button2 = this.f6993a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$c0 */
    class C1633c0 implements View.OnClickListener {
        C1633c0() {
        }

        public void onClick(View view) {
            chat_perfil.this.f6976t0.performClick();
        }
    }

    /* renamed from: british.xnews2.chat_perfil$d */
    class C1634d implements OnSuccessListener<Location> {
        C1634d() {
        }

        /* renamed from: a */
        public void onSuccess(Location location) {
            if (location != null) {
                String str = location.getLatitude() + "";
                SharedPreferences.Editor edit = chat_perfil.this.getSharedPreferences("sh", 0).edit();
                edit.putString("x", str);
                edit.putString("y", location.getLongitude() + "");
                edit.commit();
            }
        }
    }

    /* renamed from: british.xnews2.chat_perfil$d0 */
    class C1635d0 implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C7065b f6997b;

        C1635d0(C7065b bVar) {
            this.f6997b = bVar;
        }

        public void onClick(View view) {
            chat_perfil.this.startActivityForResult(this.f6997b.mo29114g(), 104);
        }
    }

    /* renamed from: british.xnews2.chat_perfil$e */
    class C1636e implements DialogInterface.OnClickListener {
        C1636e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            chat_perfil.this.finish();
        }
    }

    /* renamed from: british.xnews2.chat_perfil$e0 */
    class C1637e0 implements View.OnClickListener {
        C1637e0() {
        }

        public void onClick(View view) {
            if (chat_perfil.this.f6956W != null) {
                chat_perfil.this.mo7359n();
            } else {
                new C1651j0().execute(new String[0]);
            }
        }
    }

    /* renamed from: british.xnews2.chat_perfil$f */
    class C1638f implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7001a;

        C1638f(AlertDialog alertDialog) {
            this.f7001a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7001a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$f0 */
    class C1639f0 implements DialogInterface.OnClickListener {
        C1639f0() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            chat_perfil.this.mo7372p();
        }
    }

    /* renamed from: british.xnews2.chat_perfil$g */
    class C1640g implements DialogInterface.OnClickListener {
        C1640g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(chat_perfil.this, eliminarperfil.class);
            chat_perfil chat_perfil = chat_perfil.this;
            if (chat_perfil.f6967p) {
                intent = C1692config.m8198r(intent, chat_perfil.f6970q0);
            } else {
                intent.putExtra("idsecc", chat_perfil.f6939F);
            }
            chat_perfil chat_perfil2 = chat_perfil.this;
            if (chat_perfil2.f6961m.f7427t4 != 2 || chat_perfil2.f6973s) {
                intent.putExtra("es_root", true);
            }
            intent.putExtra("desde_main", chat_perfil.this.f6971r);
            intent.putExtra("desde_main_oblig", chat_perfil.this.f6973s);
            chat_perfil chat_perfil3 = chat_perfil.this;
            chat_perfil3.f6659e = false;
            chat_perfil3.f6657c = true;
            Intent intent2 = new Intent();
            intent2.putExtra("finalizar", true);
            chat_perfil.this.setResult(-1, intent2);
            chat_perfil.this.startActivity(intent);
            chat_perfil.this.finish();
        }
    }

    /* renamed from: british.xnews2.chat_perfil$g0 */
    class C1641g0 implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7005a;

        C1641g0(AlertDialog alertDialog) {
            this.f7005a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7005a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$h */
    class C1642h implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7007a;

        C1642h(AlertDialog alertDialog) {
            this.f7007a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7007a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            Button button2 = this.f7007a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$h0 */
    private class C1643h0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        Uri f7009a;

        public C1643h0(Uri uri) {
            this.f7009a = uri;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
            r5.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x009a, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
            r5.printStackTrace();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0095 A[ExcHandler: OutOfMemoryError (r5v5 'e' java.lang.OutOfMemoryError A[CUSTOM_DECLARE]), Splitter:B:13:0x0056] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = ""
                java.lang.String r0 = "idfb"
                android.net.Uri r1 = r4.f7009a     // Catch:{ MalformedURLException -> 0x0054 }
                java.lang.String r1 = r1.getQueryParameter(r0)     // Catch:{ MalformedURLException -> 0x0054 }
                boolean r1 = r1.equals(r5)     // Catch:{ MalformedURLException -> 0x0054 }
                if (r1 != 0) goto L_0x0032
                java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0054 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0054 }
                r1.<init>()     // Catch:{ MalformedURLException -> 0x0054 }
                java.lang.String r2 = "https://graph.facebook.com/"
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0054 }
                android.net.Uri r2 = r4.f7009a     // Catch:{ MalformedURLException -> 0x0054 }
                java.lang.String r0 = r2.getQueryParameter(r0)     // Catch:{ MalformedURLException -> 0x0054 }
                r1.append(r0)     // Catch:{ MalformedURLException -> 0x0054 }
                java.lang.String r0 = "/picture?type=large"
                r1.append(r0)     // Catch:{ MalformedURLException -> 0x0054 }
                java.lang.String r0 = r1.toString()     // Catch:{ MalformedURLException -> 0x0054 }
                r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x0054 }
                goto L_0x0055
            L_0x0032:
                android.net.Uri r0 = r4.f7009a     // Catch:{ MalformedURLException -> 0x0054 }
                java.lang.String r1 = "idgoogle"
                java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ MalformedURLException -> 0x0054 }
                boolean r5 = r0.equals(r5)     // Catch:{ MalformedURLException -> 0x0054 }
                if (r5 != 0) goto L_0x004e
                java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0054 }
                android.net.Uri r0 = r4.f7009a     // Catch:{ MalformedURLException -> 0x0054 }
                java.lang.String r1 = "tfoto"
                java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ MalformedURLException -> 0x0054 }
                r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x0054 }
                goto L_0x0055
            L_0x004e:
                r5 = 0
                java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch:{ MalformedURLException -> 0x0054 }
                return r5
            L_0x0054:
                r5 = 0
            L_0x0055:
                r0 = 1
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                r5.setDoInput(r0)     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                r1 = 10000(0x2710, float:1.4013E-41)
                r5.setConnectTimeout(r1)     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                r1 = 20000(0x4e20, float:2.8026E-41)
                r5.setReadTimeout(r1)     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                r5.connect()     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                java.io.InputStream r1 = r5.getInputStream()     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                r1.close()     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                r5.disconnect()     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                british.xnews2.chat_perfil r5 = british.xnews2.chat_perfil.this     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                british.xnews2.config r1 = r5.f6961m     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                r3 = 2
                java.io.File r5 = r1.mo7505h0(r5, r3)     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0090, OutOfMemoryError -> 0x0095 }
                r1.<init>(r5)     // Catch:{ Exception -> 0x0090, OutOfMemoryError -> 0x0095 }
                android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0090, OutOfMemoryError -> 0x0095 }
                r3 = 100
                r2.compress(r5, r3, r1)     // Catch:{ Exception -> 0x0090, OutOfMemoryError -> 0x0095 }
                goto L_0x009e
            L_0x0090:
                r5 = move-exception
                r5.printStackTrace()     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x0095 }
                goto L_0x009e
            L_0x0095:
                r5 = move-exception
                r5.printStackTrace()
                goto L_0x009e
            L_0x009a:
                r5 = move-exception
                r5.printStackTrace()
            L_0x009e:
                java.lang.Byte r5 = java.lang.Byte.valueOf(r0)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.chat_perfil.C1643h0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            chat_perfil.this.mo7355i();
        }
    }

    /* renamed from: british.xnews2.chat_perfil$i */
    class C1644i implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7011a;

        C1644i(AlertDialog alertDialog) {
            this.f7011a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7011a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$i0 */
    private class C1645i0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f7013a;

        /* renamed from: b */
        boolean f7014b;

        /* renamed from: british.xnews2.chat_perfil$i0$a */
        class C1646a implements DialogInterface.OnShowListener {
            C1646a() {
            }

            public void onShow(DialogInterface dialogInterface) {
                C1692config.m8168S0((ProgressBar) chat_perfil.this.f6977u.findViewById(16908301), chat_perfil.this.f6656b);
            }
        }

        /* renamed from: british.xnews2.chat_perfil$i0$b */
        class C1647b implements DialogInterface.OnClickListener {
            C1647b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                chat_perfil.this.finish();
            }
        }

        /* renamed from: british.xnews2.chat_perfil$i0$c */
        class C1648c implements DialogInterface.OnClickListener {
            C1648c() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SharedPreferences.Editor edit = chat_perfil.this.f6968p0.edit();
                edit.putBoolean("pp_aceptada", true);
                edit.commit();
                chat_perfil.this.mo7373q();
            }
        }

        /* renamed from: british.xnews2.chat_perfil$i0$d */
        class C1649d implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7019a;

            C1649d(AlertDialog alertDialog) {
                this.f7019a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7019a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
                if (C1645i0.this.f7014b) {
                    Button button2 = this.f7019a.getButton(-2);
                    button2.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
                }
            }
        }

        public C1645i0(boolean z) {
            this.f7014b = z;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:17|16|20|21|(0)|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0095, code lost:
            r1 = r6;
            r6 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
            r6.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
            r1.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0098 */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = british.xnews2.C1692config.f7107G5
                r6.append(r0)
                java.lang.String r0 = "privacy.e-droid.net/privacy.php?desde_app=1&ida="
                r6.append(r0)
                r0 = 2260177(0x227cd1, float:3.167183E-39)
                r6.append(r0)
                java.lang.String r0 = "&idl="
                r6.append(r0)
                java.util.Locale r0 = java.util.Locale.getDefault()
                java.lang.String r0 = r0.getLanguage()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r0 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00a8 }
                r1.<init>(r6)     // Catch:{ MalformedURLException -> 0x00a8 }
                r6 = 0
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x0098 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x0098 }
                r6 = 1
                r1.setDoInput(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r1.setReadTimeout(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r1.setRequestProperty(r6, r2)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.io.InputStream r6 = r1.getInputStream()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r3.<init>(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r6.<init>()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            L_0x005c:
                java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                if (r3 == 0) goto L_0x0077
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r4.<init>()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r4.append(r3)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r6.append(r3)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                goto L_0x005c
            L_0x0077:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r5.f7013a = r6     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.lang.String r2 = "@EURO@"
                java.lang.String r3 = "€"
                java.lang.String r6 = r6.replace(r2, r3)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r5.f7013a = r6     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r1.disconnect()
                r6 = 0
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x0090:
                r6 = move-exception
                goto L_0x00a2
            L_0x0092:
                r6 = r1
                goto L_0x0098
            L_0x0094:
                r0 = move-exception
                r1 = r6
                r6 = r0
                goto L_0x00a2
            L_0x0098:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0094 }
                if (r6 == 0) goto L_0x00a1
                r6.disconnect()
            L_0x00a1:
                return r0
            L_0x00a2:
                if (r1 == 0) goto L_0x00a7
                r1.disconnect()
            L_0x00a7:
                throw r6
            L_0x00a8:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.chat_perfil.C1645i0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            try {
                chat_perfil.this.f6977u.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() != 0) {
                chat_perfil chat_perfil = chat_perfil.this;
                C1692config.m8148C0(chat_perfil, chat_perfil.getString(R.string.error_http_tit), chat_perfil.this.getString(R.string.error_http), chat_perfil.this.f6656b);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(chat_perfil.this);
            builder.setMessage(Html.fromHtml(this.f7013a));
            if (this.f7014b) {
                builder.setCancelable(false);
                builder.setNegativeButton(R.string.cancelar, new C1647b());
                builder.setPositiveButton(R.string.aceptar, new C1648c());
            } else {
                builder.setCancelable(true);
                builder.setPositiveButton(chat_perfil.this.getString(R.string.cerrar), (DialogInterface.OnClickListener) null);
            }
            AlertDialog create = builder.create();
            if (!chat_perfil.this.f6656b.equals("")) {
                create.setOnShowListener(new C1649d(create));
            }
            try {
                create.show();
            } catch (Exception unused2) {
            }
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused3) {
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            chat_perfil.this.f6977u = new ProgressDialog(chat_perfil.this);
            chat_perfil chat_perfil = chat_perfil.this;
            chat_perfil.f6977u.setMessage(chat_perfil.getString(R.string.cargando));
            chat_perfil.this.f6977u.setIndeterminate(true);
            if (Build.VERSION.SDK_INT > 20 && !chat_perfil.this.f6656b.equals("")) {
                chat_perfil.this.f6977u.setOnShowListener(new C1646a());
            }
            chat_perfil.this.f6977u.show();
        }
    }

    /* renamed from: british.xnews2.chat_perfil$j */
    class C1650j implements DialogInterface.OnClickListener {
        C1650j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            new C1662m0().execute(new String[0]);
        }
    }

    /* renamed from: british.xnews2.chat_perfil$j0 */
    private class C1651j0 extends AsyncTask<String, Void, String> {

        /* renamed from: british.xnews2.chat_perfil$j0$a */
        class C1652a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7023a;

            C1652a(AlertDialog alertDialog) {
                this.f7023a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7023a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            }
        }

        private C1651j0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/codigo_generar.php?idusu=" + chat_perfil.this.f6936C + "&c=" + chat_perfil.this.f6952S);
            eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
            String str = "";
            try {
                C12725i b = hVar.mo43518a(eVar).mo47805b();
                if (b != null) {
                    str = C12823d.m54372d(b);
                }
                if (b != null) {
                    try {
                        b.mo43578s();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            hVar.mo43519b().shutdown();
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            AlertDialog.Builder builder = new AlertDialog.Builder(chat_perfil.this);
            builder.setCancelable(false).setPositiveButton(chat_perfil.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null);
            int indexOf = str.indexOf("ANDROID:OK COD:");
            if (indexOf != -1) {
                int i = indexOf + 15;
                int indexOf2 = str.indexOf("-", i);
                if (indexOf2 != -1) {
                    chat_perfil.this.f6956W = str.substring(i, indexOf2);
                    chat_perfil.this.mo7359n();
                    return;
                }
                return;
            }
            builder.setMessage(R.string.error_http);
            AlertDialog create = builder.create();
            if (!chat_perfil.this.f6656b.equals("")) {
                create.setOnShowListener(new C1652a(create));
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: british.xnews2.chat_perfil$k */
    class C1653k extends AdColonyInterstitialListener {
        C1653k() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            chat_perfil chat_perfil = chat_perfil.this;
            if (chat_perfil.f6983z) {
                chat_perfil.abrir_secc(chat_perfil.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            chat_perfil.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            chat_perfil.this.f6661g.cancel();
            chat_perfil chat_perfil = chat_perfil.this;
            chat_perfil.abrir_secc(chat_perfil.f6660f);
        }
    }

    /* renamed from: british.xnews2.chat_perfil$k0 */
    private class C1654k0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f7026a;

        /* renamed from: b */
        String f7027b;

        /* renamed from: c */
        String f7028c;

        /* renamed from: d */
        String f7029d;

        /* renamed from: e */
        String f7030e;

        /* renamed from: f */
        String f7031f;

        /* renamed from: british.xnews2.chat_perfil$k0$a */
        class C1655a implements DialogInterface.OnShowListener {
            C1655a() {
            }

            public void onShow(DialogInterface dialogInterface) {
                C1692config.m8168S0((ProgressBar) chat_perfil.this.f6979v.findViewById(16908301), chat_perfil.this.f6656b);
            }
        }

        public C1654k0(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f7026a = str;
            this.f7027b = str2;
            this.f7028c = str3;
            this.f7029d = str4;
            this.f7030e = str5;
            this.f7031f = str6;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/guardar_token.php?desde_app=1");
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                gVar.mo48144c("u", new C12982f(chat_perfil.this.f6936C + ""));
                gVar.mo48144c("cod_g", new C12982f(chat_perfil.this.f6955V));
                gVar.mo48144c("codigo", new C12982f(chat_perfil.this.f6952S));
                gVar.mo48144c("idapp", new C12982f("2260177"));
                gVar.mo48144c("x", new C12982f(chat_perfil.this.f6968p0.getString("x", "")));
                gVar.mo48144c("y", new C12982f(chat_perfil.this.f6968p0.getString("y", "")));
                gVar.mo48144c("tk", new C12982f(this.f7026a));
                if (!this.f7028c.equals("")) {
                    gVar.mo48144c("idgoogle_param", new C12982f(this.f7028c));
                } else {
                    gVar.mo48144c("idfb_param", new C12982f(this.f7027b));
                }
                gVar.mo48144c("nombre", new C12982f(this.f7029d));
                gVar.mo48144c("gender", new C12982f(this.f7030e));
                gVar.mo48144c("tfoto", new C12982f(this.f7031f));
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
            String str2;
            String str3;
            int indexOf = str.indexOf("OK COD:");
            if (indexOf == -1) {
                try {
                    chat_perfil.this.f6979v.dismiss();
                } catch (Exception unused) {
                }
                chat_perfil chat_perfil = chat_perfil.this;
                C1692config.m8148C0(chat_perfil, chat_perfil.getString(R.string.error_http_tit), chat_perfil.this.getString(R.string.error_http), chat_perfil.this.f6656b);
                return;
            }
            int i = indexOf + 7;
            String substring = str.substring(i, i + 6);
            int indexOf2 = str.indexOf(" IDUSU:");
            String str4 = "";
            if (indexOf2 != -1) {
                int i2 = indexOf2 + 7;
                String substring2 = str.substring(i2, str.indexOf("@", i2));
                int indexOf3 = str.indexOf(" COD_G:");
                if (indexOf3 != -1) {
                    int i3 = indexOf3 + 7;
                    str3 = str.substring(i3, str.indexOf("@", i3));
                } else {
                    str3 = str4;
                }
                int indexOf4 = str.indexOf(" DATOS_USU:");
                if (indexOf4 != -1) {
                    str4 = str.substring(indexOf4 + 11);
                }
                str2 = str4;
                str4 = substring2;
            } else {
                str2 = str4;
                str3 = str2;
            }
            chat_perfil.this.mo7357l(Uri.parse("appac://fb_2260177?action=ok&nombre=" + this.f7029d + "&tfoto=" + this.f7031f + "&gender=" + this.f7030e + "&idfb=" + this.f7027b + "&idgoogle=" + this.f7028c + "&codigo=" + substring + "&idusu=" + str4 + "&cod_g=" + str3 + "&datos_usu=" + str2));
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            chat_perfil.this.f6979v = new ProgressDialog(chat_perfil.this);
            chat_perfil chat_perfil = chat_perfil.this;
            chat_perfil.f6979v.setMessage(chat_perfil.getString(R.string.guardando));
            chat_perfil.this.f6979v.setIndeterminate(true);
            if (Build.VERSION.SDK_INT > 20 && !chat_perfil.this.f6656b.equals("")) {
                chat_perfil.this.f6979v.setOnShowListener(new C1655a());
            }
            chat_perfil.this.f6979v.show();
        }
    }

    /* renamed from: british.xnews2.chat_perfil$l */
    class C1656l implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7034a;

        C1656l(AlertDialog alertDialog) {
            this.f7034a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7034a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            Button button2 = this.f7034a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$l0 */
    private class C1657l0 extends AsyncTask<String, Void, String> {

        /* renamed from: british.xnews2.chat_perfil$l0$a */
        class C1658a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7037a;

            C1658a(AlertDialog alertDialog) {
                this.f7037a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7037a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.chat_perfil$l0$b */
        class C1659b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7039a;

            C1659b(AlertDialog alertDialog) {
                this.f7039a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7039a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.chat_perfil$l0$c */
        class C1660c implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7041a;

            C1660c(AlertDialog alertDialog) {
                this.f7041a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7041a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            }
        }

        private C1657l0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/modif_contra.php?idusu=" + chat_perfil.this.f6936C + "&c=" + chat_perfil.this.f6952S);
            C12960g gVar = new C12960g();
            try {
                gVar.mo48144c("contra_act", new C12982f(((EditText) chat_perfil.this.f6981x.findViewById(R.id.et_contra_act)).getText().toString().trim()));
                gVar.mo48144c("contra_nueva", new C12982f(((EditText) chat_perfil.this.f6981x.findViewById(R.id.et_contra_nueva)).getText().toString().trim()));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            eVar.mo47986B(gVar);
            eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
            String str = "";
            try {
                C12725i b = hVar.mo43518a(eVar).mo47805b();
                if (b != null) {
                    str = C12823d.m54372d(b);
                }
                if (b != null) {
                    try {
                        b.mo43578s();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            hVar.mo43519b().shutdown();
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            chat_perfil.this.f6934A.setVisibility(8);
            AlertDialog.Builder builder = new AlertDialog.Builder(chat_perfil.this);
            builder.setCancelable(false).setPositiveButton(chat_perfil.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null);
            if (str.indexOf("ANDROID:OK") != -1) {
                chat_perfil.this.f6981x.dismiss();
                builder.setMessage(R.string.contra_modificada);
                AlertDialog create = builder.create();
                if (!chat_perfil.this.f6656b.equals("")) {
                    create.setOnShowListener(new C1658a(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            } else if (str.indexOf("ANDROID:KO -CONTRA-") != -1) {
                chat_perfil.this.f6981x.findViewById(R.id.ll_contenido).setVisibility(0);
                builder.setMessage(R.string.contra_ko);
                AlertDialog create2 = builder.create();
                if (!chat_perfil.this.f6656b.equals("")) {
                    create2.setOnShowListener(new C1659b(create2));
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                chat_perfil.this.f6981x.findViewById(R.id.ll_contenido).setVisibility(0);
                builder.setMessage(R.string.error_http);
                AlertDialog create3 = builder.create();
                if (!chat_perfil.this.f6656b.equals("")) {
                    create3.setOnShowListener(new C1660c(create3));
                }
                create3.show();
                ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            chat_perfil.this.f6981x.findViewById(R.id.ll_contenido).setVisibility(4);
            chat_perfil.this.f6934A.setVisibility(0);
        }
    }

    /* renamed from: british.xnews2.chat_perfil$m */
    class C1661m implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7043a;

        C1661m(AlertDialog alertDialog) {
            this.f7043a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7043a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$m0 */
    private class C1662m0 extends AsyncTask<String, Void, String> {

        /* renamed from: british.xnews2.chat_perfil$m0$a */
        class C1663a implements DialogInterface.OnShowListener {
            C1663a() {
            }

            public void onShow(DialogInterface dialogInterface) {
                C1692config.m8168S0((ProgressBar) chat_perfil.this.f6980w.findViewById(16908301), chat_perfil.this.f6656b);
            }
        }

        /* renamed from: british.xnews2.chat_perfil$m0$b */
        class C1664b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7047a;

            C1664b(AlertDialog alertDialog) {
                this.f7047a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7047a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.chat_perfil$m0$c */
        class C1665c implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7049a;

            C1665c(AlertDialog alertDialog) {
                this.f7049a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7049a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.chat_perfil$m0$d */
        class C1666d implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7051a;

            C1666d(AlertDialog alertDialog) {
                this.f7051a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7051a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.chat_perfil$m0$e */
        class C1667e implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7053a;

            C1667e(AlertDialog alertDialog) {
                this.f7053a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7053a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            }
        }

        private C1662m0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/recordar_contra.php?idapp=" + 2260177 + "&idl=" + Locale.getDefault().getLanguage());
            C12960g gVar = new C12960g();
            try {
                gVar.mo48144c("email", new C12982f(((EditText) chat_perfil.this.findViewById(R.id.c_email)).getText().toString().trim()));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            eVar.mo47986B(gVar);
            eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
            String str = "";
            try {
                C12725i b = hVar.mo43518a(eVar).mo47805b();
                if (b != null) {
                    str = C12823d.m54372d(b);
                }
                if (b != null) {
                    try {
                        b.mo43578s();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            hVar.mo43519b().shutdown();
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            try {
                chat_perfil.this.f6980w.dismiss();
            } catch (Exception unused) {
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(chat_perfil.this);
            builder.setCancelable(false).setPositiveButton(chat_perfil.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null);
            if (str.indexOf("ANDROID:OK") != -1) {
                builder.setMessage(R.string.contra_enviada);
                AlertDialog create = builder.create();
                if (!chat_perfil.this.f6656b.equals("")) {
                    create.setOnShowListener(new C1664b(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            } else if (str.indexOf("ANDROID:KO -ESPERA-") != -1) {
                builder.setMessage(R.string.contra_espera);
                AlertDialog create2 = builder.create();
                if (!chat_perfil.this.f6656b.equals("")) {
                    create2.setOnShowListener(new C1665c(create2));
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (str.indexOf("ANDROID:KO -NOTFOUND-") != -1) {
                builder.setMessage(R.string.email_noencontrado);
                AlertDialog create3 = builder.create();
                if (!chat_perfil.this.f6656b.equals("")) {
                    create3.setOnShowListener(new C1666d(create3));
                }
                create3.show();
                ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                builder.setMessage(R.string.error_http);
                AlertDialog create4 = builder.create();
                if (!chat_perfil.this.f6656b.equals("")) {
                    create4.setOnShowListener(new C1667e(create4));
                }
                create4.show();
                ((TextView) create4.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            try {
                chat_perfil.this.f6981x.dismiss();
            } catch (Exception unused) {
            }
            chat_perfil.this.f6980w = new ProgressDialog(chat_perfil.this);
            chat_perfil chat_perfil = chat_perfil.this;
            chat_perfil.f6980w.setMessage(chat_perfil.getString(R.string.enviando));
            chat_perfil.this.f6980w.setIndeterminate(true);
            if (Build.VERSION.SDK_INT > 20) {
                chat_perfil.this.f6980w.setOnShowListener(new C1663a());
            }
            chat_perfil.this.f6980w.show();
        }
    }

    /* renamed from: british.xnews2.chat_perfil$n */
    class C1668n implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7055a;

        C1668n(AlertDialog alertDialog) {
            this.f7055a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7055a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$o */
    class C1669o implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7057a;

        C1669o(AlertDialog alertDialog) {
            this.f7057a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7057a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$p */
    class C1670p implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7059a;

        C1670p(AlertDialog alertDialog) {
            this.f7059a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7059a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$q */
    class C1671q implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7061a;

        C1671q(AlertDialog alertDialog) {
            this.f7061a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7061a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$r */
    class C1672r implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7063a;

        C1672r(AlertDialog alertDialog) {
            this.f7063a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7063a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$s */
    class C1673s implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7065a;

        C1673s(AlertDialog alertDialog) {
            this.f7065a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7065a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$t */
    class C1674t implements DialogInterface.OnClickListener {
        C1674t() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: british.xnews2.chat_perfil$u */
    class C1675u implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7068a;

        C1675u(AlertDialog alertDialog) {
            this.f7068a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7068a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat_perfil$v */
    class C1676v implements SearchManager.OnCancelListener {
        C1676v() {
        }

        public void onCancel() {
            chat_perfil chat_perfil = chat_perfil.this;
            chat_perfil.f6657c = false;
            chat_perfil.setResult(0);
        }
    }

    /* renamed from: british.xnews2.chat_perfil$w */
    class C1677w implements View.OnClickListener {
        C1677w() {
        }

        public void onClick(View view) {
            chat_perfil.this.f6981x.dismiss();
        }
    }

    /* renamed from: british.xnews2.chat_perfil$x */
    class C1678x implements View.OnClickListener {

        /* renamed from: british.xnews2.chat_perfil$x$a */
        class C1679a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7073a;

            C1679a(AlertDialog alertDialog) {
                this.f7073a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7073a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat_perfil.this.f6656b));
            }
        }

        C1678x() {
        }

        public void onClick(View view) {
            int i;
            boolean z;
            AlertDialog.Builder builder = new AlertDialog.Builder(chat_perfil.this);
            builder.setCancelable(false).setPositiveButton(chat_perfil.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null);
            String trim = ((EditText) chat_perfil.this.f6981x.findViewById(R.id.et_contra_act)).getText().toString().trim();
            String trim2 = ((EditText) chat_perfil.this.f6981x.findViewById(R.id.et_contra_nueva)).getText().toString().trim();
            String trim3 = ((EditText) chat_perfil.this.f6981x.findViewById(R.id.et_contra_repe)).getText().toString().trim();
            if (trim.isEmpty() || trim2.isEmpty() || trim3.isEmpty()) {
                z = false;
                i = R.string.falta_alguno;
            } else if (!trim2.equals(trim3)) {
                z = false;
                i = R.string.contra_noigual;
            } else {
                z = true;
                i = 0;
            }
            if (!z) {
                builder.setMessage(i);
                AlertDialog create = builder.create();
                if (!chat_perfil.this.f6656b.equals("")) {
                    create.setOnShowListener(new C1679a(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            } else {
                new C1657l0().execute(new String[0]);
            }
        }
    }

    /* renamed from: british.xnews2.chat_perfil$y */
    class C1680y extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f7075a;

        /* renamed from: british.xnews2.chat_perfil$y$a */
        class C1681a extends FullScreenContentCallback {
            C1681a() {
            }

            public void onAdDismissedFullScreenContent() {
                chat_perfil chat_perfil = chat_perfil.this;
                if (chat_perfil.f6983z) {
                    chat_perfil.abrir_secc(chat_perfil.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                chat_perfil chat_perfil = chat_perfil.this;
                chat_perfil.abrir_secc(chat_perfil.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.chat_perfil$y$b */
        class C1682b implements OnUserEarnedRewardListener {
            C1682b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C1680y yVar = C1680y.this;
                chat_perfil.this.f6983z = true;
                C1692config.m8175Y0(yVar.f7075a);
            }
        }

        C1680y(Context context) {
            this.f7075a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            chat_perfil.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C1681a());
            rewardedAd.show((Activity) this.f7075a, new C1682b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            chat_perfil chat_perfil = chat_perfil.this;
            if (!chat_perfil.f6961m.mo7502f(this.f7075a, chat_perfil.f6663i)) {
                chat_perfil.this.f6661g.cancel();
                chat_perfil chat_perfil2 = chat_perfil.this;
                chat_perfil2.abrir_secc(chat_perfil2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.chat_perfil$z */
    class C1683z implements AdDisplayListener {
        C1683z() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            chat_perfil chat_perfil = chat_perfil.this;
            if (chat_perfil.f6983z) {
                chat_perfil.abrir_secc(chat_perfil.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: h */
    private int m8113h() {
        return this.f6961m.mo7505h0(this, 2).exists() ? 1 : 0;
    }

    /* renamed from: k */
    private void m8114k(Context context) {
        this.f6662h = new C1680y(context);
    }

    /* renamed from: o */
    private void m8115o(int i, boolean z) {
        Bitmap bitmap;
        File h0 = this.f6961m.mo7505h0(this, i);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(h0.getPath(), options);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            if (!(i2 <= 200 && i3 <= 200)) {
                int round = Math.round(((float) i2) / ((float) C1692config.m8193n(i2, i3, 200, 200)));
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = round;
                bitmap = BitmapFactory.decodeFile(h0.getPath(), options2);
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(h0));
            }
            ImageView imageView = this.f6948O;
            ImageView imageView2 = this.f6950Q;
            if (!z) {
                this.f6951R = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            }
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
            C1692config config = this.f6961m;
            int i4 = config.f7393o5;
            if ((i4 != 1 && i4 != 2) || !config.f7407q5 || !this.f6968p0.getBoolean("logineado_fb", false)) {
                imageView2.setVisibility(0);
            }
            imageView.setBackgroundColor(0);
        } catch (FileNotFoundException | IOException unused) {
        }
    }

    /* renamed from: r */
    private void m8116r() {
        this.f6951R = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        AlertDialog create = new AlertDialog.Builder(this).setCancelable(true).setPositiveButton(getString(R.string.tomardecamara), new C1628b()).setNegativeButton(getString(R.string.tomardesd), new C1626a()).setMessage(R.string.tomarfoto).create();
        if (!this.f6656b.equals("")) {
            create.setOnShowListener(new C1632c(create));
        }
        create.show();
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f6961m.mo7510j0(view, this);
        try {
            Intent intent = j0.f7842a;
            if (intent != null && intent.getComponent().getClassName().endsWith(".preperfil")) {
                return;
            }
        } catch (Exception unused) {
        }
        if (j0.f7843b) {
            this.f6657c = true;
            Intent intent2 = new Intent();
            intent2.putExtra("finalizar", true);
            intent2.putExtra("finalizar_app", j0.f7844c);
            setResult(-1, intent2);
        }
        if (j0.f7845d) {
            startActivityForResult(j0.f7842a, 0);
        } else {
            Intent intent3 = j0.f7842a;
            if (intent3 != null) {
                if (j0.f7843b) {
                    this.f6659e = false;
                    if (this.f6961m.f7427t4 != 2) {
                        intent3.putExtra("es_root", true);
                    }
                    try {
                        startActivity(j0.f7842a);
                    } catch (Exception unused2) {
                    }
                } else {
                    startActivityForResult(intent3, 0);
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

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo7355i() {
        Intent intent;
        try {
            this.f6979v.dismiss();
        } catch (Exception unused) {
        }
        try {
            if (this.f6961m.mo7505h0(this, 2).exists()) {
                C1692config.m8202w(this.f6961m.mo7505h0(this, 2), this.f6961m.mo7516l0(this, 1));
            } else {
                this.f6961m.mo7516l0(this, 1).delete();
            }
        } catch (Exception unused2) {
        }
        int i = 0;
        if (this.f6971r) {
            this.f6659e = false;
            this.f6657c = true;
            Intent intent2 = new Intent();
            intent2.putExtra("finalizar", true);
            setResult(-1, intent2);
            if ((this.f6940G == 2 && !this.f6961m.mo7505h0(this, 2).exists()) || ((this.f6941H == 2 && (this.f6968p0.getInt("fnac_d", 0) == 0 || this.f6968p0.getInt("fnac_m", 0) == 0 || this.f6968p0.getInt("fnac_a", 0) == 0)) || ((this.f6942I == 2 && this.f6968p0.getInt("sexo", 0) == 0) || (this.f6943J == 2 && this.f6968p0.getString("descr", "").equals(""))))) {
                Intent intent3 = new Intent(this, chat_perfil.class);
                intent3.putExtra("desde_main", true);
                intent3.putExtra("desde_main_oblig", true);
                this.f6961m.f7312c = 900;
                intent3.putExtra("es_root", this.f6969q);
                startActivity(intent3);
                finish();
            } else if (this.f6961m.f7439v2 <= 1 || this.f6968p0.getBoolean("glob_acceso_validado", false)) {
                int i2 = this.f6961m.f7427t4;
                if (i2 == 2 && !this.f6973s) {
                    finish();
                } else if (i2 == 2) {
                    Intent intent4 = new Intent(this, t_menugrid.class);
                    this.f6961m.f7312c = 900;
                    SharedPreferences.Editor edit = this.f6968p0.edit();
                    edit.putInt("ind_secc_sel", this.f6961m.f7312c);
                    edit.commit();
                    intent4.putExtra("es_root", true);
                    startActivity(intent4);
                    finish();
                } else {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        C1855l[] lVarArr = this.f6961m.f7231O1;
                        if (i3 >= lVarArr.length) {
                            break;
                        } else if (!lVarArr[i3].f7848B) {
                            z = true;
                        } else {
                            i3++;
                        }
                    }
                    if (z) {
                        i = i3;
                    }
                    C1845j B = this.f6961m.mo7475B(Integer.valueOf(i), this);
                    B.f7842a.putExtra("es_root", true);
                    startActivity(B.f7842a);
                    finish();
                }
            } else {
                Intent intent5 = new Intent(this, codigo.class);
                intent5.putExtra("es_root", true);
                startActivity(intent5);
                finish();
            }
        } else {
            if (this.f6970q0.getBoolean("desde_buscusus", false)) {
                intent = new Intent(this, t_buscusus.class);
            } else if (this.f6970q0.getBoolean("desde_buscvideos", false)) {
                intent = new Intent(this, t_buscvideos.class);
            } else if (this.f6970q0.getBoolean("desde_foro", false)) {
                intent = new Intent(this, t_url.class);
                intent.putExtra("nocompletar", this.f6970q0.getBoolean("nocompletar", false));
            } else if (this.f6970q0.getBoolean("desde_game", false)) {
                intent = new Intent(this, t_url.class);
                intent.putExtra("nocompletar", this.f6970q0.getBoolean("nocompletar", false));
            } else if (this.f6970q0.getBoolean("desde_px", false)) {
                intent = new Intent(this, t_url.class);
                intent.putExtra("nocompletar", this.f6970q0.getBoolean("nocompletar", false));
            } else if (this.f6970q0.getBoolean("desde_video", false)) {
                if (this.f6961m.f7231O1[C1692config.f7114N5.indexOf(Integer.valueOf(this.f6939F))].f7868L == 0) {
                    intent = new Intent(this, t_video.class);
                } else {
                    intent = new Intent(this, t_video_exoplayer.class);
                }
                intent.putExtra("url", this.f6961m.f7231O1[C1692config.f7114N5.indexOf(Integer.valueOf(this.f6939F))].f7910e);
                intent.putExtra("ua", this.f6961m.f7231O1[C1692config.f7114N5.indexOf(Integer.valueOf(this.f6939F))].f7925j);
            } else if (this.f6970q0.getBoolean("desde_radio", false)) {
                intent = new Intent(this, t_radio.class);
                intent.putExtra("ind", C1692config.f7114N5.indexOf(Integer.valueOf(this.f6939F)));
            } else if (this.f6970q0.getBoolean("desde_quiz", false)) {
                intent = new Intent(this, t_url.class);
                intent.putExtra("nocompletar", this.f6970q0.getBoolean("nocompletar", false));
            } else if (this.f6970q0.getBoolean("desde_vistafb", false)) {
                intent = new Intent(this, t_vistafb.class);
            } else {
                intent = new Intent(this, t_chat_contra.class);
            }
            intent.putExtra("desdeperfil", 1);
            if (this.f6967p) {
                intent = C1692config.m8198r(intent, this.f6970q0);
            } else {
                intent.putExtra("idsecc", this.f6939F);
                intent.putExtra("ind", this.f6938E);
            }
            if (this.f6961m.f7427t4 != 2) {
                intent.putExtra("es_root", true);
            }
            this.f6659e = false;
            this.f6657c = true;
            Intent intent6 = new Intent();
            intent6.putExtra("finalizar", true);
            setResult(-1, intent6);
            startActivity(intent);
            finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Dialog mo7356j() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_contra);
        dialog.setTitle(getResources().getString(R.string.contra));
        ((TextView) dialog.findViewById(R.id.btn_cancel)).setOnClickListener(new C1677w());
        TextView textView = (TextView) dialog.findViewById(R.id.btn_aceptar);
        textView.setOnClickListener(new C1678x());
        int i = Build.VERSION.SDK_INT;
        if (i > 20) {
            textView.setTextColor(Color.parseColor("#" + this.f6656b));
        }
        dialog.findViewById(R.id.iv_help).setOnClickListener(this);
        if (C1692config.m8153I("#" + this.f6953T)) {
            this.f6934A = (ProgressBar) dialog.findViewById(R.id.pb_contra_inv);
        } else {
            this.f6934A = (ProgressBar) dialog.findViewById(R.id.pb_contra);
            ((ImageView) dialog.findViewById(R.id.iv_help)).setImageDrawable(getResources().getDrawable(R.drawable.help_b));
        }
        if (i > 20) {
            C1692config.m8168S0(this.f6934A, this.f6656b);
        }
        return dialog;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00d6 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0196  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7357l(android.net.Uri r15) {
        /*
            r14 = this;
            java.lang.String r0 = "sh"
            r1 = 0
            android.content.SharedPreferences r0 = r14.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r3 = "logineado_fb"
            r4 = 1
            r2.putBoolean(r3, r4)
            java.lang.String r3 = "gender"
            java.lang.String r5 = r15.getQueryParameter(r3)
            java.lang.String r6 = "male"
            boolean r5 = r5.equals(r6)
            r6 = 2
            if (r5 == 0) goto L_0x0022
            r3 = 1
            goto L_0x0031
        L_0x0022:
            java.lang.String r3 = r15.getQueryParameter(r3)
            java.lang.String r5 = "female"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0030
            r3 = 2
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            java.lang.String r5 = "codigo"
            java.lang.String r7 = r15.getQueryParameter(r5)
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0048
            java.lang.String r5 = r15.getQueryParameter(r5)
            java.lang.String r7 = "cod"
            r2.putString(r7, r5)
        L_0x0048:
            java.lang.String r5 = "idusu"
            java.lang.String r7 = r15.getQueryParameter(r5)
            boolean r7 = r7.equals(r8)
            java.lang.String r9 = "@"
            if (r7 != 0) goto L_0x00d9
            java.lang.String r7 = r15.getQueryParameter(r5)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = 0
            long r11 = r0.getLong(r5, r11)
            r10.append(r11)
            r10.append(r8)
            java.lang.String r0 = r10.toString()
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = r15.getQueryParameter(r5)
            long r10 = java.lang.Long.parseLong(r0)
            r2.putLong(r5, r10)
            java.lang.String r0 = "cod_g"
            java.lang.String r7 = r15.getQueryParameter(r0)
            r2.putString(r0, r7)
            java.lang.String r0 = r15.getQueryParameter(r5)
            boolean r5 = r7.equals(r8)
            if (r5 != 0) goto L_0x00a5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r9)
            r5.append(r7)
            java.lang.String r0 = r5.toString()
        L_0x00a5:
            r5 = 0
            java.io.File r7 = r14.getFilesDir()     // Catch:{ Exception -> 0x00d6, all -> 0x00d1 }
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x00d6, all -> 0x00d1 }
            java.lang.String r11 = "vinebre_ac.txt"
            r10.<init>(r7, r11)     // Catch:{ Exception -> 0x00d6, all -> 0x00d1 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00d6, all -> 0x00d1 }
            r7.<init>(r10)     // Catch:{ Exception -> 0x00d6, all -> 0x00d1 }
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x00cf, all -> 0x00cc }
            java.io.OutputStreamWriter r10 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x00cf, all -> 0x00cc }
            r10.<init>(r7)     // Catch:{ Exception -> 0x00cf, all -> 0x00cc }
            r5.<init>(r10)     // Catch:{ Exception -> 0x00cf, all -> 0x00cc }
            r5.write(r0)     // Catch:{ Exception -> 0x00cf, all -> 0x00cc }
            r5.close()     // Catch:{ Exception -> 0x00cf, all -> 0x00cc }
            r7.close()     // Catch:{ Exception -> 0x00ca }
            goto L_0x00d9
        L_0x00ca:
            goto L_0x00d9
        L_0x00cc:
            r15 = move-exception
            r5 = r7
            goto L_0x00d2
        L_0x00cf:
            r5 = r7
            goto L_0x00d6
        L_0x00d1:
            r15 = move-exception
        L_0x00d2:
            r5.close()     // Catch:{ Exception -> 0x00d5 }
        L_0x00d5:
            throw r15
        L_0x00d6:
            r5.close()     // Catch:{ Exception -> 0x00ca }
        L_0x00d9:
            java.lang.String r0 = "nombre"
            java.lang.String r0 = r15.getQueryParameter(r0)
            java.lang.String r5 = "nick"
            r2.putString(r5, r0)
            java.lang.String r0 = "sexo"
            r2.putInt(r0, r3)
            java.lang.String r0 = "datos_usu"
            java.lang.String r3 = r15.getQueryParameter(r0)
            boolean r3 = r3.equals(r8)
            java.lang.String r5 = "coments"
            java.lang.String r7 = "fnac_a"
            java.lang.String r10 = "fnac_m"
            java.lang.String r11 = "fnac_d"
            java.lang.String r12 = "privados"
            java.lang.String r13 = "descr"
            if (r3 != 0) goto L_0x0146
            java.lang.String r0 = r15.getQueryParameter(r0)
            java.lang.String[] r0 = r0.split(r9)
            r3 = r0[r1]
            int r3 = java.lang.Integer.parseInt(r3)
            r2.putInt(r12, r3)
            r3 = r0[r4]
            int r3 = java.lang.Integer.parseInt(r3)
            r2.putInt(r11, r3)
            r3 = r0[r6]
            int r3 = java.lang.Integer.parseInt(r3)
            r2.putInt(r10, r3)
            r3 = 3
            r3 = r0[r3]
            int r3 = java.lang.Integer.parseInt(r3)
            r2.putInt(r7, r3)
            r3 = 4
            r3 = r0[r3]
            int r3 = java.lang.Integer.parseInt(r3)
            r2.putInt(r5, r3)
            int r3 = r0.length
            r4 = 5
            if (r3 <= r4) goto L_0x0142
            r0 = r0[r4]
            r2.putString(r13, r0)
            goto L_0x0158
        L_0x0142:
            r2.putString(r13, r8)
            goto L_0x0158
        L_0x0146:
            r2.putInt(r12, r4)
            r2.putInt(r11, r1)
            r2.putInt(r10, r1)
            r2.putInt(r7, r1)
            r2.putInt(r5, r4)
            r2.putString(r13, r8)
        L_0x0158:
            r2.commit()
            java.lang.String r0 = "idfb"
            java.lang.String r0 = r15.getQueryParameter(r0)
            boolean r0 = r0.equals(r8)
            java.lang.String r2 = "tfoto"
            if (r0 != 0) goto L_0x0175
            java.lang.String r0 = r15.getQueryParameter(r2)
            java.lang.String r3 = "1"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x018b
        L_0x0175:
            java.lang.String r0 = "idgoogle"
            java.lang.String r0 = r15.getQueryParameter(r0)
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0196
            java.lang.String r0 = r15.getQueryParameter(r2)
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0196
        L_0x018b:
            british.xnews2.chat_perfil$h0 r0 = new british.xnews2.chat_perfil$h0
            r0.<init>(r15)
            java.lang.String[] r15 = new java.lang.String[r1]
            r0.execute(r15)
            goto L_0x0199
        L_0x0196:
            r14.mo7355i()
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.chat_perfil.mo7357l(android.net.Uri):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo7358m() {
        if (this.f6973s) {
            this.f6961m.mo7523r0(this, Boolean.FALSE);
            return;
        }
        int q0 = this.f6961m.mo7522q0(this);
        int i = this.f6961m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f6935B = listView;
            this.f6961m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f6961m.f7231O1;
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
            int[] iArr = this.f6961m.f7249R1;
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
    /* renamed from: n */
    public void mo7359n() {
        String str;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", this.f6961m.f7301a1);
        String str2 = this.f6961m.f7307b1;
        String str3 = (("http://join-app.net/a2260177-6v0hw1/" + this.f6956W.toLowerCase(Locale.getDefault())) + "\n\n" + getResources().getString(R.string.codigo_invit) + " " + this.f6956W) + "\n\n" + getResources().getString(R.string.codigo_invit_val);
        int indexOf = str2.indexOf("https://play.google.com/store/apps/details?id=");
        if (indexOf == -1 && (indexOf = str2.indexOf("http://play.google.com/store/apps/details?id=")) == -1 && (indexOf = str2.indexOf("https://www.appcreator24.com/app")) == -1 && (indexOf = str2.indexOf("http://www.appcreator24.com/app")) == -1 && (indexOf = str2.indexOf("https://")) == -1) {
            indexOf = str2.indexOf("http://");
        }
        if (indexOf != -1) {
            int indexOf2 = str2.indexOf("\n", indexOf);
            String str4 = "";
            String substring = indexOf > 0 ? str2.substring(0, indexOf) : str4;
            if (indexOf2 != -1) {
                str4 = str2.substring(indexOf2);
            }
            str = substring + str3 + str4;
        } else {
            str = str2 + "\n\n" + str3;
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        startActivity(Intent.createChooser(intent, getString(R.string.compartir)));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:81|82|(1:86)|87|88|89|90|91|113) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0217 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r22, int r23, android.content.Intent r24) {
        /*
            r21 = this;
            r9 = r21
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 64206(0xface, float:8.9972E-41)
            if (r0 != r3) goto L_0x0014
            com.facebook.e r3 = r9.f6974s0
            r3.onActivityResult(r0, r1, r2)
            goto L_0x024c
        L_0x0014:
            r3 = 104(0x68, float:1.46E-43)
            r10 = 0
            if (r0 != r3) goto L_0x0060
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.auth.api.signin.C7064a.m28996b(r24)
            java.lang.Class<com.google.android.gms.common.api.b> r1 = com.google.android.gms.common.api.C7203b.class
            java.lang.Object r0 = r0.getResult(r1)     // Catch:{  }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r0     // Catch:{  }
            android.net.Uri r1 = r0.mo29088I0()     // Catch:{  }
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0037
            android.net.Uri r1 = r0.mo29088I0()     // Catch:{  }
            java.lang.String r1 = r1.toString()     // Catch:{  }
            r8 = r1
            goto L_0x0038
        L_0x0037:
            r8 = r2
        L_0x0038:
            java.lang.String r1 = r0.mo29087H0()     // Catch:{  }
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = r0.mo29087H0()     // Catch:{  }
            r3 = r1
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            british.xnews2.chat_perfil$k0 r11 = new british.xnews2.chat_perfil$k0     // Catch:{  }
            java.lang.String r4 = ""
            java.lang.String r5 = r0.mo29086G0()     // Catch:{  }
            java.lang.String r6 = r0.mo29082C0()     // Catch:{  }
            java.lang.String r7 = "0"
            r1 = r11
            r2 = r21
            r1.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{  }
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{  }
            r11.execute(r0)     // Catch:{  }
            goto L_0x024c
        L_0x0060:
            r3 = -1
            if (r1 != r3) goto L_0x024c
            r1 = 106(0x6a, float:1.49E-43)
            java.lang.String r4 = "orientation"
            r5 = 100
            r6 = 600(0x258, float:8.41E-43)
            r7 = 2
            if (r0 != r1) goto L_0x01bc
            r1 = 1
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00dc }
            british.xnews2.config r2 = r9.f6961m     // Catch:{ Exception -> 0x00dc }
            java.io.File r2 = r2.mo7505h0(r9, r7)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x00dc }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00dc }
            long r11 = r0.length()     // Catch:{ Exception -> 0x00dc }
            android.content.Context r0 = r21.getApplicationContext()     // Catch:{ Exception -> 0x00dc }
            android.content.ContentResolver r13 = r0.getContentResolver()     // Catch:{ Exception -> 0x00dc }
            android.net.Uri r14 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00dc }
            java.lang.String r0 = "_size"
            java.lang.String[] r15 = new java.lang.String[]{r4, r0}     // Catch:{ Exception -> 0x00dc }
            java.lang.String r16 = "date_added>=?"
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00dc }
            java.lang.Long r2 = r9.f6972r0     // Catch:{ Exception -> 0x00dc }
            long r17 = r2.longValue()     // Catch:{ Exception -> 0x00dc }
            r19 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 / r19
            r19 = 1
            long r17 = r17 - r19
            java.lang.String r2 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x00dc }
            r0[r10] = r2     // Catch:{ Exception -> 0x00dc }
            java.lang.String r18 = "date_added desc"
            r17 = r0
            android.database.Cursor r0 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00dc }
            if (r0 == 0) goto L_0x00d9
            java.lang.Long r2 = r9.f6972r0     // Catch:{ Exception -> 0x00dc }
            long r13 = r2.longValue()     // Catch:{ Exception -> 0x00dc }
            r15 = 0
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 == 0) goto L_0x00d9
            int r2 = r0.getCount()     // Catch:{ Exception -> 0x00dc }
            if (r2 == 0) goto L_0x00d9
        L_0x00c6:
            boolean r2 = r0.moveToNext()     // Catch:{ Exception -> 0x00dc }
            if (r2 == 0) goto L_0x00d9
            long r13 = r0.getLong(r1)     // Catch:{ Exception -> 0x00dc }
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x00c6
            int r0 = r0.getInt(r10)     // Catch:{ Exception -> 0x00dc }
            goto L_0x00da
        L_0x00d9:
            r0 = -1
        L_0x00da:
            r2 = r0
            goto L_0x00e1
        L_0x00dc:
            r0 = move-exception
            r0.printStackTrace()
            r2 = -1
        L_0x00e1:
            if (r2 != r3) goto L_0x00fd
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch:{ IOException -> 0x00f9 }
            british.xnews2.config r4 = r9.f6961m     // Catch:{ IOException -> 0x00f9 }
            java.io.File r4 = r4.mo7505h0(r9, r7)     // Catch:{ IOException -> 0x00f9 }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x00f9 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x00f9 }
            java.lang.String r4 = "Orientation"
            int r2 = r0.getAttributeInt(r4, r3)     // Catch:{ IOException -> 0x00f9 }
            goto L_0x00fd
        L_0x00f9:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00fd:
            british.xnews2.config r0 = r9.f6961m     // Catch:{ Exception -> 0x0157 }
            java.io.File r0 = r0.mo7505h0(r9, r7)     // Catch:{ Exception -> 0x0157 }
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0157 }
            r4.<init>()     // Catch:{ Exception -> 0x0157 }
            r4.inJustDecodeBounds = r1     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = r0.getPath()     // Catch:{ Exception -> 0x0157 }
            android.graphics.BitmapFactory.decodeFile(r8, r4)     // Catch:{ Exception -> 0x0157 }
            int r8 = r4.outWidth     // Catch:{ Exception -> 0x0157 }
            int r4 = r4.outHeight     // Catch:{ Exception -> 0x0157 }
            if (r8 > r6) goto L_0x011a
            if (r4 > r6) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r1 = 0
        L_0x011b:
            if (r1 != 0) goto L_0x0138
            int r1 = british.xnews2.C1692config.m8193n(r8, r4, r6, r6)     // Catch:{ Exception -> 0x0157 }
            float r4 = (float) r8     // Catch:{ Exception -> 0x0157 }
            float r1 = (float) r1     // Catch:{ Exception -> 0x0157 }
            float r4 = r4 / r1
            int r1 = java.lang.Math.round(r4)     // Catch:{ Exception -> 0x0157 }
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0157 }
            r4.<init>()     // Catch:{ Exception -> 0x0157 }
            r4.inSampleSize = r1     // Catch:{ Exception -> 0x0157 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0157 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r4)     // Catch:{ Exception -> 0x0157 }
            goto L_0x0144
        L_0x0138:
            android.content.ContentResolver r1 = r21.getContentResolver()     // Catch:{ Exception -> 0x0157 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x0157 }
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Media.getBitmap(r1, r0)     // Catch:{ Exception -> 0x0157 }
        L_0x0144:
            british.xnews2.config r1 = r9.f6961m     // Catch:{ Exception -> 0x0157 }
            java.io.File r1 = r1.mo7505h0(r9, r7)     // Catch:{ Exception -> 0x0157 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0155 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0155 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0155 }
            r0.compress(r1, r5, r4)     // Catch:{ Exception -> 0x0155 }
            goto L_0x015b
        L_0x0155:
            goto L_0x015b
        L_0x0157:
            r0 = move-exception
            r0.printStackTrace()
        L_0x015b:
            if (r2 == r3) goto L_0x01b1
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1 = 3
            if (r2 != r1) goto L_0x0168
            r1 = 180(0xb4, float:2.52E-43)
            goto L_0x0176
        L_0x0168:
            r1 = 8
            if (r2 != r1) goto L_0x016f
            r1 = 270(0x10e, float:3.78E-43)
            goto L_0x0176
        L_0x016f:
            r1 = 6
            if (r2 != r1) goto L_0x0175
            r1 = 90
            goto L_0x0176
        L_0x0175:
            r1 = 0
        L_0x0176:
            if (r1 <= 0) goto L_0x01b1
            british.xnews2.config r2 = r9.f6961m     // Catch:{ Exception -> 0x01ad }
            java.io.File r2 = r2.mo7505h0(r9, r7)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x01ad }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r2)     // Catch:{ Exception -> 0x01ad }
            float r1 = (float) r1     // Catch:{ Exception -> 0x01ad }
            r0.postRotate(r1)     // Catch:{ Exception -> 0x01ad }
            r12 = 0
            r13 = 0
            int r14 = r11.getWidth()     // Catch:{ Exception -> 0x01ad }
            int r15 = r11.getHeight()     // Catch:{ Exception -> 0x01ad }
            r17 = 1
            r16 = r0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01ad }
            british.xnews2.config r1 = r9.f6961m     // Catch:{ Exception -> 0x01ad }
            java.io.File r1 = r1.mo7505h0(r9, r7)     // Catch:{ Exception -> 0x01ad }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01b1 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x01b1 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x01b1 }
            r0.compress(r1, r5, r2)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x01b1
        L_0x01ad:
            r0 = move-exception
            r0.printStackTrace()
        L_0x01b1:
            r9.m8115o(r7, r10)
            int r0 = r21.m8113h()
            r9.f6937D = r0
            goto L_0x024c
        L_0x01bc:
            if (r0 != r7) goto L_0x0224
            android.net.Uri r0 = r24.getData()
            java.lang.String[] r1 = new java.lang.String[]{r4}     // Catch:{ b -> 0x024c }
            android.content.ContentResolver r11 = r21.getContentResolver()     // Catch:{ b -> 0x024c }
            r14 = 0
            r15 = 0
            r16 = 0
            r12 = r0
            r13 = r1
            android.database.Cursor r2 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ b -> 0x024c }
            if (r2 == 0) goto L_0x01e6
            boolean r4 = r2.moveToFirst()     // Catch:{ b -> 0x024c }
            if (r4 == 0) goto L_0x01e6
            r1 = r1[r10]     // Catch:{ b -> 0x024c }
            int r1 = r2.getColumnIndex(r1)     // Catch:{ b -> 0x024c }
            int r3 = r2.getInt(r1)     // Catch:{ b -> 0x024c }
        L_0x01e6:
            android.graphics.Matrix r1 = new android.graphics.Matrix     // Catch:{ b -> 0x024c }
            r1.<init>()     // Catch:{ b -> 0x024c }
            float r2 = (float) r3     // Catch:{ b -> 0x024c }
            r1.postRotate(r2)     // Catch:{ b -> 0x024c }
            british.xnews2.config r2 = r9.f6961m     // Catch:{ b -> 0x024c }
            android.graphics.Bitmap r11 = r2.mo7477D(r0, r6, r6)     // Catch:{ b -> 0x024c }
            r12 = 0
            r13 = 0
            int r14 = r11.getWidth()     // Catch:{ b -> 0x024c }
            int r15 = r11.getHeight()     // Catch:{ b -> 0x024c }
            r17 = 1
            r16 = r1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ b -> 0x024c }
            british.xnews2.config r1 = r9.f6961m     // Catch:{ b -> 0x024c }
            java.io.File r1 = r1.mo7505h0(r9, r7)     // Catch:{ b -> 0x024c }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception | OutOfMemoryError -> 0x0217 }
            r2.<init>(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0217 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception | OutOfMemoryError -> 0x0217 }
            r0.compress(r1, r5, r2)     // Catch:{ Exception | OutOfMemoryError -> 0x0217 }
        L_0x0217:
            r0.recycle()     // Catch:{ b -> 0x024c }
            r9.m8115o(r7, r10)     // Catch:{ b -> 0x024c }
            int r0 = r21.m8113h()     // Catch:{ b -> 0x024c }
            r9.f6937D = r0     // Catch:{ b -> 0x024c }
            goto L_0x024c
        L_0x0224:
            if (r2 == 0) goto L_0x024c
            java.lang.String r0 = "finalizar"
            boolean r1 = r2.hasExtra(r0)
            if (r1 == 0) goto L_0x024c
            android.os.Bundle r1 = r24.getExtras()
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x024c
            android.os.Bundle r0 = r24.getExtras()
            java.lang.String r1 = "finalizar_app"
            boolean r0 = r0.getBoolean(r1)
            if (r0 != 0) goto L_0x0246
            r9.f6659e = r10
        L_0x0246:
            r9.setResult(r3, r2)
            r21.finish()
        L_0x024c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.chat_perfil.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f6983z) {
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
        if (!this.f6659e || this.f6963n || !this.f6961m.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f6963n = true;
        C1692config.m8199t(this);
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
        boolean z;
        boolean z2;
        if (view.getId() == R.id.btnbaja) {
            AlertDialog create = new AlertDialog.Builder(this).setCancelable(true).setPositiveButton(getString(R.string.si), new C1640g()).setNegativeButton(getString(R.string.no), (DialogInterface.OnClickListener) null).setMessage(R.string.confirmarbaja).create();
            if (!this.f6656b.equals("")) {
                create.setOnShowListener(new C1642h(create));
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        } else if (view.getId() == R.id.btnprivacidad || view.getId() == R.id.btnprivacidad_fb) {
            new C1645i0(false).execute(new String[0]);
        } else if (view.getId() == R.id.btnfotos) {
            m8116r();
        } else if (view.getId() == R.id.elim1) {
            this.f6948O.setImageBitmap((Bitmap) null);
            this.f6948O.setVisibility(8);
            this.f6950Q.setVisibility(8);
            this.f6961m.mo7505h0(this, 2).delete();
            int i = this.f6937D - 1;
            this.f6937D = i;
            this.f6951R = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            if (i < 4) {
                this.f6949P.setVisibility(0);
            }
        } else if (view.getId() == R.id.contra_modif) {
            Dialog j = mo7356j();
            this.f6981x = j;
            j.show();
        } else if (view.getId() == R.id.contra_recordar || view.getId() == R.id.iv_help) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            String trim = ((TextView) findViewById(R.id.c_email)).getText().toString().trim();
            if (trim.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(trim).matches()) {
                builder.setCancelable(false).setPositiveButton(getString(R.string.aceptar), (DialogInterface.OnClickListener) null);
                builder.setMessage(R.string.falta_email);
                AlertDialog create2 = builder.create();
                if (!this.f6656b.equals("")) {
                    create2.setOnShowListener(new C1644i(create2));
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                return;
            }
            builder.setCancelable(true).setNegativeButton(getString(R.string.cancelar), (DialogInterface.OnClickListener) null).setPositiveButton("OK", new C1650j());
            builder.setMessage(getResources().getString(R.string.confirm_enviarcontra_a) + " " + trim);
            AlertDialog create3 = builder.create();
            if (!this.f6656b.equals("")) {
                create3.setOnShowListener(new C1656l(create3));
            }
            create3.show();
            ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } else if (view.getId() == R.id.btnenv) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setCancelable(false).setPositiveButton(getString(R.string.aceptar), (DialogInterface.OnClickListener) null);
            if (((TextView) findViewById(R.id.c_nombre)).getText().toString().trim().length() < 3) {
                builder2.setMessage(R.string.falta_nombre);
                AlertDialog create4 = builder2.create();
                if (!this.f6656b.equals("")) {
                    create4.setOnShowListener(new C1661m(create4));
                }
                create4.show();
                ((TextView) create4.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (findViewById(R.id.tr_email).getVisibility() == 0 && findViewById(R.id.c_email).getVisibility() == 0 && (((TextView) findViewById(R.id.c_email)).getText().toString().trim().isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(((TextView) findViewById(R.id.c_email)).getText().toString().trim()).matches())) {
                builder2.setMessage(R.string.falta_email);
                AlertDialog create5 = builder2.create();
                if (!this.f6656b.equals("")) {
                    create5.setOnShowListener(new C1668n(create5));
                }
                create5.show();
                ((TextView) create5.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (findViewById(R.id.tr_contra).getVisibility() == 0 && findViewById(R.id.ll_c_contra).getVisibility() == 0 && findViewById(R.id.c_contra).getVisibility() == 0 && ((TextView) findViewById(R.id.c_contra)).getText().toString().trim().isEmpty()) {
                builder2.setMessage(R.string.chat_contra_necesaria);
                AlertDialog create6 = builder2.create();
                if (!this.f6656b.equals("")) {
                    create6.setOnShowListener(new C1669o(create6));
                }
                create6.show();
                ((TextView) create6.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (((TextView) findViewById(R.id.c_descr)).getText().toString().trim().length() < 3 && this.f6943J == 2) {
                builder2.setMessage(R.string.falta_descr);
                AlertDialog create7 = builder2.create();
                if (!this.f6656b.equals("")) {
                    create7.setOnShowListener(new C1670p(create7));
                }
                create7.show();
                ((TextView) create7.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if ((this.f6959Z.getSelectedItemPosition() == 0 || this.f6960l0.getSelectedItemPosition() == 0 || this.f6962m0.getSelectedItemPosition() == 0) && this.f6941H == 2) {
                builder2.setMessage(R.string.falta_fnac);
                AlertDialog create8 = builder2.create();
                if (!this.f6656b.equals("")) {
                    create8.setOnShowListener(new C1671q(create8));
                }
                create8.show();
                ((TextView) create8.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (this.f6964n0.getSelectedItemPosition() == 0 && this.f6942I == 2) {
                builder2.setMessage(R.string.falta_sexo);
                AlertDialog create9 = builder2.create();
                if (!this.f6656b.equals("")) {
                    create9.setOnShowListener(new C1672r(create9));
                }
                create9.show();
                ((TextView) create9.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (this.f6937D == 0 && this.f6940G == 2) {
                builder2.setMessage(R.string.falta_fotos);
                AlertDialog create10 = builder2.create();
                if (!this.f6656b.equals("")) {
                    create10.setOnShowListener(new C1673s(create10));
                }
                create10.show();
                ((TextView) create10.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                SharedPreferences.Editor edit = this.f6968p0.edit();
                edit.putString("nick", ((TextView) findViewById(R.id.c_nombre)).getText().toString().trim());
                edit.putString("email", ((TextView) findViewById(R.id.c_email)).getText().toString().trim());
                edit.putString("descr", ((TextView) findViewById(R.id.c_descr)).getText().toString().trim());
                edit.putInt("privados", Integer.parseInt(getResources().getStringArray(R.array.idprivados_a)[this.f6958Y.getSelectedItemPosition()]));
                edit.putInt("fnac_d", this.f6959Z.getSelectedItemPosition());
                edit.putInt("fnac_m", this.f6960l0.getSelectedItemPosition());
                if (this.f6962m0.getSelectedItemPosition() == 0) {
                    edit.putInt("fnac_a", 0);
                } else {
                    edit.putInt("fnac_a", Integer.parseInt(this.f6962m0.getSelectedItem().toString()));
                }
                edit.putInt("sexo", Integer.parseInt(getResources().getStringArray(R.array.idsexo_a)[this.f6964n0.getSelectedItemPosition()]));
                edit.putInt("coments", Integer.parseInt(getResources().getStringArray(R.array.idcoments_a)[this.f6966o0.getSelectedItemPosition()]));
                edit.putInt("avisos", Integer.parseInt(getResources().getStringArray(R.array.idavisos_a)[this.f6957X.getSelectedItemPosition()]));
                try {
                    if (this.f6961m.mo7505h0(this, 2).exists()) {
                        C1692config.m8202w(this.f6961m.mo7505h0(this, 2), this.f6961m.mo7516l0(this, 1));
                    } else {
                        this.f6961m.mo7516l0(this, 1).delete();
                    }
                } catch (Exception unused2) {
                }
                if (this.f6965o || (this.f6961m.f7393o5 == 3 && !this.f6947N)) {
                    edit.putString("foto1_modif", this.f6951R);
                    edit.commit();
                    Intent intent = new Intent(this, guardarprimeravez.class);
                    intent.putExtra("contra", ((TextView) findViewById(R.id.c_contra)).getText().toString().trim());
                    if (this.f6967p) {
                        intent = C1692config.m8198r(intent, this.f6970q0);
                    } else {
                        intent.putExtra("idsecc", this.f6939F);
                        intent.putExtra("desde_buscusus", this.f6970q0.getBoolean("desde_buscusus", false));
                        intent.putExtra("desde_buscvideos", this.f6970q0.getBoolean("desde_buscvideos", false));
                        intent.putExtra("desde_foro", this.f6970q0.getBoolean("desde_foro", false));
                        intent.putExtra("desde_game", this.f6970q0.getBoolean("desde_game", false));
                        intent.putExtra("desde_px", this.f6970q0.getBoolean("desde_px", false));
                        intent.putExtra("desde_video", this.f6970q0.getBoolean("desde_video", false));
                        intent.putExtra("desde_radio", this.f6970q0.getBoolean("desde_radio", false));
                        intent.putExtra("desde_quiz", this.f6970q0.getBoolean("desde_quiz", false));
                        intent.putExtra("desde_vistafb", this.f6970q0.getBoolean("desde_vistafb", false));
                        intent.putExtra("desde_main", this.f6971r);
                        intent.putExtra("desde_main_oblig", this.f6973s);
                    }
                    if (this.f6961m.f7427t4 != 2 || this.f6973s) {
                        z = true;
                        intent.putExtra("es_root", true);
                        z2 = false;
                    } else {
                        z2 = false;
                        z = true;
                    }
                    this.f6659e = z2;
                    this.f6657c = z;
                    Intent intent2 = new Intent();
                    intent2.putExtra("finalizar", z);
                    setResult(-1, intent2);
                    startActivity(intent);
                    finish();
                } else {
                    edit.commit();
                    Intent intent3 = new Intent(this, s_guardarperfil.class);
                    intent3.putExtra("foto1_modif", this.f6951R);
                    startService(intent3);
                    mo7355i();
                }
                finish();
            }
        } else if (view.getId() != R.id.btnprofile) {
            String str9 = this.f6961m.f7251R3;
            if ((str9 == null || str9.equals("")) && (((str = this.f6961m.f7281W3) == null || str.equals("")) && (((str2 = this.f6961m.f7250R2) == null || str2.equals("")) && (((str3 = this.f6961m.f7245Q3) == null || str3.equals("")) && (((str4 = this.f6961m.f7269U3) == null || str4.equals("")) && (((str5 = this.f6961m.f7275V3) == null || str5.equals("")) && (((str6 = this.f6961m.f7358j4) == null || str6.equals("")) && (((str7 = this.f6961m.f7287X3) == null || str7.equals("")) && ((str8 = this.f6961m.f7293Y3) == null || str8.equals("")))))))))) {
                View view2 = view;
                abrir_secc(view);
                return;
            }
            String str10 = this.f6961m.f7251R3;
            if (str10 != null && !str10.equals("")) {
                this.f6663i = new RewardedVideo((Context) this, this.f6961m.f7251R3);
            }
            String str11 = this.f6961m.f7245Q3;
            if (str11 != null) {
                str11.equals("");
            }
            String str12 = this.f6961m.f7269U3;
            if (str12 != null && !str12.equals("")) {
                this.f6664j = new RewardedVideoAd(this, this.f6961m.f7269U3);
            }
            String str13 = this.f6961m.f7275V3;
            if (str13 != null && !str13.equals("")) {
                this.f6665k = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6661g = progressDialog;
            this.f6660f = view;
            if (!this.f6961m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                abrir_secc(view);
            }
        } else if (this.f6965o || this.f6973s) {
            AlertDialog create11 = new AlertDialog.Builder(this).setCancelable(false).setPositiveButton(getString(R.string.aceptar), new C1674t()).setMessage(R.string.guardaprimero).create();
            if (!this.f6656b.equals("")) {
                create11.setOnShowListener(new C1675u(create11));
            }
            create11.show();
            ((TextView) create11.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } else {
            Intent intent4 = new Intent(this, profile.class);
            intent4.putExtra(TtmlNode.ATTR_ID, this.f6968p0.getLong("idusu", 0) + "");
            intent4.putExtra("privados", SessionDescription.SUPPORTED_SDP_VERSION);
            intent4.putExtra("nombre", this.f6968p0.getString("nick", ""));
            intent4.putExtra("coments", this.f6968p0.getInt("coments", 1) + "");
            intent4.putExtra("fnac_d", this.f6968p0.getInt("fnac_d", 0) + "");
            intent4.putExtra("fnac_m", this.f6968p0.getInt("fnac_m", 0) + "");
            intent4.putExtra("fnac_a", this.f6968p0.getInt("fnac_a", 0) + "");
            intent4.putExtra("sexo", this.f6968p0.getInt("sexo", 0) + "");
            intent4.putExtra("vfoto", "99999999");
            intent4.putExtra("dist", SessionDescription.SUPPORTED_SDP_VERSION);
            intent4.putExtra("p_fnac", this.f6941H);
            intent4.putExtra("p_sexo", this.f6942I);
            intent4.putExtra("p_descr", this.f6943J);
            intent4.putExtra("p_dist", 0);
            intent4.putExtra("coments_chat", this.f6944K == 1);
            intent4.putExtra("galeria", this.f6946M == 1);
            intent4.putExtra("privados_chat", this.f6945L == 1);
            intent4.putExtra("fotos_perfil", this.f6940G);
            intent4.putExtra("fotos_chat", 1);
            intent4.putExtra("desde_main", this.f6971r);
            intent4.putExtra("desde_main_oblig", this.f6973s);
            startActivityForResult(intent4, 0);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo7358m();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f6982y;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f6982y;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f6982y = this.f6961m.mo7474A0(this, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0153, code lost:
        if (r3.f7849B0 == 2) goto L_0x0159;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r16.getApplicationContext()
            british.xnews2.config r2 = (british.xnews2.C1692config) r2
            r0.f6961m = r2
            java.lang.String r3 = r2.f7313c1
            if (r3 != 0) goto L_0x0013
            r2.mo7490V0()
        L_0x0013:
            r0.m8114k(r0)
            british.xnews2.chat_perfil$k r2 = new british.xnews2.chat_perfil$k
            r2.<init>()
            r0.f6666l = r2
            british.xnews2.config r2 = r0.f6961m
            int r2 = r2.f7318d
            r0.f6938E = r2
            android.content.Intent r2 = r16.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.f6970q0 = r2
            java.lang.String r3 = "es_root"
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0049
            if (r2 == 0) goto L_0x0045
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x0045
            android.os.Bundle r2 = r0.f6970q0
            boolean r2 = r2.getBoolean(r3, r5)
            if (r2 == 0) goto L_0x0045
            r2 = 1
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            r0.f6659e = r2
            goto L_0x005a
        L_0x0049:
            boolean r2 = r1.containsKey(r3)
            if (r2 == 0) goto L_0x0057
            boolean r2 = r1.getBoolean(r3, r5)
            if (r2 == 0) goto L_0x0057
            r2 = 1
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            r0.f6659e = r2
        L_0x005a:
            boolean r2 = r0.f6659e
            r0.f6969q = r2
            android.os.Bundle r2 = r0.f6970q0
            java.lang.String r3 = "externo"
            boolean r2 = r2.containsKey(r3)
            r0.f6967p = r2
            android.os.Bundle r2 = r0.f6970q0
            java.lang.String r3 = "desde_main"
            boolean r2 = r2.getBoolean(r3, r5)
            r0.f6971r = r2
            android.os.Bundle r2 = r0.f6970q0
            java.lang.String r3 = "desde_main_oblig"
            boolean r2 = r2.getBoolean(r3, r5)
            r0.f6973s = r2
            if (r2 == 0) goto L_0x00a2
            british.xnews2.config r2 = r0.f6961m
            java.lang.String r6 = r2.f7313c1
            r0.f6953T = r6
            java.lang.String r6 = r2.f7319d1
            r0.f6954U = r6
            int r6 = r2.f7446w2
            r0.f6940G = r6
            int r6 = r2.f7453x2
            r0.f6941H = r6
            int r6 = r2.f7460y2
            r0.f6942I = r6
            int r2 = r2.f7467z2
            r0.f6943J = r2
            r0.f6946M = r5
            r0.f6944K = r5
            r0.f6945L = r5
            r0.f6939F = r5
            goto L_0x0278
        L_0x00a2:
            boolean r2 = r0.f6971r
            if (r2 == 0) goto L_0x01d5
            british.xnews2.config r2 = r0.f6961m
            java.lang.String r6 = r2.f7313c1
            r0.f6953T = r6
            java.lang.String r2 = r2.f7319d1
            r0.f6954U = r2
            r2 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x00ba:
            british.xnews2.config r15 = r0.f6961m
            british.xnews2.l[] r5 = r15.f7231O1
            int r3 = r5.length
            if (r2 >= r3) goto L_0x017f
            r3 = r5[r2]
            int r5 = r3.f7954t
            r15 = 10
            if (r5 != r15) goto L_0x00ca
            r11 = 1
        L_0x00ca:
            r15 = 9
            if (r5 == r15) goto L_0x012e
            r15 = 11
            if (r5 == r15) goto L_0x012e
            r15 = 16
            if (r5 == r15) goto L_0x012e
            if (r5 != r4) goto L_0x00e2
            java.lang.String r5 = r3.f7910e
            java.lang.String r15 = "forum.e-droid.net"
            boolean r5 = r5.contains(r15)
            if (r5 != 0) goto L_0x012e
        L_0x00e2:
            int r5 = r3.f7954t
            if (r5 != r4) goto L_0x00f4
            java.lang.String r5 = r3.f7910e
            java.lang.String r15 = "games.e-droid.net"
            boolean r5 = r5.contains(r15)
            if (r5 == 0) goto L_0x00f4
            boolean r5 = r3.f7927j1
            if (r5 != 0) goto L_0x012e
        L_0x00f4:
            int r5 = r3.f7954t
            r15 = 21
            if (r5 != r15) goto L_0x0108
            java.lang.String r5 = r3.f7910e
            java.lang.String r15 = "pixworld.io-desdeac"
            boolean r5 = r5.contains(r15)
            if (r5 == 0) goto L_0x0108
            boolean r5 = r3.f7927j1
            if (r5 != 0) goto L_0x012e
        L_0x0108:
            int r5 = r3.f7954t
            if (r5 != r4) goto L_0x011a
            java.lang.String r5 = r3.f7910e
            java.lang.String r15 = "quiz.e-droid.net"
            boolean r5 = r5.contains(r15)
            if (r5 == 0) goto L_0x011a
            boolean r5 = r3.f7927j1
            if (r5 != 0) goto L_0x012e
        L_0x011a:
            int r5 = r3.f7954t
            r15 = 6
            if (r5 != r15) goto L_0x0125
            british.xnews2.config r15 = r0.f6961m
            boolean r15 = r15.f7362k2
            if (r15 != 0) goto L_0x012e
        L_0x0125:
            r15 = 7
            if (r5 != r15) goto L_0x017a
            british.xnews2.config r5 = r0.f6961m
            boolean r5 = r5.f7369l2
            if (r5 == 0) goto L_0x017a
        L_0x012e:
            if (r12 != 0) goto L_0x0137
            boolean r5 = r3.f7888V
            if (r5 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r12 = 0
            goto L_0x0138
        L_0x0137:
            r12 = 1
        L_0x0138:
            if (r13 != 0) goto L_0x0141
            boolean r5 = r3.f7886U
            if (r5 == 0) goto L_0x013f
            goto L_0x0141
        L_0x013f:
            r13 = 0
            goto L_0x0142
        L_0x0141:
            r13 = 1
        L_0x0142:
            if (r14 != 0) goto L_0x014b
            boolean r5 = r3.f7884T
            if (r5 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r14 = 0
            goto L_0x014c
        L_0x014b:
            r14 = 1
        L_0x014c:
            if (r7 == 0) goto L_0x0158
            if (r7 != r4) goto L_0x0156
            int r5 = r3.f7849B0
            r6 = 2
            if (r5 != r6) goto L_0x015b
            goto L_0x0159
        L_0x0156:
            r6 = 2
            goto L_0x015b
        L_0x0158:
            r6 = 2
        L_0x0159:
            int r7 = r3.f7849B0
        L_0x015b:
            if (r8 == 0) goto L_0x0163
            if (r8 != r4) goto L_0x0165
            int r5 = r3.f7851C0
            if (r5 != r6) goto L_0x0165
        L_0x0163:
            int r8 = r3.f7851C0
        L_0x0165:
            if (r9 == 0) goto L_0x016d
            if (r9 != r4) goto L_0x016f
            int r5 = r3.f7853D0
            if (r5 != r6) goto L_0x016f
        L_0x016d:
            int r9 = r3.f7853D0
        L_0x016f:
            if (r10 == 0) goto L_0x0177
            if (r10 != r4) goto L_0x0179
            int r5 = r3.f7855E0
            if (r5 != r6) goto L_0x0179
        L_0x0177:
            int r10 = r3.f7855E0
        L_0x0179:
            r6 = 1
        L_0x017a:
            int r2 = r2 + 1
            r5 = 0
            goto L_0x00ba
        L_0x017f:
            r2 = 0
            r0.f6940G = r2
            r0.f6941H = r2
            r0.f6942I = r2
            r0.f6943J = r2
            if (r6 != 0) goto L_0x01a8
            int r2 = r15.f7439v2
            if (r2 <= 0) goto L_0x019f
            int r2 = r15.f7446w2
            r0.f6940G = r2
            int r2 = r15.f7453x2
            r0.f6941H = r2
            int r2 = r15.f7460y2
            r0.f6942I = r2
            int r2 = r15.f7467z2
            r0.f6943J = r2
            goto L_0x01b0
        L_0x019f:
            r0.f6940G = r4
            r0.f6941H = r4
            r0.f6942I = r4
            r0.f6943J = r4
            goto L_0x01b0
        L_0x01a8:
            r0.f6940G = r7
            r0.f6941H = r8
            r0.f6942I = r9
            r0.f6943J = r10
        L_0x01b0:
            r2 = 0
            r0.f6946M = r2
            r0.f6944K = r2
            r0.f6945L = r2
            if (r6 != 0) goto L_0x01be
            if (r11 == 0) goto L_0x01bc
            goto L_0x01be
        L_0x01bc:
            r2 = 0
            goto L_0x01d1
        L_0x01be:
            if (r6 == 0) goto L_0x01c2
            if (r12 == 0) goto L_0x01c4
        L_0x01c2:
            r0.f6946M = r4
        L_0x01c4:
            if (r6 == 0) goto L_0x01c8
            if (r13 == 0) goto L_0x01ca
        L_0x01c8:
            r0.f6944K = r4
        L_0x01ca:
            if (r6 == 0) goto L_0x01ce
            if (r14 == 0) goto L_0x01bc
        L_0x01ce:
            r0.f6945L = r4
            goto L_0x01bc
        L_0x01d1:
            r0.f6939F = r2
            goto L_0x0278
        L_0x01d5:
            boolean r2 = r0.f6967p
            if (r2 == 0) goto L_0x0232
            british.xnews2.config r2 = r0.f6961m
            british.xnews2.l[] r2 = r2.f7231O1
            int r3 = r0.f6938E
            r5 = r2[r3]
            java.lang.String r5 = r5.f7916g
            r0.f6953T = r5
            r2 = r2[r3]
            java.lang.String r2 = r2.f7919h
            r0.f6954U = r2
            android.os.Bundle r2 = r0.f6970q0
            java.lang.String r3 = "fotos_perfil"
            int r2 = r2.getInt(r3)
            r0.f6940G = r2
            android.os.Bundle r2 = r0.f6970q0
            java.lang.String r3 = "fnac"
            int r2 = r2.getInt(r3)
            r0.f6941H = r2
            android.os.Bundle r2 = r0.f6970q0
            java.lang.String r3 = "sexo"
            int r2 = r2.getInt(r3)
            r0.f6942I = r2
            android.os.Bundle r2 = r0.f6970q0
            java.lang.String r3 = "descr"
            int r2 = r2.getInt(r3)
            r0.f6943J = r2
            android.os.Bundle r2 = r0.f6970q0
            java.lang.String r3 = "galeria"
            boolean r2 = r2.getBoolean(r3)
            r0.f6946M = r2
            android.os.Bundle r2 = r0.f6970q0
            java.lang.String r3 = "coments"
            boolean r2 = r2.getBoolean(r3)
            r0.f6944K = r2
            android.os.Bundle r2 = r0.f6970q0
            java.lang.String r3 = "privados"
            boolean r2 = r2.getBoolean(r3)
            r0.f6945L = r2
            goto L_0x0278
        L_0x0232:
            british.xnews2.config r2 = r0.f6961m
            british.xnews2.l[] r2 = r2.f7231O1
            int r3 = r0.f6938E
            r5 = r2[r3]
            java.lang.String r5 = r5.f7916g
            r0.f6953T = r5
            r5 = r2[r3]
            java.lang.String r5 = r5.f7919h
            r0.f6954U = r5
            r5 = r2[r3]
            int r5 = r5.f7849B0
            r0.f6940G = r5
            r5 = r2[r3]
            int r5 = r5.f7851C0
            r0.f6941H = r5
            r5 = r2[r3]
            int r5 = r5.f7853D0
            r0.f6942I = r5
            r5 = r2[r3]
            int r5 = r5.f7855E0
            r0.f6943J = r5
            r5 = r2[r3]
            boolean r5 = r5.f7888V
            r0.f6946M = r5
            r5 = r2[r3]
            boolean r5 = r5.f7886U
            r0.f6944K = r5
            r2 = r2[r3]
            boolean r2 = r2.f7884T
            r0.f6945L = r2
            android.os.Bundle r2 = r0.f6970q0
            java.lang.String r3 = "idsecc"
            int r2 = r2.getInt(r3)
            r0.f6939F = r2
        L_0x0278:
            java.lang.String r2 = r0.f6953T
            british.xnews2.config r3 = r0.f6961m
            java.lang.String r3 = r3.f7368l1
            java.lang.String r2 = british.xnews2.C1692config.m8189h(r2, r3)
            r0.f6656b = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 12
            java.lang.String r5 = "#"
            if (r2 <= r3) goto L_0x02a9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r6 = r0.f6953T
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            boolean r3 = british.xnews2.C1692config.m8153I(r3)
            if (r3 != 0) goto L_0x02a9
            r3 = 2131886906(0x7f12033a, float:1.9408404E38)
            r0.setTheme(r3)
        L_0x02a9:
            super.onCreate(r17)
            r3 = 2131558467(0x7f0d0043, float:1.874225E38)
            r0.setContentView(r3)
            r16.mo7358m()
            boolean r3 = r0.f6973s
            if (r3 != 0) goto L_0x02bf
            british.xnews2.config r3 = r0.f6961m
            r6 = 0
            r3.mo7486N0(r0, r6)
        L_0x02bf:
            java.lang.String r3 = "search"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.app.SearchManager r3 = (android.app.SearchManager) r3
            british.xnews2.chat_perfil$v r6 = new british.xnews2.chat_perfil$v
            r6.<init>()
            r3.setOnCancelListener(r6)
            british.xnews2.chat_perfil$a0 r6 = new british.xnews2.chat_perfil$a0
            r6.<init>()
            r3.setOnDismissListener(r6)
            british.xnews2.config r3 = r0.f6961m
            r6 = 0
            british.xnews2.c r3 = r3.mo7474A0(r0, r6)
            r0.f6982y = r3
            java.lang.String r3 = "sh"
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r6)
            r0.f6968p0 = r3
            r6 = 0
            java.lang.String r8 = "idusu"
            long r6 = r3.getLong(r8, r6)
            r0.f6936C = r6
            android.content.SharedPreferences r3 = r0.f6968p0
            java.lang.String r6 = "cod"
            java.lang.String r7 = ""
            java.lang.String r3 = r3.getString(r6, r7)
            r0.f6952S = r3
            android.content.SharedPreferences r3 = r0.f6968p0
            java.lang.String r6 = "cod_g"
            java.lang.String r3 = r3.getString(r6, r7)
            r0.f6955V = r3
            android.content.SharedPreferences r3 = r0.f6968p0
            java.lang.String r6 = "email_confirmado"
            r8 = 0
            boolean r3 = r3.getBoolean(r6, r8)
            r0.f6947N = r3
            android.content.SharedPreferences r3 = r0.f6968p0
            java.lang.String r6 = "nick"
            java.lang.String r3 = r3.getString(r6, r7)
            boolean r3 = r3.equals(r7)
            r0.f6965o = r3
            java.lang.String r3 = r0.f6953T
            boolean r3 = r3.equals(r7)
            r12 = 2131362897(0x7f0a0451, float:1.8345588E38)
            r13 = 2131362083(0x7f0a0123, float:1.8343937E38)
            r14 = 2131362003(0x7f0a00d3, float:1.8343774E38)
            r15 = 2131361997(0x7f0a00cd, float:1.8343762E38)
            if (r3 != 0) goto L_0x04f6
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r8 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r9 = 2
            int[] r10 = new int[r9]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r11 = r0.f6953T
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            int r9 = android.graphics.Color.parseColor(r9)
            r11 = 0
            r10[r11] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r11 = r0.f6954U
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            int r9 = android.graphics.Color.parseColor(r9)
            r10[r4] = r9
            r3.<init>(r8, r10)
            r8 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r8 = r0.findViewById(r8)
            r8.setBackgroundDrawable(r3)
            r3 = -1
            int r8 = british.xnews2.C1692config.f7104D5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r10 = r0.f6953T
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            boolean r9 = british.xnews2.C1692config.m8153I(r9)
            if (r9 == 0) goto L_0x0396
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r8 = british.xnews2.C1692config.f7102B5
        L_0x0396:
            r9 = 2131362690(0x7f0a0382, float:1.8345168E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r3)
            r9 = 2131362691(0x7f0a0383, float:1.834517E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r3)
            android.view.View r9 = r0.findViewById(r14)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r3)
            r9 = 2131362133(0x7f0a0155, float:1.8344038E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r3)
            android.view.View r9 = r0.findViewById(r15)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r3)
            r9 = 2131362080(0x7f0a0120, float:1.834393E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r3)
            r9 = 2131362081(0x7f0a0121, float:1.8343933E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r3)
            r9 = 2131362082(0x7f0a0122, float:1.8343935E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r8)
            android.view.View r9 = r0.findViewById(r13)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r8)
            r8 = 2131362100(0x7f0a0134, float:1.8343971E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setTextColor(r3)
            r8 = 2131362101(0x7f0a0135, float:1.8343973E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setTextColor(r3)
            r8 = 2131362245(0x7f0a01c5, float:1.8344265E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setTextColor(r3)
            r8 = 2131362246(0x7f0a01c6, float:1.8344267E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setTextColor(r3)
            r8 = 2131362896(0x7f0a0450, float:1.8345586E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setTextColor(r3)
            android.view.View r8 = r0.findViewById(r12)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setTextColor(r3)
            r8 = 2131362007(0x7f0a00d7, float:1.8343782E38)
            android.view.View r9 = r0.findViewById(r8)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r3)
            r8 = 2131362248(0x7f0a01c8, float:1.8344271E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setTextColor(r3)
            r8 = 2131362250(0x7f0a01ca, float:1.8344275E38)
            android.view.View r9 = r0.findViewById(r8)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r3)
            r8 = 2131363097(0x7f0a0519, float:1.8345993E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setTextColor(r3)
            r8 = 2131363154(0x7f0a0552, float:1.8346109E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setTextColor(r3)
            r8 = 2131363074(0x7f0a0502, float:1.8345947E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setTextColor(r3)
            r8 = 2131363069(0x7f0a04fd, float:1.8345936E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setTextColor(r3)
            r8 = 2131363126(0x7f0a0536, float:1.8346052E38)
            android.view.View r9 = r0.findViewById(r8)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setTextColor(r3)
            r3 = 20
            if (r2 <= r3) goto L_0x04f6
            r2 = 2131362002(0x7f0a00d2, float:1.8343772E38)
            android.view.View r3 = r0.findViewById(r2)
            android.widget.EditText r3 = (android.widget.EditText) r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r8 = r0.f6953T
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            boolean r2 = british.xnews2.C1692config.m8153I(r2)
            r2 = r2 ^ r4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            british.xnews2.config r8 = r0.f6961m
            java.lang.String r8 = r8.f7417s1
            british.xnews2.C1692config.m8150F(r3, r2, r8)
            r2 = 2131361996(0x7f0a00cc, float:1.834376E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r8 = r0.f6953T
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            boolean r3 = british.xnews2.C1692config.m8153I(r3)
            r3 = r3 ^ r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            british.xnews2.config r8 = r0.f6961m
            java.lang.String r8 = r8.f7417s1
            british.xnews2.C1692config.m8150F(r2, r3, r8)
        L_0x04f6:
            british.xnews2.config r2 = r0.f6961m
            java.io.File r2 = r2.mo7516l0(r0, r4)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x050f
            british.xnews2.config r2 = r0.f6961m     // Catch:{ Exception -> 0x050d }
            r3 = 2
            java.io.File r2 = r2.mo7505h0(r0, r3)     // Catch:{ Exception -> 0x050d }
            r2.delete()     // Catch:{ Exception -> 0x050d }
            goto L_0x051f
        L_0x050d:
            goto L_0x051f
        L_0x050f:
            british.xnews2.config r2 = r0.f6961m     // Catch:{ Exception -> 0x050d }
            java.io.File r2 = r2.mo7516l0(r0, r4)     // Catch:{ Exception -> 0x050d }
            british.xnews2.config r3 = r0.f6961m     // Catch:{ Exception -> 0x050d }
            r8 = 2
            java.io.File r3 = r3.mo7505h0(r0, r8)     // Catch:{ Exception -> 0x050d }
            british.xnews2.C1692config.m8202w(r2, r3)     // Catch:{ Exception -> 0x050d }
        L_0x051f:
            british.xnews2.config r2 = r0.f6961m
            int r2 = r2.f7393o5
            r3 = 8
            if (r2 == r4) goto L_0x052a
            r8 = 2
            if (r2 != r8) goto L_0x05de
        L_0x052a:
            android.content.SharedPreferences r2 = r0.f6968p0
            java.lang.String r8 = "logineado_fb"
            r9 = 0
            boolean r2 = r2.getBoolean(r8, r9)
            if (r2 != 0) goto L_0x05de
            british.xnews2.config r2 = r0.f6961m
            int r2 = r2.f7400p5
            if (r2 == r4) goto L_0x057c
            r2 = 2131362368(0x7f0a0240, float:1.8344515E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            com.facebook.e r8 = com.facebook.C3448e.C3449a.m11509a()     // Catch:{ Exception -> 0x056e }
            r0.f6974s0 = r8     // Catch:{ Exception -> 0x056e }
            com.facebook.login.widget.LoginButton r8 = new com.facebook.login.widget.LoginButton     // Catch:{ Exception -> 0x056e }
            r8.<init>(r0)     // Catch:{ Exception -> 0x056e }
            r0.f6976t0 = r8     // Catch:{ Exception -> 0x056e }
            java.lang.String r9 = "public_profile"
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch:{ Exception -> 0x056e }
            r8.setReadPermissions((java.lang.String[]) r9)     // Catch:{ Exception -> 0x056e }
            com.facebook.login.widget.LoginButton r8 = r0.f6976t0     // Catch:{ Exception -> 0x056e }
            com.facebook.e r9 = r0.f6974s0     // Catch:{ Exception -> 0x056e }
            british.xnews2.chat_perfil$b0 r10 = new british.xnews2.chat_perfil$b0     // Catch:{ Exception -> 0x056e }
            r10.<init>()     // Catch:{ Exception -> 0x056e }
            r8.mo12273A(r9, r10)     // Catch:{ Exception -> 0x056e }
            british.xnews2.chat_perfil$c0 r8 = new british.xnews2.chat_perfil$c0     // Catch:{ Exception -> 0x056e }
            r8.<init>()     // Catch:{ Exception -> 0x056e }
            r2.setOnClickListener(r8)     // Catch:{ Exception -> 0x056e }
        L_0x056e:
            r8 = 0
            r2.setVisibility(r8)
            r2 = 2131363189(0x7f0a0575, float:1.834618E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r8)
        L_0x057c:
            british.xnews2.config r2 = r0.f6961m
            int r2 = r2.f7400p5
            if (r2 == 0) goto L_0x05b5
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$a r2 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$a
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r8 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f28252m
            r2.<init>(r8)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.mo29109a()
            com.google.android.gms.auth.api.signin.b r2 = com.google.android.gms.auth.api.signin.C7064a.m28995a(r0, r2)
            r8 = 2131362372(0x7f0a0244, float:1.8344523E38)
            android.view.View r8 = r0.findViewById(r8)
            british.xnews2.chat_perfil$d0 r9 = new british.xnews2.chat_perfil$d0
            r9.<init>(r2)
            r8.setOnClickListener(r9)
            r2 = 2131362372(0x7f0a0244, float:1.8344523E38)
            android.view.View r2 = r0.findViewById(r2)
            r8 = 0
            r2.setVisibility(r8)
            r2 = 2131363189(0x7f0a0575, float:1.834618E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r8)
        L_0x05b5:
            british.xnews2.config r2 = r0.f6961m
            int r2 = r2.f7393o5
            r8 = 2
            if (r2 != r8) goto L_0x05de
            boolean r2 = r0.f6965o
            if (r2 == 0) goto L_0x05de
            r2 = 2131363189(0x7f0a0575, float:1.834618E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 2131362958(0x7f0a048e, float:1.8345711E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 2131362471(0x7f0a02a7, float:1.8344724E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
        L_0x05de:
            british.xnews2.config r2 = r0.f6961m
            int r2 = r2.f7393o5
            r8 = 3
            r9 = 5
            if (r2 != r8) goto L_0x06d4
            boolean r2 = r0.f6947N
            r8 = 2131363047(0x7f0a04e7, float:1.8345892E38)
            r10 = 2131363049(0x7f0a04e9, float:1.8345896E38)
            java.lang.String r11 = "email"
            if (r2 == 0) goto L_0x0676
            android.view.View r2 = r0.findViewById(r10)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r13 = british.xnews2.C1692config.m8149E(r0, r9)
            r14 = 0
            r2.setMargins(r14, r13, r14, r14)
            android.view.View r2 = r0.findViewById(r10)
            r2.requestLayout()
            android.view.View r2 = r0.findViewById(r8)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r13 = british.xnews2.C1692config.m8149E(r0, r9)
            r2.setMargins(r14, r13, r14, r14)
            android.view.View r2 = r0.findViewById(r8)
            r2.requestLayout()
            android.view.View r2 = r0.findViewById(r15)
            r2.setVisibility(r3)
            r2 = 2131362134(0x7f0a0156, float:1.834404E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.SharedPreferences r13 = r0.f6968p0
            java.lang.String r13 = r13.getString(r11, r7)
            r2.setText(r13)
            android.view.View r2 = r0.findViewById(r15)
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.content.SharedPreferences r13 = r0.f6968p0
            java.lang.String r11 = r13.getString(r11, r7)
            r2.setText(r11)
            r2 = 2131362134(0x7f0a0156, float:1.834404E38)
            android.view.View r2 = r0.findViewById(r2)
            r14 = 0
            r2.setVisibility(r14)
            r2 = 2131361995(0x7f0a00cb, float:1.8343758E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 2131362082(0x7f0a0122, float:1.8343935E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setOnClickListener(r0)
            r2 = 2131362486(0x7f0a02b6, float:1.8344754E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r14)
            r11 = 0
            goto L_0x06c6
        L_0x0676:
            r14 = 0
            android.view.View r2 = r0.findViewById(r15)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.SharedPreferences r15 = r0.f6968p0
            java.lang.String r11 = r15.getString(r11, r7)
            r2.setText(r11)
            android.content.SharedPreferences r2 = r0.f6968p0
            java.lang.String r11 = "mostrar_recordarcontra"
            boolean r2 = r2.getBoolean(r11, r14)
            if (r2 == 0) goto L_0x06b6
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r11 = 150(0x96, float:2.1E-43)
            int r11 = british.xnews2.C1692config.m8149E(r0, r11)
            r14 = -2
            r2.<init>(r11, r14)
            r11 = 2131361995(0x7f0a00cb, float:1.8343758E38)
            android.view.View r11 = r0.findViewById(r11)
            r11.setLayoutParams(r2)
            android.view.View r2 = r0.findViewById(r13)
            r2.setOnClickListener(r0)
            android.view.View r2 = r0.findViewById(r13)
            r11 = 0
            r2.setVisibility(r11)
            goto L_0x06c6
        L_0x06b6:
            r11 = 0
            r2 = 2131361995(0x7f0a00cb, float:1.8343758E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r13 = 2131820753(0x7f1100d1, float:1.927423E38)
            r2.setHint(r13)
        L_0x06c6:
            android.view.View r2 = r0.findViewById(r10)
            r2.setVisibility(r11)
            android.view.View r2 = r0.findViewById(r8)
            r2.setVisibility(r11)
        L_0x06d4:
            int r2 = r0.f6940G
            if (r2 != 0) goto L_0x06e4
            r2 = 2131363051(0x7f0a04eb, float:1.83459E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            r8 = 2
            goto L_0x06f1
        L_0x06e4:
            r8 = 2
            if (r2 != r8) goto L_0x06f1
            r2 = 2131362250(0x7f0a01ca, float:1.8344275E38)
            android.view.View r10 = r0.findViewById(r2)
            r10.setVisibility(r3)
        L_0x06f1:
            int r2 = r0.f6943J
            if (r2 != 0) goto L_0x0700
            r2 = 2131363048(0x7f0a04e8, float:1.8345894E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            goto L_0x070c
        L_0x0700:
            if (r2 != r8) goto L_0x070c
            r2 = 2131362101(0x7f0a0135, float:1.8343973E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
        L_0x070c:
            int r2 = r0.f6941H
            if (r2 != 0) goto L_0x071b
            r2 = 2131363050(0x7f0a04ea, float:1.8345898E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            goto L_0x0728
        L_0x071b:
            r8 = 2
            if (r2 != r8) goto L_0x0728
            r2 = 2131362246(0x7f0a01c6, float:1.8344267E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
        L_0x0728:
            british.xnews2.config r2 = r0.f6961m
            boolean r2 = r2.f7308b2
            if (r2 == 0) goto L_0x0743
            r2 = 2131361999(0x7f0a00cf, float:1.8343766E38)
            android.view.View r2 = r0.findViewById(r2)
            r8 = 0
            r2.setVisibility(r8)
            r2 = 2131362000(0x7f0a00d0, float:1.8343768E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r8)
        L_0x0743:
            int r2 = r0.f6942I
            if (r2 != 0) goto L_0x0752
            r2 = 2131363056(0x7f0a04f0, float:1.834591E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            goto L_0x075c
        L_0x0752:
            r8 = 2
            if (r2 != r8) goto L_0x075c
            android.view.View r2 = r0.findViewById(r12)
            r2.setVisibility(r3)
        L_0x075c:
            int r2 = r0.f6944K
            if (r2 != 0) goto L_0x076b
            r2 = 2131363046(0x7f0a04e6, float:1.834589E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            goto L_0x0793
        L_0x076b:
            r2 = 2131363097(0x7f0a0519, float:1.8345993E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.res.Resources r10 = r16.getResources()
            r11 = 2131820709(0x7f1100a5, float:1.927414E38)
            java.lang.String r10 = r10.getString(r11)
            r8.append(r10)
            java.lang.String r10 = ":"
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r2.setText(r8)
        L_0x0793:
            int r2 = r0.f6945L
            if (r2 != 0) goto L_0x07a1
            r2 = 2131363055(0x7f0a04ef, float:1.8345908E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
        L_0x07a1:
            british.xnews2.config r2 = r0.f6961m
            boolean r8 = r2.f7324e
            if (r8 == 0) goto L_0x07fa
            int r2 = r2.f7439v2
            r8 = 2
            if (r2 == r8) goto L_0x07af
            r8 = 4
            if (r2 != r8) goto L_0x07fa
        L_0x07af:
            r2 = 2131363126(0x7f0a0536, float:1.8346052E38)
            android.view.View r8 = r0.findViewById(r2)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r10 = "<u>"
            r2.append(r10)
            android.content.res.Resources r10 = r16.getResources()
            r11 = 2131820897(0x7f110161, float:1.9274522E38)
            java.lang.String r10 = r10.getString(r11)
            r2.append(r10)
            java.lang.String r10 = "</u>"
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            r8.setText(r2)
            r2 = 2131363126(0x7f0a0536, float:1.8346052E38)
            android.view.View r2 = r0.findViewById(r2)
            british.xnews2.chat_perfil$e0 r8 = new british.xnews2.chat_perfil$e0
            r8.<init>()
            r2.setOnClickListener(r8)
            r2 = 2131363043(0x7f0a04e3, float:1.8345884E38)
            android.view.View r2 = r0.findViewById(r2)
            r8 = 0
            r2.setVisibility(r8)
        L_0x07fa:
            r2 = 2131361969(0x7f0a00b1, float:1.8343705E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f6949P = r2
            r2.setOnClickListener(r0)
            r2 = 2131361966(0x7f0a00ae, float:1.83437E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r8 = r0.f6656b
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x084d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r10 = r0.f6656b
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r2.setBackgroundColor(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r10 = r0.f6656b
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            boolean r8 = british.xnews2.C1692config.m8153I(r8)
            if (r8 == 0) goto L_0x084d
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setTextColor(r8)
        L_0x084d:
            r2.setOnClickListener(r0)
            r2 = 2131361973(0x7f0a00b5, float:1.8343713E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r8 = r0.f6973s
            if (r8 != 0) goto L_0x08ee
            int r8 = r0.f6946M
            if (r8 == r4) goto L_0x086b
            int r10 = r0.f6944K
            if (r10 == r4) goto L_0x086b
            british.xnews2.config r10 = r0.f6961m
            boolean r10 = r10.f7302a2
            if (r10 == 0) goto L_0x08ee
        L_0x086b:
            if (r8 == r4) goto L_0x0873
            british.xnews2.config r10 = r0.f6961m
            boolean r10 = r10.f7302a2
            if (r10 == 0) goto L_0x08ad
        L_0x0873:
            int r10 = r0.f6944K
            if (r10 != r4) goto L_0x08ad
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.res.Resources r10 = r16.getResources()
            r11 = 2131820895(0x7f11015f, float:1.9274518E38)
            java.lang.String r10 = r10.getString(r11)
            java.lang.String r10 = r10.toUpperCase()
            r8.append(r10)
            java.lang.String r10 = "/"
            r8.append(r10)
            android.content.res.Resources r10 = r16.getResources()
            r11 = 2131821020(0x7f1101dc, float:1.9274771E38)
            java.lang.String r10 = r10.getString(r11)
            java.lang.String r10 = r10.toUpperCase()
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r2.setText(r8)
            goto L_0x08ea
        L_0x08ad:
            if (r8 == r4) goto L_0x08b5
            british.xnews2.config r10 = r0.f6961m
            boolean r10 = r10.f7302a2
            if (r10 == 0) goto L_0x08cc
        L_0x08b5:
            int r10 = r0.f6944K
            if (r10 != 0) goto L_0x08cc
            android.content.res.Resources r8 = r16.getResources()
            r10 = 2131820895(0x7f11015f, float:1.9274518E38)
            java.lang.String r8 = r8.getString(r10)
            java.lang.String r8 = r8.toUpperCase()
            r2.setText(r8)
            goto L_0x08ea
        L_0x08cc:
            if (r8 != 0) goto L_0x08ea
            british.xnews2.config r8 = r0.f6961m
            boolean r8 = r8.f7302a2
            if (r8 != 0) goto L_0x08ea
            int r8 = r0.f6944K
            if (r8 != r4) goto L_0x08ea
            android.content.res.Resources r8 = r16.getResources()
            r10 = 2131820709(0x7f1100a5, float:1.927414E38)
            java.lang.String r8 = r8.getString(r10)
            java.lang.String r8 = r8.toUpperCase()
            r2.setText(r8)
        L_0x08ea:
            r2.setOnClickListener(r0)
            goto L_0x08fb
        L_0x08ee:
            r2.setVisibility(r3)
            r2 = 2131361974(0x7f0a00b6, float:1.8343715E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
        L_0x08fb:
            r2 = 2131361962(0x7f0a00aa, float:1.8343691E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r8 = r0.f6965o
            if (r8 != 0) goto L_0x092e
            r2.setOnClickListener(r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r10 = r0.f6954U
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            boolean r8 = british.xnews2.C1692config.m8153I(r8)
            if (r8 == 0) goto L_0x0928
            int r8 = british.xnews2.C1692config.f7106F5
            r2.setTextColor(r8)
            goto L_0x0931
        L_0x0928:
            int r8 = british.xnews2.C1692config.f7105E5
            r2.setTextColor(r8)
            goto L_0x0931
        L_0x092e:
            r2.setVisibility(r3)
        L_0x0931:
            r2 = 0
            r0.f6975t = r2
            british.xnews2.config r2 = r0.f6961m
            boolean r2 = r2.f7290Y0
            if (r2 == 0) goto L_0x093c
            r0.f6975t = r4
        L_0x093c:
            r2 = 2131361971(0x7f0a00b3, float:1.834371E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r8 = 2131361972(0x7f0a00b4, float:1.8343711E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            british.xnews2.config r10 = r0.f6961m
            boolean r11 = r10.f7372l5
            if (r11 != 0) goto L_0x095d
            boolean r11 = r0.f6975t
            if (r11 == 0) goto L_0x0959
            goto L_0x095d
        L_0x0959:
            r2.setVisibility(r3)
            goto L_0x09b5
        L_0x095d:
            int r10 = r10.f7393o5
            r11 = 2
            if (r10 != r11) goto L_0x0990
            boolean r10 = r0.f6965o
            if (r10 == 0) goto L_0x0990
            r8.setOnClickListener(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r5 = r0.f6954U
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            boolean r2 = british.xnews2.C1692config.m8153I(r2)
            if (r2 == 0) goto L_0x0986
            int r2 = british.xnews2.C1692config.f7106F5
            r8.setTextColor(r2)
            goto L_0x098b
        L_0x0986:
            int r2 = british.xnews2.C1692config.f7105E5
            r8.setTextColor(r2)
        L_0x098b:
            r2 = 0
            r8.setVisibility(r2)
            goto L_0x09b5
        L_0x0990:
            r2.setOnClickListener(r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = r0.f6954U
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            boolean r5 = british.xnews2.C1692config.m8153I(r5)
            if (r5 == 0) goto L_0x09b0
            int r5 = british.xnews2.C1692config.f7106F5
            r2.setTextColor(r5)
            goto L_0x09b5
        L_0x09b0:
            int r5 = british.xnews2.C1692config.f7105E5
            r2.setTextColor(r5)
        L_0x09b5:
            r2 = 2131362249(0x7f0a01c9, float:1.8344273E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f6948O = r2
            r2 = 2131362131(0x7f0a0153, float:1.8344034E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f6950Q = r2
            r2.setOnClickListener(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.res.Resources r5 = r16.getResources()
            r8 = 2131820768(0x7f1100e0, float:1.927426E38)
            java.lang.String r5 = r5.getString(r8)
            r2.add(r5)
            r5 = 1
        L_0x09e2:
            r8 = 32
            if (r5 >= r8) goto L_0x09fb
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            r2.add(r8)
            int r5 = r5 + 1
            goto L_0x09e2
        L_0x09fb:
            r5 = 2131361999(0x7f0a00cf, float:1.8343766E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.Spinner r5 = (android.widget.Spinner) r5
            r0.f6959Z = r5
            android.widget.ArrayAdapter r5 = new android.widget.ArrayAdapter
            r8 = 17367048(0x1090008, float:2.5162948E-38)
            r5.<init>(r0, r8, r2)
            r2 = 17367049(0x1090009, float:2.516295E-38)
            r5.setDropDownViewResource(r2)
            android.widget.Spinner r10 = r0.f6959Z
            r10.setAdapter(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.content.res.Resources r10 = r16.getResources()
            r11 = 2131820930(0x7f110182, float:1.9274589E38)
            java.lang.String r10 = r10.getString(r11)
            r5.add(r10)
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            r10.set(r9, r4)
            r9 = 0
        L_0x0a34:
            r11 = 12
            if (r9 >= r11) goto L_0x0a6a
            r11 = 2
            r10.set(r11, r9)
            java.util.Locale r13 = java.util.Locale.getDefault()
            java.lang.String r13 = r10.getDisplayName(r11, r4, r13)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a64 }
            r11.<init>()     // Catch:{ Exception -> 0x0a64 }
            r14 = 0
            java.lang.String r15 = r13.substring(r14, r4)     // Catch:{ Exception -> 0x0a64 }
            java.util.Locale r14 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0a64 }
            java.lang.String r14 = r15.toUpperCase(r14)     // Catch:{ Exception -> 0x0a64 }
            r11.append(r14)     // Catch:{ Exception -> 0x0a64 }
            java.lang.String r14 = r13.substring(r4)     // Catch:{ Exception -> 0x0a64 }
            r11.append(r14)     // Catch:{ Exception -> 0x0a64 }
            java.lang.String r13 = r11.toString()     // Catch:{ Exception -> 0x0a64 }
        L_0x0a64:
            r5.add(r13)
            int r9 = r9 + 1
            goto L_0x0a34
        L_0x0a6a:
            r9 = 2131362000(0x7f0a00d0, float:1.8343768E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.Spinner r9 = (android.widget.Spinner) r9
            r0.f6960l0 = r9
            android.widget.ArrayAdapter r9 = new android.widget.ArrayAdapter
            r9.<init>(r0, r8, r5)
            r9.setDropDownViewResource(r2)
            android.widget.Spinner r5 = r0.f6960l0
            r5.setAdapter(r9)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.content.res.Resources r9 = r16.getResources()
            r10 = 2131820588(0x7f11002c, float:1.9273895E38)
            java.lang.String r9 = r9.getString(r10)
            r5.add(r9)
            java.util.Calendar r9 = java.util.Calendar.getInstance()
            r10 = 14
        L_0x0a9b:
            r11 = 100
            if (r10 >= r11) goto L_0x0ab9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r13 = r9.get(r4)
            int r13 = r13 - r10
            r11.append(r13)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r5.add(r11)
            int r10 = r10 + 1
            goto L_0x0a9b
        L_0x0ab9:
            r9 = 2131361998(0x7f0a00ce, float:1.8343764E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.Spinner r9 = (android.widget.Spinner) r9
            r0.f6962m0 = r9
            android.widget.ArrayAdapter r9 = new android.widget.ArrayAdapter
            r9.<init>(r0, r8, r5)
            r9.setDropDownViewResource(r2)
            android.widget.Spinner r5 = r0.f6962m0
            r5.setAdapter(r9)
            r5 = 2131362006(0x7f0a00d6, float:1.834378E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.Spinner r5 = (android.widget.Spinner) r5
            r0.f6964n0 = r5
            r5 = 2130903082(0x7f03002a, float:1.7412972E38)
            android.widget.ArrayAdapter r5 = android.widget.ArrayAdapter.createFromResource(r0, r5, r8)
            r5.setDropDownViewResource(r2)
            android.widget.Spinner r10 = r0.f6964n0
            r10.setAdapter(r5)
            r5 = 2131361994(0x7f0a00ca, float:1.8343756E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.Spinner r5 = (android.widget.Spinner) r5
            r0.f6966o0 = r5
            r5 = 2130903058(0x7f030012, float:1.7412923E38)
            android.widget.ArrayAdapter r5 = android.widget.ArrayAdapter.createFromResource(r0, r5, r8)
            r5.setDropDownViewResource(r2)
            android.widget.Spinner r10 = r0.f6966o0
            r10.setAdapter(r5)
            r5 = 2131362005(0x7f0a00d5, float:1.8343778E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.Spinner r5 = (android.widget.Spinner) r5
            r0.f6958Y = r5
            r5 = 2130903081(0x7f030029, float:1.741297E38)
            android.widget.ArrayAdapter r5 = android.widget.ArrayAdapter.createFromResource(r0, r5, r8)
            r5.setDropDownViewResource(r2)
            android.widget.Spinner r10 = r0.f6958Y
            r10.setAdapter(r5)
            r5 = 2131361988(0x7f0a00c4, float:1.8343744E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.Spinner r5 = (android.widget.Spinner) r5
            r0.f6957X = r5
            r5 = 2130903040(0x7f030000, float:1.7412887E38)
            android.widget.ArrayAdapter r5 = android.widget.ArrayAdapter.createFromResource(r0, r5, r8)
            r5.setDropDownViewResource(r2)
            android.widget.Spinner r2 = r0.f6957X
            r2.setAdapter(r5)
            android.content.SharedPreferences r2 = r0.f6968p0
            java.lang.String r5 = "fnac_d"
            r10 = 0
            int r2 = r2.getInt(r5, r10)
            british.xnews2.config r5 = r0.f6961m
            boolean r5 = r5.f7308b2
            if (r5 != 0) goto L_0x0b4a
            if (r2 != 0) goto L_0x0b4a
            r2 = 1
        L_0x0b4a:
            android.widget.Spinner r5 = r0.f6959Z
            r5.setSelection(r2)
            android.content.SharedPreferences r2 = r0.f6968p0
            java.lang.String r5 = "fnac_m"
            r10 = 0
            int r2 = r2.getInt(r5, r10)
            british.xnews2.config r5 = r0.f6961m
            boolean r5 = r5.f7308b2
            if (r5 != 0) goto L_0x0b61
            if (r2 != 0) goto L_0x0b61
            r2 = 1
        L_0x0b61:
            android.widget.Spinner r5 = r0.f6960l0
            r5.setSelection(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.SharedPreferences r5 = r0.f6968p0
            java.lang.String r10 = "fnac_a"
            r11 = 0
            int r5 = r5.getInt(r10, r11)
            r2.append(r5)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            int r2 = r9.getPosition(r2)
            r5 = -1
            if (r2 != r5) goto L_0x0b8b
            android.widget.Spinner r2 = r0.f6962m0
            r2.setSelection(r11)
            goto L_0x0b90
        L_0x0b8b:
            android.widget.Spinner r5 = r0.f6962m0
            r5.setSelection(r2)
        L_0x0b90:
            r2 = 2130903079(0x7f030027, float:1.7412966E38)
            android.widget.ArrayAdapter r2 = android.widget.ArrayAdapter.createFromResource(r0, r2, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.content.SharedPreferences r9 = r0.f6968p0
            java.lang.String r10 = "sexo"
            int r9 = r9.getInt(r10, r11)
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            int r2 = r2.getPosition(r5)
            android.widget.Spinner r5 = r0.f6964n0
            r5.setSelection(r2)
            r2 = 2131362007(0x7f0a00d7, float:1.8343782E38)
            android.view.View r5 = r0.findViewById(r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "  "
            r2.append(r9)
            android.widget.Spinner r9 = r0.f6964n0
            java.lang.Object r9 = r9.getSelectedItem()
            java.lang.String r9 = r9.toString()
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r5.setText(r2)
            r2 = 2130903077(0x7f030025, float:1.7412962E38)
            android.widget.ArrayAdapter r2 = android.widget.ArrayAdapter.createFromResource(r0, r2, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.content.SharedPreferences r9 = r0.f6968p0
            java.lang.String r10 = "coments"
            int r9 = r9.getInt(r10, r4)
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            int r2 = r2.getPosition(r5)
            android.widget.Spinner r5 = r0.f6966o0
            r5.setSelection(r2)
            r2 = 2130903078(0x7f030026, float:1.7412964E38)
            android.widget.ArrayAdapter r2 = android.widget.ArrayAdapter.createFromResource(r0, r2, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.content.SharedPreferences r9 = r0.f6968p0
            java.lang.String r10 = "privados"
            int r9 = r9.getInt(r10, r4)
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            int r2 = r2.getPosition(r5)
            android.widget.Spinner r5 = r0.f6958Y
            r5.setSelection(r2)
            r2 = 2130903061(0x7f030015, float:1.741293E38)
            android.widget.ArrayAdapter r2 = android.widget.ArrayAdapter.createFromResource(r0, r2, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.content.SharedPreferences r8 = r0.f6968p0
            java.lang.String r9 = "avisos"
            int r8 = r8.getInt(r9, r4)
            r5.append(r8)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            int r2 = r2.getPosition(r5)
            android.widget.Spinner r5 = r0.f6957X
            r5.setSelection(r2)
            r2 = 2131362002(0x7f0a00d2, float:1.8343772E38)
            android.view.View r5 = r0.findViewById(r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.content.SharedPreferences r2 = r0.f6968p0
            java.lang.String r2 = r2.getString(r6, r7)
            r5.setText(r2)
            r2 = 2131362003(0x7f0a00d3, float:1.8343774E38)
            android.view.View r5 = r0.findViewById(r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "  "
            r2.append(r8)
            android.content.SharedPreferences r8 = r0.f6968p0
            java.lang.String r6 = r8.getString(r6, r7)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.setText(r2)
            r2 = 2131361996(0x7f0a00cc, float:1.834376E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.SharedPreferences r5 = r0.f6968p0
            java.lang.String r6 = "descr"
            java.lang.String r5 = r5.getString(r6, r7)
            r2.setText(r5)
            british.xnews2.config r2 = r0.f6961m
            int r5 = r2.f7393o5
            if (r5 == r4) goto L_0x0ca5
            r6 = 2
            if (r5 != r6) goto L_0x0d2a
        L_0x0ca5:
            boolean r2 = r2.f7407q5
            if (r2 == 0) goto L_0x0d2a
            android.content.SharedPreferences r2 = r0.f6968p0
            java.lang.String r5 = "logineado_fb"
            r6 = 0
            boolean r2 = r2.getBoolean(r5, r6)
            if (r2 == 0) goto L_0x0d2a
            r2 = 2131362691(0x7f0a0383, float:1.834517E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 2131362002(0x7f0a00d2, float:1.8343772E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 2131362003(0x7f0a00d3, float:1.8343774E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r6)
            android.widget.Spinner r2 = r0.f6964n0
            int r2 = r2.getSelectedItemPosition()
            if (r2 <= 0) goto L_0x0cf5
            android.view.View r2 = r0.findViewById(r12)
            r2.setVisibility(r3)
            r2 = 2131362006(0x7f0a00d6, float:1.834378E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 2131362007(0x7f0a00d7, float:1.8343782E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r6)
        L_0x0cf5:
            british.xnews2.config r2 = r0.f6961m
            java.io.File r2 = r2.mo7516l0(r0, r4)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x0d0c
            r2 = 2131363051(0x7f0a04eb, float:1.83459E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            goto L_0x0d2a
        L_0x0d0c:
            r2 = 2131362250(0x7f0a01ca, float:1.8344275E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 2131362131(0x7f0a0153, float:1.8344034E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 2131361969(0x7f0a00b1, float:1.8343705E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
        L_0x0d2a:
            java.lang.String r2 = "0"
            r0.f6951R = r2
            if (r1 == 0) goto L_0x0d40
            java.lang.String r2 = "foto1_modif_saved"
            boolean r2 = r1.containsKey(r2)
            if (r2 == 0) goto L_0x0d40
            java.lang.String r2 = "foto1_modif_saved"
            java.lang.String r1 = r1.getString(r2)
            r0.f6951R = r1
        L_0x0d40:
            british.xnews2.config r1 = r0.f6961m
            r2 = 2
            java.io.File r1 = r1.mo7505h0(r0, r2)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x0d58
            r0.m8115o(r2, r4)
            boolean r1 = r0.f6965o
            if (r1 == 0) goto L_0x0d58
            java.lang.String r1 = "1"
            r0.f6951R = r1
        L_0x0d58:
            int r1 = r16.m8113h()
            r0.f6937D = r1
            android.os.Bundle r1 = r0.f6970q0
            java.lang.String r2 = "nocompletar"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L_0x0dbf
            british.xnews2.config r1 = r0.f6961m
            int r1 = r1.f7393o5
            r2 = 2
            if (r1 != r2) goto L_0x0d74
            boolean r1 = r0.f6965o
            if (r1 != 0) goto L_0x0dbf
        L_0x0d74:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            r2 = 0
            android.app.AlertDialog$Builder r1 = r1.setCancelable(r2)
            r2 = 2131820577(0x7f110021, float:1.9273873E38)
            java.lang.String r2 = r0.getString(r2)
            british.xnews2.chat_perfil$f0 r3 = new british.xnews2.chat_perfil$f0
            r3.<init>()
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r3)
            android.app.AlertDialog$Builder r1 = r1.setCancelable(r4)
            r2 = 2131820730(0x7f1100ba, float:1.9274183E38)
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            android.app.AlertDialog r1 = r1.create()
            java.lang.String r2 = r0.f6656b
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0dad
            british.xnews2.chat_perfil$g0 r2 = new british.xnews2.chat_perfil$g0
            r2.<init>(r1)
            r1.setOnShowListener(r2)
        L_0x0dad:
            r1.show()
            r2 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x0dca }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x0dca }
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0dca }
            r1.setTypeface(r2)     // Catch:{ Exception -> 0x0dca }
            goto L_0x0dca
        L_0x0dbf:
            android.view.Window r1 = r16.getWindow()
            r2 = 2
            r1.setSoftInputMode(r2)
            r16.mo7372p()
        L_0x0dca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.chat_perfil.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f6961m.f7384n3 == 0 || (cVar3 = this.f6982y) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f6961m.f7384n3 == 0 || (cVar2 = this.f6982y) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f6961m.f7384n3 == 0 || (cVar = this.f6982y) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (!(this.f6961m.f7384n3 == 0 || (cVar = this.f6982y) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C1683z());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 107) {
            if (iArr == null || iArr.length <= 0 || !strArr[0].equals("android.permission.CAMERA") || iArr[0] != 0) {
                C1692config.m8148C0(this, "", getResources().getString(R.string.permisos), this.f6656b);
                return;
            }
            this.f6972r0 = Long.valueOf(System.currentTimeMillis());
            C1692config config = this.f6961m;
            config.mo7525s0(this, config.mo7505h0(this, 2));
        } else if (i == 3) {
            boolean R0 = C1692config.m8166R0(this);
            if (((R0 && iArr.length > 0 && strArr[0].equals("android.permission.ACCESS_FINE_LOCATION") && iArr[0] == 0) || (R0 && iArr.length > 1 && strArr[1].equals("android.permission.ACCESS_FINE_LOCATION") && iArr[1] == 0)) && getPackageManager().checkPermission("android.permission.ACCESS_FINE_LOCATION", getPackageName()) == 0) {
                try {
                    C10971b a = C10975f.m49324a(this);
                    this.f6978u0 = a;
                    a.mo43269g().addOnSuccessListener((Activity) this, new C1634d());
                } catch (Exception unused) {
                }
            }
            if (iArr.length == 0 || ((iArr.length > 0 && iArr[0] == -1) || (iArr.length > 1 && iArr[1] == -1))) {
                AlertDialog create = new AlertDialog.Builder(this).setCancelable(false).setPositiveButton(getString(R.string.aceptar), new C1636e()).setMessage(R.string.permisos).create();
                if (!this.f6656b.equals("")) {
                    create.setOnShowListener(new C1638f(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            }
        }
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f6961m.f7384n3 != 0 && (cVar = this.f6982y) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f6983z = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f6983z) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f6983z = true;
        C1692config.m8175Y0(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("foto1_modif_saved", this.f6951R);
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
        this.f6983z = true;
        C1692config.m8175Y0(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo7372p() {
        if (this.f6968p0.contains("pp_aceptada")) {
            mo7373q();
        } else if (this.f6975t || this.f6961m.f7379m5) {
            new C1645i0(true).execute(new String[0]);
        } else {
            mo7373q();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo7373q() {
        int i;
        String[] strArr = new String[2];
        boolean z = true;
        if (!C1692config.m8166R0(this) || C0600b.m3289a(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            i = 0;
        } else {
            strArr[0] = "android.permission.ACCESS_FINE_LOCATION";
            i = 1;
        }
        if (i > 0) {
            String[] strArr2 = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                strArr2[i2] = strArr[i2];
            }
            C0008a.m34p(this, strArr2, 3);
            return;
        }
        C1692config config = this.f6961m;
        Bundle bundle = this.f6970q0;
        boolean z2 = bundle != null && bundle.containsKey("ad_entrar");
        Bundle bundle2 = this.f6970q0;
        if (bundle2 == null || !bundle2.containsKey("fb_entrar")) {
            z = false;
        }
        config.mo7504g1(this, z2, z, false);
    }

    public void videoEnded() {
        this.f6983z = true;
        C1692config.m8175Y0(this);
    }
}
