package ch12;

enum Direction1{EAST,SOUTH,WEST,NORTH}
public class EnumEx1 {
    public static void main(String[] args) {
        Direction1 d1 = Direction1.EAST;
        Direction1 d2 = Direction1.valueOf("WEST");
        Direction1 d3 = Enum.valueOf(Direction1.class, "EAST");

        System.out.println("d1=" + d1);
        System.out.println("d2=" + d2);
        System.out.println("d3=" + d3);

        System.out.println("d1==d2 ? " + (d1 == d2));
        System.out.println("d1==d3 ? " + (d1 == d3));
        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
        System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
        System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2));

        switch (d1) {
                case EAST:
                    System.out.println("The Direction1 is EAST.");
                    break;
                case SOUTH:
                    System.out.println("The Direction1 is SOUTH.");
                    break;
                case WEST:
                    System.out.println("The Direction1 is WEST.");
                    break;
                 case NORTH:
                     System.out.println("The Direction1 is NORTH.");
                     break;

            default:
                System.out.println("Invalid Direction1");
                break;
        }

        Direction1[] dArr = Direction1.values();

        for (Direction1 d : dArr) {
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
        }
    }
}
