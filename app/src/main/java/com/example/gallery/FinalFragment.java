package com.example.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FinalFragment extends Fragment {

    private EditText editText1, editText2, editText3;
    private Button calculaButton, buttonNavigateToActivity;
    private TextView resultadoTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflar el diseño del fragmento
        View view = inflater.inflate(R.layout.fragment_final, container, false);

        // Inicializar vistas
        editText1 = view.findViewById(R.id.editText1);
        editText2 = view.findViewById(R.id.editText2);
        editText3 = view.findViewById(R.id.editText3);
        calculaButton = view.findViewById(R.id.calculaButton);
        resultadoTextView = view.findViewById(R.id.resultadoTextView);
        buttonNavigateToActivity = view.findViewById(R.id.buttonNavigateToActivity);

        // Configurar OnClickListener para el botón de cálculo
        calculaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener valores de los EditText
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double num3 = Double.parseDouble(editText3.getText().toString());

                // Calcular la multiplicación de los números
                double resultado = num1 * num2 * num3;

                // Mostrar el resultado
                resultadoTextView.setText("El resultado de la multiplicación es: " + resultado);
            }
        });

        // Configurar OnClickListener para el botón de navegación a otra actividad
        buttonNavigateToActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Agregar aquí la lógica para navegar a otra actividad
                // Por ejemplo:
                // Intent intent = new Intent(getActivity(), OtraActividad.class);
                // startActivity(intent);
            }
        });

        return view;
    }
}

