package com.appnext.ads.fullscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import com.appnext.C2980R;
import com.appnext.base.C3117a;

/* renamed from: com.appnext.ads.fullscreen.g */
public final class C3013g extends Fragment {
    /* access modifiers changed from: private */

    /* renamed from: P */
    public ImageView f12026P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public Button f12027Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public TextView f12028R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public ImageView f12029S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public Animation f12030T;
    private final int TICK = 330;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public ImageView f12031U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f12032V = false;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C3031j f12033W;

    /* renamed from: X */
    Runnable f12034X = new Runnable() {
        public final void run() {
            C3013g.this.f12028R.setAlpha(1.0f);
            C3013g.this.f12028R.animate().alpha(0.0f).setDuration(1000);
        }
    };
    /* access modifiers changed from: private */
    public int currentPosition = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Circle f12035d;
    /* access modifiers changed from: private */
    public boolean finished = false;
    private int lastProgress = 0;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    /* access modifiers changed from: private */
    public MediaPlayer mediaPlayer;
    /* access modifiers changed from: private */
    public boolean started = false;
    @SuppressLint({"SetTextI18n"})
    Runnable tick = new Runnable() {
        public final void run() {
            try {
                if (C3013g.this.videoView != null) {
                    C3013g.this.videoView.getCurrentPosition();
                    C3013g.this.videoView.getDuration();
                    if (C3013g.this.videoView.getDuration() == -1) {
                        C3013g.m10431l(C3013g.this);
                        return;
                    }
                    C3013g.m10433n(C3013g.this);
                    if (C3013g.this.f12035d.getVisibility() == 0) {
                        C2999a aVar = new C2999a(C3013g.this.f12035d, 360.0f - ((((float) (C3013g.this.videoView.getCurrentPosition() + 1)) / ((float) C3013g.this.videoView.getDuration())) * 360.0f));
                        aVar.setDuration(330);
                        C3013g.this.f12035d.startAnimation(aVar);
                    }
                    if (C3013g.this.videoView.getCurrentPosition() < C3013g.this.videoView.getDuration() && !C3013g.this.finished) {
                        C3013g.this.mHandler.postDelayed(C3013g.this.tick, 330);
                    }
                }
            } catch (Throwable th) {
                C3117a.m10553a("RollFragment$RunnableTick", th);
            }
        }
    };
    /* access modifiers changed from: private */
    public VideoView videoView;

    /* renamed from: com.appnext.ads.fullscreen.g$a */
    private class C3028a extends Animation {

        /* renamed from: ac */
        final int f12052ac;

        /* renamed from: ae */
        View f12053ae;

        /* renamed from: af */
        int f12054af;

        C3028a(View view, int i, int i2) {
            this.f12053ae = view;
            this.f12052ac = i;
            this.f12054af = i2;
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f, Transformation transformation) {
            try {
                ViewGroup.LayoutParams layoutParams = this.f12053ae.getLayoutParams();
                int i = this.f12054af;
                layoutParams.width = (int) (((float) i) + (((float) (this.f12052ac - i)) * f));
                this.f12053ae.requestLayout();
            } catch (Throwable th) {
                C3117a.m10553a("RollFragment$RunnableTick", th);
            }
        }

        public final boolean willChangeBounds() {
            return true;
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m10431l(C3013g gVar) {
        try {
            MediaPlayer mediaPlayer2 = gVar.mediaPlayer;
            if (mediaPlayer2 != null && mediaPlayer2.getCurrentPosition() != 0 && gVar.mediaPlayer.getDuration() != 0 && !gVar.finished) {
                gVar.mediaPlayer.getCurrentPosition();
                gVar.mediaPlayer.getDuration();
                gVar.finished = true;
                C3031j jVar = gVar.f12033W;
                if (jVar != null) {
                    jVar.videoEnded();
                }
                gVar.report("video_ended");
            }
        } catch (Throwable th) {
            C3117a.m10553a("RollFragment$videoCompleted", th);
        }
    }

    /* renamed from: n */
    static /* synthetic */ void m10433n(C3013g gVar) {
        try {
            int currentPosition2 = (int) ((((float) gVar.mediaPlayer.getCurrentPosition()) / ((float) gVar.mediaPlayer.getDuration())) * 100.0f);
            if (currentPosition2 > 25 && gVar.lastProgress == 0) {
                gVar.lastProgress = 25;
                gVar.report("video_25");
            } else if (currentPosition2 > 50 && gVar.lastProgress == 25) {
                gVar.lastProgress = 50;
                gVar.report("video_50");
            } else if (currentPosition2 > 75 && gVar.lastProgress == 50) {
                gVar.lastProgress = 75;
                gVar.report("video_75");
            }
        } catch (Throwable th) {
            C3117a.m10553a("RollFragment$checkProgress", th);
        }
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        try {
            this.f12033W.report(str, "S2");
        } catch (Throwable th) {
            C3117a.m10553a("RollFragment$report", th);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f12033W = (C3031j) activity;
        m10435p();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(23:1|2|(1:4)(1:5)|6|(1:8)|9|(1:11)|12|(1:18)|19|20|(2:22|23)(1:24)|25|(1:29)|30|(1:32)|33|34|35|36|37|38|(1:40)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0165 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, final android.os.Bundle r11) {
        /*
            r8 = this;
            java.lang.String r0 = "showCta"
            java.lang.String r1 = "RollFragment$onCreateView"
            com.appnext.ads.fullscreen.j r2 = r8.f12033W     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = "S2"
            int r2 = r2.getTemplate(r3)     // Catch:{ all -> 0x01bf }
            r3 = 0
            android.view.View r9 = r9.inflate(r2, r10, r3)     // Catch:{ all -> 0x01bf }
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9     // Catch:{ all -> 0x01bf }
            int r10 = com.appnext.C2980R.C2982id.privacy     // Catch:{ all -> 0x01bf }
            android.view.View r10 = r9.findViewById(r10)     // Catch:{ all -> 0x01bf }
            android.widget.ImageView r10 = (android.widget.ImageView) r10     // Catch:{ all -> 0x01bf }
            int r2 = com.appnext.C2980R.C2982id.close     // Catch:{ all -> 0x01bf }
            android.view.View r2 = r9.findViewById(r2)     // Catch:{ all -> 0x01bf }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ all -> 0x01bf }
            r8.f12031U = r2     // Catch:{ all -> 0x01bf }
            int r2 = com.appnext.C2980R.C2982id.v_view     // Catch:{ all -> 0x01bf }
            android.view.View r2 = r9.findViewById(r2)     // Catch:{ all -> 0x01bf }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ all -> 0x01bf }
            r8.f12026P = r2     // Catch:{ all -> 0x01bf }
            int r2 = com.appnext.C2980R.C2982id.install     // Catch:{ all -> 0x01bf }
            android.view.View r2 = r9.findViewById(r2)     // Catch:{ all -> 0x01bf }
            android.widget.Button r2 = (android.widget.Button) r2     // Catch:{ all -> 0x01bf }
            r8.f12027Q = r2     // Catch:{ all -> 0x01bf }
            int r2 = com.appnext.C2980R.C2982id.circle     // Catch:{ all -> 0x01bf }
            android.view.View r2 = r9.findViewById(r2)     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.Circle r2 = (com.appnext.ads.fullscreen.Circle) r2     // Catch:{ all -> 0x01bf }
            r8.f12035d = r2     // Catch:{ all -> 0x01bf }
            int r2 = com.appnext.C2980R.C2982id.click_txt     // Catch:{ all -> 0x01bf }
            android.view.View r2 = r9.findViewById(r2)     // Catch:{ all -> 0x01bf }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ all -> 0x01bf }
            r8.f12028R = r2     // Catch:{ all -> 0x01bf }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bf }
            java.lang.String r5 = "You will be redirected to "
            r4.<init>(r5)     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.j r5 = r8.f12033W     // Catch:{ all -> 0x01bf }
            boolean r5 = r5.isInstalled()     // Catch:{ all -> 0x01bf }
            if (r5 == 0) goto L_0x005f
            java.lang.String r5 = "app"
            goto L_0x0061
        L_0x005f:
            java.lang.String r5 = "Google Play"
        L_0x0061:
            r4.append(r5)     // Catch:{ all -> 0x01bf }
            java.lang.String r5 = " once the ad will finish"
            r4.append(r5)     // Catch:{ all -> 0x01bf }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01bf }
            r2.setText(r4)     // Catch:{ all -> 0x01bf }
            int r2 = com.appnext.C2980R.C2982id.loader     // Catch:{ all -> 0x01bf }
            android.view.View r2 = r9.findViewById(r2)     // Catch:{ all -> 0x01bf }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ all -> 0x01bf }
            r8.f12029S = r2     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.g$1 r2 = new com.appnext.ads.fullscreen.g$1     // Catch:{ all -> 0x01bf }
            r2.<init>()     // Catch:{ all -> 0x01bf }
            r10.setOnClickListener(r2)     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.j r2 = r8.f12033W     // Catch:{ all -> 0x01bf }
            com.appnext.core.AppnextAd r2 = r2.getSelectedAd()     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.j r4 = r8.f12033W     // Catch:{ all -> 0x01bf }
            com.appnext.core.SettingsManager r4 = r4.getConfigManager()     // Catch:{ all -> 0x01bf }
            boolean r2 = com.appnext.core.C3202i.m10805a((com.appnext.core.AppnextAd) r2, (com.appnext.core.SettingsManager) r4)     // Catch:{ all -> 0x01bf }
            if (r2 == 0) goto L_0x009b
            com.appnext.ads.fullscreen.j r2 = r8.f12033W     // Catch:{ all -> 0x01bf }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ all -> 0x01bf }
            com.appnext.core.C3202i.m10804a((android.content.Context) r2, (android.widget.ImageView) r10)     // Catch:{ all -> 0x01bf }
        L_0x009b:
            android.widget.ImageView r10 = r8.f12031U     // Catch:{ all -> 0x01bf }
            r2 = 8
            r10.setVisibility(r2)     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.j r10 = r8.f12033W     // Catch:{ all -> 0x01bf }
            boolean r10 = r10.showClose()     // Catch:{ all -> 0x01bf }
            if (r10 == 0) goto L_0x00ba
            android.os.Handler r10 = r8.mHandler     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.g$4 r4 = new com.appnext.ads.fullscreen.g$4     // Catch:{ all -> 0x01bf }
            r4.<init>()     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.j r5 = r8.f12033W     // Catch:{ all -> 0x01bf }
            long r5 = r5.closeDelay()     // Catch:{ all -> 0x01bf }
            r10.postDelayed(r4, r5)     // Catch:{ all -> 0x01bf }
        L_0x00ba:
            android.widget.ImageView r10 = r8.f12031U     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.g$5 r4 = new com.appnext.ads.fullscreen.g$5     // Catch:{ all -> 0x01bf }
            r4.<init>()     // Catch:{ all -> 0x01bf }
            r10.setOnClickListener(r4)     // Catch:{ all -> 0x01bf }
            android.os.Bundle r10 = r8.getArguments()     // Catch:{ all -> 0x01bf }
            if (r10 == 0) goto L_0x00e3
            android.os.Bundle r10 = r8.getArguments()     // Catch:{ all -> 0x01bf }
            boolean r10 = r10.containsKey(r0)     // Catch:{ all -> 0x01bf }
            if (r10 == 0) goto L_0x00e3
            android.os.Bundle r10 = r8.getArguments()     // Catch:{ all -> 0x01bf }
            boolean r10 = r10.getBoolean(r0)     // Catch:{ all -> 0x01bf }
            if (r10 != 0) goto L_0x00e3
            android.widget.Button r10 = r8.f12027Q     // Catch:{ all -> 0x01bf }
            r10.setVisibility(r2)     // Catch:{ all -> 0x01bf }
        L_0x00e3:
            com.appnext.ads.fullscreen.j r10 = r8.f12033W     // Catch:{ all -> 0x01bf }
            java.lang.String r10 = r10.getCtaText()     // Catch:{ all -> 0x01bf }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = "settings"
            r4 = 23
            if (r0 < r4) goto L_0x010a
            android.content.Context r5 = r8.getContext()     // Catch:{ all -> 0x01bf }
            com.appnext.core.a.a r5 = com.appnext.core.p033a.C3167a.m10684q(r5)     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.j r6 = r8.f12033W     // Catch:{ all -> 0x01bf }
            java.lang.String r6 = r6.getLanguage()     // Catch:{ all -> 0x01bf }
            java.lang.String r7 = "len"
            java.lang.String r5 = r5.mo10749a(r6, r2, r7)     // Catch:{ all -> 0x01bf }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x01bf }
            goto L_0x010b
        L_0x010a:
            r5 = 0
        L_0x010b:
            boolean r6 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x01bf }
            if (r6 != 0) goto L_0x011b
            int r6 = r10.length()     // Catch:{ all -> 0x01bf }
            if (r6 <= r5) goto L_0x011b
            java.lang.String r10 = r10.substring(r3, r5)     // Catch:{ all -> 0x01bf }
        L_0x011b:
            android.widget.Button r5 = r8.f12027Q     // Catch:{ all -> 0x01bf }
            r5.setText(r10)     // Catch:{ all -> 0x01bf }
            if (r0 < r4) goto L_0x0141
            android.widget.Button r10 = r8.f12027Q     // Catch:{ all -> 0x01bf }
            r0 = 2
            android.content.Context r4 = r8.getContext()     // Catch:{ all -> 0x01bf }
            com.appnext.core.a.a r4 = com.appnext.core.p033a.C3167a.m10684q(r4)     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.j r5 = r8.f12033W     // Catch:{ all -> 0x01bf }
            java.lang.String r5 = r5.getLanguage()     // Catch:{ all -> 0x01bf }
            java.lang.String r6 = "font_size_sp"
            java.lang.String r2 = r4.mo10749a(r5, r2, r6)     // Catch:{ all -> 0x01bf }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x01bf }
            float r2 = (float) r2     // Catch:{ all -> 0x01bf }
            r10.setTextSize(r0, r2)     // Catch:{ all -> 0x01bf }
        L_0x0141:
            android.widget.Button r10 = r8.f12027Q     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.g$6 r0 = new com.appnext.ads.fullscreen.g$6     // Catch:{ all -> 0x01bf }
            r0.<init>()     // Catch:{ all -> 0x01bf }
            r10.setOnClickListener(r0)     // Catch:{ all -> 0x01bf }
            android.widget.ImageView r10 = r8.f12026P     // Catch:{ all -> 0x01bf }
            com.appnext.ads.fullscreen.g$7 r0 = new com.appnext.ads.fullscreen.g$7     // Catch:{ all -> 0x01bf }
            r0.<init>()     // Catch:{ all -> 0x01bf }
            r10.setOnClickListener(r0)     // Catch:{ all -> 0x01bf }
            android.widget.VideoView r10 = new android.widget.VideoView     // Catch:{ all -> 0x0165 }
            android.app.Activity r0 = r8.getActivity()     // Catch:{ all -> 0x0165 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0165 }
            r10.<init>(r0)     // Catch:{ all -> 0x0165 }
            r8.videoView = r10     // Catch:{ all -> 0x0165 }
            goto L_0x0170
        L_0x0165:
            android.widget.VideoView r10 = new android.widget.VideoView     // Catch:{ all -> 0x01b5 }
            android.app.Activity r0 = r8.getActivity()     // Catch:{ all -> 0x01b5 }
            r10.<init>(r0)     // Catch:{ all -> 0x01b5 }
            r8.videoView = r10     // Catch:{ all -> 0x01b5 }
        L_0x0170:
            android.widget.VideoView r10 = r8.videoView     // Catch:{ all -> 0x01b5 }
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x01b5 }
            r2 = -1
            r4 = -2
            r0.<init>(r2, r4)     // Catch:{ all -> 0x01b5 }
            r10.setLayoutParams(r0)     // Catch:{ all -> 0x01b5 }
            int r10 = com.appnext.C2980R.C2982id.media     // Catch:{ all -> 0x01b5 }
            android.view.View r10 = r9.findViewById(r10)     // Catch:{ all -> 0x01b5 }
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch:{ all -> 0x01b5 }
            android.widget.VideoView r0 = r8.videoView     // Catch:{ all -> 0x01b5 }
            r10.addView(r0, r3)     // Catch:{ all -> 0x01b5 }
            android.widget.VideoView r10 = r8.videoView     // Catch:{ all -> 0x01b5 }
            com.appnext.ads.fullscreen.g$8 r0 = new com.appnext.ads.fullscreen.g$8     // Catch:{ all -> 0x01b5 }
            r0.<init>(r11)     // Catch:{ all -> 0x01b5 }
            r10.setOnPreparedListener(r0)     // Catch:{ all -> 0x01b5 }
            android.widget.VideoView r10 = r8.videoView     // Catch:{ all -> 0x01b5 }
            com.appnext.ads.fullscreen.g$9 r11 = new com.appnext.ads.fullscreen.g$9     // Catch:{ all -> 0x01b5 }
            r11.<init>()     // Catch:{ all -> 0x01b5 }
            r10.setOnCompletionListener(r11)     // Catch:{ all -> 0x01b5 }
            android.widget.VideoView r10 = r8.videoView     // Catch:{ all -> 0x01b5 }
            com.appnext.ads.fullscreen.g$10 r11 = new com.appnext.ads.fullscreen.g$10     // Catch:{ all -> 0x01b5 }
            r11.<init>()     // Catch:{ all -> 0x01b5 }
            r10.setOnErrorListener(r11)     // Catch:{ all -> 0x01b5 }
            com.appnext.ads.fullscreen.j r10 = r8.f12033W     // Catch:{ all -> 0x01b5 }
            android.net.Uri r10 = r10.getSelectedVideoUri()     // Catch:{ all -> 0x01b5 }
            if (r10 == 0) goto L_0x01b9
            android.widget.VideoView r11 = r8.videoView     // Catch:{ all -> 0x01b5 }
            r11.setVideoURI(r10)     // Catch:{ all -> 0x01b5 }
            goto L_0x01b9
        L_0x01b5:
            r10 = move-exception
            com.appnext.base.C3117a.m10553a(r1, r10)     // Catch:{ all -> 0x01bf }
        L_0x01b9:
            java.lang.String r10 = "roll_loaded"
            r8.report(r10)     // Catch:{ all -> 0x01bf }
            return r9
        L_0x01bf:
            r9 = move-exception
            com.appnext.base.C3117a.m10553a(r1, r9)
            com.appnext.ads.fullscreen.j r9 = r8.f12033W
            r9.closeClicked()
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.fullscreen.C3013g.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        super.onDestroyView();
        try {
            VideoView videoView2 = this.videoView;
            if (videoView2 != null) {
                videoView2.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                this.videoView.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                this.videoView.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                this.videoView.suspend();
                this.videoView = null;
            }
        } catch (Throwable th) {
            C3117a.m10553a("RollFragment$onDestroyView", th);
        }
        try {
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
                this.mediaPlayer = null;
            }
        } catch (Throwable th2) {
            C3117a.m10553a("RollFragment$onDestroyView", th2);
        }
    }

    public final void onPause() {
        super.onPause();
        try {
            this.mHandler.removeCallbacks(this.tick);
            VideoView videoView2 = this.videoView;
            if (videoView2 != null) {
                videoView2.pause();
                this.currentPosition = this.videoView.getCurrentPosition();
            }
        } catch (Throwable th) {
            C3117a.m10553a("RollFragment$videoCompleted", th);
        }
    }

    public final void onResume() {
        MediaPlayer mediaPlayer2;
        super.onResume();
        try {
            if (this.videoView != null && (mediaPlayer2 = this.mediaPlayer) != null && !this.finished) {
                mediaPlayer2.seekTo(this.currentPosition);
                this.mediaPlayer.start();
                this.mHandler.postDelayed(this.tick, 33);
            }
        } catch (Throwable th) {
            C3117a.m10553a("RollFragment$onResume", th);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        try {
            bundle.putInt("currentPosition", this.currentPosition);
            bundle.putBoolean("started", this.started);
            super.onSaveInstanceState(bundle);
        } catch (Throwable th) {
            C3117a.m10553a("RollFragment$onSaveInstanceState", th);
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.currentPosition = bundle.getInt("currentPosition");
        }
    }

    /* renamed from: p */
    private void m10435p() {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), C2980R.anim.apnxt_stream_loader);
            this.f12030T = loadAnimation;
            loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                public final void onAnimationEnd(Animation animation) {
                    if (C3013g.this.f12029S.getVisibility() != 8) {
                        C3013g.this.f12029S.startAnimation(C3013g.this.f12030T);
                    }
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }
            });
            this.f12030T.setRepeatCount(-1);
            this.f12030T.setRepeatMode(1);
        } catch (Throwable th) {
            C3117a.m10553a("RollFragment$createAnimation", th);
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f12033W = (C3031j) context;
        m10435p();
    }
}
