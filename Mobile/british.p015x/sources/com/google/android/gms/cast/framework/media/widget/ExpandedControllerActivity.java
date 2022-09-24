package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.cast.C4646v8;
import com.google.android.gms.internal.cast.C8652n7;
import com.google.android.gms.internal.cast.C8739t;
import com.google.android.gms.internal.cast.C8754u;
import com.google.android.gms.internal.cast.C8769v;
import com.google.android.gms.internal.cast.C8784w;
import java.util.Timer;
import p006a5.C6492o;
import p073f.C5238a;
import p115m4.C10758h;
import p115m4.C10764j;
import p115m4.C10766k;
import p115m4.C10768l;
import p115m4.C10770m;
import p115m4.C10772n;
import p115m4.C10773o;
import p115m4.C10777q;
import p115m4.C10779r;
import p115m4.C5758b;
import p115m4.C5759d;
import p126o4.C5872b;
import p235n4.C10814b;
import p235n4.C10829q;
import p242p4.C10867e;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class ExpandedControllerActivity extends AppCompatActivity {

    /* renamed from: A */
    private int f28776A;

    /* renamed from: B */
    private int f28777B;

    /* renamed from: C */
    private int f28778C;

    /* renamed from: D */
    private int f28779D;

    /* renamed from: E */
    private int f28780E;

    /* renamed from: F */
    private int f28781F;

    /* renamed from: G */
    private int f28782G;

    /* renamed from: H */
    private int f28783H;

    /* renamed from: I */
    private int f28784I;

    /* renamed from: J */
    private int f28785J;

    /* renamed from: K */
    private int f28786K;

    /* renamed from: L */
    private int f28787L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public TextView f28788M;

    /* renamed from: N */
    private SeekBar f28789N;

    /* renamed from: O */
    private CastSeekBar f28790O;

    /* renamed from: P */
    private ImageView f28791P;

    /* renamed from: Q */
    private ImageView f28792Q;

    /* renamed from: R */
    private int[] f28793R;

    /* renamed from: S */
    private ImageView[] f28794S = new ImageView[4];

    /* renamed from: T */
    private View f28795T;

    /* renamed from: U */
    private View f28796U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public ImageView f28797V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public TextView f28798W;

    /* renamed from: X */
    private TextView f28799X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public TextView f28800Y;

    /* renamed from: Z */
    private TextView f28801Z;

    /* renamed from: l0 */
    private C10814b f28802l0;

    /* renamed from: m0 */
    private C5872b f28803m0;

    /* renamed from: n0 */
    private C10777q f28804n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public boolean f28805o0;

    /* renamed from: p0 */
    private boolean f28806p0;

    /* renamed from: q0 */
    private Timer f28807q0;

    /* renamed from: r0 */
    private String f28808r0;

    /* renamed from: s */
    private final C10779r<C5759d> f28809s = new C7159i(this, (C7154d) null);

    /* renamed from: t */
    private final C4580e.C4582b f28810t = new C7158h(this, (C7154d) null);

    /* renamed from: u */
    private int f28811u;

    /* renamed from: v */
    private int f28812v;

    /* renamed from: w */
    private int f28813w;

    /* renamed from: x */
    private int f28814x;

    /* renamed from: y */
    private int f28815y;

    /* renamed from: z */
    private int f28816z;

    /* renamed from: Y */
    private final void m29433Y(View view, int i, int i2, C5872b bVar) {
        ImageView imageView = (ImageView) view.findViewById(i);
        if (i2 == C10766k.f49435r) {
            imageView.setVisibility(4);
        } else if (i2 == C10766k.f49438u) {
            imageView.setBackgroundResource(this.f28811u);
            Drawable b = C10867e.m48884b(this, this.f28784I, this.f28813w);
            Drawable b2 = C10867e.m48884b(this, this.f28784I, this.f28812v);
            Drawable b3 = C10867e.m48884b(this, this.f28784I, this.f28814x);
            imageView.setImageDrawable(b2);
            bVar.mo22801r(imageView, b2, b, b3, (View) null, false);
        } else if (i2 == C10766k.f49441x) {
            imageView.setBackgroundResource(this.f28811u);
            imageView.setImageDrawable(C10867e.m48884b(this, this.f28784I, this.f28815y));
            imageView.setContentDescription(getResources().getString(C10770m.f49467s));
            bVar.mo22808y(imageView, 0);
        } else if (i2 == C10766k.f49440w) {
            imageView.setBackgroundResource(this.f28811u);
            imageView.setImageDrawable(C10867e.m48884b(this, this.f28784I, this.f28816z));
            imageView.setContentDescription(getResources().getString(C10770m.f49466r));
            bVar.mo22807x(imageView, 0);
        } else if (i2 == C10766k.f49439v) {
            imageView.setBackgroundResource(this.f28811u);
            imageView.setImageDrawable(C10867e.m48884b(this, this.f28784I, this.f28776A));
            imageView.setContentDescription(getResources().getString(C10770m.f49465q));
            bVar.mo22806w(imageView, 30000);
        } else if (i2 == C10766k.f49436s) {
            imageView.setBackgroundResource(this.f28811u);
            imageView.setImageDrawable(C10867e.m48884b(this, this.f28784I, this.f28777B));
            imageView.setContentDescription(getResources().getString(C10770m.f49458j));
            bVar.mo22804u(imageView, 30000);
        } else if (i2 == C10766k.f49437t) {
            imageView.setBackgroundResource(this.f28811u);
            imageView.setImageDrawable(C10867e.m48884b(this, this.f28784I, this.f28778C));
            bVar.mo22800q(imageView);
        } else if (i2 == C10766k.f49434q) {
            imageView.setBackgroundResource(this.f28811u);
            imageView.setImageDrawable(C10867e.m48884b(this, this.f28784I, this.f28779D));
            bVar.mo22803t(imageView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public final C4580e m29434Z() {
        C5759d d = this.f28804n0.mo42953d();
        if (d == null || !d.mo42943c()) {
            return null;
        }
        return d.mo22550q();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public final void m29435a0() {
        MediaInfo j;
        MediaMetadata L0;
        ActionBar C;
        C4580e Z = m29434Z();
        if (Z != null && Z.mo17850o() && (j = Z.mo17845j()) != null && (L0 = j.mo29227L0()) != null && (C = mo765C()) != null) {
            C.mo723v(L0.mo29280G0("com.google.android.gms.cast.metadata.TITLE"));
            C.mo722u(C10829q.m48820a(L0));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public final void m29436b0() {
        CastDevice p;
        C5759d d = this.f28804n0.mo42953d();
        if (!(d == null || (p = d.mo22549p()) == null)) {
            String E0 = p.mo29182E0();
            if (!TextUtils.isEmpty(E0)) {
                this.f28788M.setText(getResources().getString(C10770m.f49451b, new Object[]{E0}));
                return;
            }
        }
        this.f28788M.setText("");
    }

    /* access modifiers changed from: private */
    @TargetApi(23)
    /* renamed from: c0 */
    public final void m29437c0() {
        MediaStatus k;
        String str;
        Drawable drawable;
        Bitmap bitmap;
        Bitmap a;
        C4580e Z = m29434Z();
        if (Z != null && (k = Z.mo17846k()) != null) {
            String str2 = null;
            if (k.mo29353Z0()) {
                if (C6492o.m28281d() && this.f28792Q.getVisibility() == 8 && (drawable = this.f28791P.getDrawable()) != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && (a = C10867e.m48883a(this, bitmap, 0.25f, 7.5f)) != null) {
                    this.f28792Q.setImageBitmap(a);
                    this.f28792Q.setVisibility(0);
                }
                AdBreakClipInfo E0 = k.mo29332E0();
                if (E0 != null) {
                    String K0 = E0.mo29145K0();
                    str2 = E0.mo29143I0();
                    str = K0;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    m29439e0(str2);
                } else if (!TextUtils.isEmpty(this.f28808r0)) {
                    m29439e0(this.f28808r0);
                } else {
                    this.f28798W.setVisibility(0);
                    this.f28796U.setVisibility(0);
                    this.f28797V.setVisibility(8);
                }
                TextView textView = this.f28799X;
                if (TextUtils.isEmpty(str)) {
                    str = getResources().getString(C10770m.f49450a);
                }
                textView.setText(str);
                if (C6492o.m28286i()) {
                    this.f28799X.setTextAppearance(this.f28785J);
                } else {
                    this.f28799X.setTextAppearance(this, this.f28785J);
                }
                this.f28795T.setVisibility(0);
                m29438d0(Z);
                return;
            }
            this.f28801Z.setVisibility(8);
            this.f28800Y.setVisibility(8);
            this.f28795T.setVisibility(8);
            if (C6492o.m28281d()) {
                this.f28792Q.setVisibility(8);
                this.f28792Q.setImageBitmap((Bitmap) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public final void m29438d0(C4580e eVar) {
        MediaStatus k;
        if (!this.f28805o0 && (k = eVar.mo17846k()) != null && !eVar.mo17851p()) {
            this.f28800Y.setVisibility(8);
            this.f28801Z.setVisibility(8);
            AdBreakClipInfo E0 = k.mo29332E0();
            if (E0 != null && E0.mo29147M0() != -1) {
                if (!this.f28806p0) {
                    C7157g gVar = new C7157g(this, eVar);
                    Timer timer = new Timer();
                    this.f28807q0 = timer;
                    timer.scheduleAtFixedRate(gVar, 0, 500);
                    this.f28806p0 = true;
                }
                float M0 = (float) (E0.mo29147M0() - eVar.mo17839d());
                if (M0 <= 0.0f) {
                    if (this.f28806p0) {
                        this.f28807q0.cancel();
                        this.f28806p0 = false;
                    }
                    this.f28800Y.setVisibility(0);
                    this.f28800Y.setClickable(true);
                    return;
                }
                this.f28801Z.setVisibility(0);
                this.f28801Z.setText(getResources().getString(C10770m.cast_expanded_controller_skip_ad_text, new Object[]{Integer.valueOf((int) Math.ceil((double) (M0 / 1000.0f)))}));
                this.f28800Y.setClickable(false);
            }
        }
    }

    /* renamed from: e0 */
    private final void m29439e0(String str) {
        this.f28802l0.mo42981b(Uri.parse(str));
        this.f28796U.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10777q c = C5758b.m25464e(this).mo22535c();
        this.f28804n0 = c;
        if (c.mo42953d() == null) {
            finish();
        }
        C5872b bVar = new C5872b(this);
        this.f28803m0 = bVar;
        bVar.mo22793T(this.f28810t);
        setContentView(C10768l.f49444a);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{C5238a.f22799M});
        this.f28811u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = obtainStyledAttributes((AttributeSet) null, C10773o.f49480a, C10758h.f49394a, C10772n.f49476a);
        this.f28784I = obtainStyledAttributes2.getResourceId(C10773o.f49488i, 0);
        this.f28812v = obtainStyledAttributes2.getResourceId(C10773o.f49497r, 0);
        this.f28813w = obtainStyledAttributes2.getResourceId(C10773o.f49496q, 0);
        this.f28814x = obtainStyledAttributes2.getResourceId(C10773o.f49505z, 0);
        this.f28815y = obtainStyledAttributes2.getResourceId(C10773o.f49504y, 0);
        this.f28816z = obtainStyledAttributes2.getResourceId(C10773o.f49503x, 0);
        this.f28776A = obtainStyledAttributes2.getResourceId(C10773o.f49498s, 0);
        this.f28777B = obtainStyledAttributes2.getResourceId(C10773o.f49493n, 0);
        this.f28778C = obtainStyledAttributes2.getResourceId(C10773o.f49495p, 0);
        this.f28779D = obtainStyledAttributes2.getResourceId(C10773o.f49489j, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(C10773o.f49490k, 0);
        if (resourceId != 0) {
            TypedArray obtainTypedArray = getResources().obtainTypedArray(resourceId);
            C4604n.m20088a(obtainTypedArray.length() == 4);
            this.f28793R = new int[obtainTypedArray.length()];
            for (int i = 0; i < obtainTypedArray.length(); i++) {
                this.f28793R[i] = obtainTypedArray.getResourceId(i, 0);
            }
            obtainTypedArray.recycle();
        } else {
            int i2 = C10766k.f49435r;
            this.f28793R = new int[]{i2, i2, i2, i2};
        }
        this.f28783H = obtainStyledAttributes2.getColor(C10773o.f49492m, 0);
        this.f28780E = getResources().getColor(obtainStyledAttributes2.getResourceId(C10773o.f49485f, 0));
        this.f28781F = getResources().getColor(obtainStyledAttributes2.getResourceId(C10773o.f49484e, 0));
        this.f28782G = getResources().getColor(obtainStyledAttributes2.getResourceId(C10773o.f49487h, 0));
        this.f28785J = obtainStyledAttributes2.getResourceId(C10773o.f49486g, 0);
        this.f28786K = obtainStyledAttributes2.getResourceId(C10773o.f49482c, 0);
        this.f28787L = obtainStyledAttributes2.getResourceId(C10773o.f49483d, 0);
        int resourceId2 = obtainStyledAttributes2.getResourceId(C10773o.f49491l, 0);
        if (resourceId2 != 0) {
            this.f28808r0 = getApplicationContext().getResources().getString(resourceId2);
        }
        obtainStyledAttributes2.recycle();
        View findViewById = findViewById(C10766k.f49411C);
        C5872b bVar2 = this.f28803m0;
        this.f28791P = (ImageView) findViewById.findViewById(C10766k.f49426i);
        this.f28792Q = (ImageView) findViewById.findViewById(C10766k.f49428k);
        View findViewById2 = findViewById.findViewById(C10766k.f49427j);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        bVar2.mo22799p(this.f28791P, new ImageHints(4, displayMetrics.widthPixels, displayMetrics.heightPixels), findViewById2);
        this.f28788M = (TextView) findViewById.findViewById(C10766k.f49416K);
        ProgressBar progressBar = (ProgressBar) findViewById.findViewById(C10766k.f49412G);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        int i3 = this.f28783H;
        if (i3 != 0) {
            indeterminateDrawable.setColorFilter(i3, PorterDuff.Mode.SRC_IN);
        }
        bVar2.mo22805v(progressBar);
        TextView textView = (TextView) findViewById.findViewById(C10766k.f49415J);
        TextView textView2 = (TextView) findViewById.findViewById(C10766k.f49410B);
        this.f28789N = (SeekBar) findViewById.findViewById(C10766k.f49414I);
        CastSeekBar castSeekBar = (CastSeekBar) findViewById.findViewById(C10766k.cast_seek_bar);
        this.f28790O = castSeekBar;
        bVar2.mo22802s(castSeekBar, 1000);
        bVar2.mo22809z(textView, new C8769v(textView, bVar2.mo22798Y()));
        bVar2.mo22809z(textView2, new C8739t(textView2, bVar2.mo22798Y()));
        View findViewById3 = findViewById.findViewById(C10766k.live_indicators);
        C5872b bVar3 = this.f28803m0;
        bVar3.mo22809z(findViewById3, new C8754u(findViewById3, bVar3.mo22798Y()));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById.findViewById(C10766k.tooltip_container);
        C8784w wVar = new C8784w(relativeLayout, this.f28790O, this.f28803m0.mo22798Y());
        this.f28803m0.mo22809z(relativeLayout, wVar);
        this.f28803m0.mo22794U(wVar);
        ImageView[] imageViewArr = this.f28794S;
        int i4 = C10766k.f49429l;
        imageViewArr[0] = (ImageView) findViewById.findViewById(i4);
        ImageView[] imageViewArr2 = this.f28794S;
        int i5 = C10766k.f49430m;
        imageViewArr2[1] = (ImageView) findViewById.findViewById(i5);
        ImageView[] imageViewArr3 = this.f28794S;
        int i6 = C10766k.f49431n;
        imageViewArr3[2] = (ImageView) findViewById.findViewById(i6);
        ImageView[] imageViewArr4 = this.f28794S;
        int i7 = C10766k.f49432o;
        imageViewArr4[3] = (ImageView) findViewById.findViewById(i7);
        m29433Y(findViewById, i4, this.f28793R[0], bVar2);
        m29433Y(findViewById, i5, this.f28793R[1], bVar2);
        m29433Y(findViewById, C10766k.f49433p, C10766k.f49438u, bVar2);
        m29433Y(findViewById, i6, this.f28793R[2], bVar2);
        m29433Y(findViewById, i7, this.f28793R[3], bVar2);
        View findViewById4 = findViewById(C10766k.f49421b);
        this.f28795T = findViewById4;
        this.f28797V = (ImageView) findViewById4.findViewById(C10766k.f49422c);
        this.f28796U = this.f28795T.findViewById(C10766k.ad_background_image_view);
        TextView textView3 = (TextView) this.f28795T.findViewById(C10766k.f49424e);
        this.f28799X = textView3;
        textView3.setTextColor(this.f28782G);
        this.f28799X.setBackgroundColor(this.f28780E);
        this.f28798W = (TextView) this.f28795T.findViewById(C10766k.f49423d);
        this.f28801Z = (TextView) findViewById(C10766k.ad_skip_text);
        TextView textView4 = (TextView) findViewById(C10766k.ad_skip_button);
        this.f28800Y = textView4;
        textView4.setOnClickListener(new C7155e(this));
        mo771K((Toolbar) findViewById(C10766k.f49420O));
        ActionBar C = mo765C();
        if (C != null) {
            C.mo719r(true);
            C.mo720s(C10764j.f49409n);
        }
        m29436b0();
        m29435a0();
        if (!(this.f28798W == null || this.f28787L == 0)) {
            if (C6492o.m28286i()) {
                this.f28798W.setTextAppearance(this.f28786K);
            } else {
                this.f28798W.setTextAppearance(getApplicationContext(), this.f28786K);
            }
            this.f28798W.setTextColor(this.f28781F);
            this.f28798W.setText(this.f28787L);
        }
        C10814b bVar4 = new C10814b(getApplicationContext(), new ImageHints(-1, this.f28797V.getWidth(), this.f28797V.getHeight()));
        this.f28802l0 = bVar4;
        bVar4.mo42980a(new C7154d(this));
        C4646v8.m21378b(C8652n7.CAF_EXPANDED_CONTROLLER);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f28802l0.mo42982c();
        C5872b bVar = this.f28803m0;
        if (bVar != null) {
            bVar.mo22793T((C4580e.C4582b) null);
            this.f28803m0.mo22774A();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(@RecentlyNonNull MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C5758b.m25464e(this).mo22535c().mo42956g(this.f28809s, C5759d.class);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C5758b.m25464e(this).mo22535c().mo42951b(this.f28809s, C5759d.class);
        C5759d d = C5758b.m25464e(this).mo22535c().mo42953d();
        if (d == null || (!d.mo42943c() && !d.mo42944d())) {
            finish();
        }
        C4580e Z = m29434Z();
        boolean z = true;
        if (Z != null && Z.mo17850o()) {
            z = false;
        }
        this.f28805o0 = z;
        m29436b0();
        m29437c0();
        super.onResume();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() ^ 2;
            if (C6492o.m28280c()) {
                systemUiVisibility ^= 4;
            }
            if (C6492o.m28283f()) {
                systemUiVisibility ^= 4096;
            }
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
            if (C6492o.m28282e()) {
                setImmersive(true);
            }
        }
    }
}
