import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Obstacle extends Element{

    public Obstacle(int x, int y){
        super(x,y);
    }

    public void draw(TextGraphics screen){
        screen.setForegroundColor(TextColor.Factory.fromString("#333366"));
        screen.enableModifiers(SGR.BOLD);
        screen.putString(new TerminalPosition(getPosition().getX(), getPosition().getY()), "#");
    }



}
