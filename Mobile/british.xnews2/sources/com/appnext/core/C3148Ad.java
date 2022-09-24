package com.appnext.core;

import android.content.Context;
import android.os.Build;
import com.appnext.base.Appnext;
import com.appnext.base.C3117a;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnAdOpened;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.google.android.exoplayer2.C6540C;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.net.URLEncoder;
import p260w5.C11084a;

/* renamed from: com.appnext.core.Ad */
public abstract class C3148Ad {
    public static final String ORIENTATION_AUTO = "automatic";
    public static final String ORIENTATION_DEFAULT = "not_set";
    public static final String ORIENTATION_LANDSCAPE = "landscape";
    public static final String ORIENTATION_PORTRAIT = "portrait";

    /* renamed from: fq */
    protected static boolean f12232fq = false;
    private WeakReference<OnAdOpened> adOpenedCallbackWR = null;
    private C3176c adRequest;
    private String cat = "";
    private WeakReference<OnAdClosed> closeCallbackWR = null;
    private int cnt = 50;
    /* access modifiers changed from: protected */
    public Context context;
    private String mSpecificCategories = "";
    private int maxVideoLength = 0;
    private int minVideoLength = 0;
    private boolean mute = false;
    private WeakReference<OnAdClicked> onAdClickedWR = null;
    private WeakReference<OnAdError> onAdErrorWR = null;
    private WeakReference<OnAdLoaded> onAdLoadedWR = null;
    private String orientation = ORIENTATION_DEFAULT;
    private String packageName = "";
    private String pbk = "";
    private String placementID = "";
    private String sessionId = "";
    protected boolean setMute = false;

    public C3148Ad(final Context context2, String str) {
        if (context2 == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (str != null) {
            this.context = context2;
            setPlacementID(str);
            C3211o.m10825az().mo10821a(new Runnable() {
                public final void run() {
                    try {
                        if (Build.VERSION.SDK_INT <= 19) {
                            C11084a.m49553a(context2.getApplicationContext());
                        }
                    } catch (Throwable unused) {
                    }
                    C3148Ad.this.setSessionId(C3198g.m10797h(context2));
                }
            });
            C3211o.m10825az().mo10821a(new Runnable() {
                public final void run() {
                    try {
                        Appnext.init(context2);
                    } catch (Throwable unused) {
                    }
                }
            });
        } else {
            throw new IllegalArgumentException("placementID cannot be null");
        }
    }

    public void destroy() {
        this.context = null;
        this.onAdClickedWR = null;
        this.onAdErrorWR = null;
        this.onAdLoadedWR = null;
        this.closeCallbackWR = null;
        this.adOpenedCallbackWR = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        try {
            if (!getClass().isInstance(obj) && !obj.getClass().isInstance(this)) {
                return false;
            }
            if (obj instanceof C3148Ad) {
                return ((C3148Ad) obj).getPlacementID().equals(getPlacementID()) && ((C3148Ad) obj).getCategories().equals(getCategories()) && ((C3148Ad) obj).getSpecificCategories().equals(getSpecificCategories()) && ((C3148Ad) obj).getPostback().equals(getPostback()) && ((C3148Ad) obj).getMinVideoLength() == getMinVideoLength() && ((C3148Ad) obj).getMaxVideoLength() == getMaxVideoLength() && ((C3148Ad) obj).getCount() == getCount();
            }
            return super.equals(obj);
        } catch (Throwable unused) {
            return false;
        }
    }

    public abstract String getAUID();

    /* access modifiers changed from: protected */
    public C3176c getAdRequest() {
        return this.adRequest;
    }

    public String getCategories() {
        return this.cat;
    }

    /* access modifiers changed from: protected */
    public Context getContext() {
        return this.context;
    }

    /* access modifiers changed from: protected */
    public int getCount() {
        return this.cnt;
    }

    public abstract void getECPM(OnECPMLoaded onECPMLoaded);

    public int getMaxVideoLength() {
        return this.maxVideoLength;
    }

    public int getMinVideoLength() {
        return this.minVideoLength;
    }

    public boolean getMute() {
        return this.mute;
    }

    public OnAdClicked getOnAdClickedCallback() {
        OnAdClicked onAdClicked;
        WeakReference<OnAdClicked> weakReference = this.onAdClickedWR;
        if (weakReference == null || (onAdClicked = (OnAdClicked) weakReference.get()) == null) {
            return null;
        }
        return onAdClicked;
    }

    public OnAdClosed getOnAdClosedCallback() {
        OnAdClosed onAdClosed;
        WeakReference<OnAdClosed> weakReference = this.closeCallbackWR;
        if (weakReference == null || (onAdClosed = (OnAdClosed) weakReference.get()) == null) {
            return null;
        }
        return onAdClosed;
    }

    public OnAdError getOnAdErrorCallback() {
        OnAdError onAdError;
        WeakReference<OnAdError> weakReference = this.onAdErrorWR;
        if (weakReference == null || (onAdError = (OnAdError) weakReference.get()) == null) {
            return null;
        }
        return onAdError;
    }

    public OnAdLoaded getOnAdLoadedCallback() {
        OnAdLoaded onAdLoaded;
        WeakReference<OnAdLoaded> weakReference = this.onAdLoadedWR;
        if (weakReference == null || (onAdLoaded = (OnAdLoaded) weakReference.get()) == null) {
            return null;
        }
        return onAdLoaded;
    }

    public OnAdOpened getOnAdOpenedCallback() {
        OnAdOpened onAdOpened;
        WeakReference<OnAdOpened> weakReference = this.adOpenedCallbackWR;
        if (weakReference == null || (onAdOpened = (OnAdOpened) weakReference.get()) == null) {
            return null;
        }
        return onAdOpened;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPlacementID() {
        return this.placementID;
    }

    public String getPostback() {
        return this.pbk;
    }

    /* access modifiers changed from: protected */
    public String getSessionId() {
        return this.sessionId;
    }

    public String getSpecificCategories() {
        return this.mSpecificCategories;
    }

    public abstract String getTID();

    public abstract String getVID();

    public int hashCode() {
        try {
            return (((((((((((getPlacementID().hashCode() * 31) + getCategories().hashCode()) * 31) + getSpecificCategories().hashCode()) * 31) + getPostback().hashCode()) * 31) + getCount()) * 31) + getMinVideoLength()) * 31) + getMaxVideoLength();
        } catch (Throwable unused) {
            return 31;
        }
    }

    public abstract boolean isAdLoaded();

    public abstract void loadAd();

    /* access modifiers changed from: protected */
    public void setAdRequest(C3176c cVar) {
        this.adRequest = cVar;
    }

    public void setCategories(String str) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        try {
            if (str.equals(URLDecoder.decode(str, C6540C.UTF8_NAME))) {
                str = URLEncoder.encode(str, C6540C.UTF8_NAME);
            }
            str2 = str;
        } catch (Throwable unused) {
        }
        this.cat = str2;
    }

    /* access modifiers changed from: protected */
    public void setCount(int i) {
        this.cnt = i;
    }

    public void setMaxVideoLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Max Length must be higher than 0");
        } else if (i <= 0 || getMinVideoLength() <= 0 || i >= getMinVideoLength()) {
            this.maxVideoLength = i;
        } else {
            throw new IllegalArgumentException("Max Length cannot be lower than min length");
        }
    }

    public void setMinVideoLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Min Length must be higher than 0");
        } else if (i <= 0 || getMaxVideoLength() <= 0 || i <= getMaxVideoLength()) {
            this.minVideoLength = i;
        } else {
            throw new IllegalArgumentException("Min Length cannot be higher than max length");
        }
    }

    public void setMute(boolean z) {
        this.setMute = true;
        this.mute = z;
    }

    public void setOnAdClickedCallback(OnAdClicked onAdClicked) {
        if (onAdClicked != null) {
            this.onAdClickedWR = new WeakReference<>(onAdClicked);
        }
    }

    public void setOnAdClosedCallback(OnAdClosed onAdClosed) {
        if (onAdClosed != null) {
            this.closeCallbackWR = new WeakReference<>(onAdClosed);
        }
    }

    public void setOnAdErrorCallback(OnAdError onAdError) {
        if (onAdError != null) {
            this.onAdErrorWR = new WeakReference<>(onAdError);
        }
    }

    public void setOnAdLoadedCallback(OnAdLoaded onAdLoaded) {
        if (onAdLoaded != null) {
            this.onAdLoadedWR = new WeakReference<>(onAdLoaded);
        }
    }

    public void setOnAdOpenedCallback(OnAdOpened onAdOpened) {
        if (onAdOpened != null) {
            this.adOpenedCallbackWR = new WeakReference<>(onAdOpened);
        }
    }

    public void setOrientation(String str) {
        if (str == null) {
            throw new IllegalArgumentException("orientation type");
        } else if (str.equals(ORIENTATION_AUTO) || str.equals(ORIENTATION_DEFAULT) || str.equals(ORIENTATION_LANDSCAPE) || str.equals(ORIENTATION_PORTRAIT)) {
            this.orientation = str;
        } else {
            throw new IllegalArgumentException("Wrong orientation type");
        }
    }

    public void setPackageName(String str) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        try {
            if (str.equals(URLDecoder.decode(str, C6540C.UTF8_NAME))) {
                str = URLEncoder.encode(str, C6540C.UTF8_NAME);
            }
            str2 = str;
        } catch (Throwable unused) {
        }
        this.packageName = str2;
    }

    /* access modifiers changed from: protected */
    public void setPlacementID(String str) {
        this.placementID = str;
    }

    public void setPostback(String str) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        try {
            if (str.equals(URLDecoder.decode(str, C6540C.UTF8_NAME))) {
                str = URLEncoder.encode(str, C6540C.UTF8_NAME);
            }
            str2 = str;
        } catch (Throwable unused) {
        }
        this.pbk = str2;
    }

    /* access modifiers changed from: protected */
    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSpecificCategories(String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(URLDecoder.decode(str, C6540C.UTF8_NAME))) {
                this.mSpecificCategories = URLEncoder.encode(str, C6540C.UTF8_NAME);
            }
        } catch (Throwable unused) {
            this.mSpecificCategories = "";
        }
        this.mSpecificCategories = str;
    }

    public abstract void showAd();

    protected C3148Ad(C3148Ad ad) {
        try {
            this.context = ad.context;
            setPlacementID(ad.getPlacementID());
            setCategories(ad.cat);
            setSpecificCategories(ad.mSpecificCategories);
            setPostback(ad.getPostback());
            setCount(ad.getCount());
            setMinVideoLength(ad.getMinVideoLength());
            setMaxVideoLength(ad.getMaxVideoLength());
            setSessionId(ad.getSessionId());
            this.onAdClickedWR = ad.onAdClickedWR;
            this.onAdErrorWR = ad.onAdErrorWR;
            this.onAdLoadedWR = ad.onAdLoadedWR;
            this.closeCallbackWR = ad.closeCallbackWR;
            this.adOpenedCallbackWR = ad.adOpenedCallbackWR;
        } catch (Throwable th) {
            C3117a.m10553a("Ad$Ad", th);
        }
    }
}
