package com.startapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONTokener;

/* renamed from: com.startapp.g4 */
/* compiled from: Sta */
public class C11919g4 extends C11977j2 {

    /* renamed from: d */
    public static final String[] f52979d = {"rowid", "timestamp", "sdkVersion", "category", "appActivity", "value", "details", "detailsJson", "dParam", "service", "tag"};

    /* renamed from: c */
    public final List<C12462z2<Void>> f52980c = new LinkedList();

    public C11919g4(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public final boolean mo45376a(C5004d4 d4Var, C11936h4 h4Var, SQLiteDatabase sQLiteDatabase, Map<String, String> map, long j) {
        C5004d4 d4Var2 = d4Var;
        C11936h4 h4Var2 = h4Var;
        Map<String, String> map2 = map;
        if (h4Var2.f53024a.size() > 0 && !h4Var2.f53024a.contains(d4Var2.f22126d)) {
            return false;
        }
        if (h4Var2.f53025b.size() > 0 && h4Var2.f53025b.contains(d4Var2.f22126d)) {
            return false;
        }
        if (h4Var2.f53026c.size() > 0 && !h4Var2.f53026c.contains(d4Var2.f22131i)) {
            return false;
        }
        if (h4Var2.f53027d.size() > 0 && h4Var2.f53027d.contains(d4Var2.f22131i)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2.containsKey("sdkVersion")) {
            linkedHashMap.put("sdkVersion", map2.get("sdkVersion"));
        }
        if (map2.containsKey("category")) {
            linkedHashMap.put("category", map2.get("category"));
        }
        for (String next : h4Var2.f53028e) {
            if (map2.containsKey(next)) {
                linkedHashMap.put(next, map2.get(next));
            }
        }
        int size = linkedHashMap.size();
        if (size >= 1) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList(size);
            String str = "";
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                sb.append(str);
                sb.append((String) entry.getKey());
                if (entry.getValue() == null) {
                    sb.append(" IS NULL");
                } else {
                    sb.append(" = ?");
                    arrayList.add(entry.getValue());
                }
                str = " AND ";
            }
            Pair pair = new Pair(sb.toString(), arrayList.toArray(new String[0]));
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.query("events", new String[]{"sendSuccess"}, (String) pair.first, (String[]) pair.second, (String) null, (String) null, "sendSuccess DESC");
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    if (j2 <= 0) {
                        return true;
                    }
                    long j3 = j - j2;
                    long j4 = h4Var2.f53029f;
                    if (j4 > 0 && j3 < j4) {
                        m52335a(cursor);
                        return true;
                    }
                }
                m52335a(cursor);
                return false;
            } finally {
                m52335a(cursor);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public final synchronized void mo45377b() {
        for (C12462z2<Void> call : this.f52980c) {
            call.call();
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events ( timestamp INTEGER NOT NULL, validTill INTEGER NOT NULL, sdkVersion TEXT NOT NULL, category TEXT NOT NULL, appActivity TEXT, value TEXT, details TEXT, detailsJson TEXT, dParam TEXT, service INTEGER NOT NULL DEFAULT 0, tag TEXT, priority INTEGER NOT NULL, attempt INTEGER NOT NULL DEFAULT 0, send INTEGER NOT NULL DEFAULT 0, sendFailure INTEGER NOT NULL DEFAULT 0, sendSuccess INTEGER NOT NULL DEFAULT 0, CHECK (attempt >= 0), CHECK (send >= 0), CHECK (sendFailure >= 0), CHECK (sendSuccess >= 0));");
    }

    /* renamed from: b */
    public static C5004d4 m52336b(Cursor cursor) {
        boolean z = false;
        long j = cursor.getLong(0);
        long j2 = cursor.getLong(1);
        m52334a(j, j2);
        String string = cursor.getString(2);
        C11882e4 a = C11882e4.m52266a(cursor.getString(3));
        String string2 = cursor.getString(4);
        String string3 = cursor.getString(5);
        String string4 = cursor.getString(6);
        String string5 = cursor.getString(7);
        String string6 = cursor.getString(8);
        if (cursor.getInt(9) == 1) {
            z = true;
        }
        String string7 = cursor.getString(10);
        if (string == null || string.trim().length() < 1) {
            throw new IllegalArgumentException();
        } else if (a != null) {
            Object obj = null;
            if (string5 != null) {
                try {
                    obj = new JSONTokener(string5).nextValue();
                } catch (JSONException unused) {
                }
            }
            C5004d4 d4Var = new C5004d4(a, j);
            d4Var.f22130h = Long.valueOf(j2);
            d4Var.f22125c = string;
            d4Var.f22131i = string2;
            d4Var.f22126d = string3;
            d4Var.f22127e = string4;
            d4Var.f22128f = obj;
            d4Var.f22129g = string6;
            d4Var.f22132j = z;
            d4Var.f22133k = string7;
            return d4Var;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo45374a(C12442y2<C5004d4, Void> y2Var, int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor cursor = null;
        try {
            cursor = mo45465a().query("events", f52979d, "attempt < " + i + " AND " + "validTill" + " >= " + currentTimeMillis + " AND " + "sendSuccess" + " = 0  AND " + "send" + " <= " + "sendFailure", (String[]) null, (String) null, (String) null, "priority DESC, timestamp ASC", String.valueOf(Math.max(1, i2)));
            while (cursor.moveToNext()) {
                y2Var.mo45478a(m52336b(cursor));
            }
        } finally {
            m52335a(cursor);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.lang.String[], java.lang.String] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* renamed from: a */
    public boolean mo45375a(C5004d4 d4Var, C11899f4 f4Var) {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ? r14;
        String str7;
        String str8;
        C5004d4 d4Var2 = d4Var;
        C11899f4 f4Var2 = f4Var;
        SQLiteDatabase a = mo45465a();
        a.beginTransaction();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis + f4Var2.f52938e;
            Long l = d4Var2.f22130h;
            if (l != null) {
                j = l.longValue();
            } else {
                d4Var2.f22130h = Long.valueOf(currentTimeMillis);
                j = currentTimeMillis;
            }
            Object obj = d4Var2.f22128f;
            String obj2 = obj != null ? obj.toString() : null;
            String str9 = d4Var2.f22125c;
            if (str9 == null) {
                str9 = "4.10.2";
            }
            String str10 = str9;
            List<C11936h4> list = f4Var2.f52940g;
            String str11 = "service";
            String str12 = "dParam";
            String str13 = "detailsJson";
            long j3 = j2;
            String str14 = "details";
            String str15 = "value";
            long j4 = j;
            String str16 = "events";
            String str17 = "sdkVersion";
            if (list.size() > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put(str17, str10);
                String str18 = str10;
                hashMap.put("category", d4Var2.f22123a.f52899a);
                hashMap.put("appActivity", d4Var2.f22131i);
                hashMap.put(str15, d4Var2.f22126d);
                hashMap.put(str14, d4Var2.f22127e);
                hashMap.put(str13, obj2);
                hashMap.put(str12, d4Var2.f22129g);
                hashMap.put(str11, d4Var2.f22132j ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION);
                for (C11936h4 a2 : list) {
                    HashMap hashMap2 = hashMap;
                    String str19 = str12;
                    String str20 = str11;
                    String str21 = str13;
                    String str22 = str18;
                    String str23 = obj2;
                    String str24 = str14;
                    String str25 = str15;
                    String str26 = str17;
                    if (mo45376a(d4Var, a2, a, hashMap2, currentTimeMillis)) {
                        a.endTransaction();
                        return false;
                    }
                    str17 = str26;
                    str14 = str24;
                    str15 = str25;
                    hashMap = hashMap2;
                    str12 = str19;
                    str11 = str20;
                    obj2 = str23;
                    str18 = str22;
                    str13 = str21;
                }
                str4 = str12;
                str2 = str11;
                str = obj2;
                str3 = str13;
                str6 = str14;
                str8 = str18;
                str7 = str17;
                str5 = str15;
                r14 = 0;
            } else {
                str4 = str12;
                str2 = str11;
                str = obj2;
                str3 = str13;
                str6 = str14;
                str5 = str15;
                r14 = 0;
                str8 = str10;
                str7 = str17;
            }
            String str27 = str16;
            a.delete(str27, "validTill < " + currentTimeMillis, r14);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(j4));
            contentValues.put("validTill", Long.valueOf(j3));
            contentValues.put(str7, str8);
            contentValues.put("category", d4Var2.f22123a.f52899a);
            contentValues.put("appActivity", d4Var2.f22131i);
            contentValues.put(str5, d4Var2.f22126d);
            contentValues.put(str6, d4Var2.f22127e);
            contentValues.put(str3, str);
            contentValues.put(str4, d4Var2.f22129g);
            contentValues.put(str2, Integer.valueOf(d4Var2.f22132j ? 1 : 0));
            contentValues.put("tag", d4Var2.f22133k);
            contentValues.put("priority", Integer.valueOf(f4Var.f52936c));
            a.insertOrThrow(str27, r14, contentValues);
            a.setTransactionSuccessful();
            a.endTransaction();
            mo45377b();
            return true;
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m52334a(long j, long j2) {
        if (j <= 0) {
            throw new IllegalArgumentException();
        } else if (j2 <= 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static int m52333a(SQLiteDatabase sQLiteDatabase, long j) {
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            cursor = sQLiteDatabase2.query("events", new String[]{"attempt"}, "rowid = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, (String) null);
            if (cursor.moveToFirst()) {
                return cursor.getInt(0);
            }
            throw new IllegalStateException();
        } finally {
            m52335a(cursor);
        }
    }

    /* renamed from: a */
    public static void m52335a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }
}
