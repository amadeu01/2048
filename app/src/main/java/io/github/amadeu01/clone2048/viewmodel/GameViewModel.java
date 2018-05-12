package io.github.amadeu01.clone2048.viewmodel;

import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;

import java.util.HashMap;

import io.github.amadeu01.clone2048.model.Board;
import io.github.amadeu01.clone2048.model.Move;

/**
 * @Author Amadeu Cavalcante Filho
 * @Date 02/03/2018
 * @Email amadeu01@gmail.com
 */

public class GameViewModel implements ViewModel {
    private Board boardModel;

    public final ObservableArrayMap<String, String> tiles = new ObservableArrayMap<>();
    public final ObservableField<String> score = new ObservableField<>();
    public final ObservableField<String> winner = new ObservableField<>();

    public GameViewModel() {
        this.boardModel = new Board();
        HashMap<String, String> tileHashMap = boardModel.newGame();
        tiles.putAll(tileHashMap);
    }

    public void onMove(Move move) {

    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }
}
