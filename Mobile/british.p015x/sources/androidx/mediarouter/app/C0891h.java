package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.p007v4.media.MediaDescriptionCompat;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.MediaControllerCompat;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.C0256d;
import androidx.mediarouter.media.C0985m;
import androidx.mediarouter.media.C1001r;
import androidx.mediarouter.media.C1003s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p011b1.C1536d;
import p011b1.C1538f;
import p011b1.C1539g;
import p011b1.C1541i;
import p011b1.C1542j;
import p105l0.C5643c;

/* renamed from: androidx.mediarouter.app.h */
/* compiled from: MediaRouteDynamicControllerDialog */
public class C0891h extends C0256d {

    /* renamed from: R */
    static final boolean f4213R = Log.isLoggable("MediaRouteCtrlDialog", 3);

    /* renamed from: A */
    private ImageButton f4214A;

    /* renamed from: B */
    private Button f4215B;

    /* renamed from: C */
    private ImageView f4216C;

    /* renamed from: D */
    private View f4217D;

    /* renamed from: E */
    ImageView f4218E;

    /* renamed from: F */
    private TextView f4219F;

    /* renamed from: G */
    private TextView f4220G;

    /* renamed from: H */
    private String f4221H;

    /* renamed from: I */
    MediaControllerCompat f4222I;

    /* renamed from: J */
    C0896e f4223J;

    /* renamed from: K */
    MediaDescriptionCompat f4224K;

    /* renamed from: L */
    C0895d f4225L;

    /* renamed from: M */
    Bitmap f4226M;

    /* renamed from: N */
    Uri f4227N;

    /* renamed from: O */
    boolean f4228O;

    /* renamed from: P */
    Bitmap f4229P;

    /* renamed from: Q */
    int f4230Q;

    /* renamed from: d */
    final C1003s f4231d;

    /* renamed from: e */
    private final C0899g f4232e;

    /* renamed from: f */
    private C1001r f4233f;

    /* renamed from: g */
    C1003s.C1022i f4234g;

    /* renamed from: h */
    final List<C1003s.C1022i> f4235h;

    /* renamed from: i */
    final List<C1003s.C1022i> f4236i;

    /* renamed from: j */
    final List<C1003s.C1022i> f4237j;

    /* renamed from: k */
    final List<C1003s.C1022i> f4238k;

    /* renamed from: l */
    Context f4239l;

    /* renamed from: m */
    private boolean f4240m;

    /* renamed from: n */
    private boolean f4241n;

    /* renamed from: o */
    private long f4242o;

    /* renamed from: p */
    final Handler f4243p;

    /* renamed from: q */
    RecyclerView f4244q;

    /* renamed from: r */
    C0900h f4245r;

    /* renamed from: s */
    C0911j f4246s;

    /* renamed from: t */
    Map<String, C0897f> f4247t;

    /* renamed from: u */
    C1003s.C1022i f4248u;

    /* renamed from: v */
    Map<String, Integer> f4249v;

    /* renamed from: w */
    boolean f4250w;

    /* renamed from: x */
    boolean f4251x;

    /* renamed from: y */
    private boolean f4252y;

    /* renamed from: z */
    private boolean f4253z;

    /* renamed from: androidx.mediarouter.app.h$a */
    /* compiled from: MediaRouteDynamicControllerDialog */
    class C0892a extends Handler {
        C0892a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C0891h.this.mo4337v();
            } else if (i == 2) {
                C0891h hVar = C0891h.this;
                if (hVar.f4248u != null) {
                    hVar.f4248u = null;
                    hVar.mo4338w();
                }
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.h$b */
    /* compiled from: MediaRouteDynamicControllerDialog */
    class C0893b implements View.OnClickListener {
        C0893b() {
        }

        public void onClick(View view) {
            C0891h.this.dismiss();
        }
    }

    /* renamed from: androidx.mediarouter.app.h$c */
    /* compiled from: MediaRouteDynamicControllerDialog */
    class C0894c implements View.OnClickListener {
        C0894c() {
        }

        public void onClick(View view) {
            if (C0891h.this.f4234g.mo4786C()) {
                C0891h.this.f4231d.mo4717v(2);
            }
            C0891h.this.dismiss();
        }
    }

    /* renamed from: androidx.mediarouter.app.h$d */
    /* compiled from: MediaRouteDynamicControllerDialog */
    private class C0895d extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        private final Bitmap f4257a;

        /* renamed from: b */
        private final Uri f4258b;

        /* renamed from: c */
        private int f4259c;

        C0895d() {
            MediaDescriptionCompat mediaDescriptionCompat = C0891h.this.f4224K;
            Uri uri = null;
            Bitmap b = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.mo300b();
            if (C0891h.m4610i(b)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                b = null;
            }
            this.f4257a = b;
            MediaDescriptionCompat mediaDescriptionCompat2 = C0891h.this.f4224K;
            this.f4258b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.mo301d() : uri;
        }

        /* renamed from: e */
        private InputStream m4625e(Uri uri) throws IOException {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = C0891h.this.f4239l.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(30000);
                openConnection.setReadTimeout(30000);
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
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[Catch:{ IOException -> 0x00a1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00bd A[SYNTHETIC, Splitter:B:54:0x00bd] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00c5 A[SYNTHETIC, Splitter:B:59:0x00c5] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00e5 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r9) {
            /*
                r8 = this;
                java.lang.String r9 = "Unable to open: "
                android.graphics.Bitmap r0 = r8.f4257a
                r1 = 0
                r2 = 1
                java.lang.String r3 = "MediaRouteCtrlDialog"
                r4 = 0
                if (r0 == 0) goto L_0x000d
                goto L_0x00ca
            L_0x000d:
                android.net.Uri r0 = r8.f4258b
                if (r0 == 0) goto L_0x00c9
                java.io.InputStream r0 = r8.m4625e(r0)     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
                if (r0 != 0) goto L_0x0031
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a1 }
                r5.<init>()     // Catch:{ IOException -> 0x00a1 }
                r5.append(r9)     // Catch:{ IOException -> 0x00a1 }
                android.net.Uri r6 = r8.f4258b     // Catch:{ IOException -> 0x00a1 }
                r5.append(r6)     // Catch:{ IOException -> 0x00a1 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00a1 }
                android.util.Log.w(r3, r5)     // Catch:{ IOException -> 0x00a1 }
                if (r0 == 0) goto L_0x0030
                r0.close()     // Catch:{ IOException -> 0x0030 }
            L_0x0030:
                return r4
            L_0x0031:
                android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x00a1 }
                r5.<init>()     // Catch:{ IOException -> 0x00a1 }
                r5.inJustDecodeBounds = r2     // Catch:{ IOException -> 0x00a1 }
                android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch:{ IOException -> 0x00a1 }
                int r6 = r5.outWidth     // Catch:{ IOException -> 0x00a1 }
                if (r6 == 0) goto L_0x009d
                int r6 = r5.outHeight     // Catch:{ IOException -> 0x00a1 }
                if (r6 != 0) goto L_0x0044
                goto L_0x009d
            L_0x0044:
                r0.reset()     // Catch:{ IOException -> 0x0048 }
                goto L_0x006d
            L_0x0048:
                r0.close()     // Catch:{ IOException -> 0x00a1 }
                android.net.Uri r6 = r8.f4258b     // Catch:{ IOException -> 0x00a1 }
                java.io.InputStream r0 = r8.m4625e(r6)     // Catch:{ IOException -> 0x00a1 }
                if (r0 != 0) goto L_0x006d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a1 }
                r5.<init>()     // Catch:{ IOException -> 0x00a1 }
                r5.append(r9)     // Catch:{ IOException -> 0x00a1 }
                android.net.Uri r6 = r8.f4258b     // Catch:{ IOException -> 0x00a1 }
                r5.append(r6)     // Catch:{ IOException -> 0x00a1 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00a1 }
                android.util.Log.w(r3, r5)     // Catch:{ IOException -> 0x00a1 }
                if (r0 == 0) goto L_0x006c
                r0.close()     // Catch:{ IOException -> 0x006c }
            L_0x006c:
                return r4
            L_0x006d:
                r5.inJustDecodeBounds = r1     // Catch:{ IOException -> 0x00a1 }
                androidx.mediarouter.app.h r6 = androidx.mediarouter.app.C0891h.this     // Catch:{ IOException -> 0x00a1 }
                android.content.Context r6 = r6.f4239l     // Catch:{ IOException -> 0x00a1 }
                android.content.res.Resources r6 = r6.getResources()     // Catch:{ IOException -> 0x00a1 }
                int r7 = p011b1.C1536d.mr_cast_meta_art_size     // Catch:{ IOException -> 0x00a1 }
                int r6 = r6.getDimensionPixelSize(r7)     // Catch:{ IOException -> 0x00a1 }
                int r7 = r5.outHeight     // Catch:{ IOException -> 0x00a1 }
                int r7 = r7 / r6
                int r6 = java.lang.Integer.highestOneBit(r7)     // Catch:{ IOException -> 0x00a1 }
                int r6 = java.lang.Math.max(r2, r6)     // Catch:{ IOException -> 0x00a1 }
                r5.inSampleSize = r6     // Catch:{ IOException -> 0x00a1 }
                boolean r6 = r8.isCancelled()     // Catch:{ IOException -> 0x00a1 }
                if (r6 == 0) goto L_0x0094
                r0.close()     // Catch:{ IOException -> 0x0093 }
            L_0x0093:
                return r4
            L_0x0094:
                android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch:{ IOException -> 0x00a1 }
                r0.close()     // Catch:{ IOException -> 0x009b }
            L_0x009b:
                r0 = r9
                goto L_0x00ca
            L_0x009d:
                r0.close()     // Catch:{ IOException -> 0x00a0 }
            L_0x00a0:
                return r4
            L_0x00a1:
                r5 = move-exception
                goto L_0x00a7
            L_0x00a3:
                r9 = move-exception
                goto L_0x00c3
            L_0x00a5:
                r5 = move-exception
                r0 = r4
            L_0x00a7:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
                r6.<init>()     // Catch:{ all -> 0x00c1 }
                r6.append(r9)     // Catch:{ all -> 0x00c1 }
                android.net.Uri r9 = r8.f4258b     // Catch:{ all -> 0x00c1 }
                r6.append(r9)     // Catch:{ all -> 0x00c1 }
                java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x00c1 }
                android.util.Log.w(r3, r9, r5)     // Catch:{ all -> 0x00c1 }
                if (r0 == 0) goto L_0x00c9
                r0.close()     // Catch:{ IOException -> 0x00c9 }
                goto L_0x00c9
            L_0x00c1:
                r9 = move-exception
                r4 = r0
            L_0x00c3:
                if (r4 == 0) goto L_0x00c8
                r4.close()     // Catch:{ IOException -> 0x00c8 }
            L_0x00c8:
                throw r9
            L_0x00c9:
                r0 = r4
            L_0x00ca:
                boolean r9 = androidx.mediarouter.app.C0891h.m4610i(r0)
                if (r9 == 0) goto L_0x00e5
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = "Can't use recycled bitmap: "
                r9.append(r1)
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                android.util.Log.w(r3, r9)
                return r4
            L_0x00e5:
                if (r0 == 0) goto L_0x0119
                int r9 = r0.getWidth()
                int r3 = r0.getHeight()
                if (r9 >= r3) goto L_0x0119
                e1.b$b r9 = new e1.b$b
                r9.<init>(r0)
                e1.b$b r9 = r9.mo21402c(r2)
                e1.b r9 = r9.mo21401a()
                java.util.List r2 = r9.mo21398h()
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0109
                goto L_0x0117
            L_0x0109:
                java.util.List r9 = r9.mo21398h()
                java.lang.Object r9 = r9.get(r1)
                e1.b$d r9 = (p070e1.C5199b.C5203d) r9
                int r1 = r9.mo21406e()
            L_0x0117:
                r8.f4259c = r1
            L_0x0119:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C0891h.C0895d.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Bitmap mo4343b() {
            return this.f4257a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Uri mo4344c() {
            return this.f4258b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void onPostExecute(Bitmap bitmap) {
            C0891h hVar = C0891h.this;
            hVar.f4225L = null;
            if (!C5643c.m24954a(hVar.f4226M, this.f4257a) || !C5643c.m24954a(C0891h.this.f4227N, this.f4258b)) {
                C0891h hVar2 = C0891h.this;
                hVar2.f4226M = this.f4257a;
                hVar2.f4229P = bitmap;
                hVar2.f4227N = this.f4258b;
                hVar2.f4230Q = this.f4259c;
                hVar2.f4228O = true;
                hVar2.mo4335t();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C0891h.this.mo4326g();
        }
    }

    /* renamed from: androidx.mediarouter.app.h$e */
    /* compiled from: MediaRouteDynamicControllerDialog */
    private final class C0896e extends MediaControllerCompat.C0144a {
        C0896e() {
        }

        /* renamed from: d */
        public void mo375d(MediaMetadataCompat mediaMetadataCompat) {
            C0891h.this.f4224K = mediaMetadataCompat == null ? null : mediaMetadataCompat.mo326f();
            C0891h.this.mo4330n();
            C0891h.this.mo4335t();
        }

        /* renamed from: i */
        public void mo380i() {
            C0891h hVar = C0891h.this;
            MediaControllerCompat mediaControllerCompat = hVar.f4222I;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.mo354h(hVar.f4223J);
                C0891h.this.f4222I = null;
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.h$f */
    /* compiled from: MediaRouteDynamicControllerDialog */
    private abstract class C0897f extends RecyclerView.C1087c0 {

        /* renamed from: a */
        C1003s.C1022i f4262a;

        /* renamed from: b */
        final ImageButton f4263b;

        /* renamed from: c */
        final MediaRouteVolumeSlider f4264c;

        /* renamed from: androidx.mediarouter.app.h$f$a */
        /* compiled from: MediaRouteDynamicControllerDialog */
        class C0898a implements View.OnClickListener {
            C0898a() {
            }

            public void onClick(View view) {
                int i;
                C0891h hVar = C0891h.this;
                if (hVar.f4248u != null) {
                    hVar.f4243p.removeMessages(2);
                }
                C0897f fVar = C0897f.this;
                C0891h.this.f4248u = fVar.f4262a;
                boolean z = !view.isActivated();
                if (z) {
                    i = 0;
                } else {
                    i = C0897f.this.mo4350b();
                }
                C0897f.this.mo4351c(z);
                C0897f.this.f4264c.setProgress(i);
                C0897f.this.f4262a.mo4789G(i);
                C0891h.this.f4243p.sendEmptyMessageDelayed(2, 500);
            }
        }

        C0897f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            this.f4263b = imageButton;
            this.f4264c = mediaRouteVolumeSlider;
            imageButton.setImageDrawable(C0912i.m4672k(C0891h.this.f4239l));
            C0912i.m4683v(C0891h.this.f4239l, mediaRouteVolumeSlider);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4349a(C1003s.C1022i iVar) {
            this.f4262a = iVar;
            int s = iVar.mo4813s();
            this.f4263b.setActivated(s == 0);
            this.f4263b.setOnClickListener(new C0898a());
            this.f4264c.setTag(this.f4262a);
            this.f4264c.setMax(iVar.mo4816u());
            this.f4264c.setProgress(s);
            this.f4264c.setOnSeekBarChangeListener(C0891h.this.f4246s);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4350b() {
            Integer num = C0891h.this.f4249v.get(this.f4262a.mo4805k());
            if (num == null) {
                return 1;
            }
            return Math.max(1, num.intValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4351c(boolean z) {
            if (this.f4263b.isActivated() != z) {
                this.f4263b.setActivated(z);
                if (z) {
                    C0891h.this.f4249v.put(this.f4262a.mo4805k(), Integer.valueOf(this.f4264c.getProgress()));
                } else {
                    C0891h.this.f4249v.remove(this.f4262a.mo4805k());
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4352d() {
            int s = this.f4262a.mo4813s();
            mo4351c(s == 0);
            this.f4264c.setProgress(s);
        }
    }

    /* renamed from: androidx.mediarouter.app.h$g */
    /* compiled from: MediaRouteDynamicControllerDialog */
    private final class C0899g extends C1003s.C1005b {
        C0899g() {
        }

        /* renamed from: d */
        public void mo4168d(C1003s sVar, C1003s.C1022i iVar) {
            C0891h.this.mo4337v();
        }

        /* renamed from: e */
        public void mo4169e(C1003s sVar, C1003s.C1022i iVar) {
            boolean z;
            C1003s.C1022i.C1023a h;
            if (iVar == C0891h.this.f4234g && iVar.mo4801g() != null) {
                Iterator<C1003s.C1022i> it = iVar.mo4811q().mo4781f().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1003s.C1022i next = it.next();
                    if (!C0891h.this.f4234g.mo4806l().contains(next) && (h = C0891h.this.f4234g.mo4802h(next)) != null && h.mo4822b() && !C0891h.this.f4236i.contains(next)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                C0891h.this.mo4338w();
                C0891h.this.mo4336u();
                return;
            }
            C0891h.this.mo4337v();
        }

        /* renamed from: g */
        public void mo4170g(C1003s sVar, C1003s.C1022i iVar) {
            C0891h.this.mo4337v();
        }

        /* renamed from: h */
        public void mo4196h(C1003s sVar, C1003s.C1022i iVar) {
            C0891h hVar = C0891h.this;
            hVar.f4234g = iVar;
            hVar.f4250w = false;
            hVar.mo4338w();
            C0891h.this.mo4336u();
        }

        /* renamed from: k */
        public void mo4197k(C1003s sVar, C1003s.C1022i iVar) {
            C0891h.this.mo4337v();
        }

        /* renamed from: m */
        public void mo4289m(C1003s sVar, C1003s.C1022i iVar) {
            C0897f fVar;
            int s = iVar.mo4813s();
            if (C0891h.f4213R) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + s);
            }
            C0891h hVar = C0891h.this;
            if (hVar.f4248u != iVar && (fVar = hVar.f4247t.get(iVar.mo4805k())) != null) {
                fVar.mo4352d();
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.h$h */
    /* compiled from: MediaRouteDynamicControllerDialog */
    private final class C0900h extends RecyclerView.C1092h<RecyclerView.C1087c0> {

        /* renamed from: a */
        private final ArrayList<C0907f> f4268a = new ArrayList<>();

        /* renamed from: b */
        private final LayoutInflater f4269b;

        /* renamed from: c */
        private final Drawable f4270c;

        /* renamed from: d */
        private final Drawable f4271d;

        /* renamed from: e */
        private final Drawable f4272e;

        /* renamed from: f */
        private final Drawable f4273f;

        /* renamed from: g */
        private C0907f f4274g;

        /* renamed from: h */
        private final int f4275h;

        /* renamed from: i */
        private final Interpolator f4276i;

        /* renamed from: androidx.mediarouter.app.h$h$a */
        /* compiled from: MediaRouteDynamicControllerDialog */
        class C0901a extends Animation {

            /* renamed from: b */
            final /* synthetic */ int f4278b;

            /* renamed from: c */
            final /* synthetic */ int f4279c;

            /* renamed from: d */
            final /* synthetic */ View f4280d;

            C0901a(int i, int i2, View view) {
                this.f4278b = i;
                this.f4279c = i2;
                this.f4280d = view;
            }

            /* access modifiers changed from: protected */
            public void applyTransformation(float f, Transformation transformation) {
                int i = this.f4278b;
                int i2 = this.f4279c;
                C0891h.m4611o(this.f4280d, i2 + ((int) (((float) (i - i2)) * f)));
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$b */
        /* compiled from: MediaRouteDynamicControllerDialog */
        class C0902b implements Animation.AnimationListener {
            C0902b() {
            }

            public void onAnimationEnd(Animation animation) {
                C0891h hVar = C0891h.this;
                hVar.f4251x = false;
                hVar.mo4338w();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                C0891h.this.f4251x = true;
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$c */
        /* compiled from: MediaRouteDynamicControllerDialog */
        private class C0903c extends RecyclerView.C1087c0 {

            /* renamed from: a */
            final View f4283a;

            /* renamed from: b */
            final ImageView f4284b;

            /* renamed from: c */
            final ProgressBar f4285c;

            /* renamed from: d */
            final TextView f4286d;

            /* renamed from: e */
            final float f4287e;

            /* renamed from: f */
            C1003s.C1022i f4288f;

            /* renamed from: androidx.mediarouter.app.h$h$c$a */
            /* compiled from: MediaRouteDynamicControllerDialog */
            class C0904a implements View.OnClickListener {
                C0904a() {
                }

                public void onClick(View view) {
                    C0903c cVar = C0903c.this;
                    C0891h.this.f4231d.mo4716u(cVar.f4288f);
                    C0903c.this.f4284b.setVisibility(4);
                    C0903c.this.f4285c.setVisibility(0);
                }
            }

            C0903c(View view) {
                super(view);
                this.f4283a = view;
                this.f4284b = (ImageView) view.findViewById(C1538f.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C1538f.mr_cast_group_progress_bar);
                this.f4285c = progressBar;
                this.f4286d = (TextView) view.findViewById(C1538f.mr_cast_group_name);
                this.f4287e = C0912i.m4669h(C0891h.this.f4239l);
                C0912i.m4681t(C0891h.this.f4239l, progressBar);
            }

            /* renamed from: b */
            private boolean m4650b(C1003s.C1022i iVar) {
                List<C1003s.C1022i> l = C0891h.this.f4234g.mo4806l();
                return (l.size() == 1 && l.get(0) == iVar) ? false : true;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo4366a(C0907f fVar) {
                C1003s.C1022i iVar = (C1003s.C1022i) fVar.mo4371a();
                this.f4288f = iVar;
                this.f4284b.setVisibility(0);
                this.f4285c.setVisibility(4);
                this.f4283a.setAlpha(m4650b(iVar) ? 1.0f : this.f4287e);
                this.f4283a.setOnClickListener(new C0904a());
                this.f4284b.setImageDrawable(C0900h.this.mo4355c(iVar));
                this.f4286d.setText(iVar.mo4807m());
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$d */
        /* compiled from: MediaRouteDynamicControllerDialog */
        private class C0905d extends C0897f {

            /* renamed from: e */
            private final TextView f4291e;

            /* renamed from: f */
            private final int f4292f;

            C0905d(View view) {
                super(view, (ImageButton) view.findViewById(C1538f.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(C1538f.mr_cast_volume_slider));
                this.f4291e = (TextView) view.findViewById(C1538f.mr_group_volume_route_name);
                Resources resources = C0891h.this.f4239l.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(C1536d.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.f4292f = (int) typedValue.getDimension(displayMetrics);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public void mo4368e(C0907f fVar) {
                C0891h.m4611o(this.itemView, C0900h.this.mo4357e() ? this.f4292f : 0);
                C1003s.C1022i iVar = (C1003s.C1022i) fVar.mo4371a();
                super.mo4349a(iVar);
                this.f4291e.setText(iVar.mo4807m());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f */
            public int mo4369f() {
                return this.f4292f;
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$e */
        /* compiled from: MediaRouteDynamicControllerDialog */
        private class C0906e extends RecyclerView.C1087c0 {

            /* renamed from: a */
            private final TextView f4294a;

            C0906e(View view) {
                super(view);
                this.f4294a = (TextView) view.findViewById(C1538f.mr_cast_header_name);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo4370a(C0907f fVar) {
                this.f4294a.setText(fVar.mo4371a().toString());
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$f */
        /* compiled from: MediaRouteDynamicControllerDialog */
        private class C0907f {

            /* renamed from: a */
            private final Object f4296a;

            /* renamed from: b */
            private final int f4297b;

            C0907f(Object obj, int i) {
                this.f4296a = obj;
                this.f4297b = i;
            }

            /* renamed from: a */
            public Object mo4371a() {
                return this.f4296a;
            }

            /* renamed from: b */
            public int mo4372b() {
                return this.f4297b;
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$g */
        /* compiled from: MediaRouteDynamicControllerDialog */
        private class C0908g extends C0897f {

            /* renamed from: e */
            final View f4299e;

            /* renamed from: f */
            final ImageView f4300f;

            /* renamed from: g */
            final ProgressBar f4301g;

            /* renamed from: h */
            final TextView f4302h;

            /* renamed from: i */
            final RelativeLayout f4303i;

            /* renamed from: j */
            final CheckBox f4304j;

            /* renamed from: k */
            final float f4305k;

            /* renamed from: l */
            final int f4306l;

            /* renamed from: m */
            final int f4307m;

            /* renamed from: n */
            final View.OnClickListener f4308n = new C0909a();

            /* renamed from: androidx.mediarouter.app.h$h$g$a */
            /* compiled from: MediaRouteDynamicControllerDialog */
            class C0909a implements View.OnClickListener {
                C0909a() {
                }

                public void onClick(View view) {
                    C0908g gVar = C0908g.this;
                    boolean z = !gVar.mo4374g(gVar.f4262a);
                    boolean y = C0908g.this.f4262a.mo4820y();
                    if (z) {
                        C0908g gVar2 = C0908g.this;
                        C0891h.this.f4231d.mo4704c(gVar2.f4262a);
                    } else {
                        C0908g gVar3 = C0908g.this;
                        C0891h.this.f4231d.mo4712q(gVar3.f4262a);
                    }
                    C0908g.this.mo4375h(z, !y);
                    if (y) {
                        List<C1003s.C1022i> l = C0891h.this.f4234g.mo4806l();
                        for (C1003s.C1022i next : C0908g.this.f4262a.mo4806l()) {
                            if (l.contains(next) != z) {
                                C0897f fVar = C0891h.this.f4247t.get(next.mo4805k());
                                if (fVar instanceof C0908g) {
                                    ((C0908g) fVar).mo4375h(z, true);
                                }
                            }
                        }
                    }
                    C0908g gVar4 = C0908g.this;
                    C0900h.this.mo4358f(gVar4.f4262a, z);
                }
            }

            C0908g(View view) {
                super(view, (ImageButton) view.findViewById(C1538f.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(C1538f.mr_cast_volume_slider));
                this.f4299e = view;
                this.f4300f = (ImageView) view.findViewById(C1538f.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C1538f.mr_cast_route_progress_bar);
                this.f4301g = progressBar;
                this.f4302h = (TextView) view.findViewById(C1538f.mr_cast_route_name);
                this.f4303i = (RelativeLayout) view.findViewById(C1538f.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(C1538f.mr_cast_checkbox);
                this.f4304j = checkBox;
                checkBox.setButtonDrawable(C0912i.m4666e(C0891h.this.f4239l));
                C0912i.m4681t(C0891h.this.f4239l, progressBar);
                this.f4305k = C0912i.m4669h(C0891h.this.f4239l);
                Resources resources = C0891h.this.f4239l.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(C1536d.mr_dynamic_dialog_row_height, typedValue, true);
                this.f4306l = (int) typedValue.getDimension(displayMetrics);
                this.f4307m = 0;
            }

            /* renamed from: f */
            private boolean m4657f(C1003s.C1022i iVar) {
                if (C0891h.this.f4238k.contains(iVar)) {
                    return false;
                }
                if (mo4374g(iVar) && C0891h.this.f4234g.mo4806l().size() < 2) {
                    return false;
                }
                if (!mo4374g(iVar)) {
                    return true;
                }
                C1003s.C1022i.C1023a h = C0891h.this.f4234g.mo4802h(iVar);
                if (h == null || !h.mo4824d()) {
                    return false;
                }
                return true;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public void mo4373e(C0907f fVar) {
                C1003s.C1022i iVar = (C1003s.C1022i) fVar.mo4371a();
                if (iVar == C0891h.this.f4234g && iVar.mo4806l().size() > 0) {
                    Iterator<C1003s.C1022i> it = iVar.mo4806l().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1003s.C1022i next = it.next();
                        if (!C0891h.this.f4236i.contains(next)) {
                            iVar = next;
                            break;
                        }
                    }
                }
                mo4349a(iVar);
                this.f4300f.setImageDrawable(C0900h.this.mo4355c(iVar));
                this.f4302h.setText(iVar.mo4807m());
                boolean z = false;
                this.f4304j.setVisibility(0);
                boolean g = mo4374g(iVar);
                boolean f = m4657f(iVar);
                this.f4304j.setChecked(g);
                this.f4301g.setVisibility(4);
                this.f4300f.setVisibility(0);
                this.f4299e.setEnabled(f);
                this.f4304j.setEnabled(f);
                this.f4263b.setEnabled(f || g);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = this.f4264c;
                if (f || g) {
                    z = true;
                }
                mediaRouteVolumeSlider.setEnabled(z);
                this.f4299e.setOnClickListener(this.f4308n);
                this.f4304j.setOnClickListener(this.f4308n);
                C0891h.m4611o(this.f4303i, (!g || this.f4262a.mo4820y()) ? this.f4307m : this.f4306l);
                float f2 = 1.0f;
                this.f4299e.setAlpha((f || g) ? 1.0f : this.f4305k);
                CheckBox checkBox = this.f4304j;
                if (!f && g) {
                    f2 = this.f4305k;
                }
                checkBox.setAlpha(f2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: g */
            public boolean mo4374g(C1003s.C1022i iVar) {
                if (iVar.mo4786C()) {
                    return true;
                }
                C1003s.C1022i.C1023a h = C0891h.this.f4234g.mo4802h(iVar);
                if (h == null || h.mo4821a() != 3) {
                    return false;
                }
                return true;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h */
            public void mo4375h(boolean z, boolean z2) {
                this.f4304j.setEnabled(false);
                this.f4299e.setEnabled(false);
                this.f4304j.setChecked(z);
                if (z) {
                    this.f4300f.setVisibility(4);
                    this.f4301g.setVisibility(0);
                }
                if (z2) {
                    C0900h.this.mo4354a(this.f4303i, z ? this.f4306l : this.f4307m);
                }
            }
        }

        C0900h() {
            this.f4269b = LayoutInflater.from(C0891h.this.f4239l);
            this.f4270c = C0912i.m4668g(C0891h.this.f4239l);
            this.f4271d = C0912i.m4678q(C0891h.this.f4239l);
            this.f4272e = C0912i.m4674m(C0891h.this.f4239l);
            this.f4273f = C0912i.m4675n(C0891h.this.f4239l);
            this.f4275h = C0891h.this.f4239l.getResources().getInteger(C1539g.mr_cast_volume_slider_layout_animation_duration_ms);
            this.f4276i = new AccelerateDecelerateInterpolator();
            mo4360h();
        }

        /* renamed from: b */
        private Drawable m4642b(C1003s.C1022i iVar) {
            int f = iVar.mo4800f();
            if (f == 1) {
                return this.f4271d;
            }
            if (f == 2) {
                return this.f4272e;
            }
            if (iVar.mo4820y()) {
                return this.f4273f;
            }
            return this.f4270c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4354a(View view, int i) {
            C0901a aVar = new C0901a(i, view.getLayoutParams().height, view);
            aVar.setAnimationListener(new C0902b());
            aVar.setDuration((long) this.f4275h);
            aVar.setInterpolator(this.f4276i);
            view.startAnimation(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Drawable mo4355c(C1003s.C1022i iVar) {
            Uri j = iVar.mo4804j();
            if (j != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(C0891h.this.f4239l.getContentResolver().openInputStream(j), (String) null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e) {
                    Log.w("MediaRouteCtrlDialog", "Failed to load " + j, e);
                }
            }
            return m4642b(iVar);
        }

        /* renamed from: d */
        public C0907f mo4356d(int i) {
            if (i == 0) {
                return this.f4274g;
            }
            return this.f4268a.get(i - 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo4357e() {
            return C0891h.this.f4234g.mo4806l().size() > 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4358f(C1003s.C1022i iVar, boolean z) {
            List<C1003s.C1022i> l = C0891h.this.f4234g.mo4806l();
            boolean z2 = true;
            int max = Math.max(1, l.size());
            int i = -1;
            if (iVar.mo4820y()) {
                for (C1003s.C1022i contains : iVar.mo4806l()) {
                    if (l.contains(contains) != z) {
                        max += z ? 1 : -1;
                    }
                }
            } else {
                if (z) {
                    i = 1;
                }
                max += i;
            }
            boolean e = mo4357e();
            int i2 = 0;
            if (max < 2) {
                z2 = false;
            }
            if (e != z2) {
                RecyclerView.C1087c0 Y = C0891h.this.f4244q.mo5099Y(0);
                if (Y instanceof C0905d) {
                    C0905d dVar = (C0905d) Y;
                    View view = dVar.itemView;
                    if (z2) {
                        i2 = dVar.mo4369f();
                    }
                    mo4354a(view, i2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4359g() {
            C0891h.this.f4238k.clear();
            C0891h hVar = C0891h.this;
            hVar.f4238k.addAll(C0880f.m4587g(hVar.f4236i, hVar.mo4327h()));
            notifyDataSetChanged();
        }

        public int getItemCount() {
            return this.f4268a.size() + 1;
        }

        public int getItemViewType(int i) {
            return mo4356d(i).mo4372b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4360h() {
            this.f4268a.clear();
            this.f4274g = new C0907f(C0891h.this.f4234g, 1);
            if (!C0891h.this.f4235h.isEmpty()) {
                for (C1003s.C1022i fVar : C0891h.this.f4235h) {
                    this.f4268a.add(new C0907f(fVar, 3));
                }
            } else {
                this.f4268a.add(new C0907f(C0891h.this.f4234g, 3));
            }
            boolean z = false;
            if (!C0891h.this.f4236i.isEmpty()) {
                boolean z2 = false;
                for (C1003s.C1022i next : C0891h.this.f4236i) {
                    if (!C0891h.this.f4235h.contains(next)) {
                        if (!z2) {
                            C0985m.C0987b g = C0891h.this.f4234g.mo4801g();
                            String k = g != null ? g.mo4497k() : null;
                            if (TextUtils.isEmpty(k)) {
                                k = C0891h.this.f4239l.getString(C1542j.mr_dialog_groupable_header);
                            }
                            this.f4268a.add(new C0907f(k, 2));
                            z2 = true;
                        }
                        this.f4268a.add(new C0907f(next, 3));
                    }
                }
            }
            if (!C0891h.this.f4237j.isEmpty()) {
                for (C1003s.C1022i next2 : C0891h.this.f4237j) {
                    C1003s.C1022i iVar = C0891h.this.f4234g;
                    if (iVar != next2) {
                        if (!z) {
                            C0985m.C0987b g2 = iVar.mo4801g();
                            String l = g2 != null ? g2.mo4498l() : null;
                            if (TextUtils.isEmpty(l)) {
                                l = C0891h.this.f4239l.getString(C1542j.mr_dialog_transferable_header);
                            }
                            this.f4268a.add(new C0907f(l, 2));
                            z = true;
                        }
                        this.f4268a.add(new C0907f(next2, 4));
                    }
                }
            }
            mo4359g();
        }

        public void onBindViewHolder(RecyclerView.C1087c0 c0Var, int i) {
            int itemViewType = getItemViewType(i);
            C0907f d = mo4356d(i);
            if (itemViewType == 1) {
                C0891h.this.f4247t.put(((C1003s.C1022i) d.mo4371a()).mo4805k(), (C0897f) c0Var);
                ((C0905d) c0Var).mo4368e(d);
            } else if (itemViewType == 2) {
                ((C0906e) c0Var).mo4370a(d);
            } else if (itemViewType == 3) {
                C0891h.this.f4247t.put(((C1003s.C1022i) d.mo4371a()).mo4805k(), (C0897f) c0Var);
                ((C0908g) c0Var).mo4373e(d);
            } else if (itemViewType != 4) {
                Log.w("MediaRouteCtrlDialog", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((C0903c) c0Var).mo4366a(d);
            }
        }

        public RecyclerView.C1087c0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new C0905d(this.f4269b.inflate(C1541i.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i == 2) {
                return new C0906e(this.f4269b.inflate(C1541i.mr_cast_header_item, viewGroup, false));
            }
            if (i == 3) {
                return new C0908g(this.f4269b.inflate(C1541i.mr_cast_route_item, viewGroup, false));
            }
            if (i == 4) {
                return new C0903c(this.f4269b.inflate(C1541i.mr_cast_group_item, viewGroup, false));
            }
            Log.w("MediaRouteCtrlDialog", "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        public void onViewRecycled(RecyclerView.C1087c0 c0Var) {
            super.onViewRecycled(c0Var);
            C0891h.this.f4247t.values().remove(c0Var);
        }
    }

    /* renamed from: androidx.mediarouter.app.h$i */
    /* compiled from: MediaRouteDynamicControllerDialog */
    static final class C0910i implements Comparator<C1003s.C1022i> {

        /* renamed from: b */
        static final C0910i f4311b = new C0910i();

        C0910i() {
        }

        /* renamed from: a */
        public int compare(C1003s.C1022i iVar, C1003s.C1022i iVar2) {
            return iVar.mo4807m().compareToIgnoreCase(iVar2.mo4807m());
        }
    }

    /* renamed from: androidx.mediarouter.app.h$j */
    /* compiled from: MediaRouteDynamicControllerDialog */
    private class C0911j implements SeekBar.OnSeekBarChangeListener {
        C0911j() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C1003s.C1022i iVar = (C1003s.C1022i) seekBar.getTag();
                C0897f fVar = C0891h.this.f4247t.get(iVar.mo4805k());
                if (fVar != null) {
                    fVar.mo4351c(i == 0);
                }
                iVar.mo4789G(i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C0891h hVar = C0891h.this;
            if (hVar.f4248u != null) {
                hVar.f4243p.removeMessages(2);
            }
            C0891h.this.f4248u = (C1003s.C1022i) seekBar.getTag();
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C0891h.this.f4243p.sendEmptyMessageDelayed(2, 500);
        }
    }

    public C0891h(Context context) {
        this(context, 0);
    }

    /* renamed from: f */
    private static Bitmap m4609f(Bitmap bitmap, float f, Context context) {
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(f);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        createTyped.copyTo(copy);
        createFromBitmap.destroy();
        createTyped.destroy();
        create2.destroy();
        create.destroy();
        return copy;
    }

    /* renamed from: i */
    static boolean m4610i(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* renamed from: o */
    static void m4611o(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: p */
    private void m4612p(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.f4222I;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.mo354h(this.f4223J);
            this.f4222I = null;
        }
        if (token != null && this.f4241n) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.f4239l, token);
            this.f4222I = mediaControllerCompat2;
            mediaControllerCompat2.mo352f(this.f4223J);
            MediaMetadataCompat b = this.f4222I.mo348b();
            if (b != null) {
                mediaDescriptionCompat = b.mo326f();
            }
            this.f4224K = mediaDescriptionCompat;
            mo4330n();
            mo4335t();
        }
    }

    /* renamed from: r */
    private boolean m4613r() {
        if (this.f4248u != null || this.f4250w || this.f4251x) {
            return true;
        }
        return !this.f4240m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4326g() {
        this.f4228O = false;
        this.f4229P = null;
        this.f4230Q = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public List<C1003s.C1022i> mo4327h() {
        ArrayList arrayList = new ArrayList();
        for (C1003s.C1022i next : this.f4234g.mo4811q().mo4781f()) {
            C1003s.C1022i.C1023a h = this.f4234g.mo4802h(next);
            if (h != null && h.mo4822b()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public boolean mo4328k(C1003s.C1022i iVar) {
        return !iVar.mo4818w() && iVar.mo4819x() && iVar.mo4787E(this.f4233f) && this.f4234g != iVar;
    }

    /* renamed from: m */
    public void mo4329m(List<C1003s.C1022i> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!mo4328k(list.get(size))) {
                list.remove(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4330n() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f4224K;
        Uri uri = null;
        Bitmap b = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.mo300b();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f4224K;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.mo301d();
        }
        C0895d dVar = this.f4225L;
        Bitmap b2 = dVar == null ? this.f4226M : dVar.mo4343b();
        C0895d dVar2 = this.f4225L;
        Uri c = dVar2 == null ? this.f4227N : dVar2.mo4344c();
        if (b2 != b || (b2 == null && !C5643c.m24954a(c, uri))) {
            C0895d dVar3 = this.f4225L;
            if (dVar3 != null) {
                dVar3.cancel(true);
            }
            C0895d dVar4 = new C0895d();
            this.f4225L = dVar4;
            dVar4.execute(new Void[0]);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4241n = true;
        this.f4231d.mo4703b(this.f4233f, this.f4232e, 1);
        mo4336u();
        m4612p(this.f4231d.mo4706i());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1541i.mr_cast_dialog);
        C0912i.m4680s(this.f4239l, this);
        ImageButton imageButton = (ImageButton) findViewById(C1538f.mr_cast_close_button);
        this.f4214A = imageButton;
        imageButton.setColorFilter(-1);
        this.f4214A.setOnClickListener(new C0893b());
        Button button = (Button) findViewById(C1538f.mr_cast_stop_button);
        this.f4215B = button;
        button.setTextColor(-1);
        this.f4215B.setOnClickListener(new C0894c());
        this.f4245r = new C0900h();
        RecyclerView recyclerView = (RecyclerView) findViewById(C1538f.mr_cast_list);
        this.f4244q = recyclerView;
        recyclerView.setAdapter(this.f4245r);
        this.f4244q.setLayoutManager(new LinearLayoutManager(this.f4239l));
        this.f4246s = new C0911j();
        this.f4247t = new HashMap();
        this.f4249v = new HashMap();
        this.f4216C = (ImageView) findViewById(C1538f.mr_cast_meta_background);
        this.f4217D = findViewById(C1538f.mr_cast_meta_black_scrim);
        this.f4218E = (ImageView) findViewById(C1538f.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(C1538f.mr_cast_meta_title);
        this.f4219F = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(C1538f.mr_cast_meta_subtitle);
        this.f4220G = textView2;
        textView2.setTextColor(-1);
        this.f4221H = this.f4239l.getResources().getString(C1542j.mr_cast_dialog_title_view_placeholder);
        this.f4240m = true;
        mo4334s();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4241n = false;
        this.f4231d.mo4711p(this.f4232e);
        this.f4243p.removeCallbacksAndMessages((Object) null);
        m4612p((MediaSessionCompat.Token) null);
    }

    /* renamed from: q */
    public void mo4333q(C1001r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f4233f.equals(rVar)) {
            this.f4233f = rVar;
            if (this.f4241n) {
                this.f4231d.mo4711p(this.f4232e);
                this.f4231d.mo4703b(rVar, this.f4232e, 1);
                mo4336u();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4334s() {
        getWindow().setLayout(C0880f.m4583c(this.f4239l), C0880f.m4581a(this.f4239l));
        this.f4226M = null;
        this.f4227N = null;
        mo4330n();
        mo4335t();
        mo4337v();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4335t() {
        if (m4613r()) {
            this.f4253z = true;
            return;
        }
        this.f4253z = false;
        if (!this.f4234g.mo4786C() || this.f4234g.mo4818w()) {
            dismiss();
        }
        CharSequence charSequence = null;
        if (!this.f4228O || m4610i(this.f4229P) || this.f4229P == null) {
            if (m4610i(this.f4229P)) {
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f4229P);
            }
            this.f4218E.setVisibility(8);
            this.f4217D.setVisibility(8);
            this.f4216C.setImageBitmap((Bitmap) null);
        } else {
            this.f4218E.setVisibility(0);
            this.f4218E.setImageBitmap(this.f4229P);
            this.f4218E.setBackgroundColor(this.f4230Q);
            this.f4217D.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f4216C.setImageBitmap(m4609f(this.f4229P, 10.0f, this.f4239l));
            } else {
                this.f4216C.setImageBitmap(Bitmap.createBitmap(this.f4229P));
            }
        }
        mo4326g();
        MediaDescriptionCompat mediaDescriptionCompat = this.f4224K;
        CharSequence h = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.mo306h();
        boolean z = !TextUtils.isEmpty(h);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f4224K;
        if (mediaDescriptionCompat2 != null) {
            charSequence = mediaDescriptionCompat2.mo305g();
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(charSequence);
        if (z) {
            this.f4219F.setText(h);
        } else {
            this.f4219F.setText(this.f4221H);
        }
        if (isEmpty) {
            this.f4220G.setText(charSequence);
            this.f4220G.setVisibility(0);
            return;
        }
        this.f4220G.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4336u() {
        this.f4235h.clear();
        this.f4236i.clear();
        this.f4237j.clear();
        this.f4235h.addAll(this.f4234g.mo4806l());
        for (C1003s.C1022i next : this.f4234g.mo4811q().mo4781f()) {
            C1003s.C1022i.C1023a h = this.f4234g.mo4802h(next);
            if (h != null) {
                if (h.mo4822b()) {
                    this.f4236i.add(next);
                }
                if (h.mo4823c()) {
                    this.f4237j.add(next);
                }
            }
        }
        mo4329m(this.f4236i);
        mo4329m(this.f4237j);
        List<C1003s.C1022i> list = this.f4235h;
        C0910i iVar = C0910i.f4311b;
        Collections.sort(list, iVar);
        Collections.sort(this.f4236i, iVar);
        Collections.sort(this.f4237j, iVar);
        this.f4245r.mo4360h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4337v() {
        if (!this.f4241n) {
            return;
        }
        if (SystemClock.uptimeMillis() - this.f4242o < 300) {
            this.f4243p.removeMessages(1);
            this.f4243p.sendEmptyMessageAtTime(1, this.f4242o + 300);
        } else if (m4613r()) {
            this.f4252y = true;
        } else {
            this.f4252y = false;
            if (!this.f4234g.mo4786C() || this.f4234g.mo4818w()) {
                dismiss();
            }
            this.f4242o = SystemClock.uptimeMillis();
            this.f4245r.mo4359g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo4338w() {
        if (this.f4252y) {
            mo4337v();
        }
        if (this.f4253z) {
            mo4335t();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0891h(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.C0912i.m4663b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.C0912i.m4664c(r2)
            r1.<init>(r2, r3)
            androidx.mediarouter.media.r r2 = androidx.mediarouter.media.C1001r.f4553c
            r1.f4233f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4235h = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4236i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4237j = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4238k = r2
            androidx.mediarouter.app.h$a r2 = new androidx.mediarouter.app.h$a
            r2.<init>()
            r1.f4243p = r2
            android.content.Context r2 = r1.getContext()
            r1.f4239l = r2
            androidx.mediarouter.media.s r2 = androidx.mediarouter.media.C1003s.m5133h(r2)
            r1.f4231d = r2
            androidx.mediarouter.app.h$g r3 = new androidx.mediarouter.app.h$g
            r3.<init>()
            r1.f4232e = r3
            androidx.mediarouter.media.s$i r3 = r2.mo4709l()
            r1.f4234g = r3
            androidx.mediarouter.app.h$e r3 = new androidx.mediarouter.app.h$e
            r3.<init>()
            r1.f4223J = r3
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.mo4706i()
            r1.m4612p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C0891h.<init>(android.content.Context, int):void");
    }
}
