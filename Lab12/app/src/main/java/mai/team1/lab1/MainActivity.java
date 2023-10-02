package mai.team1.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text_random = findViewById(R.id.text_random);
        Button btn_random = findViewById(R.id.btn_random);


        btn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int[] nums = new int[4];

                for(int i = 0; i < nums.length; i++){
                    nums[i] = (int)(Math.random()*9);
                    text_random.setText(text_random.getText().toString() + nums[i] );
                }


            }

        });
    }



}
