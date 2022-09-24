package p090i1;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: i1.b */
/* compiled from: SupportSQLiteDatabase */
public interface C5436b extends Closeable {
    /* renamed from: F */
    List<Pair<String, String>> mo21889F();

    /* renamed from: G */
    void mo21890G(String str) throws SQLException;

    /* renamed from: J */
    C5444f mo21891J(String str);

    /* renamed from: K */
    Cursor mo21892K(C5443e eVar, CancellationSignal cancellationSignal);

    /* renamed from: O */
    void mo21893O();

    /* renamed from: P */
    void mo21894P(String str, Object[] objArr) throws SQLException;

    /* renamed from: V */
    Cursor mo21895V(String str);

    /* renamed from: a0 */
    void mo21896a0();

    /* renamed from: c0 */
    Cursor mo21897c0(C5443e eVar);

    /* renamed from: n0 */
    boolean mo21898n0();

    /* renamed from: q */
    boolean mo21899q();

    /* renamed from: y */
    String mo21900y();

    /* renamed from: z */
    void mo21901z();
}
