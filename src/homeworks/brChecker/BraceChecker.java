package homeworks.brChecker;

import homeworks.stack.Stack;

public class BraceChecker {
    private final String text;
   private final Stack stack = new Stack();


    BraceChecker(String text){
        this.text = text;
    }


    public void check(){
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }

            char check;
            switch (c){
                case ')':
                    check = (char) stack.pop();
                    if(check == '{' || check == '['){
                        System.out.print("opened " + check + "but close " + c + "in index " + i);
                    }
                    break;
                case ']':
                    check = (char) stack.pop();
                    if(check == '(' || check == '{'){
                        System.out.print("opened " + check + "but close " + c + "in index " + i);;
                    }
                    break;
                case '}':
                    check = (char) stack.pop();
                    if(check == '(' || check == '['){
                        System.out.print("opened " + check + "but close " + c + "in index " + i);
                    }
                    break;
            }
        }
        char last;
        while ((last = (char) stack.pop()) != 0) {
            System.out.println("error opened " + last + "but not closed");
        }
    }
}
