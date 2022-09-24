package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.cast.C8547h0;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0026i;
import p002a1.C0050a;
import p006a5.C6492o;
import p114m4.C5758b;
import p234n4.C10814b;
import p243q4.C10920a;
import p243q4.C10922b;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class MediaNotificationService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final C10922b f28594r = new C10922b("MediaNotificationService");

    /* renamed from: s */
    private static Runnable f28595s;

    /* renamed from: b */
    private NotificationOptions f28596b;

    /* renamed from: c */
    private C7102a f28597c;

    /* renamed from: d */
    private ComponentName f28598d;

    /* renamed from: e */
    private ComponentName f28599e;

    /* renamed from: f */
    private List<C0026i.C0027a> f28600f = new ArrayList();

    /* renamed from: g */
    private int[] f28601g;

    /* renamed from: h */
    private long f28602h;

    /* renamed from: i */
    private C10814b f28603i;

    /* renamed from: j */
    private ImageHints f28604j;

    /* renamed from: k */
    private Resources f28605k;

    /* renamed from: l */
    private C7148v0 f28606l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C7150w0 f28607m;

    /* renamed from: n */
    private NotificationManager f28608n;

    /* renamed from: o */
    private Notification f28609o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C5758b f28610p;

    /* renamed from: q */
    private final BroadcastReceiver f28611q = new C7144t0(this);

    /* renamed from: a */
    public static boolean m29269a(@RecentlyNonNull CastOptions castOptions) {
        NotificationOptions G0;
        int i;
        int length;
        Class<C7112d> cls = C7112d.class;
        CastMediaOptions C0 = castOptions.mo29419C0();
        if (C0 == null || (G0 = C0.mo29461G0()) == null) {
            return false;
        }
        C7134o0 f1 = G0.mo29517f1();
        if (f1 == null) {
            return true;
        }
        List<NotificationAction> g = m29275g(f1);
        int[] h = m29276h(f1);
        if (g == null) {
            i = 0;
        } else {
            i = g.size();
        }
        if (g == null || g.isEmpty()) {
            f28594r.mo43192c(cls.getSimpleName().concat(" doesn't provide any action."), new Object[0]);
        } else if (g.size() > 5) {
            f28594r.mo43192c(cls.getSimpleName().concat(" provides more than 5 actions."), new Object[0]);
        } else if (h == null || (length = h.length) == 0) {
            f28594r.mo43192c(cls.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
        } else {
            int i2 = 0;
            while (i2 < length) {
                int i3 = h[i2];
                if (i3 < 0 || i3 >= i) {
                    f28594r.mo43192c(cls.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                } else {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m29270b() {
        Runnable runnable = f28595s;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: g */
    private static List<NotificationAction> m29275g(C7134o0 o0Var) {
        try {
            return o0Var.zzf();
        } catch (RemoteException e) {
            f28594r.mo43193d(e, "Unable to call %s on %s.", "getNotificationActions", C7134o0.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: h */
    private static int[] m29276h(C7134o0 o0Var) {
        try {
            return o0Var.zzg();
        } catch (RemoteException e) {
            f28594r.mo43193d(e, "Unable to call %s on %s.", "getCompactViewActionIndices", C7134o0.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: i */
    private final void m29277i() {
        this.f28600f = new ArrayList();
        for (String l : this.f28596b.mo29488C0()) {
            C0026i.C0027a l2 = m29280l(l);
            if (l2 != null) {
                this.f28600f.add(l2);
            }
        }
        this.f28601g = (int[]) this.f28596b.mo29490E0().clone();
    }

    /* renamed from: j */
    private final void m29278j(C7134o0 o0Var) {
        int[] iArr;
        C0026i.C0027a aVar;
        int[] h = m29276h(o0Var);
        if (h == null) {
            iArr = null;
        } else {
            iArr = (int[]) h.clone();
        }
        this.f28601g = iArr;
        List<NotificationAction> g = m29275g(o0Var);
        this.f28600f = new ArrayList();
        if (g != null) {
            for (NotificationAction next : g) {
                String C0 = next.mo29484C0();
                if (C0.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || C0.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || C0.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || C0.equals(MediaIntentReceiver.ACTION_FORWARD) || C0.equals(MediaIntentReceiver.ACTION_REWIND) || C0.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || C0.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    aVar = m29280l(next.mo29484C0());
                } else {
                    Intent intent = new Intent(next.mo29484C0());
                    intent.setComponent(this.f28598d);
                    aVar = new C0026i.C0027a.C0028a(next.mo29486E0(), next.mo29485D0(), C8547h0.m40980b(this, 0, intent, C8547h0.f43513a)).mo55a();
                }
                if (aVar != null) {
                    this.f28600f.add(aVar);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m29279k() {
        if (this.f28606l != null) {
            C7150w0 w0Var = this.f28607m;
            PendingIntent pendingIntent = null;
            C0026i.C0034e H = new C0026i.C0034e(this, "cast_media_notification").mo89v(w0Var == null ? null : w0Var.f28756b).mo63B(this.f28596b.mo29503R0()).mo85q(this.f28606l.f28748d).mo84p(this.f28605k.getString(this.f28596b.mo29489D0(), new Object[]{this.f28606l.f28749e})).mo91x(true).mo62A(false).mo69H(1);
            ComponentName componentName = this.f28599e;
            if (componentName != null) {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", componentName);
                intent.setAction(componentName.flattenToString());
                pendingIntent = C8547h0.m40980b(this, 1, intent, C8547h0.f43513a | 134217728);
            }
            if (pendingIntent != null) {
                H.mo83o(pendingIntent);
            }
            C7134o0 f1 = this.f28596b.mo29517f1();
            if (f1 != null) {
                f28594r.mo43194e("actionsProvider != null", new Object[0]);
                m29278j(f1);
            } else {
                f28594r.mo43194e("actionsProvider == null", new Object[0]);
                m29277i();
            }
            for (C0026i.C0027a b : this.f28600f) {
                H.mo72b(b);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                C0050a aVar = new C0050a();
                int[] iArr = this.f28601g;
                if (iArr != null) {
                    aVar.mo147u(iArr);
                }
                MediaSessionCompat.Token token = this.f28606l.f28745a;
                if (token != null) {
                    aVar.mo146t(token);
                }
                H.mo65D(aVar);
            }
            Notification c = H.mo73c();
            this.f28609o = c;
            startForeground(1, c);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p001a0.C0026i.C0027a m29280l(java.lang.String r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r20.hashCode()
            java.lang.String r4 = "com.google.android.gms.cast.framework.action.FORWARD"
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            java.lang.String r8 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            java.lang.String r9 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            java.lang.String r10 = "com.google.android.gms.cast.framework.action.REWIND"
            r11 = 1
            r12 = 0
            switch(r2) {
                case -1699820260: goto L_0x004c;
                case -945151566: goto L_0x0044;
                case -945080078: goto L_0x003c;
                case -668151673: goto L_0x0034;
                case -124479363: goto L_0x002c;
                case 235550565: goto L_0x0024;
                case 1362116196: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x0054
        L_0x001c:
            boolean r2 = r1.equals(r4)
            if (r2 == 0) goto L_0x0054
            r2 = 3
            goto L_0x0055
        L_0x0024:
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L_0x0054
            r2 = 0
            goto L_0x0055
        L_0x002c:
            boolean r2 = r1.equals(r6)
            if (r2 == 0) goto L_0x0054
            r2 = 6
            goto L_0x0055
        L_0x0034:
            boolean r2 = r1.equals(r7)
            if (r2 == 0) goto L_0x0054
            r2 = 5
            goto L_0x0055
        L_0x003c:
            boolean r2 = r1.equals(r8)
            if (r2 == 0) goto L_0x0054
            r2 = 2
            goto L_0x0055
        L_0x0044:
            boolean r2 = r1.equals(r9)
            if (r2 == 0) goto L_0x0054
            r2 = 1
            goto L_0x0055
        L_0x004c:
            boolean r2 = r1.equals(r10)
            if (r2 == 0) goto L_0x0054
            r2 = 4
            goto L_0x0055
        L_0x0054:
            r2 = -1
        L_0x0055:
            r13 = 30000(0x7530, double:1.4822E-319)
            r15 = 10000(0x2710, double:4.9407E-320)
            r17 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r3 = "googlecast-extra_skip_step_ms"
            r18 = 0
            switch(r2) {
                case 0: goto L_0x01da;
                case 1: goto L_0x01a6;
                case 2: goto L_0x0172;
                case 3: goto L_0x011e;
                case 4: goto L_0x00ca;
                case 5: goto L_0x009e;
                case 6: goto L_0x006e;
                default: goto L_0x0062;
            }
        L_0x0062:
            q4.b r2 = f28594r
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r12] = r1
            java.lang.String r1 = "Action: %s is not a pre-defined action."
            r2.mo43192c(r1, r3)
            return r18
        L_0x006e:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6)
            android.content.ComponentName r2 = r0.f28598d
            r1.setComponent(r2)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r0, r12, r1, r12)
            a0.i$a$a r2 = new a0.i$a$a
            com.google.android.gms.cast.framework.media.NotificationOptions r3 = r0.f28596b
            int r3 = r3.mo29491F0()
            android.content.res.Resources r4 = r0.f28605k
            com.google.android.gms.cast.framework.media.NotificationOptions r5 = r0.f28596b
            int r5 = r5.mo29516e1()
            java.lang.Object[] r6 = new java.lang.Object[r11]
            java.lang.String r7 = ""
            r6[r12] = r7
            java.lang.String r4 = r4.getString(r5, r6)
            r2.<init>(r3, r4, r1)
            a0.i$a r1 = r2.mo55a()
            return r1
        L_0x009e:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r7)
            android.content.ComponentName r2 = r0.f28598d
            r1.setComponent(r2)
            int r2 = com.google.android.gms.internal.cast.C8547h0.f43513a
            android.app.PendingIntent r1 = com.google.android.gms.internal.cast.C8547h0.m40980b(r0, r12, r1, r2)
            a0.i$a$a r2 = new a0.i$a$a
            com.google.android.gms.cast.framework.media.NotificationOptions r3 = r0.f28596b
            int r3 = r3.mo29491F0()
            android.content.res.Resources r4 = r0.f28605k
            com.google.android.gms.cast.framework.media.NotificationOptions r5 = r0.f28596b
            int r5 = r5.mo29516e1()
            java.lang.String r4 = r4.getString(r5)
            r2.<init>(r3, r4, r1)
            a0.i$a r1 = r2.mo55a()
            return r1
        L_0x00ca:
            long r1 = r0.f28602h
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r10)
            android.content.ComponentName r5 = r0.f28598d
            r4.setComponent(r5)
            r4.putExtra(r3, r1)
            int r3 = com.google.android.gms.internal.cast.C8547h0.f43513a
            r3 = r3 | r17
            android.app.PendingIntent r3 = com.google.android.gms.internal.cast.C8547h0.m40980b(r0, r12, r4, r3)
            com.google.android.gms.cast.framework.media.NotificationOptions r4 = r0.f28596b
            int r4 = r4.mo29499N0()
            com.google.android.gms.cast.framework.media.NotificationOptions r5 = r0.f28596b
            int r5 = r5.mo29513b1()
            int r6 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x00fe
            com.google.android.gms.cast.framework.media.NotificationOptions r1 = r0.f28596b
            int r4 = r1.mo29497L0()
            com.google.android.gms.cast.framework.media.NotificationOptions r1 = r0.f28596b
            int r5 = r1.mo29514c1()
            goto L_0x010e
        L_0x00fe:
            int r6 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x010e
            com.google.android.gms.cast.framework.media.NotificationOptions r1 = r0.f28596b
            int r4 = r1.mo29498M0()
            com.google.android.gms.cast.framework.media.NotificationOptions r1 = r0.f28596b
            int r5 = r1.mo29515d1()
        L_0x010e:
            a0.i$a$a r1 = new a0.i$a$a
            android.content.res.Resources r2 = r0.f28605k
            java.lang.String r2 = r2.getString(r5)
            r1.<init>(r4, r2, r3)
            a0.i$a r1 = r1.mo55a()
            return r1
        L_0x011e:
            long r1 = r0.f28602h
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r4)
            android.content.ComponentName r4 = r0.f28598d
            r5.setComponent(r4)
            r5.putExtra(r3, r1)
            int r3 = com.google.android.gms.internal.cast.C8547h0.f43513a
            r3 = r3 | r17
            android.app.PendingIntent r3 = com.google.android.gms.internal.cast.C8547h0.m40980b(r0, r12, r5, r3)
            com.google.android.gms.cast.framework.media.NotificationOptions r4 = r0.f28596b
            int r4 = r4.mo29494I0()
            com.google.android.gms.cast.framework.media.NotificationOptions r5 = r0.f28596b
            int r5 = r5.mo29510Y0()
            int r6 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x0152
            com.google.android.gms.cast.framework.media.NotificationOptions r1 = r0.f28596b
            int r4 = r1.mo29492G0()
            com.google.android.gms.cast.framework.media.NotificationOptions r1 = r0.f28596b
            int r5 = r1.mo29511Z0()
            goto L_0x0162
        L_0x0152:
            int r6 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0162
            com.google.android.gms.cast.framework.media.NotificationOptions r1 = r0.f28596b
            int r4 = r1.mo29493H0()
            com.google.android.gms.cast.framework.media.NotificationOptions r1 = r0.f28596b
            int r5 = r1.mo29512a1()
        L_0x0162:
            a0.i$a$a r1 = new a0.i$a$a
            android.content.res.Resources r2 = r0.f28605k
            java.lang.String r2 = r2.getString(r5)
            r1.<init>(r4, r2, r3)
            a0.i$a r1 = r1.mo55a()
            return r1
        L_0x0172:
            com.google.android.gms.cast.framework.media.v0 r1 = r0.f28606l
            boolean r1 = r1.f28751g
            if (r1 == 0) goto L_0x0188
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8)
            android.content.ComponentName r2 = r0.f28598d
            r1.setComponent(r2)
            int r2 = com.google.android.gms.internal.cast.C8547h0.f43513a
            android.app.PendingIntent r18 = com.google.android.gms.internal.cast.C8547h0.m40980b(r0, r12, r1, r2)
        L_0x0188:
            r1 = r18
            a0.i$a$a r2 = new a0.i$a$a
            com.google.android.gms.cast.framework.media.NotificationOptions r3 = r0.f28596b
            int r3 = r3.mo29501P0()
            android.content.res.Resources r4 = r0.f28605k
            com.google.android.gms.cast.framework.media.NotificationOptions r5 = r0.f28596b
            int r5 = r5.mo29509X0()
            java.lang.String r4 = r4.getString(r5)
            r2.<init>(r3, r4, r1)
            a0.i$a r1 = r2.mo55a()
            return r1
        L_0x01a6:
            com.google.android.gms.cast.framework.media.v0 r1 = r0.f28606l
            boolean r1 = r1.f28750f
            if (r1 == 0) goto L_0x01bc
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r9)
            android.content.ComponentName r2 = r0.f28598d
            r1.setComponent(r2)
            int r2 = com.google.android.gms.internal.cast.C8547h0.f43513a
            android.app.PendingIntent r18 = com.google.android.gms.internal.cast.C8547h0.m40980b(r0, r12, r1, r2)
        L_0x01bc:
            r1 = r18
            a0.i$a$a r2 = new a0.i$a$a
            com.google.android.gms.cast.framework.media.NotificationOptions r3 = r0.f28596b
            int r3 = r3.mo29500O0()
            android.content.res.Resources r4 = r0.f28605k
            com.google.android.gms.cast.framework.media.NotificationOptions r5 = r0.f28596b
            int r5 = r5.mo29508W0()
            java.lang.String r4 = r4.getString(r5)
            r2.<init>(r3, r4, r1)
            a0.i$a r1 = r2.mo55a()
            return r1
        L_0x01da:
            com.google.android.gms.cast.framework.media.v0 r1 = r0.f28606l
            int r2 = r1.f28747c
            boolean r1 = r1.f28746b
            r3 = 2
            if (r2 != r3) goto L_0x01f0
            com.google.android.gms.cast.framework.media.NotificationOptions r2 = r0.f28596b
            int r2 = r2.mo29504S0()
            com.google.android.gms.cast.framework.media.NotificationOptions r3 = r0.f28596b
            int r3 = r3.mo29505T0()
            goto L_0x01fc
        L_0x01f0:
            com.google.android.gms.cast.framework.media.NotificationOptions r2 = r0.f28596b
            int r2 = r2.mo29495J0()
            com.google.android.gms.cast.framework.media.NotificationOptions r3 = r0.f28596b
            int r3 = r3.mo29507V0()
        L_0x01fc:
            if (r1 != 0) goto L_0x0204
            com.google.android.gms.cast.framework.media.NotificationOptions r2 = r0.f28596b
            int r2 = r2.mo29496K0()
        L_0x0204:
            if (r1 != 0) goto L_0x020c
            com.google.android.gms.cast.framework.media.NotificationOptions r1 = r0.f28596b
            int r3 = r1.zzc()
        L_0x020c:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5)
            android.content.ComponentName r4 = r0.f28598d
            r1.setComponent(r4)
            int r4 = com.google.android.gms.internal.cast.C8547h0.f43513a
            android.app.PendingIntent r1 = com.google.android.gms.internal.cast.C8547h0.m40980b(r0, r12, r1, r4)
            a0.i$a$a r4 = new a0.i$a$a
            android.content.res.Resources r5 = r0.f28605k
            java.lang.String r3 = r5.getString(r3)
            r4.<init>(r2, r3, r1)
            a0.i$a r1 = r4.mo55a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.m29280l(java.lang.String):a0.i$a");
    }

    @RecentlyNullable
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        return null;
    }

    public void onCreate() {
        this.f28608n = (NotificationManager) getSystemService("notification");
        C5758b e = C5758b.m25464e(this);
        this.f28610p = e;
        CastMediaOptions castMediaOptions = (CastMediaOptions) C4604n.m20098k(e.mo22533a().mo29419C0());
        this.f28596b = (NotificationOptions) C4604n.m20098k(castMediaOptions.mo29461G0());
        this.f28597c = castMediaOptions.mo29458D0();
        this.f28605k = getResources();
        this.f28598d = new ComponentName(getApplicationContext(), castMediaOptions.mo29459E0());
        if (!TextUtils.isEmpty(this.f28596b.mo29506U0())) {
            this.f28599e = new ComponentName(getApplicationContext(), this.f28596b.mo29506U0());
        } else {
            this.f28599e = null;
        }
        this.f28602h = this.f28596b.mo29502Q0();
        int dimensionPixelSize = this.f28605k.getDimensionPixelSize(this.f28596b.zza());
        this.f28604j = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        this.f28603i = new C10814b(getApplicationContext(), this.f28604j);
        ComponentName componentName = this.f28599e;
        if (componentName != null) {
            registerReceiver(this.f28611q, new IntentFilter(componentName.flattenToString()));
        }
        if (C6492o.m28288k()) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
            notificationChannel.setShowBadge(false);
            this.f28608n.createNotificationChannel(notificationChannel);
        }
    }

    public void onDestroy() {
        C10814b bVar = this.f28603i;
        if (bVar != null) {
            bVar.mo42982c();
        }
        if (this.f28599e != null) {
            try {
                unregisterReceiver(this.f28611q);
            } catch (IllegalArgumentException e) {
                f28594r.mo43193d(e, "Unregistering trampoline BroadcastReceiver failed", new Object[0]);
            }
        }
        f28595s = null;
        this.f28608n.cancel(1);
    }

    public int onStartCommand(@RecentlyNonNull Intent intent, int i, int i2) {
        WebImage webImage;
        C7148v0 v0Var;
        Intent intent2 = intent;
        MediaInfo mediaInfo = (MediaInfo) C4604n.m20098k((MediaInfo) intent2.getParcelableExtra("extra_media_info"));
        MediaMetadata mediaMetadata = (MediaMetadata) C4604n.m20098k(mediaInfo.mo29227L0());
        C7148v0 v0Var2 = new C7148v0(intent2.getIntExtra("extra_remote_media_client_player_state", 0) == 2, mediaInfo.mo29230O0(), mediaMetadata.mo29280G0("com.google.android.gms.cast.metadata.TITLE"), ((CastDevice) C4604n.m20098k((CastDevice) intent2.getParcelableExtra("extra_cast_device"))).mo29182E0(), (MediaSessionCompat.Token) intent2.getParcelableExtra("extra_media_session_token"), intent2.getBooleanExtra("extra_can_skip_next", false), intent2.getBooleanExtra("extra_can_skip_prev", false));
        if (intent2.getBooleanExtra("extra_media_notification_force_update", false) || (v0Var = this.f28606l) == null || v0Var2.f28746b != v0Var.f28746b || v0Var2.f28747c != v0Var.f28747c || !C10920a.m49143f(v0Var2.f28748d, v0Var.f28748d) || !C10920a.m49143f(v0Var2.f28749e, v0Var.f28749e) || v0Var2.f28750f != v0Var.f28750f || v0Var2.f28751g != v0Var.f28751g) {
            this.f28606l = v0Var2;
            m29279k();
        }
        C7102a aVar = this.f28597c;
        if (aVar != null) {
            webImage = aVar.mo29525b(mediaMetadata, this.f28604j);
        } else {
            webImage = mediaMetadata.mo29282I0() ? mediaMetadata.mo29278E0().get(0) : null;
        }
        C7150w0 w0Var = new C7150w0(webImage);
        C7150w0 w0Var2 = this.f28607m;
        if (w0Var2 == null || !C10920a.m49143f(w0Var.f28755a, w0Var2.f28755a)) {
            this.f28603i.mo42980a(new C7146u0(this, w0Var));
            this.f28603i.mo42981b(w0Var.f28755a);
        }
        startForeground(1, this.f28609o);
        f28595s = new C7142s0(this, i2);
        return 2;
    }
}
