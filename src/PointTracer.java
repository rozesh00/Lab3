// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PointTracer {
    public static void main(String[] args) {

        Display dispImage = new Display();
        dispImage.drawPointAt(200, 200);

//        for(i =0; i<1000; i+=20){
//            dispImage.drawPointAt(i, i);
//        }

        //center Point of the box,
        int width = dispImage.getWidth()/2;
        int height = dispImage.getHeight()/2;

        //By subtracting 100 from the center point (width - 100 and height - 100), we move towards the top-left
        // corner of the box. By adding 100 to the center point (width + 100 and height + 100),
        // we move towards the bottom-right corner of the box.

        System.out.println("Width is "+width);
        System.out.println("height is " +height);

        // Draw the top side of the box
        for (int i = width - 100; i <= width + 100; i += 10) {
            //from left most x coordinate ,0, to rightmost x-coordinate 200
            dispImage.drawPointAt(height - 100, i);
        }

        // Draw the right side of the box
        for (int i = height - 100; i <= height + 100; i += 10) {
            //topmost y coordinate to bottommost y coordinate
            dispImage.drawPointAt(i, width + 100); //with +100 because on the right side
        }

// Draw the bottom side of the box
        for (int i = width + 100; i >= width - 100; i -= 10) {
            //starting from rightmost bottom to leftmost bottom
            dispImage.drawPointAt(height + 100, i); //height+100 because we are at top of the box
        }

// Draw the left side of the box
        for (int i = height + 100; i >= height - 100; i -= 10) {
            //it starts at height + 100, which represents the bottommost Y-coordinate of the left side,
            // and iterates until height - 100, which represents the topmost Y-coordinate of the left side
            dispImage.drawPointAt(i, width - 100);
        }



// Draw a circle starting at the top and going clock wise
        double degAng = 150;
        double radius = 50;
        while (true) {

            double radAng = Math.toRadians(degAng);
            double x = width + radius * Math.cos(radAng); //if width =0, circle is centered at origin
            double y = height + radius * Math.sin(radAng);
            dispImage.drawPointAt((int) x, (int) y);

            degAng += 0.5;
        }





    }
}