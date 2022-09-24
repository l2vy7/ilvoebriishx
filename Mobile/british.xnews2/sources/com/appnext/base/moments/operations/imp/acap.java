package com.appnext.base.moments.operations.imp;

import com.appnext.base.C3117a;
import com.appnext.base.moments.operations.C3142c;
import com.appnext.base.moments.p027a.p028a.C3129b;
import java.util.Comparator;
import java.util.List;

public class acap extends C3142c {

    private class CollectedDataModelByDateComparator implements Comparator<C3129b> {
        public /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C3129b) obj).mo10560W().getTime() > ((C3129b) obj2).mo10560W().getTime() ? 1 : 0;
        }
    }

    /* access modifiers changed from: protected */
    public List<C3129b> getData() {
        try {
            throw null;
        } catch (Throwable th) {
            C3117a.m10553a("acap$getData", th);
            return null;
        }
    }
}
