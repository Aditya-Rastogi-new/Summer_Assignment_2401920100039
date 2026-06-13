package OOPS_Questions_2.live;

import OOPS_Questions_2.music.Playable;
import OOPS_Questions_2.music.string.Veena;
import OOPS_Questions_2.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        //Part A.
        Veena veena = new Veena();
        veena.play();
        //Part B.
        Saxophone saxophone = new Saxophone();
        saxophone.play();
        //Part C.
        Playable p;
        p = new Veena();
        p.play();
        p = new Saxophone();
        p.play();
    }
}
