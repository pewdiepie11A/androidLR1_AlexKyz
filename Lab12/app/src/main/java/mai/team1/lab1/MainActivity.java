package mai.team1.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;
import android.widget.ImageButton;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Boolean del0 = true;
    EditText number2;
    EditText number1;
    EditText number3;
    EditText number4;
    TextView text_random;
    TextView text_input1;
    TextView text_input2;
    TextView text_input3;
    TextView text_input4;
    TextView text_input5;
    TextView text_input;
    TextView text_result1;
    TextView text_result2;
    TextView text_result3;
    TextView text_result4;
    TextView text_result5;
    Button btn_random;
    Button btn_input;
    ImageButton btn1;
    ImageButton btn0;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;
    ImageButton btn6;
    ImageButton btn7;
    ImageButton btn8;
    ImageButton btn9;

    int[] random = new int[4];
    int[] human = new int[4];





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


        text_random = findViewById(R.id.text_random);
        btn_random = findViewById(R.id.btn_random);

        btn_input = findViewById(R.id.btn_input);
        text_input = findViewById(R.id.text_input);
        text_result1 = findViewById(R.id.text_result1);
        text_result2 = findViewById(R.id.text_result2);
        text_result3 = findViewById(R.id.text_result3);
        text_result4 = findViewById(R.id.text_result4);
        text_result5 = findViewById(R.id.text_result5);
        text_input1 = findViewById(R.id.text_input1);
        text_input2 = findViewById(R.id.text_input2);
        text_input3 = findViewById(R.id.text_input3);
        text_input4 = findViewById(R.id.text_input4);
        text_input5 = findViewById(R.id.text_input5);


        btn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int i, j, arraySize = 4, randomSize = 9;
                Random newRandom = new Random();
                //int[] array1 = new int[arraySize];


                for (i = 0; i < random.length; ) {
                    int randomNumber = newRandom.nextInt(randomSize) + 1;

                    for (j = 0; j < i; j++) {
                        if (random[j] == randomNumber) {
                            break;
                        }
                    }
                    if (j == i) {
                        //array1[i] = randomNumber;
                        random[i] = randomNumber;
                        //  text_random.setText(text_random.getText().toString() + array1[i] + "");
                        i++;
                    }

                }
                text_random.setText(text_random.getText().toString() + random[0] + random[1] + random[2] + random[3] + "");

                view.setClickable(false);
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty()) {
                    number1.setText("1");
                } else if (number2.getText().toString().isEmpty()) {
                    number2.setText("1");
                } else if (number3.getText().toString().isEmpty()) {
                    number3.setText("1");
                } else if (number4.getText().toString().isEmpty()) {
                    number4.setText("1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty()) {
                    number1.setText("2");
                } else if (number2.getText().toString().isEmpty()) {
                    number2.setText("2");
                } else if (number3.getText().toString().isEmpty()) {
                    number3.setText("2");
                } else if (number4.getText().toString().isEmpty()) {
                    number4.setText("2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty()) {
                    number1.setText("3");
                } else if (number2.getText().toString().isEmpty()) {
                    number2.setText("3");
                } else if (number3.getText().toString().isEmpty()) {
                    number3.setText("3");
                } else if (number4.getText().toString().isEmpty()) {
                    number4.setText("3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty()) {
                    number1.setText("4");
                } else if (number2.getText().toString().isEmpty()) {
                    number2.setText("4");
                } else if (number3.getText().toString().isEmpty()) {
                    number3.setText("4");
                } else if (number4.getText().toString().isEmpty()) {
                    number4.setText("4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty()) {
                    number1.setText("5");
                } else if (number2.getText().toString().isEmpty()) {
                    number2.setText("5");
                } else if (number3.getText().toString().isEmpty()) {
                    number3.setText("5");
                } else if (number4.getText().toString().isEmpty()) {
                    number4.setText("5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty()) {
                    number1.setText("6");
                } else if (number2.getText().toString().isEmpty()) {
                    number2.setText("6");
                } else if (number3.getText().toString().isEmpty()) {
                    number3.setText("6");
                } else if (number4.getText().toString().isEmpty()) {
                    number4.setText("6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty()) {
                    number1.setText("7");
                } else if (number2.getText().toString().isEmpty()) {
                    number2.setText("7");
                } else if (number3.getText().toString().isEmpty()) {
                    number3.setText("7");
                } else if (number4.getText().toString().isEmpty()) {
                    number4.setText("7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty()) {
                    number1.setText("8");
                } else if (number2.getText().toString().isEmpty()) {
                    number2.setText("8");
                } else if (number3.getText().toString().isEmpty()) {
                    number3.setText("8");
                } else if (number4.getText().toString().isEmpty()) {
                    number4.setText("8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty()) {
                    number1.setText("9");
                } else if (number2.getText().toString().isEmpty()) {
                    number2.setText("9");
                } else if (number3.getText().toString().isEmpty()) {
                    number3.setText("9");
                } else if (number4.getText().toString().isEmpty()) {
                    number4.setText("9");
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty()) {
                    number1.setText("0");
                } else if (number2.getText().toString().isEmpty()) {
                    number2.setText("0");
                } else if (number3.getText().toString().isEmpty()) {
                    number3.setText("0");
                } else if (number4.getText().toString().isEmpty()) {
                    number4.setText("0");
                }
            }
        });

        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ArrayList<String> valuesArray = new ArrayList<>();

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

                if (text_input1.getText().toString().isEmpty()) {
                    text_input1.setText(text_input1.getText().toString() + value1 + value2 + value3+ value4);
                    text_result1.setText(text_result1.getText().toString() + "Коровы: " + arr[0] + "     " + "Быки: " + arr[1]);
                } else if (text_input2.getText().toString().isEmpty()) {
                    text_input2.setText(text_input2.getText().toString() + value1 + value2 + value3+ value4);
                    text_result2.setText(text_result2.getText().toString() + "Коровы: " + arr[0] + "     " + "Быки: " + arr[1]);
                } else if (text_input3.getText().toString().isEmpty()) {
                    text_input3.setText(text_input3.getText().toString() + value1 + value2 + value3+ value4);
                    text_result3.setText(text_result3.getText().toString() + "Коровы: " + arr[0] + "     " + "Быки: " + arr[1]);
                }else if (text_input4.getText().toString().isEmpty()) {
                    text_input4.setText(text_input4.getText().toString() + value1 + value2 + value3+ value4);
                    text_result4.setText(text_result4.getText().toString() + "Коровы: " + arr[0] + "     " + "Быки: " + arr[1]);
                }else if (text_input5.getText().toString().isEmpty()) {
                    text_input5.setText(text_input5.getText().toString() + value1 + value2 + value3+ value4);
                    text_result5.setText(text_result5.getText().toString() + "Коровы: " + arr[0] + "     " + "Быки: " + arr[1]);
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

}

