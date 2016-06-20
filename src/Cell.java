/**
 * Created by it-sk on 20.06.2016.
 */
public class Cell {
    private int x;
    private int y;
    private int state; /* 0 -> ячейка пуста
                         >0 -> в ячейке тело змеи, которое будет там еще N фреймов
                         <0 -> Что то необычное:
                            -1: Ягоды.
                            */

    // Конструктор просто выставляет начальные значения координат и состояния
    public Cell (int x, int y, int state){
        this.x = x;
        this.y = y;
        this.state = state;
    }
}
