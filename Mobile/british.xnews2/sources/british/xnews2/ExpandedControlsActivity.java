package british.xnews2;

import android.os.Bundle;
import android.view.Menu;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import p114m4.C10739a;

public class ExpandedControlsActivity extends ExpandedControllerActivity {
    public void onCreate(Bundle bundle) {
        setTheme(2131886579);
        super.onCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.m_cast, menu);
        C10739a.m48620a(this, menu, R.id.media_route_menu_item);
        return true;
    }
}
