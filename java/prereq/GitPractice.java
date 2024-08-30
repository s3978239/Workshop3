package prereq;

public class GitPractice {

   public static void main (String[] args) {
      System.out.println("This is a simple code example to practice Git actions");

      System.out.println("- Running the output of each group member");
      groupMember1();
      groupMember2();
      groupMember3();

      System.out.println("- Running the optional advanced test on merge conflicts");
      mergeConflictArea();

      System.out.println("Done with Git action test code");
   }

   public static void groupMember1() {
      System.out.println("This is Huy");
   }

   public static void groupMember2() {
      System.out.println("I am Danh");
   }

   public static void groupMember3() {
      System.out.println("This is Khoi");
   }

   public static void mergeConflictArea() {

      System.out.println("Kaboom! This is the merge conflict area");
   }

}