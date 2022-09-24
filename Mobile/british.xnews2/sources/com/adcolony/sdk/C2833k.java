package com.adcolony.sdk;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.adcolony.sdk.C2788h0;
import com.adcolony.sdk.C2978z;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.C7408m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.adcolony.sdk.k */
class C2833k {

    /* renamed from: c */
    static final String f11506c = "manager_tmp_table";

    /* renamed from: a */
    private final SQLiteDatabase f11507a;

    /* renamed from: b */
    private final C2788h0 f11508b;

    /* renamed from: com.adcolony.sdk.k$b */
    static class C2835b {

        /* renamed from: a */
        static final int f11516a = 2;

        /* renamed from: b */
        static final int f11517b = 1;

        C2835b() {
        }
    }

    C2833k(SQLiteDatabase sQLiteDatabase, C2788h0 h0Var) {
        this.f11507a = sQLiteDatabase;
        this.f11508b = h0Var;
    }

    /* renamed from: a */
    private void m9776a(C2788h0.C2789a aVar, List<String> list) {
        m9778a(aVar.mo9681h(), f11506c);
        m9783c(aVar);
        m9779a(f11506c, aVar.mo9681h(), list);
        m9782b(f11506c);
    }

    /* renamed from: c */
    private void m9784c(C2788h0.C2792c cVar, String str) {
        ArrayList<String[]> c = mo9786c(cVar.mo9687b());
        boolean z = true;
        if (cVar.mo9686a().length == c.size()) {
            boolean z2 = false;
            for (int i = 0; i < cVar.mo9686a().length; i++) {
                if (!C7408m.m30028a(cVar.mo9686a()[i], c.get(i)[2])) {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (z) {
            m9777a(cVar.mo9687b());
            m9781b(cVar, str);
        }
    }

    /* renamed from: d */
    private void m9785d(C2788h0.C2789a aVar) {
        List<C2788h0.C2792c> c = aVar.mo9676c();
        ArrayList<String> d = mo9787d(aVar.mo9681h());
        for (C2788h0.C2792c next : c) {
            if (d.contains(next.mo9687b())) {
                m9784c(next, aVar.mo9681h());
            } else {
                m9781b(next, aVar.mo9681h());
            }
            d.remove(next.mo9687b());
        }
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            m9777a(it.next());
        }
    }

    /* renamed from: e */
    private void m9786e(C2788h0.C2789a aVar) {
        boolean z;
        boolean z2;
        ArrayList<C2834a> g = mo9790g(aVar.mo9681h());
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        boolean z4 = false;
        for (C2788h0.C2790b next : aVar.mo9674a()) {
            int size = g.size() - 1;
            while (true) {
                if (size < 0) {
                    z = false;
                    z2 = false;
                    break;
                }
                C2834a aVar2 = g.get(size);
                if (C7408m.m30028a(aVar2.mo9793b(), next.mo9684b())) {
                    arrayList.add(next.mo9684b());
                    z = aVar2.mo9792a(next);
                    g.remove(size);
                    z2 = true;
                    break;
                }
                size--;
            }
            if (!z2 || !z) {
                z4 = true;
            }
        }
        if (g.size() <= 0) {
            z3 = z4;
        }
        if (z3) {
            m9776a(aVar, (List<String>) arrayList);
            m9780b(aVar);
            return;
        }
        m9785d(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9785b() {
        int version = this.f11507a.getVersion();
        this.f11507a.beginTransaction();
        boolean z = false;
        try {
            List<C2788h0.C2789a> a = this.f11508b.mo9671a();
            ArrayList<String> a2 = mo9784a();
            for (C2788h0.C2789a next : a) {
                if (a2.contains(next.mo9681h())) {
                    m9786e(next);
                } else {
                    m9783c(next);
                    m9780b(next);
                }
                a2.remove(next.mo9681h());
            }
            Iterator<String> it = a2.iterator();
            while (it.hasNext()) {
                m9782b(it.next());
            }
            this.f11507a.setVersion(this.f11508b.mo9672b());
            this.f11507a.setTransactionSuccessful();
            z = true;
            new C2978z.C2979a().mo10088a("Success upgrading database from ").mo10086a(version).mo10088a(" to ").mo10086a(this.f11508b.mo9672b()).mo10090a(C2978z.f11946f);
        } catch (SQLException e) {
            new C2978z.C2979a().mo10088a("Upgrading database from ").mo10086a(version).mo10088a(" to ").mo10086a(this.f11508b.mo9672b()).mo10088a("caused: ").mo10088a(e.toString()).mo10090a(C2978z.f11948h);
        } catch (Throwable th) {
            this.f11507a.endTransaction();
            throw th;
        }
        this.f11507a.endTransaction();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ArrayList<String> mo9789f(String str) {
        SQLiteDatabase sQLiteDatabase = this.f11507a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master  WHERE type='" + str + "' ORDER BY name", (String[]) null);
        ArrayList<String> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            arrayList.add(rawQuery.getString(0));
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ArrayList<C2834a> mo9790g(String str) {
        ArrayList<C2834a> arrayList = new ArrayList<>();
        Iterator<String[]> it = mo9788e("PRAGMA table_info(" + str + ")").iterator();
        while (it.hasNext()) {
            C2834a a = C2834a.m9794a(it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: com.adcolony.sdk.k$a */
    static class C2834a {

        /* renamed from: d */
        private static final int f11509d = 1;

        /* renamed from: e */
        private static final int f11510e = 2;

        /* renamed from: f */
        private static final int f11511f = 4;

        /* renamed from: g */
        private static final int f11512g = 5;

        /* renamed from: a */
        private final String f11513a;

        /* renamed from: b */
        private final String f11514b;

        /* renamed from: c */
        private final String f11515c;

        private C2834a(String[] strArr) {
            this.f11513a = strArr[1];
            this.f11514b = strArr[2];
            this.f11515c = strArr[4];
        }

        /* renamed from: a */
        static C2834a m9794a(String[] strArr) {
            if (strArr.length >= 5) {
                return new C2834a(strArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo9793b() {
            return this.f11513a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo9794c() {
            return this.f11514b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9792a(C2788h0.C2790b bVar) {
            return C7408m.m30028a(this.f11513a, bVar.mo9684b()) && C7408m.m30028a(this.f11514b, bVar.mo9685c()) && C7408m.m30028a(this.f11515c, bVar.mo9683a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo9791a() {
            return this.f11515c;
        }
    }

    /* renamed from: a */
    private void m9777a(String str) {
        SQLiteDatabase sQLiteDatabase = this.f11507a;
        sQLiteDatabase.execSQL("DROP INDEX " + str);
    }

    /* renamed from: a */
    private String m9774a(C2788h0.C2789a aVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ");
        sb.append(aVar.mo9681h());
        sb.append(" (");
        for (int i = 0; i < aVar.mo9674a().size(); i++) {
            C2788h0.C2790b bVar = aVar.mo9674a().get(i);
            sb.append(bVar.mo9684b());
            sb.append(" ");
            sb.append(bVar.mo9685c());
            if (bVar.mo9683a() != null) {
                if (bVar.mo9683a() instanceof Boolean) {
                    str = ((Boolean) bVar.mo9683a()).booleanValue() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION;
                } else if (bVar.mo9683a() instanceof String) {
                    str = "'" + bVar.mo9683a() + "'";
                } else {
                    str = bVar.mo9683a().toString();
                }
                sb.append(" DEFAULT ");
                sb.append(str);
            }
            if (i < aVar.mo9674a().size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: c */
    private void m9783c(C2788h0.C2789a aVar) {
        this.f11507a.execSQL(m9774a(aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<String[]> mo9786c(String str) {
        return mo9788e("PRAGMA index_info(" + str + ")");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ArrayList<String> mo9787d(String str) {
        ArrayList<String[]> e = mo9788e("PRAGMA index_list(" + str + ")");
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String[]> it = e.iterator();
        while (it.hasNext()) {
            String[] next = it.next();
            if (next.length >= 3) {
                arrayList.add(next[1]);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ArrayList<String[]> mo9788e(String str) {
        Cursor rawQuery = this.f11507a.rawQuery(str, (String[]) null);
        ArrayList<String[]> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            int columnCount = rawQuery.getColumnCount();
            String[] strArr = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                strArr[i] = rawQuery.getString(i);
            }
            arrayList.add(strArr);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: a */
    private String m9775a(C2788h0.C2792c cVar, String str) {
        String join = TextUtils.join(", ", cVar.mo9686a());
        return "CREATE INDEX " + cVar.mo9687b() + " ON " + str + "(" + join + ")";
    }

    /* renamed from: a */
    private void m9778a(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.f11507a;
        sQLiteDatabase.execSQL("ALTER TABLE " + str + " RENAME TO " + str2);
    }

    /* renamed from: a */
    private void m9779a(String str, String str2, List<String> list) {
        String join = TextUtils.join(", ", list);
        SQLiteDatabase sQLiteDatabase = this.f11507a;
        sQLiteDatabase.execSQL("INSERT INTO " + str2 + " (" + join + ") SELECT " + join + " FROM " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo9784a() {
        ArrayList<String> f = mo9789f("table");
        for (int size = f.size() - 1; size >= 0; size--) {
            String str = f.get(size);
            if (str.startsWith("android_") || str.startsWith("sqlite_")) {
                f.remove(size);
            }
        }
        return f;
    }

    /* renamed from: b */
    private void m9780b(C2788h0.C2789a aVar) {
        for (C2788h0.C2792c b : aVar.mo9676c()) {
            m9781b(b, aVar.mo9681h());
        }
    }

    /* renamed from: b */
    private void m9781b(C2788h0.C2792c cVar, String str) {
        this.f11507a.execSQL(m9775a(cVar, str));
    }

    /* renamed from: b */
    private void m9782b(String str) {
        SQLiteDatabase sQLiteDatabase = this.f11507a;
        sQLiteDatabase.execSQL("DROP TABLE " + str);
    }
}
