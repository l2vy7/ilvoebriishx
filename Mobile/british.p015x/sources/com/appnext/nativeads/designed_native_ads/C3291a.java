package com.appnext.nativeads.designed_native_ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C3180d;
import com.appnext.nativeads.C3289b;
import com.appnext.nativeads.NativeAdRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appnext.nativeads.designed_native_ads.a */
public final class C3291a {
    /* access modifiers changed from: private */

    /* renamed from: ge */
    public WeakReference<C3294a> f12529ge;
    /* access modifiers changed from: private */

    /* renamed from: gf */
    public List<DesignNativeAd> f12530gf;

    /* renamed from: com.appnext.nativeads.designed_native_ads.a$a */
    public interface C3294a {
        /* renamed from: e */
        void mo11026e(List<DesignNativeAd> list);

        void onError(AppnextError appnextError);
    }

    /* renamed from: a */
    public final void mo11024a(C3294a aVar) {
        this.f12529ge = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo11023a(Context context, String str, DesignNativeAdsRequest designNativeAdsRequest, final int i) {
        final DesignNativeAdObject designNativeAdObject = new DesignNativeAdObject(context, str);
        if (designNativeAdsRequest != null) {
            designNativeAdObject.setCategories(designNativeAdsRequest.getCategories());
            designNativeAdObject.setSpecificCategories(designNativeAdsRequest.getSpecificCategories());
            designNativeAdObject.setPostback(designNativeAdsRequest.getPostBack());
        }
        C3295b bf = C3295b.m11036bf();
        C32921 r4 = new C3180d.C3185a() {
            /* renamed from: a */
            public final <T> void mo10220a(T t) {
                C3294a aVar;
                try {
                    if (C3291a.this.f12529ge != null && (aVar = (C3294a) C3291a.this.f12529ge.get()) != null) {
                        if (t == null) {
                            aVar.onError(new AppnextError(AppnextError.NO_ADS));
                            return;
                        }
                        ArrayList<AppnextAd> a = C3289b.m11016be().mo11008a(designNativeAdObject.getPlacementID(), new NativeAdRequest(), (ArrayList<AppnextAd>) (ArrayList) t);
                        if (a.size() == 0) {
                            aVar.onError(new AppnextError(AppnextError.NO_ADS));
                            return;
                        }
                        int size = a.size();
                        int i = i;
                        if (size > i) {
                            a.subList(i, a.size()).clear();
                        }
                        List unused = C3291a.this.f12530gf = new ArrayList();
                        for (AppnextAd next : a) {
                            String imageURL = next.getImageURL();
                            if (!TextUtils.isEmpty(imageURL)) {
                                C3291a.this.f12530gf.add(new DesignNativeAd(next, imageURL));
                            }
                        }
                        C3291a.this.f12530gf.size();
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public final void run() {
                                C3294a aVar;
                                if (C3291a.this.f12529ge != null && (aVar = (C3294a) C3291a.this.f12529ge.get()) != null) {
                                    aVar.mo11026e(C3291a.this.f12530gf);
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("DesignNativeAdsController$loadAds", th);
                }
            }

            public final void error(String str) {
                C3294a aVar;
                try {
                    if (C3291a.this.f12529ge != null && (aVar = (C3294a) C3291a.this.f12529ge.get()) != null) {
                        if (str != null) {
                            if (!str.equals(AppnextError.NO_ADS)) {
                                if (!str.equals(AppnextError.INTERNAL_ERROR)) {
                                    aVar.onError(new AppnextError(str));
                                    return;
                                }
                            }
                        }
                        aVar.onError(new AppnextError(AppnextError.NO_ADS));
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("DesignNativeAdsController$loadAds", th);
                }
            }
        };
        NativeAdRequest nativeAdRequest = new NativeAdRequest();
        if (designNativeAdsRequest != null) {
            nativeAdRequest.setCategories(designNativeAdsRequest.getCategories());
            nativeAdRequest.setSpecificCategories(designNativeAdsRequest.getSpecificCategories());
            nativeAdRequest.setPostback(designNativeAdsRequest.getPostBack());
        }
        bf.mo11009a(context, designNativeAdObject, str, r4, nativeAdRequest);
    }
}
