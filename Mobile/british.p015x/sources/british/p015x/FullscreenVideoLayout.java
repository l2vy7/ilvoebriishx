package british.p015x;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import british.p015x.C1692config;
import british.p015x.FullscreenVideoView;
import java.util.Locale;

/* renamed from: british.x.FullscreenVideoLayout */
public class FullscreenVideoLayout extends FullscreenVideoView implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

    /* renamed from: K */
    protected static final Handler f6678K = new Handler();

    /* renamed from: A */
    protected SeekBar f6679A;

    /* renamed from: B */
    protected ImageButton f6680B;

    /* renamed from: C */
    protected ImageButton f6681C;

    /* renamed from: D */
    protected ImageButton f6682D;

    /* renamed from: E */
    protected TextView f6683E;

    /* renamed from: F */
    protected TextView f6684F;

    /* renamed from: G */
    protected View.OnTouchListener f6685G;

    /* renamed from: H */
    protected Runnable f6686H = new C1569a();

    /* renamed from: I */
    private C1692config f6687I;

    /* renamed from: J */
    protected boolean f6688J = false;

    /* renamed from: v */
    public boolean f6689v = false;

    /* renamed from: w */
    public boolean f6690w = false;

    /* renamed from: x */
    public String f6691x = "";

    /* renamed from: y */
    public String f6692y = "";

    /* renamed from: z */
    protected View f6693z;

    /* renamed from: british.x.FullscreenVideoLayout$a */
    class C1569a implements Runnable {
        C1569a() {
        }

        public void run() {
            FullscreenVideoLayout.this.mo7142w();
            FullscreenVideoLayout.f6678K.postDelayed(this, 200);
        }
    }

    public FullscreenVideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7119a() {
        super.mo7119a();
        if (!isInEditMode()) {
            super.setOnTouchListener(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7120b() {
        super.mo7120b();
        this.f6687I = (C1692config) this.f6713c.getApplicationContext();
        if (this.f6693z == null) {
            this.f6693z = ((LayoutInflater) this.f6713c.getSystemService("layout_inflater")).inflate(R.layout.view_videocontrols, this, false);
        }
        if (this.f6693z != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            addView(this.f6693z, layoutParams);
            this.f6679A = (SeekBar) this.f6693z.findViewById(R.id.vcv_seekbar);
            this.f6682D = (ImageButton) this.f6693z.findViewById(R.id.vcv_img_fullscreen);
            this.f6680B = (ImageButton) this.f6693z.findViewById(R.id.vcv_img_play);
            this.f6681C = (ImageButton) this.f6693z.findViewById(R.id.vcv_img_download);
            this.f6683E = (TextView) this.f6693z.findViewById(R.id.vcv_txt_total);
            this.f6684F = (TextView) this.f6693z.findViewById(R.id.vcv_txt_elapsed);
        }
        ImageButton imageButton = this.f6680B;
        if (imageButton != null) {
            imageButton.setOnClickListener(this);
        }
        ImageButton imageButton2 = this.f6681C;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(this);
        }
        ImageButton imageButton3 = this.f6682D;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(this);
        }
        SeekBar seekBar = this.f6679A;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this);
        }
        View view = this.f6693z;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* renamed from: e */
    public void mo7121e() throws IllegalStateException {
        if (mo7170d()) {
            mo7140u();
            super.mo7121e();
            mo7141v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7122g() {
        super.mo7122g();
        View view = this.f6693z;
        if (view != null) {
            removeView(view);
        }
    }

    /* renamed from: h */
    public void mo7123h() {
        super.mo7123h();
        mo7140u();
        mo7141v();
    }

    /* renamed from: l */
    public void mo7124l() throws IllegalStateException {
        if (!mo7170d()) {
            super.mo7124l();
            if (this.f6689v) {
                findViewById(R.id.ll_btns).setVisibility(0);
                new C1692config.C1728p0(this.f6691x, (String) null).execute(new String[0]);
            }
            mo7139t();
            mo7141v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo7125o() {
        int duration;
        super.mo7125o();
        if ((getCurrentState() == FullscreenVideoView.C1574d.PREPARED || getCurrentState() == FullscreenVideoView.C1574d.STARTED) && this.f6684F != null && this.f6683E != null && (duration = getDuration()) > 0) {
            this.f6679A.setMax(duration);
            this.f6679A.setProgress(0);
            int i = duration / 1000;
            long j = (long) (i % 60);
            long j2 = (long) ((i / 60) % 60);
            long j3 = (long) ((i / 3600) % 24);
            if (j3 > 0) {
                this.f6684F.setText("00:00:00");
                this.f6683E.setText(String.format(Locale.US, "%d:%02d:%02d", new Object[]{Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)}));
                return;
            }
            this.f6684F.setText("00:00");
            this.f6683E.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(j2), Long.valueOf(j)}));
        }
    }

    public void onClick(View view) {
        String str;
        if (view.getId() == R.id.vcv_img_play) {
            if (mo7170d()) {
                mo7121e();
            } else {
                mo7124l();
            }
        } else if (view.getId() == R.id.vcv_img_download) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(this.f6731u.toString());
            String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : "video/*";
            try {
                str = URLUtil.guessFileName(this.f6731u.toString(), (String) null, mimeTypeFromExtension);
            } catch (Exception unused) {
                str = "";
            }
            this.f6687I.mo7491W(this.f6731u.toString(), mimeTypeFromExtension, str, this.f6713c);
        } else if (view.getId() == R.id.vcv_img_fullscreen) {
            if (!mo7169c()) {
                mo7134p();
            }
            setFullscreen(!mo7169c());
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        super.onCompletion(mediaPlayer);
        mo7140u();
        mo7141v();
        if (this.f6720j != FullscreenVideoView.C1574d.ERROR) {
            mo7142w();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getCurrentState() == FullscreenVideoView.C1574d.END) {
            mo7140u();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        boolean onError = super.onError(mediaPlayer, i, i2);
        mo7140u();
        mo7141v();
        return onError;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        mo7140u();
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        mo7176j(seekBar.getProgress());
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        if (motionEvent.getAction() == 0 && (view2 = this.f6693z) != null) {
            if (view2.getVisibility() == 0) {
                mo7134p();
            } else if (this.f6689v) {
                this.f6713c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f6692y)));
            } else {
                mo7137s();
            }
        }
        View.OnTouchListener onTouchListener = this.f6685G;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return true;
    }

    /* renamed from: p */
    public void mo7134p() {
        View view = this.f6693z;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* renamed from: q */
    public void mo7135q() {
        View view = this.f6693z;
        if (view != null) {
            view.findViewById(R.id.vcv_txt_elapsed).setVisibility(4);
            this.f6693z.findViewById(R.id.vcv_txt_total).setVisibility(4);
            this.f6693z.findViewById(R.id.vcv_seekbar).setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo7136r(boolean z, boolean z2) {
        if (!z) {
            this.f6693z.findViewById(R.id.vcv_img_cast).setVisibility(8);
            if (z2) {
                this.f6681C.setVisibility(0);
                ((RelativeLayout.LayoutParams) this.f6681C.getLayoutParams()).addRule(11);
                ((RelativeLayout.LayoutParams) this.f6682D.getLayoutParams()).addRule(0, R.id.vcv_img_download);
                return;
            }
            ((RelativeLayout.LayoutParams) this.f6682D.getLayoutParams()).addRule(11);
        } else if (z2) {
            this.f6681C.setVisibility(0);
            ((RelativeLayout.LayoutParams) this.f6681C.getLayoutParams()).addRule(0, R.id.vcv_img_cast);
            ((RelativeLayout.LayoutParams) this.f6682D.getLayoutParams()).addRule(0, R.id.vcv_img_download);
        } else {
            ((RelativeLayout.LayoutParams) this.f6682D.getLayoutParams()).addRule(0, R.id.vcv_img_cast);
        }
    }

    /* renamed from: s */
    public void mo7137s() {
        View view = this.f6693z;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f6685G = onTouchListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo7139t() {
        f6678K.postDelayed(this.f6686H, 200);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo7140u() {
        f6678K.removeCallbacks(this.f6686H);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo7141v() {
        Drawable drawable;
        if (this.f6680B != null) {
            if (getCurrentState() == FullscreenVideoView.C1574d.STARTED) {
                drawable = this.f6713c.getResources().getDrawable(R.drawable.fvl_selector_pause);
            } else {
                drawable = this.f6713c.getResources().getDrawable(R.drawable.fvl_selector_play);
            }
            this.f6680B.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo7142w() {
        int currentPosition;
        if (this.f6684F != null && (currentPosition = getCurrentPosition()) > 0 && currentPosition < getDuration()) {
            this.f6679A.setProgress(currentPosition);
            int round = Math.round(((float) currentPosition) / 1000.0f);
            long j = (long) (round % 60);
            long j2 = (long) ((round / 60) % 60);
            long j3 = (long) ((round / 3600) % 24);
            if (j3 > 0) {
                this.f6684F.setText(String.format(Locale.US, "%d:%02d:%02d", new Object[]{Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)}));
                return;
            }
            this.f6684F.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(j2), Long.valueOf(j)}));
        }
    }

    public FullscreenVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
