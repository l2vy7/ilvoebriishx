package p101k2;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p004a3.C0052a;
import p064d2.C5157d;
import p064d2.C5163h;

/* renamed from: k2.c */
/* compiled from: ByteBufferEncoder */
public class C5565c implements C5157d<ByteBuffer> {
    /* renamed from: c */
    public boolean mo21330b(ByteBuffer byteBuffer, File file, C5163h hVar) {
        try {
            C0052a.m217e(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
