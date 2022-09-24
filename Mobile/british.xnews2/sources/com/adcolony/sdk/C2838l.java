package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.C2788h0;
import com.adcolony.sdk.C2978z;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.l */
class C2838l {

    /* renamed from: com.adcolony.sdk.l$a */
    static class C2839a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2788h0 f11520a;

        /* renamed from: b */
        final /* synthetic */ SQLiteDatabase f11521b;

        /* renamed from: c */
        final /* synthetic */ C2840b f11522c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f11523d;

        C2839a(C2788h0 h0Var, SQLiteDatabase sQLiteDatabase, C2840b bVar, CountDownLatch countDownLatch) {
            this.f11520a = h0Var;
            this.f11521b = sQLiteDatabase;
            this.f11522c = bVar;
            this.f11523d = countDownLatch;
        }

        public void run() {
            for (C2788h0.C2789a next : this.f11520a.mo9671a()) {
                for (Map.Entry next2 : next.mo9679f().entrySet()) {
                    C2842c a = C2838l.m9805a((String) next2.getValue(), this.f11521b);
                    if (a != null) {
                        this.f11522c.m9807a(next.mo9678e(), (String) next2.getKey(), a);
                    }
                }
            }
            C2823i0.m9743d().mo9765a(this.f11522c);
            this.f11523d.countDown();
        }
    }

    /* renamed from: com.adcolony.sdk.l$b */
    static class C2840b {

        /* renamed from: a */
        private final int f11524a;

        /* renamed from: b */
        private final Map<String, ArrayList<C2841a>> f11525b;

        /* renamed from: com.adcolony.sdk.l$b$a */
        static class C2841a {

            /* renamed from: a */
            private final String f11526a;

            /* renamed from: b */
            private final C2842c f11527b;

            /* synthetic */ C2841a(String str, C2842c cVar, C2839a aVar) {
                this(str, cVar);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public String mo9803a() {
                return this.f11526a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C2842c mo9804b() {
                return this.f11527b;
            }

            private C2841a(String str, C2842c cVar) {
                this.f11526a = str;
                this.f11527b = cVar;
            }
        }

        /* synthetic */ C2840b(int i, C2839a aVar) {
            this(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo9801b() {
            return this.f11524a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public JSONObject mo9802c() {
            JSONObject b = C2976x.m10319b();
            C2976x.m10323b(b, MediationMetaData.KEY_VERSION, mo9801b());
            for (Map.Entry next : this.f11525b.entrySet()) {
                JSONObject b2 = C2976x.m10319b();
                Iterator it = ((ArrayList) next.getValue()).iterator();
                while (it.hasNext()) {
                    C2841a aVar = (C2841a) it.next();
                    JSONArray a = C2976x.m10301a();
                    for (String put : aVar.mo9804b().mo9808a((Character) ',')) {
                        a.put(put);
                    }
                    C2976x.m10314a(b2, aVar.mo9803a(), a);
                }
                C2976x.m10315a(b, (String) next.getKey(), b2);
            }
            return b;
        }

        private C2840b(int i) {
            this.f11525b = new ConcurrentHashMap();
            this.f11524a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m9807a(String str, String str2, C2842c cVar) {
            ArrayList arrayList;
            C2841a aVar = new C2841a(str2, cVar, (C2839a) null);
            if (!this.f11525b.containsKey(str) || (arrayList = this.f11525b.get(str)) == null) {
                this.f11525b.put(str, new ArrayList(Collections.singletonList(aVar)));
            } else {
                arrayList.add(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Map<String, ArrayList<C2841a>> mo9800a() {
            return this.f11525b;
        }
    }

    /* renamed from: com.adcolony.sdk.l$c */
    static class C2842c {

        /* renamed from: a */
        private final List<C2843a> f11528a = new ArrayList();

        /* renamed from: b */
        private final List<ContentValues> f11529b = new ArrayList();

        /* renamed from: com.adcolony.sdk.l$c$a */
        static class C2843a {

            /* renamed from: a */
            private final int f11530a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final String f11531b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public final int f11532c;

            /* synthetic */ C2843a(int i, String str, int i2, C2839a aVar) {
                this(i, str, i2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public int mo9814c() {
                return this.f11532c;
            }

            private C2843a(int i, String str, int i2) {
                this.f11530a = i;
                this.f11531b = str;
                this.f11532c = i2;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo9812a() {
                return this.f11530a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public String mo9813b() {
                return this.f11531b;
            }
        }

        C2842c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo9809b(int i) {
            if (i < 0 || i >= this.f11528a.size()) {
                return -1;
            }
            return this.f11528a.get(i).mo9814c();
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                str = "\n";
                if (i >= this.f11528a.size()) {
                    break;
                }
                sb.append(this.f11528a.get(i).f11531b);
                if (i != this.f11528a.size() - 1) {
                    str = " | ";
                }
                sb.append(str);
                i++;
            }
            for (ContentValues next : this.f11529b) {
                for (int i2 = 0; i2 < this.f11528a.size(); i2++) {
                    sb.append(next.getAsString(mo9805a(i2)));
                    if (i2 == this.f11528a.size() - 1) {
                        str2 = str;
                    } else {
                        str2 = " | ";
                    }
                    sb.append(str2);
                }
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public List<ContentValues> mo9810b() {
            return this.f11529b;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m9813a(int i, String str, int i2) {
            this.f11528a.add(new C2843a(i, str, i2, (C2839a) null));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo9805a(int i) {
            if (i < 0 || i >= this.f11528a.size()) {
                return null;
            }
            return this.f11528a.get(i).mo9813b();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m9814a(Cursor cursor) {
            ContentValues contentValues = new ContentValues();
            for (C2843a next : this.f11528a) {
                int a = next.f11532c;
                if (a == 1) {
                    contentValues.put(next.mo9813b(), Long.valueOf(cursor.getLong(next.mo9812a())));
                } else if (a == 2) {
                    contentValues.put(next.mo9813b(), Double.valueOf(cursor.getDouble(next.mo9812a())));
                } else if (a != 4) {
                    contentValues.put(next.mo9813b(), cursor.getString(next.mo9812a()));
                } else {
                    contentValues.put(next.mo9813b(), cursor.getBlob(next.mo9812a()));
                }
            }
            this.f11529b.add(contentValues);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo9806a(int i, Character ch) {
            if (i < 0 || i >= this.f11529b.size()) {
                return null;
            }
            ContentValues contentValues = this.f11529b.get(i);
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (i2 < this.f11528a.size()) {
                if (mo9809b(i2) == 3) {
                    sb.append("\"");
                    sb.append(contentValues.get(mo9805a(i2)));
                    sb.append("\"");
                } else {
                    sb.append(contentValues.getAsString(mo9805a(i2)));
                }
                sb.append(i2 == this.f11528a.size() + -1 ? "" : ch);
                i2++;
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<String> mo9808a(Character ch) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f11529b.size(); i++) {
                arrayList.add(mo9806a(i, ch));
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C2843a> mo9807a() {
            return this.f11528a;
        }
    }

    C2838l() {
    }

    /* renamed from: a */
    static C2840b m9803a(C2788h0 h0Var, SQLiteDatabase sQLiteDatabase, Executor executor) {
        return m9804a(h0Var, sQLiteDatabase, executor, -1);
    }

    /* renamed from: a */
    static C2840b m9804a(C2788h0 h0Var, SQLiteDatabase sQLiteDatabase, Executor executor, long j) {
        C2840b bVar = new C2840b(h0Var.mo9672b(), (C2839a) null);
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            executor.execute(new C2839a(h0Var, sQLiteDatabase, bVar, countDownLatch));
            if (j > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException | RejectedExecutionException e) {
            C2978z.C2979a aVar = new C2978z.C2979a();
            aVar.mo10088a("ADCDbReader.calculateFeatureVectors failed with: " + e.toString()).mo10090a(C2978z.f11950j);
        }
        return bVar;
    }

    /* renamed from: a */
    static C2842c m9805a(String str, SQLiteDatabase sQLiteDatabase) {
        C2842c cVar;
        Throwable th;
        C2842c cVar2 = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(str, (String[]) null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst()) {
                        cVar = new C2842c();
                        int i = 0;
                        while (i < rawQuery.getColumnCount()) {
                            try {
                                cVar.m9813a(i, rawQuery.getColumnName(i), rawQuery.getType(i));
                                i++;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (SQLException e) {
                                    e = e;
                                    cVar2 = cVar;
                                    e.printStackTrace();
                                    return cVar2;
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                            }
                        }
                        do {
                            cVar.m9814a(rawQuery);
                        } while (rawQuery.moveToNext());
                        cVar2 = cVar;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cVar = null;
                    throw th;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (SQLException e2) {
            e = e2;
        }
        return cVar2;
        throw th;
    }
}
