package com.unity3d.services.ads.gmascar;

import com.google.android.gms.ads.AdActivity;
import com.unity3d.scar.adapter.common.C12485b;
import com.unity3d.scar.adapter.common.C12486c;
import com.unity3d.scar.adapter.common.C12489f;
import com.unity3d.scar.adapter.common.C12496l;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import java.util.ArrayDeque;
import java.util.Arrays;
import p322q7.C12866c;

public class GMAScarAdapterBridge {
    private final String SCAR_ACTIVITY_CLASS_NAME = AdActivity.CLASS_NAME;
    private AdapterStatusBridge _adapterStatusBridge = new AdapterStatusBridge();
    private GMAEventSender _gmaEventSender;
    private GMAInitializer _gmaInitializer;
    private InitializeListenerBridge _initializationListenerBridge = new InitializeListenerBridge();
    private InitializationStatusBridge _initializationStatusBridge = new InitializationStatusBridge();
    private MobileAdsBridge _mobileAdsBridge = new MobileAdsBridge();
    private PresenceDetector _presenceDetector = new PresenceDetector(this._mobileAdsBridge, this._initializationListenerBridge, this._initializationStatusBridge, this._adapterStatusBridge);
    private C12489f _scarAdapter;
    private ScarAdapterFactory _scarAdapterFactory = new ScarAdapterFactory();
    private ScarVersionFinder _scarVersionFinder;
    private WebViewErrorHandler _webViewErrorHandler = new WebViewErrorHandler();

    public GMAScarAdapterBridge() {
        GMAInitializer gMAInitializer = new GMAInitializer(this._mobileAdsBridge, this._initializationListenerBridge, this._initializationStatusBridge, this._adapterStatusBridge);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new ScarVersionFinder(this._mobileAdsBridge, this._presenceDetector, gMAInitializer);
        this._gmaEventSender = new GMAEventSender();
    }

    private C12489f getScarAdapterObject() {
        if (this._scarAdapter == null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(this._scarVersionFinder.getGoogleSdkVersionCode(), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer num) {
        return new EventSubject(AdActivity.CLASS_NAME, new ArrayDeque(Arrays.asList(new C12486c[]{C12486c.FIRST_QUARTILE, C12486c.MIDPOINT, C12486c.THIRD_QUARTILE, C12486c.LAST_QUARTILE})), num, new DefaultIntervalTimerFactory());
    }

    private void loadInterstitialAd(C12866c cVar) {
        this._scarAdapter.mo46900c(ClientProperties.getApplicationContext(), cVar, new ScarInterstitialAdHandler(cVar, getScarEventSubject(cVar.mo48012e())));
    }

    private void loadRewardedAd(C12866c cVar) {
        this._scarAdapter.mo46901d(ClientProperties.getApplicationContext(), cVar, new ScarRewardedAdHandler(cVar, getScarEventSubject(cVar.mo48012e())));
    }

    public void getSCARSignals(String[] strArr, String[] strArr2) {
        this._scarAdapter = getScarAdapterObject();
        SignalsHandler signalsHandler = new SignalsHandler();
        C12489f fVar = this._scarAdapter;
        if (fVar != null) {
            fVar.mo46898a(ClientProperties.getApplicationContext(), strArr, strArr2, signalsHandler);
        } else {
            this._webViewErrorHandler.handleError((C12496l) C12485b.m53826e("Could not create SCAR adapter object"));
        }
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public void initializeScar() {
        if (this._presenceDetector.areGMAClassesPresent()) {
            this._gmaEventSender.send(C12486c.SCAR_PRESENT, new Object[0]);
            this._gmaInitializer.initializeGMA();
            return;
        }
        this._webViewErrorHandler.handleError((C12496l) new C12485b(C12486c.SCAR_NOT_PRESENT, new Object[0]));
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z, String str, String str2, String str3, String str4, int i) {
        C12866c cVar = new C12866c(str, str2, str4, str3, Integer.valueOf(i));
        C12489f scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((C12496l) C12485b.m53824c(cVar, "Scar Adapter object is null"));
        } else if (z) {
            loadInterstitialAd(cVar);
        } else {
            loadRewardedAd(cVar);
        }
    }

    public void show(String str, String str2, boolean z) {
        C12866c cVar = new C12866c(str, str2);
        C12489f scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject != null) {
            scarAdapterObject.mo46899b(ClientProperties.getActivity(), str2, str);
        } else {
            this._webViewErrorHandler.handleError((C12496l) C12485b.m53825d(cVar, "Scar Adapter object is null"));
        }
    }
}
