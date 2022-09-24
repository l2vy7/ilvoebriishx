package british.p015x;

import android.content.Intent;
import android.widget.RemoteViewsService;

/* renamed from: british.x.s_widget_vistafb */
public class s_widget_vistafb extends RemoteViewsService {
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new C1869n3(getApplicationContext(), intent);
    }
}
