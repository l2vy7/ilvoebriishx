package p306f9;

import java.io.IOException;
import java.net.Socket;
import p312i9.C12790d;

/* renamed from: f9.n */
/* compiled from: SocketOutputBuffer */
public class C12711n extends C12701d {
    public C12711n(Socket socket, int i, C12790d dVar) throws IOException {
        if (socket != null) {
            i = i < 0 ? socket.getSendBufferSize() : i;
            mo47717f(socket.getOutputStream(), i < 1024 ? 1024 : i, dVar);
            return;
        }
        throw new IllegalArgumentException("Socket may not be null");
    }
}
