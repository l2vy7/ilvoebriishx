package p244q4;

import android.os.SystemClock;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p109l4.C10678g;
import p247r4.C10963a;

/* renamed from: q4.n */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10944n extends C10949s {

    /* renamed from: C */
    public static final String f49866C = C10920a.m49146i("com.google.cast.media");

    /* renamed from: A */
    final C10948r f49867A;

    /* renamed from: B */
    final C10948r f49868B;

    /* renamed from: e */
    private long f49869e;

    /* renamed from: f */
    private MediaStatus f49870f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Long f49871g;

    /* renamed from: h */
    private C10940k f49872h;

    /* renamed from: i */
    final C10948r f49873i;

    /* renamed from: j */
    final C10948r f49874j;

    /* renamed from: k */
    final C10948r f49875k;

    /* renamed from: l */
    final C10948r f49876l;

    /* renamed from: m */
    final C10948r f49877m;

    /* renamed from: n */
    final C10948r f49878n;

    /* renamed from: o */
    final C10948r f49879o;

    /* renamed from: p */
    final C10948r f49880p;

    /* renamed from: q */
    final C10948r f49881q;

    /* renamed from: r */
    final C10948r f49882r;

    /* renamed from: s */
    final C10948r f49883s;

    /* renamed from: t */
    final C10948r f49884t;

    /* renamed from: u */
    final C10948r f49885u;

    /* renamed from: v */
    final C10948r f49886v;

    /* renamed from: w */
    final C10948r f49887w;

    /* renamed from: x */
    final C10948r f49888x = new C10948r(86400000);

    /* renamed from: y */
    final C10948r f49889y;

    /* renamed from: z */
    final C10948r f49890z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10944n(String str) {
        super(f49866C, "MediaControlChannel", (String) null);
        C10948r rVar = new C10948r(86400000);
        this.f49873i = rVar;
        C10948r rVar2 = new C10948r(86400000);
        this.f49874j = rVar2;
        C10948r rVar3 = new C10948r(86400000);
        this.f49875k = rVar3;
        C10948r rVar4 = new C10948r(86400000);
        this.f49876l = rVar4;
        C10948r rVar5 = new C10948r(ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS);
        this.f49877m = rVar5;
        C10948r rVar6 = new C10948r(86400000);
        this.f49878n = rVar6;
        C10948r rVar7 = new C10948r(86400000);
        this.f49879o = rVar7;
        C10948r rVar8 = new C10948r(86400000);
        this.f49880p = rVar8;
        C10948r rVar9 = new C10948r(86400000);
        this.f49881q = rVar9;
        C10948r rVar10 = new C10948r(86400000);
        this.f49882r = rVar10;
        C10948r rVar11 = new C10948r(86400000);
        this.f49883s = rVar11;
        C10948r rVar12 = new C10948r(86400000);
        this.f49884t = rVar12;
        C10948r rVar13 = new C10948r(86400000);
        this.f49885u = rVar13;
        C10948r rVar14 = rVar13;
        C10948r rVar15 = new C10948r(86400000);
        this.f49886v = rVar15;
        C10948r rVar16 = rVar15;
        C10948r rVar17 = new C10948r(86400000);
        this.f49887w = rVar17;
        C10948r rVar18 = rVar17;
        C10948r rVar19 = new C10948r(86400000);
        this.f49889y = rVar19;
        C10948r rVar20 = rVar19;
        C10948r rVar21 = new C10948r(86400000);
        this.f49890z = rVar21;
        C10948r rVar22 = rVar21;
        C10948r rVar23 = new C10948r(86400000);
        this.f49867A = rVar23;
        C10948r rVar24 = rVar23;
        C10948r rVar25 = new C10948r(86400000);
        this.f49868B = rVar25;
        mo43257h(rVar);
        mo43257h(rVar2);
        mo43257h(rVar3);
        mo43257h(rVar4);
        mo43257h(rVar5);
        mo43257h(rVar6);
        mo43257h(rVar7);
        mo43257h(rVar8);
        mo43257h(rVar9);
        mo43257h(rVar10);
        mo43257h(rVar11);
        mo43257h(rVar12);
        mo43257h(rVar14);
        mo43257h(rVar16);
        mo43257h(rVar18);
        C10948r rVar26 = rVar20;
        mo43257h(rVar26);
        mo43257h(rVar26);
        mo43257h(rVar22);
        mo43257h(rVar24);
        mo43257h(rVar25);
        m49253x();
    }

    /* renamed from: r */
    private final long m49247r(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f49869e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        double d2 = (double) elapsedRealtime;
        Double.isNaN(d2);
        long j3 = j + ((long) (d2 * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0;
    }

    /* renamed from: s */
    private static int[] m49248s(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    /* renamed from: t */
    private final void m49249t() {
        C10940k kVar = this.f49872h;
        if (kVar != null) {
            kVar.zza();
        }
    }

    /* renamed from: u */
    private final void m49250u() {
        C10940k kVar = this.f49872h;
        if (kVar != null) {
            kVar.zzb();
        }
    }

    /* renamed from: v */
    private final void m49251v() {
        C10940k kVar = this.f49872h;
        if (kVar != null) {
            kVar.zzc();
        }
    }

    /* renamed from: w */
    private final void m49252w() {
        C10940k kVar = this.f49872h;
        if (kVar != null) {
            kVar.zzd();
        }
    }

    /* renamed from: x */
    private final void m49253x() {
        this.f49869e = 0;
        this.f49870f = null;
        for (C10948r e : mo43256g()) {
            e.mo43253e(2002);
        }
    }

    /* renamed from: y */
    private static C10943m m49254y(JSONObject jSONObject) {
        MediaError G0 = MediaError.m29072G0(jSONObject);
        C10943m mVar = new C10943m();
        mVar.f49864a = C10920a.m49152o(jSONObject, "customData");
        mVar.f49865b = G0;
        return mVar;
    }

    /* renamed from: A */
    public final long mo43227A(C10946p pVar, MediaLoadRequestData mediaLoadRequestData) throws IllegalStateException, IllegalArgumentException {
        if (mediaLoadRequestData.mo29259H0() == null && mediaLoadRequestData.mo29261J0() == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject L0 = mediaLoadRequestData.mo29263L0();
        if (L0 != null) {
            long d = mo43203d();
            try {
                L0.put("requestId", d);
                L0.put(SessionDescription.ATTR_TYPE, "LOAD");
            } catch (JSONException unused) {
            }
            mo43202c(L0.toString(), d, (String) null);
            this.f49873i.mo43249a(d, pVar);
            return d;
        }
        throw new IllegalArgumentException("Failed to jsonify the load request due to malformed request");
    }

    /* renamed from: B */
    public final long mo43228B(C10946p pVar, JSONObject jSONObject) throws IllegalStateException, C10942l {
        JSONObject jSONObject2 = new JSONObject();
        long d = mo43203d();
        try {
            jSONObject2.put("requestId", d);
            jSONObject2.put(SessionDescription.ATTR_TYPE, "PAUSE");
            jSONObject2.put("mediaSessionId", mo43245o());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        mo43202c(jSONObject2.toString(), d, (String) null);
        this.f49874j.mo43249a(d, pVar);
        return d;
    }

    /* renamed from: C */
    public final long mo43229C(C10946p pVar, JSONObject jSONObject) throws IllegalStateException, C10942l {
        JSONObject jSONObject2 = new JSONObject();
        long d = mo43203d();
        try {
            jSONObject2.put("requestId", d);
            jSONObject2.put(SessionDescription.ATTR_TYPE, "PLAY");
            jSONObject2.put("mediaSessionId", mo43245o());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        mo43202c(jSONObject2.toString(), d, (String) null);
        this.f49875k.mo43249a(d, pVar);
        return d;
    }

    /* renamed from: D */
    public final long mo43230D(C10946p pVar, C10678g gVar) throws IllegalStateException, C10942l {
        JSONObject jSONObject = new JSONObject();
        long d = mo43203d();
        long b = gVar.mo42826d() ? 4294967296000L : gVar.mo42824b();
        try {
            jSONObject.put("requestId", d);
            jSONObject.put(SessionDescription.ATTR_TYPE, "SEEK");
            jSONObject.put("mediaSessionId", mo43245o());
            jSONObject.put("currentTime", C10920a.m49139b(b));
            if (gVar.mo42825c() == 1) {
                jSONObject.put("resumeState", "PLAYBACK_START");
            } else if (gVar.mo42825c() == 2) {
                jSONObject.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (gVar.mo42823a() != null) {
                jSONObject.put("customData", gVar.mo42823a());
            }
        } catch (JSONException unused) {
        }
        mo43202c(jSONObject.toString(), d, (String) null);
        this.f49871g = Long.valueOf(b);
        this.f49877m.mo43249a(d, new C10938j(this, pVar));
        return d;
    }

    /* renamed from: E */
    public final long mo43231E(C10946p pVar) throws IllegalStateException, C10942l {
        JSONObject jSONObject = new JSONObject();
        long d = mo43203d();
        try {
            jSONObject.put("requestId", d);
            jSONObject.put(SessionDescription.ATTR_TYPE, "SKIP_AD");
            jSONObject.put("mediaSessionId", mo43245o());
        } catch (JSONException e) {
            this.f49804a.mo43195f(String.format(Locale.ROOT, "Error creating SkipAd message: %s", new Object[]{e.getMessage()}), new Object[0]);
        }
        mo43202c(jSONObject.toString(), d, (String) null);
        this.f49867A.mo43249a(d, pVar);
        return d;
    }

    /* renamed from: F */
    public final long mo43232F(C10946p pVar) throws IllegalStateException {
        JSONObject jSONObject = new JSONObject();
        long d = mo43203d();
        try {
            jSONObject.put("requestId", d);
            jSONObject.put(SessionDescription.ATTR_TYPE, "GET_STATUS");
            MediaStatus mediaStatus = this.f49870f;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.mo29354a1());
            }
        } catch (JSONException unused) {
        }
        mo43202c(jSONObject.toString(), d, (String) null);
        this.f49880p.mo43249a(d, pVar);
        return d;
    }

    /* renamed from: G */
    public final long mo43233G(C10946p pVar, long[] jArr) throws IllegalStateException, C10942l {
        if (jArr != null) {
            JSONObject jSONObject = new JSONObject();
            long d = mo43203d();
            try {
                jSONObject.put("requestId", d);
                jSONObject.put(SessionDescription.ATTR_TYPE, "EDIT_TRACKS_INFO");
                jSONObject.put("mediaSessionId", mo43245o());
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jArr.length; i++) {
                    jSONArray.put(i, jArr[i]);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            } catch (JSONException unused) {
            }
            mo43202c(jSONObject.toString(), d, (String) null);
            this.f49881q.mo43249a(d, pVar);
            return d;
        }
        throw new IllegalArgumentException("trackIds cannot be null");
    }

    /* renamed from: H */
    public final long mo43234H() {
        MediaStatus mediaStatus;
        MediaInfo j = mo43240j();
        if (j == null || (mediaStatus = this.f49870f) == null) {
            return 0;
        }
        Long l = this.f49871g;
        if (l != null) {
            if (l.equals(4294967296000L)) {
                if (this.f49870f.mo29337J0() != null) {
                    return Math.min(l.longValue(), mo43236J());
                }
                if (mo43238L() >= 0) {
                    return Math.min(l.longValue(), mo43238L());
                }
            }
            return l.longValue();
        } else if (this.f49869e == 0) {
            return 0;
        } else {
            double M0 = mediaStatus.mo29340M0();
            long T0 = this.f49870f.mo29347T0();
            int N0 = this.f49870f.mo29341N0();
            if (M0 == 0.0d || N0 != 2) {
                return T0;
            }
            return m49247r(M0, T0, j.mo29229N0());
        }
    }

    /* renamed from: I */
    public final long mo43235I() {
        MediaLiveSeekableRange J0;
        MediaStatus mediaStatus = this.f49870f;
        if (mediaStatus == null || (J0 = mediaStatus.mo29337J0()) == null) {
            return 0;
        }
        long D0 = J0.mo29248D0();
        if (J0.mo29250F0()) {
            D0 = m49247r(1.0d, D0, -1);
        }
        return J0.mo29249E0() ? Math.min(D0, J0.mo29247C0()) : D0;
    }

    /* renamed from: J */
    public final long mo43236J() {
        MediaLiveSeekableRange J0;
        MediaStatus mediaStatus = this.f49870f;
        if (mediaStatus == null || (J0 = mediaStatus.mo29337J0()) == null) {
            return 0;
        }
        long C0 = J0.mo29247C0();
        return !J0.mo29249E0() ? m49247r(1.0d, C0, -1) : C0;
    }

    /* renamed from: K */
    public final long mo43237K() {
        MediaStatus mediaStatus;
        AdBreakStatus D0;
        if (this.f49869e == 0 || (mediaStatus = this.f49870f) == null || (D0 = mediaStatus.mo29331D0()) == null) {
            return 0;
        }
        double M0 = this.f49870f.mo29340M0();
        if (M0 == 0.0d) {
            M0 = 1.0d;
        }
        return m49247r(this.f49870f.mo29341N0() != 2 ? 0.0d : M0, D0.mo29165E0(), 0);
    }

    /* renamed from: L */
    public final long mo43238L() {
        MediaInfo j = mo43240j();
        if (j != null) {
            return j.mo29229N0();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo43204e() {
        mo43255f();
        m49253x();
    }

    /* renamed from: i */
    public final MediaStatus mo43239i() {
        return this.f49870f;
    }

    /* renamed from: j */
    public final MediaInfo mo43240j() {
        MediaStatus mediaStatus = this.f49870f;
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.mo29339L0();
    }

    /* renamed from: k */
    public final long mo43241k(C10946p pVar, int i, long j, MediaQueueItem[] mediaQueueItemArr, int i2, boolean z, Integer num, JSONObject jSONObject) throws IllegalArgumentException, IllegalStateException, C10942l {
        int i3 = i;
        long j2 = j;
        MediaQueueItem[] mediaQueueItemArr2 = mediaQueueItemArr;
        int i4 = i2;
        JSONObject jSONObject2 = jSONObject;
        if (j2 == -1 || j2 >= 0) {
            JSONObject jSONObject3 = new JSONObject();
            long d = mo43203d();
            try {
                jSONObject3.put("requestId", d);
                jSONObject3.put(SessionDescription.ATTR_TYPE, "QUEUE_UPDATE");
                jSONObject3.put("mediaSessionId", mo43245o());
                if (i3 != 0) {
                    jSONObject3.put("currentItemId", i3);
                }
                if (i4 != 0) {
                    jSONObject3.put("jump", i4);
                }
                if (mediaQueueItemArr2 != null && mediaQueueItemArr2.length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i5 = 0; i5 < mediaQueueItemArr2.length; i5++) {
                        jSONArray.put(i5, mediaQueueItemArr2[i5].mo29324K0());
                    }
                    jSONObject3.put("items", jSONArray);
                }
                if (z) {
                    jSONObject3.put("shuffle", true);
                }
                String b = C10963a.m49298b(num);
                if (b != null) {
                    jSONObject3.put("repeatMode", b);
                }
                if (j2 != -1) {
                    jSONObject3.put("currentTime", C10920a.m49139b(j));
                }
                if (jSONObject2 != null) {
                    jSONObject3.put("customData", jSONObject2);
                }
            } catch (JSONException unused) {
            }
            mo43202c(jSONObject3.toString(), d, (String) null);
            this.f49884t.mo43249a(d, pVar);
            return d;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("playPosition cannot be negative: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: l */
    public final long mo43242l(C10946p pVar) throws C10942l, IllegalStateException {
        JSONObject jSONObject = new JSONObject();
        long d = mo43203d();
        try {
            jSONObject.put("requestId", d);
            jSONObject.put(SessionDescription.ATTR_TYPE, "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", mo43245o());
        } catch (JSONException unused) {
        }
        mo43202c(jSONObject.toString(), d, (String) null);
        this.f49887w.mo43249a(d, pVar);
        return d;
    }

    /* renamed from: m */
    public final long mo43243m(C10946p pVar, int[] iArr) throws C10942l, IllegalArgumentException {
        JSONObject jSONObject = new JSONObject();
        long d = mo43203d();
        try {
            jSONObject.put("requestId", d);
            jSONObject.put(SessionDescription.ATTR_TYPE, "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", mo43245o());
            JSONArray jSONArray = new JSONArray();
            for (int put : iArr) {
                jSONArray.put(put);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        mo43202c(jSONObject.toString(), d, (String) null);
        this.f49888x.mo43249a(d, pVar);
        return d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0229 A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0246 A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0253 A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0260 A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x026a A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0271 A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0278 A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x027f A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0290 A[Catch:{ JSONException -> 0x02c1 }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43244n(java.lang.String r13) {
        /*
            r12 = this;
            q4.b r0 = r12.f49804a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r13
            java.lang.String r4 = "message received: %s"
            r0.mo43190a(r4, r2)
            r0 = 2
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02c1 }
            r2.<init>(r13)     // Catch:{ JSONException -> 0x02c1 }
            java.lang.String r4 = "type"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ JSONException -> 0x02c1 }
            java.lang.String r5 = "requestId"
            r6 = -1
            long r5 = r2.optLong(r5, r6)     // Catch:{ JSONException -> 0x02c1 }
            int r7 = r4.hashCode()     // Catch:{ JSONException -> 0x02c1 }
            r8 = -1
            r9 = 3
            switch(r7) {
                case -1830647528: goto L_0x0088;
                case -1790231854: goto L_0x007d;
                case -1125000185: goto L_0x0073;
                case -262628938: goto L_0x0069;
                case -61993624: goto L_0x005e;
                case 66247144: goto L_0x0054;
                case 154411710: goto L_0x004a;
                case 431600379: goto L_0x0040;
                case 823510221: goto L_0x0036;
                case 2107149050: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0092
        L_0x002c:
            java.lang.String r7 = "QUEUE_ITEM_IDS"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0092
            r4 = 6
            goto L_0x0093
        L_0x0036:
            java.lang.String r7 = "MEDIA_STATUS"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0092
            r4 = 0
            goto L_0x0093
        L_0x0040:
            java.lang.String r7 = "INVALID_PLAYER_STATE"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0092
            r4 = 1
            goto L_0x0093
        L_0x004a:
            java.lang.String r7 = "QUEUE_CHANGE"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0092
            r4 = 7
            goto L_0x0093
        L_0x0054:
            java.lang.String r7 = "ERROR"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0092
            r4 = 5
            goto L_0x0093
        L_0x005e:
            java.lang.String r7 = "SESSION_STATE"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0092
            r4 = 9
            goto L_0x0093
        L_0x0069:
            java.lang.String r7 = "LOAD_FAILED"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0092
            r4 = 2
            goto L_0x0093
        L_0x0073:
            java.lang.String r7 = "INVALID_REQUEST"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0092
            r4 = 4
            goto L_0x0093
        L_0x007d:
            java.lang.String r7 = "QUEUE_ITEMS"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0092
            r4 = 8
            goto L_0x0093
        L_0x0088:
            java.lang.String r7 = "LOAD_CANCELLED"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0092
            r4 = 3
            goto L_0x0093
        L_0x0092:
            r4 = -1
        L_0x0093:
            java.lang.String r7 = "itemIds"
            r10 = 2100(0x834, float:2.943E-42)
            r11 = 0
            switch(r4) {
                case 0: goto L_0x01ec;
                case 1: goto L_0x01c7;
                case 2: goto L_0x01bd;
                case 3: goto L_0x01b1;
                case 4: goto L_0x018c;
                case 5: goto L_0x0160;
                case 6: goto L_0x0147;
                case 7: goto L_0x00d7;
                case 8: goto L_0x00a3;
                case 9: goto L_0x009d;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x02c0
        L_0x009d:
            q4.r r2 = r12.f49868B     // Catch:{ JSONException -> 0x02c1 }
            r2.mo43252d(r5, r3, r11)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x00a3:
            q4.r r4 = r12.f49888x     // Catch:{ JSONException -> 0x02c1 }
            r4.mo43252d(r5, r3, r11)     // Catch:{ JSONException -> 0x02c1 }
            q4.k r4 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x02c0
            java.lang.String r4 = "items"
            org.json.JSONArray r2 = r2.getJSONArray(r4)     // Catch:{ JSONException -> 0x02c1 }
            int r4 = r2.length()     // Catch:{ JSONException -> 0x02c1 }
            com.google.android.gms.cast.MediaQueueItem[] r4 = new com.google.android.gms.cast.MediaQueueItem[r4]     // Catch:{ JSONException -> 0x02c1 }
            r5 = 0
        L_0x00b9:
            int r6 = r2.length()     // Catch:{ JSONException -> 0x02c1 }
            if (r5 >= r6) goto L_0x00d1
            com.google.android.gms.cast.MediaQueueItem$a r6 = new com.google.android.gms.cast.MediaQueueItem$a     // Catch:{ JSONException -> 0x02c1 }
            org.json.JSONObject r7 = r2.getJSONObject(r5)     // Catch:{ JSONException -> 0x02c1 }
            r6.<init>((org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x02c1 }
            com.google.android.gms.cast.MediaQueueItem r6 = r6.mo29329a()     // Catch:{ JSONException -> 0x02c1 }
            r4[r5] = r6     // Catch:{ JSONException -> 0x02c1 }
            int r5 = r5 + 1
            goto L_0x00b9
        L_0x00d1:
            q4.k r2 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            r2.mo29550e(r4)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x00d7:
            q4.r r4 = r12.f49889y     // Catch:{ JSONException -> 0x02c1 }
            r4.mo43252d(r5, r3, r11)     // Catch:{ JSONException -> 0x02c1 }
            q4.k r4 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x02c0
            java.lang.String r4 = "changeType"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ JSONException -> 0x02c1 }
            org.json.JSONArray r5 = r2.getJSONArray(r7)     // Catch:{ JSONException -> 0x02c1 }
            int[] r5 = m49248s(r5)     // Catch:{ JSONException -> 0x02c1 }
            java.lang.String r6 = "insertBefore"
            int r2 = r2.optInt(r6, r3)     // Catch:{ JSONException -> 0x02c1 }
            if (r5 == 0) goto L_0x02c0
            int r6 = r4.hashCode()     // Catch:{ JSONException -> 0x02c1 }
            switch(r6) {
                case -2130463047: goto L_0x011c;
                case -1881281404: goto L_0x0112;
                case -1785516855: goto L_0x0108;
                case 1122976047: goto L_0x00fe;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            goto L_0x0125
        L_0x00fe:
            java.lang.String r6 = "ITEMS_CHANGE"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0125
            r8 = 1
            goto L_0x0125
        L_0x0108:
            java.lang.String r6 = "UPDATE"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0125
            r8 = 3
            goto L_0x0125
        L_0x0112:
            java.lang.String r6 = "REMOVE"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0125
            r8 = 2
            goto L_0x0125
        L_0x011c:
            java.lang.String r6 = "INSERT"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0125
            r8 = 0
        L_0x0125:
            if (r8 == 0) goto L_0x0141
            if (r8 == r1) goto L_0x013b
            if (r8 == r0) goto L_0x0135
            if (r8 == r9) goto L_0x012f
            goto L_0x02c0
        L_0x012f:
            q4.k r2 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            r2.mo29549d(r5)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x0135:
            q4.k r2 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            r2.mo29548c(r5)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x013b:
            q4.k r2 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            r2.mo29546a(r5)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x0141:
            q4.k r4 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            r4.mo29547b(r5, r2)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x0147:
            q4.r r4 = r12.f49887w     // Catch:{ JSONException -> 0x02c1 }
            r4.mo43252d(r5, r3, r11)     // Catch:{ JSONException -> 0x02c1 }
            q4.k r4 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x02c0
            org.json.JSONArray r2 = r2.getJSONArray(r7)     // Catch:{ JSONException -> 0x02c1 }
            int[] r2 = m49248s(r2)     // Catch:{ JSONException -> 0x02c1 }
            if (r2 == 0) goto L_0x02c0
            q4.k r4 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            r4.mo29549d(r2)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x0160:
            java.util.List r4 = r12.mo43256g()     // Catch:{ JSONException -> 0x02c1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x02c1 }
        L_0x0168:
            boolean r7 = r4.hasNext()     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x017c
            java.lang.Object r7 = r4.next()     // Catch:{ JSONException -> 0x02c1 }
            q4.r r7 = (p244q4.C10948r) r7     // Catch:{ JSONException -> 0x02c1 }
            q4.m r8 = m49254y(r2)     // Catch:{ JSONException -> 0x02c1 }
            r7.mo43252d(r5, r10, r8)     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x0168
        L_0x017c:
            q4.k r4 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            if (r4 != 0) goto L_0x0182
            goto L_0x02c0
        L_0x0182:
            com.google.android.gms.cast.MediaError r2 = com.google.android.gms.cast.MediaError.m29072G0(r2)     // Catch:{ JSONException -> 0x02c1 }
            q4.k r4 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            r4.mo29551f(r2)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x018c:
            q4.b r4 = r12.f49804a     // Catch:{ JSONException -> 0x02c1 }
            java.lang.String r7 = "received unexpected error: Invalid Request."
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ JSONException -> 0x02c1 }
            r4.mo43195f(r7, r8)     // Catch:{ JSONException -> 0x02c1 }
            java.util.List r4 = r12.mo43256g()     // Catch:{ JSONException -> 0x02c1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x02c1 }
        L_0x019d:
            boolean r7 = r4.hasNext()     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x02c0
            java.lang.Object r7 = r4.next()     // Catch:{ JSONException -> 0x02c1 }
            q4.r r7 = (p244q4.C10948r) r7     // Catch:{ JSONException -> 0x02c1 }
            q4.m r8 = m49254y(r2)     // Catch:{ JSONException -> 0x02c1 }
            r7.mo43252d(r5, r10, r8)     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x019d
        L_0x01b1:
            q4.r r4 = r12.f49873i     // Catch:{ JSONException -> 0x02c1 }
            r7 = 2101(0x835, float:2.944E-42)
            q4.m r2 = m49254y(r2)     // Catch:{ JSONException -> 0x02c1 }
            r4.mo43252d(r5, r7, r2)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x01bd:
            q4.r r4 = r12.f49873i     // Catch:{ JSONException -> 0x02c1 }
            q4.m r2 = m49254y(r2)     // Catch:{ JSONException -> 0x02c1 }
            r4.mo43252d(r5, r10, r2)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x01c7:
            q4.b r4 = r12.f49804a     // Catch:{ JSONException -> 0x02c1 }
            java.lang.String r7 = "received unexpected error: Invalid Player State."
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ JSONException -> 0x02c1 }
            r4.mo43195f(r7, r8)     // Catch:{ JSONException -> 0x02c1 }
            java.util.List r4 = r12.mo43256g()     // Catch:{ JSONException -> 0x02c1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x02c1 }
        L_0x01d8:
            boolean r7 = r4.hasNext()     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x02c0
            java.lang.Object r7 = r4.next()     // Catch:{ JSONException -> 0x02c1 }
            q4.r r7 = (p244q4.C10948r) r7     // Catch:{ JSONException -> 0x02c1 }
            q4.m r8 = m49254y(r2)     // Catch:{ JSONException -> 0x02c1 }
            r7.mo43252d(r5, r10, r8)     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x01d8
        L_0x01ec:
            java.lang.String r4 = "status"
            org.json.JSONArray r2 = r2.getJSONArray(r4)     // Catch:{ JSONException -> 0x02c1 }
            int r4 = r2.length()     // Catch:{ JSONException -> 0x02c1 }
            if (r4 <= 0) goto L_0x029a
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ JSONException -> 0x02c1 }
            q4.r r4 = r12.f49873i     // Catch:{ JSONException -> 0x02c1 }
            boolean r4 = r4.mo43251c(r5)     // Catch:{ JSONException -> 0x02c1 }
            q4.r r7 = r12.f49878n     // Catch:{ JSONException -> 0x02c1 }
            boolean r7 = r7.mo43250b()     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x0215
            q4.r r7 = r12.f49878n     // Catch:{ JSONException -> 0x02c1 }
            boolean r7 = r7.mo43251c(r5)     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x0213
            goto L_0x0215
        L_0x0213:
            r7 = 1
            goto L_0x0227
        L_0x0215:
            q4.r r7 = r12.f49879o     // Catch:{ JSONException -> 0x02c1 }
            boolean r7 = r7.mo43250b()     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x0226
            q4.r r7 = r12.f49879o     // Catch:{ JSONException -> 0x02c1 }
            boolean r7 = r7.mo43251c(r5)     // Catch:{ JSONException -> 0x02c1 }
            if (r7 != 0) goto L_0x0226
            goto L_0x0213
        L_0x0226:
            r7 = 0
        L_0x0227:
            if (r4 != 0) goto L_0x0233
            com.google.android.gms.cast.MediaStatus r4 = r12.f49870f     // Catch:{ JSONException -> 0x02c1 }
            if (r4 != 0) goto L_0x022e
            goto L_0x0233
        L_0x022e:
            int r2 = r4.mo29355b1(r2, r7)     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x0242
        L_0x0233:
            com.google.android.gms.cast.MediaStatus r4 = new com.google.android.gms.cast.MediaStatus     // Catch:{ JSONException -> 0x02c1 }
            r4.<init>(r2)     // Catch:{ JSONException -> 0x02c1 }
            r12.f49870f = r4     // Catch:{ JSONException -> 0x02c1 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r12.f49869e = r7     // Catch:{ JSONException -> 0x02c1 }
            r2 = 127(0x7f, float:1.78E-43)
        L_0x0242:
            r4 = r2 & 1
            if (r4 == 0) goto L_0x024f
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r12.f49869e = r7     // Catch:{ JSONException -> 0x02c1 }
            r12.m49249t()     // Catch:{ JSONException -> 0x02c1 }
        L_0x024f:
            r4 = r2 & 2
            if (r4 == 0) goto L_0x025c
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r12.f49869e = r7     // Catch:{ JSONException -> 0x02c1 }
            r12.m49249t()     // Catch:{ JSONException -> 0x02c1 }
        L_0x025c:
            r4 = r2 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0266
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r12.f49869e = r7     // Catch:{ JSONException -> 0x02c1 }
        L_0x0266:
            r4 = r2 & 4
            if (r4 == 0) goto L_0x026d
            r12.m49250u()     // Catch:{ JSONException -> 0x02c1 }
        L_0x026d:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x0274
            r12.m49251v()     // Catch:{ JSONException -> 0x02c1 }
        L_0x0274:
            r4 = r2 & 16
            if (r4 == 0) goto L_0x027b
            r12.m49252w()     // Catch:{ JSONException -> 0x02c1 }
        L_0x027b:
            r4 = r2 & 32
            if (r4 == 0) goto L_0x028c
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r12.f49869e = r7     // Catch:{ JSONException -> 0x02c1 }
            q4.k r4 = r12.f49872h     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x028c
            r4.zze()     // Catch:{ JSONException -> 0x02c1 }
        L_0x028c:
            r2 = r2 & 64
            if (r2 == 0) goto L_0x02a8
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r12.f49869e = r7     // Catch:{ JSONException -> 0x02c1 }
            r12.m49249t()     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x02a8
        L_0x029a:
            r12.f49870f = r11     // Catch:{ JSONException -> 0x02c1 }
            r12.m49249t()     // Catch:{ JSONException -> 0x02c1 }
            r12.m49250u()     // Catch:{ JSONException -> 0x02c1 }
            r12.m49251v()     // Catch:{ JSONException -> 0x02c1 }
            r12.m49252w()     // Catch:{ JSONException -> 0x02c1 }
        L_0x02a8:
            java.util.List r2 = r12.mo43256g()     // Catch:{ JSONException -> 0x02c1 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x02c1 }
        L_0x02b0:
            boolean r4 = r2.hasNext()     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x02c0
            java.lang.Object r4 = r2.next()     // Catch:{ JSONException -> 0x02c1 }
            q4.r r4 = (p244q4.C10948r) r4     // Catch:{ JSONException -> 0x02c1 }
            r4.mo43252d(r5, r3, r11)     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x02b0
        L_0x02c0:
            return
        L_0x02c1:
            r2 = move-exception
            q4.b r4 = r12.f49804a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r2.getMessage()
            r0[r3] = r2
            r0[r1] = r13
            java.lang.String r13 = "Message is malformed (%s); ignoring: %s"
            r4.mo43195f(r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p244q4.C10944n.mo43244n(java.lang.String):void");
    }

    /* renamed from: o */
    public final long mo43245o() throws C10942l {
        MediaStatus mediaStatus = this.f49870f;
        if (mediaStatus != null) {
            return mediaStatus.mo29354a1();
        }
        throw new C10942l();
    }

    /* renamed from: p */
    public final void mo43246p(long j, int i) {
        for (C10948r d : mo43256g()) {
            d.mo43252d(j, i, (Object) null);
        }
    }

    /* renamed from: z */
    public final void mo43247z(C10940k kVar) {
        this.f49872h = kVar;
    }
}
