package british.xnews2;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class s_widget_vistafb extends RemoteViewsService {
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new C1869n3(getApplicationContext(), intent);
    }
}
