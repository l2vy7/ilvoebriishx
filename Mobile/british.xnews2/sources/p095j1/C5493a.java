package p095j1;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import p090i1.C5435a;
import p090i1.C5436b;
import p090i1.C5443e;
import p090i1.C5444f;

/* renamed from: j1.a */
/* compiled from: FrameworkSQLiteDatabase */
class C5493a implements C5436b {

    /* renamed from: c */
    private static final String[] f23890c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d */
    private static final String[] f23891d = new String[0];

    /* renamed from: b */
    private final SQLiteDatabase f23892b;

    /* renamed from: j1.a$a */
    /* compiled from: FrameworkSQLiteDatabase */
    class C5494a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C5443e f23893a;

        C5494a(C5443e eVar) {
            this.f23893a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f23893a.mo5947c(new C5500d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: j1.a$b */
    /* compiled from: FrameworkSQLiteDatabase */
    class C5495b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C5443e f23895a;

        C5495b(C5443e eVar) {
            this.f23895a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f23895a.mo5947c(new C5500d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    C5493a(SQLiteDatabase sQLiteDatabase) {
        this.f23892b = sQLiteDatabase;
    }

    /* renamed from: F */
    public List<Pair<String, String>> mo21889F() {
        return this.f23892b.getAttachedDbs();
    }

    /* renamed from: G */
    public void mo21890G(String str) throws SQLException {
        this.f23892b.execSQL(str);
    }

    /* renamed from: J */
    public C5444f mo21891J(String str) {
        return new C5501e(this.f23892b.compileStatement(str));
    }

    /* renamed from: K */
    public Cursor mo21892K(C5443e eVar, CancellationSignal cancellationSignal) {
        return this.f23892b.rawQueryWithFactory(new C5495b(eVar), eVar.mo5949d(), f23891d, (String) null, cancellationSignal);
    }

    /* renamed from: O */
    public void mo21893O() {
        this.f23892b.setTransactionSuccessful();
    }

    /* renamed from: P */
    public void mo21894P(String str, Object[] objArr) throws SQLException {
        this.f23892b.execSQL(str, objArr);
    }

    /* renamed from: V */
    public Cursor mo21895V(String str) {
        return mo21897c0(new C5435a(str));
    }

    /* renamed from: a0 */
    public void mo21896a0() {
        this.f23892b.endTransaction();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo21965c(SQLiteDatabase sQLiteDatabase) {
        return this.f23892b == sQLiteDatabase;
    }

    /* renamed from: c0 */
    public Cursor mo21897c0(C5443e eVar) {
        return this.f23892b.rawQueryWithFactory(new C5494a(eVar), eVar.mo5949d(), f23891d, (String) null);
    }

    public void close() throws IOException {
        this.f23892b.close();
    }

    /* renamed from: n0 */
    public boolean mo21898n0() {
        return this.f23892b.inTransaction();
    }

    /* renamed from: q */
    public boolean mo21899q() {
        return this.f23892b.isOpen();
    }

    /* renamed from: y */
    public String mo21900y() {
        return this.f23892b.getPath();
    }

    /* renamed from: z */
    public void mo21901z() {
        this.f23892b.beginTransaction();
    }
}
