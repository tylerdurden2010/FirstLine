package effectunit.com.blank;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;




/**
 * Created by TagBand on 16/3/5.
 */
public class FirstActivity extends Activity {
   @Override
    protected void onCreate(Bundle savedInstanceState)
   {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.first_layout);
       Button button1 = (Button)findViewById(R.id.button_1);
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v)
           {
               //finish();
               //销毁一个活动
               Toast.makeText(FirstActivity.this, "fuckyou",Toast.LENGTH_SHORT).show();
           }
       });



   }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.add_item:
                Toast.makeText(this,"add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"rm",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

}
