package pk.buttons.etc.buttonsexample;

import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnTouchListener;

public class MainActivity extends ActionBarActivity{

    private Handler mHandler = new Handler();

    private Runnable mUpdateTaskup = new Runnable() {
        public void run() {
            counter++;
            textviewone.setText(String.valueOf(counter));
            Log.i("repeatBtn", "repeat click");
            mHandler.postAtTime(this, SystemClock.uptimeMillis() + 100);
        }//end run
    };// end runnable

    private Runnable mUpdateTaskdown = new Runnable() {
        public void run() {
            counter--;
            textviewone.setText(String.valueOf(counter));
            Log.i("repeatBtn", "repeat click");
            mHandler.postAtTime(this, SystemClock.uptimeMillis() + 100);
        }//end run
    };// end Runnable
    TextView textviewone;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textviewone = (TextView) findViewById(R.id.textView2);

        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        button.setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent motionevent) {
                int action = motionevent.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    Log.i("repeatBtn", "MotionEvent.ACTION_DOWN");
                    mHandler.removeCallbacks(mUpdateTaskup);
                    mHandler.postAtTime(mUpdateTaskup,
                            SystemClock.uptimeMillis() + 50);
                } else if (action == MotionEvent.ACTION_UP) {
                    Log.i("repeatBtn", "MotionEvent.ACTION_UP");
                    mHandler.removeCallbacks(mUpdateTaskup);
                }//end else
                return false;
            } //end onTouch
        }); //end b my button

        button2.setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent motionevent) {
                int action = motionevent.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    Log.i("repeatBtn", "MotionEvent.ACTION_DOWN");
                    mHandler.removeCallbacks(mUpdateTaskdown);
                    mHandler.postAtTime(mUpdateTaskdown,
                            SystemClock.uptimeMillis() + 50);
                } else if (action == MotionEvent.ACTION_UP) {
                    Log.i("repeatBtn", "MotionEvent.ACTION_UP");
                    mHandler.removeCallbacks(mUpdateTaskdown);
                }//end else
                return false;
            }//end on touch
        });//end b other button

        button3.setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent motionevent) {
                int action = motionevent.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    Log.i("repeatBtn", "MotionEvent.ACTION_DOWN");
                    mHandler.removeCallbacks(mUpdateTaskup);
                    mHandler.postAtTime(mUpdateTaskup,
                            SystemClock.uptimeMillis() + 50);
                } else if (action == MotionEvent.ACTION_UP) {
                    Log.i("repeatBtn", "MotionEvent.ACTION_UP");
                    mHandler.removeCallbacks(mUpdateTaskup);
                }//end else
                return false;
            } //end onTouch
        }); //end b my button



        button4.setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent motionevent) {
                int action = motionevent.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    Log.i("repeatBtn", "MotionEvent.ACTION_DOWN");
                    mHandler.removeCallbacks(mUpdateTaskup);
                    mHandler.postAtTime(mUpdateTaskup,
                            SystemClock.uptimeMillis() + 50);
                } else if (action == MotionEvent.ACTION_UP) {
                    Log.i("repeatBtn", "MotionEvent.ACTION_UP");
                    mHandler.removeCallbacks(mUpdateTaskup);
                }//end else
                return false;
            } //end onTouch
        }); //end b my button


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}