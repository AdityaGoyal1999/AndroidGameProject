//package com.example.game.Level1;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//
//import com.example.game.Level3.Level3;
//import com.example.game.R;
//
//public class Customise1 extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_customise1);
//    }
//}
package com.example.game.Level1;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;

        import com.example.game.Level1.View.Level1;
        import com.example.game.Level1.View.LevelSelection;
        import com.example.game.R;

public class Customise1 extends Activity {

    RadioGroup color, ballColor, points;
    RadioButton col, tim, point;
    Button apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customise1);
        apply = findViewById(R.id.apply);
        color = findViewById(R.id.radioGroup);
        ballColor = findViewById(R.id.radioGroup2);
        points = findViewById(R.id.radioGroup3);
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                col = findViewById(color.getCheckedRadioButtonId());
                tim = findViewById(ballColor.getCheckedRadioButtonId());
                point = findViewById(points.getCheckedRadioButtonId());
                Intent i = new Intent(com.example.game.Level1.Customise1.this, LevelSelection.class);
                i.putExtra("COLOR", col.getText().toString());
                i.putExtra("TIME", tim.getText().toString());
                i.putExtra("POINTS", point.getText().toString());
                String username = getIntent().getStringExtra("name");
                i.putExtra("name", username);

                startActivity(i);
            }
        });
    }
}





