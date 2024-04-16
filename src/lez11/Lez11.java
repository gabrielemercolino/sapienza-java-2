import java.util.List;
import java.util.function.Supplier;

void main() {
  lambdaVsAnonym();

  collections();
}

private static void collections(){
  List<Integer> l = List.of(4, 8, 15, 16, 23, 42);
  l.forEach(x -> System.out.print(STR."\{x} "));
}

private static void lambdaVsAnonym() {
  new Runnable() {
    private int k;

    @Override
    public void run() {
      Supplier<Integer> f1 = () -> this.k + 1;
      Supplier<Integer> f2 = new Supplier<>() {
        private int k = 2;

        @Override
        public Integer get() {
          return k + 1;
        }
      };

      System.out.println(STR."Nelle lambda `this` si riferisce alla classe che la contiene: \{f1.get()}");
      System.out.println(STR."Nell classi anonime invece si riferisce alla stessa:          \{f2.get()}");
    }
  }.run();

  System.out.println();
}
