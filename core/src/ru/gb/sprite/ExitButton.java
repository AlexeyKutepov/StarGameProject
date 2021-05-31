package ru.gb.sprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.gb.base.ScaledButton;
import ru.gb.math.Rect;

public class ExitButton extends ScaledButton {

    private static final float HEIGHT = 0.2f;
    private static final float PADDING = 0.03f;

    public ExitButton(TextureAtlas atlas) {
        super(atlas.findRegion("btExit"));
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(HEIGHT);
        setBottom(worldBounds.getBottom() + PADDING);
        setRight(worldBounds.getRight() - PADDING);
    }

    @Override
    protected void action() {
        Gdx.app.exit();
    }
}
