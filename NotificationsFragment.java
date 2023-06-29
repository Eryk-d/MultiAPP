package com.example.proba7.ui.notifications;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.proba7.R;

public class NotificationsFragment extends Fragment {
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_Add, btn_calc, btn_clear;
    EditText ed1;
    int Value1, Value2;
    boolean mAddition;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_notifications, container, false);
        btn_0 = rootView.findViewById(R.id.btn_0);
        btn_1 = rootView.findViewById(R.id.btn_1);
        btn_2 = rootView.findViewById(R.id.btn_2);
        btn_3 = rootView.findViewById(R.id.btn_3);
        btn_4 = rootView.findViewById(R.id.btn_4);
        btn_5 = rootView.findViewById(R.id.btn_5);
        btn_6 = rootView.findViewById(R.id.btn_6);
        btn_7 = rootView.findViewById(R.id.btn_7);
        btn_8 = rootView.findViewById(R.id.btn_8);
        btn_9 = rootView.findViewById(R.id.btn_9);
        btn_Add = rootView.findViewById(R.id.btn_Add);
        btn_calc = rootView.findViewById(R.id.btn_calc);
        btn_clear = rootView.findViewById(R.id.btn_clear);
        ed1 = rootView.findViewById(R.id.edText1);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.append("0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.append("1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.append("2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.append("3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.append("4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.append("5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.append("6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.append("7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.append("8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.append("9");
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Assert")
            @Override
            public void onClick(View v) {
                if (ed1.getText() == null) {
                    if (!false) throw new AssertionError();
                    ed1.setText("");
                } else {
                    Value1 = Integer.parseInt(ed1.getText().toString());
                    mAddition = true;
                    ed1.setText(null);
                }
            }
        });

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Value2 = Integer.parseInt(ed1.getText().toString());
                if (mAddition) {
                    ed1.setText(String.valueOf(Value1 + Value2));
                    mAddition = false;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(null);
            }
        });

        return rootView;
    }
}
