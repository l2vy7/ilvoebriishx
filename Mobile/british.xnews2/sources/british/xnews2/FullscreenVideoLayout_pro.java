package british.xnews2;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import british.xnews2.C1692config;
import british.xnews2.FullscreenVideoView_pro;
import java.util.Locale;

public class FullscreenVideoLayout_pro extends FullscreenVideoView_pro implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

    /* renamed from: L */
    protected static final Handler f6695L = new Handler();

    /* renamed from: A */
    protected SeekBar f6696A;

    /* renamed from: B */
    protected ImageButton f6697B;

    /* renamed from: C */
    protected ImageButton f6698C;

    /* renamed from: D */
    protected ImageButton f6699D;

    /* renamed from: E */
    protected ImageButton f6700E;

    /* renamed from: F */
    protected TextView f6701F;

    /* renamed from: G */
    protected TextView f6702G;

    /* renamed from: H */
    protected View.OnTouchListener f6703H;

    /* renamed from: I */
    protected Runnable f6704I = new C1570a();

    /* renamed from: J */
    private C1692config f6705J;

    /* renamed from: K */
    protected boolean f6706K = false;

    /* renamed from: w */
    public boolean f6707w = false;

    /* renamed from: x */
    public String f6708x = "";

    /* renamed from: y */
    public String f6709y = "";

    /* renamed from: z */
    protected View f6710z;

    /* renamed from: british.xnews2.FullscreenVideoLayout_pro$a */
    class C1570a implements Runnable {
        C1570a() {
        }

        public void run() {
            FullscreenVideoLayout_pro.this.mo7167w();
            FullscreenVideoLayout_pro.f6695L.postDelayed(this, 200);
        }
    }

    public FullscreenVideoLayout_pro(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7144a() {
        Log.d("FullscreenVideoLayout", "init");
        super.mo7144a();
        if (!isInEditMode()) {
            super.setOnTouchListener(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7145b() {
        super.mo7145b();
        this.f6705J = (C1692config) this.f6747b.getApplicationContext();
        if (this.f6710z == null) {
            this.f6710z = ((LayoutInflater) this.f6747b.getSystemService("layout_inflater")).inflate(R.layout.view_videocontrols_sincast, this, false);
        }
        if (this.f6710z != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            addView(this.f6710z, layoutParams);
            this.f6696A = (SeekBar) this.f6710z.findViewById(R.id.vcv_seekbar);
            this.f6700E = (ImageButton) this.f6710z.findViewById(R.id.vcv_img_fullscreen);
            this.f6697B = (ImageButton) this.f6710z.findViewById(R.id.vcv_img_play);
            this.f6699D = (ImageButton) this.f6710z.findViewById(R.id.vcv_img_cast);
            this.f6698C = (ImageButton) this.f6710z.findViewById(R.id.vcv_img_download);
            this.f6701F = (TextView) this.f6710z.findViewById(R.id.vcv_txt_total);
            this.f6702G = (TextView) this.f6710z.findViewById(R.id.vcv_txt_elapsed);
        }
        ImageButton imageButton = this.f6697B;
        if (imageButton != null) {
            imageButton.setOnClickListener(this);
        }
        ImageButton imageButton2 = this.f6699D;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(this);
        }
        ImageButton imageButton3 = this.f6698C;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(this);
        }
        ImageButton imageButton4 = this.f6700E;
        if (imageButton4 != null) {
            imageButton4.setOnClickListener(this);
        }
        SeekBar seekBar = this.f6696A;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this);
        }
        View view = this.f6710z;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* renamed from: e */
    public void mo7146e() throws IllegalStateException {
        Log.d("FullscreenVideoLayout", "pause");
        if (mo7196d()) {
            mo7165u();
            super.mo7146e();
            mo7166v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7147g() {
        super.mo7147g();
        View view = this.f6710z;
        if (view != null) {
            removeView(view);
        }
    }

    /* renamed from: h */
    public void mo7148h() {
        Log.d("FullscreenVideoLayout", "reset");
        super.mo7148h();
        mo7165u();
        mo7166v();
    }

    /* renamed from: l */
    public void mo7149l() throws IllegalStateException {
        Log.d("FullscreenVideoLayout", TtmlNode.START);
        if (!mo7196d()) {
            super.mo7149l();
            if (this.f6707w) {
                findViewById(R.id.ll_btns).setVisibility(0);
                new C1692config.C1728p0(this.f6708x, (String) null).execute(new String[0]);
            }
            mo7164t();
            mo7166v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo7150o() {
        int duration;
        Log.d("FullscreenVideoLayout", "tryToPrepare");
        super.mo7150o();
        if ((getCurrentState() == FullscreenVideoView_pro.C1578d.PREPARED || getCurrentState() == FullscreenVideoView_pro.C1578d.STARTED) && this.f6702G != null && this.f6701F != null && (duration = getDuration()) > 0) {
            this.f6696A.setMax(duration);
            this.f6696A.setProgress(0);
            int i = duration / 1000;
            long j = (long) (i % 60);
            long j2 = (long) ((i / 60) % 60);
            long j3 = (long) ((i / 3600) % 24);
            if (j3 > 0) {
                this.f6702G.setText("00:00:00");
                this.f6701F.setText(String.format(Locale.US, "%d:%02d:%02d", new Object[]{Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)}));
                return;
            }
            this.f6702G.setText("00:00");
            this.f6701F.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(j2), Long.valueOf(j)}));
        }
    }

    public void onClick(View view) {
        String str;
        if (view.getId() == R.id.vcv_img_play) {
            if (mo7196d()) {
                mo7146e();
            } else {
                mo7149l();
            }
        } else if (view.getId() == R.id.vcv_img_download) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(this.f6767v.toString());
            String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : "video/*";
            try {
                str = URLUtil.guessFileName(this.f6767v.toString(), (String) null, mimeTypeFromExtension);
            } catch (Exception unused) {
                str = "";
            }
            this.f6705J.mo7491W(this.f6767v.toString(), mimeTypeFromExtension, str, this.f6747b);
        } else if (view.getId() != R.id.vcv_img_cast) {
            if (!mo7195c()) {
                mo7159p();
            }
            setFullscreen(!mo7195c());
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Log.d("FullscreenVideoLayout", "onCompletion");
        super.onCompletion(mediaPlayer);
        mo7165u();
        mo7166v();
        if (this.f6754i != FullscreenVideoView_pro.C1578d.ERROR) {
            mo7167w();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getCurrentState() == FullscreenVideoView_pro.C1578d.END) {
            Log.d("FullscreenVideoLayout", "onDetachedFromWindow END");
            mo7165u();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        boolean onError = super.onError(mediaPlayer, i, i2);
        mo7165u();
        mo7166v();
        return onError;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Log.d("FullscreenVideoLayout", "onProgressChanged " + i);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        mo7165u();
        Log.d("FullscreenVideoLayout", "onStartTrackingTouch");
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        mo7202j(seekBar.getProgress());
        Log.d("FullscreenVideoLayout", "onStopTrackingTouch");
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        if (motionEvent.getAction() == 0 && (view2 = this.f6710z) != null) {
            if (view2.getVisibility() == 0) {
                mo7159p();
            } else if (this.f6707w) {
                this.f6747b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f6709y)));
            } else {
                mo7162s();
            }
        }
        View.OnTouchListener onTouchListener = this.f6703H;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }

    /* renamed from: p */
    public void mo7159p() {
        Log.d("FullscreenVideoLayout", "hideControls");
        View view = this.f6710z;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* renamed from: q */
    public void mo7160q() {
        View view = this.f6710z;
        if (view != null) {
            view.findViewById(R.id.vcv_txt_elapsed).setVisibility(4);
            this.f6710z.findViewById(R.id.vcv_txt_total).setVisibility(4);
            this.f6710z.findViewById(R.id.vcv_seekbar).setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo7161r(boolean z, boolean z2) {
        if (!z) {
            this.f6710z.findViewById(R.id.vcv_img_cast).setVisibility(8);
            if (z2) {
                this.f6698C.setVisibility(0);
                ((RelativeLayout.LayoutParams) this.f6698C.getLayoutParams()).addRule(11);
                ((RelativeLayout.LayoutParams) this.f6700E.getLayoutParams()).addRule(0, R.id.vcv_img_download);
                return;
            }
            ((RelativeLayout.LayoutParams) this.f6700E.getLayoutParams()).addRule(11);
        } else if (z2) {
            this.f6698C.setVisibility(0);
            ((RelativeLayout.LayoutParams) this.f6698C.getLayoutParams()).addRule(0, R.id.vcv_img_cast);
            ((RelativeLayout.LayoutParams) this.f6700E.getLayoutParams()).addRule(0, R.id.vcv_img_download);
        } else {
            ((RelativeLayout.LayoutParams) this.f6700E.getLayoutParams()).addRule(0, R.id.vcv_img_cast);
        }
    }

    /* renamed from: s */
    public void mo7162s() {
        View view = this.f6710z;
        if (view != null) {
            view.bringToFront();
            this.f6710z.setVisibility(0);
        }
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f6703H = onTouchListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo7164t() {
        Log.d("FullscreenVideoLayout", "startCounter");
        f6695L.postDelayed(this.f6704I, 200);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo7165u() {
        Log.d("FullscreenVideoLayout", "stopCounter");
        f6695L.removeCallbacks(this.f6704I);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo7166v() {
        Drawable drawable;
        if (this.f6697B != null) {
            if (getCurrentState() == FullscreenVideoView_pro.C1578d.STARTED) {
                drawable = this.f6747b.getResources().getDrawable(R.drawable.fvl_selector_pause);
            } else {
                drawable = this.f6747b.getResources().getDrawable(R.drawable.fvl_selector_play);
            }
            this.f6697B.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo7167w() {
        int currentPosition;
        if (this.f6702G != null && (currentPosition = getCurrentPosition()) > 0 && currentPosition < getDuration()) {
            this.f6696A.setProgress(currentPosition);
            int round = Math.round(((float) currentPosition) / 1000.0f);
            long j = (long) (round % 60);
            long j2 = (long) ((round / 60) % 60);
            long j3 = (long) ((round / 3600) % 24);
            if (j3 > 0) {
                this.f6702G.setText(String.format(Locale.US, "%d:%02d:%02d", new Object[]{Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)}));
                return;
            }
            this.f6702G.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(j2), Long.valueOf(j)}));
        }
    }

    public FullscreenVideoLayout_pro(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
