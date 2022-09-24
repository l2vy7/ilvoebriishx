package com.appnext.banners;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.VideoView;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3180d;
import com.appnext.core.C3187f;
import com.appnext.core.C3198g;
import com.appnext.core.C3202i;
import com.appnext.core.C3204j;
import com.appnext.core.C3213q;
import com.appnext.core.ECPM;
import com.appnext.core.SettingsManager;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.appnext.core.p034a.C3167a;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.appnext.banners.a */
public class C3076a extends C3104e {
    private final int TICK = 330;
    /* access modifiers changed from: private */
    public BannerAdRequest adRequest;
    /* access modifiers changed from: private */
    public ArrayList<AppnextAd> ads;
    /* access modifiers changed from: private */
    public BannerAd bannerAd;
    private boolean clickEnabled = true;
    /* access modifiers changed from: private */
    public BannerAdData currentAd;
    /* access modifiers changed from: private */
    public int currentPosition = 0;
    /* access modifiers changed from: private */
    public boolean finished = false;
    private int lastProgress = 0;
    /* access modifiers changed from: private */
    public boolean loaded = false;
    /* access modifiers changed from: private */
    public Handler mHandler;
    /* access modifiers changed from: private */
    public MediaPlayer mediaPlayer;
    /* access modifiers changed from: private */
    public boolean reportedImpression = false;
    /* access modifiers changed from: private */
    public boolean started = false;
    /* access modifiers changed from: private */
    public String template = "";
    /* access modifiers changed from: private */
    public Runnable tick = new Runnable() {
        public final void run() {
            try {
                C3076a.this.checkProgress();
                C3076a aVar = C3076a.this;
                int unused = aVar.currentPosition = aVar.mediaPlayer.getCurrentPosition();
                if (C3076a.this.mediaPlayer.getCurrentPosition() < C3076a.this.mediaPlayer.getDuration() && !C3076a.this.finished) {
                    C3076a.this.mHandler.postDelayed(C3076a.this.tick, 330);
                }
            } catch (Throwable th) {
                C3117a.m10553a("BannerAdapter$Runnable", th);
            }
        }
    };
    /* access modifiers changed from: private */
    public C3213q userAction;
    /* access modifiers changed from: private */
    public boolean userMute = true;
    private VideoView videoView;

    /* access modifiers changed from: private */
    public void checkProgress() {
        try {
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 != null) {
                int currentPosition2 = (int) ((((float) mediaPlayer2.getCurrentPosition()) / ((float) this.mediaPlayer.getDuration())) * 100.0f);
                if (currentPosition2 > 25 && this.lastProgress == 0) {
                    this.lastProgress = 25;
                    report("video_25");
                } else if (currentPosition2 > 50 && this.lastProgress == 25) {
                    this.lastProgress = 50;
                    report("video_50");
                } else if (currentPosition2 > 75 && this.lastProgress == 50) {
                    this.lastProgress = 75;
                    report("video_75");
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdapter$checkProgress", th);
        }
    }

    private void createVideo(final ViewGroup viewGroup) {
        try {
            if (this.adRequest.isAutoPlay()) {
                report("auto_play_on");
            } else {
                report("auto_play_off");
            }
            if (this.adRequest.isMute()) {
                report("mute_on");
            } else {
                report("mute_off");
            }
            this.userMute = this.adRequest.isMute();
            int i = C3073R.C3075id.mute;
            ((ImageView) viewGroup.findViewById(i)).setImageResource(this.userMute ? C3073R.C3074drawable.apnxt_banner_unmute : C3073R.C3074drawable.apnxt_banner_mute);
            viewGroup.findViewById(i).setVisibility(0);
            viewGroup.findViewById(i).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C3076a aVar = C3076a.this;
                    boolean unused = aVar.userMute = !aVar.userMute;
                    if (C3076a.this.mediaPlayer != null) {
                        try {
                            MediaPlayer access$1000 = C3076a.this.mediaPlayer;
                            float f = 0.0f;
                            float f2 = C3076a.this.userMute ? 0.0f : 1.0f;
                            if (!C3076a.this.userMute) {
                                f = 1.0f;
                            }
                            access$1000.setVolume(f2, f);
                            ((ImageView) viewGroup.findViewById(C3073R.C3075id.mute)).setImageResource(C3076a.this.userMute ? C3073R.C3074drawable.apnxt_banner_unmute : C3073R.C3074drawable.apnxt_banner_mute);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            });
            this.videoView = new VideoView(this.context.getApplicationContext());
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdapter$createVideo", th);
            return;
        }
        this.videoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        viewGroup.addView(this.videoView, 0);
        viewGroup.findViewById(C3073R.C3075id.click).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (!C3076a.this.isClickEnabled() || C3076a.this.mediaPlayer == null || !C3076a.this.mediaPlayer.isPlaying()) {
                    ViewGroup viewGroup = viewGroup;
                    int i = C3073R.C3075id.play;
                    ((ImageView) viewGroup.findViewById(i)).setImageResource(C3073R.C3074drawable.apnxt_banner_pause);
                    viewGroup.findViewById(i).setVisibility(0);
                    C3076a.this.pause();
                    return;
                }
                C3076a.this.click();
            }
        });
        this.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public final void onPrepared(MediaPlayer mediaPlayer) {
                MediaPlayer unused = C3076a.this.mediaPlayer = mediaPlayer;
                C3076a.this.mediaPlayer.seekTo(C3076a.this.currentPosition);
                C3076a.this.mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() {
                    public final void onSeekComplete(MediaPlayer mediaPlayer) {
                        if (C3076a.this.adRequest.isAutoPlay() && !C3076a.this.finished) {
                            C3076a aVar = C3076a.this;
                            if (aVar.getVisiblePercent(aVar.rootView) > 90 && !C3076a.this.mediaPlayer.isPlaying()) {
                                C3076a.this.play();
                                try {
                                    C3076a.this.rootView.findViewById(C3073R.C3075id.media).findViewById(C3073R.C3075id.play).setVisibility(8);
                                } catch (Throwable th) {
                                    C3117a.m10553a("BannerAdapter$createVideo", th);
                                }
                                if (!C3076a.this.started) {
                                    C3076a.this.report("video_started");
                                    boolean unused = C3076a.this.started = true;
                                }
                            }
                        }
                    }
                });
                if (C3076a.this.adRequest.isAutoPlay() && !C3076a.this.finished) {
                    C3076a aVar = C3076a.this;
                    if (aVar.getVisiblePercent(aVar.rootView) > 90) {
                        C3076a.this.play();
                        try {
                            C3076a.this.rootView.findViewById(C3073R.C3075id.media).findViewById(C3073R.C3075id.play).setVisibility(8);
                        } catch (Throwable th) {
                            C3117a.m10553a("BannerAdapter$createVideo", th);
                        }
                        if (!C3076a.this.started) {
                            C3076a.this.report("video_started");
                            boolean unused2 = C3076a.this.started = true;
                        }
                    }
                }
                C3076a.this.mHandler.postDelayed(C3076a.this.tick, 33);
                if (C3076a.this.userMute) {
                    C3076a.this.mediaPlayer.setVolume(0.0f, 0.0f);
                } else {
                    C3076a.this.mediaPlayer.setVolume(1.0f, 1.0f);
                }
            }
        });
        this.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public final void onCompletion(MediaPlayer mediaPlayer) {
                if (C3076a.this.mediaPlayer != null && C3076a.this.mediaPlayer.getCurrentPosition() != 0 && C3076a.this.mediaPlayer.getDuration() != 0 && !C3076a.this.finished) {
                    C3076a.this.mediaPlayer.getCurrentPosition();
                    C3076a.this.mediaPlayer.getDuration();
                    boolean unused = C3076a.this.finished = true;
                    C3076a.this.report("video_ended");
                }
            }
        });
        this.videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return true;
            }
        });
        this.videoView.setVideoURI(Uri.parse(getVideoUrl(getSelectedAd(), this.adRequest.getVideoLength())));
        int i2 = C3073R.C3075id.play;
        viewGroup.findViewById(i2).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                viewGroup.findViewById(C3073R.C3075id.wide_image).setVisibility(8);
                viewGroup.findViewById(C3073R.C3075id.play).setVisibility(8);
                C3076a.this.play();
            }
        });
        if (!this.adRequest.isAutoPlay()) {
            viewGroup.findViewById(i2).setVisibility(0);
            C3204j.m10808ax().mo10810a(this.context, (ImageView) viewGroup.findViewById(C3073R.C3075id.wide_image), getSelectedAd().getWideImageURL(), (C3204j.C3206a) null);
        }
    }

    private void createWideImage(ImageView imageView) {
        report("static_creative");
        C3204j.m10808ax().mo10810a(this.context, imageView, getSelectedAd().getWideImageURL(), (C3204j.C3206a) null);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C3076a.this.report("banner_click_else");
                C3076a.this.click();
            }
        });
    }

    /* access modifiers changed from: private */
    public void load() {
        try {
            if (this.adRequest != null) {
                C3101b.m10528H().mo10504a(this.context, (C3148Ad) this.bannerAd, getPlacementId(), (C3180d.C3185a) new C3180d.C3185a() {
                    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
                    /* JADX WARNING: Removed duplicated region for block: B:45:0x011e A[Catch:{ all -> 0x007e, all -> 0x01a0 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:50:0x012b A[Catch:{ all -> 0x007e, all -> 0x01a0 }] */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final <T> void mo10220a(T r14) {
                        /*
                            r13 = this;
                            java.lang.String r0 = "BannerAdapter$load"
                            com.appnext.banners.a r1 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerAdRequest r1 = r1.adRequest     // Catch:{ all -> 0x01a0 }
                            if (r1 != 0) goto L_0x000b
                            return
                        L_0x000b:
                            com.appnext.banners.b r1 = com.appnext.banners.C3101b.m10528H()     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.a r2 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            android.content.Context r3 = r2.context     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerAd r2 = r2.bannerAd     // Catch:{ all -> 0x01a0 }
                            r4 = r14
                            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.a r5 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerAdRequest r5 = r5.adRequest     // Catch:{ all -> 0x01a0 }
                            java.lang.String r5 = r5.getCreativeType()     // Catch:{ all -> 0x01a0 }
                            com.appnext.core.AppnextAd r1 = r1.mo10502a((android.content.Context) r3, (com.appnext.core.C3148Ad) r2, (java.util.ArrayList<?>) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01a0 }
                            if (r1 != 0) goto L_0x004a
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            java.lang.String r1 = "error_no_ads"
                            r14.report(r1)     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerListener r14 = r14.getBannerListener()     // Catch:{ all -> 0x01a0 }
                            if (r14 == 0) goto L_0x0049
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerListener r14 = r14.getBannerListener()     // Catch:{ all -> 0x01a0 }
                            com.appnext.core.AppnextError r1 = new com.appnext.core.AppnextError     // Catch:{ all -> 0x01a0 }
                            java.lang.String r2 = "No Ads"
                            r1.<init>(r2)     // Catch:{ all -> 0x01a0 }
                            r14.onError(r1)     // Catch:{ all -> 0x01a0 }
                        L_0x0049:
                            return
                        L_0x004a:
                            com.appnext.banners.a r2 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            android.view.ViewGroup r3 = r2.rootView     // Catch:{ all -> 0x01a0 }
                            if (r3 != 0) goto L_0x0051
                            return
                        L_0x0051:
                            android.content.Context r4 = r2.context     // Catch:{ all -> 0x01a0 }
                            if (r4 != 0) goto L_0x0059
                            r3.removeAllViews()     // Catch:{ all -> 0x01a0 }
                            return
                        L_0x0059:
                            java.util.ArrayList r2 = r2.ads     // Catch:{ all -> 0x007e }
                            if (r2 != 0) goto L_0x0069
                            com.appnext.banners.a r2 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x007e }
                            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x007e }
                            r3.<init>()     // Catch:{ all -> 0x007e }
                            java.util.ArrayList unused = r2.ads = r3     // Catch:{ all -> 0x007e }
                        L_0x0069:
                            com.appnext.banners.a r2 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x007e }
                            java.util.ArrayList r2 = r2.ads     // Catch:{ all -> 0x007e }
                            r2.clear()     // Catch:{ all -> 0x007e }
                            com.appnext.banners.a r2 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x007e }
                            java.util.ArrayList r2 = r2.ads     // Catch:{ all -> 0x007e }
                            java.util.ArrayList r14 = (java.util.ArrayList) r14     // Catch:{ all -> 0x007e }
                            r2.addAll(r14)     // Catch:{ all -> 0x007e }
                            goto L_0x0082
                        L_0x007e:
                            r14 = move-exception
                            com.appnext.base.C3117a.m10553a(r0, r14)     // Catch:{ all -> 0x01a0 }
                        L_0x0082:
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerAdData r2 = new com.appnext.banners.BannerAdData     // Catch:{ all -> 0x01a0 }
                            r2.<init>(r1)     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerAdData unused = r14.currentAd = r2     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.d r14 = com.appnext.banners.C3103d.m10544I()     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.a r2 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerSize r2 = r2.getBannerSize()     // Catch:{ all -> 0x01a0 }
                            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a0 }
                            java.lang.String r14 = r14.mo10732y(r2)     // Catch:{ all -> 0x01a0 }
                            java.lang.String r14 = com.appnext.banners.C3115g.m10549a(r14)     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.a r2 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a0 }
                            java.lang.String r4 = "apnxt_"
                            r3.<init>(r4)     // Catch:{ all -> 0x01a0 }
                            r3.append(r14)     // Catch:{ all -> 0x01a0 }
                            java.lang.String r14 = r3.toString()     // Catch:{ all -> 0x01a0 }
                            java.lang.String r14 = r14.toLowerCase()     // Catch:{ all -> 0x01a0 }
                            java.lang.String unused = r2.template = r14     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            android.view.ViewGroup r14 = r14.rootView     // Catch:{ all -> 0x01a0 }
                            android.content.Context r14 = r14.getContext()     // Catch:{ all -> 0x01a0 }
                            android.content.res.Resources r14 = r14.getResources()     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.a r2 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            java.lang.String r2 = r2.template     // Catch:{ all -> 0x01a0 }
                            java.lang.String r3 = "layout"
                            com.appnext.banners.a r4 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            android.content.Context r4 = r4.context     // Catch:{ all -> 0x01a0 }
                            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x01a0 }
                            int r14 = r14.getIdentifier(r2, r3, r4)     // Catch:{ all -> 0x01a0 }
                            java.lang.String r2 = "BANNER"
                            java.lang.String r3 = "MEDIUM_RECTANGLE"
                            java.lang.String r4 = "LARGE_BANNER"
                            r5 = 1951953708(0x7458732c, float:6.859571E31)
                            r6 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
                            r7 = -1966536496(0xffffffff8ac908d0, float:-1.9358911E-32)
                            r8 = -1
                            r9 = 0
                            r10 = 2
                            r11 = 1
                            if (r14 != 0) goto L_0x012d
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerSize r14 = r14.getBannerSize()     // Catch:{ all -> 0x01a0 }
                            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x01a0 }
                            int r12 = r14.hashCode()     // Catch:{ all -> 0x01a0 }
                            if (r12 == r7) goto L_0x0113
                            if (r12 == r6) goto L_0x010b
                            if (r12 == r5) goto L_0x0103
                            goto L_0x011b
                        L_0x0103:
                            boolean r14 = r14.equals(r2)     // Catch:{ all -> 0x01a0 }
                            if (r14 == 0) goto L_0x011b
                            r14 = 0
                            goto L_0x011c
                        L_0x010b:
                            boolean r14 = r14.equals(r3)     // Catch:{ all -> 0x01a0 }
                            if (r14 == 0) goto L_0x011b
                            r14 = 2
                            goto L_0x011c
                        L_0x0113:
                            boolean r14 = r14.equals(r4)     // Catch:{ all -> 0x01a0 }
                            if (r14 == 0) goto L_0x011b
                            r14 = 1
                            goto L_0x011c
                        L_0x011b:
                            r14 = -1
                        L_0x011c:
                            if (r14 == 0) goto L_0x012b
                            if (r14 == r11) goto L_0x0128
                            if (r14 == r10) goto L_0x0125
                            int r14 = com.appnext.banners.C3073R.layout.apnxt_banner_1     // Catch:{ all -> 0x01a0 }
                            goto L_0x012d
                        L_0x0125:
                            int r14 = com.appnext.banners.C3073R.layout.apnxt_medium_rectangle_1     // Catch:{ all -> 0x01a0 }
                            goto L_0x012d
                        L_0x0128:
                            int r14 = com.appnext.banners.C3073R.layout.apnxt_large_banner_1     // Catch:{ all -> 0x01a0 }
                            goto L_0x012d
                        L_0x012b:
                            int r14 = com.appnext.banners.C3073R.layout.apnxt_banner_1     // Catch:{ all -> 0x01a0 }
                        L_0x012d:
                            com.appnext.banners.a r12 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            boolean unused = r12.loaded = r11     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.a r12 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            boolean unused = r12.reportedImpression = r9     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.a r12 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            r12.inflateView(r14, r1)     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerListener r14 = r14.getBannerListener()     // Catch:{ all -> 0x01a0 }
                            if (r14 == 0) goto L_0x0155
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerListener r14 = r14.getBannerListener()     // Catch:{ all -> 0x01a0 }
                            java.lang.String r12 = r1.getBannerID()     // Catch:{ all -> 0x01a0 }
                            com.appnext.core.AppnextAdCreativeType r1 = r1.getCreativeType()     // Catch:{ all -> 0x01a0 }
                            r14.onAdLoaded(r12, r1)     // Catch:{ all -> 0x01a0 }
                        L_0x0155:
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            com.appnext.banners.BannerSize r14 = r14.getBannerSize()     // Catch:{ all -> 0x01a0 }
                            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x01a0 }
                            int r1 = r14.hashCode()     // Catch:{ all -> 0x01a0 }
                            if (r1 == r7) goto L_0x017a
                            if (r1 == r6) goto L_0x0172
                            if (r1 == r5) goto L_0x016a
                            goto L_0x0181
                        L_0x016a:
                            boolean r14 = r14.equals(r2)     // Catch:{ all -> 0x01a0 }
                            if (r14 == 0) goto L_0x0181
                            r8 = 0
                            goto L_0x0181
                        L_0x0172:
                            boolean r14 = r14.equals(r3)     // Catch:{ all -> 0x01a0 }
                            if (r14 == 0) goto L_0x0181
                            r8 = 2
                            goto L_0x0181
                        L_0x017a:
                            boolean r14 = r14.equals(r4)     // Catch:{ all -> 0x01a0 }
                            if (r14 == 0) goto L_0x0181
                            r8 = 1
                        L_0x0181:
                            if (r8 == 0) goto L_0x0198
                            if (r8 == r11) goto L_0x0190
                            if (r8 == r10) goto L_0x0188
                            goto L_0x018f
                        L_0x0188:
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            java.lang.String r1 = "loaded_medium_rectangle"
                            r14.report(r1)     // Catch:{ all -> 0x01a0 }
                        L_0x018f:
                            return
                        L_0x0190:
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            java.lang.String r1 = "loaded_large_banner"
                            r14.report(r1)     // Catch:{ all -> 0x01a0 }
                            goto L_0x01a4
                        L_0x0198:
                            com.appnext.banners.a r14 = com.appnext.banners.C3076a.this     // Catch:{ all -> 0x01a0 }
                            java.lang.String r1 = "loaded_banner"
                            r14.report(r1)     // Catch:{ all -> 0x01a0 }
                            goto L_0x01a4
                        L_0x01a0:
                            r14 = move-exception
                            com.appnext.base.C3117a.m10553a(r0, r14)
                        L_0x01a4:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C3076a.C308617.mo10220a(java.lang.Object):void");
                    }

                    public final void error(String str) {
                        String str2 = "";
                        char c = 65535;
                        try {
                            switch (str.hashCode()) {
                                case -2026653947:
                                    if (str.equals(AppnextError.INTERNAL_ERROR)) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case -1958363695:
                                    if (str.equals(AppnextError.NO_ADS)) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case -1477010874:
                                    if (str.equals(AppnextError.CONNECTION_ERROR)) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case -507110949:
                                    if (str.equals(AppnextError.NO_MARKET)) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case 350741825:
                                    if (str.equals(AppnextError.TIMEOUT)) {
                                        c = 5;
                                        break;
                                    }
                                    break;
                                case 844170097:
                                    if (str.equals(AppnextError.SLOW_CONNECTION)) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                            }
                            if (c == 0) {
                                str2 = "error_connection_error";
                            } else if (c == 1) {
                                str2 = "error_internal_error";
                            } else if (c == 2) {
                                str2 = "error_no_ads";
                            } else if (c == 3) {
                                str2 = "error_no_market";
                            } else if (c == 4) {
                                str2 = "error_slow_connection";
                            } else if (c == 5) {
                                str2 = "error_timeout";
                            }
                            C3076a.this.report(str2);
                            if (C3076a.this.getBannerListener() != null) {
                                C3076a.this.getBannerListener().onError(new AppnextError(str));
                            }
                        } catch (Throwable th) {
                            C3117a.m10553a("BannerAdapter$load", th);
                        }
                    }
                }, this.adRequest);
            }
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdapter$load", th);
        }
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        try {
            BannerAd bannerAd2 = this.bannerAd;
            if (bannerAd2 != null) {
                Context context = this.context;
                String tid = bannerAd2.getTID();
                String vid = this.bannerAd.getVID();
                String auid = this.bannerAd.getAUID();
                String str2 = "";
                String placementId = getPlacementId() == null ? str2 : getPlacementId();
                String sessionId = this.bannerAd.getSessionId();
                String str3 = this.template;
                String bannerID = getSelectedAd() != null ? getSelectedAd().getBannerID() : str2;
                if (getSelectedAd() != null) {
                    str2 = getSelectedAd().getCampaignID();
                }
                C3198g.m10781a(context, tid, vid, auid, placementId, sessionId, str, str3, bannerID, str2);
            }
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdapter$report", th);
        }
    }

    public void click() {
        report("click_event");
        if (getBannerListener() != null) {
            getBannerListener().onAdClicked();
        }
        this.userAction.mo10823a(getSelectedAd(), getSelectedAd().getAppURL(), getPlacementId(), new C3187f.C3196a() {
            public final void error(String str) {
            }

            public final void onMarket(String str) {
                try {
                    if (C3076a.this.mediaPlayer != null && C3076a.this.mediaPlayer.isPlaying()) {
                        C3076a.this.pause();
                        ViewGroup viewGroup = C3076a.this.rootView;
                        int i = C3073R.C3075id.media;
                        View findViewById = viewGroup.findViewById(i);
                        int i2 = C3073R.C3075id.play;
                        ((ImageView) findViewById.findViewById(i2)).setImageResource(C3073R.C3074drawable.apnxt_banner_pause);
                        C3076a.this.rootView.findViewById(i).findViewById(i2).setVisibility(0);
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("BannerAdapter$click", th);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public C3148Ad createAd(Context context, String str) {
        try {
            String bannerSize = getBannerSize().toString();
            char c = 65535;
            int hashCode = bannerSize.hashCode();
            if (hashCode != -1966536496) {
                if (hashCode != -96588539) {
                    if (hashCode == 1951953708) {
                        if (bannerSize.equals(AdPreferences.TYPE_BANNER)) {
                            c = 0;
                        }
                    }
                } else if (bannerSize.equals("MEDIUM_RECTANGLE")) {
                    c = 2;
                }
            } else if (bannerSize.equals("LARGE_BANNER")) {
                c = 1;
            }
            if (c == 0) {
                return new SmallBannerAd(context, str);
            }
            if (c == 1) {
                return new LargeBannerAd(context, str);
            }
            if (c != 2) {
                return new SmallBannerAd(context, str);
            }
            return new MediumRectangleAd(context, str);
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdapter$createAd", th);
        }
    }

    public void destroy() {
        super.destroy();
        try {
            C3213q qVar = this.userAction;
            if (qVar != null) {
                qVar.destroy();
            }
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdapter$destroy", th);
        }
        try {
            VideoView videoView2 = this.videoView;
            if (videoView2 != null) {
                videoView2.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                this.videoView.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                this.videoView.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                this.videoView.suspend();
                this.videoView = null;
                this.mediaPlayer.release();
                this.mediaPlayer = null;
            }
        } catch (Throwable th2) {
            C3117a.m10553a("BannerAdapter$destroy", th2);
        }
        try {
            BannerAd bannerAd2 = this.bannerAd;
            if (bannerAd2 != null) {
                bannerAd2.destroy();
                this.bannerAd = null;
            }
        } catch (Throwable th3) {
            C3117a.m10553a("BannerAdapter$destroy", th3);
        }
        this.adRequest = null;
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
        } catch (Throwable th4) {
            C3117a.m10553a("BannerAdapter$destroy", th4);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    /* access modifiers changed from: protected */
    public BannerAdRequest getAdRequest() {
        return this.adRequest;
    }

    /* access modifiers changed from: protected */
    public ArrayList<AppnextAd> getAds() {
        return this.ads;
    }

    /* access modifiers changed from: protected */
    public BannerAd getBannerAd() {
        return this.bannerAd;
    }

    /* access modifiers changed from: protected */
    public String getButtonText(AppnextAd appnextAd) {
        try {
            String buttonText = new BannerAdData(appnextAd).getButtonText();
            boolean b = C3198g.m10789b(this.context, getSelectedAd().getAdPackage());
            String str = "existing";
            if (appnextAd != null) {
                if (buttonText.equals("")) {
                    if (b) {
                        return C3167a.m10684q(this.context.getApplicationContext()).mo10749a(getLanguage(), str, C3103d.m10544I().mo10732y("existing_button_text"));
                    }
                    return C3167a.m10684q(this.context.getApplicationContext()).mo10749a(getLanguage(), "new", C3103d.m10544I().mo10732y("new_button_text"));
                }
            }
            C3167a q = C3167a.m10684q(this.context.getApplicationContext());
            String language = getLanguage();
            if (!b) {
                str = "new";
            }
            return q.mo10749a(language, str, buttonText);
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdapter$getButtonText", th);
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public int getCreativeType(AppnextAd appnextAd) {
        try {
            return this.adRequest.getCreativeType().equals("all") ? C3101b.hasVideo(appnextAd) ? 0 : 1 : (!this.adRequest.getCreativeType().equals("video") || !C3101b.hasVideo(appnextAd)) ? 1 : 0;
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdapter$getCreativeType", th);
            return 0;
        }
    }

    public void getECPM(final BannerAdRequest bannerAdRequest, final OnECPMLoaded onECPMLoaded) {
        if (bannerAdRequest != null) {
            try {
                if (getPlacementId() == null) {
                    throw new IllegalStateException("Missing placement id.");
                } else if (getBannerSize() == null) {
                    throw new IllegalStateException("Missing banner size.");
                } else if (onECPMLoaded != null) {
                    if (this.bannerAd == null) {
                        this.bannerAd = (BannerAd) createAd(this.context, getPlacementId());
                    }
                    this.bannerAd.setCategories(bannerAdRequest.getCategories());
                    this.bannerAd.setSpecificCategories(bannerAdRequest.getSpecificCategories());
                    this.bannerAd.setPostback(bannerAdRequest.getPostback());
                    C3101b.m10528H().mo10504a(this.context, (C3148Ad) this.bannerAd, getPlacementId(), (C3180d.C3185a) new C3180d.C3185a() {
                        /* renamed from: a */
                        public final <T> void mo10220a(T t) {
                            C3101b H = C3101b.m10528H();
                            C3076a aVar = C3076a.this;
                            AppnextAd a = H.mo10501a(aVar.context, (C3148Ad) aVar.bannerAd, bannerAdRequest.getCreativeType());
                            if (a == null) {
                                C3076a.this.report("error_no_ads");
                                OnECPMLoaded onECPMLoaded = onECPMLoaded;
                                if (onECPMLoaded != null) {
                                    onECPMLoaded.error(AppnextError.NO_ADS);
                                    return;
                                }
                                return;
                            }
                            OnECPMLoaded onECPMLoaded2 = onECPMLoaded;
                            if (onECPMLoaded2 != null) {
                                onECPMLoaded2.ecpm(new ECPM(a.getECPM(), a.getPPR(), a.getBannerID()));
                            }
                        }

                        public final void error(String str) {
                            OnECPMLoaded onECPMLoaded = onECPMLoaded;
                            if (onECPMLoaded != null) {
                                onECPMLoaded.error(str);
                            }
                        }
                    }, bannerAdRequest);
                } else {
                    throw new IllegalStateException("callback cannot be null.");
                }
            } catch (Throwable th) {
                C3117a.m10553a("BannerAdapter$load", th);
            }
        } else {
            throw new IllegalStateException("BannerAdRequest cannot be null.");
        }
    }

    /* access modifiers changed from: protected */
    public BannerAdData getSelectedAd() {
        return this.currentAd;
    }

    /* access modifiers changed from: protected */
    public C3213q getUserAction() {
        return this.userAction;
    }

    /* access modifiers changed from: protected */
    public String getVideoUrl(AppnextAd appnextAd, String str) {
        if (str.equals("30")) {
            String videoUrl30Sec = appnextAd.getVideoUrl30Sec();
            if (videoUrl30Sec.equals("")) {
                videoUrl30Sec = appnextAd.getVideoUrl();
            }
            if (videoUrl30Sec.equals("")) {
                videoUrl30Sec = appnextAd.getVideoUrlHigh30Sec();
            }
            if (videoUrl30Sec.equals("")) {
                return appnextAd.getVideoUrlHigh();
            }
            return videoUrl30Sec;
        }
        String videoUrl = appnextAd.getVideoUrl();
        if (videoUrl.equals("")) {
            videoUrl = appnextAd.getVideoUrl30Sec();
        }
        if (videoUrl.equals("")) {
            videoUrl = appnextAd.getVideoUrlHigh();
        }
        return videoUrl.equals("") ? appnextAd.getVideoUrlHigh30Sec() : videoUrl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (getSelectedAd() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r4.mHandler.postDelayed(new com.appnext.banners.C3076a.C30965(r4), (long) (java.lang.Integer.parseInt(com.appnext.banners.C3103d.m10544I().mo10732y("postpone_impression_sec")) * 1000));
        report("impression_event");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (java.lang.Boolean.parseBoolean(com.appnext.banners.C3103d.m10544I().mo10732y("pview")) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        r4.mHandler.postDelayed(new com.appnext.banners.C3076a.C30976(r4), (long) (java.lang.Integer.parseInt(com.appnext.banners.C3103d.m10544I().mo10732y("postpone_vta_sec")) * 1000));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        if (getBannerListener() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        getBannerListener().adImpression();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void impression() {
        /*
            r4 = this;
            monitor-enter(r4)     // Catch:{ all -> 0x0082 }
            boolean r0 = r4.loaded     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x007d
            boolean r0 = r4.reportedImpression     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x007d
            com.appnext.core.q r0 = r4.userAction     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x000e
            goto L_0x007d
        L_0x000e:
            r0 = 1
            r4.reportedImpression = r0     // Catch:{ all -> 0x007f }
            com.appnext.core.o r0 = com.appnext.core.C3211o.m10825az()     // Catch:{ all -> 0x007f }
            com.appnext.banners.a$4 r1 = new com.appnext.banners.a$4     // Catch:{ all -> 0x007f }
            r1.<init>()     // Catch:{ all -> 0x007f }
            r0.mo10821a(r1)     // Catch:{ all -> 0x007f }
            monitor-exit(r4)     // Catch:{ all -> 0x007f }
            com.appnext.banners.BannerAdData r0 = r4.getSelectedAd()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x007c
            android.os.Handler r0 = r4.mHandler     // Catch:{ all -> 0x0082 }
            com.appnext.banners.a$5 r1 = new com.appnext.banners.a$5     // Catch:{ all -> 0x0082 }
            r1.<init>()     // Catch:{ all -> 0x0082 }
            com.appnext.banners.d r2 = com.appnext.banners.C3103d.m10544I()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "postpone_impression_sec"
            java.lang.String r2 = r2.mo10732y(r3)     // Catch:{ all -> 0x0082 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0082 }
            int r2 = r2 * 1000
            long r2 = (long) r2     // Catch:{ all -> 0x0082 }
            r0.postDelayed(r1, r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "impression_event"
            r4.report(r0)     // Catch:{ all -> 0x0082 }
            com.appnext.banners.d r0 = com.appnext.banners.C3103d.m10544I()     // Catch:{ all -> 0x0082 }
            java.lang.String r1 = "pview"
            java.lang.String r0 = r0.mo10732y(r1)     // Catch:{ all -> 0x0082 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x006f
            android.os.Handler r0 = r4.mHandler     // Catch:{ all -> 0x0082 }
            com.appnext.banners.a$6 r1 = new com.appnext.banners.a$6     // Catch:{ all -> 0x0082 }
            r1.<init>()     // Catch:{ all -> 0x0082 }
            com.appnext.banners.d r2 = com.appnext.banners.C3103d.m10544I()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "postpone_vta_sec"
            java.lang.String r2 = r2.mo10732y(r3)     // Catch:{ all -> 0x0082 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0082 }
            int r2 = r2 * 1000
            long r2 = (long) r2     // Catch:{ all -> 0x0082 }
            r0.postDelayed(r1, r2)     // Catch:{ all -> 0x0082 }
        L_0x006f:
            com.appnext.banners.BannerListener r0 = r4.getBannerListener()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x007c
            com.appnext.banners.BannerListener r0 = r4.getBannerListener()     // Catch:{ all -> 0x0082 }
            r0.adImpression()     // Catch:{ all -> 0x0082 }
        L_0x007c:
            return
        L_0x007d:
            monitor-exit(r4)     // Catch:{ all -> 0x007f }
            return
        L_0x007f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            java.lang.String r1 = "BannerAdapter$impression"
            com.appnext.base.C3117a.m10553a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C3076a.impression():void");
    }

    /* access modifiers changed from: protected */
    public void inflateView(int i, final AppnextAd appnextAd) {
        View inflate;
        RatingBar ratingBar;
        try {
            inflate = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(i, this.rootView, false);
            inflate.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C3076a.this.report("banner_click_else");
                    C3076a.this.click();
                }
            });
            ImageView imageView = (ImageView) inflate.findViewById(C3073R.C3075id.icon);
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        C3076a.this.report("banner_click_icon");
                        C3076a.this.click();
                    }
                });
                C3204j.m10808ax().mo10810a(this.context, imageView, appnextAd.getImageURL(), (C3204j.C3206a) null);
            }
            TextView textView = (TextView) inflate.findViewById(C3073R.C3075id.title);
            if (textView != null) {
                textView.setText(appnextAd.getAdTitle());
                textView.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        C3076a.this.report("banner_click_else");
                        C3076a.this.click();
                    }
                });
            }
            ratingBar = (RatingBar) inflate.findViewById(C3073R.C3075id.ratingBar);
            if (ratingBar != null) {
                ratingBar.setRating(Float.parseFloat(appnextAd.getStoreRating()));
                ratingBar.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        C3076a.this.report("banner_click_else");
                        C3076a.this.click();
                    }
                });
            }
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdapter$inflateView", th);
            return;
        }
        TextView textView2 = (TextView) inflate.findViewById(C3073R.C3075id.description);
        if (textView2 != null) {
            textView2.setText(appnextAd.getAdDescription());
            textView2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C3076a.this.report("banner_click_else");
                    C3076a.this.click();
                }
            });
        }
        View findViewById = inflate.findViewById(C3073R.C3075id.install);
        ((TextView) findViewById).setText(getButtonText(appnextAd));
        findViewById.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C3076a.this.report("banner_click_cta");
                C3076a.this.click();
            }
        });
        View findViewById2 = inflate.findViewById(C3073R.C3075id.media);
        if (findViewById2 != null) {
            if (getCreativeType(appnextAd) != 0) {
                createWideImage((ImageView) inflate.findViewById(C3073R.C3075id.wide_image));
            } else {
                createVideo((ViewGroup) findViewById2);
            }
        }
        ImageView imageView2 = (ImageView) inflate.findViewById(C3073R.C3075id.privacy);
        imageView2.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C3076a.this.openLink(C3198g.m10793e(appnextAd));
            }
        });
        if (C3202i.m10805a(appnextAd, (SettingsManager) C3103d.m10544I())) {
            C3202i.m10804a(this.context, imageView2);
        }
        ViewGroup viewGroup = this.rootView;
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            this.rootView.removeViewAt(0);
        }
        this.rootView.addView(inflate);
    }

    public void init(ViewGroup viewGroup) {
        super.init(viewGroup);
        this.userAction = new C3213q(this.context, new C3213q.C3217a() {
            /* renamed from: c */
            public final C3148Ad mo10141c() {
                return C3076a.this.bannerAd;
            }

            /* renamed from: d */
            public final AppnextAd mo10142d() {
                return C3076a.this.getSelectedAd();
            }

            /* renamed from: e */
            public final SettingsManager mo10143e() {
                return C3103d.m10544I();
            }

            public final void report(String str) {
                C3076a.this.report(str);
            }
        });
        this.mHandler = new Handler();
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    /* access modifiers changed from: protected */
    public boolean isReportedImpression() {
        return this.reportedImpression;
    }

    public void loadAd(BannerAdRequest bannerAdRequest) {
        try {
            if (!C3198g.m10800k(this.context)) {
                BannerListener bannerListener = getBannerListener();
                if (bannerListener != null) {
                    bannerListener.onError(new AppnextError(AppnextError.CONNECTION_ERROR));
                }
            } else if (bannerAdRequest == null) {
                throw new IllegalStateException("BannerAdRequest cannot be null.");
            } else if (getPlacementId() == null) {
                throw new IllegalStateException("Missing placement id.");
            } else if (getBannerSize() != null) {
                if (this.bannerAd == null) {
                    this.bannerAd = (BannerAd) createAd(this.context, getPlacementId());
                }
                this.bannerAd.setCategories(bannerAdRequest.getCategories());
                this.bannerAd.setSpecificCategories(bannerAdRequest.getSpecificCategories());
                this.bannerAd.setPostback(bannerAdRequest.getPostback());
                this.adRequest = new BannerAdRequest(bannerAdRequest);
                setClickEnabled(bannerAdRequest.isClickEnabled());
                this.loaded = false;
                this.reportedImpression = false;
                if (C3198g.m10802v(C3198g.m10795g(this.context)) == 0) {
                    this.adRequest.setCreativeType("static");
                }
                C3103d.m10544I().mo10728a(this.context, getPlacementId(), new SettingsManager.ConfigCallback() {
                    public final void error(String str) {
                        C3076a.this.load();
                    }

                    public final void loaded(HashMap<String, Object> hashMap) {
                        C3076a.this.load();
                    }
                });
            } else {
                throw new IllegalStateException("Missing banner size.");
            }
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdapter$loadAd", th);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollChanged(int r4) {
        /*
            r3 = this;
            android.media.MediaPlayer r0 = r3.mediaPlayer     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0065
            boolean r1 = r3.finished     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x0065
            boolean r0 = r0.isPlaying()     // Catch:{ all -> 0x0066 }
            r1 = 90
            if (r0 == 0) goto L_0x0027
            if (r4 >= r1) goto L_0x0027
            android.view.ViewGroup r0 = r3.rootView     // Catch:{ all -> 0x0024 }
            int r2 = com.appnext.banners.C3073R.C3075id.media     // Catch:{ all -> 0x0024 }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ all -> 0x0024 }
            int r2 = com.appnext.banners.C3073R.C3075id.play     // Catch:{ all -> 0x0024 }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ all -> 0x0024 }
            r2 = 0
            r0.setVisibility(r2)     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r3.pause()     // Catch:{ all -> 0x0066 }
        L_0x0027:
            android.media.MediaPlayer r0 = r3.mediaPlayer     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isPlaying()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0065
            if (r4 <= r1) goto L_0x0065
            com.appnext.banners.BannerAdRequest r4 = r3.adRequest     // Catch:{ all -> 0x0066 }
            boolean r4 = r4.isAutoPlay()     // Catch:{ all -> 0x0066 }
            if (r4 == 0) goto L_0x0065
            android.media.MediaPlayer r4 = r3.mediaPlayer     // Catch:{ all -> 0x0066 }
            r4.getCurrentPosition()     // Catch:{ all -> 0x0066 }
            android.media.MediaPlayer r4 = r3.mediaPlayer     // Catch:{ all -> 0x0066 }
            r4.getDuration()     // Catch:{ all -> 0x0066 }
            r3.play()     // Catch:{ all -> 0x0066 }
            android.view.ViewGroup r4 = r3.rootView     // Catch:{ all -> 0x0059 }
            int r0 = com.appnext.banners.C3073R.C3075id.media     // Catch:{ all -> 0x0059 }
            android.view.View r4 = r4.findViewById(r0)     // Catch:{ all -> 0x0059 }
            int r0 = com.appnext.banners.C3073R.C3075id.play     // Catch:{ all -> 0x0059 }
            android.view.View r4 = r4.findViewById(r0)     // Catch:{ all -> 0x0059 }
            r0 = 8
            r4.setVisibility(r0)     // Catch:{ all -> 0x0059 }
        L_0x0059:
            boolean r4 = r3.started     // Catch:{ all -> 0x0066 }
            if (r4 != 0) goto L_0x0065
            java.lang.String r4 = "video_started"
            r3.report(r4)     // Catch:{ all -> 0x0066 }
            r4 = 1
            r3.started = r4     // Catch:{ all -> 0x0066 }
        L_0x0065:
            return
        L_0x0066:
            r4 = move-exception
            java.lang.String r0 = "BannerAdapter$onScrollChanged"
            com.appnext.base.C3117a.m10553a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C3076a.onScrollChanged(int):void");
    }

    /* access modifiers changed from: protected */
    public void openLink(String str) {
        try {
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
                pause();
                ViewGroup viewGroup = this.rootView;
                int i = C3073R.C3075id.media;
                View findViewById = viewGroup.findViewById(i);
                int i2 = C3073R.C3075id.play;
                ((ImageView) findViewById.findViewById(i2)).setImageResource(C3073R.C3074drawable.apnxt_banner_pause);
                this.rootView.findViewById(i).findViewById(i2).setVisibility(0);
            }
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdapter$openLink", th);
        }
        try {
            super.openLink(str);
        } catch (Throwable th2) {
            C3117a.m10553a("BannerAdapter$openLink", th2);
            report("error_no_market");
        }
    }

    public void pause() {
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
            this.mediaPlayer.pause();
        }
    }

    public void play() {
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 != null && !mediaPlayer2.isPlaying()) {
            this.mediaPlayer.start();
        }
    }

    public void setClickEnabled(boolean z) {
        this.clickEnabled = z;
    }

    /* access modifiers changed from: protected */
    public void setReportedImpression(boolean z) {
        this.reportedImpression = z;
    }

    /* access modifiers changed from: protected */
    public void setSelectedAd(BannerAdData bannerAdData) {
        this.currentAd = bannerAdData;
    }
}
