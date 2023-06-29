package com.example.proba7.ui.dashboard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.proba7.R;

public class DashboardFragment extends Fragment {
    private WebView myWebView;
    private EditText urlEditText;
    private Button searchButton;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);

        myWebView = rootView.findViewById(R.id.myWebView);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

        urlEditText = rootView.findViewById(R.id.urlEditText);

        searchButton = rootView.findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = urlEditText.getText().toString();
                loadWebPage(url);
            }
        });

        return rootView;
    }

    private void loadWebPage(String url) {
            myWebView.loadUrl("https://"+url+"/");
        urlEditText.setVisibility(View.GONE);
        searchButton.setVisibility(View.GONE);
        }
    }
