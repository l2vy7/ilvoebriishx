package british.p015x;

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
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import java.text.NumberFormat;
import java.util.ArrayList;

/* renamed from: british.x.t_buscchats_lista */
public class t_buscchats_lista extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    private int f8669A;

    /* renamed from: B */
    private int f8670B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f8671C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f8672D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f8673E = false;

    /* renamed from: F */
    private boolean f8674F = false;

    /* renamed from: G */
    private RecyclerView f8675G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public RecyclerView.C1092h f8676H;

    /* renamed from: I */
    private RecyclerView.C1104p f8677I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public Thread f8678J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C2125k f8679K;

    /* renamed from: L */
    private Runnable f8680L = new C2118g();

    /* renamed from: m */
    long f8681m;

    /* renamed from: n */
    int f8682n;

    /* renamed from: o */
    C1692config f8683o;

    /* renamed from: p */
    boolean f8684p = false;

    /* renamed from: q */
    Bundle f8685q;

    /* renamed from: r */
    C1603c f8686r;

    /* renamed from: s */
    boolean f8687s = false;

    /* renamed from: t */
    ListView f8688t;

    /* renamed from: u */
    SharedPreferences f8689u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public ArrayList<C2590v> f8690v = null;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public ArrayList<C2590v> f8691w = null;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public ArrayList<Integer> f8692x = null;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Runnable f8693y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f8694z;

    /* renamed from: british.x.t_buscchats_lista$a */
    class C2112a extends AdColonyInterstitialListener {
        C2112a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_buscchats_lista t_buscchats_lista = t_buscchats_lista.this;
            if (t_buscchats_lista.f8687s) {
                t_buscchats_lista.abrir_secc(t_buscchats_lista.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_buscchats_lista.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_buscchats_lista.this.f6661g.cancel();
            t_buscchats_lista t_buscchats_lista = t_buscchats_lista.this;
            t_buscchats_lista.abrir_secc(t_buscchats_lista.f6660f);
        }
    }

    /* renamed from: british.x.t_buscchats_lista$b */
    class C2113b implements SearchManager.OnCancelListener {
        C2113b() {
        }

        public void onCancel() {
            t_buscchats_lista t_buscchats_lista = t_buscchats_lista.this;
            t_buscchats_lista.f6657c = false;
            t_buscchats_lista.setResult(0);
        }
    }

    /* renamed from: british.x.t_buscchats_lista$c */
    class C2114c implements SearchManager.OnDismissListener {
        C2114c() {
        }

        public void onDismiss() {
            t_buscchats_lista.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_buscchats_lista$d */
    class C2115d implements View.OnClickListener {
        C2115d() {
        }

        public void onClick(View view) {
            t_buscchats_lista.this.finish();
        }
    }

    /* renamed from: british.x.t_buscchats_lista$e */
    class C2116e implements View.OnClickListener {
        C2116e() {
        }

        public void onClick(View view) {
            t_buscchats_lista.this.finish();
        }
    }

    /* renamed from: british.x.t_buscchats_lista$f */
    class C2117f implements Runnable {
        C2117f() {
        }

        public void run() {
            t_buscchats_lista.this.m8604q();
        }
    }

    /* renamed from: british.x.t_buscchats_lista$g */
    class C2118g implements Runnable {
        C2118g() {
        }

        public void run() {
            String str;
            try {
                t_buscchats_lista.this.findViewById(R.id.pb_chats).setVisibility(8);
            } catch (Exception unused) {
            }
            if (t_buscchats_lista.this.f8691w != null && t_buscchats_lista.this.f8691w.size() > 0) {
                for (int i = 0; i < t_buscchats_lista.this.f8691w.size(); i++) {
                    if (t_buscchats_lista.this.f8692x.indexOf(Integer.valueOf(((C2590v) t_buscchats_lista.this.f8691w.get(i)).f10324e)) == -1) {
                        t_buscchats_lista.this.f8690v.add((C2590v) t_buscchats_lista.this.f8691w.get(i));
                        t_buscchats_lista.this.f8692x.add(Integer.valueOf(((C2590v) t_buscchats_lista.this.f8691w.get(i)).f10324e));
                    }
                }
            }
            t_buscchats_lista.this.f8676H.notifyDataSetChanged();
            if (t_buscchats_lista.this.f8690v != null && t_buscchats_lista.this.f8690v.size() == 0) {
                if (!t_buscchats_lista.this.f8673E) {
                    str = t_buscchats_lista.this.getResources().getString(R.string.error_http);
                } else if (t_buscchats_lista.this.f8671C == 3) {
                    str = t_buscchats_lista.this.getResources().getString(R.string.lista_vacia_favoritos);
                } else {
                    str = t_buscchats_lista.this.getResources().getString(R.string.lista_vacia_porcat);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(t_buscchats_lista.this);
                builder.setCancelable(true).setPositiveButton(t_buscchats_lista.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(str);
                try {
                    AlertDialog create = builder.create();
                    create.show();
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            }
            if (t_buscchats_lista.this.f8690v != null && t_buscchats_lista.this.f8690v.size() > 0) {
                t_buscchats_lista.this.f8679K = new C2125k();
                t_buscchats_lista.this.f8679K.execute(new String[0]);
            }
        }
    }

    /* renamed from: british.x.t_buscchats_lista$h */
    class C2119h extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f8702a;

        /* renamed from: british.x.t_buscchats_lista$h$a */
        class C2120a extends FullScreenContentCallback {
            C2120a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_buscchats_lista t_buscchats_lista = t_buscchats_lista.this;
                if (t_buscchats_lista.f8687s) {
                    t_buscchats_lista.abrir_secc(t_buscchats_lista.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_buscchats_lista t_buscchats_lista = t_buscchats_lista.this;
                t_buscchats_lista.abrir_secc(t_buscchats_lista.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_buscchats_lista$h$b */
        class C2121b implements OnUserEarnedRewardListener {
            C2121b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2119h hVar = C2119h.this;
                t_buscchats_lista.this.f8687s = true;
                C1692config.m8175Y0(hVar.f8702a);
            }
        }

        C2119h(Context context) {
            this.f8702a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_buscchats_lista.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2120a());
            rewardedAd.show((Activity) this.f8702a, new C2121b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_buscchats_lista t_buscchats_lista = t_buscchats_lista.this;
            if (!t_buscchats_lista.f8683o.mo7502f(this.f8702a, t_buscchats_lista.f6663i)) {
                t_buscchats_lista.this.f6661g.cancel();
                t_buscchats_lista t_buscchats_lista2 = t_buscchats_lista.this;
                t_buscchats_lista2.abrir_secc(t_buscchats_lista2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_buscchats_lista$i */
    class C2122i implements AdDisplayListener {
        C2122i() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_buscchats_lista t_buscchats_lista = t_buscchats_lista.this;
            if (t_buscchats_lista.f8687s) {
                t_buscchats_lista.abrir_secc(t_buscchats_lista.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_buscchats_lista$j */
    public class C2123j extends RecyclerView.C1092h<C2124a> {

        /* renamed from: a */
        private ArrayList<C2590v> f8707a;

        /* renamed from: british.x.t_buscchats_lista$j$a */
        public class C2124a extends RecyclerView.C1087c0 {

            /* renamed from: a */
            public TextView f8709a;

            /* renamed from: b */
            public TextView f8710b;

            /* renamed from: c */
            public ImageView f8711c;

            /* renamed from: d */
            public LinearLayout f8712d;

            public C2124a(View view) {
                super(view);
                this.f8712d = (LinearLayout) view.findViewById(R.id.fila);
                this.f8709a = (TextView) view.findViewById(R.id.titulo);
                this.f8710b = (TextView) view.findViewById(R.id.nusus);
                this.f8711c = (ImageView) view.findViewById(R.id.f1);
            }
        }

        public C2123j(ArrayList<C2590v> arrayList) {
            this.f8707a = arrayList;
        }

        /* renamed from: a */
        public void onBindViewHolder(C2124a aVar, int i) {
            C2590v vVar = this.f8707a.get(i);
            aVar.f8709a.setText(vVar.f10320a);
            if (vVar.f10333n < 10) {
                TextView textView = aVar.f8710b;
                textView.setText("<10 " + t_buscchats_lista.this.getResources().getString(R.string.usuarios));
            } else {
                TextView textView2 = aVar.f8710b;
                textView2.setText(NumberFormat.getInstance().format((long) vVar.f10333n) + " " + t_buscchats_lista.this.getResources().getString(R.string.usuarios));
            }
            if (vVar.f10325f == 0) {
                aVar.f8711c.setImageDrawable(t_buscchats_lista.this.getResources().getDrawable(t_buscchats_lista.this.f8694z));
            } else {
                Bitmap bitmap = vVar.f10334o;
                if (bitmap != null) {
                    aVar.f8711c.setImageBitmap(bitmap);
                    if (!vVar.f10336q) {
                        vVar.f10336q = true;
                        aVar.f8711c.setVisibility(0);
                    }
                } else if (vVar.f10335p) {
                    aVar.f8711c.setImageDrawable(t_buscchats_lista.this.getResources().getDrawable(t_buscchats_lista.this.f8694z));
                } else {
                    aVar.f8711c.setImageDrawable(t_buscchats_lista.this.getResources().getDrawable(R.drawable.cargando));
                }
            }
            aVar.f8712d.setTag(Integer.valueOf(i));
            if (t_buscchats_lista.this.f8672D && i == t_buscchats_lista.this.f8690v.size() - 1) {
                if (t_buscchats_lista.this.f8678J == null || !t_buscchats_lista.this.f8678J.isAlive()) {
                    t_buscchats_lista.this.findViewById(R.id.pb_chats).setVisibility(0);
                    t_buscchats_lista.this.f8678J = new Thread((ThreadGroup) null, t_buscchats_lista.this.f8693y, "buscandoelems");
                    t_buscchats_lista.this.f8678J.start();
                }
            }
        }

        /* renamed from: b */
        public C2124a onCreateViewHolder(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_chat, viewGroup, false);
            Drawable drawable = t_buscchats_lista.this.getResources().getDrawable(R.drawable.ir);
            if (!t_buscchats_lista.this.f6656b.equals("")) {
                drawable.setColorFilter(Color.parseColor("#" + t_buscchats_lista.this.f6656b), PorterDuff.Mode.MULTIPLY);
            }
            ((ImageView) inflate.findViewById(R.id.iv_ir)).setImageDrawable(drawable);
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            t_buscchats_lista t_buscchats_lista = t_buscchats_lista.this;
            sb.append(t_buscchats_lista.f8683o.f7231O1[t_buscchats_lista.f8682n].f7916g);
            if (C1692config.m8153I(sb.toString())) {
                ((TextView) inflate.findViewById(R.id.titulo)).setTextColor(C1692config.f7101A5);
                ((TextView) inflate.findViewById(R.id.nusus)).setTextColor(C1692config.f7102B5);
            } else {
                ((TextView) inflate.findViewById(R.id.titulo)).setTextColor(-1);
                ((TextView) inflate.findViewById(R.id.nusus)).setTextColor(C1692config.f7104D5);
            }
            inflate.setOnClickListener(t_buscchats_lista.this);
            return new C2124a(inflate);
        }

        public int getItemCount() {
            return this.f8707a.size();
        }
    }

    /* renamed from: british.x.t_buscchats_lista$k */
    private class C2125k extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f8714a;

        /* renamed from: b */
        int f8715b;

        /* renamed from: c */
        int f8716c;

        /* renamed from: d */
        int f8717d;

        /* renamed from: e */
        Bitmap f8718e;

        private C2125k() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r9) {
            /*
                r8 = this;
                java.lang.String r9 = "ANDROID:KO"
                int r0 = r8.f8717d     // Catch:{ Exception -> 0x0099 }
                r1 = 100
                if (r0 <= r1) goto L_0x000b
                int r0 = r0 - r1
                r8.f8717d = r0     // Catch:{ Exception -> 0x0099 }
            L_0x000b:
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x002f }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x002f }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x002f }
                java.lang.String r3 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x002f }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x002f }
                java.lang.String r3 = "/srv/imgs/gen/"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x002f }
                int r3 = r8.f8715b     // Catch:{ MalformedURLException -> 0x002f }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x002f }
                java.lang.String r3 = "_ico.png"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x002f }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x002f }
                r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x002f }
                goto L_0x0030
            L_0x002f:
                r1 = r0
            L_0x0030:
                java.net.URLConnection r2 = r1.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{  }
                r3 = 1
                r2.setDoInput(r3)     // Catch:{  }
                r4 = 5000(0x1388, float:7.006E-42)
                r2.setConnectTimeout(r4)     // Catch:{  }
                r5 = 7000(0x1b58, float:9.809E-42)
                r2.setReadTimeout(r5)     // Catch:{  }
                r2.connect()     // Catch:{  }
                java.io.InputStream r6 = r2.getInputStream()     // Catch:{  }
                android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{  }
                r7.<init>()     // Catch:{  }
                r7.inJustDecodeBounds = r3     // Catch:{  }
                android.graphics.BitmapFactory.decodeStream(r6, r0, r7)     // Catch:{  }
                r6.close()     // Catch:{  }
                r2.disconnect()     // Catch:{  }
                r2 = 1128792064(0x43480000, float:200.0)
                british.x.t_buscchats_lista r6 = british.p015x.t_buscchats_lista.this     // Catch:{  }
                android.content.res.Resources r6 = r6.getResources()     // Catch:{  }
                android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{  }
                float r2 = android.util.TypedValue.applyDimension(r3, r2, r6)     // Catch:{  }
                int r2 = java.lang.Math.round(r2)     // Catch:{  }
                int r2 = british.p015x.C1692config.m8192m(r7, r2, r2)     // Catch:{  }
                r7.inSampleSize = r2     // Catch:{  }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{  }
                r1.setDoInput(r3)     // Catch:{  }
                r1.setConnectTimeout(r4)     // Catch:{  }
                r1.setReadTimeout(r5)     // Catch:{  }
                r1.connect()     // Catch:{  }
                java.io.InputStream r1 = r1.getInputStream()     // Catch:{  }
                r2 = 0
                r7.inJustDecodeBounds = r2     // Catch:{  }
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1, r0, r7)     // Catch:{  }
                r8.f8718e = r0     // Catch:{  }
                r1.close()     // Catch:{  }
                java.lang.String r9 = "ANDROID:OK"
            L_0x0099:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_buscchats_lista.C2125k.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            try {
                if (this.f8714a == 1) {
                    ((C2590v) t_buscchats_lista.this.f8690v.get(this.f8716c)).f10335p = true;
                }
                if (str.indexOf("ANDROID:OK") != -1 && this.f8714a == 1) {
                    ((C2590v) t_buscchats_lista.this.f8690v.get(this.f8716c)).f10334o = C1692config.m8147C(this.f8718e, 1);
                }
                t_buscchats_lista.this.f8676H.notifyDataSetChanged();
                t_buscchats_lista t_buscchats_lista = t_buscchats_lista.this;
                t_buscchats_lista.f8679K = new C2125k();
                t_buscchats_lista.this.f8679K.execute(new String[0]);
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            int i;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= t_buscchats_lista.this.f8690v.size()) {
                    break;
                }
                C2590v vVar = (C2590v) t_buscchats_lista.this.f8690v.get(i2);
                if (!vVar.f10335p && (i = vVar.f10325f) != 0) {
                    this.f8714a = 1;
                    this.f8717d = i;
                    this.f8715b = vVar.f10323d;
                    this.f8716c = i2;
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                cancel(true);
            }
        }
    }

    /* renamed from: o */
    private void m8602o(C2590v vVar, int i) {
        Intent intent = new Intent(this, t_chat_contra.class);
        intent.putExtra("externo", true);
        intent.putExtra("idchat", vVar.f10324e);
        intent.putExtra("idtema", vVar.f10326g);
        intent.putExtra("fotos_perfil", vVar.f10327h);
        intent.putExtra("fnac", vVar.f10328i);
        intent.putExtra("sexo", vVar.f10329j);
        intent.putExtra("descr", vVar.f10330k);
        intent.putExtra("dist", vVar.f10331l);
        intent.putExtra("privados", vVar.f10337r);
        intent.putExtra("coments", vVar.f10338s);
        intent.putExtra("galeria", vVar.f10339t);
        intent.putExtra("fotos_chat", vVar.f10332m);
        intent.putExtra("c1", vVar.f10321b);
        intent.putExtra("c2", vVar.f10322c);
        intent.putExtra("tit_cab", vVar.f10320a);
        startActivityForResult(intent, 0);
    }

    /* renamed from: p */
    private void m8603p(Context context) {
        this.f6662h = new C2119h(context);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.net.URLConnection] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01f8  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8604q() {
        /*
            r30 = this;
            r1 = r30
            r2 = 1
            r3 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a6 }
            r0.<init>()     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = british.p015x.C1692config.f7109I5     // Catch:{ Exception -> 0x00a6 }
            r0.append(r4)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = "/srv/obtenerchats.php?idusu="
            r0.append(r4)     // Catch:{ Exception -> 0x00a6 }
            long r4 = r1.f8681m     // Catch:{ Exception -> 0x00a6 }
            r0.append(r4)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = "&tipo="
            r0.append(r4)     // Catch:{ Exception -> 0x00a6 }
            int r4 = r1.f8671C     // Catch:{ Exception -> 0x00a6 }
            r0.append(r4)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = "&idcat="
            r0.append(r4)     // Catch:{ Exception -> 0x00a6 }
            int r4 = r1.f8669A     // Catch:{ Exception -> 0x00a6 }
            r0.append(r4)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = "&idsubcat="
            r0.append(r4)     // Catch:{ Exception -> 0x00a6 }
            int r4 = r1.f8670B     // Catch:{ Exception -> 0x00a6 }
            r0.append(r4)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = "&fila="
            r0.append(r4)     // Catch:{ Exception -> 0x00a6 }
            java.util.ArrayList<british.x.v> r4 = r1.f8690v     // Catch:{ Exception -> 0x00a6 }
            int r4 = r4.size()     // Catch:{ Exception -> 0x00a6 }
            r0.append(r4)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a6 }
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x00a6 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00a6 }
            java.net.URLConnection r0 = r4.openConnection()     // Catch:{ Exception -> 0x00a6 }
            r4 = r0
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x00a6 }
            r4.setDoInput(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r0 = 10000(0x2710, float:1.4013E-41)
            r4.setConnectTimeout(r0)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r4.setReadTimeout(r0)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.lang.String r0 = "User-Agent"
            java.lang.String r3 = "Android Vinebre Software"
            r4.setRequestProperty(r0, r3)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r3.<init>(r5)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r0.<init>()     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
        L_0x0079:
            java.lang.String r5 = r3.readLine()     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            if (r5 == 0) goto L_0x0094
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r6.<init>()     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r6.append(r5)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.lang.String r5 = "\n"
            r6.append(r5)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r0.append(r5)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            goto L_0x0079
        L_0x0094:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r4.disconnect()
            goto L_0x00b1
        L_0x009c:
            r0 = move-exception
            r3 = r4
            goto L_0x01f6
        L_0x00a0:
            r0 = move-exception
            r3 = r4
            goto L_0x00a7
        L_0x00a3:
            r0 = move-exception
            goto L_0x01f6
        L_0x00a6:
            r0 = move-exception
        L_0x00a7:
            r0.printStackTrace()     // Catch:{ all -> 0x00a3 }
            if (r3 == 0) goto L_0x00af
            r3.disconnect()
        L_0x00af:
            java.lang.String r0 = ""
        L_0x00b1:
            java.lang.String r3 = "ANDROID:KO MOTIVO:INAPROPIADO"
            int r3 = r0.indexOf(r3)
            r4 = -1
            if (r3 == r4) goto L_0x00bc
            r1.f8674F = r2
        L_0x00bc:
            java.lang.String r3 = "ANDROID:OK RESULT:"
            int r3 = r0.indexOf(r3)
            r5 = 0
            r1.f8673E = r5
            if (r3 == r4) goto L_0x01f0
            android.content.SharedPreferences r6 = r1.f8689u
            android.content.SharedPreferences$Editor r6 = r6.edit()
            r1.f8673E = r2
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1.f8691w = r7
            java.lang.String r7 = "ANDROID:OK RESULT:0"
            int r7 = r0.indexOf(r7)
            if (r7 == r4) goto L_0x00e1
            r1.f8672D = r5
            goto L_0x00eb
        L_0x00e1:
            java.lang.String r7 = "ANDROID:OK RESULT:1"
            int r7 = r0.indexOf(r7)
            if (r7 == r4) goto L_0x00eb
            r1.f8672D = r2
        L_0x00eb:
            java.lang.String r7 = "@y@"
            int r3 = r0.indexOf(r7, r3)
        L_0x00f1:
            if (r3 == r4) goto L_0x01ed
            int r3 = r3 + 3
            java.lang.String r8 = ";"
            int r9 = r0.indexOf(r8, r3)
            java.lang.String r3 = r0.substring(r3, r9)
            int r11 = java.lang.Integer.parseInt(r3)
            int r9 = r9 + r2
            int r3 = r0.indexOf(r8, r9)
            java.lang.String r9 = r0.substring(r9, r3)
            int r12 = java.lang.Integer.parseInt(r9)
            int r3 = r3 + r2
            int r9 = r0.indexOf(r8, r3)
            java.lang.String r3 = r0.substring(r3, r9)
            int r13 = java.lang.Integer.parseInt(r3)
            int r9 = r9 + r2
            int r3 = r0.indexOf(r8, r9)
            java.lang.String r9 = r0.substring(r9, r3)
            int r17 = java.lang.Integer.parseInt(r9)
            int r3 = r3 + r2
            int r9 = r0.indexOf(r8, r3)
            java.lang.String r3 = r0.substring(r3, r9)
            int r3 = java.lang.Integer.parseInt(r3)
            int r9 = r9 + r2
            int r9 = r0.indexOf(r8, r9)
            int r9 = r9 + r2
            int r10 = r0.indexOf(r8, r9)
            java.lang.String r9 = r0.substring(r9, r10)
            int r22 = java.lang.Integer.parseInt(r9)
            int r10 = r10 + r2
            int r9 = r0.indexOf(r8, r10)
            java.lang.String r14 = r0.substring(r10, r9)
            int r9 = r9 + r2
            int r10 = r0.indexOf(r8, r9)
            java.lang.String r15 = r0.substring(r9, r10)
            int r10 = r10 + r2
            int r9 = r0.indexOf(r8, r10)
            java.lang.String r16 = r0.substring(r10, r9)
            int r9 = r9 + r2
            int r10 = r0.indexOf(r8, r9)
            java.lang.String r9 = r0.substring(r9, r10)
            int r26 = java.lang.Integer.parseInt(r9)
            int r10 = r10 + r2
            int r9 = r0.indexOf(r8, r10)
            java.lang.String r10 = r0.substring(r10, r9)
            int r10 = java.lang.Integer.parseInt(r10)
            int r9 = r9 + r2
            int r4 = r0.indexOf(r8, r9)
            java.lang.String r9 = r0.substring(r9, r4)
            int r18 = java.lang.Integer.parseInt(r9)
            int r4 = r4 + r2
            int r9 = r0.indexOf(r8, r4)
            java.lang.String r4 = r0.substring(r4, r9)
            int r19 = java.lang.Integer.parseInt(r4)
            int r9 = r9 + r2
            int r4 = r0.indexOf(r8, r9)
            java.lang.String r9 = r0.substring(r9, r4)
            int r20 = java.lang.Integer.parseInt(r9)
            int r4 = r4 + r2
            int r9 = r0.indexOf(r8, r4)
            java.lang.String r4 = r0.substring(r4, r9)
            int r4 = java.lang.Integer.parseInt(r4)
            int r9 = r9 + r2
            int r8 = r0.indexOf(r8, r9)
            java.lang.String r9 = r0.substring(r9, r8)
            int r21 = java.lang.Integer.parseInt(r9)
            r27 = 0
            java.util.ArrayList<british.x.v> r9 = r1.f8691w
            british.x.v r5 = new british.x.v
            if (r3 != r2) goto L_0x01ca
            r23 = 1
            goto L_0x01cc
        L_0x01ca:
            r23 = 0
        L_0x01cc:
            if (r10 != r2) goto L_0x01d1
            r24 = 1
            goto L_0x01d3
        L_0x01d1:
            r24 = 0
        L_0x01d3:
            if (r4 != r2) goto L_0x01d8
            r25 = 1
            goto L_0x01da
        L_0x01d8:
            r25 = 0
        L_0x01da:
            r28 = 1
            r29 = 0
            r10 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r9.add(r5)
            int r3 = r0.indexOf(r7, r8)
            r4 = -1
            r5 = 0
            goto L_0x00f1
        L_0x01ed:
            r6.commit()
        L_0x01f0:
            java.lang.Runnable r0 = r1.f8680L
            r1.runOnUiThread(r0)
            return
        L_0x01f6:
            if (r3 == 0) goto L_0x01fb
            r3.disconnect()
        L_0x01fb:
            goto L_0x01fd
        L_0x01fc:
            throw r0
        L_0x01fd:
            goto L_0x01fc
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_buscchats_lista.m8604q():void");
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f8683o.mo7510j0(view, this);
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
                    if (this.f8683o.f7427t4 != 2) {
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

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
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
        if (this.f8687s) {
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
        if (!this.f6659e || this.f8684p || !this.f8683o.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f8684p = true;
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
        if (view.getId() == R.id.fila) {
            int g0 = this.f8675G.mo5131g0(view);
            if (g0 < this.f8690v.size() && g0 != -1) {
                m8602o(this.f8690v.get(g0), g0);
                return;
            }
            return;
        }
        String str9 = this.f8683o.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f8683o.f7281W3) == null || str.equals("")) && (((str2 = this.f8683o.f7250R2) == null || str2.equals("")) && (((str3 = this.f8683o.f7245Q3) == null || str3.equals("")) && (((str4 = this.f8683o.f7269U3) == null || str4.equals("")) && (((str5 = this.f8683o.f7275V3) == null || str5.equals("")) && (((str6 = this.f8683o.f7358j4) == null || str6.equals("")) && (((str7 = this.f8683o.f7287X3) == null || str7.equals("")) && ((str8 = this.f8683o.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f8683o.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f8683o.f7251R3);
        }
        String str11 = this.f8683o.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f8683o.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f8683o.f7269U3);
        }
        String str13 = this.f8683o.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f8683o.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8260r();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f8686r;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f8686r;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f8686r = this.f8683o.mo7474A0(this, false);
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f8683o = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8603p(this);
        this.f6666l = new C2112a();
        Bundle extras = getIntent().getExtras();
        this.f8685q = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f8685q.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        int i = this.f8685q.getInt("ind");
        this.f8682n = i;
        C1692config config2 = this.f8683o;
        this.f6656b = C1692config.m8189h(config2.f7231O1[i].f7916g, config2.f7368l1);
        if (Build.VERSION.SDK_INT > 12) {
            if (!C1692config.m8153I("#" + this.f8683o.f7231O1[this.f8682n].f7916g)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_buscchats_lista);
        mo8260r();
        this.f8683o.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2113b());
        searchManager.setOnDismissListener(new C2114c());
        C1692config config3 = this.f8683o;
        Bundle bundle2 = this.f8685q;
        boolean z = bundle2 != null && bundle2.containsKey("ad_entrar");
        Bundle bundle3 = this.f8685q;
        config3.mo7503f1(this, z, bundle3 != null && bundle3.containsKey("fb_entrar"));
        this.f8669A = 0;
        this.f8670B = 0;
        this.f8671C = 0;
        Bundle bundle4 = this.f8685q;
        if (bundle4 != null && bundle4.containsKey("idcat")) {
            this.f8669A = this.f8685q.getInt("idcat");
        }
        Bundle bundle5 = this.f8685q;
        if (bundle5 != null && bundle5.containsKey("idsubcat")) {
            this.f8670B = this.f8685q.getInt("idsubcat");
        }
        Bundle bundle6 = this.f8685q;
        if (bundle6 != null && bundle6.containsKey("tipo")) {
            this.f8671C = this.f8685q.getInt("tipo");
        }
        this.f8686r = this.f8683o.mo7474A0(this, false);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f8689u = sharedPreferences;
        this.f8681m = sharedPreferences.getLong("idusu", 0);
        this.f8694z = R.drawable.sinfoto_chat;
        if (!this.f8683o.f7231O1[this.f8682n].f7916g.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f8683o.f7231O1[this.f8682n].f7916g), Color.parseColor("#" + this.f8683o.f7231O1[this.f8682n].f7919h)}));
        }
        if (C1692config.m8153I("#" + this.f8683o.f7231O1[this.f8682n].f7916g)) {
            findViewById(R.id.ll_cabe).setBackgroundColor(C1692config.f7106F5);
            ((TextView) findViewById(R.id.tv_cabe)).setTextColor(-1);
        } else {
            findViewById(R.id.ll_cabe).setBackgroundColor(C1692config.f7105E5);
            ((TextView) findViewById(R.id.tv_cabe)).setTextColor(C1692config.f7101A5);
        }
        Bundle bundle7 = this.f8685q;
        if (bundle7 != null && bundle7.containsKey("tit_cab")) {
            ((TextView) findViewById(R.id.tv_cabe)).setText(this.f8685q.getString("tit_cab"));
            findViewById(R.id.tv_cabe).setOnClickListener(new C2115d());
            findViewById(R.id.iv_cabe).setOnClickListener(new C2116e());
            findViewById(R.id.ll_cabe).setVisibility(0);
        }
        this.f8690v = new ArrayList<>();
        this.f8692x = new ArrayList<>();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        this.f8675G = recyclerView;
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.f8677I = linearLayoutManager;
        this.f8675G.setLayoutManager(linearLayoutManager);
        C2123j jVar = new C2123j(this.f8690v);
        this.f8676H = jVar;
        this.f8675G.setAdapter(jVar);
        this.f8693y = new C2117f();
        this.f8678J = new Thread((ThreadGroup) null, this.f8693y, "buscandoelems");
        findViewById(R.id.pb_chats).setVisibility(0);
        this.f8678J.start();
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f8683o.f7384n3 == 0 || (cVar3 = this.f8686r) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f8683o.f7384n3 == 0 || (cVar2 = this.f8686r) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f8683o.f7384n3 == 0 || (cVar = this.f8686r) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        C2125k kVar = this.f8679K;
        if (kVar != null) {
            try {
                kVar.cancel(true);
            } catch (Exception unused) {
            }
        }
        if (!(this.f8683o.f7384n3 == 0 || (cVar = this.f8686r) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2122i());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        ArrayList<C2590v> arrayList = this.f8690v;
        if (arrayList != null && arrayList.size() > 0) {
            C2125k kVar = new C2125k();
            this.f8679K = kVar;
            kVar.execute(new String[0]);
        }
        if (this.f8683o.f7384n3 != 0 && (cVar = this.f8686r) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f8687s = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f8687s) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f8687s = true;
        C1692config.m8175Y0(this);
    }

    public boolean onSearchRequested() {
        this.f6657c = true;
        this.f6658d = true;
        return super.onSearchRequested();
    }

    public void onStop() {
        if (this.f8674F) {
            finish();
        }
        super.onStop();
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f8687s = true;
        C1692config.m8175Y0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo8260r() {
        int q0 = this.f8683o.mo7522q0(this);
        int i = this.f8683o.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8688t = listView;
            this.f8683o.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8683o.f7231O1;
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
            int[] iArr = this.f8683o.f7249R1;
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

    public void videoEnded() {
        this.f8687s = true;
        C1692config.m8175Y0(this);
    }
}
