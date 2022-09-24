package com.appnext.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.appnext.base.C3117a;
import com.appnext.core.C3198g;
import com.appnext.p021a.C2983a;
import com.appnext.p021a.C2985b;
import java.io.File;

public class MediaView extends RelativeLayout {
    private boolean clickEnabled = true;

    /* renamed from: fD */
    private boolean f12468fD = true;
    /* access modifiers changed from: private */

    /* renamed from: fE */
    public NativeAd f12469fE;

    /* renamed from: fF */
    private MediaType f12470fF;

    /* renamed from: fG */
    private NativeAdData f12471fG;
    /* access modifiers changed from: private */

    /* renamed from: fH */
    public C2983a f12472fH;

    /* renamed from: fI */
    private C2985b f12473fI;
    /* access modifiers changed from: private */

    /* renamed from: fJ */
    public View f12474fJ;
    /* access modifiers changed from: private */

    /* renamed from: fK */
    public C3272a f12475fK;
    /* access modifiers changed from: private */

    /* renamed from: fL */
    public boolean f12476fL = false;
    /* access modifiers changed from: private */

    /* renamed from: fM */
    public int f12477fM = 0;
    /* access modifiers changed from: private */
    public boolean finished = false;
    /* access modifiers changed from: private */
    public Handler mHandler;
    /* access modifiers changed from: private */
    public MediaPlayer mediaPlayer;
    private boolean mute = false;
    /* access modifiers changed from: private */
    public Runnable tick = new Runnable() {
        public final void run() {
            try {
                if (MediaView.this.mediaPlayer != null && MediaView.this.mediaPlayer.isPlaying()) {
                    MediaView mediaView = MediaView.this;
                    int unused = mediaView.f12477fM = mediaView.mediaPlayer.getCurrentPosition();
                }
            } catch (Throwable unused2) {
            }
            if (MediaView.this.mHandler != null) {
                MediaView.this.mHandler.postDelayed(MediaView.this.tick, 500);
            }
        }
    };

    protected enum MediaType {
        VIDEO,
        STATIC
    }

    /* renamed from: com.appnext.nativeads.MediaView$a */
    class C3272a extends ImageView {
        public C3272a(Context context) {
            super(context);
        }
    }

    public MediaView(Context context) {
        super(context);
    }

    /* renamed from: ba */
    private void m10974ba() {
        try {
            this.f12473fI = new C2985b(getContext());
            this.f12469fE.downloadAndDisplayImage(getContext(), this.f12473fI, this.f12471fG.getWideImageURL());
            addView(this.f12473fI);
            ((RelativeLayout.LayoutParams) this.f12473fI.getLayoutParams()).addRule(13);
            this.f12473fI.getLayoutParams().width = -1;
            this.f12473fI.getLayoutParams().height = -2;
            this.f12473fI.setAdjustViewBounds(true);
        } catch (Throwable th) {
            C3117a.m10553a("MediaView$initStatic", th);
        }
    }

    public void destroy() {
        removeAllViews();
        try {
            C2983a aVar = this.f12472fH;
            if (aVar != null) {
                aVar.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                this.f12472fH.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                this.f12472fH.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                this.f12472fH.suspend();
                this.f12472fH = null;
                this.mediaPlayer.release();
                this.mediaPlayer = null;
            }
        } catch (Throwable th) {
            C3117a.m10553a("MediaView$destroy", th);
        }
        try {
            C2985b bVar = this.f12473fI;
            if (bVar != null) {
                bVar.setImageBitmap((Bitmap) null);
                this.f12473fI = null;
            }
        } catch (Throwable th2) {
            C3117a.m10553a("MediaView$destroy", th2);
        }
        this.mHandler.removeCallbacksAndMessages((Object) null);
    }

    public boolean isAutoPLay() {
        return this.f12468fD;
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    public boolean isMute() {
        return this.mute;
    }

    public void pause() {
        try {
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
                this.mediaPlayer.pause();
                ((ImageView) this.f12474fJ).setImageResource(C3285R.C3286drawable.apnxt_na_play);
            }
        } catch (Throwable unused) {
        }
    }

    public void play() {
        try {
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 != null && !mediaPlayer2.isPlaying()) {
                this.mediaPlayer.start();
                ((ImageView) this.f12474fJ).setImageResource(0);
            }
        } catch (Throwable th) {
            C3117a.m10553a("MediaView$play", th);
        }
    }

    public void setAutoPLay(boolean z) {
        this.f12468fD = z;
    }

    public void setClickEnabled(boolean z) {
        this.clickEnabled = z;
    }

    public void setMute(boolean z) {
        this.mute = z;
        try {
            if (this.mediaPlayer == null) {
                return;
            }
            if (isMute()) {
                this.mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                this.mediaPlayer.setVolume(1.0f, 1.0f);
            }
        } catch (Throwable th) {
            C3117a.m10553a("MediaView$setMute", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10896d(int i) {
        if (this.f12470fF != MediaType.VIDEO) {
            return;
        }
        if (i < 90) {
            pause();
        } else if (!this.f12476fL && isAutoPLay() && !this.finished) {
            play();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10895a(NativeAd nativeAd, NativeAdData nativeAdData, MediaType mediaType) {
        Uri uri;
        try {
            this.f12469fE = nativeAd;
            this.f12471fG = nativeAdData;
            this.f12470fF = mediaType;
            if (mediaType == MediaType.VIDEO) {
                try {
                    this.f12472fH = new C2983a(getContext().getApplicationContext());
                } catch (Throwable th) {
                    C3117a.m10553a("MediaView$initVideo", th);
                }
                this.mHandler = new Handler();
                this.f12472fH.setPlayPauseListener(new C2983a.C2984a() {
                    /* renamed from: bb */
                    public final void mo10094bb() {
                        ((ImageView) MediaView.this.f12474fJ).setImageResource(0);
                    }

                    public final void onPause() {
                        ((ImageView) MediaView.this.f12474fJ).setImageResource(C3285R.C3286drawable.apnxt_na_play);
                    }
                });
                this.f12472fH.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        try {
                            if (MediaView.this.f12472fH != null) {
                                if (MediaView.this.getLayoutParams().height == -2) {
                                    MediaView.this.f12472fH.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                                } else if (MediaView.this.getLayoutParams().height == -1) {
                                    MediaView.this.f12472fH.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                                } else if (MediaView.this.getLayoutParams().height < C3198g.m10773a(MediaView.this.getContext(), 200.0f)) {
                                    MediaView.this.f12472fH.setLayoutParams(new RelativeLayout.LayoutParams(-1, C3198g.m10773a(MediaView.this.getContext(), 200.0f)));
                                } else {
                                    MediaView.this.f12472fH.setLayoutParams(new RelativeLayout.LayoutParams(-1, MediaView.this.getHeight()));
                                }
                                if (Build.VERSION.SDK_INT >= 16) {
                                    MediaView.this.f12472fH.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                } else {
                                    MediaView.this.f12472fH.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                                }
                                ((RelativeLayout.LayoutParams) MediaView.this.f12472fH.getLayoutParams()).addRule(13);
                                ((RelativeLayout.LayoutParams) MediaView.this.f12474fJ.getLayoutParams()).addRule(13);
                            }
                        } catch (Throwable th) {
                            C3117a.m10553a("MediaView$initVideo", th);
                        }
                    }
                });
                this.f12472fH.setLayoutParams(new RelativeLayout.LayoutParams(-1, 1));
                addView(this.f12472fH);
                this.f12472fH.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        try {
                            MediaPlayer unused = MediaView.this.mediaPlayer = mediaPlayer;
                            if (MediaView.this.isMute()) {
                                MediaView.this.mediaPlayer.setVolume(0.0f, 0.0f);
                            } else {
                                MediaView.this.mediaPlayer.setVolume(1.0f, 1.0f);
                            }
                            MediaView.this.mHandler.removeCallbacksAndMessages((Object) null);
                            MediaView.this.mHandler.post(MediaView.this.tick);
                            MediaView.this.mediaPlayer.seekTo(MediaView.this.f12477fM);
                            MediaView.this.mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() {
                                public final void onSeekComplete(MediaPlayer mediaPlayer) {
                                    if (MediaView.this.isAutoPLay() && MediaView.this.f12469fE.getNativeAdView().getVisiblePercent(MediaView.this.f12472fH) > 90) {
                                        MediaView.this.play();
                                    }
                                }
                            });
                            new Handler().postDelayed(new Runnable() {
                                public final void run() {
                                    try {
                                        MediaView.this.f12474fJ.getLayoutParams().height = MediaView.this.f12472fH.getMeasuredHeight();
                                    } catch (Throwable th) {
                                        C3117a.m10553a("MediaView$initVideo", th);
                                    }
                                }
                            }, 200);
                            MediaView.this.mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() {
                                public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                                    return false;
                                }
                            });
                        } catch (Throwable unused2) {
                        }
                    }
                });
                this.f12472fH.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        return true;
                    }
                });
                this.f12472fH.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        try {
                            if (MediaView.this.mediaPlayer != null && MediaView.this.mediaPlayer.getCurrentPosition() != 0 && MediaView.this.mediaPlayer.getDuration() != 0 && !MediaView.this.finished) {
                                boolean unused = MediaView.this.finished = true;
                                if (!MediaView.this.isClickEnabled()) {
                                    ((ImageView) MediaView.this.f12474fJ).setImageResource(C3285R.C3286drawable.apnxt_na_play);
                                }
                            }
                        } catch (Throwable th) {
                            C3117a.m10553a("MediaView$initVideo", th);
                        }
                    }
                });
                String selectedVideo = this.f12471fG.getSelectedVideo();
                if (selectedVideo != null) {
                    if (!selectedVideo.equals("")) {
                        C3272a aVar = new C3272a(getContext());
                        this.f12474fJ = aVar;
                        addView(aVar);
                        this.f12474fJ.getLayoutParams().height = -1;
                        this.f12474fJ.getLayoutParams().width = -1;
                        ((ImageView) this.f12474fJ).setImageResource(C3285R.C3286drawable.apnxt_na_play);
                        ((ImageView) this.f12474fJ).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        this.f12474fJ.setOnClickListener(new View.OnClickListener() {
                            public final void onClick(View view) {
                                if (MediaView.this.f12472fH == null || !MediaView.this.f12472fH.isPlaying()) {
                                    boolean unused = MediaView.this.f12476fL = false;
                                    boolean unused2 = MediaView.this.finished = false;
                                    MediaView.this.f12472fH.start();
                                } else if (MediaView.this.isClickEnabled()) {
                                    if (!MediaView.this.isAutoPLay()) {
                                        ((ImageView) MediaView.this.f12474fJ).setImageResource(C3285R.C3286drawable.apnxt_na_play);
                                    }
                                    boolean unused3 = MediaView.super.callOnClick();
                                } else {
                                    boolean unused4 = MediaView.this.f12476fL = true;
                                    MediaView.this.f12472fH.pause();
                                }
                            }
                        });
                        if (isAutoPLay()) {
                            ((ImageView) this.f12474fJ).setImageResource(0);
                        }
                        C3272a aVar2 = new C3272a(getContext());
                        this.f12475fK = aVar2;
                        addView(aVar2);
                        this.f12475fK.getLayoutParams().height = C3198g.m10773a(getContext(), 30.0f);
                        this.f12475fK.getLayoutParams().width = C3198g.m10773a(getContext(), 30.0f);
                        if (isMute()) {
                            this.f12475fK.setImageResource(C3285R.C3286drawable.apnxt_na_mute);
                        } else {
                            this.f12475fK.setImageResource(C3285R.C3286drawable.apnxt_na_unmute);
                        }
                        this.f12475fK.setOnClickListener(new View.OnClickListener() {
                            public final void onClick(View view) {
                                MediaView mediaView = MediaView.this;
                                mediaView.setMute(!mediaView.isMute());
                                if (MediaView.this.isMute()) {
                                    MediaView.this.f12475fK.setImageResource(C3285R.C3286drawable.apnxt_na_mute);
                                } else {
                                    MediaView.this.f12475fK.setImageResource(C3285R.C3286drawable.apnxt_na_unmute);
                                }
                            }
                        });
                        C2983a aVar3 = this.f12472fH;
                        String b = C3198g.m10788b(selectedVideo);
                        String str = getContext().getFilesDir().getAbsolutePath() + "/data/appnext/videos/";
                        if (new File(str + b).exists()) {
                            uri = Uri.parse(str + b);
                        } else {
                            uri = Uri.parse(selectedVideo);
                        }
                        aVar3.setVideoURI(uri);
                    }
                }
                removeView(this.f12472fH);
                this.f12472fH = null;
                m10974ba();
            } else {
                m10974ba();
            }
            if (getBackground() == null) {
                setBackgroundColor(-16777216);
            }
        } catch (Throwable th2) {
            C3117a.m10553a("MediaView$initData", th2);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
