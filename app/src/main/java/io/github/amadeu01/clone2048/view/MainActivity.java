package io.github.amadeu01.clone2048.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import io.github.amadeu01.clone2048.R;
import io.github.amadeu01.clone2048.databinding.GameBinding;
import io.github.amadeu01.clone2048.model.Move;
import io.github.amadeu01.clone2048.viewmodel.GameViewModel;

public class MainActivity extends AppCompatActivity {

    GameViewModel viewModel = new GameViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GameBinding binding = DataBindingUtil.setContentView(this, R.layout.game);
        binding.setViewModel(viewModel);
        viewModel.onCreate();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_MENU) {
            //Do nothing
            return true;
        } else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN) {
            viewModel.onMove(Move.DOWN);
            return true;
        } else if (keyCode == KeyEvent.KEYCODE_DPAD_UP) {
            viewModel.onMove(Move.UP);
            return true;
        } else if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT) {
            viewModel.onMove(Move.LEFT);
            return true;
        } else if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT) {
            viewModel.onMove(Move.RIGHT);
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}
