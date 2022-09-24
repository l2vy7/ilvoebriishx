package british.p015x;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
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
import java.util.ArrayList;

/* renamed from: british.x.SearchableActivity */
public class SearchableActivity extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: m */
    C1692config f6787m;

    /* renamed from: n */
    boolean f6788n = false;

    /* renamed from: o */
    boolean f6789o;

    /* renamed from: p */
    boolean f6790p;

    /* renamed from: q */
    C1603c f6791q;

    /* renamed from: r */
    Bundle f6792r;

    /* renamed from: s */
    ListView f6793s;

    /* renamed from: t */
    boolean f6794t = false;

    /* renamed from: u */
    private ListView f6795u;

    /* renamed from: v */
    ArrayList<C1589h> f6796v;

    /* renamed from: british.x.SearchableActivity$a */
    class C1579a extends AdColonyInterstitialListener {
        C1579a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            SearchableActivity searchableActivity = SearchableActivity.this;
            if (searchableActivity.f6794t) {
                searchableActivity.abrir_secc(searchableActivity.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            SearchableActivity.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            SearchableActivity.this.f6661g.cancel();
            SearchableActivity searchableActivity = SearchableActivity.this;
            searchableActivity.abrir_secc(searchableActivity.f6660f);
        }
    }

    /* renamed from: british.x.SearchableActivity$b */
    class C1580b implements SearchManager.OnCancelListener {
        C1580b() {
        }

        public void onCancel() {
            SearchableActivity searchableActivity = SearchableActivity.this;
            searchableActivity.f6657c = false;
            searchableActivity.setResult(0);
        }
    }

    /* renamed from: british.x.SearchableActivity$c */
    class C1581c implements SearchManager.OnDismissListener {
        C1581c() {
        }

        public void onDismiss() {
            SearchableActivity.this.f6658d = false;
        }
    }

    /* renamed from: british.x.SearchableActivity$d */
    class C1582d implements AdapterView.OnItemClickListener {
        C1582d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchableActivity searchableActivity = SearchableActivity.this;
            ArrayList<C1589h> arrayList = searchableActivity.f6796v;
            if (arrayList != null) {
                searchableActivity.m8070f(arrayList.get(i).f6815d);
            }
        }
    }

    /* renamed from: british.x.SearchableActivity$e */
    class C1583e extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f6801a;

        /* renamed from: british.x.SearchableActivity$e$a */
        class C1584a extends FullScreenContentCallback {
            C1584a() {
            }

            public void onAdDismissedFullScreenContent() {
                SearchableActivity searchableActivity = SearchableActivity.this;
                if (searchableActivity.f6794t) {
                    searchableActivity.abrir_secc(searchableActivity.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                SearchableActivity searchableActivity = SearchableActivity.this;
                searchableActivity.abrir_secc(searchableActivity.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.SearchableActivity$e$b */
        class C1585b implements OnUserEarnedRewardListener {
            C1585b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C1583e eVar = C1583e.this;
                SearchableActivity.this.f6794t = true;
                C1692config.m8175Y0(eVar.f6801a);
            }
        }

        C1583e(Context context) {
            this.f6801a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            SearchableActivity.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C1584a());
            rewardedAd.show((Activity) this.f6801a, new C1585b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            SearchableActivity searchableActivity = SearchableActivity.this;
            if (!searchableActivity.f6787m.mo7502f(this.f6801a, searchableActivity.f6663i)) {
                SearchableActivity.this.f6661g.cancel();
                SearchableActivity searchableActivity2 = SearchableActivity.this;
                searchableActivity2.abrir_secc(searchableActivity2.f6660f);
            }
        }
    }

    /* renamed from: british.x.SearchableActivity$f */
    class C1586f implements AdDisplayListener {
        C1586f() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            SearchableActivity searchableActivity = SearchableActivity.this;
            if (searchableActivity.f6794t) {
                searchableActivity.abrir_secc(searchableActivity.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.SearchableActivity$g */
    public class C1587g extends ArrayAdapter<C1589h> {

        /* renamed from: b */
        private ArrayList<C1589h> f6806b;

        /* renamed from: british.x.SearchableActivity$g$a */
        class C1588a {

            /* renamed from: a */
            TextView f6808a;

            /* renamed from: b */
            TextView f6809b;

            /* renamed from: c */
            ImageView f6810c;

            C1588a() {
            }
        }

        public C1587g(Context context, int i, ArrayList<C1589h> arrayList) {
            super(context, i, arrayList);
            this.f6806b = arrayList;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C1588a aVar;
            if (view == null) {
                view = SearchableActivity.this.getLayoutInflater().inflate(R.layout.search_item, (ViewGroup) null);
                aVar = new C1588a();
                aVar.f6810c = (ImageView) view.findViewById(R.id.iv);
                aVar.f6808a = (TextView) view.findViewById(R.id.tv_tit);
                aVar.f6809b = (TextView) view.findViewById(R.id.tv_descr);
                view.setTag(aVar);
            } else {
                aVar = (C1588a) view.getTag();
            }
            if (!SearchableActivity.this.f6789o) {
                aVar.f6810c.setVisibility(8);
            } else {
                aVar.f6810c.setVisibility(0);
                if (!this.f6806b.get(i).f6812a) {
                    aVar.f6810c.setImageBitmap((Bitmap) null);
                } else {
                    try {
                        aVar.f6810c.setImageBitmap(SearchableActivity.this.f6787m.f7231O1[this.f6806b.get(i).f6815d].f7869L0);
                    } catch (Exception | OutOfMemoryError unused) {
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 17 && SearchableActivity.this.getResources().getBoolean(R.bool.es_rtl)) {
                aVar.f6808a.setTextDirection(4);
                aVar.f6809b.setTextDirection(4);
            }
            if (SearchableActivity.this.f6787m.f7272V0) {
                aVar.f6808a.setText(this.f6806b.get(i).f6813b);
            }
            SearchableActivity searchableActivity = SearchableActivity.this;
            if (!searchableActivity.f6790p) {
                aVar.f6809b.setVisibility(8);
            } else if (searchableActivity.f6787m.f7272V0) {
                aVar.f6809b.setText(this.f6806b.get(i).f6814c);
                aVar.f6809b.setVisibility(0);
            } else {
                aVar.f6808a.setText(this.f6806b.get(i).f6814c);
                aVar.f6809b.setVisibility(8);
            }
            return view;
        }
    }

    /* renamed from: british.x.SearchableActivity$h */
    private class C1589h {

        /* renamed from: a */
        public boolean f6812a;

        /* renamed from: b */
        public String f6813b;

        /* renamed from: c */
        public String f6814c;

        /* renamed from: d */
        public int f6815d;

        private C1589h() {
            this.f6812a = false;
        }
    }

    /* renamed from: c */
    private void m8068c(Context context) {
        this.f6662h = new C1583e(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f3 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8069d(android.content.Intent r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "android.intent.action.SEARCH"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = "query"
            java.lang.String r12 = r12.getStringExtra(r0)
            java.lang.String r12 = r12.toLowerCase()
            java.lang.String r12 = british.p015x.C1692config.m8173W0(r12)
            java.lang.String r12 = r12.trim()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f6796v = r0
            java.lang.String r0 = ""
            boolean r1 = r12.equals(r0)
            r2 = 0
            if (r1 != 0) goto L_0x00f9
            british.x.config r1 = r11.f6787m
            british.x.l[] r1 = r1.f7231O1
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L_0x0035:
            if (r4 >= r3) goto L_0x00f9
            r6 = r1[r4]
            boolean r7 = r6.f7864J
            if (r7 == 0) goto L_0x00f3
            british.x.config r7 = r11.f6787m
            boolean r7 = r7.f7260T0
            if (r7 == 0) goto L_0x0053
            java.lang.String r7 = r6.f7901b
            if (r7 != 0) goto L_0x0053
            java.lang.String r7 = r6.f7898a
            java.lang.String r7 = british.p015x.C1692config.m8173W0(r7)
            java.lang.String r7 = r7.toLowerCase()
            r6.f7901b = r7
        L_0x0053:
            british.x.config r7 = r11.f6787m
            boolean r7 = r7.f7266U0
            if (r7 == 0) goto L_0x0069
            java.lang.String r7 = r6.f7907d
            if (r7 != 0) goto L_0x0069
            java.lang.String r7 = r6.f7904c
            java.lang.String r7 = british.p015x.C1692config.m8173W0(r7)
            java.lang.String r7 = r7.toLowerCase()
            r6.f7907d = r7
        L_0x0069:
            british.x.config r7 = r11.f6787m
            boolean r7 = r7.f7260T0
            r8 = 1
            if (r7 == 0) goto L_0x0088
            java.lang.String r7 = r6.f7901b
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0088
            java.lang.String r7 = r6.f7901b
            boolean r7 = r7.contains(r12)
            if (r7 != 0) goto L_0x00b0
            java.lang.String r7 = r6.f7901b
            boolean r7 = r12.contains(r7)
            if (r7 != 0) goto L_0x00b0
        L_0x0088:
            british.x.config r7 = r11.f6787m
            boolean r7 = r7.f7266U0
            if (r7 == 0) goto L_0x00a6
            java.lang.String r7 = r6.f7907d
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a6
            java.lang.String r7 = r6.f7907d
            boolean r7 = r7.contains(r12)
            if (r7 != 0) goto L_0x00b0
            java.lang.String r7 = r6.f7907d
            boolean r7 = r12.contains(r7)
            if (r7 != 0) goto L_0x00b0
        L_0x00a6:
            java.util.ArrayList<java.lang.String> r7 = r6.f7928k
            if (r7 == 0) goto L_0x00b2
            boolean r7 = r7.contains(r12)
            if (r7 == 0) goto L_0x00b2
        L_0x00b0:
            r7 = 1
            goto L_0x00d4
        L_0x00b2:
            java.util.ArrayList<java.lang.String> r7 = r6.f7928k
            if (r7 == 0) goto L_0x00d3
            java.util.Iterator r7 = r7.iterator()
        L_0x00ba:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00d3
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = r9.contains(r12)
            if (r10 != 0) goto L_0x00b0
            boolean r9 = r12.contains(r9)
            if (r9 == 0) goto L_0x00ba
            goto L_0x00b0
        L_0x00d3:
            r7 = 0
        L_0x00d4:
            if (r7 == 0) goto L_0x00f3
            british.x.SearchableActivity$h r7 = new british.x.SearchableActivity$h
            r9 = 0
            r7.<init>()
            r7.f6815d = r5
            java.lang.String r9 = r6.f7898a
            r7.f6813b = r9
            java.lang.String r9 = r6.f7904c
            r7.f6814c = r9
            android.graphics.Bitmap r6 = r6.f7869L0
            if (r6 == 0) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            r8 = 0
        L_0x00ec:
            r7.f6812a = r8
            java.util.ArrayList<british.x.SearchableActivity$h> r6 = r11.f6796v
            r6.add(r7)
        L_0x00f3:
            int r5 = r5 + 1
            int r4 = r4 + 1
            goto L_0x0035
        L_0x00f9:
            java.util.ArrayList<british.x.SearchableActivity$h> r12 = r11.f6796v
            boolean r12 = r12.isEmpty()
            r0 = 2131362446(0x7f0a028e, float:1.8344673E38)
            r1 = 8
            r3 = 2131362903(0x7f0a0457, float:1.83456E38)
            if (r12 == 0) goto L_0x0118
            android.view.View r12 = r11.findViewById(r0)
            r12.setVisibility(r1)
            android.view.View r12 = r11.findViewById(r3)
            r12.setVisibility(r2)
            goto L_0x0126
        L_0x0118:
            android.view.View r12 = r11.findViewById(r3)
            r12.setVisibility(r1)
            android.view.View r12 = r11.findViewById(r0)
            r12.setVisibility(r2)
        L_0x0126:
            british.x.SearchableActivity$g r12 = new british.x.SearchableActivity$g
            r0 = 2131558631(0x7f0d00e7, float:1.8742583E38)
            java.util.ArrayList<british.x.SearchableActivity$h> r1 = r11.f6796v
            r12.<init>(r11, r0, r1)
            android.widget.ListView r0 = r11.f6795u
            r0.setAdapter(r12)
            goto L_0x014d
        L_0x0136:
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "android.intent.action.VIEW"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x014d
            java.lang.String r12 = r12.getDataString()
            int r12 = java.lang.Integer.parseInt(r12)
            r11.m8070f(r12)
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.SearchableActivity.m8069d(android.content.Intent):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m8070f(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        View view = new View(this);
        view.setId(i);
        view.setTag(R.id.TAG_IDSECC, Integer.valueOf(i));
        String str9 = this.f6787m.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f6787m.f7281W3) == null || str.equals("")) && (((str2 = this.f6787m.f7250R2) == null || str2.equals("")) && (((str3 = this.f6787m.f7245Q3) == null || str3.equals("")) && (((str4 = this.f6787m.f7269U3) == null || str4.equals("")) && (((str5 = this.f6787m.f7275V3) == null || str5.equals("")) && (((str6 = this.f6787m.f7358j4) == null || str6.equals("")) && (((str7 = this.f6787m.f7287X3) == null || str7.equals("")) && ((str8 = this.f6787m.f7293Y3) == null || str8.equals("")))))))))) {
            mo7233b(i);
            return;
        }
        String str10 = this.f6787m.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f6787m.f7251R3);
        }
        String str11 = this.f6787m.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f6787m.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f6787m.f7269U3);
        }
        String str13 = this.f6787m.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f6787m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            mo7233b(i);
        }
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f6787m.mo7510j0(view, this);
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
                    if (this.f6787m.f7427t4 != 2) {
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

    /* renamed from: b */
    public void mo7233b(int i) {
        C1845j B = this.f6787m.mo7475B(Integer.valueOf(i), this);
        this.f6657c = true;
        Intent intent = new Intent();
        intent.putExtra("finalizar", B.f7843b);
        setResult(-1, intent);
        if (this.f6787m.f7427t4 != 2) {
            B.f7842a.putExtra("es_root", true);
        }
        startActivity(B.f7842a);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7234e() {
        int q0 = this.f6787m.mo7522q0(this);
        int i = this.f6787m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f6793s = listView;
            this.f6787m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f6787m.f7231O1;
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
            int[] iArr = this.f6787m.f7249R1;
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
        if (this.f6794t) {
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
        if (!this.f6659e || this.f6788n || !this.f6787m.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f6788n = true;
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
        String str9 = this.f6787m.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f6787m.f7281W3) == null || str.equals("")) && (((str2 = this.f6787m.f7250R2) == null || str2.equals("")) && (((str3 = this.f6787m.f7245Q3) == null || str3.equals("")) && (((str4 = this.f6787m.f7269U3) == null || str4.equals("")) && (((str5 = this.f6787m.f7275V3) == null || str5.equals("")) && (((str6 = this.f6787m.f7358j4) == null || str6.equals("")) && (((str7 = this.f6787m.f7287X3) == null || str7.equals("")) && ((str8 = this.f6787m.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f6787m.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f6787m.f7251R3);
        }
        String str11 = this.f6787m.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f6787m.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f6787m.f7269U3);
        }
        String str13 = this.f6787m.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f6787m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f6787m = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8068c(this);
        this.f6666l = new C1579a();
        this.f6792r = getIntent().getExtras();
        C1692config config2 = this.f6787m;
        if (config2.f7427t4 == 2) {
            this.f6659e = false;
        } else {
            this.f6659e = true;
        }
        this.f6656b = C1692config.m8189h(config2.f7313c1, config2.f7368l1);
        if (Build.VERSION.SDK_INT > 12) {
            if (!C1692config.m8153I("#" + this.f6787m.f7313c1)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.searchableactivity);
        mo7234e();
        this.f6787m.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C1580b());
        searchManager.setOnDismissListener(new C1581c());
        C1692config config3 = this.f6787m;
        Bundle bundle2 = this.f6792r;
        boolean z = bundle2 != null && bundle2.containsKey("ad_entrar");
        Bundle bundle3 = this.f6792r;
        config3.mo7503f1(this, z, bundle3 != null && bundle3.containsKey("fb_entrar"));
        this.f6791q = this.f6787m.mo7474A0(this, false);
        this.f6789o = false;
        this.f6790p = false;
        C1692config config4 = this.f6787m;
        if (config4.f7284X0 || config4.f7278W0) {
            for (C1855l lVar : config4.f7231O1) {
                if (lVar.f7864J) {
                    C1692config config5 = this.f6787m;
                    if (config5.f7284X0 && (lVar.f7871M0 || lVar.f7869L0 != null)) {
                        this.f6789o = true;
                    }
                    if (config5.f7278W0 && !lVar.f7904c.equals("")) {
                        this.f6790p = true;
                    }
                    C1692config config6 = this.f6787m;
                    boolean z2 = config6.f7284X0;
                    if (z2) {
                        if (this.f6789o) {
                            if (config6.f7278W0) {
                                if (this.f6790p) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (config6.f7278W0) {
                        if (this.f6790p) {
                            if (!z2 || this.f6789o) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        this.f6795u = (ListView) findViewById(R.id.listView);
        if (!this.f6787m.f7313c1.equals("") && !this.f6787m.f7313c1.equals("")) {
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#" + this.f6787m.f7313c1), Color.parseColor("#" + this.f6787m.f7319d1)}));
        }
        this.f6795u.setOnItemClickListener(new C1582d());
        m8069d(getIntent());
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f6787m.f7384n3 == 0 || (cVar3 = this.f6791q) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f6787m.f7384n3 == 0 || (cVar2 = this.f6791q) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f6787m.f7384n3 == 0 || (cVar = this.f6791q) == null || (adColonyAdView = cVar.f6889d) == null)) {
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

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        this.f6657c = false;
        setResult(0);
        setIntent(intent);
        m8069d(intent);
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f6787m.f7384n3 == 0 || (cVar = this.f6791q) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C1586f());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f6787m.f7384n3 != 0 && (cVar = this.f6791q) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f6794t = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f6794t) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f6794t = true;
        C1692config.m8175Y0(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f6659e);
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
        this.f6794t = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f6794t = true;
        C1692config.m8175Y0(this);
    }
}
