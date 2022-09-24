package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.google.android.exoplayer2.audio.AacUtil;
import com.startapp.C11868d9;
import com.startapp.C11970ib;
import com.startapp.C12040m0;
import com.startapp.C12437y;
import com.startapp.C12454yc;
import com.startapp.C5002c;
import com.startapp.C5003d;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Random;

/* compiled from: Sta */
public abstract class BannerBase extends RelativeLayout {

    /* renamed from: a */
    public boolean f22148a;

    /* renamed from: b */
    public AdPreferences f22149b;

    /* renamed from: c */
    public AdRulesResult f22150c;

    /* renamed from: d */
    public int f22151d;

    /* renamed from: e */
    public boolean f22152e;

    /* renamed from: f */
    public Point f22153f;

    /* renamed from: g */
    public boolean f22154g;

    /* renamed from: h */
    public int f22155h;

    /* renamed from: i */
    public int f22156i;

    /* renamed from: j */
    public String f22157j;

    /* renamed from: k */
    public C12454yc f22158k;

    /* renamed from: l */
    public boolean f22159l;

    /* renamed from: m */
    public boolean f22160m;

    /* renamed from: n */
    public String f22161n;

    /* renamed from: o */
    public final Runnable f22162o;

    /* renamed from: p */
    public final Handler f22163p;

    /* renamed from: q */
    public final Object f22164q;

    /* renamed from: com.startapp.sdk.ads.banner.BannerBase$a */
    /* compiled from: Sta */
    public class C5018a implements Runnable {
        public C5018a() {
        }

        public void run() {
            AdRulesResult adRulesResult;
            if (BannerBase.this.isShown() || ((adRulesResult = BannerBase.this.f22150c) != null && !adRulesResult.mo21025b())) {
                BannerBase.this.mo20702j();
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.banner.BannerBase$b */
    /* compiled from: Sta */
    public class C5019b implements Handler.Callback {
        public C5019b() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1 || i == 2) {
                BannerBase bannerBase = BannerBase.this;
                bannerBase.mo20707m();
                bannerBase.mo20702j();
            }
            return true;
        }
    }

    public BannerBase(Context context) {
        super(context);
        this.f22148a = false;
        this.f22151d = 0;
        this.f22152e = true;
        this.f22154g = false;
        int nextInt = new Random().nextInt(AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND) + 159868227;
        this.f22155h = nextInt;
        this.f22156i = nextInt + 1;
        this.f22157j = null;
        this.f22159l = false;
        this.f22160m = false;
        this.f22162o = new C5018a();
        this.f22163p = new Handler(Looper.getMainLooper(), new C5019b());
        this.f22164q = new Object();
        try {
            ComponentLocator.m23305a(context).mo21231r().mo21248a(512);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public abstract void mo20683a(int i);

    /* renamed from: a */
    public void mo20685a(C11868d9 d9Var) {
        if (this.f22158k == null) {
            C12454yc ycVar = new C12454yc(mo20692g(), d9Var, BannerMetaData.f54159b.mo45773a());
            this.f22158k = ycVar;
            if (ycVar.mo46840b()) {
                ycVar.run();
            }
        }
    }

    /* renamed from: b */
    public void mo20687b() {
        if (!isInEditMode()) {
            removeCallbacks(this.f22162o);
            synchronized (this.f22164q) {
                this.f22163p.removeMessages(2);
            }
        }
    }

    /* renamed from: c */
    public int mo20688c() {
        return mo20691f();
    }

    /* renamed from: d */
    public abstract int mo20689d();

    /* renamed from: e */
    public abstract String mo20690e();

    /* renamed from: f */
    public abstract int mo20691f();

    /* renamed from: g */
    public View mo20692g() {
        return this;
    }

    public abstract String getBidToken();

    public String getErrorMessage() {
        return this.f22161n;
    }

    @Keep
    public abstract int getHeightInDp();

    @Keep
    public abstract int getWidthInDp();

    /* renamed from: h */
    public void mo20697h() {
        if (!isInEditMode()) {
            mo20699i();
            return;
        }
        setMinimumWidth(C11970ib.m52467a(getContext(), getWidthInDp()));
        setMinimumHeight(C11970ib.m52467a(getContext(), getHeightInDp()));
        setBackgroundColor(Color.rgb(169, 169, 169));
        TextView textView = new TextView(getContext());
        textView.setText(mo20690e());
        textView.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(textView, layoutParams);
    }

    public abstract void hideBanner();

    /* renamed from: i */
    public abstract void mo20699i();

    public boolean isClicked() {
        return this.f22159l;
    }

    public boolean isFirstLoad() {
        return this.f22152e;
    }

    /* renamed from: j */
    public void mo20702j() {
        C12454yc ycVar = this.f22158k;
        if (ycVar != null) {
            ycVar.mo46839a();
            this.f22158k = null;
        }
        if (this.f22150c == null || AdaptMetaData.f54531a.mo46145a().mo21021a()) {
            AdRulesResult a = AdaptMetaData.f54531a.mo46145a().mo21019a(AdPreferences.Placement.INAPP_BANNER, this.f22157j);
            this.f22150c = a;
            if (a.mo21025b()) {
                mo20704l();
            } else {
                hideBanner();
            }
        } else if (this.f22150c.mo21025b()) {
            mo20704l();
        }
    }

    /* renamed from: k */
    public void mo20703k() {
        synchronized (this.f22164q) {
            if (!this.f22163p.hasMessages(1)) {
                this.f22163p.sendEmptyMessage(1);
            }
        }
    }

    /* renamed from: l */
    public abstract void mo20704l();

    public void loadAd(int i, int i2) {
        if (getParent() == null) {
            try {
                ComponentLocator.m23305a(getContext()).mo21231r().mo21248a(1024);
            } catch (Throwable unused) {
            }
            this.f22153f = new Point(i, i2);
            mo20703k();
        }
    }

    /* renamed from: m */
    public void mo20707m() {
        if (this.f22148a && !isInEditMode()) {
            removeCallbacks(this.f22162o);
            postDelayed(this.f22162o, (long) mo20688c());
            long y = (long) (MetaData.f22407k.mo21212y() * 1000);
            synchronized (this.f22164q) {
                this.f22163p.removeMessages(2);
                this.f22163p.sendEmptyMessageDelayed(2, y);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            ComponentLocator.m23305a(getContext()).mo21231r().mo21248a(4096);
        } catch (Throwable unused) {
        }
        this.f22148a = true;
        mo20707m();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22148a = false;
        mo20687b();
        C12454yc ycVar = this.f22158k;
        if (ycVar != null) {
            ycVar.mo46839a();
            this.f22158k = null;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        mo20683a(bundle.getInt("bannerId"));
        this.f22150c = (AdRulesResult) bundle.getSerializable("adRulesResult");
        this.f22149b = (AdPreferences) bundle.getSerializable("adPreferences");
        this.f22151d = bundle.getInt("offset");
        this.f22152e = bundle.getBoolean("firstLoad");
        this.f22160m = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    public Parcelable onSaveInstanceState() {
        if (isClicked()) {
            setClicked(false);
            this.f22160m = true;
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putInt("bannerId", mo20689d());
        bundle.putParcelable("upperState", onSaveInstanceState);
        bundle.putSerializable("adRulesResult", this.f22150c);
        bundle.putSerializable("adPreferences", this.f22149b);
        bundle.putInt("offset", this.f22151d);
        bundle.putBoolean("firstLoad", this.f22152e);
        bundle.putBoolean("shouldReloadBanner", this.f22160m);
        return bundle;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (this.f22160m) {
                this.f22160m = false;
                mo20702j();
            }
            this.f22148a = true;
            mo20707m();
            return;
        }
        this.f22148a = false;
        mo20687b();
    }

    public abstract void setAdTag(String str);

    public void setClicked(boolean z) {
        this.f22159l = z;
    }

    public void setErrorMessage(String str) {
        this.f22161n = str;
    }

    public void setFirstLoad(boolean z) {
        this.f22152e = z;
    }

    /* renamed from: a */
    public final void mo20684a(Context context, AttributeSet attributeSet) {
        setAdTag(new C12040m0(context, attributeSet).f53257b);
    }

    public void loadAd() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        loadAd(C11970ib.m52473b(getContext(), displayMetrics.widthPixels), C11970ib.m52473b(getContext(), displayMetrics.heightPixels));
    }

    /* renamed from: a */
    public void mo20682a() {
        if (isFirstLoad() || AdaptMetaData.f54531a.mo46145a().mo21021a()) {
            setFirstLoad(false);
            C5003d.f22119d.mo20659a(new C5002c(AdPreferences.Placement.INAPP_BANNER, this.f22157j));
        }
    }

    public BannerBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo20686a(AdPreferences adPreferences) {
        boolean z = this.f22148a;
        int i = C12437y.f55146a;
        adPreferences.setHardwareAccelerated((Build.VERSION.SDK_INT >= 11 && 1 != getLayerType() && z) ? isHardwareAccelerated() : false);
    }

    public BannerBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22148a = false;
        this.f22151d = 0;
        this.f22152e = true;
        this.f22154g = false;
        int nextInt = new Random().nextInt(AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND) + 159868227;
        this.f22155h = nextInt;
        this.f22156i = nextInt + 1;
        this.f22157j = null;
        this.f22159l = false;
        this.f22160m = false;
        this.f22162o = new C5018a();
        this.f22163p = new Handler(Looper.getMainLooper(), new C5019b());
        this.f22164q = new Object();
        mo20684a(context, attributeSet);
    }
}
