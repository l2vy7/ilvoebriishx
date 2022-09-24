package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import p091i1.C5444f;

/* renamed from: androidx.room.o */
/* compiled from: SharedSQLiteStatement */
public abstract class C1211o {
    private final C1199i mDatabase;
    private final AtomicBoolean mLock = new AtomicBoolean(false);
    private volatile C5444f mStmt;

    public C1211o(C1199i iVar) {
        this.mDatabase = iVar;
    }

    private C5444f createNewStatement() {
        return this.mDatabase.compileStatement(createQuery());
    }

    private C5444f getStmt(boolean z) {
        if (!z) {
            return createNewStatement();
        }
        if (this.mStmt == null) {
            this.mStmt = createNewStatement();
        }
        return this.mStmt;
    }

    public C5444f acquire() {
        assertNotMainThread();
        return getStmt(this.mLock.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    public void assertNotMainThread() {
        this.mDatabase.assertNotMainThread();
    }

    /* access modifiers changed from: protected */
    public abstract String createQuery();

    public void release(C5444f fVar) {
        if (fVar == this.mStmt) {
            this.mLock.set(false);
        }
    }
}
