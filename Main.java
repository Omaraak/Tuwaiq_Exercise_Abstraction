public class Main {
    public static void main(String[] args) {
        //Q1
        Book book = new Book("how to be rich",10,"Omar");
        System.out.println("book before discount: "+book.getPrice());
        System.out.println("book after discount: "+book.getDiscount());
        System.out.println();

        Movie movie = new Movie("poor things",20,"Omar");
        System.out.println("movie before discount: "+movie.getPrice());
        System.out.println("movie after discount: "+movie.getDiscount());
        System.out.println();

        //Q2
        MovablePoint movablePoint =new MovablePoint(0,0,1,1);

        //move down
        System.out.println("y Before move down: "+movablePoint.getY());
        movablePoint.moveDown();
        System.out.println("y After move down: "+movablePoint.getY());

        System.out.println();

        //move up
        System.out.println("y Before move up: "+movablePoint.getY());
        movablePoint.moveUp();
        System.out.println("y After move up: "+movablePoint.getY());

        System.out.println();

        //move left
        System.out.println("x Before move left: "+movablePoint.getX());
        movablePoint.moveLeft();
        System.out.println("x After move left: "+movablePoint.getX());

        System.out.println();

        //move right
        System.out.println("x Before move right: "+movablePoint.getX());
        movablePoint.moveRight();
        System.out.println("x After move right: "+movablePoint.getX());

    }
}