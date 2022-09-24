package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p244q4.C10920a;
import p247r4.C10964b;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class MediaMetadata extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaMetadata> CREATOR = new C7174m();

    /* renamed from: f */
    private static final String[] f28433f = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};

    /* renamed from: g */
    private static final C7173l f28434g;

    /* renamed from: b */
    private final List<WebImage> f28435b;

    /* renamed from: c */
    final Bundle f28436c;

    /* renamed from: d */
    private int f28437d;

    /* renamed from: e */
    private final C7083a f28438e;

    /* renamed from: com.google.android.gms.cast.MediaMetadata$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public class C7083a {
        public C7083a() {
        }
    }

    static {
        C7173l lVar = new C7173l();
        lVar.mo29636a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        lVar.mo29636a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        lVar.mo29636a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        lVar.mo29636a("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        lVar.mo29636a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        lVar.mo29636a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        lVar.mo29636a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        lVar.mo29636a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        lVar.mo29636a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        lVar.mo29636a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        lVar.mo29636a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        lVar.mo29636a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        lVar.mo29636a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        lVar.mo29636a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        lVar.mo29636a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        lVar.mo29636a("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        lVar.mo29636a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        lVar.mo29636a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        lVar.mo29636a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        lVar.mo29636a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        lVar.mo29636a("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        lVar.mo29636a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        lVar.mo29636a("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        lVar.mo29636a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        lVar.mo29636a("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        lVar.mo29636a("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        lVar.mo29636a("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        lVar.mo29636a("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        f28434g = lVar;
    }

    public MediaMetadata() {
        this(0);
    }

    /* renamed from: K0 */
    public static void m29131K0(@RecentlyNonNull String str, int i) throws IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            int d = f28434g.mo29639d(str);
            if (d != i && d != 0) {
                String str2 = f28433f[i];
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                sb.append("Value for ");
                sb.append(str);
                sb.append(" must be a ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    /* renamed from: N0 */
    private final boolean m29132N0(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m29132N0((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C0 */
    public void mo29276C0(@RecentlyNonNull WebImage webImage) {
        this.f28435b.add(webImage);
    }

    /* renamed from: D0 */
    public boolean mo29277D0(@RecentlyNonNull String str) {
        return this.f28436c.containsKey(str);
    }

    @RecentlyNonNull
    /* renamed from: E0 */
    public List<WebImage> mo29278E0() {
        return this.f28435b;
    }

    /* renamed from: F0 */
    public int mo29279F0() {
        return this.f28437d;
    }

    @RecentlyNullable
    /* renamed from: G0 */
    public String mo29280G0(@RecentlyNonNull String str) {
        m29131K0(str, 1);
        return this.f28436c.getString(str);
    }

    /* renamed from: H0 */
    public long mo29281H0(@RecentlyNonNull String str) {
        m29131K0(str, 5);
        return this.f28436c.getLong(str);
    }

    /* renamed from: I0 */
    public boolean mo29282I0() {
        List<WebImage> list = this.f28435b;
        return list != null && !list.isEmpty();
    }

    /* renamed from: J0 */
    public void mo29283J0(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        m29131K0(str, 1);
        this.f28436c.putString(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r4 = f28434g;
     */
    @androidx.annotation.RecentlyNonNull
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo29284L0() {
        /*
            r18 = this;
            r0 = r18
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "metadataType"
            int r3 = r0.f28437d     // Catch:{ JSONException -> 0x000f }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x000f }
            goto L_0x0010
        L_0x000f:
        L_0x0010:
            java.util.List<com.google.android.gms.common.images.WebImage> r2 = r0.f28435b
            org.json.JSONArray r2 = p247r4.C10964b.m49300b(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = "images"
            r1.put(r3, r2)     // Catch:{ JSONException -> 0x0021 }
        L_0x0021:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.f28437d
            java.lang.String r4 = "com.google.android.gms.cast.metadata.RELEASE_DATE"
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            java.lang.String r10 = "com.google.android.gms.cast.metadata.SUBTITLE"
            java.lang.String r11 = "com.google.android.gms.cast.metadata.TITLE"
            if (r3 == 0) goto L_0x0098
            if (r3 == r9) goto L_0x008e
            if (r3 == r8) goto L_0x007e
            if (r3 == r7) goto L_0x0066
            if (r3 == r6) goto L_0x004e
            if (r3 == r5) goto L_0x0040
            goto L_0x00a1
        L_0x0040:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.CHAPTER_TITLE"
            java.lang.String r4 = "com.google.android.gms.cast.metadata.CHAPTER_NUMBER"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.BOOK_TITLE"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r11, r12, r10}
            java.util.Collections.addAll(r2, r3)
            goto L_0x00a1
        L_0x004e:
            java.lang.String r10 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r11 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.LOCATION_NAME"
            java.lang.String r13 = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE"
            java.lang.String r14 = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE"
            java.lang.String r15 = "com.google.android.gms.cast.metadata.WIDTH"
            java.lang.String r16 = "com.google.android.gms.cast.metadata.HEIGHT"
            java.lang.String r17 = "com.google.android.gms.cast.metadata.CREATION_DATE"
            java.lang.String[] r3 = new java.lang.String[]{r10, r11, r12, r13, r14, r15, r16, r17}
            java.util.Collections.addAll(r2, r3)
            goto L_0x00a1
        L_0x0066:
            java.lang.String r10 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r11 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.ALBUM_TITLE"
            java.lang.String r13 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            java.lang.String r14 = "com.google.android.gms.cast.metadata.COMPOSER"
            java.lang.String r15 = "com.google.android.gms.cast.metadata.TRACK_NUMBER"
            java.lang.String r16 = "com.google.android.gms.cast.metadata.DISC_NUMBER"
            java.lang.String r17 = "com.google.android.gms.cast.metadata.RELEASE_DATE"
            java.lang.String[] r3 = new java.lang.String[]{r10, r11, r12, r13, r14, r15, r16, r17}
            java.util.Collections.addAll(r2, r3)
            goto L_0x00a1
        L_0x007e:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.SERIES_TITLE"
            java.lang.String r4 = "com.google.android.gms.cast.metadata.SEASON_NUMBER"
            java.lang.String r10 = "com.google.android.gms.cast.metadata.EPISODE_NUMBER"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.BROADCAST_DATE"
            java.lang.String[] r3 = new java.lang.String[]{r11, r3, r4, r10, r12}
            java.util.Collections.addAll(r2, r3)
            goto L_0x00a1
        L_0x008e:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.STUDIO"
            java.lang.String[] r3 = new java.lang.String[]{r11, r3, r10, r4}
            java.util.Collections.addAll(r2, r3)
            goto L_0x00a1
        L_0x0098:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String[] r3 = new java.lang.String[]{r11, r3, r10, r4}
            java.util.Collections.addAll(r2, r3)
        L_0x00a1:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.SECTION_DURATION"
            java.lang.String r4 = "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"
            java.lang.String r10 = "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME"
            java.lang.String r11 = "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r10, r11, r12}
            java.util.Collections.addAll(r2, r3)
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x014b }
        L_0x00b6:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x014b }
            if (r3 == 0) goto L_0x010f
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x014b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x014b }
            if (r3 == 0) goto L_0x00b6
            android.os.Bundle r4 = r0.f28436c     // Catch:{ JSONException -> 0x014b }
            boolean r4 = r4.containsKey(r3)     // Catch:{ JSONException -> 0x014b }
            if (r4 == 0) goto L_0x00b6
            com.google.android.gms.cast.l r4 = f28434g     // Catch:{ JSONException -> 0x014b }
            java.lang.String r10 = r4.mo29637b(r3)     // Catch:{ JSONException -> 0x014b }
            if (r10 == 0) goto L_0x00b6
            int r4 = r4.mo29639d(r3)     // Catch:{ JSONException -> 0x014b }
            if (r4 == r9) goto L_0x0105
            if (r4 == r8) goto L_0x00fb
            if (r4 == r7) goto L_0x00f1
            if (r4 == r6) goto L_0x0105
            if (r4 == r5) goto L_0x00e3
            goto L_0x00b6
        L_0x00e3:
            android.os.Bundle r4 = r0.f28436c     // Catch:{ JSONException -> 0x014b }
            long r3 = r4.getLong(r3)     // Catch:{ JSONException -> 0x014b }
            double r3 = p244q4.C10920a.m49139b(r3)     // Catch:{ JSONException -> 0x014b }
            r1.put(r10, r3)     // Catch:{ JSONException -> 0x014b }
            goto L_0x00b6
        L_0x00f1:
            android.os.Bundle r4 = r0.f28436c     // Catch:{ JSONException -> 0x014b }
            double r3 = r4.getDouble(r3)     // Catch:{ JSONException -> 0x014b }
            r1.put(r10, r3)     // Catch:{ JSONException -> 0x014b }
            goto L_0x00b6
        L_0x00fb:
            android.os.Bundle r4 = r0.f28436c     // Catch:{ JSONException -> 0x014b }
            int r3 = r4.getInt(r3)     // Catch:{ JSONException -> 0x014b }
            r1.put(r10, r3)     // Catch:{ JSONException -> 0x014b }
            goto L_0x00b6
        L_0x0105:
            android.os.Bundle r4 = r0.f28436c     // Catch:{ JSONException -> 0x014b }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ JSONException -> 0x014b }
            r1.put(r10, r3)     // Catch:{ JSONException -> 0x014b }
            goto L_0x00b6
        L_0x010f:
            android.os.Bundle r2 = r0.f28436c     // Catch:{ JSONException -> 0x014b }
            java.util.Set r2 = r2.keySet()     // Catch:{ JSONException -> 0x014b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x014b }
        L_0x0119:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x014b }
            if (r3 == 0) goto L_0x014b
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x014b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x014b }
            java.lang.String r4 = "com.google."
            boolean r4 = r3.startsWith(r4)     // Catch:{ JSONException -> 0x014b }
            if (r4 != 0) goto L_0x0119
            android.os.Bundle r4 = r0.f28436c     // Catch:{ JSONException -> 0x014b }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ JSONException -> 0x014b }
            boolean r5 = r4 instanceof java.lang.String     // Catch:{ JSONException -> 0x014b }
            if (r5 == 0) goto L_0x013b
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x014b }
            goto L_0x0119
        L_0x013b:
            boolean r5 = r4 instanceof java.lang.Integer     // Catch:{ JSONException -> 0x014b }
            if (r5 == 0) goto L_0x0143
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x014b }
            goto L_0x0119
        L_0x0143:
            boolean r5 = r4 instanceof java.lang.Double     // Catch:{ JSONException -> 0x014b }
            if (r5 == 0) goto L_0x0119
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x014b }
            goto L_0x0119
        L_0x014b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaMetadata.mo29284L0():org.json.JSONObject");
    }

    /* renamed from: M0 */
    public final void mo29285M0(@RecentlyNonNull JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        clear();
        this.f28437d = 0;
        try {
            this.f28437d = jSONObject2.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        if (optJSONArray != null) {
            C10964b.m49299a(this.f28435b, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.f28437d;
        if (i == 0) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i == 1) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i == 2) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"});
        } else if (i == 3) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i == 4) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"});
        } else if (i == 5) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE"});
        }
        Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"});
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    C7173l lVar = f28434g;
                    String c = lVar.mo29638c(next);
                    if (c == null) {
                        Object obj = jSONObject2.get(next);
                        if (obj instanceof String) {
                            this.f28436c.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f28436c.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f28436c.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(c)) {
                        try {
                            Object obj2 = jSONObject2.get(next);
                            if (obj2 != null) {
                                int d = lVar.mo29639d(c);
                                if (d != 1) {
                                    if (d != 2) {
                                        if (d == 3) {
                                            double optDouble = jSONObject2.optDouble(next);
                                            if (!Double.isNaN(optDouble)) {
                                                this.f28436c.putDouble(c, optDouble);
                                            }
                                        } else if (d != 4) {
                                            if (d == 5) {
                                                this.f28436c.putLong(c, C10920a.m49141d((double) jSONObject2.optLong(next)));
                                            }
                                        } else if (obj2 instanceof String) {
                                            String str = (String) obj2;
                                            if (C10964b.m49301c(str) != null) {
                                                this.f28436c.putString(c, str);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.f28436c.putInt(c, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.f28436c.putString(c, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public void clear() {
        this.f28436c.clear();
        this.f28435b.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return m29132N0(this.f28436c, mediaMetadata.f28436c) && this.f28435b.equals(mediaMetadata.f28435b);
    }

    public int hashCode() {
        Bundle bundle = this.f28436c;
        int i = 17;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = this.f28436c.get(str);
                i = (i * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (i * 31) + this.f28435b.hashCode();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49510A(parcel, 2, mo29278E0(), false);
        C11058b.m49519e(parcel, 3, this.f28436c, false);
        C11058b.m49527m(parcel, 4, mo29279F0());
        C11058b.m49516b(parcel, a);
    }

    public MediaMetadata(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    MediaMetadata(List<WebImage> list, Bundle bundle, int i) {
        this.f28438e = new C7083a();
        this.f28435b = list;
        this.f28436c = bundle;
        this.f28437d = i;
    }
}
