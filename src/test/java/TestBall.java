import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestBall {

    Ball ball;

    @Before
    public void setUp() throws Exception{
        ball = new Ball();
        ball.setPosX(1);
        ball.setPosY(2);
        ball.setVelocityX(2);
        ball.setVelocityY(2);
    }

    @Test
    public void canGetPosX(){
        assertEquals(1, ball.getPosX());
    }

    @Test
    public void canGetPosY(){
        assertEquals(2, ball.getPosY());
    }

    @Test
    public void canMove(){
        ball.move();
        assertEquals(3, ball.getPosX());
        assertEquals(4, ball.getPosY());

    }
}
