package british.p015x;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: british.x.bd_provider */
public class bd_provider extends ContentProvider {

    /* renamed from: c */
    public static final Uri f6882c = Uri.parse("content://british.x.bd_provider/productos");

    /* renamed from: d */
    public static final Uri f6883d = Uri.parse("content://british.x.bd_provider/fotos");

    /* renamed from: e */
    private static final UriMatcher f6884e;

    /* renamed from: b */
    private C2037q f6885b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f6884e = uriMatcher;
        uriMatcher.addURI("british.x.bd_provider", "productos", 101);
        uriMatcher.addURI("british.x.bd_provider", "productos/#", 111);
        uriMatcher.addURI("british.x.bd_provider", "fotos", 102);
        uriMatcher.addURI("british.x.bd_provider", "fotos/#", 112);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        int i;
        int match = f6884e.match(uri);
        try {
            SQLiteDatabase writableDatabase = this.f6885b.getWritableDatabase();
            switch (match) {
                case 101:
                    i = writableDatabase.delete("productos", str, strArr);
                    break;
                case 102:
                    i = writableDatabase.delete("fotos", str, strArr);
                    break;
                case 103:
                    i = writableDatabase.delete("cats", str, strArr);
                    break;
                default:
                    switch (match) {
                        case 111:
                            String lastPathSegment = uri.getLastPathSegment();
                            if (!TextUtils.isEmpty(str)) {
                                i = writableDatabase.delete("productos", str + " and id=" + lastPathSegment, strArr);
                                break;
                            } else {
                                i = writableDatabase.delete("productos", "_id=" + lastPathSegment, (String[]) null);
                                break;
                            }
                        case 112:
                            String lastPathSegment2 = uri.getLastPathSegment();
                            if (!TextUtils.isEmpty(str)) {
                                i = writableDatabase.delete("fotos", str + " and id=" + lastPathSegment2, strArr);
                                break;
                            } else {
                                i = writableDatabase.delete("fotos", "_id=" + lastPathSegment2, (String[]) null);
                                break;
                            }
                        case 113:
                            String lastPathSegment3 = uri.getLastPathSegment();
                            if (!TextUtils.isEmpty(str)) {
                                i = writableDatabase.delete("cats", str + " and id=" + lastPathSegment3, strArr);
                                break;
                            } else {
                                i = writableDatabase.delete("cats", "_id=" + lastPathSegment3, (String[]) null);
                                break;
                            }
                        default:
                            throw new IllegalArgumentException("Unknown or Invalid URI " + uri);
                    }
            }
            getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    public String getType(Uri uri) {
        int match = f6884e.match(uri);
        switch (match) {
            case 101:
                return "vnd.android.cursor.dir/mt-producto";
            case 102:
                return "vnd.android.cursor.dir/mt-foto";
            case 103:
                return "vnd.android.cursor.dir/mt-cat";
            default:
                switch (match) {
                    case 111:
                        return "vnd.android.cursor.item/mt-producto";
                    case 112:
                        return "vnd.android.cursor.item/mt-foto";
                    case 113:
                        return "vnd.android.cursor.item/mt-cat";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri insert(android.net.Uri r7, android.content.ContentValues r8) {
        /*
            r6 = this;
            android.content.UriMatcher r0 = f6884e
            int r0 = r0.match(r7)
            r1 = 101(0x65, float:1.42E-43)
            if (r0 != r1) goto L_0x000d
            java.lang.String r0 = "productos"
            goto L_0x001a
        L_0x000d:
            r1 = 102(0x66, float:1.43E-43)
            if (r0 != r1) goto L_0x0014
            java.lang.String r0 = "fotos"
            goto L_0x001a
        L_0x0014:
            r1 = 103(0x67, float:1.44E-43)
            if (r0 != r1) goto L_0x0053
            java.lang.String r0 = "cats"
        L_0x001a:
            r1 = 0
            british.x.q r2 = r6.f6885b     // Catch:{ Exception -> 0x0052 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ Exception -> 0x0052 }
            long r2 = r2.insertOrThrow(r0, r1, r8)     // Catch:{  }
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x003b
            android.net.Uri r8 = android.content.ContentUris.withAppendedId(r7, r2)     // Catch:{  }
            android.content.Context r0 = r6.getContext()     // Catch:{  }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{  }
            r0.notifyChange(r7, r1)     // Catch:{  }
            return r8
        L_0x003b:
            android.database.SQLException r8 = new android.database.SQLException     // Catch:{  }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{  }
            r0.<init>()     // Catch:{  }
            java.lang.String r2 = "Failed to insert row into "
            r0.append(r2)     // Catch:{  }
            r0.append(r7)     // Catch:{  }
            java.lang.String r7 = r0.toString()     // Catch:{  }
            r8.<init>(r7)     // Catch:{  }
            throw r8     // Catch:{  }
        L_0x0052:
            return r1
        L_0x0053:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Invalid URI for insert"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.bd_provider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    public boolean onCreate() {
        this.f6885b = new C2037q(getContext());
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        int match = f6884e.match(uri);
        sQLiteQueryBuilder.setTables((match == 111 || match == 101) ? "productos" : (match == 112 || match == 102) ? "fotos" : (match == 113 || match == 103) ? "cats" : "");
        switch (match) {
            case 101:
            case 102:
            case 103:
                break;
            default:
                switch (match) {
                    case 111:
                    case 112:
                    case 113:
                        sQLiteQueryBuilder.appendWhere("_id=" + uri.getLastPathSegment());
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown URI");
                }
        }
        Cursor query = sQLiteQueryBuilder.query(this.f6885b.getReadableDatabase(), strArr, str, strArr2, (String) null, (String) null, str2);
        query.setNotificationUri(getContext().getContentResolver(), uri);
        return query;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        int match = f6884e.match(uri);
        try {
            SQLiteDatabase writableDatabase = this.f6885b.getWritableDatabase();
            String str2 = (match == 111 || match == 101) ? "productos" : (match == 112 || match == 102) ? "fotos" : (match == 113 || match == 103) ? "cats" : "";
            switch (match) {
                case 101:
                case 102:
                case 103:
                    i = writableDatabase.update(str2, contentValues, str, strArr);
                    break;
                default:
                    switch (match) {
                        case 111:
                        case 112:
                        case 113:
                            String lastPathSegment = uri.getLastPathSegment();
                            StringBuilder sb = new StringBuilder("_id=" + lastPathSegment);
                            if (!TextUtils.isEmpty(str)) {
                                sb.append(" AND " + str);
                            }
                            i = writableDatabase.update(str2, contentValues, sb.toString(), (String[]) null);
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown URI");
                    }
            }
            getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }
}
