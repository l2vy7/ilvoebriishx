package p125o4;

import android.text.format.DateUtils;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.common.internal.C4604n;
import java.text.DateFormat;
import java.util.Date;
import p243q4.C10920a;

/* renamed from: o4.c */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10844c {

    /* renamed from: a */
    C4580e f49616a;

    private C10844c() {
    }

    /* renamed from: a */
    public static C10844c m48844a() {
        return new C10844c();
    }

    /* renamed from: o */
    private final MediaMetadata m48845o() {
        MediaInfo j;
        C4580e eVar = this.f49616a;
        if (eVar == null || !eVar.mo17850o() || (j = this.f49616a.mo17845j()) == null) {
            return null;
        }
        return j.mo29227L0();
    }

    /* renamed from: p */
    private static final String m48846p(long j) {
        if (j >= 0) {
            return DateUtils.formatElapsedTime(j / 1000);
        }
        String valueOf = String.valueOf(DateUtils.formatElapsedTime((-j) / 1000));
        return valueOf.length() != 0 ? "-".concat(valueOf) : new String("-");
    }

    /* renamed from: b */
    public final int mo43012b() {
        MediaInfo G0;
        C4580e eVar = this.f49616a;
        long j = 1;
        if (eVar != null && eVar.mo17850o()) {
            C4580e eVar2 = this.f49616a;
            if (eVar2.mo17852q()) {
                Long j2 = mo43020j();
                if (j2 != null) {
                    j = j2.longValue();
                } else {
                    Long l = mo43022l();
                    j = l != null ? l.longValue() : Math.max(eVar2.mo17842g(), 1);
                }
            } else if (eVar2.mo17853r()) {
                MediaQueueItem i = eVar2.mo17844i();
                if (!(i == null || (G0 = i.mo29320G0()) == null)) {
                    j = Math.max(G0.mo29229N0(), 1);
                }
            } else {
                j = Math.max(eVar2.mo17849n(), 1);
            }
        }
        return Math.max((int) (j - mo43018h()), 1);
    }

    /* renamed from: c */
    public final int mo43013c() {
        C4580e eVar = this.f49616a;
        if (eVar == null || !eVar.mo17850o()) {
            return 0;
        }
        C4580e eVar2 = this.f49616a;
        if (!eVar2.mo17852q() && eVar2.mo17853r()) {
            return 0;
        }
        int g = (int) (eVar2.mo17842g() - mo43018h());
        if (eVar2.mo17835T()) {
            g = C10920a.m49145h(g, mo43016f(), mo43017g());
        }
        return C10920a.m49145h(g, 0, mo43012b());
    }

    /* renamed from: d */
    public final boolean mo43014d(long j) {
        C4580e eVar = this.f49616a;
        if (eVar == null || !eVar.mo17850o() || !this.f49616a.mo17835T() || (((long) mo43017g()) + mo43018h()) - j >= ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo43015e() {
        return mo43014d(((long) mo43013c()) + mo43018h());
    }

    /* renamed from: f */
    public final int mo43016f() {
        C4580e eVar = this.f49616a;
        if (eVar == null || !eVar.mo17850o() || !this.f49616a.mo17852q() || !this.f49616a.mo17835T()) {
            return 0;
        }
        return C10920a.m49145h((int) (((Long) C4604n.m20098k(mo43021k())).longValue() - mo43018h()), 0, mo43012b());
    }

    /* renamed from: g */
    public final int mo43017g() {
        C4580e eVar = this.f49616a;
        if (eVar == null || !eVar.mo17850o() || !this.f49616a.mo17852q()) {
            return mo43012b();
        }
        if (!this.f49616a.mo17835T()) {
            return 0;
        }
        return C10920a.m49145h((int) (((Long) C4604n.m20098k(mo43022l())).longValue() - mo43018h()), 0, mo43012b());
    }

    /* renamed from: h */
    public final long mo43018h() {
        C4580e eVar = this.f49616a;
        if (eVar == null || !eVar.mo17850o() || !this.f49616a.mo17852q()) {
            return 0;
        }
        C4580e eVar2 = this.f49616a;
        Long i = mo43019i();
        if (i != null) {
            return i.longValue();
        }
        Long k = mo43021k();
        if (k != null) {
            return k.longValue();
        }
        return eVar2.mo17842g();
    }

    /* renamed from: i */
    public final Long mo43019i() {
        C4580e eVar = this.f49616a;
        if (eVar != null && eVar.mo17850o() && this.f49616a.mo17852q()) {
            C4580e eVar2 = this.f49616a;
            MediaInfo j = eVar2.mo17845j();
            MediaMetadata o = m48845o();
            if (j != null && o != null && o.mo29277D0("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA") && (o.mo29277D0("com.google.android.gms.cast.metadata.SECTION_DURATION") || eVar2.mo17835T())) {
                return Long.valueOf(o.mo29281H0("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"));
            }
        }
        return null;
    }

    /* renamed from: j */
    public final Long mo43020j() {
        MediaMetadata o;
        Long i;
        C4580e eVar = this.f49616a;
        if (eVar == null || !eVar.mo17850o() || !this.f49616a.mo17852q() || (o = m48845o()) == null || !o.mo29277D0("com.google.android.gms.cast.metadata.SECTION_DURATION") || (i = mo43019i()) == null) {
            return null;
        }
        return Long.valueOf(i.longValue() + o.mo29281H0("com.google.android.gms.cast.metadata.SECTION_DURATION"));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = r3.f49616a;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long mo43021k() {
        /*
            r3 = this;
            com.google.android.gms.cast.framework.media.e r0 = r3.f49616a
            r1 = 0
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.mo17850o()
            if (r0 == 0) goto L_0x0033
            com.google.android.gms.cast.framework.media.e r0 = r3.f49616a
            boolean r0 = r0.mo17852q()
            if (r0 == 0) goto L_0x0033
            com.google.android.gms.cast.framework.media.e r0 = r3.f49616a
            boolean r0 = r0.mo17835T()
            if (r0 != 0) goto L_0x001c
            goto L_0x0033
        L_0x001c:
            com.google.android.gms.cast.framework.media.e r0 = r3.f49616a
            com.google.android.gms.cast.MediaStatus r2 = r0.mo17846k()
            if (r2 == 0) goto L_0x0033
            com.google.android.gms.cast.MediaLiveSeekableRange r2 = r2.mo29337J0()
            if (r2 == 0) goto L_0x0033
            long r0 = r0.mo17841f()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p125o4.C10844c.mo43021k():java.lang.Long");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = r3.f49616a;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long mo43022l() {
        /*
            r3 = this;
            com.google.android.gms.cast.framework.media.e r0 = r3.f49616a
            r1 = 0
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.mo17850o()
            if (r0 == 0) goto L_0x0033
            com.google.android.gms.cast.framework.media.e r0 = r3.f49616a
            boolean r0 = r0.mo17852q()
            if (r0 == 0) goto L_0x0033
            com.google.android.gms.cast.framework.media.e r0 = r3.f49616a
            boolean r0 = r0.mo17835T()
            if (r0 != 0) goto L_0x001c
            goto L_0x0033
        L_0x001c:
            com.google.android.gms.cast.framework.media.e r0 = r3.f49616a
            com.google.android.gms.cast.MediaStatus r2 = r0.mo17846k()
            if (r2 == 0) goto L_0x0033
            com.google.android.gms.cast.MediaLiveSeekableRange r2 = r2.mo29337J0()
            if (r2 == 0) goto L_0x0033
            long r0 = r0.mo17840e()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p125o4.C10844c.mo43022l():java.lang.Long");
    }

    /* renamed from: m */
    public final String mo43023m(long j) {
        C4580e eVar = this.f49616a;
        if (eVar == null || !eVar.mo17850o()) {
            return null;
        }
        C4580e eVar2 = this.f49616a;
        if (((eVar2 == null || !eVar2.mo17850o() || !this.f49616a.mo17852q() || mo43024n() == null) ? 1 : 2) - 1 == 1) {
            return DateFormat.getTimeInstance().format(new Date(((Long) C4604n.m20098k(mo43024n())).longValue() + j));
        } else if (!eVar2.mo17852q() || mo43019i() != null) {
            return m48846p(j - mo43018h());
        } else {
            return m48846p(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Long mo43024n() {
        MediaInfo j;
        C4580e eVar = this.f49616a;
        if (eVar == null || !eVar.mo17850o() || !this.f49616a.mo17852q() || (j = this.f49616a.mo17845j()) == null || j.mo29228M0() == -1) {
            return null;
        }
        return Long.valueOf(j.mo29228M0());
    }
}
