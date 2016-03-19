package effectunit.com.blank;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by TagBand on 16/3/19.
 */
public class ThiredActivity extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceStat)
    {
        super.onCreate(saveInstanceStat);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.third_layout);
    }
}
