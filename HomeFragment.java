package com.example.proba7.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.proba7.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private TextView tv1, tv2;
    private RadioButton a, b, c, d;
    private Button btn;
    private RadioGroup rg;
    private int qnumber, score;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        tv1 = root.findViewById(R.id.question);
        tv2 = root.findViewById(R.id.response);
        rg = root.findViewById(R.id.optionGroup);
        a = root.findViewById(R.id.option1);
        b = root.findViewById(R.id.option2);
        c = root.findViewById(R.id.option3);
        d = root.findViewById(R.id.option4);
        btn = root.findViewById(R.id.next);
        qnumber = 0;
        score = 0;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quiz();
            }
        });

        return root;
    }

    private void quiz() {
        switch (qnumber) {
            case 0: {
                tv1.setTextColor(Color.BLACK);
                tv1.setTextSize(20);
                rg.setVisibility(View.VISIBLE);
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                tv2.setText("");
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                btn.setText("Next");
                tv1.setText("1. Pakiet biblioteki Swing ?");
                a.setText("java.swing");
                b.setText("java.awt");
                c.setText("javax.swing");
                d.setText("javax.awt");
                qnumber = 1;
                break;
            }
            case 1: {
                if (c.isChecked()) {
                    score++;
                }
                tv1.setText("2. Która technologia jest związana z JavaFX ?");
                a.setText("JSP");
                b.setText("FXML");
                c.setText("JSF");
                d.setText("EJB");
                qnumber = 2;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 2: {
                if (b.isChecked()) {
                    score++;
                }
                tv1.setText("3. Który pakiet związany jest z serwletami ?");
                a.setText("javax.servlet");
                b.setText("java.servlet");
                c.setText("javaee.servlet");
                d.setText("javae.servlet");
                qnumber = 3;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 3: {
                if (a.isChecked()) {
                    score++;
                }
                tv1.setText("4. Który pakiet związany jest z platformą Android ?");
                a.setText("javax.android");
                b.setText("java.android");
                c.setText("android.java");
                d.setText("android.app");
                qnumber = 4;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 4: {
                if (d.isChecked()) {
                    score++;
                }
                tv1.setText("5. Która technologia jest bezpośrednio związana z obsługą transakcji ?");
                a.setText("JDBC");
                b.setText("EJB");
                c.setText("JTA");
                d.setText("JPA");
                qnumber = 5;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 5: {
                if (c.isChecked()) {
                    score++;
                }
                tv1.setText("6. Który interfejs służy do porównywania obiektów w Javie?");
                a.setText("Comparable");
                b.setText("Comparator");
                c.setText("Equals");
                d.setText("Sorter");
                qnumber = 6;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 6: {
                if (a.isChecked()) {
                    score++;
                }
                tv1.setText("7. Co to jest autoboxing w Javie?");
                a.setText("Proces automatycznego pakowania typów prostych w odpowiadające im typy opakowujące");
                b.setText("Proces automatycznego rozpakowywania typów opakowujących do odpowiadających im typów prostych");
                c.setText("Proces automatycznego rzutowania typów");
                d.setText("Proces automatycznego konwertowania typów");
                qnumber = 7;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 7: {
                if (a.isChecked()) {
                    score++;
                }
                tv1.setText("8. Która klasa w Javie reprezentuje datę i czas?");
                a.setText("DateTime");
                b.setText("Date");
                c.setText("Calendar");
                d.setText("Time");
                qnumber = 8;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 8: {
                if (c.isChecked()) {
                    score++;
                }
                tv1.setText("9. Która klasa w Javie umożliwia odczyt danych z pliku tekstowego?");
                a.setText("FileReader");
                b.setText("TextReader");
                c.setText("BufferedReader");
                d.setText("FileInputReader");
                qnumber = 9;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 9: {
                if (c.isChecked()) {
                    score++;
                }
                tv1.setText("10. Która metoda służy do zatrzymywania działania wątku na określony czas?");
                a.setText("sleep()");
                b.setText("pause()");
                c.setText("wait()");
                d.setText("stop()");
                qnumber = 10;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                btn.setText("Finish");
                break;
            }
            case 10: {
                if (a.isChecked()) {
                    score++;
                }
                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                rg.clearCheck();
                tv2.setText("Wynik testu: " + score + "/10");
                if (score >= 5)
                {
                    tv1.setText("ZALICZONE");
                    tv1.setTextColor(Color.GREEN);
                    tv1.setTextSize(30);
                }
                else
                {
                    tv1.setText("NIEZALICZONE");
                    tv1.setTextColor(Color.RED);
                    tv1.setTextSize(30);
                }
                btn.setText("Restart");
                qnumber = 0;
                score = 0;
                break;
            }
        }
    }
}
