package nested_class.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    public void getResult() {
        class Division {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe() {
                return delimoe / delitel;
            }
            public int getOstatok() {
                return delimoe % delitel;
            }
        }

        Division division = new Division();
        division.setDelimoe(21);
        division.setDelitel(8);
        System.out.println(division.getDelimoe());
        System.out.println(division.getDelitel());
        System.out.println(division.getChastnoe());
        System.out.println(division.getOstatok());
    }
}
