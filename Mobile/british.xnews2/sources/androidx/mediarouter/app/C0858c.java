package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p007v4.media.MediaDescriptionCompat;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.MediaControllerCompat;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.support.p007v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.C0252a;
import androidx.mediarouter.app.OverlayListView;
import androidx.mediarouter.media.C1001r;
import androidx.mediarouter.media.C1003s;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p011b1.C1536d;
import p011b1.C1538f;
import p011b1.C1539g;
import p011b1.C1541i;
import p011b1.C1542j;
import p104l0.C5643c;

/* renamed from: androidx.mediarouter.app.c */
/* compiled from: MediaRouteControllerDialog */
public class C0858c extends C0252a {

    /* renamed from: B0 */
    static final boolean f4075B0 = Log.isLoggable("MediaRouteCtrlDialog", 3);

    /* renamed from: C0 */
    static final int f4076C0 = ((int) TimeUnit.SECONDS.toMillis(30));

    /* renamed from: A */
    private LinearLayout f4077A;

    /* renamed from: A0 */
    Runnable f4078A0;

    /* renamed from: B */
    private RelativeLayout f4079B;

    /* renamed from: C */
    private LinearLayout f4080C;

    /* renamed from: D */
    private View f4081D;

    /* renamed from: E */
    OverlayListView f4082E;

    /* renamed from: F */
    C0877r f4083F;

    /* renamed from: G */
    private List<C1003s.C1022i> f4084G;

    /* renamed from: H */
    Set<C1003s.C1022i> f4085H;

    /* renamed from: I */
    private Set<C1003s.C1022i> f4086I;

    /* renamed from: J */
    Set<C1003s.C1022i> f4087J;

    /* renamed from: K */
    SeekBar f4088K;

    /* renamed from: L */
    C0875q f4089L;

    /* renamed from: M */
    C1003s.C1022i f4090M;

    /* renamed from: N */
    private int f4091N;

    /* renamed from: O */
    private int f4092O;

    /* renamed from: P */
    private int f4093P;

    /* renamed from: Q */
    private final int f4094Q;

    /* renamed from: R */
    Map<C1003s.C1022i, SeekBar> f4095R;

    /* renamed from: S */
    MediaControllerCompat f4096S;

    /* renamed from: T */
    C0873o f4097T;

    /* renamed from: U */
    PlaybackStateCompat f4098U;

    /* renamed from: V */
    MediaDescriptionCompat f4099V;

    /* renamed from: W */
    C0872n f4100W;

    /* renamed from: X */
    Bitmap f4101X;

    /* renamed from: Y */
    Uri f4102Y;

    /* renamed from: Z */
    boolean f4103Z;

    /* renamed from: e */
    final C1003s f4104e;

    /* renamed from: f */
    private final C0874p f4105f;

    /* renamed from: g */
    final C1003s.C1022i f4106g;

    /* renamed from: h */
    Context f4107h;

    /* renamed from: i */
    private boolean f4108i;

    /* renamed from: j */
    private boolean f4109j;

    /* renamed from: k */
    private int f4110k;

    /* renamed from: l */
    private View f4111l;

    /* renamed from: l0 */
    Bitmap f4112l0;

    /* renamed from: m */
    private Button f4113m;

    /* renamed from: m0 */
    int f4114m0;

    /* renamed from: n */
    private Button f4115n;

    /* renamed from: n0 */
    boolean f4116n0;

    /* renamed from: o */
    private ImageButton f4117o;

    /* renamed from: o0 */
    boolean f4118o0;

    /* renamed from: p */
    private ImageButton f4119p;

    /* renamed from: p0 */
    boolean f4120p0;

    /* renamed from: q */
    private MediaRouteExpandCollapseButton f4121q;

    /* renamed from: q0 */
    boolean f4122q0;

    /* renamed from: r */
    private FrameLayout f4123r;

    /* renamed from: r0 */
    boolean f4124r0;

    /* renamed from: s */
    private LinearLayout f4125s;

    /* renamed from: s0 */
    int f4126s0;

    /* renamed from: t */
    FrameLayout f4127t;

    /* renamed from: t0 */
    private int f4128t0;

    /* renamed from: u */
    private FrameLayout f4129u;

    /* renamed from: u0 */
    private int f4130u0;

    /* renamed from: v */
    private ImageView f4131v;

    /* renamed from: v0 */
    private Interpolator f4132v0;

    /* renamed from: w */
    private TextView f4133w;

    /* renamed from: w0 */
    private Interpolator f4134w0;

    /* renamed from: x */
    private TextView f4135x;

    /* renamed from: x0 */
    private Interpolator f4136x0;

    /* renamed from: y */
    private TextView f4137y;

    /* renamed from: y0 */
    private Interpolator f4138y0;

    /* renamed from: z */
    private boolean f4139z;

    /* renamed from: z0 */
    final AccessibilityManager f4140z0;

    /* renamed from: androidx.mediarouter.app.c$a */
    /* compiled from: MediaRouteControllerDialog */
    class C0859a implements OverlayListView.C0850a.C0851a {

        /* renamed from: a */
        final /* synthetic */ C1003s.C1022i f4141a;

        C0859a(C1003s.C1022i iVar) {
            this.f4141a = iVar;
        }

        /* renamed from: a */
        public void mo4224a() {
            C0858c.this.f4087J.remove(this.f4141a);
            C0858c.this.f4083F.notifyDataSetChanged();
        }
    }

    /* renamed from: androidx.mediarouter.app.c$b */
    /* compiled from: MediaRouteControllerDialog */
    class C0860b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0860b() {
        }

        public void onGlobalLayout() {
            C0858c.this.f4082E.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            C0858c.this.mo4248G();
        }
    }

    /* renamed from: androidx.mediarouter.app.c$c */
    /* compiled from: MediaRouteControllerDialog */
    class C0861c implements Animation.AnimationListener {
        C0861c() {
        }

        public void onAnimationEnd(Animation animation) {
            C0858c.this.mo4260q(true);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.mediarouter.app.c$d */
    /* compiled from: MediaRouteControllerDialog */
    class C0862d implements Runnable {
        C0862d() {
        }

        public void run() {
            C0858c.this.mo4247F();
        }
    }

    /* renamed from: androidx.mediarouter.app.c$e */
    /* compiled from: MediaRouteControllerDialog */
    class C0863e implements View.OnClickListener {
        C0863e() {
        }

        public void onClick(View view) {
            C0858c.this.dismiss();
        }
    }

    /* renamed from: androidx.mediarouter.app.c$f */
    /* compiled from: MediaRouteControllerDialog */
    class C0864f implements View.OnClickListener {
        C0864f() {
        }

        public void onClick(View view) {
        }
    }

    /* renamed from: androidx.mediarouter.app.c$g */
    /* compiled from: MediaRouteControllerDialog */
    class C0865g implements View.OnClickListener {
        C0865g() {
        }

        public void onClick(View view) {
            PendingIntent d;
            MediaControllerCompat mediaControllerCompat = C0858c.this.f4096S;
            if (mediaControllerCompat != null && (d = mediaControllerCompat.mo350d()) != null) {
                try {
                    d.send();
                    C0858c.this.dismiss();
                } catch (PendingIntent.CanceledException unused) {
                    Log.e("MediaRouteCtrlDialog", d + " was not sent, it had been canceled.");
                }
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.c$h */
    /* compiled from: MediaRouteControllerDialog */
    class C0866h implements View.OnClickListener {
        C0866h() {
        }

        public void onClick(View view) {
            C0858c cVar = C0858c.this;
            boolean z = !cVar.f4120p0;
            cVar.f4120p0 = z;
            if (z) {
                cVar.f4082E.setVisibility(0);
            }
            C0858c.this.mo4245A();
            C0858c.this.mo4252K(true);
        }
    }

    /* renamed from: androidx.mediarouter.app.c$i */
    /* compiled from: MediaRouteControllerDialog */
    class C0867i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        final /* synthetic */ boolean f4150b;

        C0867i(boolean z) {
            this.f4150b = z;
        }

        public void onGlobalLayout() {
            C0858c.this.f4127t.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            C0858c cVar = C0858c.this;
            if (cVar.f4122q0) {
                cVar.f4124r0 = true;
            } else {
                cVar.mo4253L(this.f4150b);
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.c$j */
    /* compiled from: MediaRouteControllerDialog */
    class C0868j extends Animation {

        /* renamed from: b */
        final /* synthetic */ int f4152b;

        /* renamed from: c */
        final /* synthetic */ int f4153c;

        /* renamed from: d */
        final /* synthetic */ View f4154d;

        C0868j(int i, int i2, View view) {
            this.f4152b = i;
            this.f4153c = i2;
            this.f4154d = view;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            int i = this.f4152b;
            C0858c.m4526D(this.f4154d, i - ((int) (((float) (i - this.f4153c)) * f)));
        }
    }

    /* renamed from: androidx.mediarouter.app.c$k */
    /* compiled from: MediaRouteControllerDialog */
    class C0869k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        final /* synthetic */ Map f4156b;

        /* renamed from: c */
        final /* synthetic */ Map f4157c;

        C0869k(Map map, Map map2) {
            this.f4156b = map;
            this.f4157c = map2;
        }

        public void onGlobalLayout() {
            C0858c.this.f4082E.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            C0858c.this.mo4255i(this.f4156b, this.f4157c);
        }
    }

    /* renamed from: androidx.mediarouter.app.c$l */
    /* compiled from: MediaRouteControllerDialog */
    class C0870l implements Animation.AnimationListener {
        C0870l() {
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            C0858c.this.f4082E.mo4211b();
            C0858c cVar = C0858c.this;
            cVar.f4082E.postDelayed(cVar.f4078A0, (long) cVar.f4126s0);
        }
    }

    /* renamed from: androidx.mediarouter.app.c$m */
    /* compiled from: MediaRouteControllerDialog */
    private final class C0871m implements View.OnClickListener {
        C0871m() {
        }

        public void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            int id = view.getId();
            int i = 1;
            if (id == 16908313 || id == 16908314) {
                if (C0858c.this.f4106g.mo4786C()) {
                    C1003s sVar = C0858c.this.f4104e;
                    if (id == 16908313) {
                        i = 2;
                    }
                    sVar.mo4717v(i);
                }
                C0858c.this.dismiss();
            } else if (id == C1538f.mr_control_playback_ctrl) {
                C0858c cVar = C0858c.this;
                if (cVar.f4096S != null && (playbackStateCompat = cVar.f4098U) != null) {
                    int i2 = 0;
                    if (playbackStateCompat.mo602h() != 3) {
                        i = 0;
                    }
                    if (i != 0 && C0858c.this.mo4262w()) {
                        C0858c.this.f4096S.mo351e().mo402a();
                        i2 = C1542j.mr_controller_pause;
                    } else if (i != 0 && C0858c.this.mo4264y()) {
                        C0858c.this.f4096S.mo351e().mo404c();
                        i2 = C1542j.mr_controller_stop;
                    } else if (i == 0 && C0858c.this.mo4263x()) {
                        C0858c.this.f4096S.mo351e().mo403b();
                        i2 = C1542j.mr_controller_play;
                    }
                    AccessibilityManager accessibilityManager = C0858c.this.f4140z0;
                    if (accessibilityManager != null && accessibilityManager.isEnabled() && i2 != 0) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                        obtain.setPackageName(C0858c.this.f4107h.getPackageName());
                        obtain.setClassName(C0871m.class.getName());
                        obtain.getText().add(C0858c.this.f4107h.getString(i2));
                        C0858c.this.f4140z0.sendAccessibilityEvent(obtain);
                    }
                }
            } else if (id == C1538f.mr_close) {
                C0858c.this.dismiss();
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.c$n */
    /* compiled from: MediaRouteControllerDialog */
    private class C0872n extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        private final Bitmap f4161a;

        /* renamed from: b */
        private final Uri f4162b;

        /* renamed from: c */
        private int f4163c;

        /* renamed from: d */
        private long f4164d;

        C0872n() {
            MediaDescriptionCompat mediaDescriptionCompat = C0858c.this.f4099V;
            Uri uri = null;
            Bitmap b = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.mo300b();
            if (C0858c.m4538u(b)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                b = null;
            }
            this.f4161a = b;
            MediaDescriptionCompat mediaDescriptionCompat2 = C0858c.this.f4099V;
            this.f4162b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.mo301d() : uri;
        }

        /* renamed from: e */
        private InputStream m4560e(Uri uri) throws IOException {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = C0858c.this.f4107h.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                int i = C0858c.f4076C0;
                openConnection.setConnectTimeout(i);
                openConnection.setReadTimeout(i);
                inputStream = openConnection.getInputStream();
            }
            if (inputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStream);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0048 */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[Catch:{ IOException -> 0x009d }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00b9 A[SYNTHETIC, Splitter:B:54:0x00b9] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00c1 A[SYNTHETIC, Splitter:B:59:0x00c1] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00e1 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r10) {
            /*
                r9 = this;
                java.lang.String r10 = "Unable to open: "
                android.graphics.Bitmap r0 = r9.f4161a
                r1 = 0
                r2 = 1
                java.lang.String r3 = "MediaRouteCtrlDialog"
                r4 = 0
                if (r0 == 0) goto L_0x000d
                goto L_0x00c6
            L_0x000d:
                android.net.Uri r0 = r9.f4162b
                if (r0 == 0) goto L_0x00c5
                java.io.InputStream r0 = r9.m4560e(r0)     // Catch:{ IOException -> 0x00a1, all -> 0x009f }
                if (r0 != 0) goto L_0x0031
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009d }
                r5.<init>()     // Catch:{ IOException -> 0x009d }
                r5.append(r10)     // Catch:{ IOException -> 0x009d }
                android.net.Uri r6 = r9.f4162b     // Catch:{ IOException -> 0x009d }
                r5.append(r6)     // Catch:{ IOException -> 0x009d }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x009d }
                android.util.Log.w(r3, r5)     // Catch:{ IOException -> 0x009d }
                if (r0 == 0) goto L_0x0030
                r0.close()     // Catch:{ IOException -> 0x0030 }
            L_0x0030:
                return r4
            L_0x0031:
                android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x009d }
                r5.<init>()     // Catch:{ IOException -> 0x009d }
                r5.inJustDecodeBounds = r2     // Catch:{ IOException -> 0x009d }
                android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch:{ IOException -> 0x009d }
                int r6 = r5.outWidth     // Catch:{ IOException -> 0x009d }
                if (r6 == 0) goto L_0x0099
                int r6 = r5.outHeight     // Catch:{ IOException -> 0x009d }
                if (r6 != 0) goto L_0x0044
                goto L_0x0099
            L_0x0044:
                r0.reset()     // Catch:{ IOException -> 0x0048 }
                goto L_0x006d
            L_0x0048:
                r0.close()     // Catch:{ IOException -> 0x009d }
                android.net.Uri r6 = r9.f4162b     // Catch:{ IOException -> 0x009d }
                java.io.InputStream r0 = r9.m4560e(r6)     // Catch:{ IOException -> 0x009d }
                if (r0 != 0) goto L_0x006d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009d }
                r5.<init>()     // Catch:{ IOException -> 0x009d }
                r5.append(r10)     // Catch:{ IOException -> 0x009d }
                android.net.Uri r6 = r9.f4162b     // Catch:{ IOException -> 0x009d }
                r5.append(r6)     // Catch:{ IOException -> 0x009d }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x009d }
                android.util.Log.w(r3, r5)     // Catch:{ IOException -> 0x009d }
                if (r0 == 0) goto L_0x006c
                r0.close()     // Catch:{ IOException -> 0x006c }
            L_0x006c:
                return r4
            L_0x006d:
                r5.inJustDecodeBounds = r1     // Catch:{ IOException -> 0x009d }
                androidx.mediarouter.app.c r6 = androidx.mediarouter.app.C0858c.this     // Catch:{ IOException -> 0x009d }
                int r7 = r5.outWidth     // Catch:{ IOException -> 0x009d }
                int r8 = r5.outHeight     // Catch:{ IOException -> 0x009d }
                int r6 = r6.mo4261r(r7, r8)     // Catch:{ IOException -> 0x009d }
                int r7 = r5.outHeight     // Catch:{ IOException -> 0x009d }
                int r7 = r7 / r6
                int r6 = java.lang.Integer.highestOneBit(r7)     // Catch:{ IOException -> 0x009d }
                int r6 = java.lang.Math.max(r2, r6)     // Catch:{ IOException -> 0x009d }
                r5.inSampleSize = r6     // Catch:{ IOException -> 0x009d }
                boolean r6 = r9.isCancelled()     // Catch:{ IOException -> 0x009d }
                if (r6 == 0) goto L_0x0090
                r0.close()     // Catch:{ IOException -> 0x008f }
            L_0x008f:
                return r4
            L_0x0090:
                android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch:{ IOException -> 0x009d }
                r0.close()     // Catch:{ IOException -> 0x0097 }
            L_0x0097:
                r0 = r10
                goto L_0x00c6
            L_0x0099:
                r0.close()     // Catch:{ IOException -> 0x009c }
            L_0x009c:
                return r4
            L_0x009d:
                r5 = move-exception
                goto L_0x00a3
            L_0x009f:
                r10 = move-exception
                goto L_0x00bf
            L_0x00a1:
                r5 = move-exception
                r0 = r4
            L_0x00a3:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
                r6.<init>()     // Catch:{ all -> 0x00bd }
                r6.append(r10)     // Catch:{ all -> 0x00bd }
                android.net.Uri r10 = r9.f4162b     // Catch:{ all -> 0x00bd }
                r6.append(r10)     // Catch:{ all -> 0x00bd }
                java.lang.String r10 = r6.toString()     // Catch:{ all -> 0x00bd }
                android.util.Log.w(r3, r10, r5)     // Catch:{ all -> 0x00bd }
                if (r0 == 0) goto L_0x00c5
                r0.close()     // Catch:{ IOException -> 0x00c5 }
                goto L_0x00c5
            L_0x00bd:
                r10 = move-exception
                r4 = r0
            L_0x00bf:
                if (r4 == 0) goto L_0x00c4
                r4.close()     // Catch:{ IOException -> 0x00c4 }
            L_0x00c4:
                throw r10
            L_0x00c5:
                r0 = r4
            L_0x00c6:
                boolean r10 = androidx.mediarouter.app.C0858c.m4538u(r0)
                if (r10 == 0) goto L_0x00e1
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = "Can't use recycled bitmap: "
                r10.append(r1)
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                android.util.Log.w(r3, r10)
                return r4
            L_0x00e1:
                if (r0 == 0) goto L_0x0115
                int r10 = r0.getWidth()
                int r3 = r0.getHeight()
                if (r10 >= r3) goto L_0x0115
                e1.b$b r10 = new e1.b$b
                r10.<init>(r0)
                e1.b$b r10 = r10.mo21402c(r2)
                e1.b r10 = r10.mo21401a()
                java.util.List r2 = r10.mo21398h()
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0105
                goto L_0x0113
            L_0x0105:
                java.util.List r10 = r10.mo21398h()
                java.lang.Object r10 = r10.get(r1)
                e1.b$d r10 = (p069e1.C5199b.C5203d) r10
                int r1 = r10.mo21406e()
            L_0x0113:
                r9.f4163c = r1
            L_0x0115:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C0858c.C0872n.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        /* renamed from: b */
        public Bitmap mo4283b() {
            return this.f4161a;
        }

        /* renamed from: c */
        public Uri mo4284c() {
            return this.f4162b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void onPostExecute(Bitmap bitmap) {
            C0858c cVar = C0858c.this;
            cVar.f4100W = null;
            if (!C5643c.m24954a(cVar.f4101X, this.f4161a) || !C5643c.m24954a(C0858c.this.f4102Y, this.f4162b)) {
                C0858c cVar2 = C0858c.this;
                cVar2.f4101X = this.f4161a;
                cVar2.f4112l0 = bitmap;
                cVar2.f4102Y = this.f4162b;
                cVar2.f4114m0 = this.f4163c;
                boolean z = true;
                cVar2.f4103Z = true;
                long uptimeMillis = SystemClock.uptimeMillis() - this.f4164d;
                C0858c cVar3 = C0858c.this;
                if (uptimeMillis <= 120) {
                    z = false;
                }
                cVar3.mo4249H(z);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f4164d = SystemClock.uptimeMillis();
            C0858c.this.mo4257o();
        }
    }

    /* renamed from: androidx.mediarouter.app.c$o */
    /* compiled from: MediaRouteControllerDialog */
    private final class C0873o extends MediaControllerCompat.C0144a {
        C0873o() {
        }

        /* renamed from: d */
        public void mo375d(MediaMetadataCompat mediaMetadataCompat) {
            C0858c.this.f4099V = mediaMetadataCompat == null ? null : mediaMetadataCompat.mo326f();
            C0858c.this.mo4250I();
            C0858c.this.mo4249H(false);
        }

        /* renamed from: e */
        public void mo376e(PlaybackStateCompat playbackStateCompat) {
            C0858c cVar = C0858c.this;
            cVar.f4098U = playbackStateCompat;
            cVar.mo4249H(false);
        }

        /* renamed from: i */
        public void mo380i() {
            C0858c cVar = C0858c.this;
            MediaControllerCompat mediaControllerCompat = cVar.f4096S;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.mo354h(cVar.f4097T);
                C0858c.this.f4096S = null;
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.c$p */
    /* compiled from: MediaRouteControllerDialog */
    private final class C0874p extends C1003s.C1005b {
        C0874p() {
        }

        /* renamed from: e */
        public void mo4169e(C1003s sVar, C1003s.C1022i iVar) {
            C0858c.this.mo4249H(true);
        }

        /* renamed from: k */
        public void mo4197k(C1003s sVar, C1003s.C1022i iVar) {
            C0858c.this.mo4249H(false);
        }

        /* renamed from: m */
        public void mo4289m(C1003s sVar, C1003s.C1022i iVar) {
            SeekBar seekBar = C0858c.this.f4095R.get(iVar);
            int s = iVar.mo4813s();
            if (C0858c.f4075B0) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + s);
            }
            if (seekBar != null && C0858c.this.f4090M != iVar) {
                seekBar.setProgress(s);
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.c$q */
    /* compiled from: MediaRouteControllerDialog */
    private class C0875q implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        private final Runnable f4168b = new C0876a();

        /* renamed from: androidx.mediarouter.app.c$q$a */
        /* compiled from: MediaRouteControllerDialog */
        class C0876a implements Runnable {
            C0876a() {
            }

            public void run() {
                C0858c cVar = C0858c.this;
                if (cVar.f4090M != null) {
                    cVar.f4090M = null;
                    if (cVar.f4116n0) {
                        cVar.mo4249H(cVar.f4118o0);
                    }
                }
            }
        }

        C0875q() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C1003s.C1022i iVar = (C1003s.C1022i) seekBar.getTag();
                if (C0858c.f4075B0) {
                    Log.d("MediaRouteCtrlDialog", "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i + ")");
                }
                iVar.mo4789G(i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C0858c cVar = C0858c.this;
            if (cVar.f4090M != null) {
                cVar.f4088K.removeCallbacks(this.f4168b);
            }
            C0858c.this.f4090M = (C1003s.C1022i) seekBar.getTag();
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C0858c.this.f4088K.postDelayed(this.f4168b, 500);
        }
    }

    /* renamed from: androidx.mediarouter.app.c$r */
    /* compiled from: MediaRouteControllerDialog */
    private class C0877r extends ArrayAdapter<C1003s.C1022i> {

        /* renamed from: b */
        final float f4171b;

        public C0877r(Context context, List<C1003s.C1022i> list) {
            super(context, 0, list);
            this.f4171b = C0912i.m4669h(context);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2;
            int i3 = 0;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C1541i.mr_controller_volume_item, viewGroup, false);
            } else {
                C0858c.this.mo4254P(view);
            }
            C1003s.C1022i iVar = (C1003s.C1022i) getItem(i);
            if (iVar != null) {
                boolean x = iVar.mo4819x();
                TextView textView = (TextView) view.findViewById(C1538f.mr_name);
                textView.setEnabled(x);
                textView.setText(iVar.mo4807m());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(C1538f.mr_volume_slider);
                C0912i.m4684w(viewGroup.getContext(), mediaRouteVolumeSlider, C0858c.this.f4082E);
                mediaRouteVolumeSlider.setTag(iVar);
                C0858c.this.f4095R.put(iVar, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.mo4208c(!x);
                mediaRouteVolumeSlider.setEnabled(x);
                if (x) {
                    if (C0858c.this.mo4265z(iVar)) {
                        mediaRouteVolumeSlider.setMax(iVar.mo4816u());
                        mediaRouteVolumeSlider.setProgress(iVar.mo4813s());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(C0858c.this.f4089L);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ImageView imageView = (ImageView) view.findViewById(C1538f.mr_volume_item_icon);
                if (x) {
                    i2 = 255;
                } else {
                    i2 = (int) (this.f4171b * 255.0f);
                }
                imageView.setAlpha(i2);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C1538f.volume_item_container);
                if (C0858c.this.f4087J.contains(iVar)) {
                    i3 = 4;
                }
                linearLayout.setVisibility(i3);
                Set<C1003s.C1022i> set = C0858c.this.f4085H;
                if (set != null && set.contains(iVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        public boolean isEnabled(int i) {
            return false;
        }
    }

    public C0858c(Context context) {
        this(context, 0);
    }

    /* renamed from: C */
    private void m4525C(boolean z) {
        List<C1003s.C1022i> l = this.f4106g.mo4806l();
        if (l.isEmpty()) {
            this.f4084G.clear();
            this.f4083F.notifyDataSetChanged();
        } else if (C0880f.m4589i(this.f4084G, l)) {
            this.f4083F.notifyDataSetChanged();
        } else {
            HashMap e = z ? C0880f.m4585e(this.f4082E, this.f4083F) : null;
            HashMap d = z ? C0880f.m4584d(this.f4107h, this.f4082E, this.f4083F) : null;
            this.f4085H = C0880f.m4586f(this.f4084G, l);
            this.f4086I = C0880f.m4587g(this.f4084G, l);
            this.f4084G.addAll(0, this.f4085H);
            this.f4084G.removeAll(this.f4086I);
            this.f4083F.notifyDataSetChanged();
            if (!z || !this.f4120p0 || this.f4085H.size() + this.f4086I.size() <= 0) {
                this.f4085H = null;
                this.f4086I = null;
                return;
            }
            m4532h(e, d);
        }
    }

    /* renamed from: D */
    static void m4526D(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: E */
    private void m4527E(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.f4096S;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.mo354h(this.f4097T);
            this.f4096S = null;
        }
        if (token != null && this.f4109j) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.f4107h, token);
            this.f4096S = mediaControllerCompat2;
            mediaControllerCompat2.mo352f(this.f4097T);
            MediaMetadataCompat b = this.f4096S.mo348b();
            if (b != null) {
                mediaDescriptionCompat = b.mo326f();
            }
            this.f4099V = mediaDescriptionCompat;
            this.f4098U = this.f4096S.mo349c();
            mo4250I();
            mo4249H(false);
        }
    }

    /* renamed from: M */
    private void m4528M(boolean z) {
        int i = 0;
        this.f4081D.setVisibility((this.f4080C.getVisibility() != 0 || !z) ? 8 : 0);
        LinearLayout linearLayout = this.f4077A;
        if (this.f4080C.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4529N() {
        /*
            r8 = this;
            boolean r0 = r8.m4534m()
            if (r0 == 0) goto L_0x00ed
            android.support.v4.media.MediaDescriptionCompat r0 = r8.f4099V
            r1 = 0
            if (r0 != 0) goto L_0x000d
            r0 = r1
            goto L_0x0011
        L_0x000d:
            java.lang.CharSequence r0 = r0.mo306h()
        L_0x0011:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            r2 = r2 ^ r3
            android.support.v4.media.MediaDescriptionCompat r4 = r8.f4099V
            if (r4 != 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            java.lang.CharSequence r1 = r4.mo305g()
        L_0x0020:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            r4 = r4 ^ r3
            androidx.mediarouter.media.s$i r5 = r8.f4106g
            int r5 = r5.mo4810p()
            r6 = -1
            r7 = 0
            if (r5 == r6) goto L_0x0039
            android.widget.TextView r0 = r8.f4133w
            int r1 = p011b1.C1542j.mr_controller_casting_screen
            r0.setText(r1)
        L_0x0036:
            r0 = 1
        L_0x0037:
            r1 = 0
            goto L_0x006b
        L_0x0039:
            android.support.v4.media.session.PlaybackStateCompat r5 = r8.f4098U
            if (r5 == 0) goto L_0x0063
            int r5 = r5.mo602h()
            if (r5 != 0) goto L_0x0044
            goto L_0x0063
        L_0x0044:
            if (r2 != 0) goto L_0x0050
            if (r4 != 0) goto L_0x0050
            android.widget.TextView r0 = r8.f4133w
            int r1 = p011b1.C1542j.mr_controller_no_info_available
            r0.setText(r1)
            goto L_0x0036
        L_0x0050:
            if (r2 == 0) goto L_0x0059
            android.widget.TextView r2 = r8.f4133w
            r2.setText(r0)
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r4 == 0) goto L_0x0037
            android.widget.TextView r2 = r8.f4135x
            r2.setText(r1)
            r1 = 1
            goto L_0x006b
        L_0x0063:
            android.widget.TextView r0 = r8.f4133w
            int r1 = p011b1.C1542j.mr_controller_no_media_selected
            r0.setText(r1)
            goto L_0x0036
        L_0x006b:
            android.widget.TextView r2 = r8.f4133w
            r4 = 8
            if (r0 == 0) goto L_0x0073
            r0 = 0
            goto L_0x0075
        L_0x0073:
            r0 = 8
        L_0x0075:
            r2.setVisibility(r0)
            android.widget.TextView r0 = r8.f4135x
            if (r1 == 0) goto L_0x007e
            r1 = 0
            goto L_0x0080
        L_0x007e:
            r1 = 8
        L_0x0080:
            r0.setVisibility(r1)
            android.support.v4.media.session.PlaybackStateCompat r0 = r8.f4098U
            if (r0 == 0) goto L_0x00ed
            int r0 = r0.mo602h()
            r1 = 6
            if (r0 == r1) goto L_0x009a
            android.support.v4.media.session.PlaybackStateCompat r0 = r8.f4098U
            int r0 = r0.mo602h()
            r1 = 3
            if (r0 != r1) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r0 = 0
            goto L_0x009b
        L_0x009a:
            r0 = 1
        L_0x009b:
            android.widget.ImageButton r1 = r8.f4117o
            android.content.Context r1 = r1.getContext()
            if (r0 == 0) goto L_0x00ae
            boolean r2 = r8.mo4262w()
            if (r2 == 0) goto L_0x00ae
            int r0 = p011b1.C1533a.mediaRoutePauseDrawable
            int r2 = p011b1.C1542j.mr_controller_pause
            goto L_0x00cb
        L_0x00ae:
            if (r0 == 0) goto L_0x00bb
            boolean r2 = r8.mo4264y()
            if (r2 == 0) goto L_0x00bb
            int r0 = p011b1.C1533a.mediaRouteStopDrawable
            int r2 = p011b1.C1542j.mr_controller_stop
            goto L_0x00cb
        L_0x00bb:
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r8.mo4263x()
            if (r0 == 0) goto L_0x00c8
            int r0 = p011b1.C1533a.mediaRoutePlayDrawable
            int r2 = p011b1.C1542j.mr_controller_play
            goto L_0x00cb
        L_0x00c8:
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x00cb:
            android.widget.ImageButton r5 = r8.f4117o
            if (r3 == 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r7 = 8
        L_0x00d2:
            r5.setVisibility(r7)
            if (r3 == 0) goto L_0x00ed
            android.widget.ImageButton r3 = r8.f4117o
            int r0 = androidx.mediarouter.app.C0912i.m4677p(r1, r0)
            r3.setImageResource(r0)
            android.widget.ImageButton r0 = r8.f4117o
            android.content.res.Resources r1 = r1.getResources()
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setContentDescription(r1)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C0858c.m4529N():void");
    }

    /* renamed from: O */
    private void m4530O() {
        int i = 8;
        if (!mo4265z(this.f4106g)) {
            this.f4080C.setVisibility(8);
        } else if (this.f4080C.getVisibility() == 8) {
            this.f4080C.setVisibility(0);
            this.f4088K.setMax(this.f4106g.mo4816u());
            this.f4088K.setProgress(this.f4106g.mo4813s());
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.f4121q;
            if (this.f4106g.mo4820y()) {
                i = 0;
            }
            mediaRouteExpandCollapseButton.setVisibility(i);
        }
    }

    /* renamed from: Q */
    private static boolean m4531Q(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    /* renamed from: h */
    private void m4532h(Map<C1003s.C1022i, Rect> map, Map<C1003s.C1022i, BitmapDrawable> map2) {
        this.f4082E.setEnabled(false);
        this.f4082E.requestLayout();
        this.f4122q0 = true;
        this.f4082E.getViewTreeObserver().addOnGlobalLayoutListener(new C0869k(map, map2));
    }

    /* renamed from: k */
    private void m4533k(View view, int i) {
        C0868j jVar = new C0868j(m4536s(view), i, view);
        jVar.setDuration((long) this.f4126s0);
        if (Build.VERSION.SDK_INT >= 21) {
            jVar.setInterpolator(this.f4132v0);
        }
        view.startAnimation(jVar);
    }

    /* renamed from: m */
    private boolean m4534m() {
        return this.f4111l == null && !(this.f4099V == null && this.f4098U == null);
    }

    /* renamed from: p */
    private void m4535p() {
        C0861c cVar = new C0861c();
        int firstVisiblePosition = this.f4082E.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < this.f4082E.getChildCount(); i++) {
            View childAt = this.f4082E.getChildAt(i);
            C0877r rVar = this.f4083F;
            if (this.f4085H.contains((C1003s.C1022i) rVar.getItem(firstVisiblePosition + i))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) this.f4128t0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(cVar);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    /* renamed from: s */
    private static int m4536s(View view) {
        return view.getLayoutParams().height;
    }

    /* renamed from: t */
    private int m4537t(boolean z) {
        if (!z && this.f4080C.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = 0 + this.f4077A.getPaddingTop() + this.f4077A.getPaddingBottom();
        if (z) {
            paddingTop += this.f4079B.getMeasuredHeight();
        }
        if (this.f4080C.getVisibility() == 0) {
            paddingTop += this.f4080C.getMeasuredHeight();
        }
        return (!z || this.f4080C.getVisibility() != 0) ? paddingTop : paddingTop + this.f4081D.getMeasuredHeight();
    }

    /* renamed from: u */
    static boolean m4538u(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* renamed from: v */
    private boolean m4539v() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f4099V;
        Uri uri = null;
        Bitmap b = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.mo300b();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f4099V;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.mo301d();
        }
        C0872n nVar = this.f4100W;
        Bitmap b2 = nVar == null ? this.f4101X : nVar.mo4283b();
        C0872n nVar2 = this.f4100W;
        Uri c = nVar2 == null ? this.f4102Y : nVar2.mo4284c();
        if (b2 != b) {
            return true;
        }
        if (b2 != null || m4531Q(c, uri)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo4245A() {
        Interpolator interpolator;
        if (Build.VERSION.SDK_INT >= 21) {
            if (this.f4120p0) {
                interpolator = this.f4134w0;
            } else {
                interpolator = this.f4136x0;
            }
            this.f4132v0 = interpolator;
            return;
        }
        this.f4132v0 = this.f4138y0;
    }

    /* renamed from: B */
    public View mo4246B(Bundle bundle) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo4247F() {
        mo4256n(true);
        this.f4082E.requestLayout();
        this.f4082E.getViewTreeObserver().addOnGlobalLayoutListener(new C0860b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo4248G() {
        Set<C1003s.C1022i> set = this.f4085H;
        if (set == null || set.size() == 0) {
            mo4260q(true);
        } else {
            m4535p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo4249H(boolean z) {
        if (this.f4090M != null) {
            this.f4116n0 = true;
            this.f4118o0 = z | this.f4118o0;
            return;
        }
        int i = 0;
        this.f4116n0 = false;
        this.f4118o0 = false;
        if (!this.f4106g.mo4786C() || this.f4106g.mo4818w()) {
            dismiss();
        } else if (this.f4108i) {
            this.f4137y.setText(this.f4106g.mo4807m());
            Button button = this.f4113m;
            if (!this.f4106g.mo4795a()) {
                i = 8;
            }
            button.setVisibility(i);
            if (this.f4111l == null && this.f4103Z) {
                if (m4538u(this.f4112l0)) {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f4112l0);
                } else {
                    this.f4131v.setImageBitmap(this.f4112l0);
                    this.f4131v.setBackgroundColor(this.f4114m0);
                }
                mo4257o();
            }
            m4530O();
            m4529N();
            mo4252K(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo4250I() {
        if (this.f4111l == null && m4539v()) {
            C0872n nVar = this.f4100W;
            if (nVar != null) {
                nVar.cancel(true);
            }
            C0872n nVar2 = new C0872n();
            this.f4100W = nVar2;
            nVar2.execute(new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo4251J() {
        int b = C0880f.m4582b(this.f4107h);
        getWindow().setLayout(b, -2);
        View decorView = getWindow().getDecorView();
        this.f4110k = (b - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.f4107h.getResources();
        this.f4091N = resources.getDimensionPixelSize(C1536d.mr_controller_volume_group_list_item_icon_size);
        this.f4092O = resources.getDimensionPixelSize(C1536d.mr_controller_volume_group_list_item_height);
        this.f4093P = resources.getDimensionPixelSize(C1536d.mr_controller_volume_group_list_max_height);
        this.f4101X = null;
        this.f4102Y = null;
        mo4250I();
        mo4249H(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo4252K(boolean z) {
        this.f4127t.requestLayout();
        this.f4127t.getViewTreeObserver().addOnGlobalLayoutListener(new C0867i(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo4253L(boolean z) {
        int i;
        Bitmap bitmap;
        int s = m4536s(this.f4077A);
        m4526D(this.f4077A, -1);
        m4528M(m4534m());
        View decorView = getWindow().getDecorView();
        boolean z2 = false;
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
        m4526D(this.f4077A, s);
        if (this.f4111l != null || !(this.f4131v.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) this.f4131v.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = mo4261r(bitmap.getWidth(), bitmap.getHeight());
            this.f4131v.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int t = m4537t(m4534m());
        int size = this.f4084G.size();
        int size2 = this.f4106g.mo4820y() ? this.f4092O * this.f4106g.mo4806l().size() : 0;
        if (size > 0) {
            size2 += this.f4094Q;
        }
        int min = Math.min(size2, this.f4093P);
        if (!this.f4120p0) {
            min = 0;
        }
        int max = Math.max(i, min) + t;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (this.f4125s.getMeasuredHeight() - this.f4127t.getMeasuredHeight());
        if (this.f4111l != null || i <= 0 || max > height) {
            if (m4536s(this.f4082E) + this.f4077A.getMeasuredHeight() >= this.f4127t.getMeasuredHeight()) {
                this.f4131v.setVisibility(8);
            }
            max = min + t;
            i = 0;
        } else {
            this.f4131v.setVisibility(0);
            m4526D(this.f4131v, i);
        }
        if (!m4534m() || max > height) {
            this.f4079B.setVisibility(8);
        } else {
            this.f4079B.setVisibility(0);
        }
        m4528M(this.f4079B.getVisibility() == 0);
        if (this.f4079B.getVisibility() == 0) {
            z2 = true;
        }
        int t2 = m4537t(z2);
        int max2 = Math.max(i, min) + t2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        this.f4077A.clearAnimation();
        this.f4082E.clearAnimation();
        this.f4127t.clearAnimation();
        if (z) {
            m4533k(this.f4077A, t2);
            m4533k(this.f4082E, min);
            m4533k(this.f4127t, height);
        } else {
            m4526D(this.f4077A, t2);
            m4526D(this.f4082E, min);
            m4526D(this.f4127t, height);
        }
        m4526D(this.f4123r, rect.height());
        m4525C(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo4254P(View view) {
        m4526D((LinearLayout) view.findViewById(C1538f.volume_item_container), this.f4092O);
        View findViewById = view.findViewById(C1538f.mr_volume_item_icon);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        int i = this.f4091N;
        layoutParams.width = i;
        layoutParams.height = i;
        findViewById.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4255i(Map<C1003s.C1022i, Rect> map, Map<C1003s.C1022i, BitmapDrawable> map2) {
        OverlayListView.C0850a aVar;
        int i;
        Map<C1003s.C1022i, Rect> map3 = map;
        Set<C1003s.C1022i> set = this.f4085H;
        if (set != null && this.f4086I != null) {
            int size = set.size() - this.f4086I.size();
            C0870l lVar = new C0870l();
            int firstVisiblePosition = this.f4082E.getFirstVisiblePosition();
            boolean z = false;
            for (int i2 = 0; i2 < this.f4082E.getChildCount(); i2++) {
                View childAt = this.f4082E.getChildAt(i2);
                C1003s.C1022i iVar = (C1003s.C1022i) this.f4083F.getItem(firstVisiblePosition + i2);
                Rect rect = map3.get(iVar);
                int top = childAt.getTop();
                if (rect != null) {
                    i = rect.top;
                } else {
                    i = (this.f4092O * size) + top;
                }
                AnimationSet animationSet = new AnimationSet(true);
                Set<C1003s.C1022i> set2 = this.f4085H;
                if (set2 != null && set2.contains(iVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration((long) this.f4128t0);
                    animationSet.addAnimation(alphaAnimation);
                    i = top;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (i - top), 0.0f);
                translateAnimation.setDuration((long) this.f4126s0);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(this.f4132v0);
                if (!z) {
                    animationSet.setAnimationListener(lVar);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                map3.remove(iVar);
                map2.remove(iVar);
            }
            Map<C1003s.C1022i, BitmapDrawable> map4 = map2;
            for (Map.Entry next : map2.entrySet()) {
                C1003s.C1022i iVar2 = (C1003s.C1022i) next.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) next.getValue();
                Rect rect2 = map3.get(iVar2);
                if (this.f4086I.contains(iVar2)) {
                    aVar = new OverlayListView.C0850a(bitmapDrawable, rect2).mo4216c(1.0f, 0.0f).mo4218e((long) this.f4130u0).mo4219f(this.f4132v0);
                } else {
                    aVar = new OverlayListView.C0850a(bitmapDrawable, rect2).mo4220g(this.f4092O * size).mo4218e((long) this.f4126s0).mo4219f(this.f4132v0).mo4217d(new C0859a(iVar2));
                    this.f4087J.add(iVar2);
                }
                this.f4082E.mo4210a(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4256n(boolean z) {
        Set<C1003s.C1022i> set;
        int firstVisiblePosition = this.f4082E.getFirstVisiblePosition();
        for (int i = 0; i < this.f4082E.getChildCount(); i++) {
            View childAt = this.f4082E.getChildAt(i);
            C1003s.C1022i iVar = (C1003s.C1022i) this.f4083F.getItem(firstVisiblePosition + i);
            if (!z || (set = this.f4085H) == null || !set.contains(iVar)) {
                ((LinearLayout) childAt.findViewById(C1538f.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.f4082E.mo4212c();
        if (!z) {
            mo4260q(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4257o() {
        this.f4103Z = false;
        this.f4112l0 = null;
        this.f4114m0 = 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4109j = true;
        this.f4104e.mo4703b(C1001r.f4553c, this.f4105f, 2);
        m4527E(this.f4104e.mo4706i());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(C1541i.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        C0871m mVar = new C0871m();
        FrameLayout frameLayout = (FrameLayout) findViewById(C1538f.mr_expandable_area);
        this.f4123r = frameLayout;
        frameLayout.setOnClickListener(new C0863e());
        LinearLayout linearLayout = (LinearLayout) findViewById(C1538f.mr_dialog_area);
        this.f4125s = linearLayout;
        linearLayout.setOnClickListener(new C0864f());
        int d = C0912i.m4665d(this.f4107h);
        Button button = (Button) findViewById(16908314);
        this.f4113m = button;
        button.setText(C1542j.mr_controller_disconnect);
        this.f4113m.setTextColor(d);
        this.f4113m.setOnClickListener(mVar);
        Button button2 = (Button) findViewById(16908313);
        this.f4115n = button2;
        button2.setText(C1542j.mr_controller_stop_casting);
        this.f4115n.setTextColor(d);
        this.f4115n.setOnClickListener(mVar);
        this.f4137y = (TextView) findViewById(C1538f.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(C1538f.mr_close);
        this.f4119p = imageButton;
        imageButton.setOnClickListener(mVar);
        this.f4129u = (FrameLayout) findViewById(C1538f.mr_custom_control);
        this.f4127t = (FrameLayout) findViewById(C1538f.mr_default_control);
        C0865g gVar = new C0865g();
        ImageView imageView = (ImageView) findViewById(C1538f.mr_art);
        this.f4131v = imageView;
        imageView.setOnClickListener(gVar);
        findViewById(C1538f.mr_control_title_container).setOnClickListener(gVar);
        this.f4077A = (LinearLayout) findViewById(C1538f.mr_media_main_control);
        this.f4081D = findViewById(C1538f.mr_control_divider);
        this.f4079B = (RelativeLayout) findViewById(C1538f.mr_playback_control);
        this.f4133w = (TextView) findViewById(C1538f.mr_control_title);
        this.f4135x = (TextView) findViewById(C1538f.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(C1538f.mr_control_playback_ctrl);
        this.f4117o = imageButton2;
        imageButton2.setOnClickListener(mVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C1538f.mr_volume_control);
        this.f4080C = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(C1538f.mr_volume_slider);
        this.f4088K = seekBar;
        seekBar.setTag(this.f4106g);
        C0875q qVar = new C0875q();
        this.f4089L = qVar;
        this.f4088K.setOnSeekBarChangeListener(qVar);
        this.f4082E = (OverlayListView) findViewById(C1538f.mr_volume_group_list);
        this.f4084G = new ArrayList();
        C0877r rVar = new C0877r(this.f4082E.getContext(), this.f4084G);
        this.f4083F = rVar;
        this.f4082E.setAdapter(rVar);
        this.f4087J = new HashSet();
        C0912i.m4682u(this.f4107h, this.f4077A, this.f4082E, this.f4106g.mo4820y());
        C0912i.m4684w(this.f4107h, (MediaRouteVolumeSlider) this.f4088K, this.f4077A);
        HashMap hashMap = new HashMap();
        this.f4095R = hashMap;
        hashMap.put(this.f4106g, this.f4088K);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(C1538f.mr_group_expand_collapse);
        this.f4121q = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new C0866h());
        mo4245A();
        this.f4126s0 = this.f4107h.getResources().getInteger(C1539g.mr_controller_volume_group_list_animation_duration_ms);
        this.f4128t0 = this.f4107h.getResources().getInteger(C1539g.mr_controller_volume_group_list_fade_in_duration_ms);
        this.f4130u0 = this.f4107h.getResources().getInteger(C1539g.mr_controller_volume_group_list_fade_out_duration_ms);
        View B = mo4246B(bundle);
        this.f4111l = B;
        if (B != null) {
            this.f4129u.addView(B);
            this.f4129u.setVisibility(0);
        }
        this.f4108i = true;
        mo4251J();
    }

    public void onDetachedFromWindow() {
        this.f4104e.mo4711p(this.f4105f);
        m4527E((MediaSessionCompat.Token) null);
        this.f4109j = false;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f4106g.mo4790H(i == 25 ? -1 : 1);
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4260q(boolean z) {
        this.f4085H = null;
        this.f4086I = null;
        this.f4122q0 = false;
        if (this.f4124r0) {
            this.f4124r0 = false;
            mo4252K(z);
        }
        this.f4082E.setEnabled(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo4261r(int i, int i2) {
        if (i >= i2) {
            return (int) (((((float) this.f4110k) * ((float) i2)) / ((float) i)) + 0.5f);
        }
        return (int) (((((float) this.f4110k) * 9.0f) / 16.0f) + 0.5f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo4262w() {
        return (this.f4098U.mo596b() & 514) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo4263x() {
        return (this.f4098U.mo596b() & 516) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo4264y() {
        return (this.f4098U.mo596b() & 1) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo4265z(C1003s.C1022i iVar) {
        return this.f4139z && iVar.mo4814t() == 1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0858c(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 1
            android.content.Context r2 = androidx.mediarouter.app.C0912i.m4663b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.C0912i.m4664c(r2)
            r1.<init>(r2, r3)
            r1.f4139z = r0
            androidx.mediarouter.app.c$d r3 = new androidx.mediarouter.app.c$d
            r3.<init>()
            r1.f4078A0 = r3
            android.content.Context r3 = r1.getContext()
            r1.f4107h = r3
            androidx.mediarouter.app.c$o r3 = new androidx.mediarouter.app.c$o
            r3.<init>()
            r1.f4097T = r3
            android.content.Context r3 = r1.f4107h
            androidx.mediarouter.media.s r3 = androidx.mediarouter.media.C1003s.m5133h(r3)
            r1.f4104e = r3
            androidx.mediarouter.app.c$p r0 = new androidx.mediarouter.app.c$p
            r0.<init>()
            r1.f4105f = r0
            androidx.mediarouter.media.s$i r0 = r3.mo4709l()
            r1.f4106g = r0
            android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.mo4706i()
            r1.m4527E(r3)
            android.content.Context r3 = r1.f4107h
            android.content.res.Resources r3 = r3.getResources()
            int r0 = p011b1.C1536d.mr_controller_volume_group_list_padding_top
            int r3 = r3.getDimensionPixelSize(r0)
            r1.f4094Q = r3
            android.content.Context r3 = r1.f4107h
            java.lang.String r0 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.f4140z0 = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r3 < r0) goto L_0x006e
            int r3 = p011b1.C1540h.mr_linear_out_slow_in
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.f4134w0 = r3
            int r3 = p011b1.C1540h.mr_fast_out_slow_in
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.f4136x0 = r2
        L_0x006e:
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.f4138y0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C0858c.<init>(android.content.Context, int):void");
    }
}
