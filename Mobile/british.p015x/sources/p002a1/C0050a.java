package p002a1;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import p001a0.C0025h;
import p001a0.C0026i;
import p182z0.C6429f;
import p182z0.C6430g;
import p182z0.C6431h;

/* renamed from: a1.a */
/* compiled from: NotificationCompat */
public class C0050a extends C0026i.C0035f {

    /* renamed from: e */
    int[] f163e = null;

    /* renamed from: f */
    MediaSessionCompat.Token f164f;

    /* renamed from: g */
    boolean f165g;

    /* renamed from: h */
    PendingIntent f166h;

    /* renamed from: p */
    private RemoteViews m198p(C0026i.C0027a aVar) {
        boolean z = aVar.mo44a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f104a.f78a.getPackageName(), C6431h.f26468a);
        int i = C6429f.f26463a;
        remoteViews.setImageViewResource(i, aVar.mo48e());
        if (!z) {
            remoteViews.setOnClickPendingIntent(i, aVar.mo44a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(i, aVar.mo53j());
        }
        return remoteViews;
    }

    /* renamed from: b */
    public void mo56b(C0025h hVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            hVar.mo43a().setStyle(mo140m(new Notification.MediaStyle()));
        } else if (this.f165g) {
            hVar.mo43a().setOngoing(true);
        }
    }

    /* renamed from: i */
    public RemoteViews mo96i(C0025h hVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return mo141n();
    }

    /* renamed from: j */
    public RemoteViews mo97j(C0025h hVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return mo142o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Notification.MediaStyle mo140m(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f163e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f164f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.mo438f());
        }
        return mediaStyle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RemoteViews mo141n() {
        int min = Math.min(this.f104a.f79b.size(), 5);
        RemoteViews c = mo94c(false, mo143q(min), false);
        c.removeAllViews(C6429f.f26466d);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                c.addView(C6429f.f26466d, m198p(this.f104a.f79b.get(i)));
            }
        }
        if (this.f165g) {
            int i2 = C6429f.f26464b;
            c.setViewVisibility(i2, 0);
            c.setInt(i2, "setAlpha", this.f104a.f78a.getResources().getInteger(C6430g.f26467a));
            c.setOnClickPendingIntent(i2, this.f166h);
        } else {
            c.setViewVisibility(C6429f.f26464b, 8);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public RemoteViews mo142o() {
        int i;
        RemoteViews c = mo94c(false, mo144r(), true);
        int size = this.f104a.f79b.size();
        int[] iArr = this.f163e;
        if (iArr == null) {
            i = 0;
        } else {
            i = Math.min(iArr.length, 3);
        }
        c.removeAllViews(C6429f.f26466d);
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                if (i2 < size) {
                    c.addView(C6429f.f26466d, m198p(this.f104a.f79b.get(this.f163e[i2])));
                    i2++;
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                }
            }
        }
        if (this.f165g) {
            c.setViewVisibility(C6429f.f26465c, 8);
            int i3 = C6429f.f26464b;
            c.setViewVisibility(i3, 0);
            c.setOnClickPendingIntent(i3, this.f166h);
            c.setInt(i3, "setAlpha", this.f104a.f78a.getResources().getInteger(C6430g.f26467a));
        } else {
            c.setViewVisibility(C6429f.f26465c, 0);
            c.setViewVisibility(C6429f.f26464b, 8);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo143q(int i) {
        if (i <= 3) {
            return C6431h.f26470c;
        }
        return C6431h.f26469b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo144r() {
        return C6431h.f26471d;
    }

    /* renamed from: s */
    public C0050a mo145s(PendingIntent pendingIntent) {
        this.f166h = pendingIntent;
        return this;
    }

    /* renamed from: t */
    public C0050a mo146t(MediaSessionCompat.Token token) {
        this.f164f = token;
        return this;
    }

    /* renamed from: u */
    public C0050a mo147u(int... iArr) {
        this.f163e = iArr;
        return this;
    }

    /* renamed from: v */
    public C0050a mo148v(boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            this.f165g = z;
        }
        return this;
    }
}
