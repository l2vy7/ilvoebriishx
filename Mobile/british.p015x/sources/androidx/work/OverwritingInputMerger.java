package androidx.work;

import androidx.work.C1427e;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends C1480k {
    /* renamed from: b */
    public C1427e mo6804b(List<C1427e> list) {
        C1427e.C1428a aVar = new C1427e.C1428a();
        HashMap hashMap = new HashMap();
        for (C1427e i : list) {
            hashMap.putAll(i.mo6902i());
        }
        aVar.mo6909d(hashMap);
        return aVar.mo6906a();
    }
}
