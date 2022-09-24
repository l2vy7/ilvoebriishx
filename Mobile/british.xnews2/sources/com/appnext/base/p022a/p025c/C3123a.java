package com.appnext.base.p022a.p025c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import com.appnext.base.C3117a;
import com.appnext.base.p022a.p023a.C3119a;
import com.appnext.base.p022a.p024b.C3122a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.appnext.base.a.c.a */
public abstract class C3123a<MODEL extends C3122a> {

    /* renamed from: com.appnext.base.a.c.a$a */
    protected enum C3124a {
        Equals(" = ? "),
        GreaterThan(" >= ? "),
        LessThan(" <= ? ");
        
        private String mOperator;

        private C3124a(String str) {
            this.mOperator = str;
        }

        /* renamed from: P */
        public final String mo10547P() {
            return this.mOperator;
        }
    }

    /* renamed from: a */
    protected static long m10560a(String str, ContentValues contentValues) {
        try {
            long insert = C3119a.m10555L().mo10538M().insert(str, (String) null, contentValues);
            C3119a.m10555L().mo10539N();
            return insert;
        } catch (SQLiteFullException e) {
            C3119a.m10555L();
            C3119a.m10556a(C3119a.C3121a.DatabaseOrDiskFull, new Exception(e));
            return -1;
        } catch (Throwable th) {
            C3119a.m10555L();
            C3119a.m10556a(C3119a.C3121a.Global, th);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public abstract String[] mo10540O();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract MODEL mo10544b(Cursor cursor);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo10545i(String str) {
        mo10541a(str, (String[]) null, (String[]) null, (List<C3124a>) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final List<MODEL> mo10546j(String str) {
        try {
            List<MODEL> a = m10563a(C3119a.m10555L().mo10538M().query(str, mo10540O(), (String) null, (String[]) null, (String) null, (String) null, (String) null));
            C3119a.m10555L().mo10539N();
            return a;
        } catch (Throwable th) {
            C3117a.m10553a("DatabaseRepo$fetch", th);
            return null;
        }
    }

    /* renamed from: a */
    protected static long m10559a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        try {
            return sQLiteDatabase.insertWithOnConflict(str, (String) null, contentValues, 5);
        } catch (SQLiteFullException e) {
            C3119a.m10555L();
            C3119a.m10556a(C3119a.C3121a.DatabaseOrDiskFull, new Exception(e));
            C3117a.m10553a("DatabaseRepo$upsert", e);
            return -1;
        } catch (Throwable th) {
            C3119a.m10555L();
            C3119a.m10556a(C3119a.C3121a.Global, th);
            C3117a.m10553a("DatabaseRepo$upsert", th);
            return -1;
        }
    }

    /* renamed from: a */
    private static ContentValues m10561a(JSONObject jSONObject) {
        try {
            ContentValues contentValues = new ContentValues();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                contentValues.put(next, jSONObject.getString(next));
            }
            return contentValues;
        } catch (Throwable th) {
            C3117a.m10553a("DatabaseRepo$covertJsonModelToContentValue", th);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r2 == null) goto L_0x004b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo10542a(java.lang.String r7, org.json.JSONArray r8) {
        /*
            r6 = this;
            r0 = -1
            if (r8 == 0) goto L_0x004b
            r2 = 0
            int r3 = r8.length()     // Catch:{ all -> 0x0034 }
            com.appnext.base.a.a.a r4 = com.appnext.base.p022a.p023a.C3119a.m10555L()     // Catch:{ all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r2 = r4.mo10538M()     // Catch:{ all -> 0x0034 }
            r2.beginTransaction()     // Catch:{ all -> 0x0034 }
            r4 = 0
        L_0x0015:
            if (r4 >= r3) goto L_0x0026
            org.json.JSONObject r5 = r8.getJSONObject(r4)     // Catch:{ all -> 0x0034 }
            android.content.ContentValues r5 = m10561a((org.json.JSONObject) r5)     // Catch:{ all -> 0x0034 }
            long r0 = m10559a(r2, r7, r5)     // Catch:{ all -> 0x0034 }
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0026:
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0034 }
        L_0x0029:
            r2.endTransaction()
            com.appnext.base.a.a.a r7 = com.appnext.base.p022a.p023a.C3119a.m10555L()
            r7.mo10539N()
            goto L_0x004b
        L_0x0034:
            r7 = move-exception
            java.lang.String r8 = "DatabaseRepo$upsert"
            com.appnext.base.C3117a.m10553a(r8, r7)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x004b
            goto L_0x0029
        L_0x003d:
            r7 = move-exception
            if (r2 == 0) goto L_0x004a
            r2.endTransaction()
            com.appnext.base.a.a.a r8 = com.appnext.base.p022a.p023a.C3119a.m10555L()
            r8.mo10539N()
        L_0x004a:
            throw r7
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p022a.p025c.C3123a.mo10542a(java.lang.String, org.json.JSONArray):long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10541a(String str, String[] strArr, String[] strArr2, List<C3124a> list) {
        try {
            SQLiteDatabase M = C3119a.m10555L().mo10538M();
            String str2 = null;
            if (strArr != null) {
                str2 = m10562a(strArr, list);
            }
            int delete = M.delete(str, str2, strArr2);
            C3119a.m10555L().mo10539N();
            return delete;
        } catch (SQLiteFullException e) {
            C3119a.m10555L();
            C3119a.m10556a(C3119a.C3121a.DatabaseOrDiskFull, new Exception(e));
            C3117a.m10553a("DatabaseRepo$delete", e);
            return 0;
        } catch (Throwable th) {
            C3119a.m10555L();
            C3119a.m10556a(C3119a.C3121a.Global, new Exception(th));
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<MODEL> mo10543a(String str, String[] strArr, String[] strArr2, String str2, List<C3124a> list) {
        try {
            List<MODEL> a = m10563a(C3119a.m10555L().mo10538M().query(str, mo10540O(), m10562a(strArr, list), strArr2, (String) null, (String) null, str2));
            C3119a.m10555L().mo10539N();
            return a;
        } catch (Throwable th) {
            C3117a.m10553a("DatabaseRepo$fetch", th);
            return null;
        }
    }

    /* renamed from: a */
    private List<MODEL> m10563a(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        try {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                arrayList.add(mo10544b(cursor));
                cursor.moveToNext();
            }
            cursor.close();
        } catch (Throwable th) {
            C3117a.m10553a("DatabaseRepo$completeFetch", th);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m10562a(String[] strArr, List<C3124a> list) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append(" AND ");
                }
                sb.append(strArr[i]);
                sb.append(list.get(i).mo10547P());
            }
        } catch (Throwable th) {
            C3117a.m10553a("DatabaseRepo$createQuerySelection", th);
        }
        return sb.toString();
    }
}
