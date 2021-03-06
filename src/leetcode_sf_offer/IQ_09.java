package leetcode_sf_offer;

import java.util.Stack;

/**
 * 面试题09. 用两个栈实现队列
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/18 20:27
 */
public class IQ_09 {

//    private Stack<Integer> stack_in = new Stack<>();
//    private Stack<Integer> stack_out = new Stack<>();
//    private int size=0;
//
//    public void appendTail(int value) {
//
//        stack_in.push(value);
//        size++;
//    }
//
//    public int deleteHead() {
//        if (size==0)
//            return -1;
//        if (stack_out.empty()){   //只有当out的栈为空，才往里面加入新的元素
//            while (!stack_in.empty())
//                stack_out.push(stack_in.pop());
//        }
//        size--;
//        return stack_out.pop();
//    }



    private Stack<Integer> stack_one = new Stack<>();  //入栈
    private Stack<Integer> stack_two = new Stack<>();  //出栈
    public void appendTail(int value) {
        stack_one.push(value);
    }

    public int deleteHead() {

        if (!stack_two.empty())
            return stack_two.pop();
        else {

            if (stack_one.empty())
                return -1;
            else {
                while (!stack_one.empty())
                    stack_two.push(stack_one.pop());
                return stack_two.pop();
            }
        }
    }
}
