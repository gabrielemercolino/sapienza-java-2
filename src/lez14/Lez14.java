import lez14.BinaryTree;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

static final String separator = "----------------------------------------";

void main() {
  supplier();
  consumer();
  consumerForEach();
  stack();
  binaryTree();

  exceptions();
  try {
    exceptionThrow();
  } catch (Exception e) {
    System.out.println(STR."\{e}");
    System.out.println(separator);
  }
  try {
    exceptionFinally();
  } catch (Exception e){
    System.out.println(STR."\{e}");
    System.out.println(separator);
  }
}

private static void supplier(){
  Supplier<String> stringSupplier = () -> "ciao";
  System.out.println(stringSupplier.get());
  Random r = new Random();
  Supplier<Integer> randomSupplier = r::nextInt;
  System.out.println(randomSupplier.get());
  System.out.println(separator);
}

private static void consumer(){
  Consumer<String> stringConsumer = System.out::println;
  stringConsumer.accept("Yo");
  System.out.println(separator);
}

private static void consumerForEach(){
  Collection<String> collection = List.of("a", "b");
  collection.forEach(System.out::println);
  System.out.println(separator);
}

private static void stack(){
  Stack<Integer> stack = new Stack<>();
  stack.add(1);
  stack.add(2);

  System.out.println(stack.pop());
  System.out.println(stack.pop());
  System.out.println(separator);
}

private static void binaryTree(){
  BinaryTree<Integer> tree = new BinaryTree<>(1);
  tree.add(2);
  tree.add(3);
  tree.add(4);
  System.out.println("Binary tree");
  System.out.println(separator);
}

private static void exceptions(){
  String s = "12a";
  try {
    @SuppressWarnings({"unused", "DataFlowIssue"})
    int i = Integer.parseInt(s);
    Thread.sleep(10);
  } catch (NumberFormatException e){
    System.out.println(STR."\{e}");
  } catch (InterruptedException e) {
    throw new RuntimeException(e);
  }
  System.out.println(separator);
}

private static void exceptionThrow() throws Exception {
  throw new Exception("Eccezione");
}

private static void exceptionFinally() throws Exception {
  try {
    throw new Exception();
  } catch (Exception e){
    throw new Exception("Kek");
  } finally {
    System.out.println("Uot");
  }
}