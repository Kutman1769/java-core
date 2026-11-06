public class StudentCard {
    public static void main(String[] args) {
        String name = "Кутман" ;
        int age = 26;
        double height = 178.8;
        boolean isStudent = true;

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Является студентом: " + isStudent);

        // max/min values для примитивных целочисленных

                byte minByte = Byte.MIN_VALUE;
                byte maxByte = Byte.MAX_VALUE;

                short minShort = Short.MIN_VALUE;
                short maxShort = Short.MAX_VALUE;

                int minInt = Integer.MIN_VALUE;
                int maxInt = Integer.MAX_VALUE;

                long minLong = Long.MIN_VALUE;
                long maxLong = Long.MAX_VALUE;

                System.out.println("=== byte ===");
                System.out.println("Min: " + minByte + ", Max: " + maxByte);

                System.out.println("\n=== short ===");
                System.out.println("Min: " + minShort + ", Max: " + maxShort);

                System.out.println("\n=== int ===");
                System.out.println("Min: " + minInt + ", Max: " + maxInt);

                System.out.println("\n=== long ===");
                System.out.println("Min: " + minLong + ", Max: " + maxLong);

        // Замен 2 переменных при добавлении 3 переменной

        int a = 1;
        int b = 2;
        System.out.println("a = " + a + " b = " + b);
        int temp = a;

        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);
            }
        }
