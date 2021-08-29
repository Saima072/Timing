package shugal.timing;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static java.lang.Thread.sleep;

public class pehli extends AppCompatActivity{

    public TextView textbox;
    public LinearLayout container;
    private MediaPlayer player;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        container=(LinearLayout)findViewById(R.id.layoutmain);
        textbox=(TextView) findViewById(R.id.showinfo1);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat dateformat = new SimpleDateFormat("hh:mm:ss aa");
        String datetime = dateformat.format(c.getTime());
        textbox.setText(datetime);
        textbox.setTextColor(Color.parseColor("#2f2648"));

        b1=(Button)findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}
