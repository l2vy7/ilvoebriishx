package p085h1;

import android.database.Cursor;
import android.os.Build;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p090i1.C5436b;

/* renamed from: h1.g */
/* compiled from: TableInfo */
public class C5376g {

    /* renamed from: a */
    public final String f23645a;

    /* renamed from: b */
    public final Map<String, C5377a> f23646b;

    /* renamed from: c */
    public final Set<C5378b> f23647c;

    /* renamed from: d */
    public final Set<C5380d> f23648d;

    /* renamed from: h1.g$a */
    /* compiled from: TableInfo */
    public static class C5377a {

        /* renamed from: a */
        public final String f23649a;

        /* renamed from: b */
        public final String f23650b;

        /* renamed from: c */
        public final int f23651c;

        /* renamed from: d */
        public final boolean f23652d;

        /* renamed from: e */
        public final int f23653e;

        /* renamed from: f */
        public final String f23654f;

        /* renamed from: g */
        private final int f23655g;

        public C5377a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f23649a = str;
            this.f23650b = str2;
            this.f23652d = z;
            this.f23653e = i;
            this.f23651c = m24204a(str2);
            this.f23654f = str3;
            this.f23655g = i2;
        }

        /* renamed from: a */
        private static int m24204a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains(AdPreferences.TYPE_TEXT)) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        /* renamed from: b */
        public boolean mo21787b() {
            return this.f23653e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5377a aVar = (C5377a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f23653e != aVar.f23653e) {
                    return false;
                }
            } else if (mo21787b() != aVar.mo21787b()) {
                return false;
            }
            if (!this.f23649a.equals(aVar.f23649a) || this.f23652d != aVar.f23652d) {
                return false;
            }
            if (this.f23655g == 1 && aVar.f23655g == 2 && (str3 = this.f23654f) != null && !str3.equals(aVar.f23654f)) {
                return false;
            }
            if (this.f23655g == 2 && aVar.f23655g == 1 && (str2 = aVar.f23654f) != null && !str2.equals(this.f23654f)) {
                return false;
            }
            int i = this.f23655g;
            if ((i == 0 || i != aVar.f23655g || ((str = this.f23654f) == null ? aVar.f23654f == null : str.equals(aVar.f23654f))) && this.f23651c == aVar.f23651c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f23649a.hashCode() * 31) + this.f23651c) * 31) + (this.f23652d ? 1231 : 1237)) * 31) + this.f23653e;
        }

        public String toString() {
            return "Column{name='" + this.f23649a + '\'' + ", type='" + this.f23650b + '\'' + ", affinity='" + this.f23651c + '\'' + ", notNull=" + this.f23652d + ", primaryKeyPosition=" + this.f23653e + ", defaultValue='" + this.f23654f + '\'' + '}';
        }
    }

    /* renamed from: h1.g$b */
    /* compiled from: TableInfo */
    public static class C5378b {

        /* renamed from: a */
        public final String f23656a;

        /* renamed from: b */
        public final String f23657b;

        /* renamed from: c */
        public final String f23658c;

        /* renamed from: d */
        public final List<String> f23659d;

        /* renamed from: e */
        public final List<String> f23660e;

        public C5378b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f23656a = str;
            this.f23657b = str2;
            this.f23658c = str3;
            this.f23659d = Collections.unmodifiableList(list);
            this.f23660e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5378b bVar = (C5378b) obj;
            if (this.f23656a.equals(bVar.f23656a) && this.f23657b.equals(bVar.f23657b) && this.f23658c.equals(bVar.f23658c) && this.f23659d.equals(bVar.f23659d)) {
                return this.f23660e.equals(bVar.f23660e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f23656a.hashCode() * 31) + this.f23657b.hashCode()) * 31) + this.f23658c.hashCode()) * 31) + this.f23659d.hashCode()) * 31) + this.f23660e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f23656a + '\'' + ", onDelete='" + this.f23657b + '\'' + ", onUpdate='" + this.f23658c + '\'' + ", columnNames=" + this.f23659d + ", referenceColumnNames=" + this.f23660e + '}';
        }
    }

    /* renamed from: h1.g$c */
    /* compiled from: TableInfo */
    static class C5379c implements Comparable<C5379c> {

        /* renamed from: b */
        final int f23661b;

        /* renamed from: c */
        final int f23662c;

        /* renamed from: d */
        final String f23663d;

        /* renamed from: e */
        final String f23664e;

        C5379c(int i, int i2, String str, String str2) {
            this.f23661b = i;
            this.f23662c = i2;
            this.f23663d = str;
            this.f23664e = str2;
        }

        /* renamed from: a */
        public int compareTo(C5379c cVar) {
            int i = this.f23661b - cVar.f23661b;
            return i == 0 ? this.f23662c - cVar.f23662c : i;
        }
    }

    /* renamed from: h1.g$d */
    /* compiled from: TableInfo */
    public static class C5380d {

        /* renamed from: a */
        public final String f23665a;

        /* renamed from: b */
        public final boolean f23666b;

        /* renamed from: c */
        public final List<String> f23667c;

        public C5380d(String str, boolean z, List<String> list) {
            this.f23665a = str;
            this.f23666b = z;
            this.f23667c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5380d dVar = (C5380d) obj;
            if (this.f23666b != dVar.f23666b || !this.f23667c.equals(dVar.f23667c)) {
                return false;
            }
            if (this.f23665a.startsWith("index_")) {
                return dVar.f23665a.startsWith("index_");
            }
            return this.f23665a.equals(dVar.f23665a);
        }

        public int hashCode() {
            int i;
            if (this.f23665a.startsWith("index_")) {
                i = -1184239155;
            } else {
                i = this.f23665a.hashCode();
            }
            return (((i * 31) + (this.f23666b ? 1 : 0)) * 31) + this.f23667c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f23665a + '\'' + ", unique=" + this.f23666b + ", columns=" + this.f23667c + '}';
        }
    }

    public C5376g(String str, Map<String, C5377a> map, Set<C5378b> set, Set<C5380d> set2) {
        Set<C5380d> set3;
        this.f23645a = str;
        this.f23646b = Collections.unmodifiableMap(map);
        this.f23647c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f23648d = set3;
    }

    /* renamed from: a */
    public static C5376g m24198a(C5436b bVar, String str) {
        return new C5376g(str, m24199b(bVar, str), m24201d(bVar, str), m24203f(bVar, str));
    }

    /* renamed from: b */
    private static Map<String, C5377a> m24199b(C5436b bVar, String str) {
        Cursor V = bVar.mo21895V("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (V.getColumnCount() > 0) {
                int columnIndex = V.getColumnIndex(MediationMetaData.KEY_NAME);
                int columnIndex2 = V.getColumnIndex(SessionDescription.ATTR_TYPE);
                int columnIndex3 = V.getColumnIndex("notnull");
                int columnIndex4 = V.getColumnIndex("pk");
                int columnIndex5 = V.getColumnIndex("dflt_value");
                while (V.moveToNext()) {
                    String string = V.getString(columnIndex);
                    hashMap.put(string, new C5377a(string, V.getString(columnIndex2), V.getInt(columnIndex3) != 0, V.getInt(columnIndex4), V.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            V.close();
        }
    }

    /* renamed from: c */
    private static List<C5379c> m24200c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(TtmlNode.ATTR_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C5379c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    private static Set<C5378b> m24201d(C5436b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor V = bVar.mo21895V("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex(TtmlNode.ATTR_ID);
            int columnIndex2 = V.getColumnIndex("seq");
            int columnIndex3 = V.getColumnIndex("table");
            int columnIndex4 = V.getColumnIndex("on_delete");
            int columnIndex5 = V.getColumnIndex("on_update");
            List<C5379c> c = m24200c(V);
            int count = V.getCount();
            for (int i = 0; i < count; i++) {
                V.moveToPosition(i);
                if (V.getInt(columnIndex2) == 0) {
                    int i2 = V.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C5379c next : c) {
                        if (next.f23661b == i2) {
                            arrayList.add(next.f23663d);
                            arrayList2.add(next.f23664e);
                        }
                    }
                    hashSet.add(new C5378b(V.getString(columnIndex3), V.getString(columnIndex4), V.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            V.close();
        }
    }

    /* renamed from: e */
    private static C5380d m24202e(C5436b bVar, String str, boolean z) {
        Cursor V = bVar.mo21895V("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex("seqno");
            int columnIndex2 = V.getColumnIndex("cid");
            int columnIndex3 = V.getColumnIndex(MediationMetaData.KEY_NAME);
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (V.moveToNext()) {
                        if (V.getInt(columnIndex2) >= 0) {
                            int i = V.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), V.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C5380d dVar = new C5380d(str, z, arrayList);
                    V.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            V.close();
        }
    }

    /* renamed from: f */
    private static Set<C5380d> m24203f(C5436b bVar, String str) {
        Cursor V = bVar.mo21895V("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex(MediationMetaData.KEY_NAME);
            int columnIndex2 = V.getColumnIndex(TtmlNode.ATTR_TTS_ORIGIN);
            int columnIndex3 = V.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (V.moveToNext()) {
                        if ("c".equals(V.getString(columnIndex2))) {
                            String string = V.getString(columnIndex);
                            boolean z = true;
                            if (V.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C5380d e = m24202e(bVar, string, z);
                            if (e == null) {
                                V.close();
                                return null;
                            }
                            hashSet.add(e);
                        }
                    }
                    V.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            V.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C5380d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5376g gVar = (C5376g) obj;
        String str = this.f23645a;
        if (str == null ? gVar.f23645a != null : !str.equals(gVar.f23645a)) {
            return false;
        }
        Map<String, C5377a> map = this.f23646b;
        if (map == null ? gVar.f23646b != null : !map.equals(gVar.f23646b)) {
            return false;
        }
        Set<C5378b> set2 = this.f23647c;
        if (set2 == null ? gVar.f23647c != null : !set2.equals(gVar.f23647c)) {
            return false;
        }
        Set<C5380d> set3 = this.f23648d;
        if (set3 == null || (set = gVar.f23648d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f23645a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C5377a> map = this.f23646b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C5378b> set = this.f23647c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.f23645a + '\'' + ", columns=" + this.f23646b + ", foreignKeys=" + this.f23647c + ", indices=" + this.f23648d + '}';
    }
}
