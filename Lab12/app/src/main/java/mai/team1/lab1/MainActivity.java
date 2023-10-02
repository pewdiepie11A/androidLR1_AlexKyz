package mai.team1.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

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
                int i, j, arraySize = 4, randomSize = 9;
                Random newRandom = new Random();
                int[] array1 = new int[arraySize];

                for (i = 0; i < array1.length; ) {
                    int randomNumber = newRandom.nextInt(randomSize) + 1;

                    for (j = 0; j < i; j++) {
                        if (array1[j] == randomNumber) {
                            break;
                        }
                    }
                    if (j == i) {
                        array1[i] = randomNumber;
                        text_random.setText(text_random.getText().toString() + array1[i]+"");
                        i++;
                    }

                }
            }
        });
    }



}
