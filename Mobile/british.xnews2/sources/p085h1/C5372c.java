package p085h1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.C1199i;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p090i1.C5436b;
import p090i1.C5443e;

/* renamed from: h1.c */
/* compiled from: DBUtil */
public class C5372c {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m24190a(C5436b bVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor V = bVar.mo21895V("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (V.moveToNext()) {
            try {
                arrayList.add(V.getString(0));
            } catch (Throwable th) {
                V.close();
                throw th;
            }
        }
        V.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.mo21890G("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: b */
    public static Cursor m24191b(C1199i iVar, C5443e eVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor query = iVar.query(eVar, cancellationSignal);
        if (!z || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C5371b.m24187a(abstractWindowedCursor) : query;
    }

    /* renamed from: c */
    public static int m24192c(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                fileChannel.close();
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
