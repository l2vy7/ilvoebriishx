package p070e2;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: e2.n */
/* compiled from: StreamAssetPathFetcher */
public class C5227n extends C5206b<InputStream> {
    public C5227n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public Class<InputStream> mo21422a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo21428c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo21432f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
