package com.google.ads.interactivemedia.p039v3.api;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p039v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p039v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.p039v3.impl.data.C3782av;
import com.google.ads.interactivemedia.p039v3.impl.data.C3783aw;
import com.google.ads.interactivemedia.p039v3.impl.data.C3807g;
import com.google.ads.interactivemedia.p039v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.p039v3.internal.C3908ci;
import com.google.ads.interactivemedia.p039v3.internal.C3920cu;
import com.google.ads.interactivemedia.p039v3.internal.C3927da;
import com.google.ads.interactivemedia.p039v3.internal.C3934dh;
import com.google.ads.interactivemedia.p039v3.internal.C3941do;
import com.google.ads.interactivemedia.p039v3.internal.C3942dp;
import com.google.ads.interactivemedia.p039v3.internal.C3977ex;
import com.google.ads.interactivemedia.p039v3.internal.C3979ez;
import com.google.ads.interactivemedia.p039v3.internal.C3990fj;
import com.google.ads.interactivemedia.p039v3.internal.ars;

/* renamed from: com.google.ads.interactivemedia.v3.api.ImaSdkFactory */
/* compiled from: IMASDK */
public class ImaSdkFactory {
    private static ImaSdkFactory instance;

    private ImaSdkFactory() {
    }

    private AdsLoader createAdsLoader(Context context, Uri uri, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, AdDisplayContainer adDisplayContainer) {
        C3920cu cuVar = new C3920cu(context, uri, imaSdkSettings, adDisplayContainer, testingConfiguration);
        cuVar.mo15642a();
        return cuVar;
    }

    @Deprecated
    public static VideoAdPlayer createSdkOwnedPlayer(Context context, ViewGroup viewGroup) {
        ars.m14627g(context);
        ars.m14627g(viewGroup);
        return new C3990fj(context, viewGroup);
    }

    public static ImaSdkFactory getInstance() {
        if (instance == null) {
            instance = new ImaSdkFactory();
        }
        return instance;
    }

    private Uri readJsCoreUri(ImaSdkSettings imaSdkSettings) {
        return (imaSdkSettings == null || !imaSdkSettings.isDebugMode()) ? C3941do.f16936a : C3941do.f16937b;
    }

    @Deprecated
    public AdDisplayContainer createAdDisplayContainer() {
        return new C3908ci((ViewGroup) null, (VideoAdPlayer) null);
    }

    public AdsRenderingSettings createAdsRenderingSettings() {
        return new C3807g();
    }

    public AdsRequest createAdsRequest() {
        return new C3927da();
    }

    @Deprecated
    public AdDisplayContainer createAudioAdDisplayContainer(Context context) {
        ars.m14627g(context);
        return new C3908ci(context, (VideoAdPlayer) null);
    }

    public CompanionAdSlot createCompanionAdSlot() {
        return new C3934dh();
    }

    public FriendlyObstruction createFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        C3782av builder = C3783aw.builder();
        builder.view(view);
        builder.purpose(friendlyObstructionPurpose);
        builder.detailedReason(str);
        return builder.build();
    }

    public ImaSdkSettings createImaSdkSettings() {
        return new C3942dp();
    }

    public StreamRequest createLiveStreamRequest(String str, String str2) {
        C3979ez ezVar = new C3979ez();
        ezVar.mo15758a(str);
        ezVar.mo15763f(str2);
        return ezVar;
    }

    public StreamRequest createPodStreamRequest(String str, String str2, String str3) {
        C3979ez ezVar = new C3979ez();
        ezVar.mo15761d(str);
        ezVar.mo15762e(str2);
        ezVar.mo15763f(str3);
        return ezVar;
    }

    @Deprecated
    public StreamDisplayContainer createStreamDisplayContainer() {
        return new C3977ex((ViewGroup) null, (VideoStreamPlayer) null);
    }

    public StreamRequest createVodStreamRequest(String str, String str2, String str3) {
        C3979ez ezVar = new C3979ez();
        ezVar.mo15759b(str);
        ezVar.mo15760c(str2);
        ezVar.mo15763f(str3);
        return ezVar;
    }

    public static AdDisplayContainer createAdDisplayContainer(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
        ars.m14627g(viewGroup);
        ars.m14627g(videoAdPlayer);
        return new C3908ci(viewGroup, videoAdPlayer);
    }

    public static StreamDisplayContainer createStreamDisplayContainer(ViewGroup viewGroup, VideoStreamPlayer videoStreamPlayer) {
        ars.m14627g(viewGroup);
        ars.m14627g(videoStreamPlayer);
        return new C3977ex(viewGroup, videoStreamPlayer);
    }

    private AdsLoader createAdsLoader(Context context, Uri uri, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, StreamDisplayContainer streamDisplayContainer) {
        C3920cu cuVar = new C3920cu(context, uri, imaSdkSettings, streamDisplayContainer, testingConfiguration);
        cuVar.mo15642a();
        return cuVar;
    }

    public static AdDisplayContainer createAudioAdDisplayContainer(Context context, VideoAdPlayer videoAdPlayer) {
        ars.m14627g(context);
        ars.m14627g(videoAdPlayer);
        return new C3908ci(context, videoAdPlayer);
    }

    public AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
        return new C3920cu(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, adDisplayContainer, (TestingConfiguration) null);
    }

    public AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, StreamDisplayContainer streamDisplayContainer) {
        return new C3920cu(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, streamDisplayContainer, (TestingConfiguration) null);
    }

    private AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, AdDisplayContainer adDisplayContainer) {
        return createAdsLoader(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, testingConfiguration, adDisplayContainer);
    }

    private AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, StreamDisplayContainer streamDisplayContainer) {
        return createAdsLoader(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, testingConfiguration, streamDisplayContainer);
    }
}
