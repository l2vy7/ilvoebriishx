package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class UnifiedNativeAdMapper {

    /* renamed from: a */
    private String f28004a;

    /* renamed from: b */
    private List<NativeAd.Image> f28005b;

    /* renamed from: c */
    private String f28006c;

    /* renamed from: d */
    private NativeAd.Image f28007d;

    /* renamed from: e */
    private String f28008e;

    /* renamed from: f */
    private String f28009f;

    /* renamed from: g */
    private Double f28010g;

    /* renamed from: h */
    private String f28011h;

    /* renamed from: i */
    private String f28012i;

    /* renamed from: j */
    private VideoController f28013j;

    /* renamed from: k */
    private boolean f28014k;

    /* renamed from: l */
    private View f28015l;

    /* renamed from: m */
    private View f28016m;

    /* renamed from: n */
    private Object f28017n;

    /* renamed from: o */
    private Bundle f28018o = new Bundle();

    /* renamed from: p */
    private boolean f28019p;

    /* renamed from: q */
    private boolean f28020q;

    /* renamed from: r */
    private float f28021r;

    @RecentlyNonNull
    public View getAdChoicesContent() {
        return this.f28015l;
    }

    @RecentlyNonNull
    public final String getAdvertiser() {
        return this.f28009f;
    }

    @RecentlyNonNull
    public final String getBody() {
        return this.f28006c;
    }

    @RecentlyNonNull
    public final String getCallToAction() {
        return this.f28008e;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    @RecentlyNonNull
    public final Bundle getExtras() {
        return this.f28018o;
    }

    @RecentlyNonNull
    public final String getHeadline() {
        return this.f28004a;
    }

    @RecentlyNonNull
    public final NativeAd.Image getIcon() {
        return this.f28007d;
    }

    @RecentlyNonNull
    public final List<NativeAd.Image> getImages() {
        return this.f28005b;
    }

    public float getMediaContentAspectRatio() {
        return this.f28021r;
    }

    public final boolean getOverrideClickHandling() {
        return this.f28020q;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f28019p;
    }

    @RecentlyNonNull
    public final String getPrice() {
        return this.f28012i;
    }

    @RecentlyNonNull
    public final Double getStarRating() {
        return this.f28010g;
    }

    @RecentlyNonNull
    public final String getStore() {
        return this.f28011h;
    }

    public void handleClick(@RecentlyNonNull View view) {
    }

    public boolean hasVideoContent() {
        return this.f28014k;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(@RecentlyNonNull View view) {
        this.f28015l = view;
    }

    public final void setAdvertiser(@RecentlyNonNull String str) {
        this.f28009f = str;
    }

    public final void setBody(@RecentlyNonNull String str) {
        this.f28006c = str;
    }

    public final void setCallToAction(@RecentlyNonNull String str) {
        this.f28008e = str;
    }

    public final void setExtras(@RecentlyNonNull Bundle bundle) {
        this.f28018o = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.f28014k = z;
    }

    public final void setHeadline(@RecentlyNonNull String str) {
        this.f28004a = str;
    }

    public final void setIcon(@RecentlyNonNull NativeAd.Image image) {
        this.f28007d = image;
    }

    public final void setImages(@RecentlyNonNull List<NativeAd.Image> list) {
        this.f28005b = list;
    }

    public void setMediaContentAspectRatio(float f) {
        this.f28021r = f;
    }

    public void setMediaView(@RecentlyNonNull View view) {
        this.f28016m = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.f28020q = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.f28019p = z;
    }

    public final void setPrice(@RecentlyNonNull String str) {
        this.f28012i = str;
    }

    public final void setStarRating(@RecentlyNonNull Double d) {
        this.f28010g = d;
    }

    public final void setStore(@RecentlyNonNull String str) {
        this.f28011h = str;
    }

    public void trackViews(@RecentlyNonNull View view, @RecentlyNonNull Map<String, View> map, @RecentlyNonNull Map<String, View> map2) {
    }

    public void untrackView(@RecentlyNonNull View view) {
    }

    @RecentlyNonNull
    public final View zza() {
        return this.f28016m;
    }

    @RecentlyNonNull
    public final VideoController zzb() {
        return this.f28013j;
    }

    @RecentlyNonNull
    public final Object zzc() {
        return this.f28017n;
    }

    public final void zzd(@RecentlyNonNull Object obj) {
        this.f28017n = obj;
    }

    public final void zze(@RecentlyNonNull VideoController videoController) {
        this.f28013j = videoController;
    }
}
