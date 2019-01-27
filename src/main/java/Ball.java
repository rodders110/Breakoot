public class Ball {

    private int posX, posY, velocityX, velocityY;

    public Ball() {
        posX = 0;
        posY = 0;
        velocityX = 0;
        velocityY = 0;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public void move(){
        posX += velocityX;
        posY += velocityY;
    }

    public void draw(){

    }
}
