package com.jumior.treino;

import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;

import com.jumior.treino.databinding.ActivityMainBinding;

import java.util.ArrayList;

import com.itsaky.androidide.logsender.LogSender;

public class MainActivity extends AppCompatActivity {

    private Button btnCriar, btnSelecionar, btnExcluir;
    private EditText editNome;
    private ArrayList<String> taskList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCriar = findViewById(R.id.btnCriar);
        btnExcluir = findViewById(R.id.btnExcluir);
        btnSelecionar = findViewById(R.id.btnSelecionar);
        editNome = findViewById(R.id.editNome);


        btnCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createTaskSwitch();
            }
        });


        taskList = new ArrayList<>();
        taskListView = findViewById(R.id.taskList);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        taskListView.setAdapter(adapter);
    }

    private void createTaskSwitch() {
        EditText
    }


}
