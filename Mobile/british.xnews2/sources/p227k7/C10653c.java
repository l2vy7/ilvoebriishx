package p227k7;

import com.google.android.exoplayer2.C6540C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p261w6.C11086c;

/* renamed from: k7.c */
/* compiled from: PersistedInstallation */
public class C10653c {

    /* renamed from: a */
    private final File f49234a;

    /* renamed from: b */
    private final C11086c f49235b;

    /* renamed from: k7.c$a */
    /* compiled from: PersistedInstallation */
    public enum C10654a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C10653c(C11086c cVar) {
        File filesDir = cVar.mo43355h().getFilesDir();
        this.f49234a = new File(filesDir, "PersistedInstallation." + cVar.mo43359l() + ".json");
        this.f49235b = cVar;
    }

    /* renamed from: b */
    private JSONObject m48443b() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(this.f49234a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: a */
    public C10655d mo42781a(C10655d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo42762d());
            jSONObject.put("Status", dVar.mo42766g().ordinal());
            jSONObject.put("AuthToken", dVar.mo42760b());
            jSONObject.put("RefreshToken", dVar.mo42765f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo42767h());
            jSONObject.put("ExpiresInSecs", dVar.mo42761c());
            jSONObject.put("FisError", dVar.mo42763e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f49235b.mo43355h().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(C6540C.UTF8_NAME));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f49234a)) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: c */
    public C10655d mo42782c() {
        JSONObject b = m48443b();
        String optString = b.optString("Fid", (String) null);
        int optInt = b.optInt("Status", C10654a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b.optString("AuthToken", (String) null);
        String optString3 = b.optString("RefreshToken", (String) null);
        long optLong = b.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = b.optLong("ExpiresInSecs", 0);
        return C10655d.m48446a().mo42774d(optString).mo42777g(C10654a.values()[optInt]).mo42772b(optString2).mo42776f(optString3).mo42778h(optLong).mo42773c(optLong2).mo42775e(b.optString("FisError", (String) null)).mo42771a();
    }
}
