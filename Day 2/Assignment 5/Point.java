import java.util.*;

class Point {
    private int x, y;
    Scanner Sc = new Scanner(System.in);

    public void accept() {
        System.out.print("Enter the X coordinate: ");
        x = Sc.nextInt();
        System.out.print("Enter the Y coordinate: ");
        y = Sc.nextInt();
    }

    public int checkqd() {
        if (x == 0 && y == 0) return 0;
        if (x > 0 && y > 0)  return 1;
        if (x < 0 && y > 0)  return 2; 
        if (x < 0 && y < 0)  return 3; 
        if (x > 0 && y < 0)  return 4; 
        
        return -1; 
    }

    public void displayres() {
        int q = checkqd();
        switch(q) {
            case 0: System.out.println("The point is at the Origin."); break;
            case 1: System.out.println("The point is in Quadrant I."); break;
            case 2: System.out.println("The point is in Quadrant II."); break;
            case 3: System.out.println("The point is in Quadrant III."); break;
            case 4: System.out.println("The point is in Quadrant IV."); break;
            default: System.out.println("The point lies on an axis."); break;
        }
    }

    public void display() {
        System.out.println("Point: [" + x + ", " + y + "]");
    }
}