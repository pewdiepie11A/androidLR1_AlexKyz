package mai.team1.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Boolean del0 = true;
    EditText number2;
    EditText number1;
    EditText number3;
    EditText number4;
    TextView text_random;
    TextView Attempts;
    TextView text_input1;
    TextView text_result1;
    TextView text_result6;
    Button btn_random;
    Button btn_random2;
    Button btn_input;
    Button btn1;
    Button btn0;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;


    int currentEditTextId = R.id.number_1;

    int[] random = new int[4];
    int[] human = new int[4];
    int count=0;
    int MaxAttempts = 5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        number1 = findViewById(R.id.number_1);
        number2 = findViewById(R.id.number_2);
        number3 = findViewById(R.id.number_3);
        number4 = findViewById(R.id.number_4);
        number1.setShowSoftInputOnFocus(false);
        number2.setShowSoftInputOnFocus(false);
        number3.setShowSoftInputOnFocus(false);
        number4.setShowSoftInputOnFocus(false);

        btn_random = findViewById(R.id.btn_random);
        btn_random2 = findViewById(R.id.btn_random2);
        btn_random2.setEnabled(false);
        btn_input = findViewById(R.id.btn_input);
        btn_input.setEnabled(false);

        text_random = findViewById(R.id.text_random);
        Attempts = findViewById(R.id.Attempts);
        text_result1 = findViewById(R.id.text_result1);
        text_result6 = findViewById(R.id.text_result6);
        text_input1 = findViewById(R.id.text_input1);


        btn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int i, j, randomSize = 9;
                Random newRandom = new Random();

                for (i = 0; i < random.length; ) {
                    int randomNumber = newRandom.nextInt(randomSize) + 1;

                    for (j = 0; j < i; j++) {
                        if (random[j] == randomNumber) {
                            break;
                        }
                    }
                    if (j == i) {
                        random[i] = randomNumber;
                        i++;
                    }
                }
                text_random.setText(text_random.getText().toString() + random[0] + random[1] + random[2] + random[3] + "");
                Attempts.setText("Попыток: " + MaxAttempts + "/" + MaxAttempts);
                view.setEnabled(false);
                btn_input.setEnabled(true);
                btn_random2.setEnabled(true);
            }
        });

        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ArrayList<String> valuesArray = new ArrayList<>();
                text_result6.setText("");

                if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty() || number3.getText().toString().isEmpty() || number4.getText().toString().isEmpty()) {text_result6.setText(text_result6.getText().toString() + "Введите число без пропусков.");}
                else{
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int num3 = Integer.parseInt(number3.getText().toString());
                int num4 = Integer.parseInt(number4.getText().toString());

                String value1 = number1.getText().toString();
                String value2 = number2.getText().toString();
                String value3 = number3.getText().toString();
                String value4 = number4.getText().toString();

                valuesArray.add(value1);
                valuesArray.add(value2);
                valuesArray.add(value3);
                valuesArray.add(value4);

                    human[0] = num1;
                    human[1] = num2;
                    human[2] = num3;
                    human[3] = num4;


                    int[] arr = new int[2];
                    int cow = 0;
                    int bull = 0;
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {

                            if (random[i] == human[j]) {
                                if (i == j) bull++;
                                else cow++;
                            }
                        }
                    }

                    arr[0] = cow;
                    arr[1] = bull;

                    count++;
                    Attempts.setText("Попыток: " + (MaxAttempts-count) + "/" + MaxAttempts);
                    if (num1 != num2 && num1 != num3 && num1 != num4 && num2 != num1 && num2 != num3 && num2 != num4 && num3 != num1 && num3 != num2 && num3 != num4 && num4 != num1 && num4 != num2 && num4 != num3 && num1 != 0) {
                        {
                            if (bull == 4) {
                                text_result6.setText(text_result6.getText().toString() + "Вы отгадали число");
                                btn_random.setEnabled(false);
                                btn_input.setEnabled(false);
                                Attempts.setText("");
                                text_input1.setText(text_input1.getText().toString() + value1 + value2 + value3 + value4 + "" + "\n");
                                text_result1.setText(text_result1.getText().toString() + "Коровы: " + arr[0] + "     " + "Быки: " + arr[1] + "\n" );
                            } else {
                                text_input1.setText(text_input1.getText().toString() + value1 + value2 + value3 + value4  + "" + "\n");
                                text_result1.setText(text_result1.getText().toString() + "Коровы: " + arr[0] + "     " + "Быки: " + arr[1] + "" + "\n");
                                if(count == MaxAttempts){  text_result6.setText(text_result6.getText().toString() + "Вы не отгадали число.\nНачните новую игру.");
                                    btn_input.setEnabled(false);
                                }
                            }
                        }
                    }  else {
                        text_result6.setText(text_result6.getText().toString() + "Введите число не содержащее одинаковых цифр, а также не начинающееся на 0");
                    }
            }
            }
        });

    }
    public void delclick(View view) {
        number1.setText("");
        number2.setText("");
        number3.setText("");
        number4.setText("");
        del0=true;
    }

    public void delclick2(View view) {
        number1.setText("");
        number2.setText("");
        number3.setText("");
        number4.setText("");
        Attempts.setText("");
        count = 0;
        text_input1.setText("");
        text_result1.setText("");
        text_result6.setText("");
        text_random.setText("");
        btn_random.setEnabled(true);
        btn_random2.setEnabled(false);
        btn_input.setEnabled(false);
    }

    public void vvodChisla(View view) {
        String buttonText = ((Button) view).getText().toString();
        if (number1.getText().toString().isEmpty()) {
            number1.setText(buttonText);
        } else if (number2.getText().toString().isEmpty()) {
            number2.setText(buttonText);
        } else if (number3.getText().toString().isEmpty()) {
            number3.setText(buttonText);
        } else if (number4.getText().toString().isEmpty()) {
            number4.setText(buttonText);}
    }
}

