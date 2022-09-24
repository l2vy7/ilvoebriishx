package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p277b.C11311c;
import com.ironsource.mediationsdk.adunit.p277b.C11312d;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p285c.C11361b;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.K */
public final class C11242K<Listener extends AdapterAdInteractionListener> extends BaseAdInteractionAdapter<C11242K<Listener>, Listener> implements AdapterDebugInterface, AdapterBaseInterface, AdapterBidderInterface, AdapterConsentInterface, AdapterSettingsInterface, InterstitialSmashListener, RewardedVideoSmashListener {

    /* renamed from: c */
    private AbstractAdapter f50485c;

    /* renamed from: d */
    IronSource.AD_UNIT f50486d;

    /* renamed from: e */
    private C11312d f50487e;

    /* renamed from: f */
    private NetworkInitializationListener f50488f;

    /* renamed from: g */
    private AdapterAdListener f50489g;

    public C11242K(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        super(ad_unit, networkSettings);
        this.f50485c = abstractAdapter;
        this.f50486d = ad_unit;
        this.f50487e = new C11312d(ad_unit, C11312d.C11314b.PROVIDER, (C11311c) null);
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f50485c.addInterstitialListener(this);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f50485c.addRewardedVideoListener(this);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error(m50216a("ad unit not supported - " + this.f50486d));
        }
    }

    /* renamed from: a */
    private String m50216a(String str) {
        String ad_unit = this.f50486d.toString();
        if (TextUtils.isEmpty(str)) {
            return ad_unit;
        }
        return ad_unit + " - " + str;
    }

    /* renamed from: b */
    private boolean m50217b(IronSourceError ironSourceError) {
        IronSource.AD_UNIT ad_unit = this.f50486d;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return ironSourceError.getErrorCode() == 1158;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return ironSourceError.getErrorCode() == 1058;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.error(m50216a("ad unit not supported - " + this.f50486d));
        return false;
    }

    public final String getAdapterVersion() {
        return this.f50485c.getVersion();
    }

    public final Map<String, Object> getBiddingData(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            IronSource.AD_UNIT ad_unit = this.f50486d;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f50485c.getInterstitialBiddingData(jSONObject);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.f50485c.getRewardedVideoBiddingData(jSONObject);
            }
            IronLog.INTERNAL.error(m50216a("ad unit not supported - " + this.f50486d));
            return null;
        } catch (Throwable th) {
            String str = "getBiddingData exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m50216a(str));
            this.f50487e.f50816e.mo44112m(str);
            return null;
        }
    }

    public final LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return this.f50486d == IronSource.AD_UNIT.REWARDED_VIDEO ? this.f50485c.getLoadWhileShowSupportState(networkSettings.getRewardedVideoSettings()) : LoadWhileShowSupportState.NONE;
    }

    public final /* bridge */ /* synthetic */ AdapterBaseInterface getNetworkAdapter() {
        return this;
    }

    public final String getNetworkSDKVersion() {
        return this.f50485c.getCoreSDKVersion();
    }

    public final void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        this.f50488f = networkInitializationListener;
        String string = adData.getString(DataKeys.USER_ID);
        try {
            String str = C11232E.m50103a().f50431u;
            if (!TextUtils.isEmpty(str)) {
                this.f50485c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f50485c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Throwable th) {
            String str2 = "setCustomParams exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m50216a(str2));
            this.f50487e.f50816e.mo44112m(str2);
        }
        JSONObject a = C11361b.m50768a(adData.getConfiguration());
        try {
            IronSource.AD_UNIT ad_unit = this.f50486d;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num == null || num.intValue() != 1) {
                    this.f50485c.initInterstitialForBidding("", string, a, this);
                } else {
                    this.f50485c.initInterstitial("", string, a, this);
                }
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.f50485c.initRewardedVideoWithCallback("", string, a, this);
            } else {
                IronLog.INTERNAL.error("ad unit not supported - " + this.f50486d);
            }
        } catch (Throwable th2) {
            String str3 = "init failed - " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(m50216a(str3));
            this.f50487e.f50816e.mo44112m(str3);
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, str3));
        }
    }

    public final boolean isAdAvailable(AdData adData) {
        JSONObject a = C11361b.m50768a(adData.getConfiguration());
        try {
            IronSource.AD_UNIT ad_unit = this.f50486d;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f50485c.isInterstitialReady(a);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.f50485c.isRewardedVideoAvailable(a);
            }
            IronLog.INTERNAL.error(m50216a("ad unit not supported - " + this.f50486d));
            return false;
        } catch (Throwable th) {
            String str = "isAdAvailable exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m50216a(str));
            this.f50487e.f50816e.mo44112m(str);
            return false;
        }
    }

    public final /* synthetic */ void loadAd(AdData adData, Activity activity, Object obj) {
        this.f50489g = (AdapterAdInteractionListener) obj;
        JSONObject a = C11361b.m50768a(adData.getConfiguration());
        try {
            IronSource.AD_UNIT ad_unit = this.f50486d;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num == null || num.intValue() != 1) {
                    this.f50485c.loadInterstitialForBidding(a, this, adData.getServerData());
                } else {
                    this.f50485c.loadInterstitial(a, this);
                }
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                Integer num2 = adData.getInt("instanceType");
                if (num2 == null || num2.intValue() != 1) {
                    this.f50485c.loadRewardedVideoForBidding(a, this, adData.getServerData());
                } else {
                    this.f50485c.fetchRewardedVideoForAutomaticLoad(a, this);
                }
            } else {
                IronLog.INTERNAL.error(m50216a("ad unit not supported - " + this.f50486d));
            }
        } catch (Throwable th) {
            String str = "loadAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m50216a(str));
            this.f50487e.f50816e.mo44112m(str);
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
        }
    }

    public final void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener != null) {
            adapterAdListener.onAdClicked();
        }
    }

    public final void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdClosed();
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m50216a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadFailed(m50217b(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdOpened();
        }
    }

    public final void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadSuccess();
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m50216a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowSuccess();
        }
    }

    public final void onInterstitialAdVisible() {
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m50216a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.f50488f;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        NetworkInitializationListener networkInitializationListener = this.f50488f;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    public final void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener != null) {
            adapterAdListener.onAdClicked();
        }
    }

    public final void onRewardedVideoAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdClosed();
        }
    }

    public final void onRewardedVideoAdEnded() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdEnded();
        }
    }

    public final void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdOpened();
        }
    }

    public final void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener instanceof AdapterAdRewardListener) {
            ((AdapterAdRewardListener) adapterAdListener).onAdRewarded();
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m50216a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onRewardedVideoAdStarted() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdStarted();
        }
    }

    public final void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdVisible();
        }
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m50216a("available = " + z));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener == null) {
            return;
        }
        if (z) {
            adapterAdListener.onAdLoadSuccess();
            return;
        }
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(this.f50486d.name(), this.f50485c.getProviderName(), "availability changed to false");
        this.f50489g.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, buildLoadFailedError.getErrorCode(), buildLoadFailedError.getErrorMessage());
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m50216a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.f50488f;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onRewardedVideoInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        NetworkInitializationListener networkInitializationListener = this.f50488f;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        AdapterErrorType adapterErrorType;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m50216a("error = " + ironSourceError));
        if (this.f50489g != null) {
            if (m50217b(ironSourceError)) {
                adapterErrorType = AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL;
            } else {
                IronSource.AD_UNIT ad_unit = this.f50486d;
                boolean z = false;
                if (ad_unit != IronSource.AD_UNIT.INTERSTITIAL) {
                    if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.error(m50216a("ad unit not supported - " + this.f50486d));
                    } else if (ironSourceError.getErrorCode() == 1057) {
                        z = true;
                    }
                }
                adapterErrorType = z ? AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            }
            this.f50489g.onAdLoadFailed(adapterErrorType, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(m50216a(""));
        AdapterAdListener adapterAdListener = this.f50489g;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadSuccess();
        }
    }

    public final void releaseMemory() {
        AbstractAdapter abstractAdapter = this.f50485c;
        if (abstractAdapter != null) {
            abstractAdapter.releaseMemory(this.f50486d, new JSONObject());
            this.f50485c = null;
        }
        this.f50488f = null;
        this.f50489g = null;
        C11312d dVar = this.f50487e;
        if (dVar != null) {
            dVar.mo44078a();
            this.f50487e = null;
        }
    }

    public final void setAdapterDebug(boolean z) {
        this.f50485c.setAdapterDebug(Boolean.valueOf(z));
    }

    public final void setConsent(boolean z) {
        this.f50485c.setConsent(z);
    }

    public final void showAd(AdData adData, Listener listener) {
        this.f50489g = listener;
        JSONObject a = C11361b.m50768a(adData.getConfiguration());
        try {
            IronSource.AD_UNIT ad_unit = this.f50486d;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                this.f50485c.showInterstitial(a, this);
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.f50485c.showRewardedVideo(a, this);
            } else {
                IronLog.INTERNAL.error(m50216a("ad unit not supported - " + this.f50486d));
            }
        } catch (Throwable th) {
            String str = "showAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m50216a(str));
            this.f50487e.f50816e.mo44112m(str);
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
        }
    }
}
