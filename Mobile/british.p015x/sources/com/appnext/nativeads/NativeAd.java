package com.appnext.nativeads;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3180d;
import com.appnext.core.C3187f;
import com.appnext.core.C3198g;
import com.appnext.core.C3202i;
import com.appnext.core.C3204j;
import com.appnext.core.C3211o;
import com.appnext.core.C3213q;
import com.appnext.core.SettingsManager;
import com.appnext.core.adswatched.C3169a;
import com.appnext.core.p034a.C3167a;
import com.appnext.core.result.C3249a;
import com.appnext.core.result.C3251c;
import com.appnext.core.result.C3252d;
import com.appnext.core.result.ResultPageActivity;
import com.appnext.nativeads.MediaView;
import com.appnext.nativeads.NativeAdRequest;
import com.appnext.nativeads.NativeAdView;
import com.appnext.p022a.C2983a;
import com.google.android.exoplayer2.C6540C;
import com.ironsource.sdk.p289c.C11539d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NativeAd {
    /* access modifiers changed from: private */
    public NativeAdListener adListener;
    /* access modifiers changed from: private */
    public NativeAdView.C3284a adViewActions;
    /* access modifiers changed from: private */
    public boolean clicked = false;
    private List<View> clicksListView;
    /* access modifiers changed from: private */
    public NativeAdRequest.CreativeType creativeType;
    /* access modifiers changed from: private */
    public Handler handler;
    private String language;
    /* access modifiers changed from: private */
    public NativeAdData loadedAd;
    /* access modifiers changed from: private */
    public MediaView mediaView;
    /* access modifiers changed from: private */
    public NativeAdObject nativeAdObject;
    /* access modifiers changed from: private */
    public NativeAdView nativeAdView;
    private int privacyPolicyColor = 0;
    private int privacyPolicyPosition = 1;
    private int privacyPolicyVisibility = 0;
    /* access modifiers changed from: private */
    public boolean reportedImpression = false;
    /* access modifiers changed from: private */
    public boolean reportedVTA = false;
    /* access modifiers changed from: private */
    public C3213q userAction;

    /* renamed from: com.appnext.nativeads.NativeAd$a */
    private class C3281a implements View.OnClickListener {
        private C3281a() {
        }

        public final void onClick(View view) {
            try {
                if (NativeAd.this.loadedAd != null) {
                    NativeAd.this.report("click_event");
                    if (!NativeAd.this.reportedImpression) {
                        NativeAd.this.impression();
                    }
                    if (!NativeAd.this.loadedAd.getWebview().equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                        NativeAd.this.click();
                        return;
                    }
                    char c = 65535;
                    if (NativeAd.this.loadedAd.getRevenueType().equals("cpi")) {
                        String lowerCase = C3288a.m11006bc().mo10732y("cpiActiveFlow").toLowerCase();
                        switch (lowerCase.hashCode()) {
                            case 97:
                                if (lowerCase.equals("a")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 98:
                                if (lowerCase.equals("b")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 99:
                                if (lowerCase.equals("c")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 100:
                                if (lowerCase.equals(C11539d.f51879a)) {
                                    c = 3;
                                    break;
                                }
                                break;
                        }
                        if (c != 0) {
                            if (c == 1) {
                                boolean unused = NativeAd.this.clicked = true;
                            } else if (c == 2) {
                                NativeAd.this.openResultPage(false);
                                return;
                            }
                            NativeAd.this.click();
                            return;
                        }
                        NativeAd.this.openResultPage(true);
                        return;
                    }
                    String lowerCase2 = C3288a.m11006bc().mo10732y("cpcActiveFlow").toLowerCase();
                    int hashCode = lowerCase2.hashCode();
                    if (hashCode != 97) {
                        if (hashCode == 98) {
                            if (lowerCase2.equals("b")) {
                                c = 1;
                            }
                        }
                    } else if (lowerCase2.equals("a")) {
                        c = 0;
                    }
                    if (c != 0) {
                        NativeAd.this.click();
                        return;
                    }
                    boolean unused2 = NativeAd.this.clicked = true;
                    NativeAd.this.click();
                }
            } catch (Throwable th) {
                C3117a.m10553a("NativeAd$destroy", th);
            }
        }
    }

    public NativeAd(Context context, String str) {
        this.nativeAdObject = createAd(context, str);
        C3288a.m11006bc().mo10729h("tid", this.nativeAdObject.getTID());
        C3288a.m11006bc().mo10728a(context, str, (SettingsManager.ConfigCallback) null);
        this.clicksListView = new ArrayList();
        this.adViewActions = new NativeAdView.C3284a() {
            /* renamed from: d */
            public final void mo10961d(int i) {
                try {
                    if (!NativeAd.this.reportedImpression && i >= Integer.parseInt(C3288a.m11006bc().mo10732y("min_imp_precentage"))) {
                        int parseInt = Integer.parseInt(C3288a.m11006bc().mo10732y("postpone_impression_sec"));
                        if (!Boolean.parseBoolean(C3288a.m11006bc().mo10732y("repeat_viewable_criteria")) || parseInt <= 0) {
                            if (!NativeAd.this.reportedImpression) {
                                boolean unused = NativeAd.this.reportedImpression = true;
                                NativeAd.this.impression();
                            }
                        } else if (NativeAd.this.handler != null) {
                            NativeAd.this.handler.postDelayed(new Runnable() {
                                public final void run() {
                                    try {
                                        if (NativeAd.this.nativeAdView != null && !NativeAd.this.reportedImpression && NativeAd.this.nativeAdView.getVisiblePercent(NativeAd.this.nativeAdView) >= Integer.parseInt(C3288a.m11006bc().mo10732y("min_imp_precentage"))) {
                                            NativeAd.this.impression();
                                            boolean unused = NativeAd.this.reportedImpression = true;
                                        }
                                    } catch (Throwable th) {
                                        C3117a.m10553a("NativeAd$NativeAd", th);
                                    }
                                }
                            }, (long) (parseInt * 1000));
                        }
                    }
                    if (!NativeAd.this.reportedVTA && i >= Integer.parseInt(C3288a.m11006bc().mo10732y("min_vta_precentage"))) {
                        int parseInt2 = Integer.parseInt(C3288a.m11006bc().mo10732y("postpone_vta_sec"));
                        if (!Boolean.parseBoolean(C3288a.m11006bc().mo10732y("repeat_vta_viewable_criteria")) || parseInt2 <= 0) {
                            if (!NativeAd.this.reportedVTA && NativeAd.this.loadedAd != null) {
                                boolean unused2 = NativeAd.this.reportedVTA = true;
                                NativeAd.this.userAction.mo10822a(NativeAd.this.loadedAd, NativeAd.this.loadedAd.getImpressionURL(), (C3187f.C3196a) null);
                            }
                        } else if (NativeAd.this.handler != null) {
                            NativeAd.this.handler.postDelayed(new Runnable() {
                                public final void run() {
                                    try {
                                        if (NativeAd.this.nativeAdView != null && !NativeAd.this.reportedVTA && NativeAd.this.loadedAd != null && NativeAd.this.nativeAdView.getVisiblePercent(NativeAd.this.nativeAdView) >= Integer.parseInt(C3288a.m11006bc().mo10732y("min_vta_precentage"))) {
                                            NativeAd.this.userAction.mo10822a(NativeAd.this.loadedAd, NativeAd.this.loadedAd.getImpressionURL(), (C3187f.C3196a) null);
                                            boolean unused = NativeAd.this.reportedVTA = true;
                                        }
                                    } catch (Throwable th) {
                                        C3117a.m10553a("NativeAd$NativeAd", th);
                                    }
                                }
                            }, (long) (parseInt2 * 1000));
                        }
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("NativeAd$NativeAd", th);
                }
            }
        };
        this.handler = new Handler();
        this.userAction = new C3213q(context, new C3213q.C3217a() {
            /* renamed from: c */
            public final C3148Ad mo10141c() {
                return NativeAd.this.nativeAdObject;
            }

            /* renamed from: d */
            public final AppnextAd mo10142d() {
                return NativeAd.this.loadedAd;
            }

            /* renamed from: e */
            public final SettingsManager mo10143e() {
                return C3288a.m11006bc();
            }

            public final void report(String str) {
            }
        });
    }

    /* access modifiers changed from: private */
    public MediaView.MediaType creativeToMediaType(NativeAdRequest.CreativeType creativeType2) {
        if (creativeType2 == NativeAdRequest.CreativeType.STATIC_ONLY) {
            return MediaView.MediaType.STATIC;
        }
        return MediaView.MediaType.VIDEO;
    }

    private void fillListWithSubviews(ArrayList<View> arrayList, View view) {
        try {
            if (!(view instanceof PrivacyIcon) && !(view instanceof C2983a)) {
                arrayList.add(view);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        fillListWithSubviews(arrayList, viewGroup.getChildAt(i));
                    }
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("NativeAd$fillListWithSubviews", th);
        }
    }

    /* access modifiers changed from: private */
    public void impression() {
        try {
            if (this.loadedAd != null) {
                this.reportedImpression = true;
                report("impression_event");
                this.userAction.mo10827d(this.loadedAd);
                C3211o.m10825az().mo10821a(new Runnable() {
                    public final void run() {
                        try {
                            if (NativeAd.this.getNativeAdView() != null) {
                                C3169a.m10687o(NativeAd.this.getNativeAdView().getContext()).mo10753k(NativeAd.this.loadedAd.getBannerID(), NativeAd.this.nativeAdObject.getAUID());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
                NativeAdListener nativeAdListener = this.adListener;
                if (nativeAdListener != null) {
                    nativeAdListener.adImpression(this);
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("NativeAd$impression", th);
        }
    }

    /* access modifiers changed from: private */
    public void load(final NativeAdRequest nativeAdRequest) {
        C3289b be = C3289b.m11016be();
        Context context = this.nativeAdObject.getContext();
        NativeAdObject nativeAdObject2 = this.nativeAdObject;
        be.mo11009a(context, nativeAdObject2, nativeAdObject2.getPlacementID(), new C3180d.C3185a() {
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final <T> void mo10220a(T r7) {
                /*
                    r6 = this;
                    java.lang.String r7 = "NativeAd$load"
                    com.appnext.nativeads.NativeAd r0 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    android.os.Handler r0 = r0.handler     // Catch:{ all -> 0x00f9 }
                    if (r0 != 0) goto L_0x000b
                    return
                L_0x000b:
                    com.appnext.nativeads.NativeAd r0 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    r1 = 0
                    boolean unused = r0.reportedImpression = r1     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAd r0 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    boolean unused = r0.reportedVTA = r1     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdRequest r0 = r7     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdRequest$VideoLength r0 = r0.getVideoLength()     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdRequest$VideoLength r1 = com.appnext.nativeads.NativeAdRequest.VideoLength.DEFAULT     // Catch:{ all -> 0x00f9 }
                    if (r0 != r1) goto L_0x0037
                    com.appnext.nativeads.NativeAdRequest r0 = r7     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.a r1 = com.appnext.nativeads.C3288a.m11006bc()     // Catch:{ all -> 0x00f9 }
                    java.lang.String r2 = "default_video_length"
                    java.lang.String r1 = r1.mo10732y(r2)     // Catch:{ all -> 0x00f9 }
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdRequest$VideoLength r1 = com.appnext.nativeads.NativeAdRequest.VideoLength.fromInt(r1)     // Catch:{ all -> 0x00f9 }
                    r0.setVideoLength(r1)     // Catch:{ all -> 0x00f9 }
                L_0x0037:
                    com.appnext.nativeads.NativeAdRequest r0 = r7     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdRequest$VideoQuality r0 = r0.getVideoQuality()     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdRequest$VideoQuality r1 = com.appnext.nativeads.NativeAdRequest.VideoQuality.DEFAULT     // Catch:{ all -> 0x00f9 }
                    if (r0 != r1) goto L_0x0058
                    com.appnext.nativeads.NativeAdRequest r0 = r7     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.a r1 = com.appnext.nativeads.C3288a.m11006bc()     // Catch:{ all -> 0x00f9 }
                    java.lang.String r2 = "default_video_quality"
                    java.lang.String r1 = r1.mo10732y(r2)     // Catch:{ all -> 0x00f9 }
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdRequest$VideoQuality r1 = com.appnext.nativeads.NativeAdRequest.VideoQuality.fromInt(r1)     // Catch:{ all -> 0x00f9 }
                    r0.setVideoQuality(r1)     // Catch:{ all -> 0x00f9 }
                L_0x0058:
                    r0 = 0
                    com.appnext.nativeads.b r1 = com.appnext.nativeads.C3289b.m11016be()     // Catch:{ all -> 0x0074 }
                    com.appnext.nativeads.NativeAd r2 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x0074 }
                    com.appnext.nativeads.NativeAdObject r2 = r2.nativeAdObject     // Catch:{ all -> 0x0074 }
                    android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0074 }
                    com.appnext.nativeads.NativeAd r3 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x0074 }
                    com.appnext.nativeads.NativeAdObject r3 = r3.nativeAdObject     // Catch:{ all -> 0x0074 }
                    com.appnext.nativeads.NativeAdRequest r4 = r7     // Catch:{ all -> 0x0074 }
                    com.appnext.core.AppnextAd r0 = r1.mo11006a((android.content.Context) r2, (com.appnext.core.C3148Ad) r3, (com.appnext.nativeads.NativeAdRequest) r4)     // Catch:{ all -> 0x0074 }
                    goto L_0x0078
                L_0x0074:
                    r1 = move-exception
                    com.appnext.base.C3117a.m10553a(r7, r1)     // Catch:{ all -> 0x00f9 }
                L_0x0078:
                    if (r0 != 0) goto L_0x009c
                    com.appnext.nativeads.NativeAd r0 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdListener r0 = r0.adListener     // Catch:{ all -> 0x00f9 }
                    if (r0 == 0) goto L_0x009b
                    com.appnext.nativeads.NativeAd r0 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    java.lang.String r1 = "error_no_ads"
                    r0.report(r1)     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAd r0 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdListener r0 = r0.adListener     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAd r1 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.core.AppnextError r2 = new com.appnext.core.AppnextError     // Catch:{ all -> 0x00f9 }
                    java.lang.String r3 = "No Ads"
                    r2.<init>(r3)     // Catch:{ all -> 0x00f9 }
                    r0.onError(r1, r2)     // Catch:{ all -> 0x00f9 }
                L_0x009b:
                    return
                L_0x009c:
                    com.appnext.nativeads.NativeAd r1 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdRequest r2 = r7     // Catch:{ all -> 0x00f9 }
                    r1.setLoadedAd(r0, r2)     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAd r1 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.MediaView r1 = r1.mediaView     // Catch:{ all -> 0x00f9 }
                    if (r1 == 0) goto L_0x00c4
                    com.appnext.nativeads.NativeAd r1 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.MediaView r1 = r1.mediaView     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAd r2 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdData r3 = r2.loadedAd     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAd r4 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdRequest$CreativeType r5 = r4.creativeType     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.MediaView$MediaType r4 = r4.creativeToMediaType(r5)     // Catch:{ all -> 0x00f9 }
                    r1.mo10895a(r2, r3, r4)     // Catch:{ all -> 0x00f9 }
                L_0x00c4:
                    com.appnext.nativeads.NativeAd r1 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdView r1 = r1.nativeAdView     // Catch:{ all -> 0x00f9 }
                    if (r1 == 0) goto L_0x00e1
                    com.appnext.nativeads.NativeAd r1 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdView r1 = r1.nativeAdView     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAd r2 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdData r3 = r2.loadedAd     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAd r4 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdView$a r4 = r4.adViewActions     // Catch:{ all -> 0x00f9 }
                    r1.mo10991a(r2, r3, r4)     // Catch:{ all -> 0x00f9 }
                L_0x00e1:
                    com.appnext.nativeads.NativeAd r1 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdListener r1 = r1.adListener     // Catch:{ all -> 0x00f9 }
                    if (r1 == 0) goto L_0x00f8
                    com.appnext.nativeads.NativeAd r1 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAdListener r1 = r1.adListener     // Catch:{ all -> 0x00f9 }
                    com.appnext.nativeads.NativeAd r2 = com.appnext.nativeads.NativeAd.this     // Catch:{ all -> 0x00f9 }
                    com.appnext.core.AppnextAdCreativeType r0 = r0.getCreativeType()     // Catch:{ all -> 0x00f9 }
                    r1.onAdLoaded(r2, r0)     // Catch:{ all -> 0x00f9 }
                L_0x00f8:
                    return
                L_0x00f9:
                    r0 = move-exception
                    com.appnext.base.C3117a.m10553a(r7, r0)
                    com.appnext.nativeads.NativeAd r7 = com.appnext.nativeads.NativeAd.this
                    java.lang.String r0 = "Internal error"
                    r7.onError(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appnext.nativeads.NativeAd.C32784.mo10220a(java.lang.Object):void");
            }

            public final void error(String str) {
                NativeAd.this.onError(str);
            }
        }, nativeAdRequest);
    }

    /* access modifiers changed from: private */
    public void onError(String str) {
        try {
            if (this.adListener != null) {
                if (str != null) {
                    if (!str.equals(AppnextError.NO_ADS)) {
                        if (!str.equals(AppnextError.INTERNAL_ERROR)) {
                            report("error_" + str.toLowerCase().replace(" ", "_"));
                            this.adListener.onError(this, new AppnextError(str));
                            return;
                        }
                    }
                }
                report("error_no_ads");
                this.adListener.onError(this, new AppnextError(AppnextError.NO_ADS));
            }
        } catch (Throwable th) {
            C3117a.m10553a("NativeAd$load", th);
        }
    }

    /* access modifiers changed from: private */
    public void openResultPage(boolean z) {
        C3252d.m10942aX().mo10879a(new C3251c() {
            /* access modifiers changed from: protected */
            public final String getButtonText(AppnextAd appnextAd) {
                try {
                    String buttonText = new NativeAdData(appnextAd).getButtonText();
                    if (appnextAd == null || !buttonText.equals("")) {
                        return buttonText;
                    }
                    if (C3198g.m10789b(NativeAd.this.nativeAdObject.getContext(), appnextAd.getAdPackage())) {
                        return C3288a.m11006bc().mo10732y("existing_button_text");
                    }
                    return C3288a.m11006bc().mo10732y("new_button_text");
                } catch (Throwable th) {
                    C3117a.m10553a("NativeAd$getButtonText", th);
                    return "";
                }
            }

            public final JSONObject getConfigParams() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vid", "2.6.5.473");
                String str = "";
                jSONObject.put("tid", NativeAd.this.nativeAdObject == null ? str : NativeAd.this.nativeAdObject.getTID());
                if (NativeAd.this.nativeAdObject != null) {
                    str = NativeAd.this.nativeAdObject.getAUID();
                }
                jSONObject.put("auid", str);
                jSONObject.put("osid", "100");
                jSONObject.put("tem_id", NativeAd.this.nativeAdObject.getTemId(NativeAd.this.loadedAd));
                jSONObject.put(TtmlNode.ATTR_ID, getPlacementId());
                jSONObject.put("b_title", getButtonText(NativeAd.this.loadedAd));
                jSONObject.put("cat", NativeAd.this.loadedAd.getCategories());
                jSONObject.put("lockcat", NativeAd.this.loadedAd.getSpecificCategories());
                jSONObject.put("pview", C3288a.m11006bc().mo10732y("pview"));
                jSONObject.put("devn", C3198g.m10785au());
                jSONObject.put("dosv", Build.VERSION.SDK_INT);
                jSONObject.put("dds", SessionDescription.SUPPORTED_SDP_VERSION);
                jSONObject.put("ads_type", "banner");
                jSONObject.put("country", NativeAd.this.loadedAd.getCountry());
                jSONObject.put("gdpr", C3202i.m10805a((AppnextAd) NativeAd.this.loadedAd, (SettingsManager) C3288a.m11006bc()));
                return jSONObject;
            }

            public final String getPlacementId() {
                return NativeAd.this.nativeAdObject.getPlacementID();
            }

            public final AppnextAd getSelectedAd() {
                return NativeAd.this.loadedAd;
            }

            /* renamed from: t */
            public final String mo10353t() {
                return NativeAd.this.nativeAdObject.getTemId(NativeAd.this.loadedAd);
            }

            /* renamed from: u */
            public final String mo10354u() {
                return C3289b.m11016be().mo10780k(NativeAd.this.nativeAdObject);
            }

            /* renamed from: v */
            public final String mo10355v() {
                try {
                    ArrayList<AppnextAd> e = C3289b.m11016be().mo11010e(NativeAd.this.nativeAdObject);
                    JSONArray jSONArray = new JSONArray();
                    Iterator<AppnextAd> it = e.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(new JSONObject(C3180d.m10723c(it.next())));
                    }
                    return new JSONObject().put("apps", jSONArray).toString();
                } catch (Throwable th) {
                    C3117a.m10553a("NativeAd$getFilteredAds", th);
                    return "";
                }
            }

            /* renamed from: w */
            public final SettingsManager mo10356w() {
                return C3288a.m11006bc();
            }

            /* renamed from: x */
            public final C3148Ad mo10357x() {
                return NativeAd.this.nativeAdObject;
            }

            /* renamed from: y */
            public final C3249a mo10358y() {
                return null;
            }
        });
        Intent intent = new Intent(this.nativeAdObject.getContext(), ResultPageActivity.class);
        intent.putExtra("shouldClose", z);
        intent.setFlags(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.nativeAdObject.getContext().startActivity(intent);
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        String str2;
        String str3;
        try {
            Context context = this.nativeAdObject.getContext();
            String tid = this.nativeAdObject.getTID();
            String vid = this.nativeAdObject.getVID();
            String auid = this.nativeAdObject.getAUID();
            String placementID = this.nativeAdObject.getPlacementID();
            String sessionId = this.nativeAdObject.getSessionId();
            NativeAdData nativeAdData = this.loadedAd;
            if (nativeAdData != null) {
                str2 = nativeAdData.getBannerID();
            } else {
                str2 = "";
            }
            NativeAdData nativeAdData2 = this.loadedAd;
            if (nativeAdData2 != null) {
                str3 = nativeAdData2.getCampaignID();
            } else {
                str3 = "";
            }
            C3198g.m10781a(context, tid, vid, auid, placementID, sessionId, str, "pub_control", str2, str3);
        } catch (Throwable th) {
            C3117a.m10553a("NativeAd$onWindowVisibilityChanged", th);
        }
    }

    /* access modifiers changed from: protected */
    public void click() {
        try {
            C3213q qVar = this.userAction;
            NativeAdData nativeAdData = this.loadedAd;
            qVar.mo10823a(nativeAdData, nativeAdData.getAppURL(), this.nativeAdObject.getPlacementID(), (C3187f.C3196a) null);
            NativeAdListener nativeAdListener = this.adListener;
            if (nativeAdListener != null) {
                nativeAdListener.onAdClicked(this);
            }
        } catch (Throwable th) {
            C3117a.m10553a("NativeAd$click", th);
        }
    }

    /* access modifiers changed from: protected */
    public NativeAdObject createAd(Context context, String str) {
        return new NativeAdObject(context, str);
    }

    public void destroy() {
        try {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages((Object) null);
            }
            for (View onClickListener : this.clicksListView) {
                onClickListener.setOnClickListener((View.OnClickListener) null);
            }
            List<View> list = this.clicksListView;
            if (list != null) {
                list.clear();
            }
            C3213q qVar = this.userAction;
            if (qVar != null) {
                qVar.destroy();
            }
            NativeAdObject nativeAdObject2 = this.nativeAdObject;
            if (nativeAdObject2 != null) {
                nativeAdObject2.destroy();
            }
            MediaView mediaView2 = this.mediaView;
            if (mediaView2 != null) {
                mediaView2.destroy();
            }
            this.handler = null;
            this.adViewActions = null;
            this.mediaView = null;
            this.adListener = null;
            this.loadedAd = null;
            this.nativeAdView = null;
        } catch (Exception e) {
            C3117a.m10553a("NativeAd$destroy", e);
        }
    }

    public void downloadAndDisplayImage(Context context, ImageView imageView, String str) {
        C3204j.m10808ax().mo10810a(context, imageView, str, (C3204j.C3206a) null);
    }

    public void getAdByPackage(NativeAdRequest nativeAdRequest, String str) {
        try {
            if (!C3198g.m10800k(this.nativeAdObject.getContext())) {
                NativeAdListener nativeAdListener = this.adListener;
                if (nativeAdListener != null) {
                    nativeAdListener.onError(this, new AppnextError(AppnextError.CONNECTION_ERROR));
                }
            } else if (this.handler != null) {
                final NativeAdRequest nativeAdRequest2 = new NativeAdRequest(nativeAdRequest);
                this.nativeAdObject.setPackageName(str);
                this.nativeAdObject.setCategories(nativeAdRequest2.getCategories());
                this.nativeAdObject.setSpecificCategories(nativeAdRequest2.getSpecificCategories());
                this.nativeAdObject.setPostback(nativeAdRequest2.getPostback());
                this.nativeAdObject.setMinVideoLength(nativeAdRequest2.getMinVideoLength());
                this.nativeAdObject.setMaxVideoLength(nativeAdRequest2.getMaxVideoLength());
                this.creativeType = nativeAdRequest2.getCreativeType();
                report("caching_" + nativeAdRequest2.getCachingPolicy());
                C3288a.m11006bc().mo10728a(this.nativeAdObject.getContext(), this.nativeAdObject.getPlacementID(), new SettingsManager.ConfigCallback() {
                    public final void error(String str) {
                        try {
                            NativeAd.this.load(nativeAdRequest2);
                        } catch (Throwable th) {
                            C3117a.m10553a("NativeAd$getAdByPackage", th);
                        }
                    }

                    public final void loaded(HashMap<String, Object> hashMap) {
                        try {
                            NativeAd.this.load(nativeAdRequest2);
                        } catch (Throwable th) {
                            C3117a.m10553a("NativeAd$getAdByPackage", th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            C3117a.m10553a("NativeAd$getAdByPackage", th);
        }
    }

    public String getAdDescription() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getAdDescription();
    }

    public String getAdTitle() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getAdTitle();
    }

    public String getAppPackageName() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getAdPackage();
    }

    public String getAppSize() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getAppSize();
    }

    public String getBannerID() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getBannerID();
    }

    public String getCTAText() {
        try {
            if (this.loadedAd == null) {
                return null;
            }
            boolean b = C3198g.m10789b(this.nativeAdObject.getContext(), this.loadedAd.getAdPackage());
            String str = "existing";
            if (!this.loadedAd.getButtonText().equals("")) {
                C3167a q = C3167a.m10684q(this.nativeAdObject.getContext());
                String language2 = getLanguage();
                if (!b) {
                    str = "new";
                }
                return q.mo10749a(language2, str, this.loadedAd.getButtonText());
            } else if (b) {
                return C3167a.m10684q(this.nativeAdObject.getContext()).mo10749a(getLanguage(), str, C3288a.m11006bc().mo10732y("existing_button_text"));
            } else {
                return C3167a.m10684q(this.nativeAdObject.getContext()).mo10749a(getLanguage(), "new", C3288a.m11006bc().mo10732y("new_button_text"));
            }
        } catch (Throwable th) {
            C3117a.m10553a("NativeAd$getCTAText", th);
            return "";
        }
    }

    public String getCategories() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getCategories();
    }

    public String getCountry() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getCountry();
    }

    public float getECPM() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return 0.0f;
        }
        return nativeAdData.getECPM();
    }

    public String getIconURL() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getImageURL();
    }

    public String getLanguage() {
        return this.language;
    }

    public MediaView getMediaView() {
        return this.mediaView;
    }

    public NativeAdView getNativeAdView() {
        return this.nativeAdView;
    }

    public float getPPR() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return 0.0f;
        }
        return nativeAdData.getPPR();
    }

    public String getPPU() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return C3198g.m10793e(nativeAdData);
    }

    public int getPrivacyPolicyColor() {
        return this.privacyPolicyColor;
    }

    public int getPrivacyPolicyPosition() {
        return this.privacyPolicyPosition;
    }

    public int getPrivacyPolicyVisibility() {
        return this.privacyPolicyVisibility;
    }

    public String getSpecificCategories() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getSpecificCategories();
    }

    public String getStoreDownloads() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getStoreDownloads();
    }

    public String getStoreRating() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getStoreRating();
    }

    public String getSupportedVersion() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getSupportedVersion();
    }

    public String getVideoUrl() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getSelectedVideo();
    }

    public String getWideImageURL() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getWideImageURL();
    }

    /* renamed from: i */
    public void mo10945i() {
        if ((Thread.currentThread().getStackTrace()[3].getClassName() + Thread.currentThread().getStackTrace()[3].getMethodName()).hashCode() == -133704518 && !this.reportedImpression) {
            impression();
        }
    }

    public boolean isGPRD() {
        NativeAdData nativeAdData = this.loadedAd;
        return nativeAdData != null && nativeAdData.isGdpr();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.nativeAdObject;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isLoaded() {
        /*
            r1 = this;
            com.appnext.nativeads.NativeAdData r0 = r1.loadedAd
            if (r0 == 0) goto L_0x0010
            com.appnext.nativeads.NativeAdObject r0 = r1.nativeAdObject
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isAdLoaded()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.nativeads.NativeAd.isLoaded():boolean");
    }

    public void loadAd(NativeAdRequest nativeAdRequest) {
        getAdByPackage(nativeAdRequest, (String) null);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (i == 0) {
            try {
                if (this.clicked) {
                    this.clicked = false;
                    openResultPage(false);
                }
            } catch (Throwable th) {
                C3117a.m10553a("NativeAd$onWindowVisibilityChanged", th);
            }
        }
    }

    public void registerClickableViews(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            fillListWithSubviews(arrayList, view);
            registerClickableViews((List<View>) arrayList);
        } catch (Throwable th) {
            C3117a.m10553a("NativeAd$registerClickableViews", th);
        }
    }

    public void setAdListener(NativeAdListener nativeAdListener) {
        if (nativeAdListener != null) {
            this.adListener = nativeAdListener;
        }
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    /* access modifiers changed from: protected */
    public void setLoadedAd(AppnextAd appnextAd, NativeAdRequest nativeAdRequest) {
        try {
            NativeAdData nativeAdData = new NativeAdData(appnextAd);
            this.loadedAd = nativeAdData;
            nativeAdData.setAppURL(this.loadedAd.getAppURL() + "&tem_id=" + this.nativeAdObject.getTemId(this.loadedAd));
            NativeAdData nativeAdData2 = this.loadedAd;
            nativeAdData2.setImpressionURL(this.loadedAd.getImpressionURL() + "&tem_id=" + this.nativeAdObject.getTemId(this.loadedAd));
            try {
                C3289b.m11016be();
                String a = C3289b.m11012a(nativeAdRequest, (AppnextAd) this.loadedAd);
                if (!a.equals("")) {
                    this.loadedAd.mo10967J(a);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            C3117a.m10553a("NativeAd$setLoadedAd", th);
        }
    }

    public void setMediaView(MediaView mediaView2) {
        this.mediaView = mediaView2;
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData != null && mediaView2 != null) {
            mediaView2.mo10895a(this, nativeAdData, creativeToMediaType(this.creativeType));
        }
    }

    public void setNativeAdView(NativeAdView nativeAdView2) {
        NativeAdData nativeAdData;
        NativeAdView nativeAdView3 = this.nativeAdView;
        if (nativeAdView3 != null) {
            nativeAdView3.mo10993bd();
        }
        this.nativeAdView = nativeAdView2;
        if (nativeAdView2 != null && (nativeAdData = this.loadedAd) != null) {
            nativeAdView2.mo10991a(this, nativeAdData, this.adViewActions);
        }
    }

    public void setParams(String str, String str2) {
        C3288a.m11006bc().mo10731j(str, str2);
    }

    public void setPrivacyPolicyColor(int i) {
        this.privacyPolicyColor = i;
    }

    public void setPrivacyPolicyPosition(int i) {
        this.privacyPolicyPosition = i;
    }

    public void setPrivacyPolicyVisibility(int i) {
        this.privacyPolicyVisibility = i;
    }

    public void registerClickableViews(List<View> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    C3281a aVar = new C3281a();
                    for (View next : list) {
                        if (!(next instanceof PrivacyIcon) && !(next instanceof C2983a) && !(next instanceof MediaView.C3272a)) {
                            this.clicksListView.add(next);
                            next.setOnClickListener(aVar);
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("List cannot be empty");
            } catch (Throwable th) {
                C3117a.m10553a("NativeAd$registerClickableViews", th);
            }
        } else {
            throw new IllegalArgumentException("List cannot be null");
        }
    }
}
