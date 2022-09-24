package com.appnext.nativeads;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.base.Appnext;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C3180d;
import com.appnext.core.C3198g;
import com.appnext.core.SettingsManager;
import com.appnext.nativeads.NativeAdRequest;
import java.util.ArrayList;
import java.util.HashMap;

public class AdLoader {
    /* access modifiers changed from: private */
    public int count;
    /* access modifiers changed from: private */

    /* renamed from: fy */
    public NativeAdListener f12463fy;
    /* access modifiers changed from: private */

    /* renamed from: fz */
    public NativeAdRequest f12464fz;
    /* access modifiers changed from: private */
    public NativeAdObject nativeAdObject;

    private AdLoader(Context context, String str) {
        this.nativeAdObject = new NativeAdObject(context, str);
    }

    /* renamed from: e */
    static /* synthetic */ void m10966e(AdLoader adLoader) {
        try {
            adLoader.f12463fy = null;
            adLoader.f12464fz = null;
            NativeAdObject nativeAdObject2 = adLoader.nativeAdObject;
            if (nativeAdObject2 != null) {
                nativeAdObject2.destroy();
                adLoader.nativeAdObject = null;
            }
        } catch (Throwable th) {
            C3117a.m10553a("AdLoader$load", th);
        }
    }

    public static void getAdsByPackage(Context context, String str, final String str2, NativeAdRequest nativeAdRequest, NativeAdListener nativeAdListener, int i) {
        try {
            if (C3198g.m10800k(context)) {
                Appnext.init(context);
                if (nativeAdRequest != null && nativeAdListener != null && i > 0) {
                    AdLoader adLoader = new AdLoader(context, str);
                    adLoader.f12464fz = new NativeAdRequest(nativeAdRequest);
                    adLoader.count = i;
                    adLoader.f12463fy = nativeAdListener;
                    C3288a.m11006bc().mo10728a(context, str, new SettingsManager.ConfigCallback(adLoader) {

                        /* renamed from: fA */
                        final /* synthetic */ AdLoader f12465fA;

                        {
                            this.f12465fA = r1;
                        }

                        public final void error(String str) {
                            try {
                                AdLoader.m10962a(this.f12465fA, str2);
                            } catch (Throwable unused) {
                            }
                        }

                        public final void loaded(HashMap<String, Object> hashMap) {
                            try {
                                AdLoader.m10962a(this.f12465fA, str2);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (nativeAdListener != null) {
                nativeAdListener.onError((NativeAd) null, new AppnextError(AppnextError.CONNECTION_ERROR));
            }
        } catch (Throwable th) {
            C3117a.m10553a("AdLoader$getAdsByPackage", th);
        }
    }

    public static void load(Context context, String str, NativeAdRequest nativeAdRequest, NativeAdListener nativeAdListener, int i) {
        try {
            getAdsByPackage(context, str, (String) null, nativeAdRequest, nativeAdListener, i);
        } catch (Throwable th) {
            C3117a.m10553a("AdLoader$load", th);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m10962a(AdLoader adLoader, String str) {
        try {
            adLoader.nativeAdObject.setCategories(adLoader.f12464fz.getCategories());
            adLoader.nativeAdObject.setSpecificCategories(adLoader.f12464fz.getSpecificCategories());
            adLoader.nativeAdObject.setPostback(adLoader.f12464fz.getPostback());
            if (!TextUtils.isEmpty(str)) {
                adLoader.nativeAdObject.setPackageName(str);
            }
            adLoader.nativeAdObject.setMinVideoLength(adLoader.f12464fz.getMinVideoLength());
            adLoader.nativeAdObject.setMaxVideoLength(adLoader.f12464fz.getMaxVideoLength());
            C3289b be = C3289b.m11016be();
            Context context = adLoader.nativeAdObject.getContext();
            NativeAdObject nativeAdObject2 = adLoader.nativeAdObject;
            be.mo11009a(context, nativeAdObject2, nativeAdObject2.getPlacementID(), new C3180d.C3185a() {
                /* renamed from: a */
                public final <T> void mo10220a(T t) {
                    if (t == null) {
                        try {
                            if (AdLoader.this.f12463fy != null) {
                                AdLoader.this.f12463fy.onError((NativeAd) null, new AppnextError(AppnextError.NO_ADS));
                            }
                        } catch (Throwable th) {
                            C3117a.m10553a("AdLoader$load", th);
                        }
                    } else if (AdLoader.this.f12464fz != null) {
                        if (AdLoader.this.f12464fz.getVideoLength() == NativeAdRequest.VideoLength.DEFAULT) {
                            AdLoader.this.f12464fz.setVideoLength(NativeAdRequest.VideoLength.fromInt(Integer.parseInt(C3288a.m11006bc().mo10732y("default_video_length"))));
                        }
                        if (AdLoader.this.f12464fz.getVideoQuality() == NativeAdRequest.VideoQuality.DEFAULT) {
                            AdLoader.this.f12464fz.setVideoQuality(NativeAdRequest.VideoQuality.fromInt(Integer.parseInt(C3288a.m11006bc().mo10732y("default_video_quality"))));
                        }
                        ArrayList<AppnextAd> a = C3289b.m11016be().mo11008a(AdLoader.this.nativeAdObject.getPlacementID(), AdLoader.this.f12464fz, (ArrayList<AppnextAd>) (ArrayList) t);
                        if (a.size() != 0) {
                            for (int i = 0; i < Math.min(a.size(), AdLoader.this.count); i++) {
                                NativeAd nativeAd = new NativeAd(AdLoader.this.nativeAdObject.getContext(), AdLoader.this.nativeAdObject.getPlacementID());
                                AppnextAd appnextAd = a.get(i);
                                nativeAd.setLoadedAd(new NativeAdData(appnextAd), AdLoader.this.f12464fz);
                                nativeAd.setAdListener(AdLoader.this.f12463fy);
                                if (AdLoader.this.f12463fy != null) {
                                    AdLoader.this.f12463fy.onAdLoaded(nativeAd, appnextAd.getCreativeType());
                                }
                            }
                        } else if (AdLoader.this.f12463fy != null) {
                            AdLoader.this.f12463fy.onError((NativeAd) null, new AppnextError(AppnextError.NO_ADS));
                        }
                    } else if (AdLoader.this.f12463fy != null) {
                        AdLoader.this.f12463fy.onError((NativeAd) null, new AppnextError(AppnextError.NO_ADS));
                    }
                }

                public final void error(String str) {
                    if (str != null) {
                        try {
                            if (!str.equals(AppnextError.NO_ADS)) {
                                if (!str.equals(AppnextError.INTERNAL_ERROR)) {
                                    AdLoader.this.f12463fy.onError((NativeAd) null, new AppnextError(str));
                                    AdLoader.m10966e(AdLoader.this);
                                }
                            }
                        } catch (Throwable th) {
                            C3117a.m10553a("AdLoader$load", th);
                            return;
                        }
                    }
                    AdLoader.this.f12463fy.onError((NativeAd) null, new AppnextError(AppnextError.NO_ADS));
                    AdLoader.m10966e(AdLoader.this);
                }
            }, adLoader.f12464fz);
        } catch (Throwable th) {
            C3117a.m10553a("AdLoader$load", th);
        }
    }
}
