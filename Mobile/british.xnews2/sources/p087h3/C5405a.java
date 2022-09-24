package p087h3;

import android.os.AsyncTask;
import com.facebook.C3642m;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: h3.a */
/* compiled from: Model */
public final class C5405a {

    /* renamed from: v */
    private static final List<String> f23713v = Arrays.asList(new String[]{"fb_mobile_add_to_cart", "fb_mobile_complete_registration", "other", "fb_mobile_purchase"});

    /* renamed from: w */
    private static final Map<String, String> f23714w = new C5406a();

    /* renamed from: a */
    private String f23715a;

    /* renamed from: b */
    private File f23716b;

    /* renamed from: c */
    private File f23717c;

    /* renamed from: d */
    private File f23718d;

    /* renamed from: e */
    private int f23719e;

    /* renamed from: f */
    private float[] f23720f;

    /* renamed from: g */
    private String f23721g;

    /* renamed from: h */
    private String f23722h;

    /* renamed from: i */
    private C5409d f23723i;

    /* renamed from: j */
    private C5409d f23724j;

    /* renamed from: k */
    private C5409d f23725k;

    /* renamed from: l */
    private C5409d f23726l;

    /* renamed from: m */
    private C5409d f23727m;

    /* renamed from: n */
    private C5409d f23728n;

    /* renamed from: o */
    private C5409d f23729o;

    /* renamed from: p */
    private C5409d f23730p;

    /* renamed from: q */
    private C5409d f23731q;

    /* renamed from: r */
    private C5409d f23732r;

    /* renamed from: s */
    private C5409d f23733s;

    /* renamed from: t */
    private C5409d f23734t;

    /* renamed from: u */
    private C5409d f23735u;

    /* renamed from: h3.a$a */
    /* compiled from: Model */
    static class C5406a extends HashMap<String, String> {
        C5406a() {
            put("embedding.weight", "embed.weight");
            put("dense1.weight", "fc1.weight");
            put("dense2.weight", "fc2.weight");
            put("dense3.weight", "fc3.weight");
            put("dense1.bias", "fc1.bias");
            put("dense2.bias", "fc2.bias");
            put("dense3.bias", "fc3.bias");
        }
    }

    /* renamed from: h3.a$b */
    /* compiled from: Model */
    class C5407b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Runnable f23736b;

        C5407b(Runnable runnable) {
            this.f23736b = runnable;
        }

        public void run() {
            if (C5405a.this.m24326h()) {
                C5405a.this.m24325e(this.f23736b);
            }
        }
    }

    /* renamed from: h3.a$c */
    /* compiled from: Model */
    static class C5408c extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        Runnable f23738a;

        /* renamed from: b */
        File f23739b;

        /* renamed from: c */
        String f23740c;

        C5408c(String str, File file, Runnable runnable) {
            this.f23740c = str;
            this.f23739b = file;
            this.f23738a = runnable;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(String... strArr) {
            try {
                URL url = new URL(this.f23740c);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f23739b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                this.f23738a.run();
            }
        }
    }

    /* renamed from: h3.a$d */
    /* compiled from: Model */
    private static class C5409d {

        /* renamed from: a */
        public int[] f23741a;

        /* renamed from: b */
        public float[] f23742b;

        C5409d(int[] iArr, float[] fArr) {
            this.f23741a = iArr;
            this.f23742b = fArr;
        }
    }

    C5405a(String str, int i, String str2, String str3, float[] fArr) {
        this.f23715a = str;
        this.f23719e = i;
        this.f23720f = fArr;
        this.f23721g = str2;
        this.f23722h = str3;
        File file = new File(C3642m.m12279e().getFilesDir(), "facebook_ml/");
        this.f23718d = file;
        if (!file.exists()) {
            this.f23718d.mkdirs();
        }
        File file2 = this.f23718d;
        this.f23716b = new File(file2, str + "_" + i);
        File file3 = this.f23718d;
        this.f23717c = new File(file3, str + "_" + i + "_rule");
    }

    /* renamed from: c */
    private void m24323c() {
        File[] listFiles = this.f23718d.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            String str = this.f23715a + "_" + this.f23719e;
            for (File file : listFiles) {
                String name = file.getName();
                if (name.startsWith(this.f23715a) && !name.startsWith(str)) {
                    file.delete();
                }
            }
        }
    }

    /* renamed from: d */
    private void m24324d(Runnable runnable) {
        if (this.f23716b.exists()) {
            runnable.run();
        } else if (this.f23721g != null) {
            new C5408c(this.f23721g, this.f23716b, runnable).execute(new String[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m24325e(Runnable runnable) {
        if (this.f23717c.exists() || this.f23722h == null) {
            runnable.run();
        } else {
            new C5408c(this.f23722h, this.f23717c, runnable).execute(new String[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public boolean m24326h() {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f23716b);
            int available = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[available];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (available < 4) {
                return false;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            int i = wrap.getInt();
            int i2 = i + 4;
            if (available < i2) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(new String(bArr, 4, i));
            JSONArray names = jSONObject.names();
            int length = names.length();
            String[] strArr = new String[length];
            for (int i3 = 0; i3 < length; i3++) {
                strArr[i3] = names.getString(i3);
            }
            Arrays.sort(strArr);
            HashMap hashMap = new HashMap();
            int i4 = 0;
            while (true) {
                int i5 = 1;
                if (i4 < length) {
                    String str = strArr[i4];
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    int length2 = jSONArray.length();
                    int[] iArr = new int[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        iArr[i6] = jSONArray.getInt(i6);
                        i5 *= iArr[i6];
                    }
                    int i7 = i5 * 4;
                    int i8 = i2 + i7;
                    if (i8 > available) {
                        return false;
                    }
                    ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i2, i7);
                    wrap2.order(ByteOrder.LITTLE_ENDIAN);
                    float[] fArr = new float[i5];
                    wrap2.asFloatBuffer().get(fArr, 0, i5);
                    Map<String, String> map = f23714w;
                    if (map.containsKey(str)) {
                        str = map.get(str);
                    }
                    hashMap.put(str, new C5409d(iArr, fArr));
                    i4++;
                    i2 = i8;
                } else {
                    this.f23723i = (C5409d) hashMap.get("embed.weight");
                    this.f23724j = (C5409d) hashMap.get("convs.0.weight");
                    this.f23725k = (C5409d) hashMap.get("convs.1.weight");
                    this.f23726l = (C5409d) hashMap.get("convs.2.weight");
                    C5409d dVar = this.f23724j;
                    float[] fArr2 = dVar.f23742b;
                    int[] iArr2 = dVar.f23741a;
                    dVar.f23742b = C5416c.m24364k(fArr2, iArr2[0], iArr2[1], iArr2[2]);
                    C5409d dVar2 = this.f23725k;
                    float[] fArr3 = dVar2.f23742b;
                    int[] iArr3 = dVar2.f23741a;
                    dVar2.f23742b = C5416c.m24364k(fArr3, iArr3[0], iArr3[1], iArr3[2]);
                    C5409d dVar3 = this.f23726l;
                    float[] fArr4 = dVar3.f23742b;
                    int[] iArr4 = dVar3.f23741a;
                    dVar3.f23742b = C5416c.m24364k(fArr4, iArr4[0], iArr4[1], iArr4[2]);
                    this.f23727m = (C5409d) hashMap.get("convs.0.bias");
                    this.f23728n = (C5409d) hashMap.get("convs.1.bias");
                    this.f23729o = (C5409d) hashMap.get("convs.2.bias");
                    this.f23730p = (C5409d) hashMap.get("fc1.weight");
                    this.f23731q = (C5409d) hashMap.get("fc2.weight");
                    this.f23732r = (C5409d) hashMap.get("fc3.weight");
                    C5409d dVar4 = this.f23730p;
                    float[] fArr5 = dVar4.f23742b;
                    int[] iArr5 = dVar4.f23741a;
                    dVar4.f23742b = C5416c.m24363j(fArr5, iArr5[0], iArr5[1]);
                    C5409d dVar5 = this.f23731q;
                    float[] fArr6 = dVar5.f23742b;
                    int[] iArr6 = dVar5.f23741a;
                    dVar5.f23742b = C5416c.m24363j(fArr6, iArr6[0], iArr6[1]);
                    C5409d dVar6 = this.f23732r;
                    float[] fArr7 = dVar6.f23742b;
                    int[] iArr7 = dVar6.f23741a;
                    dVar6.f23742b = C5416c.m24363j(fArr7, iArr7[0], iArr7[1]);
                    this.f23733s = (C5409d) hashMap.get("fc1.bias");
                    this.f23734t = (C5409d) hashMap.get("fc2.bias");
                    this.f23735u = (C5409d) hashMap.get("fc3.bias");
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public File mo21857f() {
        return this.f23717c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo21858g(Runnable runnable) {
        m24324d(new C5407b(runnable));
        m24323c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo21859i(float[] fArr, String str) {
        float[] e = C5416c.m24358e(C5417d.m24366b(str, 128), this.f23723i.f23742b, 1, 128, 64);
        C5409d dVar = this.f23724j;
        float[] fArr2 = dVar.f23742b;
        int[] iArr = dVar.f23741a;
        float[] c = C5416c.m24356c(e, fArr2, 1, 128, 64, iArr[2], iArr[0]);
        C5409d dVar2 = this.f23725k;
        float[] fArr3 = dVar2.f23742b;
        int[] iArr2 = dVar2.f23741a;
        float[] c2 = C5416c.m24356c(e, fArr3, 1, 128, 64, iArr2[2], iArr2[0]);
        C5409d dVar3 = this.f23726l;
        float[] fArr4 = dVar3.f23742b;
        int[] iArr3 = dVar3.f23741a;
        float[] c3 = C5416c.m24356c(e, fArr4, 1, 128, 64, iArr3[2], iArr3[0]);
        float[] fArr5 = this.f23727m.f23742b;
        int[] iArr4 = this.f23724j.f23741a;
        C5416c.m24354a(c, fArr5, 1, (128 - iArr4[2]) + 1, iArr4[0]);
        float[] fArr6 = this.f23728n.f23742b;
        int[] iArr5 = this.f23725k.f23741a;
        C5416c.m24354a(c2, fArr6, 1, (128 - iArr5[2]) + 1, iArr5[0]);
        float[] fArr7 = this.f23729o.f23742b;
        int[] iArr6 = this.f23726l.f23741a;
        C5416c.m24354a(c3, fArr7, 1, (128 - iArr6[2]) + 1, iArr6[0]);
        int[] iArr7 = this.f23724j.f23741a;
        C5416c.m24361h(c, ((128 - iArr7[2]) + 1) * iArr7[0]);
        int[] iArr8 = this.f23725k.f23741a;
        C5416c.m24361h(c2, ((128 - iArr8[2]) + 1) * iArr8[0]);
        int[] iArr9 = this.f23726l.f23741a;
        C5416c.m24361h(c3, ((128 - iArr9[2]) + 1) * iArr9[0]);
        int[] iArr10 = this.f23724j.f23741a;
        float[] f = C5416c.m24359f(c, (128 - iArr10[2]) + 1, iArr10[0], (128 - iArr10[2]) + 1);
        int[] iArr11 = this.f23725k.f23741a;
        float[] f2 = C5416c.m24359f(c2, (128 - iArr11[2]) + 1, iArr11[0], (128 - iArr11[2]) + 1);
        int[] iArr12 = this.f23726l.f23741a;
        float[] b = C5416c.m24355b(C5416c.m24355b(C5416c.m24355b(f, f2), C5416c.m24359f(c3, (128 - iArr12[2]) + 1, iArr12[0], (128 - iArr12[2]) + 1)), fArr);
        C5409d dVar4 = this.f23730p;
        float[] fArr8 = dVar4.f23742b;
        float[] fArr9 = this.f23733s.f23742b;
        int[] iArr13 = dVar4.f23741a;
        float[] d = C5416c.m24357d(b, fArr8, fArr9, 1, iArr13[1], iArr13[0]);
        C5416c.m24361h(d, this.f23733s.f23741a[0]);
        C5409d dVar5 = this.f23731q;
        float[] fArr10 = dVar5.f23742b;
        float[] fArr11 = this.f23734t.f23742b;
        int[] iArr14 = dVar5.f23741a;
        float[] d2 = C5416c.m24357d(d, fArr10, fArr11, 1, iArr14[1], iArr14[0]);
        C5416c.m24361h(d2, this.f23734t.f23741a[0]);
        C5409d dVar6 = this.f23732r;
        float[] fArr12 = dVar6.f23742b;
        float[] fArr13 = this.f23735u.f23742b;
        int[] iArr15 = dVar6.f23741a;
        float[] d3 = C5416c.m24357d(d2, fArr12, fArr13, 1, iArr15[1], iArr15[0]);
        C5416c.m24362i(d3, this.f23735u.f23741a[0]);
        return mo21861k(d3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo21860j(float[] fArr) {
        if (fArr[1] >= this.f23720f[0]) {
            return "SHOULD_FILTER";
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo21861k(float[] fArr) {
        if (!(fArr.length == 0 || this.f23720f.length == 0)) {
            if (this.f23715a.equals("SUGGEST_EVENT")) {
                return mo21862l(fArr);
            }
            if (this.f23715a.equals("DATA_DETECTION_ADDRESS")) {
                return mo21860j(fArr);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public String mo21862l(float[] fArr) {
        if (this.f23720f.length != fArr.length) {
            return null;
        }
        int i = 0;
        while (true) {
            float[] fArr2 = this.f23720f;
            if (i >= fArr2.length) {
                return "other";
            }
            if (fArr[i] >= fArr2[i]) {
                return f23713v.get(i);
            }
            i++;
        }
    }
}
