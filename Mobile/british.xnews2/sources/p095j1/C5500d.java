package p095j1;

import android.database.sqlite.SQLiteProgram;
import p090i1.C5442d;

/* renamed from: j1.d */
/* compiled from: FrameworkSQLiteProgram */
class C5500d implements C5442d {

    /* renamed from: b */
    private final SQLiteProgram f23909b;

    C5500d(SQLiteProgram sQLiteProgram) {
        this.f23909b = sQLiteProgram;
    }

    /* renamed from: A */
    public void mo5944A(int i, double d) {
        this.f23909b.bindDouble(i, d);
    }

    /* renamed from: N */
    public void mo5945N(int i, long j) {
        this.f23909b.bindLong(i, j);
    }

    /* renamed from: S */
    public void mo5946S(int i, byte[] bArr) {
        this.f23909b.bindBlob(i, bArr);
    }

    public void close() {
        this.f23909b.close();
    }

    /* renamed from: i */
    public void mo5952i(int i, String str) {
        this.f23909b.bindString(i, str);
    }

    /* renamed from: j0 */
    public void mo5953j0(int i) {
        this.f23909b.bindNull(i);
    }
}
