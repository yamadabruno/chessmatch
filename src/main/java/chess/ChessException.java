package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {

    private void Super(String msg) {
    }

    public ChessException(String msg) {
        super(msg);

    }


}
