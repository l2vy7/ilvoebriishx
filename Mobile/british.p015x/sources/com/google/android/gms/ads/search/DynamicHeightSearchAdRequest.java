package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.ads.C4618oy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class DynamicHeightSearchAdRequest {

    /* renamed from: a */
    private final SearchAdRequest f28134a;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final zzb f28135a = new zzb();

        /* renamed from: b */
        private final Bundle f28136b = new Bundle();

        @RecentlyNonNull
        public Builder addCustomEventExtrasBundle(@RecentlyNonNull Class<? extends CustomEvent> cls, @RecentlyNonNull Bundle bundle) {
            this.f28135a.zzb(cls, bundle);
            return this;
        }

        @RecentlyNonNull
        public Builder addNetworkExtras(@RecentlyNonNull NetworkExtras networkExtras) {
            this.f28135a.zzc(networkExtras);
            return this;
        }

        @RecentlyNonNull
        public Builder addNetworkExtrasBundle(@RecentlyNonNull Class<? extends MediationAdapter> cls, @RecentlyNonNull Bundle bundle) {
            this.f28135a.zzd(cls, bundle);
            return this;
        }

        @RecentlyNonNull
        public DynamicHeightSearchAdRequest build() {
            this.f28135a.zzd(AdMobAdapter.class, this.f28136b);
            return new DynamicHeightSearchAdRequest(this, (zza) null);
        }

        @RecentlyNonNull
        public Builder setAdBorderSelectors(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_adBorderSelectors", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setAdTest(boolean z) {
            this.f28136b.putString("csa_adtest", true != z ? "off" : "on");
            return this;
        }

        @RecentlyNonNull
        public Builder setAdjustableLineHeight(int i) {
            this.f28136b.putString("csa_adjustableLineHeight", Integer.toString(i));
            return this;
        }

        @RecentlyNonNull
        public Builder setAdvancedOptionValue(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f28136b.putString(str, str2);
            return this;
        }

        @RecentlyNonNull
        public Builder setAttributionSpacingBelow(int i) {
            this.f28136b.putString("csa_attributionSpacingBelow", Integer.toString(i));
            return this;
        }

        @RecentlyNonNull
        public Builder setBorderSelections(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_borderSelections", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setChannel(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_channel", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setColorAdBorder(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_colorAdBorder", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setColorAdSeparator(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_colorAdSeparator", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setColorAnnotation(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_colorAnnotation", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setColorAttribution(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_colorAttribution", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setColorBackground(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_colorBackground", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setColorBorder(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_colorBorder", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setColorDomainLink(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_colorDomainLink", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setColorText(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_colorText", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setColorTitleLink(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_colorTitleLink", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setCssWidth(int i) {
            this.f28136b.putString("csa_width", Integer.toString(i));
            return this;
        }

        @RecentlyNonNull
        public Builder setDetailedAttribution(boolean z) {
            this.f28136b.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        @RecentlyNonNull
        public Builder setFontFamily(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_fontFamily", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setFontFamilyAttribution(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setFontSizeAnnotation(int i) {
            this.f28136b.putString("csa_fontSizeAnnotation", Integer.toString(i));
            return this;
        }

        @RecentlyNonNull
        public Builder setFontSizeAttribution(int i) {
            this.f28136b.putString("csa_fontSizeAttribution", Integer.toString(i));
            return this;
        }

        @RecentlyNonNull
        public Builder setFontSizeDescription(int i) {
            this.f28136b.putString("csa_fontSizeDescription", Integer.toString(i));
            return this;
        }

        @RecentlyNonNull
        public Builder setFontSizeDomainLink(int i) {
            this.f28136b.putString("csa_fontSizeDomainLink", Integer.toString(i));
            return this;
        }

        @RecentlyNonNull
        public Builder setFontSizeTitle(int i) {
            this.f28136b.putString("csa_fontSizeTitle", Integer.toString(i));
            return this;
        }

        @RecentlyNonNull
        public Builder setHostLanguage(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_hl", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setIsClickToCallEnabled(boolean z) {
            this.f28136b.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        @RecentlyNonNull
        public Builder setIsLocationEnabled(boolean z) {
            this.f28136b.putString("csa_location", Boolean.toString(z));
            return this;
        }

        @RecentlyNonNull
        public Builder setIsPlusOnesEnabled(boolean z) {
            this.f28136b.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        @RecentlyNonNull
        public Builder setIsSellerRatingsEnabled(boolean z) {
            this.f28136b.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        @RecentlyNonNull
        public Builder setIsSiteLinksEnabled(boolean z) {
            this.f28136b.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        @RecentlyNonNull
        public Builder setIsTitleBold(boolean z) {
            this.f28136b.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        @RecentlyNonNull
        public Builder setIsTitleUnderlined(boolean z) {
            this.f28136b.putString("csa_noTitleUnderline", Boolean.toString(!z));
            return this;
        }

        @RecentlyNonNull
        public Builder setLocationColor(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_colorLocation", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setLocationFontSize(int i) {
            this.f28136b.putString("csa_fontSizeLocation", Integer.toString(i));
            return this;
        }

        @RecentlyNonNull
        public Builder setLongerHeadlines(boolean z) {
            this.f28136b.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        @RecentlyNonNull
        public Builder setNumber(int i) {
            this.f28136b.putString("csa_number", Integer.toString(i));
            return this;
        }

        @RecentlyNonNull
        public Builder setPage(int i) {
            this.f28136b.putString("csa_adPage", Integer.toString(i));
            return this;
        }

        @RecentlyNonNull
        public Builder setQuery(@RecentlyNonNull String str) {
            this.f28135a.zze(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setStyleId(@RecentlyNonNull String str) {
            this.f28136b.putString("csa_styleId", str);
            return this;
        }

        @RecentlyNonNull
        public Builder setVerticalSpacing(int i) {
            this.f28136b.putString("csa_verticalSpacing", Integer.toString(i));
            return this;
        }
    }

    /* synthetic */ DynamicHeightSearchAdRequest(Builder builder, zza zza) {
        this.f28134a = new SearchAdRequest(builder.f28135a, (zzc) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4618oy mo28946a() {
        return this.f28134a.mo17770a();
    }

    @RecentlyNullable
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@RecentlyNonNull Class<T> cls) {
        return this.f28134a.getCustomEventExtrasBundle(cls);
    }

    @RecentlyNullable
    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(@RecentlyNonNull Class<T> cls) {
        return this.f28134a.getNetworkExtrasBundle(cls);
    }

    @RecentlyNonNull
    public String getQuery() {
        return this.f28134a.getQuery();
    }

    public boolean isTestDevice(@RecentlyNonNull Context context) {
        return this.f28134a.isTestDevice(context);
    }
}
