package com.marwannakhaleh.jeopardy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    public static final String EXTRA_MESSAGE = "Put message here!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        Button raw_message = (Button) findViewById(view.getId());
        String massage = getString(R.string.question1);
        switch(view.getId()){
            case(R.id.button1):
                massage = getString(R.string.question1);
                break;
            case(R.id.button2):
                massage = getString(R.string.question2);
                break;
            case(R.id.button3):
                massage = getString(R.string.question3);
                break;
            case(R.id.button4):
                massage = getString(R.string.question4);
                break;
            case(R.id.button5):
                massage = getString(R.string.question5);
                break;
            case(R.id.button6):
                massage = getString(R.string.question6);
                break;
            case(R.id.button7):
                massage = getString(R.string.question7);
                break;
            case(R.id.button8):
                massage = getString(R.string.question8);
                break;
            case(R.id.button9):
                massage = getString(R.string.question9);
                break;
            case(R.id.button10):
                massage = getString(R.string.question10);
                break;
            case(R.id.button11):
                massage = getString(R.string.question11);
                break;
            case(R.id.button12):
                massage = getString(R.string.question12);
                break;
            case(R.id.button13):
                massage = getString(R.string.question13);
                break;
            case(R.id.button14):
                massage = getString(R.string.question14);
                break;
            case(R.id.button15):
                massage = getString(R.string.question15);
                break;
            case(R.id.button16):
                massage = getString(R.string.question16);
                break;
            case(R.id.button17):
                massage = getString(R.string.question17);
                break;
            case(R.id.button18):
                massage = getString(R.string.question18);
                break;
            case(R.id.button19):
                massage = getString(R.string.question19);
                break;
            case(R.id.button20):
                massage = getString(R.string.question20);
                break;
            case(R.id.button21):
                massage = getString(R.string.question21);
                break;
            case(R.id.button22):
                massage = getString(R.string.question22);
                break;
            case(R.id.button23):
                massage = getString(R.string.question23);
                break;
            case(R.id.button24):
                massage = getString(R.string.question24);
                break;
            case(R.id.button25):
                massage = getString(R.string.question25);
                break;
            case(R.id.button26):
                massage = getString(R.string.question26);
                break;
            case(R.id.button27):
                massage = getString(R.string.question27);
                break;
            case(R.id.button28):
                massage = getString(R.string.question28);
                break;
            case(R.id.button29):
                massage = getString(R.string.question29);
                break;
            case(R.id.button30):
                massage = getString(R.string.question30);
                break;
            default:
                break;
        }
        intent.putExtra(EXTRA_MESSAGE, massage);
        startActivity(intent);
    }
}
