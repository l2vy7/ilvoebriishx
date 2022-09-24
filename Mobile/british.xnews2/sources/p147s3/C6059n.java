package p147s3;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* renamed from: s3.n */
/* compiled from: LogResponse */
public abstract class C6059n {
    /* renamed from: a */
    static C6059n m26658a(long j) {
        return new C6047h(j);
    }

    /* renamed from: b */
    public static C6059n m26659b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m26658a(Long.parseLong(jsonReader.nextString()));
                } else {
                    C6059n a = m26658a(jsonReader.nextLong());
                    jsonReader.close();
                    return a;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo23237c();
}
