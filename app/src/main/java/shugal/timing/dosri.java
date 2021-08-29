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

public class dosri extends AppCompatActivity {
    public TextView textbox;
    public LinearLayout container;
    private MediaPlayer player;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        container = (LinearLayout) findViewById(R.id.layoutmain);
        textbox = (TextView) findViewById(R.id.showinfo2);

        textbox.setText("Wah kya Timing hai yawr!");
        ValueAnimator colorAnim = ObjectAnimator.ofInt(container, "backgroundColor", Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, 0xE29689);

        colorAnim.setDuration(500);
        colorAnim.setEvaluator(new ArgbEvaluator());
        colorAnim.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim.start();
        b1=(Button)findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        player = MediaPlayer.create(this, R.raw.cheer);
        player.start();
        player.setLooping(true);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        player.stop();

    }

    @Override
    protected void onPause()
    {
        super.onPause();
        player.stop();
    }

}