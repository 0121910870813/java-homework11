

public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle circle1;
    private Square square1;



    /**
     * Draw this picture.
     */
    public void draw()
    {


        circle1 = new Circle();        //练习1.1（创建一个圆）
        circle1.changeColor("blue");
        circle1.moveHorizontal(150);
        circle1.moveVertical(0);
        circle1.changeSize(60);
        circle1.makeVisible();
        circle1.moveDown();            //练习1.2（运行三次movedown函数）
        circle1.moveDown();
        circle1.moveDown();

        //circle1.makeInvisible();     //练习1.2（运行两次makeinvisible函数）
        //circle1.makeInvisible();

        square1=new Square();           //练习1.1（创建一个正方形）
        square1.changeColor("green");
        square1.moveHorizontal(30);
        square1.moveVertical(50);
        square1.makeVisible();

        square1.moveLeft(-70);            //练习1.3（左移70）
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
//        picture.setBlackAndWhite();
        picture.draw();;
    }

}
