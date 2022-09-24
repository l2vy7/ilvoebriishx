package p234n4;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.support.p007v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.internal.cast.C8497e;
import com.google.android.gms.internal.cast.C8547h0;
import com.google.android.gms.internal.cast.C8564i0;
import p006a5.C6492o;
import p114m4.C10770m;
import p243q4.C10922b;

/* renamed from: n4.p */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10828p implements C4580e.C4582b {

    /* renamed from: n */
    private static final C10922b f49575n = new C10922b("MediaSessionManager");

    /* renamed from: a */
    private final Context f49576a;

    /* renamed from: b */
    private final CastOptions f49577b;

    /* renamed from: c */
    private final C8497e f49578c;

    /* renamed from: d */
    private final ComponentName f49579d;

    /* renamed from: e */
    private final C10814b f49580e;

    /* renamed from: f */
    private final C10814b f49581f;

    /* renamed from: g */
    private final Handler f49582g;

    /* renamed from: h */
    private final Runnable f49583h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4580e f49584i;

    /* renamed from: j */
    private CastDevice f49585j;

    /* renamed from: k */
    private MediaSessionCompat f49586k;

    /* renamed from: l */
    private MediaSessionCompat.C0158b f49587l;

    /* renamed from: m */
    private boolean f49588m;

    public C10828p(Context context, CastOptions castOptions, C8497e eVar) {
        this.f49576a = context;
        this.f49577b = castOptions;
        this.f49578c = eVar;
        if (castOptions.mo29419C0() == null || TextUtils.isEmpty(castOptions.mo29419C0().mo29457C0())) {
            this.f49579d = null;
        } else {
            this.f49579d = new ComponentName(context, castOptions.mo29419C0().mo29457C0());
        }
        C10814b bVar = new C10814b(context);
        this.f49580e = bVar;
        bVar.mo42980a(new C10825m(this));
        C10814b bVar2 = new C10814b(context);
        this.f49581f = bVar2;
        bVar2.mo42980a(new C10826n(this));
        this.f49582g = new C8564i0(Looper.getMainLooper());
        this.f49583h = new C10824l(this);
    }

    /* renamed from: a */
    public static Bitmap m48800a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = (float) width;
        int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
        float f2 = (float) ((i - height) / 2);
        RectF rectF = new RectF(0.0f, f2, f, ((float) height) + f2);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return createBitmap;
    }

    /* renamed from: n */
    private final void m48803n(int i, MediaInfo mediaInfo) {
        long j;
        PendingIntent pendingIntent;
        MediaSessionCompat mediaSessionCompat = this.f49586k;
        if (mediaSessionCompat != null) {
            long j2 = 0;
            if (i == 0) {
                mediaSessionCompat.mo416o(new PlaybackStateCompat.C0179b().mo619c(0, 0, 1.0f).mo617a());
                this.f49586k.mo415n(new MediaMetadataCompat.C0141b().mo336a());
                return;
            }
            long j3 = true != this.f49584i.mo17852q() ? 768 : 512;
            if (this.f49584i.mo17852q()) {
                j = 0;
            } else {
                j = this.f49584i.mo17842g();
            }
            this.f49586k.mo416o(new PlaybackStateCompat.C0179b().mo619c(i, j, 1.0f).mo618b(j3).mo617a());
            MediaSessionCompat mediaSessionCompat2 = this.f49586k;
            if (this.f49579d == null) {
                pendingIntent = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(this.f49579d);
                pendingIntent = C8547h0.m40979a(this.f49576a, 0, intent, C8547h0.f43513a | 134217728);
            }
            mediaSessionCompat2.mo419r(pendingIntent);
            if (this.f49586k != null) {
                MediaMetadata L0 = mediaInfo.mo29227L0();
                if (!this.f49584i.mo17852q()) {
                    j2 = mediaInfo.mo29229N0();
                }
                this.f49586k.mo415n(m48806q().mo339d("android.media.metadata.TITLE", L0.mo29280G0("com.google.android.gms.cast.metadata.TITLE")).mo339d("android.media.metadata.DISPLAY_TITLE", L0.mo29280G0("com.google.android.gms.cast.metadata.TITLE")).mo339d("android.media.metadata.DISPLAY_SUBTITLE", L0.mo29280G0("com.google.android.gms.cast.metadata.SUBTITLE")).mo338c("android.media.metadata.DURATION", j2).mo336a());
                Uri p = m48805p(L0, 0);
                if (p != null) {
                    this.f49580e.mo42981b(p);
                } else {
                    m48804o((Bitmap) null, 0);
                }
                Uri p2 = m48805p(L0, 3);
                if (p2 != null) {
                    this.f49581f.mo42981b(p2);
                } else {
                    m48804o((Bitmap) null, 3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m48804o(Bitmap bitmap, int i) {
        MediaSessionCompat mediaSessionCompat = this.f49586k;
        if (mediaSessionCompat != null) {
            if (i == 0) {
                if (bitmap != null) {
                    mediaSessionCompat.mo415n(m48806q().mo337b("android.media.metadata.DISPLAY_ICON", bitmap).mo336a());
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(0);
                this.f49586k.mo415n(m48806q().mo337b("android.media.metadata.DISPLAY_ICON", createBitmap).mo336a());
            } else if (i == 3) {
                mediaSessionCompat.mo415n(m48806q().mo337b("android.media.metadata.ALBUM_ART", bitmap).mo336a());
            }
        }
    }

    /* renamed from: p */
    private final Uri m48805p(MediaMetadata mediaMetadata, int i) {
        WebImage webImage;
        if (this.f49577b.mo29419C0().mo29458D0() != null) {
            webImage = this.f49577b.mo29419C0().mo29458D0().mo29524a(mediaMetadata, i);
        } else {
            webImage = mediaMetadata.mo29282I0() ? mediaMetadata.mo29278E0().get(0) : null;
        }
        if (webImage == null) {
            return null;
        }
        return webImage.mo29998D0();
    }

    /* renamed from: q */
    private final MediaMetadataCompat.C0141b m48806q() {
        MediaSessionCompat mediaSessionCompat = this.f49586k;
        MediaMetadataCompat b = mediaSessionCompat == null ? null : mediaSessionCompat.mo406d().mo348b();
        if (b == null) {
            return new MediaMetadataCompat.C0141b();
        }
        return new MediaMetadataCompat.C0141b(b);
    }

    /* renamed from: r */
    private final void m48807r() {
        if (this.f49577b.mo29419C0().mo29461G0() != null) {
            f49575n.mo43190a("Stopping notification service.", new Object[0]);
            if (Build.VERSION.SDK_INT >= 26) {
                MediaNotificationService.m29270b();
                return;
            }
            Intent intent = new Intent(this.f49576a, MediaNotificationService.class);
            intent.setPackage(this.f49576a.getPackageName());
            intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
            this.f49576a.stopService(intent);
        }
    }

    /* renamed from: s */
    private final void m48808s(boolean z) {
        if (this.f49577b.mo29420D0()) {
            this.f49582g.removeCallbacks(this.f49583h);
            Intent intent = new Intent(this.f49576a, ReconnectionService.class);
            intent.setPackage(this.f49576a.getPackageName());
            try {
                this.f49576a.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.f49582g.postDelayed(this.f49583h, 1000);
                }
            }
        }
    }

    /* renamed from: t */
    private final void m48809t() {
        if (this.f49577b.mo29420D0()) {
            this.f49582g.removeCallbacks(this.f49583h);
            Intent intent = new Intent(this.f49576a, ReconnectionService.class);
            intent.setPackage(this.f49576a.getPackageName());
            this.f49576a.stopService(intent);
        }
    }

    /* renamed from: b */
    public final void mo42989b(C4580e eVar, CastDevice castDevice) {
        CastOptions castOptions;
        if (!this.f49588m && (castOptions = this.f49577b) != null && castOptions.mo29419C0() != null && eVar != null && castDevice != null) {
            this.f49584i = eVar;
            eVar.mo17837b(this);
            this.f49585j = castDevice;
            if (!C6492o.m28285h()) {
                ((AudioManager) this.f49576a.getSystemService("audio")).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 3);
            }
            ComponentName componentName = new ComponentName(this.f49576a, this.f49577b.mo29419C0().mo29459E0());
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            PendingIntent b = C8547h0.m40980b(this.f49576a, 0, intent, C8547h0.f43513a);
            if (this.f49577b.mo29419C0().mo29460F0()) {
                this.f49586k = new MediaSessionCompat(this.f49576a, "CastMediaSession", componentName, b);
                m48803n(0, (MediaInfo) null);
                CastDevice castDevice2 = this.f49585j;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.mo29182E0())) {
                    this.f49586k.mo415n(new MediaMetadataCompat.C0141b().mo339d("android.media.metadata.ALBUM_ARTIST", this.f49576a.getResources().getString(C10770m.f49451b, new Object[]{this.f49585j.mo29182E0()})).mo336a());
                }
                C10827o oVar = new C10827o(this);
                this.f49587l = oVar;
                this.f49586k.mo413l(oVar);
                this.f49586k.mo412k(true);
                this.f49578c.mo36444b2(this.f49586k);
            }
            this.f49588m = true;
            mo42991i(false);
        }
    }

    /* renamed from: c */
    public final void mo9079c() {
        mo42991i(false);
    }

    /* renamed from: d */
    public final void mo9080d() {
        mo42991i(false);
    }

    /* renamed from: e */
    public final void mo9081e() {
    }

    /* renamed from: f */
    public final void mo9082f() {
        mo42991i(false);
    }

    /* renamed from: g */
    public final void mo9083g() {
        mo42991i(false);
    }

    /* renamed from: h */
    public final void mo42990h(int i) {
        if (this.f49588m) {
            this.f49588m = false;
            C4580e eVar = this.f49584i;
            if (eVar != null) {
                eVar.mo17821F(this);
            }
            if (!C6492o.m28285h()) {
                ((AudioManager) this.f49576a.getSystemService("audio")).abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
            }
            this.f49578c.mo36444b2((MediaSessionCompat) null);
            this.f49580e.mo42982c();
            C10814b bVar = this.f49581f;
            if (bVar != null) {
                bVar.mo42982c();
            }
            MediaSessionCompat mediaSessionCompat = this.f49586k;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.mo419r((PendingIntent) null);
                this.f49586k.mo413l((MediaSessionCompat.C0158b) null);
                this.f49586k.mo415n(new MediaMetadataCompat.C0141b().mo336a());
                m48803n(0, (MediaInfo) null);
                this.f49586k.mo412k(false);
                this.f49586k.mo410i();
                this.f49586k = null;
            }
            this.f49584i = null;
            this.f49585j = null;
            this.f49587l = null;
            m48807r();
            if (i == 0) {
                m48809t();
            }
        }
    }

    /* renamed from: i */
    public final void mo42991i(boolean z) {
        boolean z2;
        boolean z3;
        MediaQueueItem i;
        C4580e eVar = this.f49584i;
        if (eVar != null) {
            MediaInfo j = eVar.mo17845j();
            int i2 = 6;
            if (!this.f49584i.mo17851p()) {
                if (this.f49584i.mo17855t()) {
                    i2 = 3;
                } else if (this.f49584i.mo17854s()) {
                    i2 = 2;
                } else if (!this.f49584i.mo17853r() || (i = this.f49584i.mo17844i()) == null || i.mo29320G0() == null) {
                    i2 = 0;
                } else {
                    j = i.mo29320G0();
                }
            }
            if (j == null || j.mo29227L0() == null) {
                i2 = 0;
            }
            m48803n(i2, j);
            if (!this.f49584i.mo17850o()) {
                m48807r();
                m48809t();
            } else if (i2 != 0) {
                if (this.f49585j != null && MediaNotificationService.m29269a(this.f49577b)) {
                    Intent intent = new Intent(this.f49576a, MediaNotificationService.class);
                    intent.putExtra("extra_media_notification_force_update", z);
                    intent.setPackage(this.f49576a.getPackageName());
                    intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
                    intent.putExtra("extra_media_info", this.f49584i.mo17845j());
                    intent.putExtra("extra_remote_media_client_player_state", this.f49584i.mo17848m());
                    intent.putExtra("extra_cast_device", this.f49585j);
                    MediaSessionCompat mediaSessionCompat = this.f49586k;
                    if (mediaSessionCompat != null) {
                        intent.putExtra("extra_media_session_token", mediaSessionCompat.mo408f());
                    }
                    MediaStatus k = this.f49584i.mo17846k();
                    int S0 = k.mo29346S0();
                    if (S0 == 1 || S0 == 2 || S0 == 3) {
                        z2 = true;
                        z3 = true;
                    } else {
                        Integer H0 = k.mo29335H0(k.mo29333F0());
                        if (H0 != null) {
                            z3 = H0.intValue() > 0;
                            z2 = H0.intValue() < k.mo29345R0() + -1;
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                    }
                    intent.putExtra("extra_can_skip_next", z2);
                    intent.putExtra("extra_can_skip_prev", z3);
                    f49575n.mo43190a("Starting notification service.", new Object[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        this.f49576a.startForegroundService(intent);
                    } else {
                        this.f49576a.startService(intent);
                    }
                }
                if (!this.f49584i.mo17853r()) {
                    m48808s(true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo42992j() {
        m48808s(false);
    }

    /* renamed from: l */
    public final void mo9084l() {
        mo42991i(false);
    }
}
