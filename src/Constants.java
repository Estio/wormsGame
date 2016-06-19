/**
 * Created by it-sk on 19.06.2016.
 */
public class Constants {
    //размер игровой ячейки
    public static final int CELL_SIZE = 32;

    //размеры игрового поля в ячейках
    public static final int CELLS_COUNT_X = 20;
    public static final int CELLS_COUNT_Y = 20;

    //Шанс появления ягодна старте в процентах.
    //При выстановленном значении спавнятся 3-5 ягод.
    //Как минимум 1 ягода спавнится независимо от выставленного количества.
    public static final int INITIAL_SPAWN_CHANCE = 1;

    //В нашем случае змея проходит одну клетку за один фрейм
    //Значение 5 мне показалось оптимальным
    public static final int FPS = 5;

    //Константы для создания окна.
    // Названия достаточно говорящие.
    public static final int SCREEN_WIDTH = CELLS_COUNT_X * CELL_SIZE;
    public static final int SCREEN_HEIGHT = CELLS_COUNT_Y * CELL_SIZE;
    public static final String SCREEN_NAME = "T'Progers Snake";
}
