import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] linea =line.split(" ");



            String command = linea[0];
            if (line.equals("***")) {
                System.out.println();
                break;
            }


            switch (command) {
                // Stack commands
                //Push and Enque the same thing, and adding node or element to list
                case "PUSH":
                case "ENQUEUE" :
                    String newItem = linea[1];
                        stack.push(newItem);  //add push method to LinkedList
                    break;
                case "POP": //pop is removing the last item, we call the pop method from linkedlist
                      if (stack.isEmpty()) {//add isEmpty method to LinkedList
                        System.out.println("Stack is Empty");
                      }else{
                        String popItem = stack.pop();
                          System.out.println(popItem);
                      }
                      break;
                case "CLEAR": //clearing the stack
                    stack.clear();
//                    System.out.println("Stack is cleared");
                    break;
                case "PRINT": //printing all elements in stack

                    stack.printAll();
                    break;
//This is the case for deque, calling deque method from Linkedlist class
                case "DEQUEUE": //deque the first element in list
                    if (stack.isEmpty()) {
                        System.out.println("Queue is Empty");
                    } else{
                        String lastque = stack.deque();
                        System.out.println(lastque);
                    }
                    break;

            }
        }
        scanner.close();



        /**
         * LinkedList206 Stack
         *Scanner s = new Scanner(System.in)
         * while(true)
         * String cmd =s.next
         * if "***":
         * break
         * if "push" or "enque":
         *    String chezza = s.next()
         *      stack.push(chezza)  //add push method to LinkedList
         * if "pop"
         *    if stack.isEmpty() //add isEmply method to LinkedList
         *     print empty
         *     else
         *     string momo = stack.pop()
         *     print momo
         *if "clear": //add method clear to Linkedlist
         *    stack.clear()
         * if "Print"
         *     stack.printAll()
         * if "deque"
         *    if stackisEmpty
         *      print empty
         *    else
         *       String dain = stack.deque()
         *       print(dain)
         * */


    }
}
