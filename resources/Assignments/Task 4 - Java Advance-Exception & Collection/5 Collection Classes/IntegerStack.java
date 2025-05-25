/*
Q5. Use Collection Classes to store Integers Create some methods for following functionalities
a. Include functions for pushing elements onto the stack.
b. popping elements from the stack.
*/
import java.util.Stack;
import java.util.Scanner;

public class IntegerStack
{
    // Stack to hold integer elements
    private Stack<Integer> stack;

    // Constructor to init stack
    public IntegerStack()
    {
        stack = new Stack<>();
    }

    // Method to push element onto the stack
    public void pushElement(int element)
    {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    // Method to pop element from the stack
    public void popElement()
    {
        if (stack.isEmpty())
        {
            System.out.println("Stack is empty. Nothing to pop.");
        }
        else
        {
            int popped = stack.pop();
            System.out.println("Popped: " + popped);
        }
    }

    // Method to display all elements in the stack
    public void displayStack()
    {
        System.out.println("Current Stack: " + stack);
    }

    // Main method functionalities
    public static void main(String[] args)
    {
        IntegerStack myStack = new IntegerStack();
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Display Stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    myStack.pushElement(element);
                    break;

                case 2:
                    myStack.popElement();
                    break;

                case 3:
                    myStack.displayStack();
                    break;

                case 4:
                    System.out.println("Exiting.. Thank You (: ");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        while (choice != 4);

        sc.close();
    }
}
/*
|---------------------------|
|         OUTPUT            |
|___________________________|
--- Stack Menu ---
1. Push Element
2. Pop Element
3. Display Stack
4. Exit
Enter your choice: 1
Enter element to push: 10
Pushed: 10

Enter your choice: 1
Enter element to push: 20
Pushed: 20

Enter your choice: 3
Current Stack: [10, 20]

Enter your choice: 2
Popped: 20

Enter your choice: 3
Current Stack: [10]

|_____________________________|
*/