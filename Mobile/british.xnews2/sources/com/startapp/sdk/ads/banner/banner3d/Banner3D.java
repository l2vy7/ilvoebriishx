package com.startapp.sdk.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.startapp.C11868d9;
import com.startapp.C11970ib;
import com.startapp.C12002k0;
import com.startapp.C12064n0;
import com.startapp.C12119p0;
import com.startapp.C12146q9;
import com.startapp.C12437y;
import com.startapp.C5004d4;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Sta */
public class Banner3D extends BannerBase implements AdEventListener, BannerInterface {

    /* renamed from: A */
    public boolean f54167A;

    /* renamed from: B */
    public boolean f54168B;

    /* renamed from: C */
    public boolean f54169C;

    /* renamed from: D */
    public boolean f54170D;

    /* renamed from: E */
    public boolean f54171E;

    /* renamed from: F */
    public boolean f54172F;

    /* renamed from: G */
    public boolean f54173G;

    /* renamed from: H */
    public boolean f54174H;

    /* renamed from: I */
    public boolean f54175I;

    /* renamed from: J */
    public boolean f54176J;

    /* renamed from: K */
    public boolean f54177K;

    /* renamed from: L */
    public boolean f54178L;

    /* renamed from: M */
    public boolean f54179M;

    /* renamed from: N */
    public AdInformationOverrides f54180N;

    /* renamed from: O */
    public List<C12002k0> f54181O;

    /* renamed from: P */
    public int f54182P;

    /* renamed from: Q */
    public BannerListener f54183Q;

    /* renamed from: R */
    public Runnable f54184R;

    /* renamed from: r */
    public BannerOptions f54185r;

    /* renamed from: s */
    public Banner3DAd f54186s;

    /* renamed from: t */
    public List<AdDetails> f54187t;

    /* renamed from: u */
    public AdPreferences f54188u;

    /* renamed from: v */
    public Camera f54189v;

    /* renamed from: w */
    public Matrix f54190w;

    /* renamed from: x */
    public Paint f54191x;

    /* renamed from: y */
    public float f54192y;

    /* renamed from: z */
    public float f54193z;

    /* compiled from: Sta */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public AdRulesResult adRulesResult;
        public boolean bDefaultLoad;
        public boolean bIsVisible;
        private int currentImage;
        private AdDetails[] details;
        public C12002k0[] faces;
        private int firstRotation;
        private int firstRotationFinished;
        public boolean loaded;
        public boolean loading;
        public BannerOptions options;
        public AdInformationOverrides overrides;
        private float rotation;

        public int describeContents() {
            return 0;
        }

        public int getCurrentImage() {
            return this.currentImage;
        }

        public List<AdDetails> getDetails() {
            return Arrays.asList(this.details);
        }

        public float getRotation() {
            return this.rotation;
        }

        public boolean isFirstRotation() {
            return this.firstRotation == 1;
        }

        public boolean isFirstRotationFinished() {
            return this.firstRotationFinished == 1;
        }

        public void setCurrentImage(int i) {
            this.currentImage = i;
        }

        public void setDetails(List<AdDetails> list) {
            this.details = new AdDetails[list.size()];
            for (int i = 0; i < list.size(); i++) {
                this.details[i] = list.get(i);
            }
        }

        public void setFirstRotation(boolean z) {
            this.firstRotation = z ? 1 : 0;
        }

        public void setFirstRotationFinished(boolean z) {
            this.firstRotationFinished = z ? 1 : 0;
        }

        public void setRotation(float f) {
            this.rotation = f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            if (!this.bIsVisible) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(this.currentImage);
            parcel.writeFloat(this.rotation);
            parcel.writeInt(this.firstRotation);
            parcel.writeInt(this.firstRotationFinished);
            parcel.writeParcelableArray(this.details, i);
            parcel.writeInt(this.loaded ? 1 : 0);
            parcel.writeInt(this.loading ? 1 : 0);
            parcel.writeInt(this.bDefaultLoad ? 1 : 0);
            C12002k0[] k0VarArr = this.faces;
            if (k0VarArr == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(k0VarArr.length);
                for (C12002k0 writeParcelable : this.faces) {
                    parcel.writeParcelable(writeParcelable, i);
                }
            }
            parcel.writeSerializable(this.overrides);
            parcel.writeSerializable(this.options);
            parcel.writeSerializable(this.adRulesResult);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            if (parcel.readInt() == 1) {
                this.bIsVisible = true;
                this.currentImage = parcel.readInt();
                this.rotation = parcel.readFloat();
                this.firstRotation = parcel.readInt();
                this.firstRotationFinished = parcel.readInt();
                Parcelable[] readParcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
                if (readParcelableArray != null) {
                    AdDetails[] adDetailsArr = new AdDetails[readParcelableArray.length];
                    this.details = adDetailsArr;
                    System.arraycopy(readParcelableArray, 0, adDetailsArr, 0, readParcelableArray.length);
                }
                int readInt = parcel.readInt();
                this.loaded = false;
                if (readInt == 1) {
                    this.loaded = true;
                }
                int readInt2 = parcel.readInt();
                this.loading = false;
                if (readInt2 == 1) {
                    this.loading = true;
                }
                int readInt3 = parcel.readInt();
                this.bDefaultLoad = false;
                if (readInt3 == 1) {
                    this.bDefaultLoad = true;
                }
                int readInt4 = parcel.readInt();
                if (readInt4 > 0) {
                    this.faces = new C12002k0[readInt4];
                    for (int i = 0; i < readInt4; i++) {
                        this.faces[i] = (C12002k0) parcel.readParcelable(C12002k0.class.getClassLoader());
                    }
                }
                this.overrides = (AdInformationOverrides) parcel.readSerializable();
                this.options = (BannerOptions) parcel.readSerializable();
                this.adRulesResult = (AdRulesResult) parcel.readSerializable();
                return;
            }
            this.bIsVisible = false;
        }
    }

    public Banner3D(Activity activity) {
        this((Context) activity);
    }

    /* renamed from: a */
    public void mo45806a(List<AdDetails> list, boolean z) {
        Banner3DAd banner3DAd;
        this.f54187t = list;
        if (list != null) {
            C12119p0 p0Var = new C12119p0();
            StringBuilder sb = new StringBuilder();
            for (AdDetails g : list) {
                sb.append(C5055a.m23143a(g.mo46251g(), (String) null));
                sb.append(",");
            }
            if (Banner3DSize.m52889a(getContext(), getParent(), this.f54185r, this, p0Var)) {
                setMinimumWidth(C11970ib.m52467a(getContext(), this.f54185r.mo45794o()));
                setMinimumHeight(C11970ib.m52467a(getContext(), this.f54185r.mo45781d()));
                if (getLayoutParams() != null && getLayoutParams().width == -1) {
                    setMinimumWidth(C11970ib.m52467a(getContext(), p0Var.f53990a.x));
                }
                if (getLayoutParams() != null && getLayoutParams().height == -1) {
                    setMinimumHeight(C11970ib.m52467a(getContext(), p0Var.f53990a.y));
                }
                if (getLayoutParams() != null) {
                    if (getLayoutParams().width > 0) {
                        setMinimumWidth(getLayoutParams().width);
                    }
                    if (getLayoutParams().height > 0) {
                        setMinimumHeight(getLayoutParams().height);
                    }
                    if (getLayoutParams().width > 0 && getLayoutParams().height > 0 && (banner3DAd = this.f54186s) != null) {
                        banner3DAd.mo45835b(true);
                    }
                }
                List<C12002k0> list2 = this.f54181O;
                if (list2 == null || list2.size() == 0) {
                    mo45807n();
                    removeAllViews();
                    this.f54181O = new ArrayList();
                    for (AdDetails k0Var : list) {
                        this.f54181O.add(new C12002k0(getContext(), this, k0Var, this.f54185r, new TrackingParams(this.f22157j)));
                    }
                    this.f54182P = 0;
                } else {
                    for (C12002k0 a : this.f54181O) {
                        a.mo45492a(getContext(), this.f54185r, this);
                    }
                }
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(mo45813r(), mo45808o());
                layoutParams.addRule(13);
                int p = mo45811p();
                layoutParams.rightMargin = p;
                layoutParams.leftMargin = p;
                int q = mo45812q();
                layoutParams.topMargin = q;
                layoutParams.bottomMargin = q;
                addView(relativeLayout, layoutParams);
                new AdInformationObject(getContext(), AdInformationObject.Size.SMALL, AdPreferences.Placement.INAPP_BANNER, this.f54180N, (ConsentData) null).mo46126a(relativeLayout);
                if (this.f54191x == null) {
                    Paint paint = new Paint();
                    this.f54191x = paint;
                    paint.setAntiAlias(true);
                    this.f54191x.setFilterBitmap(true);
                }
                if (!this.f54173G) {
                    this.f54173G = true;
                    mo45816u();
                }
                if (this.f54174H) {
                    mo45815t();
                }
                if (z) {
                    C12064n0.m52615c(getContext(), this.f54183Q, this, sb.toString());
                    return;
                }
                return;
            }
            setErrorMessage("Error in banner screen size");
            setVisibility(8);
            if (z) {
                C12064n0.m52614b(getContext(), this.f54183Q, this, sb.toString());
                return;
            }
            return;
        }
        setErrorMessage("No ads to load");
        if (z) {
            C12064n0.m52614b(getContext(), this.f54183Q, this, (String) null);
        }
    }

    /* renamed from: d */
    public int mo20689d() {
        return this.f22155h;
    }

    /* renamed from: e */
    public String mo20690e() {
        return "StartApp Banner3D";
    }

    /* renamed from: f */
    public int mo20691f() {
        return BannerMetaData.f54159b.mo45773a().mo45789j();
    }

    public String getBidToken() {
        Banner3DAd banner3DAd = this.f54186s;
        if (banner3DAd != null) {
            return banner3DAd.getBidToken();
        }
        return null;
    }

    public int getHeightInDp() {
        return 50;
    }

    public int getWidthInDp() {
        return 300;
    }

    public void hideBanner() {
        this.f54174H = false;
        setVisibility(8);
    }

    /* renamed from: i */
    public void mo20699i() {
        if (!this.f54177K) {
            this.f54185r = BannerMetaData.f54159b.mo45774b();
            this.f54187t = new ArrayList();
            if (this.f54188u == null) {
                this.f54188u = new AdPreferences();
            }
            this.f54180N = AdInformationOverrides.m23167a();
            mo45807n();
            this.f54181O = new ArrayList();
            this.f54177K = true;
            setBackgroundColor(0);
            if (getId() == -1) {
                setId(this.f22155h);
            }
            if (this.f54175I) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        ViewTreeObserver viewTreeObserver = Banner3D.this.getViewTreeObserver();
                        int i = C12437y.f55146a;
                        if (Build.VERSION.SDK_INT >= 16) {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        } else {
                            viewTreeObserver.removeGlobalOnLayoutListener(this);
                        }
                        Banner3D banner3D = Banner3D.this;
                        banner3D.mo20686a(banner3D.f54188u);
                        Banner3D banner3D2 = Banner3D.this;
                        if (!banner3D2.f54176J) {
                            banner3D2.mo20703k();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: l */
    public void mo20704l() {
        int i = 0;
        this.f54176J = false;
        this.f54177K = true;
        this.f54173G = false;
        this.f54167A = true;
        this.f54169C = true;
        this.f54170D = false;
        this.f54171E = false;
        this.f22154g = false;
        this.f22150c = null;
        mo45807n();
        this.f54181O = new ArrayList();
        Context context = getContext();
        Banner3DAd banner3DAd = this.f54186s;
        if (banner3DAd != null) {
            i = banner3DAd.mo45836h();
        }
        this.f54186s = new Banner3DAd(context, i);
        if (this.f54188u == null) {
            this.f54188u = new AdPreferences();
        }
        this.f54186s.load(this.f54188u, this);
    }

    /* renamed from: n */
    public final void mo45807n() {
        List<C12002k0> list = this.f54181O;
        if (list != null && !list.isEmpty()) {
            for (C12002k0 next : this.f54181O) {
                if (next != null) {
                    Bitmap bitmap = next.f53186c;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    Bitmap bitmap2 = next.f53187d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    next.f53186c = null;
                    next.f53187d = null;
                    C11868d9 d9Var = next.f53190g;
                    if (d9Var != null) {
                        d9Var.mo45303a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
                    }
                    Banner3DView banner3DView = next.f53191h;
                    if (banner3DView != null) {
                        banner3DView.removeAllViews();
                        next.f53191h = null;
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public final int mo45808o() {
        return (int) (this.f54185r.mo45782e() * ((float) C11970ib.m52467a(getContext(), this.f54185r.mo45781d())));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f54178L = true;
        BannerOptions bannerOptions = this.f54185r;
        if (bannerOptions == null || !bannerOptions.mo45798s()) {
            this.f54169C = false;
            this.f54170D = true;
        }
        mo45816u();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f54178L = false;
        removeCallbacks(this.f54184R);
        List<C12002k0> list = this.f54181O;
        if (list != null) {
            for (C12002k0 k0Var : list) {
                C11868d9 d9Var = k0Var.f53190g;
                if (d9Var != null) {
                    d9Var.mo45303a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.onDraw(canvas);
        if (!this.f22154g && !this.f54177K) {
            this.f22154g = true;
            mo45816u();
        }
        if (!isInEditMode() && this.f54174H) {
            List<C12002k0> list = this.f54181O;
            if (!(list == null || list.size() == 0)) {
                try {
                    int r = mo45813r();
                    int o = mo45808o();
                    int p = mo45811p();
                    int q = mo45812q();
                    float g = !this.f54170D ? this.f54185r.mo45785g() : ((1.0f - this.f54185r.mo45785g()) * ((float) Math.pow((double) (Math.abs(this.f54192y - 45.0f) / 45.0f), (double) this.f54185r.mo45791l()))) + this.f54185r.mo45785g();
                    Bitmap bitmap3 = this.f54181O.get((this.f54181O.size() + (this.f54182P - 1)) % this.f54181O.size()).f53187d;
                    Bitmap bitmap4 = this.f54181O.get(this.f54182P).f53187d;
                    if (bitmap4 != null && bitmap3 != null) {
                        float f = this.f54192y;
                        if (f < 45.0f) {
                            if (f > 3.0f) {
                                bitmap2 = bitmap3;
                                mo45805a(canvas, bitmap4, q, p, r / 2, o / 2, g, (f - 90.0f) * ((float) this.f54185r.mo45780c().getRotationMultiplier()));
                            } else {
                                bitmap2 = bitmap3;
                            }
                            mo45805a(canvas, bitmap2, q, p, r / 2, o / 2, g, this.f54192y * ((float) this.f54185r.mo45780c().getRotationMultiplier()));
                            return;
                        }
                        Bitmap bitmap5 = bitmap3;
                        if (f < 87.0f) {
                            bitmap = bitmap4;
                            mo45805a(canvas, bitmap5, q, p, r / 2, o / 2, g, f * ((float) this.f54185r.mo45780c().getRotationMultiplier()));
                        } else {
                            bitmap = bitmap4;
                        }
                        mo45805a(canvas, bitmap, q, p, r / 2, o / 2, g, (this.f54192y - 90.0f) * ((float) this.f54185r.mo45780c().getRotationMultiplier()));
                        if (!this.f54169C) {
                            this.f54170D = true;
                        }
                    }
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                }
            }
        }
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        if (ad != null) {
            setErrorMessage(ad.getErrorMessage());
        }
        C12064n0.m52614b(getContext(), this.f54183Q, this, (String) null);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f54176J = true;
        this.f54177K = false;
        this.f54180N = this.f54186s.getAdInfoOverride();
        List<AdDetails> g = ((JsonAd) ad).mo46103g();
        this.f54187t = g;
        mo45806a(g, this.f54179M);
        this.f54179M = false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        boolean z = savedState.bIsVisible;
        this.f54174H = z;
        if (z) {
            this.f54187t = savedState.getDetails();
            this.f54192y = savedState.getRotation();
            this.f54169C = savedState.isFirstRotation();
            this.f54170D = savedState.isFirstRotationFinished();
            this.f54182P = savedState.getCurrentImage();
            C12002k0[] k0VarArr = savedState.faces;
            mo45807n();
            this.f54181O = new ArrayList();
            if (k0VarArr != null) {
                for (C12002k0 add : k0VarArr) {
                    this.f54181O.add(add);
                }
            }
            this.f54176J = savedState.loaded;
            this.f54177K = savedState.loading;
            this.f54175I = savedState.bDefaultLoad;
            this.f54180N = savedState.overrides;
            this.f54185r = savedState.options;
            if (this.f54187t.size() == 0) {
                this.f54175I = true;
                mo20697h();
                return;
            }
            post(new Runnable() {
                public void run() {
                    Banner3D banner3D = Banner3D.this;
                    banner3D.mo45806a(banner3D.f54187t, false);
                }
            });
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.bIsVisible = this.f54174H;
        savedState.setDetails(this.f54187t);
        savedState.setRotation(this.f54192y);
        savedState.setFirstRotation(this.f54169C);
        savedState.setFirstRotationFinished(this.f54170D);
        savedState.setCurrentImage(this.f54182P);
        savedState.options = this.f54185r;
        savedState.faces = new C12002k0[this.f54181O.size()];
        savedState.loaded = this.f54176J;
        savedState.loading = this.f54177K;
        savedState.overrides = this.f54180N;
        for (int i = 0; i < this.f54181O.size(); i++) {
            savedState.faces[i] = this.f54181O.get(i);
        }
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        List<C12002k0> list;
        int r = mo45813r();
        int o = mo45808o();
        int p = mo45811p();
        int q = mo45812q();
        if (!(motionEvent.getX() >= ((float) p) && motionEvent.getY() >= ((float) q) && motionEvent.getX() <= ((float) (p + r)) && motionEvent.getY() <= ((float) (q + o))) || (list = this.f54181O) == null || list.size() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f54172F = true;
            this.f54193z = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2 && this.f54193z - motionEvent.getY() >= 10.0f) {
                this.f54172F = false;
                this.f54193z = motionEvent.getY();
            }
        } else if (this.f54172F) {
            if (this.f54192y < 45.0f) {
                mo45814s();
            }
            this.f54172F = false;
            this.f54167A = false;
            setClicked(true);
            postDelayed(new Runnable() {
                public void run() {
                    Banner3D.this.f54167A = true;
                }
            }, AdsCommonMetaData.f22242h.mo20913z());
            C12002k0 k0Var = this.f54181O.get(this.f54182P);
            Context context = getContext();
            String m = k0Var.f53184a.mo46257m();
            boolean a = C5055a.m23158a(context, AdPreferences.Placement.INAPP_BANNER);
            C11868d9 d9Var = k0Var.f53190g;
            String str = null;
            if (d9Var != null) {
                d9Var.mo45303a((String) null, (JSONObject) null);
            }
            if (m != null && !"null".equals(m) && !TextUtils.isEmpty(m)) {
                C5055a.m23153a(m, k0Var.f53184a.mo46256l(), k0Var.f53184a.mo46251g(), context, k0Var.f53189f);
            } else if (!k0Var.f53184a.mo46241A() || a) {
                C5055a.m23149a(context, k0Var.f53184a.mo46251g(), k0Var.f53184a.mo46266u(), k0Var.f53189f, k0Var.f53184a.mo46242B() && !a, false);
            } else {
                C5055a.m23150a(context, k0Var.f53184a.mo46251g(), k0Var.f53184a.mo46266u(), k0Var.f53184a.mo46260p(), k0Var.f53189f, AdsCommonMetaData.f22242h.mo20913z(), AdsCommonMetaData.f22242h.mo20912y(), k0Var.f53184a.mo46242B(), k0Var.f53184a.mo46243C(), false, (Runnable) null);
            }
            if (this.f54182P < this.f54187t.size()) {
                str = C5055a.m23143a(this.f54187t.get(this.f54182P).mo46251g(), (String) null);
            }
            C12064n0.m52613a(getContext(), this.f54183Q, this, str);
        }
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f54178L = true;
            BannerOptions bannerOptions = this.f54185r;
            if (bannerOptions == null || !bannerOptions.mo45798s()) {
                this.f54169C = false;
                this.f54170D = true;
            }
            mo45816u();
            return;
        }
        this.f54178L = false;
        if (!this.f54168B) {
            removeCallbacks(this.f54184R);
        }
    }

    /* renamed from: p */
    public final int mo45811p() {
        return (getWidth() - mo45813r()) / 2;
    }

    /* renamed from: q */
    public final int mo45812q() {
        return (getHeight() - mo45808o()) / 2;
    }

    /* renamed from: r */
    public final int mo45813r() {
        return (int) (this.f54185r.mo45795p() * ((float) C11970ib.m52467a(getContext(), this.f54185r.mo45794o())));
    }

    /* renamed from: s */
    public final void mo45814s() {
        this.f54182P = ((this.f54182P - 1) + this.f54181O.size()) % this.f54181O.size();
    }

    public void setAdTag(String str) {
        this.f22157j = str;
    }

    public void setBannerListener(BannerListener bannerListener) {
        this.f54183Q = bannerListener;
    }

    public void showBanner() {
        this.f54174H = true;
        mo45815t();
    }

    /* renamed from: t */
    public final void mo45815t() {
        setVisibility(0);
        if (this.f54186s != null) {
            C12146q9 s = ComponentLocator.m23305a(getContext()).mo21232s();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
            String adId = this.f54186s.getAdId();
            s.getClass();
            if (adId != null) {
                s.f54069a.put(new C12146q9.C12147a(placement, -1), adId);
            }
        }
    }

    /* renamed from: u */
    public final void mo45816u() {
        if (this.f54178L && this.f22154g) {
            removeCallbacks(this.f54184R);
            post(this.f54184R);
        }
    }

    public Banner3D(Activity activity, AdPreferences adPreferences) {
        this((Context) activity, adPreferences);
    }

    public Banner3D(Activity activity, BannerListener bannerListener) {
        this((Context) activity, bannerListener);
    }

    public Banner3D(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        this((Context) activity, adPreferences, bannerListener);
    }

    public Banner3D(Activity activity, boolean z) {
        this((Context) activity, z);
    }

    public Banner3D(Activity activity, boolean z, AdPreferences adPreferences) {
        this((Context) activity, z, adPreferences);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet) {
        this((Context) activity, attributeSet);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet, int i) {
        this((Context) activity, attributeSet, i);
    }

    @Deprecated
    public Banner3D(Context context) {
        this(context, true, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    @Deprecated
    public Banner3D(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, boolean z) {
        this(context, z, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, boolean z, AdPreferences adPreferences) {
        super(context);
        this.f54189v = null;
        this.f54190w = null;
        this.f54191x = null;
        this.f54192y = 45.0f;
        this.f54193z = 0.0f;
        this.f54167A = true;
        this.f54168B = false;
        this.f54169C = true;
        this.f54170D = false;
        this.f54171E = false;
        this.f54172F = false;
        this.f54173G = false;
        this.f54174H = true;
        this.f54175I = true;
        this.f54176J = false;
        this.f54177K = false;
        this.f54178L = false;
        this.f54179M = true;
        this.f54181O = new ArrayList();
        this.f54182P = 0;
        this.f54184R = new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:51:0x0130  */
            /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f54176J
                    if (r1 == 0) goto L_0x0134
                    java.util.List<com.startapp.k0> r0 = r0.f54181O
                    int r0 = r0.size()
                    if (r0 != 0) goto L_0x0010
                    goto L_0x0134
                L_0x0010:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f54174H
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L_0x008c
                    boolean r0 = r0.isShown()
                    if (r0 == 0) goto L_0x008c
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f22154g
                    if (r1 == 0) goto L_0x008c
                    java.util.List<com.startapp.k0> r1 = r0.f54181O
                    int r0 = r0.f54182P
                    java.lang.Object r0 = r1.get(r0)
                    com.startapp.k0 r0 = (com.startapp.C12002k0) r0
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r1 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    android.content.Context r5 = r1.getContext()
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f53184a
                    java.lang.String[] r4 = r4.mo46268w()
                    int r4 = r4.length
                    if (r4 <= 0) goto L_0x007b
                    java.util.concurrent.atomic.AtomicBoolean r4 = r0.f53188e
                    boolean r4 = r4.compareAndSet(r2, r3)
                    if (r4 == 0) goto L_0x007b
                    com.startapp.d9 r10 = new com.startapp.d9
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f53184a
                    java.lang.String[] r6 = r4.mo46268w()
                    com.startapp.sdk.adsbase.commontracking.TrackingParams r7 = r0.f53189f
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f53184a
                    java.lang.Long r4 = r4.mo46252h()
                    if (r4 == 0) goto L_0x0068
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.model.AdDetails r8 = r0.f53184a
                    java.lang.Long r8 = r8.mo46252h()
                    long r8 = r8.longValue()
                    long r8 = r4.toMillis(r8)
                    goto L_0x0074
                L_0x0068:
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.remoteconfig.MetaData r8 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
                    long r8 = r8.mo21203o()
                    long r8 = r4.toMillis(r8)
                L_0x0074:
                    r4 = r10
                    r4.<init>(r5, r6, r7, r8)
                    r0.f53190g = r10
                    goto L_0x007c
                L_0x007b:
                    r10 = 0
                L_0x007c:
                    if (r10 == 0) goto L_0x0081
                    r1.mo20685a((com.startapp.C11868d9) r10)
                L_0x0081:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f54171E
                    if (r1 != 0) goto L_0x008c
                    r0.f54171E = r3
                    r0.mo20682a()
                L_0x008c:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f54167A
                    if (r1 == 0) goto L_0x00d7
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f54185r
                    int r1 = r1.mo45792m()
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r4 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r5 = r4.f54170D
                    if (r5 != 0) goto L_0x00a5
                    com.startapp.sdk.ads.banner.BannerOptions r4 = r4.f54185r
                    int r4 = r4.mo45790k()
                    goto L_0x00a6
                L_0x00a5:
                    r4 = 1
                L_0x00a6:
                    int r1 = r1 * r4
                    float r1 = (float) r1
                    float r4 = r0.f54192y
                    float r4 = r4 + r1
                    r0.f54192y = r4
                    r1 = 1119092736(0x42b40000, float:90.0)
                    int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r4 < 0) goto L_0x00c5
                    int r4 = r0.f54182P
                    int r4 = r4 + r3
                    java.util.List<com.startapp.k0> r5 = r0.f54181O
                    int r5 = r5.size()
                    int r4 = r4 % r5
                    r0.f54182P = r4
                    float r4 = r0.f54192y
                    float r4 = r4 - r1
                    r0.f54192y = r4
                L_0x00c5:
                    float r4 = r0.f54192y
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 > 0) goto L_0x00d4
                    r0.mo45814s()
                    float r4 = r0.f54192y
                    float r4 = r4 + r1
                    r0.f54192y = r4
                L_0x00d4:
                    r0.invalidate()
                L_0x00d7:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f54192y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f54185r
                    int r0 = r0.mo45792m()
                    int r0 = 90 - r0
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0112
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f54192y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f54185r
                    int r0 = r0.mo45792m()
                    int r0 = r0 + 90
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L_0x0112
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f54169C
                    if (r1 != 0) goto L_0x0112
                    boolean r1 = r0.f54178L
                    if (r1 == 0) goto L_0x010d
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f54185r
                    int r1 = r1.mo45779b()
                    long r4 = (long) r1
                    r0.postDelayed(r11, r4)
                L_0x010d:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f54168B = r2
                    goto L_0x0122
                L_0x0112:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f54185r
                    int r1 = r1.mo45793n()
                    long r4 = (long) r1
                    r0.postDelayed(r11, r4)
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f54168B = r3
                L_0x0122:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    int r1 = r0.f54182P
                    int r1 = r1 + r3
                    java.util.List<com.startapp.k0> r0 = r0.f54181O
                    int r0 = r0.size()
                    int r1 = r1 % r0
                    if (r1 != 0) goto L_0x0134
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f54169C = r2
                L_0x0134:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.banner3d.Banner3D.C121911.run():void");
            }
        };
        try {
            this.f54175I = z;
            if (adPreferences == null) {
                this.f54188u = new AdPreferences();
            } else {
                this.f54188u = adPreferences;
            }
            mo20697h();
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54189v = null;
        this.f54190w = null;
        this.f54191x = null;
        this.f54192y = 45.0f;
        this.f54193z = 0.0f;
        this.f54167A = true;
        this.f54168B = false;
        this.f54169C = true;
        this.f54170D = false;
        this.f54171E = false;
        this.f54172F = false;
        this.f54173G = false;
        this.f54174H = true;
        this.f54175I = true;
        this.f54176J = false;
        this.f54177K = false;
        this.f54178L = false;
        this.f54179M = true;
        this.f54181O = new ArrayList();
        this.f54182P = 0;
        this.f54184R = new Runnable() {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f54176J
                    if (r1 == 0) goto L_0x0134
                    java.util.List<com.startapp.k0> r0 = r0.f54181O
                    int r0 = r0.size()
                    if (r0 != 0) goto L_0x0010
                    goto L_0x0134
                L_0x0010:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f54174H
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L_0x008c
                    boolean r0 = r0.isShown()
                    if (r0 == 0) goto L_0x008c
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f22154g
                    if (r1 == 0) goto L_0x008c
                    java.util.List<com.startapp.k0> r1 = r0.f54181O
                    int r0 = r0.f54182P
                    java.lang.Object r0 = r1.get(r0)
                    com.startapp.k0 r0 = (com.startapp.C12002k0) r0
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r1 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    android.content.Context r5 = r1.getContext()
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f53184a
                    java.lang.String[] r4 = r4.mo46268w()
                    int r4 = r4.length
                    if (r4 <= 0) goto L_0x007b
                    java.util.concurrent.atomic.AtomicBoolean r4 = r0.f53188e
                    boolean r4 = r4.compareAndSet(r2, r3)
                    if (r4 == 0) goto L_0x007b
                    com.startapp.d9 r10 = new com.startapp.d9
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f53184a
                    java.lang.String[] r6 = r4.mo46268w()
                    com.startapp.sdk.adsbase.commontracking.TrackingParams r7 = r0.f53189f
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f53184a
                    java.lang.Long r4 = r4.mo46252h()
                    if (r4 == 0) goto L_0x0068
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.model.AdDetails r8 = r0.f53184a
                    java.lang.Long r8 = r8.mo46252h()
                    long r8 = r8.longValue()
                    long r8 = r4.toMillis(r8)
                    goto L_0x0074
                L_0x0068:
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.remoteconfig.MetaData r8 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
                    long r8 = r8.mo21203o()
                    long r8 = r4.toMillis(r8)
                L_0x0074:
                    r4 = r10
                    r4.<init>(r5, r6, r7, r8)
                    r0.f53190g = r10
                    goto L_0x007c
                L_0x007b:
                    r10 = 0
                L_0x007c:
                    if (r10 == 0) goto L_0x0081
                    r1.mo20685a((com.startapp.C11868d9) r10)
                L_0x0081:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f54171E
                    if (r1 != 0) goto L_0x008c
                    r0.f54171E = r3
                    r0.mo20682a()
                L_0x008c:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f54167A
                    if (r1 == 0) goto L_0x00d7
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f54185r
                    int r1 = r1.mo45792m()
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r4 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r5 = r4.f54170D
                    if (r5 != 0) goto L_0x00a5
                    com.startapp.sdk.ads.banner.BannerOptions r4 = r4.f54185r
                    int r4 = r4.mo45790k()
                    goto L_0x00a6
                L_0x00a5:
                    r4 = 1
                L_0x00a6:
                    int r1 = r1 * r4
                    float r1 = (float) r1
                    float r4 = r0.f54192y
                    float r4 = r4 + r1
                    r0.f54192y = r4
                    r1 = 1119092736(0x42b40000, float:90.0)
                    int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r4 < 0) goto L_0x00c5
                    int r4 = r0.f54182P
                    int r4 = r4 + r3
                    java.util.List<com.startapp.k0> r5 = r0.f54181O
                    int r5 = r5.size()
                    int r4 = r4 % r5
                    r0.f54182P = r4
                    float r4 = r0.f54192y
                    float r4 = r4 - r1
                    r0.f54192y = r4
                L_0x00c5:
                    float r4 = r0.f54192y
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 > 0) goto L_0x00d4
                    r0.mo45814s()
                    float r4 = r0.f54192y
                    float r4 = r4 + r1
                    r0.f54192y = r4
                L_0x00d4:
                    r0.invalidate()
                L_0x00d7:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f54192y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f54185r
                    int r0 = r0.mo45792m()
                    int r0 = 90 - r0
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0112
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f54192y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f54185r
                    int r0 = r0.mo45792m()
                    int r0 = r0 + 90
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L_0x0112
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f54169C
                    if (r1 != 0) goto L_0x0112
                    boolean r1 = r0.f54178L
                    if (r1 == 0) goto L_0x010d
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f54185r
                    int r1 = r1.mo45779b()
                    long r4 = (long) r1
                    r0.postDelayed(r11, r4)
                L_0x010d:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f54168B = r2
                    goto L_0x0122
                L_0x0112:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f54185r
                    int r1 = r1.mo45793n()
                    long r4 = (long) r1
                    r0.postDelayed(r11, r4)
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f54168B = r3
                L_0x0122:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    int r1 = r0.f54182P
                    int r1 = r1 + r3
                    java.util.List<com.startapp.k0> r0 = r0.f54181O
                    int r0 = r0.size()
                    int r1 = r1 % r0
                    if (r1 != 0) goto L_0x0134
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f54169C = r2
                L_0x0134:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.banner3d.Banner3D.C121911.run():void");
            }
        };
        try {
            mo20697h();
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    /* renamed from: a */
    public final void mo45805a(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2) {
        if (this.f54189v == null) {
            this.f54189v = new Camera();
        }
        this.f54189v.save();
        this.f54189v.translate(0.0f, 0.0f, (float) i4);
        this.f54189v.rotateX(f2);
        float f3 = (float) (-i4);
        this.f54189v.translate(0.0f, 0.0f, f3);
        if (this.f54190w == null) {
            this.f54190w = new Matrix();
        }
        this.f54189v.getMatrix(this.f54190w);
        this.f54189v.restore();
        this.f54190w.preTranslate((float) (-i3), f3);
        this.f54190w.postScale(f, f);
        this.f54190w.postTranslate((float) (i2 + i3), (float) (i + i4));
        canvas.drawBitmap(bitmap, this.f54190w, this.f54191x);
    }

    /* renamed from: a */
    public void mo20683a(int i) {
        this.f22155h = i;
    }
}
