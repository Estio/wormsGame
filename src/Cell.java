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

    // === Ничем не примечательные геттеры и сеттеры

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    public int getHeight(){
        return Constants.CELL_SIZE;
    }
    public int getWidth(){
        return Constants.CELL_SIZE;
    }
    // ===

    // Метод обновления клетки. Уменьшаем время "горения", если это необходимо
    public void update(boolean have_to_decrease){
        if(have_to_decrease && this.state > 0){
            this.state--;
        }
    }

    // Ячейка "думает" как она должна выглядеть
    public Sprite getSprite(){
        if(this.state > 0){
            // Если в ней тело змеи -- как змея
            return Sprite.BODY;
        } else if (this.state == 0){
            // Если в ней ничего нет, то никак не должна выглядеть
            return null;
        } else {
            // Иначе проходимся свитчем по возможным объектам
            // Так как это демо - добавил только ягоды
            switch (this.state){
                default: return Sprite.CHERRIES;
            }
        }
    }
}
