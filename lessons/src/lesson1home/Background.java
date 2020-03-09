package lesson1home;

import java.awt.*;

public class Background extends Sprite {
    private  Color color;
    private float time;
    private static final float amp = 255f / 2f;

    @Override
    public void update(MainCanvas canvas, float deltaTime) {
        time += deltaTime;

        int red = Math.round(amp + amp * (float) Math.sin(time / 2f));
        int green = Math.round(amp + amp * (float) Math.sin(time / 3f));
        int blue = Math.round(amp + amp * (float) Math.sin(time));
        color = new Color(red, green, blue);
    }

    @Override
    public void render(MainCanvas canvas, Graphics g) {
        canvas.setBackground(color);
    }

}
