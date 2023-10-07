package mai.team1.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Boolean del0 = true;
    EditText number2;
    EditText number1;
    EditText number3;
    EditText number4;
    TextView text_random;
    Button btn_random;
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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
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
                        text_random.setText(text_random.getText().toString() + array1[i] + "");
                        i++;
                    }

                }
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

    }



    public void delclick(View view) {
        number1.setText("");
        number2.setText("");
        number3.setText("");
        number4.setText("");
        del0=true;

    }



}
