package com.example.gallery;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstFragment extends Fragment {

    private EditText editText1, editText2, editText3;
    private Button calculaButton, buttonNavigateToActivity;
    private TextView resultadoTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        // Inicializar vistas
        editText1 = view.findViewById(R.id.editText1);
        editText2 = view.findViewById(R.id.editText2);
        editText3 = view.findViewById(R.id.editText3);
        calculaButton = view.findViewById(R.id.calculaButton);
        buttonNavigateToActivity = view.findViewById(R.id.buttonNavigateToActivity);
        resultadoTextView = view.findViewById(R.id.resultadoTextView);

        // Configurar OnClickListener para el botón de cálculo
        calculaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realizar el cálculo (encontrar el número mayor) y mostrar el resultado
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double num3 = Double.parseDouble(editText3.getText().toString());

                double mayor = Math.max(Math.max(num1, num2), num3);

                resultadoTextView.setText("El número mayor es: " + mayor);
            }
        });

        // Configurar OnClickListener para el botón de navegación
        buttonNavigateToActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
                // Navegar a la otra actividad aquí
                // Por ejemplo, puedes usar un Intent para abrir otra actividad
            }
        });

        return view;
    }
}

