package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9143f4;
import com.google.android.gms.internal.measurement.C9226kc;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.i */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9793i extends C9868o8 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f46340f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f46341g = {TtmlNode.ATTR_TTS_ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f46342h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f46343i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String[] f46344j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String[] f46345k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String[] f46346l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String[] f46347m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C9783h f46348d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9824k8 f46349e = new C9824k8(this.f21269a.mo19274f());

    C9793i(C9958x8 x8Var) {
        super(x8Var);
        this.f21269a.mo19392z();
        this.f46348d = new C9783h(this, this.f21269a.mo19277r(), "google_app_measurement.db");
    }

    /* renamed from: H */
    static final void m45134H(ContentValues contentValues, String str, Object obj) {
        C4604n.m20094g("value");
        C4604n.m20098k(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: I */
    private final long m45135I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo38987P().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38858c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: K */
    private final long m45136K(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo38987P().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38858c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0040=Splitter:B:13:0x0040, B:31:0x0092=Splitter:B:31:0x0092} */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38981G(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.C9948w8 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            com.google.android.gms.common.internal.C4604n.m20098k(r26)
            r20.mo19272b()
            r20.mo39090d()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.mo38987P()     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0079
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r4 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r4[r11] = r6     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r6 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r4[r12] = r6     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r6 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r4[r11] = r6     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
        L_0x003a:
            int r6 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0040
            java.lang.String r5 = "rowid <= ? and "
        L_0x0040:
            int r6 = r5.length()     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            int r6 = r6 + 148
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r7.<init>(r6)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r6 = "select app_id, metadata_fingerprint from raw_events where "
            r7.append(r6)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r5 = r7.toString()     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            android.database.Cursor r4 = r0.rawQuery(r5, r4)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0076 }
            if (r5 != 0) goto L_0x006a
            r4.close()
            return
        L_0x006a:
            java.lang.String r3 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0076 }
            r4.close()     // Catch:{ SQLiteException -> 0x0076 }
            goto L_0x00c3
        L_0x0076:
            r0 = move-exception
            goto L_0x021b
        L_0x0079:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0088
            java.lang.String[] r4 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r4[r11] = r3     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r4[r12] = r6     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            goto L_0x008c
        L_0x0088:
            java.lang.String[] r4 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
        L_0x008c:
            int r6 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0092
            java.lang.String r5 = " and rowid <= ?"
        L_0x0092:
            int r6 = r5.length()     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            int r6 = r6 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r7.<init>(r6)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r6 = "select metadata_fingerprint from raw_events where app_id = ?"
            r7.append(r6)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r5 = " order by rowid limit 1;"
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            java.lang.String r5 = r7.toString()     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            android.database.Cursor r4 = r0.rawQuery(r5, r4)     // Catch:{ SQLiteException -> 0x0219, all -> 0x0217 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0076 }
            if (r5 != 0) goto L_0x00bc
            r4.close()
            return
        L_0x00bc:
            java.lang.String r5 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0076 }
            r4.close()     // Catch:{ SQLiteException -> 0x0076 }
        L_0x00c3:
            r16 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0213, all -> 0x020f }
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0213, all -> 0x020f }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0213, all -> 0x020f }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0213, all -> 0x020f }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = 0
            r11 = r18
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0213, all -> 0x020f }
            boolean r4 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            if (r4 != 0) goto L_0x0104
            com.google.android.gms.measurement.internal.h4 r0 = r1.f21269a     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r0.mo38857b(r2, r4)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r12.close()
            return
        L_0x0104:
            byte[] r4 = r12.getBlob(r15)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            com.google.android.gms.internal.measurement.o4 r5 = com.google.android.gms.internal.measurement.C9296p4.m43369H1()     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.v9 r4 = com.google.android.gms.measurement.internal.C9978z8.m45535C(r5, r4)     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.o4 r4 = (com.google.android.gms.internal.measurement.C9280o4) r4     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.r8 r4 = r4.mo37840w()     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.p4 r4 = (com.google.android.gms.internal.measurement.C9296p4) r4     // Catch:{ IOException -> 0x01ea }
            boolean r5 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            if (r5 == 0) goto L_0x0131
            com.google.android.gms.measurement.internal.h4 r5 = r1.f21269a     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19287w()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r5.mo38857b(r6, r7)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
        L_0x0131:
            r12.close()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            com.google.android.gms.common.internal.C4604n.m20098k(r4)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r2.f46837a = r4     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r11 = 3
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0151
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r5[r15] = r3     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r13 = 1
            r5[r13] = r17     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r7 = 2
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r7 = r4
            r8 = r5
            goto L_0x015d
        L_0x0151:
            r13 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r6[r13] = r17     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            r7 = r4
            r8 = r6
        L_0x015d:
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x020b, all -> 0x0207 }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r14 = "rowid"
            r16 = 0
            r4 = r0
            r13 = 3
            r11 = r14
            r14 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0203 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0076 }
            if (r0 == 0) goto L_0x01d3
        L_0x0181:
            long r5 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x0076 }
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.internal.measurement.e4 r7 = com.google.android.gms.internal.measurement.C9143f4.m42844D()     // Catch:{ IOException -> 0x01b3 }
            com.google.android.gms.internal.measurement.v9 r0 = com.google.android.gms.measurement.internal.C9978z8.m45535C(r7, r0)     // Catch:{ IOException -> 0x01b3 }
            com.google.android.gms.internal.measurement.e4 r0 = (com.google.android.gms.internal.measurement.C9128e4) r0     // Catch:{ IOException -> 0x01b3 }
            r7 = 1
            java.lang.String r8 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x0076 }
            r0.mo37529N(r8)     // Catch:{ SQLiteException -> 0x0076 }
            r8 = 2
            long r9 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x0076 }
            r0.mo37533R(r9)     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.internal.measurement.r8 r0 = r0.mo37840w()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.internal.measurement.f4 r0 = (com.google.android.gms.internal.measurement.C9143f4) r0     // Catch:{ SQLiteException -> 0x0076 }
            boolean r0 = r2.mo39255a(r5, r0)     // Catch:{ SQLiteException -> 0x0076 }
            if (r0 != 0) goto L_0x01c9
            r4.close()
            return
        L_0x01b3:
            r0 = move-exception
            r7 = 1
            r8 = 2
            com.google.android.gms.measurement.internal.h4 r5 = r1.f21269a     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)     // Catch:{ SQLiteException -> 0x0076 }
            r5.mo38858c(r6, r9, r0)     // Catch:{ SQLiteException -> 0x0076 }
        L_0x01c9:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0076 }
            if (r0 != 0) goto L_0x0181
            r4.close()
            return
        L_0x01d3:
            com.google.android.gms.measurement.internal.h4 r0 = r1.f21269a     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)     // Catch:{ SQLiteException -> 0x0076 }
            r0.mo38857b(r2, r5)     // Catch:{ SQLiteException -> 0x0076 }
            r4.close()
            return
        L_0x01ea:
            r0 = move-exception
            r14 = r12
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a     // Catch:{ SQLiteException -> 0x0205, all -> 0x0203 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ SQLiteException -> 0x0205, all -> 0x0203 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ SQLiteException -> 0x0205, all -> 0x0203 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0203 }
            r2.mo38858c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0203 }
            r14.close()
            return
        L_0x0203:
            r0 = move-exception
            goto L_0x0209
        L_0x0205:
            r0 = move-exception
            goto L_0x020d
        L_0x0207:
            r0 = move-exception
            r14 = r12
        L_0x0209:
            r3 = r14
            goto L_0x0236
        L_0x020b:
            r0 = move-exception
            r14 = r12
        L_0x020d:
            r4 = r14
            goto L_0x021b
        L_0x020f:
            r0 = move-exception
            r3 = r16
            goto L_0x0236
        L_0x0213:
            r0 = move-exception
            r4 = r16
            goto L_0x021b
        L_0x0217:
            r0 = move-exception
            goto L_0x0236
        L_0x0219:
            r0 = move-exception
            r4 = r3
        L_0x021b:
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a     // Catch:{ all -> 0x0234 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x0234 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0234 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)     // Catch:{ all -> 0x0234 }
            r2.mo38858c(r5, r3, r0)     // Catch:{ all -> 0x0234 }
            if (r4 == 0) goto L_0x0233
            r4.close()
        L_0x0233:
            return
        L_0x0234:
            r0 = move-exception
            r3 = r4
        L_0x0236:
            if (r3 == 0) goto L_0x023b
            r3.close()
        L_0x023b:
            goto L_0x023d
        L_0x023c:
            throw r0
        L_0x023d:
            goto L_0x023c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9793i.mo38981G(java.lang.String, long, long, com.google.android.gms.measurement.internal.w8):void");
    }

    /* renamed from: J */
    public final int mo38982J(String str, String str2) {
        C4604n.m20094g(str);
        C4604n.m20094g(str2);
        mo19272b();
        mo39090d();
        try {
            return mo38987P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38859d("Error deleting conditional property", C4667d3.m21474z(str), this.f21269a.mo19363D().mo39322f(str2), e);
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final long mo38983L(String str, String str2) {
        String str3 = str;
        C4604n.m20094g(str);
        C4604n.m20094g("first_open_count");
        mo19272b();
        mo39090d();
        SQLiteDatabase P = mo38987P();
        P.beginTransaction();
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder(48);
            sb.append("select ");
            sb.append("first_open_count");
            sb.append(" from app2 where app_id=?");
            long K = m45136K(sb.toString(), new String[]{str3}, -1);
            if (K == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (P.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f21269a.mo19276j().mo19282q().mo38858c("Failed to insert column (got -1). appId", C4667d3.m21474z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                K = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put("first_open_count", Long.valueOf(1 + K));
                if (((long) P.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    this.f21269a.mo19276j().mo19282q().mo38858c("Failed to update column (got 0). appId", C4667d3.m21474z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                P.setTransactionSuccessful();
                P.endTransaction();
                return K;
            } catch (SQLiteException e) {
                e = e;
                j = K;
                try {
                    this.f21269a.mo19276j().mo19282q().mo38859d("Error inserting column. appId", C4667d3.m21474z(str), "first_open_count", e);
                    P.endTransaction();
                    return j;
                } catch (Throwable th) {
                    P.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f21269a.mo19276j().mo19282q().mo38859d("Error inserting column. appId", C4667d3.m21474z(str), "first_open_count", e);
            P.endTransaction();
            return j;
        }
    }

    /* renamed from: M */
    public final long mo38984M() {
        return m45136K("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* renamed from: N */
    public final long mo38985N() {
        return m45136K("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: O */
    public final long mo38986O(String str) {
        C4604n.m20094g(str);
        return m45136K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final SQLiteDatabase mo38987P() {
        mo19272b();
        try {
            return this.f46348d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19287w().mo38857b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo38988Q(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo19272b()
            r7.mo39090d()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo38987P()     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00ba }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.h4 r8 = r7.f21269a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.d3 r8 = r8.mo19276j()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.b3 r8 = r8.mo19286v()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo38856a(r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.internal.measurement.e4 r3 = com.google.android.gms.internal.measurement.C9143f4.m42844D()     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.v9 r2 = com.google.android.gms.measurement.internal.C9978z8.m45535C(r3, r2)     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.e4 r2 = (com.google.android.gms.internal.measurement.C9128e4) r2     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.r8 r2 = r2.mo37840w()     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.f4 r2 = (com.google.android.gms.internal.measurement.C9143f4) r2     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.measurement.internal.x8 r8 = r7.f46518b     // Catch:{ SQLiteException -> 0x00ba }
            r8.mo39292f0()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.List r8 = r2.mo37556I()     // Catch:{ SQLiteException -> 0x00ba }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00ba }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00ba }
        L_0x0056:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00ba }
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.internal.measurement.j4 r3 = (com.google.android.gms.internal.measurement.C9204j4) r3     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = r3.mo37664G()     // Catch:{ SQLiteException -> 0x00ba }
            boolean r5 = r3.mo37667T()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0074
            double r5 = r3.mo37672z()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0074:
            boolean r5 = r3.mo37668U()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0082
            float r3 = r3.mo37661A()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0082:
            boolean r5 = r3.mo37671X()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0090
            java.lang.String r3 = r3.mo37665H()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0090:
            boolean r5 = r3.mo37669V()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0056
            long r5 = r3.mo37663C()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x009e:
            r1.close()
            return r2
        L_0x00a2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.h4 r3 = r7.f21269a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r8)     // Catch:{ SQLiteException -> 0x00ba }
            r3.mo38858c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x00ba:
            r8 = move-exception
            goto L_0x00c0
        L_0x00bc:
            r8 = move-exception
            goto L_0x00d7
        L_0x00be:
            r8 = move-exception
            r1 = r0
        L_0x00c0:
            com.google.android.gms.measurement.internal.h4 r2 = r7.f21269a     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo38857b(r3, r8)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d4
            r1.close()
        L_0x00d4:
            return r0
        L_0x00d5:
            r8 = move-exception
            r0 = r1
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r0.close()
        L_0x00dc:
            goto L_0x00de
        L_0x00dd:
            throw r8
        L_0x00de:
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9793i.mo38988Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0117 A[Catch:{ SQLiteException -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x011b A[Catch:{ SQLiteException -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0157 A[Catch:{ SQLiteException -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0170 A[Catch:{ SQLiteException -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x018c A[Catch:{ SQLiteException -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018d A[Catch:{ SQLiteException -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019c A[Catch:{ SQLiteException -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b7 A[Catch:{ SQLiteException -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01f1  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C9885q4 mo38989R(java.lang.String r34) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            com.google.android.gms.common.internal.C4604n.m20094g(r34)
            r33.mo19272b()
            r33.mo39090d()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r33.mo38987P()     // Catch:{ SQLiteException -> 0x01d2, all -> 0x01d0 }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}     // Catch:{ SQLiteException -> 0x01d2, all -> 0x01d0 }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01d2, all -> 0x01d0 }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x01d2, all -> 0x01d0 }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x01d2, all -> 0x01d0 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01ce }
            if (r5 != 0) goto L_0x0069
            r4.close()
            return r3
        L_0x0069:
            com.google.android.gms.measurement.internal.q4 r5 = new com.google.android.gms.measurement.internal.q4     // Catch:{ SQLiteException -> 0x01ce }
            com.google.android.gms.measurement.internal.x8 r6 = r1.f46518b     // Catch:{ SQLiteException -> 0x01ce }
            com.google.android.gms.measurement.internal.h4 r6 = r6.mo39287b0()     // Catch:{ SQLiteException -> 0x01ce }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x01ce }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39147h(r6)     // Catch:{ SQLiteException -> 0x01ce }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39164w(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39112F(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39108B(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39109C(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39167z(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39151j(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39149i(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39165x(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39160s(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ce }
            if (r7 != 0) goto L_0x00d5
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01ce }
            if (r6 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r6 = 0
            goto L_0x00d6
        L_0x00d5:
            r6 = 1
        L_0x00d6:
            r5.mo39110D(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39159r(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39157p(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39156o(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39154m(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39153l(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39162u(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ce }
            if (r7 == 0) goto L_0x011b
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0120
        L_0x011b:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01ce }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x01ce }
        L_0x0120:
            r5.mo39152k(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39163v(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39155n(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39158q(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39166y(r6)     // Catch:{ SQLiteException -> 0x01ce }
            com.google.android.gms.measurement.internal.h4 r6 = r1.f21269a     // Catch:{ SQLiteException -> 0x01ce }
            com.google.android.gms.measurement.internal.f r6 = r6.mo19392z()     // Catch:{ SQLiteException -> 0x01ce }
            com.google.android.gms.measurement.internal.r2 r7 = com.google.android.gms.measurement.internal.C9903s2.f46695j0     // Catch:{ SQLiteException -> 0x01ce }
            boolean r6 = r6.mo19337B(r3, r7)     // Catch:{ SQLiteException -> 0x01ce }
            r7 = 0
            if (r6 != 0) goto L_0x0168
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ce }
            if (r9 == 0) goto L_0x0161
            r9 = r7
            goto L_0x0165
        L_0x0161:
            long r9 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ce }
        L_0x0165:
            r5.mo39145g(r9)     // Catch:{ SQLiteException -> 0x01ce }
        L_0x0168:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ce }
            if (r9 != 0) goto L_0x0178
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01ce }
            if (r6 == 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r0 = 0
        L_0x0178:
            r5.mo39143f(r0)     // Catch:{ SQLiteException -> 0x01ce }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39141e(r0)     // Catch:{ SQLiteException -> 0x01ce }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01ce }
            if (r6 == 0) goto L_0x018d
            goto L_0x0191
        L_0x018d:
            long r7 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x01ce }
        L_0x0191:
            r5.mo39161t(r7)     // Catch:{ SQLiteException -> 0x01ce }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01ce }
            if (r6 != 0) goto L_0x01ae
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01ce }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x01ce }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01ce }
            r5.mo39113G(r0)     // Catch:{ SQLiteException -> 0x01ce }
        L_0x01ae:
            r5.mo39137c()     // Catch:{ SQLiteException -> 0x01ce }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01ce }
            if (r0 == 0) goto L_0x01ca
            com.google.android.gms.measurement.internal.h4 r0 = r1.f21269a     // Catch:{ SQLiteException -> 0x01ce }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ SQLiteException -> 0x01ce }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()     // Catch:{ SQLiteException -> 0x01ce }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r34)     // Catch:{ SQLiteException -> 0x01ce }
            r0.mo38857b(r6, r7)     // Catch:{ SQLiteException -> 0x01ce }
        L_0x01ca:
            r4.close()
            return r5
        L_0x01ce:
            r0 = move-exception
            goto L_0x01d4
        L_0x01d0:
            r0 = move-exception
            goto L_0x01ef
        L_0x01d2:
            r0 = move-exception
            r4 = r3
        L_0x01d4:
            com.google.android.gms.measurement.internal.h4 r5 = r1.f21269a     // Catch:{ all -> 0x01ed }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ all -> 0x01ed }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x01ed }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r34)     // Catch:{ all -> 0x01ed }
            r5.mo38858c(r6, r2, r0)     // Catch:{ all -> 0x01ed }
            if (r4 == 0) goto L_0x01ec
            r4.close()
        L_0x01ec:
            return r3
        L_0x01ed:
            r0 = move-exception
            r3 = r4
        L_0x01ef:
            if (r3 == 0) goto L_0x01f4
            r3.close()
        L_0x01f4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9793i.mo38989R(java.lang.String):com.google.android.gms.measurement.internal.q4");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0126  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzab mo38990S(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            com.google.android.gms.common.internal.C4604n.m20094g(r31)
            com.google.android.gms.common.internal.C4604n.m20094g(r32)
            r30.mo19272b()
            r30.mo39090d()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.mo38987P()     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = ""
        L_0x0057:
            r17 = r4
            java.lang.Object r6 = r1.mo38995Y(r10, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r0 == 0) goto L_0x0066
            r21 = 1
            goto L_0x0068
        L_0x0066:
            r21 = 0
        L_0x0068:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.x8 r0 = r1.f46518b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.z8 r0 = r0.mo39292f0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzau> r3 = com.google.android.gms.measurement.internal.zzau.CREATOR     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo39353z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r23 = r0
            com.google.android.gms.measurement.internal.zzau r23 = (com.google.android.gms.measurement.internal.zzau) r23     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.x8 r0 = r1.f46518b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.z8 r0 = r0.mo39292f0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo39353z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r26 = r0
            com.google.android.gms.measurement.internal.zzau r26 = (com.google.android.gms.measurement.internal.zzau) r26     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.x8 r0 = r1.f46518b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.z8 r0 = r0.mo39292f0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo39353z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r29 = r0
            com.google.android.gms.measurement.internal.zzau r29 = (com.google.android.gms.measurement.internal.zzau) r29     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.zzks r18 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.zzab r0 = new com.google.android.gms.measurement.internal.zzab     // Catch:{ SQLiteException -> 0x00f9 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00f9 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r31)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.h4 r5 = r1.f21269a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.y2 r5 = r5.mo19363D()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r5 = r5.mo39322f(r8)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.mo38858c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x00f5:
            r10.close()
            return r0
        L_0x00f9:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fb:
            r0 = move-exception
            goto L_0x0124
        L_0x00fd:
            r0 = move-exception
            r10 = r9
        L_0x00ff:
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r31)     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.h4 r5 = r1.f21269a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.y2 r5 = r5.mo19363D()     // Catch:{ all -> 0x0122 }
            java.lang.String r5 = r5.mo39322f(r8)     // Catch:{ all -> 0x0122 }
            r2.mo38859d(r3, r4, r5, r0)     // Catch:{ all -> 0x0122 }
            if (r10 == 0) goto L_0x0121
            r10.close()
        L_0x0121:
            return r9
        L_0x0122:
            r0 = move-exception
            r9 = r10
        L_0x0124:
            if (r9 == 0) goto L_0x0129
            r9.close()
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9793i.mo38990S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzab");
    }

    /* renamed from: T */
    public final C9772g mo38991T(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo38992U(j, str, 1, false, false, z3, false, z5);
    }

    /* renamed from: U */
    public final C9772g mo38992U(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C4604n.m20094g(str);
        mo19272b();
        mo39090d();
        String[] strArr = {str};
        C9772g gVar = new C9772g();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo38987P();
            cursor = P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.f21269a.mo19276j().mo19287w().mo38857b("Not updating daily counts, app is not known. appId", C4667d3.m21474z(str));
                cursor.close();
                return gVar;
            }
            if (cursor.getLong(0) == j) {
                gVar.f46277b = cursor.getLong(1);
                gVar.f46276a = cursor.getLong(2);
                gVar.f46278c = cursor.getLong(3);
                gVar.f46279d = cursor.getLong(4);
                gVar.f46280e = cursor.getLong(5);
            }
            if (z) {
                gVar.f46277b += j2;
            }
            if (z2) {
                gVar.f46276a += j2;
            }
            if (z3) {
                gVar.f46278c += j2;
            }
            if (z4) {
                gVar.f46279d += j2;
            }
            if (z5) {
                gVar.f46280e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(gVar.f46276a));
            contentValues.put("daily_events_count", Long.valueOf(gVar.f46277b));
            contentValues.put("daily_conversions_count", Long.valueOf(gVar.f46278c));
            contentValues.put("daily_error_events_count", Long.valueOf(gVar.f46279d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(gVar.f46280e));
            P.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return gVar;
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38858c("Error updating daily counts. appId", C4667d3.m21474z(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return gVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C9859o mo38993V(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            com.google.android.gms.common.internal.C4604n.m20094g(r28)
            com.google.android.gms.common.internal.C4604n.m20094g(r29)
            r27.mo19272b()
            r27.mo39090d()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.mo38987P()     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = 1
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r9 = r2
        L_0x00dc:
            com.google.android.gms.measurement.internal.o r24 = new com.google.android.gms.measurement.internal.o     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.h4 r0 = r1.f21269a     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r28)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            r0.mo38857b(r2, r3)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
        L_0x010d:
            r25.close()
            return r24
        L_0x0111:
            r0 = move-exception
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            goto L_0x011e
        L_0x0115:
            r0 = move-exception
            r25 = r13
        L_0x0118:
            r19 = r25
            goto L_0x014e
        L_0x011b:
            r0 = move-exception
            r25 = r13
        L_0x011e:
            r13 = r25
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            goto L_0x014e
        L_0x0123:
            r0 = move-exception
            r13 = r19
        L_0x0126:
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r28)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.h4 r5 = r1.f21269a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.y2 r5 = r5.mo19363D()     // Catch:{ all -> 0x014b }
            r6 = r29
            java.lang.String r5 = r5.mo39320d(r6)     // Catch:{ all -> 0x014b }
            r2.mo38859d(r3, r4, r5, r0)     // Catch:{ all -> 0x014b }
            if (r13 == 0) goto L_0x014a
            r13.close()
        L_0x014a:
            return r19
        L_0x014b:
            r0 = move-exception
            r19 = r13
        L_0x014e:
            if (r19 == 0) goto L_0x0153
            r19.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9793i.mo38993V(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.o");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C9730b9 mo38994X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.C4604n.m20094g(r20)
            com.google.android.gms.common.internal.C4604n.m20094g(r21)
            r19.mo19272b()
            r19.mo39090d()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo38987P()     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.Object r8 = r1.mo38995Y(r11, r3)     // Catch:{ SQLiteException -> 0x0079 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.b9 r0 = new com.google.android.gms.measurement.internal.b9     // Catch:{ SQLiteException -> 0x0079 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r2 == 0) goto L_0x0075
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r20)     // Catch:{ SQLiteException -> 0x0079 }
            r2.mo38857b(r3, r4)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x0075:
            r11.close()
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            goto L_0x00a4
        L_0x007d:
            r0 = move-exception
            r11 = r10
        L_0x007f:
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r20)     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.h4 r5 = r1.f21269a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.y2 r5 = r5.mo19363D()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r5.mo39322f(r9)     // Catch:{ all -> 0x00a2 }
            r2.mo38859d(r3, r4, r5, r0)     // Catch:{ all -> 0x00a2 }
            if (r11 == 0) goto L_0x00a1
            r11.close()
        L_0x00a1:
            return r10
        L_0x00a2:
            r0 = move-exception
            r10 = r11
        L_0x00a4:
            if (r10 == 0) goto L_0x00a9
            r10.close()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9793i.mo38994X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.b9");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final Object mo38995Y(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f21269a.mo19276j().mo19282q().mo38856a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.f21269a.mo19276j().mo19282q().mo38857b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f21269a.mo19276j().mo19282q().mo38856a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo38996Z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo38987P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003e
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            com.google.android.gms.measurement.internal.h4 r3 = r6.f21269a     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo38857b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9793i.mo38996Z():java.lang.String");
    }

    /* renamed from: a0 */
    public final List mo38997a0(String str, String str2, String str3) {
        C4604n.m20094g(str);
        mo19272b();
        mo39090d();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo38998b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: b0 */
    public final List mo38998b0(String str, String[] strArr) {
        mo19272b();
        mo39090d();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo38987P();
            String[] strArr2 = {"app_id", TtmlNode.ATTR_TTS_ORIGIN, MediationMetaData.KEY_NAME, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
            this.f21269a.mo19392z();
            Cursor query = P.query("conditional_properties", strArr2, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.f21269a.mo19392z();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object Y = mo38995Y(query, 3);
                        boolean z = query.getInt(4) != 0;
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        C9978z8 f0 = this.f46518b.mo39292f0();
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator<zzau> creator = zzau.CREATOR;
                        arrayList.add(new zzab(string, string2, new zzks(string3, query.getLong(10), Y, string2), query.getLong(8), z, string4, (zzau) f0.mo39353z(blob, creator), j, (zzau) this.f46518b.mo39292f0().mo39353z(query.getBlob(9), creator), query.getLong(11), (zzau) this.f46518b.mo39292f0().mo39353z(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        C9725b3 q = this.f21269a.mo19276j().mo19282q();
                        this.f21269a.mo19392z();
                        q.mo38857b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38857b("Error querying conditional user property value", e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c0 */
    public final List mo38999c0(String str) {
        C4604n.m20094g(str);
        mo19272b();
        mo39090d();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f21269a.mo19392z();
            Cursor query = mo38987P().query("user_attributes", new String[]{MediationMetaData.KEY_NAME, TtmlNode.ATTR_TTS_ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object Y = mo38995Y(query, 3);
                    if (Y == null) {
                        this.f21269a.mo19276j().mo19282q().mo38857b("Read invalid user property value, ignoring it. appId", C4667d3.m21474z(str));
                    } else {
                        arrayList.add(new C9730b9(str, str2, string, j, Y));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38858c("Error querying user properties. appId", C4667d3.m21474z(str), e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x011d A[DONT_GENERATE] */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo39000d0(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r16 = this;
            r1 = r16
            com.google.android.gms.common.internal.C4604n.m20094g(r17)
            r16.mo19272b()
            r16.mo39090d()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            r11 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ff }
            r12 = 3
            r2.<init>(r12)     // Catch:{ SQLiteException -> 0x00ff }
            r13 = r17
            r2.add(r13)     // Catch:{ SQLiteException -> 0x00fd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fd }
            java.lang.String r4 = "app_id=?"
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x00fd }
            boolean r4 = android.text.TextUtils.isEmpty(r18)     // Catch:{ SQLiteException -> 0x00fd }
            if (r4 != 0) goto L_0x0036
            r14 = r18
            r2.add(r14)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = " and origin=?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00f9 }
            goto L_0x0038
        L_0x0036:
            r14 = r18
        L_0x0038:
            boolean r4 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x0050
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.add(r4)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x0050:
            int r4 = r2.size()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ SQLiteException -> 0x00f9 }
            r6 = r2
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ SQLiteException -> 0x00f9 }
            android.database.sqlite.SQLiteDatabase r2 = r16.mo38987P()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = "user_attributes"
            java.lang.String r5 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r5, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r7 = r3.toString()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r9 = "rowid"
            com.google.android.gms.measurement.internal.h4 r3 = r1.f21269a     // Catch:{ SQLiteException -> 0x00f9 }
            r3.mo19392z()     // Catch:{ SQLiteException -> 0x00f9 }
            r8 = 0
            r15 = 0
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r15
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00f9 }
            boolean r2 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 != 0) goto L_0x008f
            r11.close()
            return r0
        L_0x008f:
            int r2 = r0.size()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.h4 r3 = r1.f21269a     // Catch:{ SQLiteException -> 0x00f9 }
            r3.mo19392z()     // Catch:{ SQLiteException -> 0x00f9 }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto L_0x00b5
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.h4 r5 = r1.f21269a     // Catch:{ SQLiteException -> 0x00f9 }
            r5.mo19392z()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.mo38857b(r4, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            goto L_0x00f5
        L_0x00b5:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 1
            long r7 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 2
            java.lang.Object r9 = r1.mo38995Y(r11, r2)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r14 = r11.getString(r12)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r9 != 0) goto L_0x00e0
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r3 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r17)     // Catch:{ SQLiteException -> 0x00f9 }
            r10 = r19
            r2.mo38859d(r3, r4, r14, r10)     // Catch:{ SQLiteException -> 0x00f9 }
            goto L_0x00ee
        L_0x00e0:
            r10 = r19
            com.google.android.gms.measurement.internal.b9 r2 = new com.google.android.gms.measurement.internal.b9     // Catch:{ SQLiteException -> 0x00f9 }
            r3 = r2
            r4 = r17
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ SQLiteException -> 0x00f9 }
            r0.add(r2)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x00ee:
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            goto L_0x008f
        L_0x00f5:
            r11.close()
            return r0
        L_0x00f9:
            r0 = move-exception
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            goto L_0x0121
        L_0x00fd:
            r0 = move-exception
            goto L_0x0102
        L_0x00ff:
            r0 = move-exception
            r13 = r17
        L_0x0102:
            r14 = r18
        L_0x0104:
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a     // Catch:{ all -> 0x00fb }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x00fb }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r17)     // Catch:{ all -> 0x00fb }
            r2.mo38859d(r3, r4, r14, r0)     // Catch:{ all -> 0x00fb }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0120
            r11.close()
        L_0x0120:
            return r0
        L_0x0121:
            if (r11 == 0) goto L_0x0126
            r11.close()
        L_0x0126:
            goto L_0x0128
        L_0x0127:
            throw r0
        L_0x0128:
            goto L_0x0127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9793i.mo39000d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: e0 */
    public final void mo39001e0() {
        mo39090d();
        mo38987P().beginTransaction();
    }

    /* renamed from: f0 */
    public final void mo39002f0() {
        mo39090d();
        mo38987P().endTransaction();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final void mo39003g0(List list) {
        mo19272b();
        mo39090d();
        C4604n.m20098k(list);
        C4604n.m20100m(list.size());
        if (mo39013u()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m45135I(sb3.toString(), (String[]) null) > 0) {
                this.f21269a.mo19276j().mo19287w().mo38856a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase P = mo38987P();
                StringBuilder sb4 = new StringBuilder(sb2.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < ");
                sb4.append(Integer.MAX_VALUE);
                sb4.append(")");
                P.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                this.f21269a.mo19276j().mo19282q().mo38857b("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final void mo39004h0() {
        mo19272b();
        mo39090d();
        if (mo39013u()) {
            long a = this.f46518b.mo39291d0().f46813h.mo39075a();
            long elapsedRealtime = this.f21269a.mo19274f().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a);
            this.f21269a.mo19392z();
            if (abs > ((Long) C9903s2.f46726z.mo39174a((Object) null)).longValue()) {
                this.f46518b.mo39291d0().f46813h.mo39076b(elapsedRealtime);
                mo19272b();
                mo39090d();
                if (mo39013u()) {
                    SQLiteDatabase P = mo38987P();
                    this.f21269a.mo19392z();
                    int delete = P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f21269a.mo19274f().currentTimeMillis()), String.valueOf(C4669f.m21551d())});
                    if (delete > 0) {
                        this.f21269a.mo19276j().mo19286v().mo38857b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo38861k() {
        return false;
    }

    /* renamed from: l */
    public final void mo39005l(String str, String str2) {
        C4604n.m20094g(str);
        C4604n.m20094g(str2);
        mo19272b();
        mo39090d();
        try {
            mo38987P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38859d("Error deleting user property. appId", C4667d3.m21474z(str), this.f21269a.mo19363D().mo39322f(str2), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0326, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.mo37625D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0338, code lost:
        if (r3.mo37630K() == false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x033a, code lost:
        r0 = java.lang.Boolean.valueOf(r3.mo37628I());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0343, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0344, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0358, code lost:
        if (mo38987P().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x035a, code lost:
        r9.f21269a.mo19276j().mo19282q().mo38857b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C4667d3.m21474z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x036e, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0372, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r9.f21269a.mo19276j().mo19282q().mo38858c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C4667d3.m21474z(r24), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03bd, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018b, code lost:
        r11 = r0.mo38140H().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0197, code lost:
        if (r11.hasNext() == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a3, code lost:
        if (((com.google.android.gms.internal.measurement.C9188i3) r11.next()).mo37629J() != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a5, code lost:
        r9.f21269a.mo19276j().mo19287w().mo38858c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C4667d3.m21474z(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01be, code lost:
        r11 = r0.mo38139G().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r11.hasNext() == false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r12 = (com.google.android.gms.internal.measurement.C9447z2) r11.next();
        mo39090d();
        mo19272b();
        com.google.android.gms.common.internal.C4604n.m20094g(r24);
        com.google.android.gms.common.internal.C4604n.m20098k(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f0, code lost:
        if (android.text.TextUtils.isEmpty(r12.mo38201G()) == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f2, code lost:
        r0 = r9.f21269a.mo19276j().mo19287w();
        r8 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x020a, code lost:
        if (r12.mo38207O() == false) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x020c, code lost:
        r20 = java.lang.Integer.valueOf(r12.mo38198A());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0217, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0219, code lost:
        r0.mo38859d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0224, code lost:
        r3 = r12.mo37404l();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r2);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x023d, code lost:
        if (r12.mo38207O() == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x023f, code lost:
        r8 = java.lang.Integer.valueOf(r12.mo38198A());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0248, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0249, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.mo38201G());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0259, code lost:
        if (r12.mo38208P() == false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025b, code lost:
        r8 = java.lang.Boolean.valueOf(r12.mo38205M());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0264, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0265, code lost:
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0279, code lost:
        if (mo38987P().insertWithOnConflict("event_filters", (java.lang.String) null, r4, 5) != -1) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027b, code lost:
        r9.f21269a.mo19276j().mo19282q().mo38857b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C4667d3.m21474z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x028e, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02aa, code lost:
        r21 = r4;
        r0 = r0.mo38140H().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02b8, code lost:
        if (r0.hasNext() == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02ba, code lost:
        r3 = (com.google.android.gms.internal.measurement.C9188i3) r0.next();
        mo39090d();
        mo19272b();
        com.google.android.gms.common.internal.C4604n.m20094g(r24);
        com.google.android.gms.common.internal.C4604n.m20098k(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d4, code lost:
        if (android.text.TextUtils.isEmpty(r3.mo37625D()) == false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d6, code lost:
        r0 = r9.f21269a.mo19276j().mo19287w();
        r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ee, code lost:
        if (r3.mo37629J() == false) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02f0, code lost:
        r3 = java.lang.Integer.valueOf(r3.mo37631z());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f9, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02fa, code lost:
        r0.mo38859d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0303, code lost:
        r4 = r3.mo37404l();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r2);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x031a, code lost:
        if (r3.mo37629J() == false) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x031c, code lost:
        r12 = java.lang.Integer.valueOf(r3.mo37631z());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0325, code lost:
        r12 = null;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39006m(java.lang.String r24, java.util.List r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            com.google.android.gms.common.internal.C4604n.m20098k(r25)
            r8 = 0
        L_0x0012:
            int r9 = r25.size()
            if (r8 >= r9) goto L_0x00e9
            java.lang.Object r9 = r3.get(r8)
            com.google.android.gms.internal.measurement.x2 r9 = (com.google.android.gms.internal.measurement.C9418x2) r9
            com.google.android.gms.internal.measurement.o8 r9 = r9.mo37997q()
            com.google.android.gms.internal.measurement.w2 r9 = (com.google.android.gms.internal.measurement.C9403w2) r9
            int r11 = r9.mo38114B()
            if (r11 == 0) goto L_0x00a6
            r12 = r9
            r11 = 0
        L_0x002c:
            int r13 = r12.mo38114B()
            if (r11 >= r13) goto L_0x00a3
            com.google.android.gms.internal.measurement.z2 r13 = r12.mo38118J(r11)
            com.google.android.gms.internal.measurement.o8 r13 = r13.mo37997q()
            com.google.android.gms.internal.measurement.y2 r13 = (com.google.android.gms.internal.measurement.C9433y2) r13
            com.google.android.gms.internal.measurement.o8 r14 = r13.clone()
            com.google.android.gms.internal.measurement.y2 r14 = (com.google.android.gms.internal.measurement.C9433y2) r14
            java.lang.String r15 = r13.mo38184J()
            java.lang.String r15 = p255u5.C11040o.m49440b(r15)
            if (r15 == 0) goto L_0x0051
            r14.mo38181C(r15)
            r15 = 1
            goto L_0x0052
        L_0x0051:
            r15 = 0
        L_0x0052:
            r7 = 0
        L_0x0053:
            int r10 = r13.mo38180B()
            if (r7 >= r10) goto L_0x008b
            com.google.android.gms.internal.measurement.b3 r10 = r13.mo38183I(r7)
            r16 = r13
            java.lang.String r13 = r10.mo37387D()
            r17 = r4
            java.lang.String[] r4 = p255u5.C11041p.f50002a
            java.lang.String[] r1 = p255u5.C11041p.f50003b
            java.lang.String r1 = p255u5.C11047v.m49450a(r13, r4, r1)
            if (r1 == 0) goto L_0x0082
            com.google.android.gms.internal.measurement.o8 r4 = r10.mo37997q()
            com.google.android.gms.internal.measurement.a3 r4 = (com.google.android.gms.internal.measurement.C9065a3) r4
            r4.mo37307B(r1)
            com.google.android.gms.internal.measurement.r8 r1 = r4.mo37840w()
            com.google.android.gms.internal.measurement.b3 r1 = (com.google.android.gms.internal.measurement.C9080b3) r1
            r14.mo38182H(r7, r1)
            r15 = 1
        L_0x0082:
            int r7 = r7 + 1
            r1 = r23
            r13 = r16
            r4 = r17
            goto L_0x0053
        L_0x008b:
            r17 = r4
            if (r15 == 0) goto L_0x009c
            r12.mo38116H(r11, r14)
            com.google.android.gms.internal.measurement.r8 r1 = r9.mo37840w()
            com.google.android.gms.internal.measurement.x2 r1 = (com.google.android.gms.internal.measurement.C9418x2) r1
            r3.set(r8, r1)
            r12 = r9
        L_0x009c:
            int r11 = r11 + 1
            r1 = r23
            r4 = r17
            goto L_0x002c
        L_0x00a3:
            r17 = r4
            goto L_0x00a9
        L_0x00a6:
            r17 = r4
            r12 = r9
        L_0x00a9:
            int r1 = r12.mo38115C()
            if (r1 == 0) goto L_0x00e1
            r1 = 0
        L_0x00b0:
            int r4 = r12.mo38115C()
            if (r1 >= r4) goto L_0x00e1
            com.google.android.gms.internal.measurement.i3 r4 = r12.mo38119K(r1)
            java.lang.String r7 = r4.mo37625D()
            java.lang.String[] r10 = p255u5.C11042q.f50006a
            java.lang.String[] r11 = p255u5.C11042q.f50007b
            java.lang.String r7 = p255u5.C11047v.m49450a(r7, r10, r11)
            if (r7 == 0) goto L_0x00de
            com.google.android.gms.internal.measurement.o8 r4 = r4.mo37997q()
            com.google.android.gms.internal.measurement.h3 r4 = (com.google.android.gms.internal.measurement.C9173h3) r4
            r4.mo37616B(r7)
            r12.mo38117I(r1, r4)
            com.google.android.gms.internal.measurement.r8 r4 = r9.mo37840w()
            com.google.android.gms.internal.measurement.x2 r4 = (com.google.android.gms.internal.measurement.C9418x2) r4
            r3.set(r8, r4)
            r12 = r9
        L_0x00de:
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00e1:
            int r8 = r8 + 1
            r1 = r23
            r4 = r17
            goto L_0x0012
        L_0x00e9:
            r17 = r4
            r23.mo39090d()
            r23.mo19272b()
            com.google.android.gms.common.internal.C4604n.m20094g(r24)
            com.google.android.gms.common.internal.C4604n.m20098k(r25)
            android.database.sqlite.SQLiteDatabase r1 = r23.mo38987P()
            r1.beginTransaction()
            r23.mo39090d()     // Catch:{ all -> 0x04ba }
            r23.mo19272b()     // Catch:{ all -> 0x04ba }
            com.google.android.gms.common.internal.C4604n.m20094g(r24)     // Catch:{ all -> 0x04ba }
            android.database.sqlite.SQLiteDatabase r4 = r23.mo38987P()     // Catch:{ all -> 0x04ba }
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04ba }
            r9 = 0
            r8[r9] = r2     // Catch:{ all -> 0x04ba }
            r4.delete(r6, r0, r8)     // Catch:{ all -> 0x04ba }
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04ba }
            r8[r9] = r2     // Catch:{ all -> 0x04ba }
            r4.delete(r5, r0, r8)     // Catch:{ all -> 0x04ba }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04ba }
        L_0x011f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x03c3
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x04ba }
            com.google.android.gms.internal.measurement.x2 r0 = (com.google.android.gms.internal.measurement.C9418x2) r0     // Catch:{ all -> 0x04ba }
            r23.mo39090d()     // Catch:{ all -> 0x04ba }
            r23.mo19272b()     // Catch:{ all -> 0x04ba }
            com.google.android.gms.common.internal.C4604n.m20094g(r24)     // Catch:{ all -> 0x04ba }
            com.google.android.gms.common.internal.C4604n.m20098k(r0)     // Catch:{ all -> 0x04ba }
            boolean r9 = r0.mo38141K()     // Catch:{ all -> 0x04ba }
            if (r9 != 0) goto L_0x0153
            r9 = r23
            com.google.android.gms.measurement.internal.h4 r0 = r9.f21269a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = "Audience with no ID. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24)     // Catch:{ all -> 0x04b8 }
            r0.mo38857b(r7, r8)     // Catch:{ all -> 0x04b8 }
            goto L_0x011f
        L_0x0153:
            r9 = r23
            int r10 = r0.mo38142z()     // Catch:{ all -> 0x04b8 }
            java.util.List r11 = r0.mo38139G()     // Catch:{ all -> 0x04b8 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04b8 }
        L_0x0161:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04b8 }
            if (r12 == 0) goto L_0x018b
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.internal.measurement.z2 r12 = (com.google.android.gms.internal.measurement.C9447z2) r12     // Catch:{ all -> 0x04b8 }
            boolean r12 = r12.mo38207O()     // Catch:{ all -> 0x04b8 }
            if (r12 != 0) goto L_0x0161
            com.google.android.gms.measurement.internal.h4 r0 = r9.f21269a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r0.mo38858c(r7, r8, r10)     // Catch:{ all -> 0x04b8 }
            goto L_0x011f
        L_0x018b:
            java.util.List r11 = r0.mo38140H()     // Catch:{ all -> 0x04b8 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04b8 }
        L_0x0193:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04b8 }
            if (r12 == 0) goto L_0x01be
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.internal.measurement.i3 r12 = (com.google.android.gms.internal.measurement.C9188i3) r12     // Catch:{ all -> 0x04b8 }
            boolean r12 = r12.mo37629J()     // Catch:{ all -> 0x04b8 }
            if (r12 != 0) goto L_0x0193
            com.google.android.gms.measurement.internal.h4 r0 = r9.f21269a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r0.mo38858c(r7, r8, r10)     // Catch:{ all -> 0x04b8 }
            goto L_0x011f
        L_0x01be:
            java.util.List r11 = r0.mo38139G()     // Catch:{ all -> 0x04b8 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04b8 }
        L_0x01c6:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r8 = "audience_id"
            java.lang.String r15 = "app_id"
            if (r12 == 0) goto L_0x02aa
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.internal.measurement.z2 r12 = (com.google.android.gms.internal.measurement.C9447z2) r12     // Catch:{ all -> 0x04b8 }
            r23.mo39090d()     // Catch:{ all -> 0x04b8 }
            r23.mo19272b()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.common.internal.C4604n.m20094g(r24)     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.common.internal.C4604n.m20098k(r12)     // Catch:{ all -> 0x04b8 }
            java.lang.String r21 = r12.mo38201G()     // Catch:{ all -> 0x04b8 }
            boolean r21 = android.text.TextUtils.isEmpty(r21)     // Catch:{ all -> 0x04b8 }
            if (r21 == 0) goto L_0x0224
            com.google.android.gms.measurement.internal.h4 r0 = r9.f21269a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            boolean r13 = r12.mo38207O()     // Catch:{ all -> 0x04b8 }
            if (r13 == 0) goto L_0x0217
            int r12 = r12.mo38198A()     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04b8 }
            r20 = r12
            goto L_0x0219
        L_0x0217:
            r20 = 0
        L_0x0219:
            java.lang.String r12 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x04b8 }
            r0.mo38859d(r7, r8, r11, r12)     // Catch:{ all -> 0x04b8 }
            r21 = r4
            goto L_0x0386
        L_0x0224:
            byte[] r3 = r12.mo37404l()     // Catch:{ all -> 0x04b8 }
            r21 = r4
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x04b8 }
            r4.<init>()     // Catch:{ all -> 0x04b8 }
            r4.put(r15, r2)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r4.put(r8, r15)     // Catch:{ all -> 0x04b8 }
            boolean r8 = r12.mo38207O()     // Catch:{ all -> 0x04b8 }
            if (r8 == 0) goto L_0x0248
            int r8 = r12.mo38198A()     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x04b8 }
            goto L_0x0249
        L_0x0248:
            r8 = 0
        L_0x0249:
            r4.put(r14, r8)     // Catch:{ all -> 0x04b8 }
            java.lang.String r8 = "event_name"
            java.lang.String r14 = r12.mo38201G()     // Catch:{ all -> 0x04b8 }
            r4.put(r8, r14)     // Catch:{ all -> 0x04b8 }
            boolean r8 = r12.mo38208P()     // Catch:{ all -> 0x04b8 }
            if (r8 == 0) goto L_0x0264
            boolean r8 = r12.mo38205M()     // Catch:{ all -> 0x04b8 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04b8 }
            goto L_0x0265
        L_0x0264:
            r8 = 0
        L_0x0265:
            r4.put(r13, r8)     // Catch:{ all -> 0x04b8 }
            r4.put(r7, r3)     // Catch:{ all -> 0x04b8 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo38987P()     // Catch:{ SQLiteException -> 0x0294 }
            r7 = 5
            r8 = 0
            long r3 = r3.insertWithOnConflict(r5, r8, r4, r7)     // Catch:{ SQLiteException -> 0x0294 }
            r7 = -1
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x028e
            com.google.android.gms.measurement.internal.h4 r3 = r9.f21269a     // Catch:{ SQLiteException -> 0x0294 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ SQLiteException -> 0x0294 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ SQLiteException -> 0x0294 }
            java.lang.String r4 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24)     // Catch:{ SQLiteException -> 0x0294 }
            r3.mo38857b(r4, r7)     // Catch:{ SQLiteException -> 0x0294 }
        L_0x028e:
            r3 = r25
            r4 = r21
            goto L_0x01c6
        L_0x0294:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r3 = r9.f21269a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "Error storing event filter. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24)     // Catch:{ all -> 0x04b8 }
            r3.mo38858c(r4, r7, r0)     // Catch:{ all -> 0x04b8 }
            goto L_0x0386
        L_0x02aa:
            r21 = r4
            java.util.List r0 = r0.mo38140H()     // Catch:{ all -> 0x04b8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x04b8 }
        L_0x02b4:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x04b8 }
            if (r3 == 0) goto L_0x03bd
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.internal.measurement.i3 r3 = (com.google.android.gms.internal.measurement.C9188i3) r3     // Catch:{ all -> 0x04b8 }
            r23.mo39090d()     // Catch:{ all -> 0x04b8 }
            r23.mo19272b()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.common.internal.C4604n.m20094g(r24)     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.common.internal.C4604n.m20098k(r3)     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = r3.mo37625D()     // Catch:{ all -> 0x04b8 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x04b8 }
            if (r4 == 0) goto L_0x0303
            com.google.android.gms.measurement.internal.h4 r0 = r9.f21269a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            boolean r11 = r3.mo37629J()     // Catch:{ all -> 0x04b8 }
            if (r11 == 0) goto L_0x02f9
            int r3 = r3.mo37631z()     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x04b8 }
            goto L_0x02fa
        L_0x02f9:
            r3 = 0
        L_0x02fa:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x04b8 }
            r0.mo38859d(r4, r7, r8, r3)     // Catch:{ all -> 0x04b8 }
            goto L_0x0386
        L_0x0303:
            byte[] r4 = r3.mo37404l()     // Catch:{ all -> 0x04b8 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x04b8 }
            r11.<init>()     // Catch:{ all -> 0x04b8 }
            r11.put(r15, r2)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r11.put(r8, r12)     // Catch:{ all -> 0x04b8 }
            boolean r12 = r3.mo37629J()     // Catch:{ all -> 0x04b8 }
            if (r12 == 0) goto L_0x0325
            int r12 = r3.mo37631z()     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04b8 }
            goto L_0x0326
        L_0x0325:
            r12 = 0
        L_0x0326:
            r11.put(r14, r12)     // Catch:{ all -> 0x04b8 }
            java.lang.String r12 = "property_name"
            r22 = r0
            java.lang.String r0 = r3.mo37625D()     // Catch:{ all -> 0x04b8 }
            r11.put(r12, r0)     // Catch:{ all -> 0x04b8 }
            boolean r0 = r3.mo37630K()     // Catch:{ all -> 0x04b8 }
            if (r0 == 0) goto L_0x0343
            boolean r0 = r3.mo37628I()     // Catch:{ all -> 0x04b8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04b8 }
            goto L_0x0344
        L_0x0343:
            r0 = 0
        L_0x0344:
            r11.put(r13, r0)     // Catch:{ all -> 0x04b8 }
            r11.put(r7, r4)     // Catch:{ all -> 0x04b8 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo38987P()     // Catch:{ SQLiteException -> 0x0372 }
            r3 = 0
            r4 = 5
            long r11 = r0.insertWithOnConflict(r6, r3, r11, r4)     // Catch:{ SQLiteException -> 0x0372 }
            r18 = -1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x036e
            com.google.android.gms.measurement.internal.h4 r0 = r9.f21269a     // Catch:{ SQLiteException -> 0x0372 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ SQLiteException -> 0x0372 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()     // Catch:{ SQLiteException -> 0x0372 }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24)     // Catch:{ SQLiteException -> 0x0372 }
            r0.mo38857b(r3, r4)     // Catch:{ SQLiteException -> 0x0372 }
            goto L_0x0386
        L_0x036e:
            r0 = r22
            goto L_0x02b4
        L_0x0372:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r3 = r9.f21269a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "Error storing property filter. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24)     // Catch:{ all -> 0x04b8 }
            r3.mo38858c(r4, r7, r0)     // Catch:{ all -> 0x04b8 }
        L_0x0386:
            r23.mo39090d()     // Catch:{ all -> 0x04b8 }
            r23.mo19272b()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.common.internal.C4604n.m20094g(r24)     // Catch:{ all -> 0x04b8 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo38987P()     // Catch:{ all -> 0x04b8 }
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x04b8 }
            r3 = 0
            r4[r3] = r2     // Catch:{ all -> 0x04b8 }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r7 = 1
            r4[r7] = r3     // Catch:{ all -> 0x04b8 }
            r3 = r17
            r0.delete(r6, r3, r4)     // Catch:{ all -> 0x04b8 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x04b8 }
            r7 = 0
            r4[r7] = r2     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04b8 }
            r8 = 1
            r4[r8] = r7     // Catch:{ all -> 0x04b8 }
            r0.delete(r5, r3, r4)     // Catch:{ all -> 0x04b8 }
            r17 = r3
            r4 = r21
            r3 = r25
            goto L_0x011f
        L_0x03bd:
            r3 = r25
            r4 = r21
            goto L_0x011f
        L_0x03c3:
            r3 = 0
            r9 = r23
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x04b8 }
            r0.<init>()     // Catch:{ all -> 0x04b8 }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04b8 }
        L_0x03cf:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x04b8 }
            if (r5 == 0) goto L_0x03ef
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.internal.measurement.x2 r5 = (com.google.android.gms.internal.measurement.C9418x2) r5     // Catch:{ all -> 0x04b8 }
            boolean r6 = r5.mo38141K()     // Catch:{ all -> 0x04b8 }
            if (r6 == 0) goto L_0x03ea
            int r5 = r5.mo38142z()     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x04b8 }
            goto L_0x03eb
        L_0x03ea:
            r8 = r3
        L_0x03eb:
            r0.add(r8)     // Catch:{ all -> 0x04b8 }
            goto L_0x03cf
        L_0x03ef:
            com.google.android.gms.common.internal.C4604n.m20094g(r24)     // Catch:{ all -> 0x04b8 }
            r23.mo39090d()     // Catch:{ all -> 0x04b8 }
            r23.mo19272b()     // Catch:{ all -> 0x04b8 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo38987P()     // Catch:{ all -> 0x04b8 }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x049d }
            r4 = 0
            r5[r4] = r2     // Catch:{ SQLiteException -> 0x049d }
            java.lang.String r4 = "select count(1) from audience_filter_values where app_id=?"
            long r4 = r9.m45135I(r4, r5)     // Catch:{ SQLiteException -> 0x049d }
            com.google.android.gms.measurement.internal.h4 r6 = r9.f21269a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.f r6 = r6.mo19392z()     // Catch:{ all -> 0x04b8 }
            r7 = 2000(0x7d0, float:2.803E-42)
            com.google.android.gms.measurement.internal.r2 r8 = com.google.android.gms.measurement.internal.C9903s2.f46656G     // Catch:{ all -> 0x04b8 }
            int r6 = r6.mo19348n(r2, r8)     // Catch:{ all -> 0x04b8 }
            int r6 = java.lang.Math.min(r7, r6)     // Catch:{ all -> 0x04b8 }
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)     // Catch:{ all -> 0x04b8 }
            long r7 = (long) r6     // Catch:{ all -> 0x04b8 }
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x0426
            goto L_0x04b1
        L_0x0426:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x04b8 }
            r4.<init>()     // Catch:{ all -> 0x04b8 }
            r5 = 0
        L_0x042c:
            int r7 = r0.size()     // Catch:{ all -> 0x04b8 }
            if (r5 >= r7) goto L_0x0448
            java.lang.Object r7 = r0.get(r5)     // Catch:{ all -> 0x04b8 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x04b8 }
            if (r7 == 0) goto L_0x04b1
            int r7 = r7.intValue()     // Catch:{ all -> 0x04b8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x04b8 }
            r4.add(r7)     // Catch:{ all -> 0x04b8 }
            int r5 = r5 + 1
            goto L_0x042c
        L_0x0448:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04b8 }
            int r4 = r4.length()     // Catch:{ all -> 0x04b8 }
            r5 = 2
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x04b8 }
            r5.<init>(r4)     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "("
            r5.append(r4)     // Catch:{ all -> 0x04b8 }
            r5.append(r0)     // Catch:{ all -> 0x04b8 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x04b8 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "audience_filter_values"
            int r5 = r0.length()     // Catch:{ all -> 0x04b8 }
            int r5 = r5 + 140
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x04b8 }
            r7.<init>(r5)     // Catch:{ all -> 0x04b8 }
            java.lang.String r5 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r7.append(r5)     // Catch:{ all -> 0x04b8 }
            r7.append(r0)     // Catch:{ all -> 0x04b8 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r7.append(r0)     // Catch:{ all -> 0x04b8 }
            r5 = 2
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x04b8 }
            r5 = 0
            r0[r5] = r2     // Catch:{ all -> 0x04b8 }
            java.lang.String r2 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x04b8 }
            r5 = 1
            r0[r5] = r2     // Catch:{ all -> 0x04b8 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x04b8 }
            r3.delete(r4, r2, r0)     // Catch:{ all -> 0x04b8 }
            goto L_0x04b1
        L_0x049d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r3 = r9.f21269a     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "Database error querying filters. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r24)     // Catch:{ all -> 0x04b8 }
            r3.mo38858c(r4, r2, r0)     // Catch:{ all -> 0x04b8 }
        L_0x04b1:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x04b8 }
            r1.endTransaction()
            return
        L_0x04b8:
            r0 = move-exception
            goto L_0x04bd
        L_0x04ba:
            r0 = move-exception
            r9 = r23
        L_0x04bd:
            r1.endTransaction()
            goto L_0x04c2
        L_0x04c1:
            throw r0
        L_0x04c2:
            goto L_0x04c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9793i.mo39006m(java.lang.String, java.util.List):void");
    }

    /* renamed from: n */
    public final void mo39007n() {
        mo39090d();
        mo38987P().setTransactionSuccessful();
    }

    /* renamed from: o */
    public final void mo39008o(C9885q4 q4Var) {
        C4604n.m20098k(q4Var);
        mo19272b();
        mo39090d();
        String c0 = q4Var.mo39138c0();
        C4604n.m20098k(c0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c0);
        contentValues.put("app_instance_id", q4Var.mo39140d0());
        contentValues.put("gmp_app_id", q4Var.mo39148h0());
        contentValues.put("resettable_device_id_hash", q4Var.mo39133a());
        contentValues.put("last_bundle_index", Long.valueOf(q4Var.mo39130X()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(q4Var.mo39131Y()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(q4Var.mo39129W()));
        contentValues.put("app_version", q4Var.mo39144f0());
        contentValues.put("app_store", q4Var.mo39142e0());
        contentValues.put("gmp_version", Long.valueOf(q4Var.mo39128V()));
        contentValues.put("dev_cert_hash", Long.valueOf(q4Var.mo39125S()));
        contentValues.put("measurement_enabled", Boolean.valueOf(q4Var.mo39115I()));
        contentValues.put("day", Long.valueOf(q4Var.mo39124R()));
        contentValues.put("daily_public_events_count", Long.valueOf(q4Var.mo39122P()));
        contentValues.put("daily_events_count", Long.valueOf(q4Var.mo39121O()));
        contentValues.put("daily_conversions_count", Long.valueOf(q4Var.mo39119M()));
        contentValues.put("config_fetched_time", Long.valueOf(q4Var.mo39118L()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(q4Var.mo39127U()));
        contentValues.put("app_version_int", Long.valueOf(q4Var.mo39117K()));
        contentValues.put("firebase_instance_id", q4Var.mo39146g0());
        contentValues.put("daily_error_events_count", Long.valueOf(q4Var.mo39120N()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(q4Var.mo39123Q()));
        contentValues.put("health_monitor_sample", q4Var.mo39150i0());
        contentValues.put("android_id", Long.valueOf(q4Var.mo39107A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(q4Var.mo39114H()));
        contentValues.put("admob_app_id", q4Var.mo39134a0());
        contentValues.put("dynamite_version", Long.valueOf(q4Var.mo39126T()));
        List b = q4Var.mo39135b();
        if (b != null) {
            if (b.isEmpty()) {
                this.f21269a.mo19276j().mo19287w().mo38857b("Safelisted events should not be an empty list. appId", c0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", b));
            }
        }
        C9226kc.m43158b();
        if (this.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46725y0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase P = mo38987P();
            if (((long) P.update("apps", contentValues, "app_id = ?", new String[]{c0})) == 0 && P.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f21269a.mo19276j().mo19282q().mo38857b("Failed to insert/update app (got -1). appId", C4667d3.m21474z(c0));
            }
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38858c("Error storing app. appId", C4667d3.m21474z(c0), e);
        }
    }

    /* renamed from: p */
    public final void mo39009p(C9859o oVar) {
        C4604n.m20098k(oVar);
        mo19272b();
        mo39090d();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", oVar.f46525a);
        contentValues.put(MediationMetaData.KEY_NAME, oVar.f46526b);
        contentValues.put("lifetime_count", Long.valueOf(oVar.f46527c));
        contentValues.put("current_bundle_count", Long.valueOf(oVar.f46528d));
        contentValues.put("last_fire_timestamp", Long.valueOf(oVar.f46530f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(oVar.f46531g));
        contentValues.put("last_bundled_day", oVar.f46532h);
        contentValues.put("last_sampled_complex_event_id", oVar.f46533i);
        contentValues.put("last_sampling_rate", oVar.f46534j);
        contentValues.put("current_session_count", Long.valueOf(oVar.f46529e));
        Boolean bool = oVar.f46535k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo38987P().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f21269a.mo19276j().mo19282q().mo38857b("Failed to insert/update event aggregates (got -1). appId", C4667d3.m21474z(oVar.f46525a));
            }
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38858c("Error storing event aggregates. appId", C4667d3.m21474z(oVar.f46525a), e);
        }
    }

    /* renamed from: q */
    public final boolean mo39010q() {
        return m45135I("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: s */
    public final boolean mo39011s() {
        return m45135I("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: t */
    public final boolean mo39012t() {
        return m45135I("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo39013u() {
        Context r = this.f21269a.mo19277r();
        this.f21269a.mo19392z();
        return r.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: v */
    public final boolean mo39014v(String str, Long l, long j, C9143f4 f4Var) {
        mo19272b();
        mo39090d();
        C4604n.m20098k(f4Var);
        C4604n.m20094g(str);
        C4604n.m20098k(l);
        byte[] l2 = f4Var.mo37404l();
        this.f21269a.mo19276j().mo19286v().mo38858c("Saving complex main event, appId, data size", this.f21269a.mo19363D().mo39320d(str), Integer.valueOf(l2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", l2);
        try {
            if (mo38987P().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f21269a.mo19276j().mo19282q().mo38857b("Failed to insert complex main event (got -1). appId", C4667d3.m21474z(str));
            return false;
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38858c("Error storing complex main event. appId", C4667d3.m21474z(str), e);
            return false;
        }
    }

    /* renamed from: w */
    public final boolean mo39015w(zzab zzab) {
        C4604n.m20098k(zzab);
        mo19272b();
        mo39090d();
        String str = zzab.f46925b;
        C4604n.m20098k(str);
        if (mo38994X(str, zzab.f46927d.f46942c) == null) {
            long I = m45135I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f21269a.mo19392z();
            if (I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(TtmlNode.ATTR_TTS_ORIGIN, zzab.f46926c);
        contentValues.put(MediationMetaData.KEY_NAME, zzab.f46927d.f46942c);
        m45134H(contentValues, "value", C4604n.m20098k(zzab.f46927d.mo39366C0()));
        contentValues.put("active", Boolean.valueOf(zzab.f46929f));
        contentValues.put("trigger_event_name", zzab.f46930g);
        contentValues.put("trigger_timeout", Long.valueOf(zzab.f46932i));
        contentValues.put("timed_out_event", this.f21269a.mo19372N().mo19312c0(zzab.f46931h));
        contentValues.put("creation_timestamp", Long.valueOf(zzab.f46928e));
        contentValues.put("triggered_event", this.f21269a.mo19372N().mo19312c0(zzab.f46933j));
        contentValues.put("triggered_timestamp", Long.valueOf(zzab.f46927d.f46943d));
        contentValues.put("time_to_live", Long.valueOf(zzab.f46934k));
        contentValues.put("expired_event", this.f21269a.mo19372N().mo19312c0(zzab.f46935l));
        try {
            if (mo38987P().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f21269a.mo19276j().mo19282q().mo38857b("Failed to insert/update conditional user property (got -1)", C4667d3.m21474z(str));
            }
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38858c("Error storing conditional user property", C4667d3.m21474z(str), e);
        }
        return true;
    }

    /* renamed from: x */
    public final boolean mo39016x(C9730b9 b9Var) {
        C4604n.m20098k(b9Var);
        mo19272b();
        mo39090d();
        if (mo38994X(b9Var.f46184a, b9Var.f46186c) == null) {
            if (C4668d9.m21488W(b9Var.f46186c)) {
                if (m45135I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{b9Var.f46184a}) >= ((long) this.f21269a.mo19392z().mo19349o(b9Var.f46184a, C9903s2.f46657H, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(b9Var.f46186c)) {
                long I = m45135I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{b9Var.f46184a, b9Var.f46185b});
                this.f21269a.mo19392z();
                if (I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b9Var.f46184a);
        contentValues.put(TtmlNode.ATTR_TTS_ORIGIN, b9Var.f46185b);
        contentValues.put(MediationMetaData.KEY_NAME, b9Var.f46186c);
        contentValues.put("set_timestamp", Long.valueOf(b9Var.f46187d));
        m45134H(contentValues, "value", b9Var.f46188e);
        try {
            if (mo38987P().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f21269a.mo19276j().mo19282q().mo38857b("Failed to insert/update user property (got -1). appId", C4667d3.m21474z(b9Var.f46184a));
            }
        } catch (SQLiteException e) {
            this.f21269a.mo19276j().mo19282q().mo38858c("Error storing user property. appId", C4667d3.m21474z(b9Var.f46184a), e);
        }
        return true;
    }
}
