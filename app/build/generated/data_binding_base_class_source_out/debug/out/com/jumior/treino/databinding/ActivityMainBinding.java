// Generated by view binder compiler. Do not edit!
package com.jumior.treino.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jumior.treino.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnCriar;

  @NonNull
  public final Button btnExcluir;

  @NonNull
  public final Button btnSelecionar;

  @NonNull
  public final EditText editNome;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button btnCriar,
      @NonNull Button btnExcluir, @NonNull Button btnSelecionar, @NonNull EditText editNome) {
    this.rootView = rootView;
    this.btnCriar = btnCriar;
    this.btnExcluir = btnExcluir;
    this.btnSelecionar = btnSelecionar;
    this.editNome = editNome;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCriar;
      Button btnCriar = ViewBindings.findChildViewById(rootView, id);
      if (btnCriar == null) {
        break missingId;
      }

      id = R.id.btnExcluir;
      Button btnExcluir = ViewBindings.findChildViewById(rootView, id);
      if (btnExcluir == null) {
        break missingId;
      }

      id = R.id.btnSelecionar;
      Button btnSelecionar = ViewBindings.findChildViewById(rootView, id);
      if (btnSelecionar == null) {
        break missingId;
      }

      id = R.id.editNome;
      EditText editNome = ViewBindings.findChildViewById(rootView, id);
      if (editNome == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, btnCriar, btnExcluir, btnSelecionar,
          editNome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
