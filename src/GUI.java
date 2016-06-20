import org.lwjgl.opengl.Display;

import static org.lwjgl.opengl.GL11.*;

/**
 * Created by it-sk on 20.06.2016.
 */
public class GUI {
    // Класс Cells напишем несколько позже
    private static Cell[][] cells;

    //Рисует все клетки
    public static void draw(){
        // Очищает экран от старого изображения
        glClear(GL_COLOR_BUFFER_BIT);

        for(Cell[] line:cells){
                for (Cell cell:line){
                    drawElement(cell);
                }
        }
    }

    private static void drawElement(Cell elem){
        // Если у ячейки нет спрайта, то рисовать её не нужно
        if(elem.getSprite() == null) return;

        // Собственно рисуем. Это логика LWJGL, а не механика игры.
        elem.getSprite().getTexture().bind();

        glBegin(GL_QUADS);
        glTexCoord2f(0,0);
        glVertex2f(elem.getX(), elem.getY() + elem.getHeight());
        glTexCoord2f(1,0);
        glVertex2f(elem.getX()+elem.getWidth(), elem.getY() + elem.getHeight());
        glTexCoord2f(1,1);
        glVertex2f(elem.getX()+elem.getWidth(), elem.getY());
        glTexCoord2f(0,1);
        glVertex2f(elem.getX(), elem.getY());
        glEnd();
    }
    //Этот метод будет обновляться извне
    public static void update(boolean have_to_decrease){
        updateOpenGL();

        for(Cell[] line: cells){
            for(Cell cell:line){
                cell.update(have_to_decrease);
            }
        }
    }

    // А этот метод будет использоваться локально
    // т.к. базовым другие классы должны работать на более высоком уровне
    private static void updateOpenGL(){
        Display.update();
        Display.sync(Constants.FPS);
    }
}
