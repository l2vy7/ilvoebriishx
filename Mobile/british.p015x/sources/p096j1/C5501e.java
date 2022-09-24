package p096j1;

import android.database.sqlite.SQLiteStatement;
import p091i1.C5444f;

/* renamed from: j1.e */
/* compiled from: FrameworkSQLiteStatement */
class C5501e extends C5500d implements C5444f {

    /* renamed from: c */
    private final SQLiteStatement f23910c;

    C5501e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f23910c = sQLiteStatement;
    }

    /* renamed from: A0 */
    public long mo21907A0() {
        return this.f23910c.executeInsert();
    }

    /* renamed from: I */
    public int mo21908I() {
        return this.f23910c.executeUpdateDelete();
    }
}
